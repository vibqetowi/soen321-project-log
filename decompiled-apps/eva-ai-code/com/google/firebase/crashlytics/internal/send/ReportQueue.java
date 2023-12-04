package com.google.firebase.crashlytics.internal.send;

import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final Transport<CrashlyticsReport> transport;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReportQueue(Transport<CrashlyticsReport> transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, transport, onDemandCounter);
    }

    ReportQueue(double d, double d2, long j, Transport<CrashlyticsReport> transport, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = transport;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
            if (z) {
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (isQueueAvailable()) {
                    Logger logger = Logger.getLogger();
                    logger.d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                    Logger logger2 = Logger.getLogger();
                    logger2.d("Queue size: " + this.queue.size());
                    this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                    Logger logger3 = Logger.getLogger();
                    logger3.d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                calcStep();
                Logger logger4 = Logger.getLogger();
                logger4.d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                this.onDemandCounter.incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.this.m6713x23ee29ee(countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$flushScheduledReportsIfAble$0$com-google-firebase-crashlytics-internal-send-ReportQueue  reason: not valid java name */
    public /* synthetic */ void m6713x23ee29ee(CountDownLatch countDownLatch) {
        try {
            ForcedSender.sendBlocking(this.transport, Priority.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger logger = Logger.getLogger();
        logger.d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z = SystemClock.elapsedRealtime() - this.startTimeMs < 2000;
        this.transport.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                ReportQueue.this.m6714xc033738(taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$sendReport$1$com-google-firebase-crashlytics-internal-send-ReportQueue  reason: not valid java name */
    public /* synthetic */ void m6714xc033738(TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, (60000.0d / this.ratePerMinute) * Math.pow(this.base, calcStep()));
    }

    private int calcStep() {
        int max;
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int now = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        if (isQueueFull()) {
            max = Math.min(100, this.step + now);
        } else {
            max = Math.max(0, this.step - now);
        }
        if (this.step != max) {
            this.step = max;
            this.lastUpdatedMs = now();
        }
        return max;
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* loaded from: classes7.dex */
    private final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double calcDelay = ReportQueue.this.calcDelay();
            Logger logger = Logger.getLogger();
            logger.d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(calcDelay / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            ReportQueue.sleep(calcDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }
}

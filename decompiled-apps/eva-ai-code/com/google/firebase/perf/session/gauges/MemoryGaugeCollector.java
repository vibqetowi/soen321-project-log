package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = -1;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime;
    }

    public void startCollecting(long j, Timer timer) {
        if (isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.memoryMetricCollectorJob != null) {
            if (this.memoryMetricCollectionRateMs != j) {
                stopCollecting();
                scheduleMemoryMetricCollectionWithRate(j, timer);
                return;
            }
            return;
        }
        scheduleMemoryMetricCollectionWithRate(j, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j, final Timer timer) {
        this.memoryMetricCollectionRateMs = j;
        try {
            this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.MemoryGaugeCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.this.m6748x5ca50e9a(timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = logger;
            androidLogger.warn("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleMemoryMetricCollectionWithRate$0$com-google-firebase-perf-session-gauges-MemoryGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m6748x5ca50e9a(Timer timer) {
        AndroidMemoryReading syncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (syncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(syncCollectMemoryMetric);
        }
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(final Timer timer) {
        try {
            this.memoryMetricCollectorExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.MemoryGaugeCollector$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.this.m6747x5390f99e(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = logger;
            androidLogger.warn("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleMemoryMetricCollectionOnce$1$com-google-firebase-perf-session-gauges-MemoryGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m6747x5390f99e(Timer timer) {
        AndroidMemoryReading syncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (syncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(syncCollectMemoryMetric);
        }
    }

    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }
}

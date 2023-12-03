package com.bugsnag.android;

import com.bugsnag.android.FileStore;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class EventStore extends FileStore {
    private static final long LAUNCH_CRASH_TIMEOUT_MS = 2000;
    private final BackgroundTaskService bgTaskSevice;
    private final CallbackState callbackState;
    private final ImmutableConfig config;
    private final FileStore.Delegate delegate;
    final Logger logger;
    private final Notifier notifier;
    static final Comparator<File> EVENT_COMPARATOR = new Comparator<File>() { // from class: com.bugsnag.android.EventStore.1
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return 1;
            }
            if (file2 == null) {
                return -1;
            }
            return file.compareTo(file2);
        }
    };
    private static long oneMegabyte = 1048576;

    /* renamed from: com.bugsnag.android.EventStore$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$bugsnag$android$DeliveryStatus;

        static {
            int[] iArr = new int[DeliveryStatus.values().length];
            $SwitchMap$com$bugsnag$android$DeliveryStatus = iArr;
            try {
                iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EventStore(ImmutableConfig immutableConfig, Logger logger, Notifier notifier, BackgroundTaskService backgroundTaskService, FileStore.Delegate delegate, CallbackState callbackState) {
        super(new File(immutableConfig.getPersistenceDirectory().getValue(), "bugsnag-errors"), immutableConfig.getMaxPersistedEvents(), EVENT_COMPARATOR, logger, delegate);
        this.config = immutableConfig;
        this.logger = logger;
        this.delegate = delegate;
        this.notifier = notifier;
        this.bgTaskSevice = backgroundTaskService;
        this.callbackState = callbackState;
    }

    private EventPayload createEventPayload(File file, String str) {
        MarshalledEventSource marshalledEventSource = new MarshalledEventSource(file, str, this.logger);
        try {
            if (!this.callbackState.runOnSendTasks(marshalledEventSource, this.logger)) {
                return null;
            }
        } catch (Exception unused) {
            marshalledEventSource.clear();
        }
        Event event = marshalledEventSource.getEvent();
        if (event != null) {
            return new EventPayload(event.getApiKey(), event, null, this.notifier, this.config);
        }
        return new EventPayload(str, null, file, this.notifier, this.config);
    }

    private void deliverEventPayload(File file, EventPayload eventPayload) {
        int i6 = AnonymousClass5.$SwitchMap$com$bugsnag$android$DeliveryStatus[this.config.getDelivery().deliver(eventPayload, this.config.getErrorApiDeliveryParams(eventPayload)).ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    handleEventFlushFailure(new RuntimeException("Failed to deliver event payload"), file);
                    return;
                }
                return;
            } else if (isTooBig(file)) {
                Logger logger = this.logger;
                logger.w("Discarding over-sized event (" + file.length() + ") after failed delivery");
                deleteStoredFiles(Collections.singleton(file));
                return;
            } else if (isTooOld(file)) {
                Logger logger2 = this.logger;
                logger2.w("Discarding historical event (from " + getCreationDate(file) + ") after failed delivery");
                deleteStoredFiles(Collections.singleton(file));
                return;
            } else {
                cancelQueuedFiles(Collections.singleton(file));
                this.logger.w("Could not send previously saved error(s) to Bugsnag, will try again later");
                return;
            }
        }
        deleteStoredFiles(Collections.singleton(file));
        Logger logger3 = this.logger;
        logger3.i("Deleting sent error file " + file.getName());
    }

    private void handleEventFlushFailure(Exception exc, File file) {
        FileStore.Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onErrorIOFailure(exc, file, "Crash Report Deserialization");
        }
        deleteStoredFiles(Collections.singleton(file));
    }

    public File findLaunchCrashReport(Collection<File> collection) {
        ArrayList arrayList = new ArrayList();
        for (File file : collection) {
            if (EventFilenameInfo.fromFile(file, this.config).isLaunchCrashReport()) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList, EVENT_COMPARATOR);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (File) arrayList.get(arrayList.size() - 1);
    }

    public void flushAsync() {
        try {
            this.bgTaskSevice.submitTask(TaskType.ERROR_REQUEST, new Runnable() { // from class: com.bugsnag.android.EventStore.4
                @Override // java.lang.Runnable
                public void run() {
                    List<File> findStoredFiles = EventStore.this.findStoredFiles();
                    if (findStoredFiles.isEmpty()) {
                        EventStore.this.logger.d("No regular events to flush to Bugsnag.");
                    }
                    EventStore.this.flushReports(findStoredFiles);
                }
            });
        } catch (RejectedExecutionException unused) {
            this.logger.w("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    public void flushEventFile(File file) {
        try {
            EventPayload createEventPayload = createEventPayload(file, EventFilenameInfo.fromFile(file, this.config).getApiKey());
            if (createEventPayload == null) {
                deleteStoredFiles(Collections.singleton(file));
            } else {
                deliverEventPayload(file, createEventPayload);
            }
        } catch (Exception e10) {
            handleEventFlushFailure(e10, file);
        }
    }

    public void flushLaunchCrashReport() {
        List<File> findStoredFiles = findStoredFiles();
        File findLaunchCrashReport = findLaunchCrashReport(findStoredFiles);
        if (findLaunchCrashReport != null) {
            findStoredFiles.remove(findLaunchCrashReport);
        }
        cancelQueuedFiles(findStoredFiles);
        if (findLaunchCrashReport != null) {
            this.logger.i("Attempting to send the most recent launch crash report");
            flushReports(Collections.singletonList(findLaunchCrashReport));
            this.logger.i("Continuing with Bugsnag initialisation");
            return;
        }
        this.logger.d("No startupcrash events to flush to Bugsnag.");
    }

    public void flushOnLaunch() {
        Future<?> future;
        if (!this.config.getSendLaunchCrashesSynchronously()) {
            return;
        }
        try {
            future = this.bgTaskSevice.submitTask(TaskType.ERROR_REQUEST, new Runnable() { // from class: com.bugsnag.android.EventStore.2
                @Override // java.lang.Runnable
                public void run() {
                    EventStore.this.flushLaunchCrashReport();
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.d("Failed to flush launch crash reports, continuing.", e10);
            future = null;
        }
        if (future != null) {
            try {
                future.get(LAUNCH_CRASH_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                this.logger.d("Failed to send launch crash reports within 2s timeout, continuing.", e11);
            }
        }
    }

    public void flushReports(Collection<File> collection) {
        if (!collection.isEmpty()) {
            int size = collection.size();
            Logger logger = this.logger;
            logger.i("Sending " + size + " saved error(s) to Bugsnag");
            for (File file : collection) {
                flushEventFile(file);
            }
        }
    }

    public Date getCreationDate(File file) {
        return new Date(EventFilenameInfo.findTimestampInFilename(file));
    }

    @Override // com.bugsnag.android.FileStore
    public String getFilename(Object obj) {
        return EventFilenameInfo.fromEvent(obj, null, this.config).encode();
    }

    public String getNdkFilename(Object obj, String str) {
        return EventFilenameInfo.fromEvent(obj, str, this.config).encode();
    }

    public boolean isTooBig(File file) {
        if (file.length() > oneMegabyte) {
            return true;
        }
        return false;
    }

    public boolean isTooOld(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (EventFilenameInfo.findTimestampInFilename(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }

    public Future<String> writeAndDeliver(JsonStream.Streamable streamable) {
        final String write = write(streamable);
        if (write != null) {
            try {
                return this.bgTaskSevice.submitTask(TaskType.ERROR_REQUEST, new Callable<String>() { // from class: com.bugsnag.android.EventStore.3
                    @Override // java.util.concurrent.Callable
                    public String call() {
                        EventStore.this.flushEventFile(new File(write));
                        return write;
                    }
                });
            } catch (RejectedExecutionException unused) {
                this.logger.w("Failed to flush all on-disk errors, retaining unsent errors for later.");
                return null;
            }
        }
        return null;
    }
}

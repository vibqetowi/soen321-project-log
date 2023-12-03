package com.bugsnag.android;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bugsnag.android.FileStore;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.JsonHelper;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class InternalReportDelegate implements FileStore.Delegate {
    static final String INTERNAL_DIAGNOSTICS_TAB = "BugsnagDiagnostics";
    final Context appContext;
    final AppDataCollector appDataCollector;
    final BackgroundTaskService backgroundTaskService;
    final ImmutableConfig config;
    final DeviceDataCollector deviceDataCollector;
    final Logger logger;
    final Notifier notifier;
    final SessionTracker sessionTracker;
    final StorageManager storageManager;

    public InternalReportDelegate(Context context, Logger logger, ImmutableConfig immutableConfig, StorageManager storageManager, AppDataCollector appDataCollector, DeviceDataCollector deviceDataCollector, SessionTracker sessionTracker, Notifier notifier, BackgroundTaskService backgroundTaskService) {
        this.logger = logger;
        this.config = immutableConfig;
        this.storageManager = storageManager;
        this.appDataCollector = appDataCollector;
        this.deviceDataCollector = deviceDataCollector;
        this.appContext = context;
        this.sessionTracker = sessionTracker;
        this.notifier = notifier;
        this.backgroundTaskService = backgroundTaskService;
    }

    @Override // com.bugsnag.android.FileStore.Delegate
    public void onErrorIOFailure(Exception exc, File file, String str) {
        Event event = new Event(exc, this.config, SeverityReason.newInstance("unhandledException"), this.logger);
        event.setContext(str);
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "canRead", Boolean.valueOf(file.canRead()));
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "canWrite", Boolean.valueOf(file.canWrite()));
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "exists", Boolean.valueOf(file.exists()));
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "usableSpace", Long.valueOf(this.appContext.getCacheDir().getUsableSpace()));
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "filename", file.getName());
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "fileLength", Long.valueOf(file.length()));
        recordStorageCacheBehavior(event);
        reportInternalBugsnagError(event);
    }

    public void recordStorageCacheBehavior(Event event) {
        boolean isCacheBehaviorTombstone;
        boolean isCacheBehaviorGroup;
        if (this.storageManager != null && Build.VERSION.SDK_INT >= 26) {
            File file = new File(this.appContext.getCacheDir(), "bugsnag-errors");
            try {
                isCacheBehaviorTombstone = this.storageManager.isCacheBehaviorTombstone(file);
                isCacheBehaviorGroup = this.storageManager.isCacheBehaviorGroup(file);
                event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "cacheTombstone", Boolean.valueOf(isCacheBehaviorTombstone));
                event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "cacheGroup", Boolean.valueOf(isCacheBehaviorGroup));
            } catch (IOException e10) {
                this.logger.w("Failed to record cache behaviour, skipping diagnostics", e10);
            }
        }
    }

    public void reportInternalBugsnagError(Event event) {
        event.setApp(this.appDataCollector.generateAppWithState());
        event.setDevice(this.deviceDataCollector.generateDeviceWithState(new Date().getTime()));
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "notifierName", this.notifier.getName());
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "notifierVersion", this.notifier.getVersion());
        event.addMetadata(INTERNAL_DIAGNOSTICS_TAB, "apiKey", this.config.getApiKey());
        final EventPayload eventPayload = new EventPayload(null, event, this.notifier, this.config);
        try {
            this.backgroundTaskService.submitTask(TaskType.INTERNAL_REPORT, new Runnable() { // from class: com.bugsnag.android.InternalReportDelegate.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        InternalReportDelegate.this.logger.d("InternalReportDelegate - sending internal event");
                        Delivery delivery = InternalReportDelegate.this.config.getDelivery();
                        DeliveryParams errorApiDeliveryParams = InternalReportDelegate.this.config.getErrorApiDeliveryParams(eventPayload);
                        if (delivery instanceof DefaultDelivery) {
                            Map<String, String> headers = errorApiDeliveryParams.getHeaders();
                            headers.put(DeliveryHeadersKt.HEADER_INTERNAL_ERROR, "bugsnag-android");
                            headers.remove(DeliveryHeadersKt.HEADER_API_KEY);
                            ((DefaultDelivery) delivery).deliver(errorApiDeliveryParams.getEndpoint(), JsonHelper.INSTANCE.serialize((JsonStream.Streamable) eventPayload), headers);
                        }
                    } catch (Exception e10) {
                        InternalReportDelegate.this.logger.w("Failed to report internal event to Bugsnag", e10);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }
}

package com.bugsnag.android;

import android.content.Context;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.SystemServiceModule;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: EventStorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/InternalReportDelegate;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventStorageModule$delegate$2 extends k implements a<InternalReportDelegate> {
    final /* synthetic */ BackgroundTaskService $bgTaskService;
    final /* synthetic */ ContextModule $contextModule;
    final /* synthetic */ DataCollectionModule $dataCollectionModule;
    final /* synthetic */ Notifier $notifier;
    final /* synthetic */ SystemServiceModule $systemServiceModule;
    final /* synthetic */ TrackerModule $trackerModule;
    final /* synthetic */ EventStorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventStorageModule$delegate$2(EventStorageModule eventStorageModule, ContextModule contextModule, SystemServiceModule systemServiceModule, DataCollectionModule dataCollectionModule, TrackerModule trackerModule, Notifier notifier, BackgroundTaskService backgroundTaskService) {
        super(0);
        this.this$0 = eventStorageModule;
        this.$contextModule = contextModule;
        this.$systemServiceModule = systemServiceModule;
        this.$dataCollectionModule = dataCollectionModule;
        this.$trackerModule = trackerModule;
        this.$notifier = notifier;
        this.$bgTaskService = backgroundTaskService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final InternalReportDelegate invoke() {
        ImmutableConfig immutableConfig;
        ImmutableConfig immutableConfig2;
        ImmutableConfig immutableConfig3;
        immutableConfig = this.this$0.cfg;
        if (immutableConfig.getTelemetry().contains(Telemetry.INTERNAL_ERRORS)) {
            Context ctx = this.$contextModule.getCtx();
            immutableConfig2 = this.this$0.cfg;
            Logger logger = immutableConfig2.getLogger();
            immutableConfig3 = this.this$0.cfg;
            return new InternalReportDelegate(ctx, logger, immutableConfig3, this.$systemServiceModule.getStorageManager(), this.$dataCollectionModule.getAppDataCollector(), this.$dataCollectionModule.getDeviceDataCollector(), this.$trackerModule.getSessionTracker(), this.$notifier, this.$bgTaskService);
        }
        return null;
    }
}

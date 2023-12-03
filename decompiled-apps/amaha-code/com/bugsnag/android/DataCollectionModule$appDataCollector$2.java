package com.bugsnag.android;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.SystemServiceModule;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: DataCollectionModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/AppDataCollector;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DataCollectionModule$appDataCollector$2 extends k implements a<AppDataCollector> {
    final /* synthetic */ MemoryTrimState $memoryTrimState;
    final /* synthetic */ SystemServiceModule $systemServiceModule;
    final /* synthetic */ TrackerModule $trackerModule;
    final /* synthetic */ DataCollectionModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCollectionModule$appDataCollector$2(DataCollectionModule dataCollectionModule, TrackerModule trackerModule, SystemServiceModule systemServiceModule, MemoryTrimState memoryTrimState) {
        super(0);
        this.this$0 = dataCollectionModule;
        this.$trackerModule = trackerModule;
        this.$systemServiceModule = systemServiceModule;
        this.$memoryTrimState = memoryTrimState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final AppDataCollector invoke() {
        Context context;
        Context context2;
        ImmutableConfig immutableConfig;
        context = this.this$0.ctx;
        context2 = this.this$0.ctx;
        PackageManager packageManager = context2.getPackageManager();
        immutableConfig = this.this$0.cfg;
        return new AppDataCollector(context, packageManager, immutableConfig, this.$trackerModule.getSessionTracker(), this.$systemServiceModule.getActivityManager(), this.$trackerModule.getLaunchCrashTracker(), this.$memoryTrimState);
    }
}

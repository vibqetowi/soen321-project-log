package com.bugsnag.android;

import android.content.Context;
import android.content.res.Resources;
import com.bugsnag.android.internal.BackgroundTaskService;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: DataCollectionModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/DeviceDataCollector;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DataCollectionModule$deviceDataCollector$2 extends k implements a<DeviceDataCollector> {
    final /* synthetic */ BackgroundTaskService $bgTaskService;
    final /* synthetic */ Connectivity $connectivity;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $internalDeviceId;
    final /* synthetic */ DataCollectionModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCollectionModule$deviceDataCollector$2(DataCollectionModule dataCollectionModule, Connectivity connectivity, String str, String str2, BackgroundTaskService backgroundTaskService) {
        super(0);
        this.this$0 = dataCollectionModule;
        this.$connectivity = connectivity;
        this.$deviceId = str;
        this.$internalDeviceId = str2;
        this.$bgTaskService = backgroundTaskService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final DeviceDataCollector invoke() {
        Context context;
        Context context2;
        DeviceBuildInfo deviceBuildInfo;
        File dataDir;
        RootDetector rootDetector;
        Logger logger;
        Connectivity connectivity = this.$connectivity;
        context = this.this$0.ctx;
        context2 = this.this$0.ctx;
        Resources resources = context2.getResources();
        i.c(resources, "ctx.resources");
        String str = this.$deviceId;
        String str2 = this.$internalDeviceId;
        deviceBuildInfo = this.this$0.deviceBuildInfo;
        dataDir = this.this$0.dataDir;
        i.c(dataDir, "dataDir");
        rootDetector = this.this$0.getRootDetector();
        BackgroundTaskService backgroundTaskService = this.$bgTaskService;
        logger = this.this$0.logger;
        return new DeviceDataCollector(connectivity, context, resources, str, str2, deviceBuildInfo, dataDir, rootDetector, backgroundTaskService, logger);
    }
}

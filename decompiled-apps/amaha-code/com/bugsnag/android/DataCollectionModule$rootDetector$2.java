package com.bugsnag.android;

import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: DataCollectionModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/RootDetector;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DataCollectionModule$rootDetector$2 extends k implements a<RootDetector> {
    final /* synthetic */ DataCollectionModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCollectionModule$rootDetector$2(DataCollectionModule dataCollectionModule) {
        super(0);
        this.this$0 = dataCollectionModule;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final RootDetector invoke() {
        Logger logger;
        DeviceBuildInfo deviceBuildInfo;
        logger = this.this$0.logger;
        deviceBuildInfo = this.this$0.deviceBuildInfo;
        return new RootDetector(deviceBuildInfo, null, null, logger, 6, null);
    }
}

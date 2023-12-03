package com.bugsnag.android;

import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: StorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/LastRunInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StorageModule$lastRunInfo$2 extends k implements a<LastRunInfo> {
    final /* synthetic */ StorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$lastRunInfo$2(StorageModule storageModule) {
        super(0);
        this.this$0 = storageModule;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final LastRunInfo invoke() {
        LastRunInfo load = this.this$0.getLastRunInfoStore().load();
        this.this$0.getLastRunInfoStore().persist(new LastRunInfo(0, false, false));
        return load;
    }
}

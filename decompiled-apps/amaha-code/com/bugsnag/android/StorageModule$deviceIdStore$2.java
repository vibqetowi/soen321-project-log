package com.bugsnag.android;

import android.content.Context;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: StorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/DeviceIdStore;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StorageModule$deviceIdStore$2 extends k implements a<DeviceIdStore> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Logger $logger;
    final /* synthetic */ StorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$deviceIdStore$2(StorageModule storageModule, Context context, Logger logger) {
        super(0);
        this.this$0 = storageModule;
        this.$appContext = context;
        this.$logger = logger;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final DeviceIdStore invoke() {
        return new DeviceIdStore(this.$appContext, null, null, null, null, this.this$0.getSharedPrefMigrator(), this.$logger, 30, null);
    }
}

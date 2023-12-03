package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: StorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/UserStore;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StorageModule$userStore$2 extends k implements a<UserStore> {
    final /* synthetic */ ImmutableConfig $immutableConfig;
    final /* synthetic */ Logger $logger;
    final /* synthetic */ StorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$userStore$2(StorageModule storageModule, ImmutableConfig immutableConfig, Logger logger) {
        super(0);
        this.this$0 = storageModule;
        this.$immutableConfig = immutableConfig;
        this.$logger = logger;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final UserStore invoke() {
        return new UserStore(this.$immutableConfig, this.this$0.getDeviceId(), null, this.this$0.getSharedPrefMigrator(), this.$logger, 4, null);
    }
}

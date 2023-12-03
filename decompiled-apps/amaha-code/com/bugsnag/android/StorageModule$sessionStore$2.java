package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: StorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/SessionStore;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StorageModule$sessionStore$2 extends k implements a<SessionStore> {
    final /* synthetic */ ImmutableConfig $immutableConfig;
    final /* synthetic */ Logger $logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$sessionStore$2(ImmutableConfig immutableConfig, Logger logger) {
        super(0);
        this.$immutableConfig = immutableConfig;
        this.$logger = logger;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final SessionStore invoke() {
        return new SessionStore(this.$immutableConfig, this.$logger, null);
    }
}

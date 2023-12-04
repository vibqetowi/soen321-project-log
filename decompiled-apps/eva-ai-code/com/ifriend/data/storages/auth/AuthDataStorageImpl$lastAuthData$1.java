package com.ifriend.data.storages.auth;

import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthDataStorageImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.auth.AuthDataStorageImpl", f = "AuthDataStorageImpl.kt", i = {0, 0, 0, 0}, l = {39}, m = "lastAuthData", n = {"userId", ConfigKeys.CLIENT_ID, "dbId", "email"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class AuthDataStorageImpl$lastAuthData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthDataStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthDataStorageImpl$lastAuthData$1(AuthDataStorageImpl authDataStorageImpl, Continuation<? super AuthDataStorageImpl$lastAuthData$1> continuation) {
        super(continuation);
        this.this$0 = authDataStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.lastAuthData(this);
    }
}

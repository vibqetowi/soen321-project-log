package com.ifriend.data.storages.auth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthDataStorageImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.auth.AuthDataStorageImpl", f = "AuthDataStorageImpl.kt", i = {0, 0}, l = {56}, m = "save", n = {"this", "authData"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class AuthDataStorageImpl$save$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthDataStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthDataStorageImpl$save$1(AuthDataStorageImpl authDataStorageImpl, Continuation<? super AuthDataStorageImpl$save$1> continuation) {
        super(continuation);
        this.this$0 = authDataStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object save;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        save = this.this$0.save(null, this);
        return save;
    }
}

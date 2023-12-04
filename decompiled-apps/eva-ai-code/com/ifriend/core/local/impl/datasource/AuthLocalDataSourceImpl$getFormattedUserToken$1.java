package com.ifriend.core.local.impl.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthLocalDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.core.local.impl.datasource.AuthLocalDataSourceImpl", f = "AuthLocalDataSourceImpl.kt", i = {}, l = {21}, m = "getFormattedUserToken", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AuthLocalDataSourceImpl$getFormattedUserToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthLocalDataSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthLocalDataSourceImpl$getFormattedUserToken$1(AuthLocalDataSourceImpl authLocalDataSourceImpl, Continuation<? super AuthLocalDataSourceImpl$getFormattedUserToken$1> continuation) {
        super(continuation);
        this.this$0 = authLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFormattedUserToken(this);
    }
}

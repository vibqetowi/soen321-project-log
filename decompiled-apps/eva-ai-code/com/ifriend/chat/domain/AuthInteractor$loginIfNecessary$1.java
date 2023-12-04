package com.ifriend.chat.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.domain.AuthInteractor", f = "AuthInteractor.kt", i = {}, l = {13}, m = "loginIfNecessary", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AuthInteractor$loginIfNecessary$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthInteractor$loginIfNecessary$1(AuthInteractor authInteractor, Continuation<? super AuthInteractor$loginIfNecessary$1> continuation) {
        super(continuation);
        this.this$0 = authInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginIfNecessary(this);
    }
}

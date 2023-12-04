package com.ifriend.data.authorization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthorizerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.AuthorizerImpl", f = "AuthorizerImpl.kt", i = {0, 0}, l = {56, 63}, m = "signUp", n = {"this", "email"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class AuthorizerImpl$signUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthorizerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizerImpl$signUp$1(AuthorizerImpl authorizerImpl, Continuation<? super AuthorizerImpl$signUp$1> continuation) {
        super(continuation);
        this.this$0 = authorizerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object signUp;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        signUp = this.this$0.signUp(null, null, this);
        return signUp;
    }
}

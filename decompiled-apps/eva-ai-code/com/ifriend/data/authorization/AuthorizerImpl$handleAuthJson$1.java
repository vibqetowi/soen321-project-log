package com.ifriend.data.authorization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthorizerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.AuthorizerImpl", f = "AuthorizerImpl.kt", i = {0}, l = {85}, m = "handleAuthJson", n = {"response"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class AuthorizerImpl$handleAuthJson$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthorizerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizerImpl$handleAuthJson$1(AuthorizerImpl authorizerImpl, Continuation<? super AuthorizerImpl$handleAuthJson$1> continuation) {
        super(continuation);
        this.this$0 = authorizerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleAuthJson;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleAuthJson = this.this$0.handleAuthJson(null, null, false, this);
        return handleAuthJson;
    }
}

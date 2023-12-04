package com.ifriend.registration.domain.useCase.facebook;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthWithFacebookUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase", f = "AuthWithFacebookUseCase.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5}, l = {22, 28, 29, 30, 31, 33}, m = "auth", n = {"this", "userInfo", "this", "userInfo", "response", "this", "userInfo", "response", "this", "userInfo", "response", "this", "response", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class AuthWithFacebookUseCase$auth$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthWithFacebookUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthWithFacebookUseCase$auth$1(AuthWithFacebookUseCase authWithFacebookUseCase, Continuation<? super AuthWithFacebookUseCase$auth$1> continuation) {
        super(continuation);
        this.this$0 = authWithFacebookUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.auth(null, null, this);
    }
}

package com.ifriend.registration.domain.useCase.google;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthWithGoogleUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase", f = "AuthWithGoogleUseCase.kt", i = {0, 0, 1, 1, 2, 2, 3}, l = {23, 29, 30, 34}, m = "auth", n = {"this", "accountData", "this", "response", "this", "response", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class AuthWithGoogleUseCase$auth$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthWithGoogleUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthWithGoogleUseCase$auth$1(AuthWithGoogleUseCase authWithGoogleUseCase, Continuation<? super AuthWithGoogleUseCase$auth$1> continuation) {
        super(continuation);
        this.this$0 = authWithGoogleUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.auth(null, this);
    }
}

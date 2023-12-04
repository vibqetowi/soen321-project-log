package com.ifriend.domain.authorization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignInWithTokenUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.authorization.SignInWithTokenUseCase", f = "SignInWithTokenUseCase.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4}, l = {23, 25, 28, 35, 36, 46}, m = "signIn", n = {"this", "isUpdateOnboarding", "this", "isUpdateOnboarding", "this", "isUpdateOnboarding", "this", "response", "isUpdateOnboarding", "response"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0"})
/* loaded from: classes6.dex */
public final class SignInWithTokenUseCase$signIn$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SignInWithTokenUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInWithTokenUseCase$signIn$1(SignInWithTokenUseCase signInWithTokenUseCase, Continuation<? super SignInWithTokenUseCase$signIn$1> continuation) {
        super(continuation);
        this.this$0 = signInWithTokenUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.signIn(null, false, this);
    }
}

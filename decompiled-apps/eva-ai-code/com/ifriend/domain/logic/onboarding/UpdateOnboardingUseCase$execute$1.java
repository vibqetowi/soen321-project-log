package com.ifriend.domain.logic.onboarding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateOnboardingUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase", f = "UpdateOnboardingUseCase.kt", i = {0}, l = {14, 16}, m = "execute", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class UpdateOnboardingUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateOnboardingUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateOnboardingUseCase$execute$1(UpdateOnboardingUseCase updateOnboardingUseCase, Continuation<? super UpdateOnboardingUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = updateOnboardingUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute((Unit) null, (Continuation<? super Unit>) this);
    }
}

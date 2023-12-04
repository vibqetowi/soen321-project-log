package com.ifriend.domain.onboarding.interactor;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.onboarding.interactor.OnboardingInteractor", f = "OnboardingInteractor.kt", i = {}, l = {34}, m = "areAllOnboardingStepsPassed", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingInteractor$areAllOnboardingStepsPassed$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInteractor$areAllOnboardingStepsPassed$1(OnboardingInteractor onboardingInteractor, Continuation<? super OnboardingInteractor$areAllOnboardingStepsPassed$1> continuation) {
        super(continuation);
        this.this$0 = onboardingInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.areAllOnboardingStepsPassed(this);
    }
}

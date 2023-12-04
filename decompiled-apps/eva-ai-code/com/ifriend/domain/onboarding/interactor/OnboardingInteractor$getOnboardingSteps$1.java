package com.ifriend.domain.onboarding.interactor;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.onboarding.interactor.OnboardingInteractor", f = "OnboardingInteractor.kt", i = {0, 0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "getOnboardingSteps", n = {"this", "user", "$this$getOnboardingSteps_u24lambda_u240"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
public final class OnboardingInteractor$getOnboardingSteps$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInteractor$getOnboardingSteps$1(OnboardingInteractor onboardingInteractor, Continuation<? super OnboardingInteractor$getOnboardingSteps$1> continuation) {
        super(continuation);
        this.this$0 = onboardingInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getOnboardingSteps(this);
    }
}

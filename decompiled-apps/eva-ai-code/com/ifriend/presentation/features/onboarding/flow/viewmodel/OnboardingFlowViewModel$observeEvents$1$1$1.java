package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingFlowViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class OnboardingFlowViewModel$observeEvents$1$1$1 extends FunctionReferenceImpl implements Function1<OnboardingFlowViewModel.InternalState, OnboardingFlowViewModel.InternalState> {
    public static final OnboardingFlowViewModel$observeEvents$1$1$1 INSTANCE = new OnboardingFlowViewModel$observeEvents$1$1$1();

    OnboardingFlowViewModel$observeEvents$1$1$1() {
        super(1, OnboardingFlowViewModel.InternalState.class, "moveToNextStep", "moveToNextStep()Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingFlowViewModel.InternalState invoke(OnboardingFlowViewModel.InternalState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.moveToNextStep();
    }
}

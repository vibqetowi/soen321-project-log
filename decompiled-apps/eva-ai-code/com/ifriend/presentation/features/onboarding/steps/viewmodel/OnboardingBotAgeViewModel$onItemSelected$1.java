package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.presentation.features.onboarding.steps.view.wheel.OnboardingWheelState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingBotAgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingBotAgeViewModel$onItemSelected$1 extends Lambda implements Function1<OnboardingWheelState, OnboardingWheelState> {
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotAgeViewModel$onItemSelected$1(int i) {
        super(1);
        this.$index = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingWheelState invoke(OnboardingWheelState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return OnboardingWheelState.copy$default(state, null, null, null, this.$index, null, null, 55, null);
    }
}

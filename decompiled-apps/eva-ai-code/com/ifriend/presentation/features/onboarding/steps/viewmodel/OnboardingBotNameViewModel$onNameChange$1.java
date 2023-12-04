package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.presentation.features.onboarding.steps.view.textfield.OnboardingTextFieldState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
/* compiled from: OnboardingBotNameViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingBotNameViewModel$onNameChange$1 extends Lambda implements Function1<OnboardingTextFieldState, OnboardingTextFieldState> {
    final /* synthetic */ String $name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotNameViewModel$onNameChange$1(String str) {
        super(1);
        this.$name = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingTextFieldState invoke(OnboardingTextFieldState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return OnboardingTextFieldState.copy$default(state, null, null, StringsKt.take(this.$name, 15), null, null, !StringsKt.isBlank(this.$name), false, 91, null);
    }
}

package com.ifriend.presentation.features.onboarding.steps.view.wheel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelScreenKt$OnboardingWheelScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ Function1<Integer, Unit> $onWheelItemSelected;
    final /* synthetic */ OnboardingWheelState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelScreenKt$OnboardingWheelScreen$2(OnboardingWheelState onboardingWheelState, Function1<? super Integer, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$state = onboardingWheelState;
        this.$onWheelItemSelected = function1;
        this.$onButtonClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingWheelScreenKt.OnboardingWheelScreen(this.$state, this.$onWheelItemSelected, this.$onButtonClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}

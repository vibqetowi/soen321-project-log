package com.ifriend.presentation.features.onboarding.steps.view.chip;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingChipScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChipScreenKt$OnboardingChipScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ Function1<ChipSelectButtonUiParams, Unit> $onChipClick;
    final /* synthetic */ OnboardingChipState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingChipScreenKt$OnboardingChipScreen$2(OnboardingChipState onboardingChipState, Function1<? super ChipSelectButtonUiParams, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$state = onboardingChipState;
        this.$onChipClick = function1;
        this.$onButtonClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingChipScreenKt.OnboardingChipScreen(this.$state, this.$onChipClick, this.$onButtonClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}

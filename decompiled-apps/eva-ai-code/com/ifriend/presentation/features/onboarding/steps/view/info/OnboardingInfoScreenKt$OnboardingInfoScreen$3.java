package com.ifriend.presentation.features.onboarding.steps.view.info;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingInfoScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingInfoScreenKt$OnboardingInfoScreen$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ Function0<Unit> $onResume;
    final /* synthetic */ OnboardingInfoState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInfoScreenKt$OnboardingInfoScreen$3(OnboardingInfoState onboardingInfoState, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$state = onboardingInfoState;
        this.$onResume = function0;
        this.$onButtonClick = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingInfoScreenKt.OnboardingInfoScreen(this.$state, this.$onResume, this.$onButtonClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

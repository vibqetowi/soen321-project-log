package com.ifriend.presentation.features.onboarding.steps.view.selectbot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotPagerScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotPagerScreenKt$OnboardingBotPagerScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Float, Unit> $onOffsetChanged;
    final /* synthetic */ Function1<Integer, Unit> $onPageChanged;
    final /* synthetic */ Function0<Unit> $onPickClick;
    final /* synthetic */ OnboardingBotPagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingBotPagerScreenKt$OnboardingBotPagerScreen$2(OnboardingBotPagerState onboardingBotPagerState, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function1<? super Float, Unit> function12, int i) {
        super(2);
        this.$state = onboardingBotPagerState;
        this.$onPickClick = function0;
        this.$onPageChanged = function1;
        this.$onOffsetChanged = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingBotPagerScreenKt.OnboardingBotPagerScreen(this.$state, this.$onPickClick, this.$onPageChanged, this.$onOffsetChanged, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}

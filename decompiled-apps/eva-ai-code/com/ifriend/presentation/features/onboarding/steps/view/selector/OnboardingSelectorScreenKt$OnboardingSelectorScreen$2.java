package com.ifriend.presentation.features.onboarding.steps.view.selector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingSelectorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingSelectorScreenKt$OnboardingSelectorScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<SelectButtonUiParams, Unit> $onButtonClick;
    final /* synthetic */ OnboardingSelectorState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingSelectorScreenKt$OnboardingSelectorScreen$2(OnboardingSelectorState onboardingSelectorState, Function1<? super SelectButtonUiParams, Unit> function1, int i) {
        super(2);
        this.$state = onboardingSelectorState;
        this.$onButtonClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingSelectorScreenKt.OnboardingSelectorScreen(this.$state, this.$onButtonClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}

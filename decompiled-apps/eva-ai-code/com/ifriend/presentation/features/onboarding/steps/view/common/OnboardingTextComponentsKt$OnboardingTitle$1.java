package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingTextComponents.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingTextComponentsKt$OnboardingTitle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $align;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingTextComponentsKt$OnboardingTitle$1(String str, Modifier modifier, int i, int i2, int i3) {
        super(2);
        this.$text = str;
        this.$modifier = modifier;
        this.$align = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingTextComponentsKt.m6936OnboardingTitle8iNrtrE(this.$text, this.$modifier, this.$align, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

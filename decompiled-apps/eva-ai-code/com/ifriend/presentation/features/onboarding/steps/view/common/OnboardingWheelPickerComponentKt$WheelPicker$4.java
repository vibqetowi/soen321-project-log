package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt$WheelPicker$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function4<LazyItemScope, Integer, Composer, Integer, Unit> $content;
    final /* synthetic */ int $count;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Integer> $onScrollFinished;
    final /* synthetic */ int $rowCount;
    final /* synthetic */ SelectorProperties $selectorProperties;
    final /* synthetic */ long $size;
    final /* synthetic */ int $startIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelPickerComponentKt$WheelPicker$4(Modifier modifier, int i, int i2, int i3, long j, SelectorProperties selectorProperties, Function1<? super Integer, Integer> function1, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i4, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$startIndex = i;
        this.$count = i2;
        this.$rowCount = i3;
        this.$size = j;
        this.$selectorProperties = selectorProperties;
        this.$onScrollFinished = function1;
        this.$content = function4;
        this.$$changed = i4;
        this.$$default = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingWheelPickerComponentKt.m6938WheelPickerF4kRBEE(this.$modifier, this.$startIndex, this.$count, this.$rowCount, this.$size, this.$selectorProperties, this.$onScrollFinished, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt$WheelTextPicker$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Integer> $onScrollFinished;
    final /* synthetic */ int $rowCount;
    final /* synthetic */ SelectorProperties $selectorProperties;
    final /* synthetic */ long $size;
    final /* synthetic */ int $startIndex;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ List<String> $texts;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelPickerComponentKt$WheelTextPicker$3(Modifier modifier, int i, long j, List<String> list, int i2, TextStyle textStyle, long j2, SelectorProperties selectorProperties, Function1<? super Integer, Integer> function1, int i3, int i4) {
        super(2);
        this.$modifier = modifier;
        this.$startIndex = i;
        this.$size = j;
        this.$texts = list;
        this.$rowCount = i2;
        this.$style = textStyle;
        this.$color = j2;
        this.$selectorProperties = selectorProperties;
        this.$onScrollFinished = function1;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OnboardingWheelPickerComponentKt.m6939WheelTextPickerFVCnw(this.$modifier, this.$startIndex, this.$size, this.$texts, this.$rowCount, this.$style, this.$color, this.$selectorProperties, this.$onScrollFinished, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

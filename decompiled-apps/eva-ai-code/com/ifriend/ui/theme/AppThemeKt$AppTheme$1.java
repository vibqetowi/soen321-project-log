package com.ifriend.ui.theme;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppTheme.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppThemeKt$AppTheme$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AppColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ AppDimensions $dimensions;
    final /* synthetic */ TextSelectionColors $selectionColors;
    final /* synthetic */ AppTypography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppThemeKt$AppTheme$1(AppColors appColors, AppTypography appTypography, AppDimensions appDimensions, TextSelectionColors textSelectionColors, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$colors = appColors;
        this.$typography = appTypography;
        this.$dimensions = appDimensions;
        this.$selectionColors = textSelectionColors;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppThemeKt.AppTheme(this.$colors, this.$typography, this.$dimensions, this.$selectionColors, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

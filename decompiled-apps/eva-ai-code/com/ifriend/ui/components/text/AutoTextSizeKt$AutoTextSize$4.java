package com.ifriend.ui.components.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoTextSize.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoTextSizeKt$AutoTextSize$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ long $targetLineHeight;
    final /* synthetic */ long $targetTextSizeHeight;
    final /* synthetic */ AnnotatedString $text;
    final /* synthetic */ TextAlign $textAlign;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTextSizeKt$AutoTextSize$4(Modifier modifier, AnnotatedString annotatedString, long j, TextAlign textAlign, TextStyle textStyle, long j2, long j3, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$text = annotatedString;
        this.$color = j;
        this.$textAlign = textAlign;
        this.$style = textStyle;
        this.$targetTextSizeHeight = j2;
        this.$targetLineHeight = j3;
        this.$maxLines = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AutoTextSizeKt.m7072AutoTextSizetoyU4E8(this.$modifier, this.$text, this.$color, this.$textAlign, this.$style, this.$targetTextSizeHeight, this.$targetLineHeight, this.$maxLines, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

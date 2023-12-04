package com.ifriend.ui.features.pager;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalSelectChatPageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $background;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ Function5<BoxScope, Dp, Dp, Composer, Integer, Unit> $content;
    final /* synthetic */ float $horizontalContentPadding;
    final /* synthetic */ boolean $isNeedBorder;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$2(Modifier modifier, long j, long j2, boolean z, float f, Function5<? super BoxScope, ? super Dp, ? super Dp, ? super Composer, ? super Integer, Unit> function5, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$background = j;
        this.$borderColor = j2;
        this.$isNeedBorder = z;
        this.$horizontalContentPadding = f;
        this.$content = function5;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HorizontalSelectChatPageContentKt.m7081HorizontalSelectChatPageContentfozQRw(this.$modifier, this.$background, this.$borderColor, this.$isNeedBorder, this.$horizontalContentPadding, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

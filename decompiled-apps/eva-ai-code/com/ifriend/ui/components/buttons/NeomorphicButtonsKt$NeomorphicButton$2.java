package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeomorphicButtons.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeomorphicButtonsKt$NeomorphicButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $background;
    final /* synthetic */ float $borderRadius;
    final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ long $innerShadowColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ float $shadowOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NeomorphicButtonsKt$NeomorphicButton$2(Function0<Unit> function0, Modifier modifier, float f, boolean z, Brush brush, long j, float f2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$borderRadius = f;
        this.$enabled = z;
        this.$background = brush;
        this.$innerShadowColor = j;
        this.$shadowOffset = f2;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        NeomorphicButtonsKt.m7030NeomorphicButtonrNcnHrQ(this.$onClick, this.$modifier, this.$borderRadius, this.$enabled, this.$background, this.$innerShadowColor, this.$shadowOffset, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

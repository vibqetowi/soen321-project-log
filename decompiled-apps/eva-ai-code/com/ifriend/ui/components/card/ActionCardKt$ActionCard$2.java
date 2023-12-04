package com.ifriend.ui.components.card;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionCardKt$ActionCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $height;
    final /* synthetic */ float $iconHeight;
    final /* synthetic */ float $iconWidth;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ int $resId;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ long $tintColor;
    final /* synthetic */ float $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionCardKt$ActionCard$2(Function0<Unit> function0, Modifier modifier, float f, float f2, long j, long j2, Shape shape, float f3, float f4, int i, boolean z, int i2, int i3, int i4) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$height = f;
        this.$width = f2;
        this.$backgroundColor = j;
        this.$tintColor = j2;
        this.$shape = shape;
        this.$iconHeight = f3;
        this.$iconWidth = f4;
        this.$resId = i;
        this.$enabled = z;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ActionCardKt.m7034ActionCarddrCWNGk(this.$onClick, this.$modifier, this.$height, this.$width, this.$backgroundColor, this.$tintColor, this.$shape, this.$iconHeight, this.$iconWidth, this.$resId, this.$enabled, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}

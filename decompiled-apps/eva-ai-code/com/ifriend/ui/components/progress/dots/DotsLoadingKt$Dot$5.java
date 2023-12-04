package com.ifriend.ui.components.progress.dots;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DotsLoading.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsLoadingKt$Dot$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function0<Float> $alpha;
    final /* synthetic */ long $color;
    final /* synthetic */ float $size;
    final /* synthetic */ Function0<Float> $xOffset;
    final /* synthetic */ Function0<Float> $yOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsLoadingKt$Dot$5(float f, long j, Function0<Float> function0, Function0<Float> function02, Function0<Float> function03, int i, int i2) {
        super(2);
        this.$size = f;
        this.$color = j;
        this.$yOffset = function0;
        this.$xOffset = function02;
        this.$alpha = function03;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DotsLoadingKt.m7060DotZHrjRmQ(this.$size, this.$color, this.$yOffset, this.$xOffset, this.$alpha, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

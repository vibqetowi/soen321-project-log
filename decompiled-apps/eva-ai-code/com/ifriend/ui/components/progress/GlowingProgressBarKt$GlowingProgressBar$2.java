package com.ifriend.ui.components.progress;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlowingProgressBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingProgressBarKt$GlowingProgressBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AnimationSpec<Dp> $animationSpec;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $progress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowingProgressBarKt$GlowingProgressBar$2(float f, Modifier modifier, AnimationSpec<Dp> animationSpec, long j, int i, int i2) {
        super(2);
        this.$progress = f;
        this.$modifier = modifier;
        this.$animationSpec = animationSpec;
        this.$backgroundColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        GlowingProgressBarKt.m7058GlowingProgressBarww6aTOc(this.$progress, this.$modifier, this.$animationSpec, this.$backgroundColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

package com.ifriend.ui.components.progress;

import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndeterminateProgress.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndeterminateProgressKt$IndeterminateProgress$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ DurationBasedAnimationSpec<Float> $animation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ RepeatMode $repeatMode;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateProgressKt$IndeterminateProgress$3(Modifier modifier, long j, DurationBasedAnimationSpec<Float> durationBasedAnimationSpec, RepeatMode repeatMode, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$scrimColor = j;
        this.$animation = durationBasedAnimationSpec;
        this.$repeatMode = repeatMode;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        IndeterminateProgressKt.m7059IndeterminateProgresssW7UJKQ(this.$modifier, this.$scrimColor, this.$animation, this.$repeatMode, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}

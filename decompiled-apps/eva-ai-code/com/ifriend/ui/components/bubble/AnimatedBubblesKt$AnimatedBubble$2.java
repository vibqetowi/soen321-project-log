package com.ifriend.ui.components.bubble;

import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedBubbles.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedBubblesKt$AnimatedBubble$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DurationBasedAnimationSpec<Float> $animation;
    final /* synthetic */ long $animationOffset;
    final /* synthetic */ float $animationRadius;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ float $bubbleSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBubblesKt$AnimatedBubble$2(Brush brush, float f, float f2, long j, DurationBasedAnimationSpec<Float> durationBasedAnimationSpec, int i) {
        super(2);
        this.$brush = brush;
        this.$bubbleSize = f;
        this.$animationRadius = f2;
        this.$animationOffset = j;
        this.$animation = durationBasedAnimationSpec;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedBubblesKt.m7019AnimatedBubbleAAERXIQ(this.$brush, this.$bubbleSize, this.$animationRadius, this.$animationOffset, this.$animation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}

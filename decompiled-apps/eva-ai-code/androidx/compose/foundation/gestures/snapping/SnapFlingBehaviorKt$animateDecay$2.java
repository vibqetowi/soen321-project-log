package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
    final /* synthetic */ Function1<Float, Unit> $onAnimationStep;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ ScrollScope $this_animateDecay;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehaviorKt$animateDecay$2(float f, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1<? super Float, Unit> function1) {
        super(1);
        this.$targetOffset = f;
        this.$previousValue = floatRef;
        this.$this_animateDecay = scrollScope;
        this.$onAnimationStep = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AnimationScope<Float, AnimationVector1D> animateDecay) {
        float coerceToTarget;
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        if (Math.abs(animateDecay.getValue().floatValue()) >= Math.abs(this.$targetOffset)) {
            coerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animateDecay.getValue().floatValue(), this.$targetOffset);
            SnapFlingBehaviorKt.animateDecay$consumeDelta(animateDecay, this.$this_animateDecay, this.$onAnimationStep, coerceToTarget - this.$previousValue.element);
            animateDecay.cancelAnimation();
            this.$previousValue.element = coerceToTarget;
            return;
        }
        SnapFlingBehaviorKt.animateDecay$consumeDelta(animateDecay, this.$this_animateDecay, this.$onAnimationStep, animateDecay.getValue().floatValue() - this.$previousValue.element);
        this.$previousValue.element = animateDecay.getValue().floatValue();
    }
}

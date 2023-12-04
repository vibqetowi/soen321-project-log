package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$3 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ Function1<Float, Unit> $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdatableAnimationState$animateToZero$3(UpdatableAnimationState updatableAnimationState, float f, Function1<? super Float, Unit> function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        long j2;
        long j3;
        long roundToLong;
        UpdatableAnimationState.Companion companion;
        UpdatableAnimationState.Companion companion2;
        AnimationVector1D animationVector1D;
        UpdatableAnimationState.Companion companion3;
        UpdatableAnimationState.Companion companion4;
        AnimationVector1D animationVector1D2;
        UpdatableAnimationState.Companion companion5;
        UpdatableAnimationState.Companion companion6;
        AnimationVector1D animationVector1D3;
        j2 = this.this$0.lastFrameTime;
        if (j2 == Long.MIN_VALUE) {
            this.this$0.lastFrameTime = j;
        }
        AnimationVector1D animationVector1D4 = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            companion5 = UpdatableAnimationState.Companion;
            companion6 = UpdatableAnimationState.Companion;
            animationVector1D3 = this.this$0.lastVelocity;
            roundToLong = companion5.getRebasableAnimationSpec().getDurationNanos(new AnimationVector1D(this.this$0.getValue()), companion6.getZeroVector(), animationVector1D3);
        } else {
            j3 = this.this$0.lastFrameTime;
            roundToLong = MathKt.roundToLong(((float) (j - j3)) / this.$durationScale);
        }
        companion = UpdatableAnimationState.Companion;
        VectorizedSpringSpec<AnimationVector1D> rebasableAnimationSpec = companion.getRebasableAnimationSpec();
        AnimationVector1D animationVector1D5 = animationVector1D4;
        companion2 = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector = companion2.getZeroVector();
        animationVector1D = this.this$0.lastVelocity;
        float value = rebasableAnimationSpec.getValueFromNanos(roundToLong, animationVector1D5, zeroVector, animationVector1D).getValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        companion3 = UpdatableAnimationState.Companion;
        VectorizedSpringSpec<AnimationVector1D> rebasableAnimationSpec2 = companion3.getRebasableAnimationSpec();
        companion4 = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector2 = companion4.getZeroVector();
        animationVector1D2 = this.this$0.lastVelocity;
        updatableAnimationState.lastVelocity = rebasableAnimationSpec2.getVelocityFromNanos(roundToLong, animationVector1D5, zeroVector2, animationVector1D2);
        this.this$0.lastFrameTime = j;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(this.this$0.getValue() - value));
    }
}

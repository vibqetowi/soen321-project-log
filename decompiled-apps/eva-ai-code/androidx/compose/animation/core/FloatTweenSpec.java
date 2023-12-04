package androidx.compose.animation.core;

import androidx.compose.animation.core.FloatAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: FloatAnimationSpec.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "duration", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "getDuration", "clampPlayTime", "", "playTime", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public /* synthetic */ float getEndVelocity(float f, float f2, float f3) {
        return FloatAnimationSpec.CC.$default$getEndVelocity(this, f, f2, f3);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        VectorizedAnimationSpec vectorize;
        vectorize = vectorize(twoWayConverter);
        return vectorize;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return FloatAnimationSpec.CC.m355$default$vectorize((FloatAnimationSpec) this, twoWayConverter);
    }

    public FloatTweenSpec(int i, int i2, Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.duration = i;
        this.delay = i2;
        this.easing = easing;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDelay() {
        return this.delay;
    }

    public /* synthetic */ FloatTweenSpec(int i, int i2, Easing easing, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        long clampPlayTime = clampPlayTime(j / 1000000);
        int i = this.duration;
        return VectorConvertersKt.lerp(f, f2, this.easing.transform(RangesKt.coerceIn(i == 0 ? 1.0f : ((float) clampPlayTime) / i, 0.0f, 1.0f)));
    }

    private final long clampPlayTime(long j) {
        return RangesKt.coerceIn(j - this.delay, 0L, this.duration);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f2, float f3) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long clampPlayTime = clampPlayTime(j / 1000000);
        int i = (clampPlayTime > 0L ? 1 : (clampPlayTime == 0L ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, f, f2, f3) - getValueFromNanos((clampPlayTime - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }
}

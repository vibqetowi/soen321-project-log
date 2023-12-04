package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class InfiniteTransitionKt$animateValue$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InfiniteRepeatableSpec<T> $animationSpec;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(T t, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, T t2, InfiniteRepeatableSpec<T> infiniteRepeatableSpec) {
        super(0);
        this.$initialValue = t;
        this.$transitionAnimation = transitionAnimationState;
        this.$targetValue = t2;
        this.$animationSpec = infiniteRepeatableSpec;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (Intrinsics.areEqual(this.$initialValue, this.$transitionAnimation.getInitialValue$animation_core_release()) && Intrinsics.areEqual(this.$targetValue, this.$transitionAnimation.getTargetValue$animation_core_release())) {
            return;
        }
        this.$transitionAnimation.updateValues$animation_core_release(this.$initialValue, this.$targetValue, this.$animationSpec);
    }
}

package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBar$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
    final /* synthetic */ Ref.FloatRef $lastValue;
    final /* synthetic */ Ref.FloatRef $remainingVelocity;
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$2(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2) {
        super(1);
        this.$lastValue = floatRef;
        this.$state = topAppBarState;
        this.$remainingVelocity = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AnimationScope<Float, AnimationVector1D> animateDecay) {
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float floatValue = animateDecay.getValue().floatValue() - this.$lastValue.element;
        float heightOffset = this.$state.getHeightOffset();
        this.$state.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - this.$state.getHeightOffset());
        this.$lastValue.element = animateDecay.getValue().floatValue();
        this.$remainingVelocity.element = animateDecay.getVelocity().floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animateDecay.cancelAnimation();
        }
    }
}

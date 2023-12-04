package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$scale$2 extends Lambda implements Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$scale$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(3);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> animateFloat, Composer composer, int i) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        SpringSpec springSpec3;
        SpringSpec springSpec4;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-53984035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53984035, i, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:883)");
        }
        if (animateFloat.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            Scale scale = this.$enter.getData$animation_release().getScale();
            if (scale == null || (springSpec2 = scale.getAnimationSpec()) == null) {
                springSpec4 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                springSpec2 = springSpec4;
            }
        } else if (!animateFloat.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            springSpec2 = springSpec;
        } else {
            Scale scale2 = this.$exit.getData$animation_release().getScale();
            if (scale2 == null || (springSpec2 = scale2.getAnimationSpec()) == null) {
                springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                springSpec2 = springSpec3;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return springSpec2;
    }
}

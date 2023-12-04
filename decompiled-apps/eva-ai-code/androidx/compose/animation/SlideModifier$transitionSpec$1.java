package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SlideModifier$transitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.this$0 = slideModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<IntOffset> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<IntOffset> animationSpec2;
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            Slide value = this.this$0.getSlideIn().getValue();
            if (value == null || (animationSpec2 = value.getAnimationSpec()) == null) {
                springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec3;
            }
            return animationSpec2;
        } else if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec;
        } else {
            Slide value2 = this.this$0.getSlideOut().getValue();
            if (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) {
                springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec2;
            }
            return animationSpec;
        }
    }
}

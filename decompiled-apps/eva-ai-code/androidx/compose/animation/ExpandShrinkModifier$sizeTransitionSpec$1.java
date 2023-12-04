package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExpandShrinkModifier$sizeTransitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        SpringSpec springSpec3 = null;
        if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize value = this.this$0.getExpand().getValue();
            if (value != null) {
                springSpec3 = value.getAnimationSpec();
            }
        } else if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            springSpec3 = springSpec;
        } else {
            ChangeSize value2 = this.this$0.getShrink().getValue();
            if (value2 != null) {
                springSpec3 = value2.getAnimationSpec();
            }
        }
        if (springSpec3 == null) {
            springSpec2 = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            return springSpec2;
        }
        return springSpec3;
    }
}

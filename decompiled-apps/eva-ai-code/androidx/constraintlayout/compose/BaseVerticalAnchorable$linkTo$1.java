package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintScopeCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class BaseVerticalAnchorable$linkTo$1 extends Lambda implements Function1<State, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseVerticalAnchorable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerticalAnchorable$linkTo$1(BaseVerticalAnchorable baseVerticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2) {
        super(1);
        this.this$0 = baseVerticalAnchorable;
        this.$anchor = verticalAnchor;
        this.$margin = f;
        this.$goneMargin = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(State state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        LayoutDirection layoutDirection = state.getLayoutDirection();
        AnchorFunctions anchorFunctions = AnchorFunctions.INSTANCE;
        i = this.this$0.index;
        int verticalAnchorIndexToFunctionIndex = anchorFunctions.verticalAnchorIndexToFunctionIndex(i, layoutDirection);
        int verticalAnchorIndexToFunctionIndex2 = AnchorFunctions.INSTANCE.verticalAnchorIndexToFunctionIndex(this.$anchor.getIndex$compose_release(), layoutDirection);
        AnchorFunctions.INSTANCE.getVerticalAnchorFunctions()[verticalAnchorIndexToFunctionIndex][verticalAnchorIndexToFunctionIndex2].invoke(this.this$0.getConstraintReference(state), this.$anchor.getId$compose_release(), state.getLayoutDirection()).margin(Dp.m5605boximpl(this.$margin)).marginGone(Dp.m5605boximpl(this.$goneMargin));
    }
}

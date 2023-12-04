package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintScopeCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class BaseHorizontalAnchorable$linkTo$1 extends Lambda implements Function1<State, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseHorizontalAnchorable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHorizontalAnchorable$linkTo$1(BaseHorizontalAnchorable baseHorizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2) {
        super(1);
        this.this$0 = baseHorizontalAnchorable;
        this.$anchor = horizontalAnchor;
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
        ConstraintReference constraintReference = this.this$0.getConstraintReference(state);
        BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = this.$anchor;
        float f = this.$margin;
        float f2 = this.$goneMargin;
        Function2<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions();
        i = baseHorizontalAnchorable.index;
        horizontalAnchorFunctions[i][horizontalAnchor.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor.getId$compose_release()).margin(Dp.m5605boximpl(f)).marginGone(Dp.m5605boximpl(f2));
    }
}

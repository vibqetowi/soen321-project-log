package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstrainScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ConstrainScope$circular$1 extends Lambda implements Function1<State, Unit> {
    final /* synthetic */ float $angle;
    final /* synthetic */ float $distance;
    final /* synthetic */ ConstrainedLayoutReference $other;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainScope$circular$1(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f, float f2) {
        super(1);
        this.this$0 = constrainScope;
        this.$other = constrainedLayoutReference;
        this.$angle = f;
        this.$distance = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.constraints(this.this$0.getId$compose_release()).circularConstraint(this.$other.getId(), this.$angle, state.convertDimension(Dp.m5605boximpl(this.$distance)));
    }
}

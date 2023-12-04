package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstrainScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ConstrainScope$addFloatTransformFromDp$1 extends Lambda implements Function1<State, Unit> {
    final /* synthetic */ Function2<ConstraintReference, Float, Unit> $change;
    final /* synthetic */ float $dpValue;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstrainScope$addFloatTransformFromDp$1(Function2<? super ConstraintReference, ? super Float, Unit> function2, ConstrainScope constrainScope, float f) {
        super(1);
        this.$change = function2;
        this.this$0 = constrainScope;
        this.$dpValue = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == null) {
            return;
        }
        Function2<ConstraintReference, Float, Unit> function2 = this.$change;
        ConstrainScope constrainScope = this.this$0;
        float f = this.$dpValue;
        ConstraintReference constraints = state.constraints(constrainScope.getId$compose_release());
        Intrinsics.checkNotNullExpressionValue(constraints, "state.constraints(id)");
        function2.invoke(constraints, Float.valueOf(state.convertDimension(Dp.m5605boximpl(f))));
    }
}

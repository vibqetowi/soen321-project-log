package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ConstraintLayoutBaseScope$createTopBarrier$1 extends Lambda implements Function1<State, Unit> {
    final /* synthetic */ ConstrainedLayoutReference[] $elements;
    final /* synthetic */ int $id;
    final /* synthetic */ float $margin;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutBaseScope$createTopBarrier$1(int i, float f, ConstrainedLayoutReference[] constrainedLayoutReferenceArr) {
        super(1);
        this.$id = i;
        this.$margin = f;
        this.$elements = constrainedLayoutReferenceArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BarrierReference barrier = state.barrier(Integer.valueOf(this.$id), State.Direction.TOP);
        ConstrainedLayoutReference[] constrainedLayoutReferenceArr = this.$elements;
        ArrayList arrayList = new ArrayList(constrainedLayoutReferenceArr.length);
        for (ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            arrayList.add(constrainedLayoutReference.getId());
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array != null) {
            barrier.add(Arrays.copyOf(array, array.length));
            barrier.margin(state.convertDimension(Dp.m5605boximpl(this.$margin)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}

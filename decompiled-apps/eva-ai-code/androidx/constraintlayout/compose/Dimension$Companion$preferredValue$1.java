package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class Dimension$Companion$preferredValue$1 extends Lambda implements Function1<State, androidx.constraintlayout.core.state.Dimension> {
    final /* synthetic */ float $dp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dimension$Companion$preferredValue$1(float f) {
        super(1);
        this.$dp = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.constraintlayout.core.state.Dimension invoke(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.constraintlayout.core.state.Dimension suggested = androidx.constraintlayout.core.state.Dimension.Suggested(state.convertDimension(Dp.m5605boximpl(this.$dp))).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
        Intrinsics.checkNotNullExpressionValue(suggested, "Suggested(state.convertDimension(dp)).suggested(SPREAD_DIMENSION)");
        return suggested;
    }
}

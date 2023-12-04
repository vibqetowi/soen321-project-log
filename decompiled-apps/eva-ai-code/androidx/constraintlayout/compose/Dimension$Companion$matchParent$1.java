package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "it", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class Dimension$Companion$matchParent$1 extends Lambda implements Function1<State, androidx.constraintlayout.core.state.Dimension> {
    public static final Dimension$Companion$matchParent$1 INSTANCE = new Dimension$Companion$matchParent$1();

    Dimension$Companion$matchParent$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.constraintlayout.core.state.Dimension invoke(State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        androidx.constraintlayout.core.state.Dimension Parent = androidx.constraintlayout.core.state.Dimension.Parent();
        Intrinsics.checkNotNullExpressionValue(Parent, "Parent()");
        return Parent;
    }
}
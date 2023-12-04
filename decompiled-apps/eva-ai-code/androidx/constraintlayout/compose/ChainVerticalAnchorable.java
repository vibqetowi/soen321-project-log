package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChainConstrainScope.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/constraintlayout/compose/ChainVerticalAnchorable;", "Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "id", "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/util/List;Ljava/lang/Object;I)V", "getConstraintReference", "Landroidx/constraintlayout/core/state/ConstraintReference;", "state", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ChainVerticalAnchorable extends BaseVerticalAnchorable {
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainVerticalAnchorable(List<Function1<State, Unit>> tasks, Object id, int i) {
        super(tasks, i);
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    @Override // androidx.constraintlayout.compose.BaseVerticalAnchorable
    public ConstraintReference getConstraintReference(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HelperReference helper = state.helper(this.id, State.Helper.HORIZONTAL_CHAIN);
        Intrinsics.checkNotNullExpressionValue(helper, "state.helper(id, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN)");
        return helper;
    }
}

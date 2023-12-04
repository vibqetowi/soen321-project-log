package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintSet.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "transition", "Landroidx/constraintlayout/core/state/Transition;", "type", "", "isDirty", "", "override", "name", "", "value", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface ConstraintSet {

    /* compiled from: ConstraintSet.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void applyTo(ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static boolean isDirty(ConstraintSet constraintSet, List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return true;
        }

        public static ConstraintSet override(ConstraintSet constraintSet, String name, float f) {
            Intrinsics.checkNotNullParameter(constraintSet, "this");
            Intrinsics.checkNotNullParameter(name, "name");
            return constraintSet;
        }
    }

    void applyTo(State state, List<? extends Measurable> list);

    void applyTo(androidx.constraintlayout.core.state.Transition transition, int i);

    boolean isDirty(List<? extends Measurable> list);

    ConstraintSet override(String str, float f);
}

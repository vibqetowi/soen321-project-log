package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintSet.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "applyToState", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface DerivedConstraintSet extends ConstraintSet {
    @Override // androidx.constraintlayout.compose.ConstraintSet
    void applyTo(State state, List<? extends Measurable> list);

    void applyToState(State state);

    ConstraintSet getExtendFrom();

    /* compiled from: ConstraintSet.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void applyTo(DerivedConstraintSet derivedConstraintSet, androidx.constraintlayout.core.state.Transition transition, int i) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(transition, "transition");
            ConstraintSet.DefaultImpls.applyTo(derivedConstraintSet, transition, i);
        }

        public static boolean isDirty(DerivedConstraintSet derivedConstraintSet, List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return ConstraintSet.DefaultImpls.isDirty(derivedConstraintSet, measurables);
        }

        public static ConstraintSet override(DerivedConstraintSet derivedConstraintSet, String name, float f) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(name, "name");
            return ConstraintSet.DefaultImpls.override(derivedConstraintSet, name, f);
        }

        public static void applyTo(DerivedConstraintSet derivedConstraintSet, State state, List<? extends Measurable> measurables) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet, "this");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ConstraintLayoutKt.buildMapping(state, measurables);
            ConstraintSet extendFrom = derivedConstraintSet.getExtendFrom();
            DerivedConstraintSet derivedConstraintSet2 = extendFrom instanceof DerivedConstraintSet ? (DerivedConstraintSet) extendFrom : null;
            if (derivedConstraintSet2 != null) {
                derivedConstraintSet2.applyTo(state, measurables);
            }
            derivedConstraintSet.applyToState(state);
        }
    }
}

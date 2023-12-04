package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DslConstraintSet.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B*\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "description", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "", "Lkotlin/ExtensionFunctionType;", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "(Lkotlin/jvm/functions/Function1;Landroidx/constraintlayout/compose/ConstraintSet;)V", "getDescription", "()Lkotlin/jvm/functions/Function1;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "applyToState", "state", "Landroidx/constraintlayout/compose/State;", "override", "name", "", "value", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DslConstraintSet implements DerivedConstraintSet {
    private final Function1<ConstraintSetScope, Unit> description;
    private final ConstraintSet extendFrom;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(Function1<? super ConstraintSetScope, Unit> description, ConstraintSet constraintSet) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.extendFrom = constraintSet;
    }

    public /* synthetic */ DslConstraintSet(Function1 function1, ConstraintSet constraintSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(State state, List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(androidx.constraintlayout.core.state.Transition transition, int i) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, transition, i);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> list) {
        return DerivedConstraintSet.DefaultImpls.isDirty(this, list);
    }

    public final Function1<ConstraintSetScope, Unit> getDescription() {
        return this.description;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ConstraintSetScope constraintSetScope = new ConstraintSetScope();
        this.description.invoke(constraintSetScope);
        constraintSetScope.applyTo(state);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public ConstraintSet override(String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this;
    }
}

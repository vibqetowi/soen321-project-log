package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0016\u0010\u001e\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "scope", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "handler", "Landroid/os/Handler;", "knownDirty", "", "getKnownDirty", "()Z", "setKnownDirty", "(Z)V", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingConstrainLambdas", "Lkotlin/Function1;", "", "previousDatas", "", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "getScope", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "applyTo", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "isDirty", "onAbandoned", "onForgotten", "onRemembered", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    private Handler handler;
    private boolean knownDirty;
    private final SnapshotStateObserver observer;
    private final Function1<Unit, Unit> onCommitAffectingConstrainLambdas;
    private final List<ConstraintLayoutParentData> previousDatas;
    private final ConstraintLayoutScope scope;

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public ConstraintSetForInlineDsl(ConstraintLayoutScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.observer = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));
        this.knownDirty = true;
        this.onCommitAffectingConstrainLambdas = new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);
        this.previousDatas = new ArrayList();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(androidx.constraintlayout.core.state.Transition transition, int i) {
        ConstraintSet.DefaultImpls.applyTo(this, transition, i);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public ConstraintSet override(String str, float f) {
        return ConstraintSet.DefaultImpls.override(this, str, f);
    }

    public final ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(State state, List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        this.scope.applyTo(state);
        this.previousDatas.clear();
        this.observer.observeReads(Unit.INSTANCE, this.onCommitAffectingConstrainLambdas, new ConstraintSetForInlineDsl$applyTo$1(measurables, state, this));
        this.knownDirty = false;
    }

    public final boolean getKnownDirty() {
        return this.knownDirty;
    }

    public final void setKnownDirty(boolean z) {
        this.knownDirty = z;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object parentData = measurables.get(i).getParentData();
                if (!Intrinsics.areEqual(parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null, this.previousDatas.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.observer.start();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.observer.stop();
        this.observer.clear();
    }
}

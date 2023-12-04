package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\"\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "constrain", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "getConstrain", "()Lkotlin/jvm/functions/Function1;", "layoutId", "", "getLayoutId", "()Ljava/lang/Object;", "getRef", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "equals", "", "other", "hashCode", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintLayoutParentData implements LayoutIdParentData {
    private final Function1<ConstrainScope, Unit> constrain;
    private final Object layoutId;
    private final ConstrainedLayoutReference ref;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(ConstrainedLayoutReference ref, Function1<? super ConstrainScope, Unit> constrain) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrain, "constrain");
        this.ref = ref;
        this.constrain = constrain;
        this.layoutId = ref.getId();
    }

    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    public final Function1<ConstrainScope, Unit> getConstrain() {
        return this.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConstraintLayoutParentData) {
            ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
            if (Intrinsics.areEqual(this.ref.getId(), constraintLayoutParentData.ref.getId()) && Intrinsics.areEqual(this.constrain, constraintLayoutParentData.constrain)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }
}

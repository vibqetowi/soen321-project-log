package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UiApplier.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "root", "(Landroidx/compose/ui/node/LayoutNode;)V", "insertBottomUp", "", FirebaseAnalytics.Param.INDEX, "", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "onEndChanges", "remove", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiApplier(LayoutNode root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        getCurrent().insertAt$ui_release(i, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        getCurrent().removeAt$ui_release(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        getCurrent().move$ui_release(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.AbstractApplier, androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }
}

package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OwnerSnapshotObserver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OwnerSnapshotObserver$onCommitAffectingSemantics$1 extends Lambda implements Function1<LayoutNode, Unit> {
    public static final OwnerSnapshotObserver$onCommitAffectingSemantics$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingSemantics$1();

    OwnerSnapshotObserver$onCommitAffectingSemantics$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.isValidOwnerScope()) {
            layoutNode.invalidateSemantics$ui_release();
        }
    }
}

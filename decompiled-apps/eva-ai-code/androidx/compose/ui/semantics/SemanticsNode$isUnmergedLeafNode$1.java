package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SemanticsNode$isUnmergedLeafNode$1 extends Lambda implements Function1<LayoutNode, Boolean> {
    public static final SemanticsNode$isUnmergedLeafNode$1 INSTANCE = new SemanticsNode$isUnmergedLeafNode$1();

    SemanticsNode$isUnmergedLeafNode$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SemanticsConfiguration collapsedSemantics$ui_release = it.getCollapsedSemantics$ui_release();
        boolean z = false;
        if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
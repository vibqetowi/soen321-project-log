package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 extends Lambda implements Function1<LayoutNode, Boolean> {
    public static final AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 INSTANCE = new AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1();

    AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getNodes$ui_release().m4720hasH91voCI$ui_release(NodeKind.m4757constructorimpl(8)));
    }
}

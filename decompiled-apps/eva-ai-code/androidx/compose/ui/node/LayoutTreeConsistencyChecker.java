package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: LayoutTreeConsistencyChecker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\f\u0010\u0012\u001a\u00020\r*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "postponedMeasureRequests", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutTreeConsistencyChecker {
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(LayoutNode root, DepthSortedSetsForDifferentPasses relayoutNodes, List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (consistentLayoutState(layoutNode)) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i = 0; i < size; i++) {
                if (!isTreeConsistent(children$ui_release.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if ((r0 != null && r0.isPlaced()) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (!layoutNode.isPlaced()) {
            if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
            }
            if (Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true)) {
                if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = list.get(i);
                        MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = postponedRequest3;
                        if (Intrinsics.areEqual(postponedRequest4.getNode(), layoutNode) && postponedRequest4.isLookahead()) {
                            postponedRequest2 = postponedRequest3;
                            break;
                        }
                        i++;
                    }
                    if (postponedRequest2 != null) {
                        return true;
                    }
                }
                if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    if (!this.relayoutNodes.contains(layoutNode, true)) {
                        if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring) {
                            if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || !Intrinsics.areEqual(layoutNode.getLookaheadRoot$ui_release(), layoutNode)) {
                                return false;
                            }
                        }
                    }
                    return true;
                } else if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                    return this.relayoutNodes.contains(layoutNode, true) || parent$ui_release == null || parent$ui_release.getLookaheadMeasurePending$ui_release() || parent$ui_release.getLookaheadLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut || (parent$ui_release.getLayoutPending$ui_release() && Intrinsics.areEqual(layoutNode.getLookaheadRoot$ui_release(), layoutNode));
                }
            }
            return true;
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    postponedRequest = null;
                    break;
                }
                postponedRequest = list2.get(i2);
                MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest;
                if (Intrinsics.areEqual(postponedRequest5.getNode(), layoutNode) && !postponedRequest5.isLookahead()) {
                    break;
                }
                i2++;
            }
            if (postponedRequest != null) {
                return true;
            }
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            if (!this.relayoutNodes.contains(layoutNode)) {
                if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release())) {
                    if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState$ui_release != LayoutNode.LayoutState.Measuring) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (layoutNode.getLayoutPending$ui_release()) {
            return this.relayoutNodes.contains(layoutNode) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut;
        }
        if (Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true)) {
        }
        return true;
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        sb.append("[" + layoutNode.getLayoutState$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb2;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(nodeToString);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i3), i);
        }
    }
}

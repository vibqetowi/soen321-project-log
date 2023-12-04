package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0001H\u0000\u001a=\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetNode;", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "isEligibleForFocusSearch", "", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "onFound", "Lkotlin/Function1;", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusTraversalKt {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m2970customFocusSearchOMvw8(FocusTargetNode customFocusSearch, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties fetchFocusProperties$ui_release = customFocusSearch.fetchFocusProperties$ui_release();
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2950getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2952getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2954getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2945getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2949getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                end = fetchFocusProperties$ui_release.getStart();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                end = fetchFocusProperties$ui_release.getEnd();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2953getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = fetchFocusProperties$ui_release.getEnd();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                end = fetchFocusProperties$ui_release.getStart();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2946getEnterdhqQ8s())) {
            return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m2934boximpl(i));
        } else {
            if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2947getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m2934boximpl(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return end;
    }

    /* renamed from: focusSearch-sMXa3k8  reason: not valid java name */
    public static final boolean m2971focusSearchsMXa3k8(FocusTargetNode focusSearch, int i, LayoutDirection layoutDirection, Function1<? super FocusTargetNode, Boolean> onFound) {
        int m2953getRightdhqQ8s;
        Boolean m2983twoDimensionalFocusSearchOMvw8;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2950getNextdhqQ8s()) ? true : FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2952getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m2974oneDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
        }
        if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2949getLeftdhqQ8s()) ? true : FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2953getRightdhqQ8s()) ? true : FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2954getUpdhqQ8s()) ? true : FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2945getDowndhqQ8s())) {
            Boolean m2983twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m2983twoDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
            if (m2983twoDimensionalFocusSearchOMvw82 != null) {
                return m2983twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2946getEnterdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m2953getRightdhqQ8s = FocusDirection.Companion.m2953getRightdhqQ8s();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m2953getRightdhqQ8s = FocusDirection.Companion.m2949getLeftdhqQ8s();
            }
            FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusSearch);
            if (findActiveFocusNode != null && (m2983twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m2983twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m2953getRightdhqQ8s, onFound)) != null) {
                return m2983twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2947getExitdhqQ8s())) {
            FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusSearch);
            FocusTargetNode findNonDeactivatedParent = findActiveFocusNode2 != null ? findNonDeactivatedParent(findActiveFocusNode2) : null;
            if (findNonDeactivatedParent != null && !Intrinsics.areEqual(findNonDeactivatedParent, focusSearch)) {
                return onFound.invoke(findNonDeactivatedParent).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m2939toStringimpl(i))).toString());
        }
        return false;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            NodeCoordinator nodeCoordinator = coordinator$ui_release;
            Rect localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).localBoundingBoxOf(nodeCoordinator, false);
            if (localBoundingBoxOf != null) {
                return localBoundingBoxOf;
            }
        }
        return Rect.Companion.getZero();
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if ((coordinator$ui_release == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isPlaced()) ? false : true) {
            NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
            if ((coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isAttached()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0042, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode getActiveChild(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        if (focusTargetNode.getNode().isAttached()) {
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
            if (!focusTargetNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode2.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode2.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4757constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                                    int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode3;
                                    }
                                } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector2);
                            }
                            continue;
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0056, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                FocusTargetNode focusTargetNode2 = focusTargetNode;
                int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
                if (!focusTargetNode2.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child$ui_release = focusTargetNode2.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode2.getNode());
                } else {
                    mutableVector.add(child$ui_release);
                }
                while (mutableVector.isNotEmpty()) {
                    Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                    if ((node.getAggregateChildKindSet$ui_release() & m4757constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            } else if ((node.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        FocusTargetNode findActiveFocusNode = findActiveFocusNode((FocusTargetNode) node);
                                        if (findActiveFocusNode != null) {
                                            return findActiveFocusNode;
                                        }
                                    } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node);
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                }
                                continue;
                            } else {
                                node = node.getChild$ui_release();
                            }
                        }
                    }
                }
                return null;
            } else if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        if (!focusTargetNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                                if (focusTargetNode3.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode3;
                                }
                            } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                        continue;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }
}

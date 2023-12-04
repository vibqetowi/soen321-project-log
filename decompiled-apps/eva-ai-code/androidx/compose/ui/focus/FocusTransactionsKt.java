package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a!\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000e\u001a!\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0001*\u00020\u0002H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusTransactionsKt {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean requestFocus(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[m2969performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.Companion.m2946getEnterdhqQ8s()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return performRequestFocus(focusTargetNode);
    }

    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        FocusTargetNode focusTargetNode2 = null;
        if (i == 3) {
            z = (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode)) ? false : false;
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z;
            }
            return z;
        } else if (i == 4) {
            FocusTargetNode focusTargetNode3 = focusTargetNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
            if (!focusTargetNode3.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = focusTargetNode3.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node node = parent$ui_release;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    focusTargetNode2 = node;
                                    break loop0;
                                }
                                if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
            FocusTargetNode focusTargetNode4 = focusTargetNode2;
            if (focusTargetNode4 != null) {
                return requestFocusForChild(focusTargetNode4, focusTargetNode);
            }
            z = (requestFocusForOwner(focusTargetNode) && grantFocus(focusTargetNode)) ? false : false;
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z;
            }
            return z;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        } else {
            return true;
        }
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                focusTargetNode.setFocusState(FocusStateImpl.Active);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return true;
            } else if (i == 3 || i == 4) {
                return false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        } else if (i == 2) {
            if (z) {
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    return z;
                }
                return z;
            }
            return z;
        } else if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!clearChildFocus(focusTargetNode, z, z2)) {
            return false;
        } else {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        }
        return true;
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 3 || i == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            return true;
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3;
        boolean z;
        Modifier.Node node;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        if (!focusTargetNode4.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode4.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
        loop0: while (true) {
            focusTargetNode3 = null;
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                        node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
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
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
        }
        if (Intrinsics.areEqual(node, focusTargetNode)) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            if (i2 == 1) {
                boolean grantFocus = grantFocus(focusTargetNode2);
                if (grantFocus) {
                    focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    return grantFocus;
                }
                return grantFocus;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (FocusTraversalKt.getActiveChild(focusTargetNode) == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    z = (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) ? false : false;
                    if (z) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
                    }
                    return z;
                } else if (i2 == 4) {
                    FocusTargetNode focusTargetNode5 = focusTargetNode;
                    int m4757constructorimpl2 = NodeKind.m4757constructorimpl(1024);
                    if (!focusTargetNode5.getNode().isAttached()) {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    Modifier.Node parent$ui_release2 = focusTargetNode5.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode5);
                    loop4: while (true) {
                        if (requireLayoutNode2 == null) {
                            break;
                        }
                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl2) != 0) {
                            while (parent$ui_release2 != null) {
                                if ((parent$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                    Modifier.Node node2 = parent$ui_release2;
                                    MutableVector mutableVector2 = null;
                                    while (node2 != null) {
                                        if (node2 instanceof FocusTargetNode) {
                                            focusTargetNode3 = node2;
                                            break loop4;
                                        }
                                        if (((node2.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node2 instanceof DelegatingNode)) {
                                            int i3 = 0;
                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        node2 = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node2 != null) {
                                                            if (mutableVector2 != null) {
                                                                mutableVector2.add(node2);
                                                            }
                                                            node2 = null;
                                                        }
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(delegate$ui_release2);
                                                        }
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                        node2 = DelegatableNodeKt.pop(mutableVector2);
                                    }
                                    continue;
                                }
                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                            }
                        }
                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                        parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                    }
                    FocusTargetNode focusTargetNode6 = focusTargetNode3;
                    if (focusTargetNode6 == null && requestFocusForOwner(focusTargetNode)) {
                        focusTargetNode.setFocusState(FocusStateImpl.Active);
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                        return requestFocusForChild(focusTargetNode, focusTargetNode2);
                    } else if (focusTargetNode6 == null || !requestFocusForChild(focusTargetNode6, focusTargetNode)) {
                        return false;
                    } else {
                        boolean requestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
                            return requestFocusForChild;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return false;
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner$ui_release = layoutNode.getOwner$ui_release()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner$ui_release.requestFocus();
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0  reason: not valid java name */
    public static final CustomDestinationResult m2969performCustomRequestFocusMxy_nc0(FocusTargetNode performCustomRequestFocus, int i) {
        FocusTargetNode focusTargetNode;
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(performCustomRequestFocus, "$this$performCustomRequestFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomRequestFocus.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomRequestFocus);
            if (activeChild != null) {
                return m2966performCustomClearFocusMxy_nc0(activeChild, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else if (i2 == 4) {
            FocusTargetNode focusTargetNode2 = performCustomRequestFocus;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
            if (!focusTargetNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    focusTargetNode = null;
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            focusTargetNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (focusTargetNode != null) {
                                if (focusTargetNode instanceof FocusTargetNode) {
                                    break loop0;
                                }
                                if (((focusTargetNode.getKindSet$ui_release() & m4757constructorimpl) != 0) && (focusTargetNode instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) focusTargetNode).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                focusTargetNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (focusTargetNode != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(focusTargetNode);
                                                    }
                                                    focusTargetNode = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                focusTargetNode = DelegatableNodeKt.pop(mutableVector);
                            }
                            continue;
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            FocusTargetNode focusTargetNode3 = focusTargetNode;
            if (focusTargetNode3 == null) {
                return CustomDestinationResult.None;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            CustomDestinationResult m2969performCustomRequestFocusMxy_nc0 = m2969performCustomRequestFocusMxy_nc0(focusTargetNode3, i);
                            CustomDestinationResult customDestinationResult = m2969performCustomRequestFocusMxy_nc0 == CustomDestinationResult.None ? null : m2969performCustomRequestFocusMxy_nc0;
                            return customDestinationResult == null ? m2967performCustomEnterMxy_nc0(focusTargetNode3, i) : customDestinationResult;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return m2969performCustomRequestFocusMxy_nc0(focusTargetNode3, i);
                }
                return CustomDestinationResult.Cancelled;
            }
            return m2967performCustomEnterMxy_nc0(focusTargetNode3, i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0  reason: not valid java name */
    public static final CustomDestinationResult m2966performCustomClearFocusMxy_nc0(FocusTargetNode performCustomClearFocus, int i) {
        Intrinsics.checkNotNullParameter(performCustomClearFocus, "$this$performCustomClearFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomClearFocus.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomClearFocus);
                if (activeChild != null) {
                    CustomDestinationResult m2966performCustomClearFocusMxy_nc0 = m2966performCustomClearFocusMxy_nc0(activeChild, i);
                    if (m2966performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                        m2966performCustomClearFocusMxy_nc0 = null;
                    }
                    return m2966performCustomClearFocusMxy_nc0 == null ? m2968performCustomExitMxy_nc0(performCustomClearFocus, i) : m2966performCustomClearFocusMxy_nc0;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0  reason: not valid java name */
    private static final CustomDestinationResult m2967performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2934boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    if (invoke == FocusRequester.Companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return invoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0  reason: not valid java name */
    private static final CustomDestinationResult m2968performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2934boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    if (invoke == FocusRequester.Companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return invoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }
}

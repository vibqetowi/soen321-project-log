package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FocusEventModifierNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "invalidateFocusEvent", "", "refreshFocusEventNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusEventModifierNodeKt {

    /* compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void invalidateFocusEvent(FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "<this>");
        DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ac, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusState getFocusState(FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "<this>");
        FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        Modifier.Node node = focusEventModifierNode2.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                FocusStateImpl focusState = ((FocusTargetNode) node).getFocusState();
                int i = WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return focusState;
                }
            } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
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
        if (focusEventModifierNode2.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusEventModifierNode2.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode2.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & m4757constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                } else {
                    while (true) {
                        if (node2 == null) {
                            break;
                        } else if ((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node2 != null) {
                                if (node2 instanceof FocusTargetNode) {
                                    FocusStateImpl focusState2 = ((FocusTargetNode) node2).getFocusState();
                                    int i3 = WhenMappings.$EnumSwitchMapping$0[focusState2.ordinal()];
                                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                                        return focusState2;
                                    }
                                } else if (((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                    int i4 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                node2 = delegate$ui_release2;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector3);
                            }
                            continue;
                        } else {
                            node2 = node2.getChild$ui_release();
                        }
                    }
                }
            }
            return FocusStateImpl.Inactive;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void refreshFocusEventNodes(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(4096);
        int m4757constructorimpl2 = NodeKind.m4757constructorimpl(1024);
        Modifier.Node node = focusTargetNode2.getNode();
        int i = m4757constructorimpl | m4757constructorimpl2;
        if (!focusTargetNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = focusTargetNode2.getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i) != 0) {
                        if (node2 != node) {
                            if ((node2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                return;
                            }
                        }
                        if ((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            Modifier.Node node3 = node2;
                            MutableVector mutableVector = null;
                            while (node3 != null) {
                                if (!(node3 instanceof FocusEventModifierNode)) {
                                    if (((node3.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node3 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node3 = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node3 != null) {
                                                        if (mutableVector != null) {
                                                            mutableVector.add(node3);
                                                        }
                                                        node3 = null;
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
                                } else {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) node3;
                                    focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                                }
                                node3 = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }
}

package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FocusRequesterModifierNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "requestFocus", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b2, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean requestFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode2.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(focusTargetNode) : TwoDimensionalFocusSearchKt.m2979findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, FocusDirection.Companion.m2946getEnterdhqQ8s(), FocusRequesterModifierNodeKt$requestFocus$1$1.INSTANCE);
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
        if (focusRequesterModifierNode2.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode2.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
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
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                    return focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(focusTargetNode2) : TwoDimensionalFocusSearchKt.m2979findChildCorrespondingToFocusEnterOMvw8(focusTargetNode2, FocusDirection.Companion.m2946getEnterdhqQ8s(), FocusRequesterModifierNodeKt$requestFocus$1$1.INSTANCE);
                                }
                                if (((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x009b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean captureFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode2.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (!(node instanceof FocusTargetNode)) {
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
            } else if (FocusTransactionsKt.captureFocus((FocusTargetNode) node)) {
                return true;
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (focusRequesterModifierNode2.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode2.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
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
                                if (!(node2 instanceof FocusTargetNode)) {
                                    if (((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
                                        }
                                    }
                                } else if (FocusTransactionsKt.captureFocus((FocusTargetNode) node2)) {
                                    return true;
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
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x009b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode2.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (!(node instanceof FocusTargetNode)) {
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
            } else if (FocusTransactionsKt.freeFocus((FocusTargetNode) node)) {
                return true;
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (focusRequesterModifierNode2.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode2.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
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
                                if (!(node2 instanceof FocusTargetNode)) {
                                    if (((node2.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
                                        }
                                    }
                                } else if (FocusTransactionsKt.freeFocus((FocusTargetNode) node2)) {
                                    return true;
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
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }
}

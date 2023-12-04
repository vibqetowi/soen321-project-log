package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001d\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001d\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000202H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0014H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u001d\u00104\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010-J\u000e\u00106\u001a\u0004\u0018\u000107*\u000208H\u0002J\\\u00109\u001a\u00020\u0005\"\n\b\u0000\u0010:\u0018\u0001*\u000208*\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchKeyEvent-ZmokQxo", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", ExifInterface.GPS_DIRECTION_TRUE, "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetNode rootFocusNode;

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetNode();
        this.focusInvalidationManager = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(FocusTargetNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusTargetNode create() {
                return FocusOwnerImpl.this.getRootFocusNode$ui_release();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return FocusOwnerImpl.this.getRootFocusNode$ui_release().hashCode();
            }
        };
    }

    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<set-?>");
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        clearFocus(z, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean z, boolean z2) {
        FocusStateImpl focusStateImpl;
        if (!z) {
            int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2966performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.Companion.m2947getExitdhqQ8s()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return;
            }
        }
        FocusStateImpl focusState = this.rootFocusNode.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z, z2)) {
            FocusTargetNode focusTargetNode = this.rootFocusNode;
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetNode.setFocusState(focusStateImpl);
        }
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo2955moveFocus3ESFkO8(int i) {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester m2970customFocusSearchOMvw8 = FocusTraversalKt.m2970customFocusSearchOMvw8(findActiveFocusNode, i, getLayoutDirection());
        if (m2970customFocusSearchOMvw8 != FocusRequester.Companion.getDefault()) {
            return m2970customFocusSearchOMvw8 != FocusRequester.Companion.getCancel() && m2970customFocusSearchOMvw8.focus$ui_release();
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean m2971focusSearchsMXa3k8 = FocusTraversalKt.m2971focusSearchsMXa3k8(this.rootFocusNode, i, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode, i, booleanRef));
        if (booleanRef.element) {
            return false;
        }
        return m2971focusSearchsMXa3k8 || m2959wrapAroundFocus3ESFkO8(i);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo2957dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = findActiveFocusNode;
            Modifier.Node lastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetNode);
            if (lastLocalKeyInputNode == null) {
                int m4757constructorimpl = NodeKind.m4757constructorimpl(8192);
                if (!focusTargetNode.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop0: while (true) {
                    if (requireLayoutNode == null) {
                        node = null;
                        break;
                    }
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                MutableVector mutableVector = null;
                                node = parent$ui_release;
                                while (node != null) {
                                    if (node instanceof KeyInputModifierNode) {
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
                    parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
                }
                KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) node;
                lastLocalKeyInputNode = keyInputModifierNode != null ? keyInputModifierNode.getNode() : null;
            }
            if (lastLocalKeyInputNode != null) {
                Modifier.Node node2 = lastLocalKeyInputNode;
                int m4757constructorimpl2 = NodeKind.m4757constructorimpl(8192);
                if (!node2.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent$ui_release2 = node2.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(node2);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                Modifier.Node node3 = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node3 != null) {
                                    if (node3 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node3);
                                    } else if (((node3.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node3 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node3 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node3 != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node3);
                                                        }
                                                        node3 = null;
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
                                    node3 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = i - 1;
                        if (((KeyInputModifierNode) arrayList.get(i)).mo405onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i = i4;
                    }
                }
                Modifier.Node node4 = node2.getNode();
                MutableVector mutableVector3 = null;
                while (node4 != null) {
                    if (!(node4 instanceof KeyInputModifierNode)) {
                        if (((node4.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node4 instanceof DelegatingNode)) {
                            int i5 = 0;
                            for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                                if ((delegate$ui_release3.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        node4 = delegate$ui_release3;
                                    } else {
                                        if (mutableVector3 == null) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node4 != null) {
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(node4);
                                            }
                                            node4 = null;
                                        }
                                        if (mutableVector3 != null) {
                                            mutableVector3.add(delegate$ui_release3);
                                        }
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                    } else if (((KeyInputModifierNode) node4).mo405onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    node4 = DelegatableNodeKt.pop(mutableVector3);
                }
                Modifier.Node node5 = node2.getNode();
                MutableVector mutableVector4 = null;
                while (node5 != null) {
                    if (!(node5 instanceof KeyInputModifierNode)) {
                        if (((node5.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node5 instanceof DelegatingNode)) {
                            int i6 = 0;
                            for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node5).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                                if ((delegate$ui_release4.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        node5 = delegate$ui_release4;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node5 != null) {
                                            if (mutableVector4 != null) {
                                                mutableVector4.add(node5);
                                            }
                                            node5 = null;
                                        }
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(delegate$ui_release4);
                                        }
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                    } else if (((KeyInputModifierNode) node5).mo403onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    node5 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((KeyInputModifierNode) arrayList.get(i7)).mo403onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo2956dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(131072);
            if (!focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    node = null;
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            node = parent$ui_release;
                            while (node != null) {
                                if (node instanceof SoftKeyboardInterceptionModifierNode) {
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
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) node;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode;
            int m4757constructorimpl2 = NodeKind.m4757constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release2 = softKeyboardInterceptionModifierNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode2);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl2) != 0) {
                    while (parent$ui_release2 != null) {
                        if ((parent$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui_release2;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if (((node2.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node2 instanceof DelegatingNode)) {
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
                        }
                        parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = i - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i)).mo3976onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    i = i4;
                }
            }
            Modifier.Node node3 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != null) {
                if (!(node3 instanceof SoftKeyboardInterceptionModifierNode)) {
                    if (((node3.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node3 instanceof DelegatingNode)) {
                        int i5 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        if (mutableVector3 != null) {
                                            mutableVector3.add(node3);
                                        }
                                        node3 = null;
                                    }
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                } else if (((SoftKeyboardInterceptionModifierNode) node3).mo3976onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            Modifier.Node node4 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != null) {
                if (!(node4 instanceof SoftKeyboardInterceptionModifierNode)) {
                    if (((node4.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node4 instanceof DelegatingNode)) {
                        int i6 = 0;
                        for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node4 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node4 != null) {
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(node4);
                                        }
                                        node4 = null;
                                    }
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                } else if (((SoftKeyboardInterceptionModifierNode) node4).mo3975onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i7)).mo3975onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16384);
            if (!focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    node = null;
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            node = parent$ui_release;
                            while (node != null) {
                                if (node instanceof RotaryInputModifierNode) {
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
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) node;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            RotaryInputModifierNode rotaryInputModifierNode2 = rotaryInputModifierNode;
            int m4757constructorimpl2 = NodeKind.m4757constructorimpl(16384);
            if (!rotaryInputModifierNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release2 = rotaryInputModifierNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode2);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4757constructorimpl2) != 0) {
                    while (parent$ui_release2 != null) {
                        if ((parent$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui_release2;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if (((node2.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node2 instanceof DelegatingNode)) {
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
                        }
                        parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = i - 1;
                    if (((RotaryInputModifierNode) arrayList.get(i)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    i = i4;
                }
            }
            Modifier.Node node3 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != null) {
                if (!(node3 instanceof RotaryInputModifierNode)) {
                    if (((node3.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node3 instanceof DelegatingNode)) {
                        int i5 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        if (mutableVector3 != null) {
                                            mutableVector3.add(node3);
                                        }
                                        node3 = null;
                                    }
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                } else if (((RotaryInputModifierNode) node3).onPreRotaryScrollEvent(event)) {
                    return true;
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            Modifier.Node node4 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != null) {
                if (!(node4 instanceof RotaryInputModifierNode)) {
                    if (((node4.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node4 instanceof DelegatingNode)) {
                        int i6 = 0;
                        for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node4 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node4 != null) {
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(node4);
                                        }
                                        node4 = null;
                                    }
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                } else if (((RotaryInputModifierNode) node4).onRotaryScrollEvent(event)) {
                    return true;
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((RotaryInputModifierNode) arrayList.get(i7)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8  reason: not valid java name */
    private final boolean m2959wrapAroundFocus3ESFkO8(int i) {
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            if (FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2950getNextdhqQ8s()) ? true : FocusDirection.m2937equalsimpl0(i, FocusDirection.Companion.m2952getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.rootFocusNode.getFocusState().isFocused()) {
                    return mo2955moveFocus3ESFkO8(i);
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: traverseAncestors-Y-YKmho  reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2958traverseAncestorsYYKmho(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        int i2;
        int i3;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (node instanceof Object) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
                            } else if (((node.getKindSet$ui_release() & i) != 0) && (node instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & i) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i5 = i3 - 1;
                function1.invoke((Object) arrayList.get(i3));
                if (i5 < 0) {
                    break;
                }
                i3 = i5;
            }
        }
        Modifier.Node node2 = delegatableNode.getNode();
        MutableVector mutableVector2 = null;
        while (node2 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node2 instanceof Object) {
                function1.invoke(node2);
            } else if (((node2.getKindSet$ui_release() & i) != 0) && (node2 instanceof DelegatingNode)) {
                int i6 = 0;
                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                    if ((delegate$ui_release2.getKindSet$ui_release() & i) != 0) {
                        i6++;
                        if (i6 == 1) {
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
                if (i6 == 1) {
                }
            }
            node2 = DelegatableNodeKt.pop(mutableVector2);
        }
        Modifier.Node node3 = delegatableNode.getNode();
        MutableVector mutableVector3 = null;
        while (node3 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node3 instanceof Object) {
                function12.invoke(node3);
            } else if (((node3.getKindSet$ui_release() & i) != 0) && (node3 instanceof DelegatingNode)) {
                int i7 = 0;
                for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                    if ((delegate$ui_release3.getKindSet$ui_release() & i) != 0) {
                        i7++;
                        if (i7 == 1) {
                            node3 = delegate$ui_release3;
                        } else {
                            if (mutableVector3 == null) {
                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node3 != null) {
                                if (mutableVector3 != null) {
                                    mutableVector3.add(node3);
                                }
                                node3 = null;
                            }
                            if (mutableVector3 != null) {
                                mutableVector3.add(delegate$ui_release3);
                            }
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            node3 = DelegatableNodeKt.pop(mutableVector3);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                function12.invoke((Object) arrayList.get(i2));
            }
        }
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int m4757constructorimpl = NodeKind.m4757constructorimpl(1024) | NodeKind.m4757constructorimpl(8192);
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                    if ((NodeKind.m4757constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                        return node2;
                    }
                    node2 = child$ui_release;
                }
            }
        }
        return node2;
    }
}

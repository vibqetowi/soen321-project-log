package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0082\bJ7\u0010&\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u001a\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010)\u001a\u00020\rH\u0002J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Node extends NodeParent {
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private final MutableVector<PointerId> pointerIds;
    private final Map<PointerId, PointerInputChange> relevantChanges;
    private boolean wasIn;

    public Node(Modifier.Node modifierNode) {
        Intrinsics.checkNotNullParameter(modifierNode, "modifierNode");
        this.modifierNode = modifierNode;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0095 A[SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean buildCache(Map<PointerId, PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        int i;
        PointerInputChange pointerInputChange;
        boolean z2;
        boolean z3;
        LayoutCoordinates layoutCoordinates;
        int m4381getExit7fucELk;
        int i2;
        PointerInputChange m4422copyOHpmEuE;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean buildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, z);
        int i3 = 1;
        if (this.modifierNode.isAttached()) {
            Modifier.Node node = this.modifierNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
            MutableVector mutableVector = null;
            while (true) {
                i = 0;
                if (node == null) {
                    break;
                }
                if (node instanceof PointerInputModifierNode) {
                    this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) node);
                } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                    int i4 = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
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
            for (Map.Entry<PointerId, PointerInputChange> entry : changes.entrySet()) {
                long m4412unboximpl = entry.getKey().m4412unboximpl();
                PointerInputChange value = entry.getValue();
                int size = this.pointerIds.getSize() - i3;
                if (size >= 0) {
                    for (int i5 = i; this.pointerIds.getContent()[i5].m4412unboximpl() != m4412unboximpl; i5++) {
                        if (i5 != size) {
                        }
                    }
                    i2 = i3;
                    if (i2 == 0) {
                        ArrayList arrayList = new ArrayList(value.getHistorical().size());
                        List<HistoricalChange> historical = value.getHistorical();
                        int size2 = historical.size();
                        int i6 = i;
                        while (i6 < size2) {
                            HistoricalChange historicalChange = historical.get(i6);
                            long uptimeMillis = historicalChange.getUptimeMillis();
                            LayoutCoordinates layoutCoordinates2 = this.coordinates;
                            Intrinsics.checkNotNull(layoutCoordinates2);
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo4553localPositionOfR5De75A(parentCoordinates, historicalChange.m4354getPositionF1C5BW0()), null));
                            i6++;
                            arrayList = arrayList2;
                        }
                        ArrayList arrayList3 = arrayList;
                        Map<PointerId, PointerInputChange> map = this.relevantChanges;
                        PointerId m4406boximpl = PointerId.m4406boximpl(m4412unboximpl);
                        LayoutCoordinates layoutCoordinates3 = this.coordinates;
                        Intrinsics.checkNotNull(layoutCoordinates3);
                        long mo4553localPositionOfR5De75A = layoutCoordinates3.mo4553localPositionOfR5De75A(parentCoordinates, value.m4427getPreviousPositionF1C5BW0());
                        LayoutCoordinates layoutCoordinates4 = this.coordinates;
                        Intrinsics.checkNotNull(layoutCoordinates4);
                        m4422copyOHpmEuE = value.m4422copyOHpmEuE((r34 & 1) != 0 ? value.id : 0L, (r34 & 2) != 0 ? value.uptimeMillis : 0L, (r34 & 4) != 0 ? value.position : layoutCoordinates4.mo4553localPositionOfR5De75A(parentCoordinates, value.m4426getPositionF1C5BW0()), (r34 & 8) != 0 ? value.pressed : false, (r34 & 16) != 0 ? value.previousUptimeMillis : 0L, (r34 & 32) != 0 ? value.previousPosition : mo4553localPositionOfR5De75A, (r34 & 64) != 0 ? value.previousPressed : false, (r34 & 128) != 0 ? value.type : 0, arrayList3, (r34 & 512) != 0 ? value.scrollDelta : 0L);
                        map.put(m4406boximpl, m4422copyOHpmEuE);
                        i3 = 1;
                        i = 0;
                    }
                }
                i2 = i;
                if (i2 == 0) {
                }
            }
            if (this.relevantChanges.isEmpty()) {
                this.pointerIds.clear();
                getChildren().clear();
                return true;
            }
            for (int size3 = this.pointerIds.getSize() - 1; -1 < size3; size3--) {
                if (!changes.containsKey(PointerId.m4406boximpl(this.pointerIds.getContent()[size3].m4412unboximpl()))) {
                    this.pointerIds.removeAt(size3);
                }
            }
            PointerEvent pointerEvent = new PointerEvent(CollectionsKt.toList(this.relevantChanges.values()), internalPointerEvent);
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size4 = changes2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size4) {
                    pointerInputChange = null;
                    break;
                }
                PointerInputChange pointerInputChange2 = changes2.get(i7);
                if (internalPointerEvent.m4356issuesEnterExitEvent0FcD4WY(pointerInputChange2.m4425getIdJ3iCeTQ())) {
                    pointerInputChange = pointerInputChange2;
                    break;
                }
                i7++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 != null) {
                if (!z) {
                    z2 = false;
                    this.isIn = false;
                } else {
                    z2 = false;
                    if (!this.isIn && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                        Intrinsics.checkNotNull(this.coordinates);
                        z3 = true;
                        this.isIn = !PointerEventKt.m4371isOutOfBoundsO0kMr_c(pointerInputChange3, layoutCoordinates.mo4552getSizeYbymL2g());
                        if (this.isIn == this.wasIn && (PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4382getMove7fucELk()) || PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4380getEnter7fucELk()) || PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4381getExit7fucELk()))) {
                            if (this.isIn) {
                                m4381getExit7fucELk = PointerEventType.Companion.m4380getEnter7fucELk();
                            } else {
                                m4381getExit7fucELk = PointerEventType.Companion.m4381getExit7fucELk();
                            }
                            pointerEvent.m4370setTypeEhbLWgg$ui_release(m4381getExit7fucELk);
                        } else if (!PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4380getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                            pointerEvent.m4370setTypeEhbLWgg$ui_release(PointerEventType.Companion.m4382getMove7fucELk());
                        } else if (PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4381getExit7fucELk()) && this.isIn && pointerInputChange3.getPressed()) {
                            pointerEvent.m4370setTypeEhbLWgg$ui_release(PointerEventType.Companion.m4382getMove7fucELk());
                        }
                    }
                }
                z3 = true;
                if (this.isIn == this.wasIn) {
                }
                if (!PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4380getEnter7fucELk())) {
                }
                if (PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4381getExit7fucELk())) {
                    pointerEvent.m4370setTypeEhbLWgg$ui_release(PointerEventType.Companion.m4382getMove7fucELk());
                }
            } else {
                z2 = false;
                z3 = true;
            }
            boolean z4 = (buildCache || !PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4382getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z3 : z2;
            this.pointerEvent = pointerEvent;
            return z4;
        }
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m3015equalsimpl0(pointerEvent.getChanges().get(i).m4426getPositionF1C5BW0(), pointerEvent2.getChanges().get(i).m4426getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> function0) {
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            function0.invoke();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchCancel() {
        Modifier.Node node;
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size <= 0) {
            node = this.modifierNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
            }
        }
        Node[] content = children.getContent();
        int i = 0;
        do {
            content[i].dispatchCancel();
            i++;
        } while (i < size);
        node = this.modifierNode;
        int m4757constructorimpl2 = NodeKind.m4757constructorimpl(16);
        MutableVector mutableVector2 = null;
        while (node != null) {
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).onCancelPointerInput();
            } else if (((node.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
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
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if ((pointerInputChange.getPressed() || (internalPointerEvent.m4356issuesEnterExitEvent0FcD4WY(pointerInputChange.m4425getIdJ3iCeTQ()) && this.isIn)) ? false : true) {
                this.pointerIds.remove(PointerId.m4406boximpl(pointerInputChange.m4425getIdJ3iCeTQ()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4381getExit7fucELk());
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchMainEventPass(Map<PointerId, PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long mo4552getSizeYbymL2g = layoutCoordinates.mo4552getSizeYbymL2g();
            Modifier.Node node = this.modifierNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) node).mo404onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo4552getSizeYbymL2g);
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
            if (!this.modifierNode.isAttached() || (size = (children = getChildren()).getSize()) <= 0) {
                if (this.modifierNode.isAttached()) {
                    Modifier.Node node2 = this.modifierNode;
                    int m4757constructorimpl2 = NodeKind.m4757constructorimpl(16);
                    MutableVector mutableVector2 = null;
                    while (node2 != null) {
                        if (node2 instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) node2).mo404onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo4552getSizeYbymL2g);
                        } else if (((node2.getKindSet$ui_release() & m4757constructorimpl2) != 0) && (node2 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                if ((delegate$ui_release2.getKindSet$ui_release() & m4757constructorimpl2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
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
                            if (i2 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector2);
                    }
                }
                return true;
            }
            Node[] content = children.getContent();
            int i3 = 0;
            do {
                Map<PointerId, PointerInputChange> map = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                content[i3].dispatchMainEventPass(map, layoutCoordinates2, internalPointerEvent, z);
                i3++;
            } while (i3 < size);
            if (this.modifierNode.isAttached()) {
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long mo4552getSizeYbymL2g = layoutCoordinates.mo4552getSizeYbymL2g();
            Modifier.Node node = this.modifierNode;
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) node).mo404onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo4552getSizeYbymL2g);
                } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0 ? 1 : null) != null && (node instanceof DelegatingNode)) {
                    int i2 = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if (((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0 ? 1 : null) != null) {
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
            if (!this.modifierNode.isAttached() || (size = (children = getChildren()).getSize()) <= 0) {
                z = true;
            } else {
                Node[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass(internalPointerEvent);
                    i++;
                } while (i < size);
                z = true;
            }
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }
}

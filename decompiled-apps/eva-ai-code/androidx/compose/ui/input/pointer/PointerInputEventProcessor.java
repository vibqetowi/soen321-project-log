package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private final HitTestResult hitResult;
    private boolean isProcessing;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    private final LayoutNode root;

    public PointerInputEventProcessor(LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.hitPathTracker = new HitPathTracker(root.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new HitTestResult();
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog$default  reason: not valid java name */
    public static /* synthetic */ int m4444processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m4445processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x005e A[SYNTHETIC] */
    /* renamed from: process-BIzXfog  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4445processBIzXfog(PointerInputEvent pointerEvent, PositionCalculator positionCalculator, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z5 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
            Collection<PointerInputChange> values = produce.getChanges().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (PointerInputChange pointerInputChange : values) {
                    if (!pointerInputChange.getPressed() && !pointerInputChange.getPreviousPressed()) {
                        z2 = false;
                        continue;
                        if (z2) {
                            z3 = true;
                            break;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
            }
            z3 = false;
            boolean z6 = !z3;
            for (PointerInputChange pointerInputChange2 : produce.getChanges().values()) {
                if (z6 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    LayoutNode.m4683hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChange2.m4426getPositionF1C5BW0(), this.hitResult, PointerType.m4498equalsimpl0(pointerInputChange2.m4429getTypeT8wyACA(), PointerType.Companion.m4505getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m4355addHitPathKNwqfcY(pointerInputChange2.m4425getIdJ3iCeTQ(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z);
            if (!produce.getSuppressMovementConsumption()) {
                Collection<PointerInputChange> values2 = produce.getChanges().values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    for (PointerInputChange pointerInputChange3 : values2) {
                        if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            break;
                        }
                    }
                }
            }
            z5 = false;
            return PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z5);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}

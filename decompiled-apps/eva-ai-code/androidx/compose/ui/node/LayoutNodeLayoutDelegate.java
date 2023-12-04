package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0002YZB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010B\u001a\u00020CH\u0000¢\u0006\u0002\bDJ\u0006\u0010E\u001a\u00020CJ\u0006\u0010F\u001a\u00020CJ\r\u0010G\u001a\u00020CH\u0000¢\u0006\u0002\bHJ\r\u0010I\u001a\u00020CH\u0000¢\u0006\u0002\bJJ\r\u0010K\u001a\u00020CH\u0000¢\u0006\u0002\bLJ\r\u0010M\u001a\u00020CH\u0000¢\u0006\u0002\bNJ\u0006\u0010O\u001a\u00020CJ\u001d\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u001cH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u001cH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010SJ\u0006\u0010V\u001a\u00020CJ\u0006\u0010W\u001a\u00020CJ\f\u0010X\u001a\u00020\u0010*\u00020\u0003H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001c8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020%@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\bR\u001e\u0010+\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013R\u000e\u0010-\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0013R*\u00101\u001a\b\u0018\u000100R\u00020\u00002\f\u0010!\u001a\b\u0018\u000100R\u00020\u0000@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001e\u00108\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0013R\u000e\u0010:\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "value", "", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "()Z", "setCoordinatesAccessedDuringModifierPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getHeight$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLookaheadConstraints", "getLastLookaheadConstraints-DWUhwKw", "<set-?>", "layoutPending", "getLayoutPending$ui_release", "layoutPendingForAlignment", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadAlignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPendingForAlignment", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "nextChildLookaheadPlaceOrder", "nextChildPlaceOrder", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth$ui_release", "ensureLookaheadDelegateCreated", "", "ensureLookaheadDelegateCreated$ui_release", "invalidateParentData", "markChildrenDirty", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "onCoordinatesUsed", "performLookaheadMeasure", "constraints", "performLookaheadMeasure-BRTryo0", "(J)V", "performMeasure", "performMeasure-BRTryo0", "resetAlignmentLines", "updateParentData", "isOutMostLookaheadRoot", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutNodeLayoutDelegate {
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private LayoutNode.LayoutState layoutState;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private final MeasurePassDelegate measurePassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layoutState = LayoutNode.LayoutState.Idle;
        this.measurePassDelegate = new MeasurePassDelegate();
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m4698getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m4704getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m4699getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m4700getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (z || this.coordinatesAccessedDuringModifierPlacement) {
            } else {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (z || this.coordinatesAccessedDuringPlacement) {
            } else {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            boolean z = false;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                z = true;
            }
            if (z) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010N\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u0002070OH\u0016J\b\u0010Q\u001a\u00020'H\u0002J\b\u0010R\u001a\u00020'H\u0002J\u001c\u0010S\u001a\u00020'2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0%H\u0016J!\u0010U\u001a\u00020'2\u0016\u0010T\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020'0%H\u0082\bJ\u0011\u0010V\u001a\u0002072\u0006\u0010W\u001a\u00020PH\u0096\u0002J\u000e\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020\u0011J\u0006\u0010Z\u001a\u00020'J\b\u0010[\u001a\u00020'H\u0016J\b\u0010\\\u001a\u00020'H\u0002J\b\u0010]\u001a\u00020'H\u0002J\u0010\u0010^\u001a\u0002072\u0006\u0010_\u001a\u000207H\u0016J\u0010\u0010`\u001a\u0002072\u0006\u0010a\u001a\u000207H\u0016J\u001d\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u0006\u0010f\u001a\u00020'J\u0010\u0010g\u001a\u0002072\u0006\u0010_\u001a\u000207H\u0016J\u0010\u0010h\u001a\u0002072\u0006\u0010a\u001a\u000207H\u0016J\u0006\u0010i\u001a\u00020'J\b\u0010j\u001a\u00020'H\u0002J\b\u0010k\u001a\u00020'H\u0002J\u0006\u0010l\u001a\u00020'J\r\u0010m\u001a\u00020'H\u0000¢\u0006\u0002\bnJ@\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020*2\u0006\u0010K\u001a\u00020-2\u0019\u0010q\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%¢\u0006\u0002\b(H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u0006\u0010t\u001a\u00020'J@\u0010u\u001a\u00020'2\u0006\u0010p\u001a\u00020*2\u0006\u0010K\u001a\u00020-2\u0019\u0010q\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%¢\u0006\u0002\b(H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bv\u0010sJ\u001b\u0010w\u001a\u00020\u00112\u0006\u0010c\u001a\u00020!ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u0006\u0010z\u001a\u00020'J\b\u0010{\u001a\u00020'H\u0016J\b\u0010|\u001a\u00020'H\u0016J\u0010\u0010}\u001a\u00020'2\u0006\u0010~\u001a\u00020\u007fH\u0002J\u0007\u0010\u0080\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010!8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010#R!\u0010$\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%¢\u0006\u0002\b(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\u00020*X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u000201X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00106\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u000e\u0010:\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u001d\u001a\u0004\u0018\u00010@@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u0002072\u0006\u0010\u001d\u001a\u000207@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u000e\u0010G\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010H\u001a\u0002072\u0006\u0010\u001d\u001a\u000207@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u000e\u0010J\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010K\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020-@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "isPlaced", "setPlaced$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "layingOutChildren", "getLayingOutChildren", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "placedOnce", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "zIndex", "getZIndex$ui_release", "()F", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measureBasedOnLookahead", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeBasedOnLookahead", "placeOuterCoordinator", "placeOuterCoordinator-f8xVGno", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private boolean measuredOnce;
        private Object parentData;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m5735getZeronOccac();
        private boolean parentDataDirty = true;
        private final AlignmentLines alignmentLines = new LayoutNodeAlignmentLines(this);
        private final MutableVector<MeasurePassDelegate> _childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
        private boolean childDelegatesDirty = true;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.previousPlaceOrder;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m4704getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m5539boximpl(m4601getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.measuredByParent = usageByParent;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public void setPlaced$ui_release(boolean z) {
            this.isPlaced = z;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        } else {
                            mutableVector.set(i, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.childDelegatesDirty = false;
                    return this._childDelegates.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(this, layoutNode));
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final float getZIndex$ui_release() {
            return this.zIndex;
        }

        public final void onNodePlaced$ui_release() {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            if (!(zIndex == this.zIndex)) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void forEachChildDelegate(Function1<? super MeasurePassDelegate, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    function1.invoke(content[i].getMeasurePassDelegate$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4545measureBRTryo0(long j) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                this.measuredOnce = true;
                m4603setMeasurementConstraintsBRTryo0(j);
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                lookaheadPassDelegate$ui_release.mo4545measureBRTryo0(j);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m4705remeasureBRTryo0(j);
            return this;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m4705remeasureBRTryo0(long j) {
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            boolean z = true;
            LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m5544equalsimpl0(m4601getMeasurementConstraintsmsEJaDk(), j)) {
                Owner.CC.forceMeasureTheSubtree$default(requireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.INSTANCE);
            this.measuredOnce = true;
            long mo4552getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo4552getSizeYbymL2g();
            m4603setMeasurementConstraintsBRTryo0(j);
            LayoutNodeLayoutDelegate.this.m4697performMeasureBRTryo0(j);
            if (IntSize.m5765equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo4552getSizeYbymL2g(), mo4552getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                z = false;
            }
            m4602setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
            return z;
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.Measuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            int i = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4546placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (!IntOffset.m5724equalsimpl0(j, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate2.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate2.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(companion, lookaheadPassDelegate$ui_release, IntOffset.m5725getXimpl(j), IntOffset.m5726getYimpl(j), 0.0f, 4, null);
            }
            m4703placeOuterCoordinatorf8xVGno(j, f, function1);
        }

        /* renamed from: placeOuterCoordinator-f8xVGno  reason: not valid java name */
        private final void m4703placeOuterCoordinatorf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            this.lastPosition = j;
            this.lastZIndex = f;
            this.lastLayerBlock = function1;
            this.placedOnce = true;
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                LayoutNodeLayoutDelegate.this.getOuterCoordinator().m4747placeSelfApparentToRealOffsetf8xVGno(j, f, function1);
                onNodePlaced$ui_release();
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1(function1, LayoutNodeLayoutDelegate.this, j, f));
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        public final void replace() {
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                m4703placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 2) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if (!(getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) && this.parentDataDirty) {
                this.parentDataDirty = false;
                this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                i++;
            } while (i < size);
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m4686remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
            } else if (i == 2) {
                parent$ui_release2.requestRelayout$ui_release(z);
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(parent$ui_release);
            if (lookaheadPassDelegate$ui_release == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                Constraints m4700getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m4700getLastConstraintsDWUhwKw();
                Intrinsics.checkNotNull(m4700getLastConstraintsDWUhwKw);
                mo4545measureBRTryo0(m4700getLastConstraintsDWUhwKw.m5557unboximpl());
            } else if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                Constraints m4700getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m4700getLastConstraintsDWUhwKw();
                Intrinsics.checkNotNull(m4700getLastConstraintsDWUhwKw2);
                mo4545measureBRTryo0(m4700getLastConstraintsDWUhwKw2.m5557unboximpl());
            }
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mo4546placeAtf8xVGno(lookaheadPassDelegate$ui_release.m4701getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release());
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020B0XH\u0016J\b\u0010Z\u001a\u00020&H\u0002J\b\u0010[\u001a\u00020&H\u0002J\u001c\u0010\\\u001a\u00020&2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0$H\u0016J!\u0010^\u001a\u00020&2\u0016\u0010]\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020&0$H\u0082\bJ\u0011\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020YH\u0096\u0002J\u000e\u0010a\u001a\u00020&2\u0006\u0010b\u001a\u00020\u0011J\u0006\u0010c\u001a\u00020&J\b\u0010d\u001a\u00020&H\u0016J\b\u0010e\u001a\u00020&H\u0002J\b\u0010f\u001a\u00020&H\u0002J\u0010\u0010g\u001a\u00020B2\u0006\u0010h\u001a\u00020BH\u0016J\u0010\u0010i\u001a\u00020B2\u0006\u0010j\u001a\u00020BH\u0016J\u001d\u0010k\u001a\u00020\u00012\u0006\u0010l\u001a\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020B2\u0006\u0010h\u001a\u00020BH\u0016J\u0010\u0010p\u001a\u00020B2\u0006\u0010j\u001a\u00020BH\u0016J\u0006\u0010q\u001a\u00020&J\b\u0010r\u001a\u00020&H\u0002J\b\u0010s\u001a\u00020&H\u0002J\u0006\u0010t\u001a\u00020&J\r\u0010u\u001a\u00020&H\u0000¢\u0006\u0002\bvJ@\u0010w\u001a\u00020&2\u0006\u0010x\u001a\u00020+2\u0006\u0010y\u001a\u0002002\u0019\u0010z\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J\u001b\u0010}\u001a\u00020\u00112\u0006\u0010l\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u0007\u0010\u0080\u0001\u001a\u00020&J\t\u0010\u0081\u0001\u001a\u00020&H\u0016J\t\u0010\u0082\u0001\u001a\u00020&H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020&2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0007\u0010\u0086\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"RD\u0010(\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R)\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020+@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u001e\u00101\u001a\u0002002\u0006\u0010#\u001a\u000200@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0013R\u0019\u00106\u001a\u0004\u0018\u00010 X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\u000608R\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\"\u0010L\u001a\u0004\u0018\u00010K2\b\u0010#\u001a\u0004\u0018\u00010K@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u00020BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010U\u001a\u00020B2\u0006\u0010#\u001a\u00020B@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isPlaced", "setPlaced", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "<set-?>", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastLayerBlock", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/IntOffset;", "lastPosition", "getLastPosition-nOcc-ac$ui_release", "()J", "J", "", "lastZIndex", "getLastZIndex$ui_release", "()F", "layingOutChildren", "getLayingOutChildren", "lookaheadConstraints", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "setPlaceOrder$ui_release", "(I)V", "placedOnce", "previousPlaceOrder", "relayoutWithoutParentInProgress", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackLookaheadMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m5735getZeronOccac();
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.placeOrder = i;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.measuredByParent = usageByParent;
        }

        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m4700getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release  reason: not valid java name */
        public final long m4701getLastPositionnOccac$ui_release() {
            return this.lastPosition;
        }

        public final float getLastZIndex$ui_release() {
            return this.lastZIndex;
        }

        public final Function1<GraphicsLayerScope, Unit> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public void setPlaced(boolean z) {
            this.isPlaced = z;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                            mutableVector.add(lookaheadPassDelegate$ui_release);
                        } else {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release2);
                            mutableVector.set(i, lookaheadPassDelegate$ui_release2);
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.childDelegatesDirty = false;
                    return this._childDelegates.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        private final void forEachChildDelegate(Function1<? super LookaheadPassDelegate, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    function1.invoke(lookaheadPassDelegate$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, lookaheadDelegate), 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    block.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                }
                i++;
            } while (i < size);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4545measureBRTryo0(long j) {
            trackLookaheadMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m4702remeasureBRTryo0(j);
            return this;
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1 || i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 3 || i == 4) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m4702remeasureBRTryo0(long j) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release()) {
                Constraints constraints = this.lookaheadConstraints;
                if (constraints == null ? false : Constraints.m5544equalsimpl0(constraints.m5557unboximpl(), j)) {
                    Owner owner$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getOwner$ui_release();
                    if (owner$ui_release != null) {
                        owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                    }
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
            }
            this.lookaheadConstraints = Constraints.m5539boximpl(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.INSTANCE);
            this.measuredOnce = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            long IntSize = IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
            LayoutNodeLayoutDelegate.this.m4696performLookaheadMeasureBRTryo0(j);
            m4602setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (IntSize.m5767getWidthimpl(IntSize) == lookaheadDelegate.getWidth() && IntSize.m5766getHeightimpl(IntSize) == lookaheadDelegate.getHeight()) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4546placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            if (!IntOffset.m5724equalsimpl0(j, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                onNodePlaced$ui_release();
            } else {
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate.this, j), 2, null);
            }
            this.lastPosition = j;
            this.lastZIndex = f;
            this.lastLayerBlock = function1;
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            int i = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 3) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                }
            } else if (i == 2) {
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    parent$ui_release2.requestLookaheadRelayout$ui_release(z);
                } else {
                    parent$ui_release2.requestRelayout$ui_release(z);
                }
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (this.parentDataDirty) {
                this.parentDataDirty = false;
                LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate2);
                this.parentData = lookaheadDelegate2.getParentData();
                return true;
            }
            return false;
        }

        public final void onNodePlaced$ui_release() {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
                    lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced(true);
            int i = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        Constraints m4700getLastConstraintsDWUhwKw = m4700getLastConstraintsDWUhwKw();
                        Intrinsics.checkNotNull(m4700getLastConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m4702remeasureBRTryo0(m4700getLastConstraintsDWUhwKw.m5557unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void replace() {
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                mo4546placeAtf8xVGno(this.lastPosition, 0.0f, null);
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    int i2 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
                    int i3 = lookaheadPassDelegate$ui_release.placeOrder;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0  reason: not valid java name */
    public final void m4697performMeasureBRTryo0(long j) {
        if (!(this.layoutState == LayoutNode.LayoutState.Idle)) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        this.layoutState = LayoutNode.LayoutState.Measuring;
        this.measurePending = false;
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, new LayoutNodeLayoutDelegate$performMeasure$2(this, j));
        if (this.layoutState == LayoutNode.LayoutState.Measuring) {
            markLayoutPending$ui_release();
            this.layoutState = LayoutNode.LayoutState.Idle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0  reason: not valid java name */
    public final void m4696performLookaheadMeasureBRTryo0(long j) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j), 2, null);
        markLookaheadLayoutPending$ui_release();
        if (isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0.updateParentData() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateParentData() {
        boolean z;
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            z = true;
        }
        z = false;
        if (z) {
            if (isOutMostLookaheadRoot(this.layoutNode)) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                    return;
                }
                return;
            }
            LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release3 != null) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
            }
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }
}

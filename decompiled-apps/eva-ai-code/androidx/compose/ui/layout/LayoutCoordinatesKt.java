package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo4554localToRootMKHz9U(Offset.Companion.m3034getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo4555localToWindowMKHz9U(Offset.Companion.m3034getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return LayoutCoordinates.CC.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m5767getWidthimpl = IntSize.m5767getWidthimpl(findRootCoordinates.mo4552getSizeYbymL2g());
        float m5766getHeightimpl = IntSize.m5766getHeightimpl(findRootCoordinates.mo4552getSizeYbymL2g());
        float coerceIn = RangesKt.coerceIn(boundsInRoot.getLeft(), 0.0f, m5767getWidthimpl);
        float coerceIn2 = RangesKt.coerceIn(boundsInRoot.getTop(), 0.0f, m5766getHeightimpl);
        float coerceIn3 = RangesKt.coerceIn(boundsInRoot.getRight(), 0.0f, m5767getWidthimpl);
        float coerceIn4 = RangesKt.coerceIn(boundsInRoot.getBottom(), 0.0f, m5766getHeightimpl);
        if (!(coerceIn == coerceIn3)) {
            if (!(coerceIn2 == coerceIn4)) {
                long mo4555localToWindowMKHz9U = findRootCoordinates.mo4555localToWindowMKHz9U(OffsetKt.Offset(coerceIn, coerceIn2));
                long mo4555localToWindowMKHz9U2 = findRootCoordinates.mo4555localToWindowMKHz9U(OffsetKt.Offset(coerceIn3, coerceIn2));
                long mo4555localToWindowMKHz9U3 = findRootCoordinates.mo4555localToWindowMKHz9U(OffsetKt.Offset(coerceIn3, coerceIn4));
                long mo4555localToWindowMKHz9U4 = findRootCoordinates.mo4555localToWindowMKHz9U(OffsetKt.Offset(coerceIn, coerceIn4));
                return new Rect(ComparisonsKt.minOf(Offset.m3018getXimpl(mo4555localToWindowMKHz9U), Offset.m3018getXimpl(mo4555localToWindowMKHz9U2), Offset.m3018getXimpl(mo4555localToWindowMKHz9U4), Offset.m3018getXimpl(mo4555localToWindowMKHz9U3)), ComparisonsKt.minOf(Offset.m3019getYimpl(mo4555localToWindowMKHz9U), Offset.m3019getYimpl(mo4555localToWindowMKHz9U2), Offset.m3019getYimpl(mo4555localToWindowMKHz9U4), Offset.m3019getYimpl(mo4555localToWindowMKHz9U3)), ComparisonsKt.maxOf(Offset.m3018getXimpl(mo4555localToWindowMKHz9U), Offset.m3018getXimpl(mo4555localToWindowMKHz9U2), Offset.m3018getXimpl(mo4555localToWindowMKHz9U4), Offset.m3018getXimpl(mo4555localToWindowMKHz9U3)), ComparisonsKt.maxOf(Offset.m3019getYimpl(mo4555localToWindowMKHz9U), Offset.m3019getYimpl(mo4555localToWindowMKHz9U2), Offset.m3019getYimpl(mo4555localToWindowMKHz9U4), Offset.m3019getYimpl(mo4555localToWindowMKHz9U3)));
            }
        }
        return Rect.Companion.getZero();
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3034getZeroF1C5BW0()) : Offset.Companion.m3034getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.CC.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m5767getWidthimpl(layoutCoordinates.mo4552getSizeYbymL2g()), IntSize.m5766getHeightimpl(layoutCoordinates.mo4552getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator3;
            }
        }
    }
}

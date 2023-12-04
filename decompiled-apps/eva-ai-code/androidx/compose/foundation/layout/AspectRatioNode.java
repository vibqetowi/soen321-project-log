package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J#\u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010)J#\u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010)J#\u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo500measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m675findSizeToXhtMw = m675findSizeToXhtMw(j);
        if (!IntSize.m5765equalsimpl0(m675findSizeToXhtMw, IntSize.Companion.m5772getZeroYbymL2g())) {
            j = Constraints.Companion.m5559fixedJhjzzOo(IntSize.m5767getWidthimpl(m675findSizeToXhtMw), IntSize.m5766getHeightimpl(m675findSizeToXhtMw));
        }
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
        return MeasureScope.CC.layout$default(measure, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo4545measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw  reason: not valid java name */
    private final long m675findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m679tryMaxWidthJN0ABg$default = m679tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m679tryMaxWidthJN0ABg$default, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m679tryMaxWidthJN0ABg$default;
            }
            long m677tryMaxHeightJN0ABg$default = m677tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m677tryMaxHeightJN0ABg$default, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m677tryMaxHeightJN0ABg$default;
            }
            long m683tryMinWidthJN0ABg$default = m683tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m683tryMinWidthJN0ABg$default, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m683tryMinWidthJN0ABg$default;
            }
            long m681tryMinHeightJN0ABg$default = m681tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m681tryMinHeightJN0ABg$default, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m681tryMinHeightJN0ABg$default;
            }
            long m678tryMaxWidthJN0ABg = m678tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m678tryMaxWidthJN0ABg, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m678tryMaxWidthJN0ABg;
            }
            long m676tryMaxHeightJN0ABg = m676tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m676tryMaxHeightJN0ABg, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m676tryMaxHeightJN0ABg;
            }
            long m682tryMinWidthJN0ABg = m682tryMinWidthJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m682tryMinWidthJN0ABg, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m682tryMinWidthJN0ABg;
            }
            long m680tryMinHeightJN0ABg = m680tryMinHeightJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m680tryMinHeightJN0ABg, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m680tryMinHeightJN0ABg;
            }
        } else {
            long m677tryMaxHeightJN0ABg$default2 = m677tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m677tryMaxHeightJN0ABg$default2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m677tryMaxHeightJN0ABg$default2;
            }
            long m679tryMaxWidthJN0ABg$default2 = m679tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m679tryMaxWidthJN0ABg$default2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m679tryMaxWidthJN0ABg$default2;
            }
            long m681tryMinHeightJN0ABg$default2 = m681tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m681tryMinHeightJN0ABg$default2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m681tryMinHeightJN0ABg$default2;
            }
            long m683tryMinWidthJN0ABg$default2 = m683tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5765equalsimpl0(m683tryMinWidthJN0ABg$default2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m683tryMinWidthJN0ABg$default2;
            }
            long m676tryMaxHeightJN0ABg2 = m676tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m676tryMaxHeightJN0ABg2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m676tryMaxHeightJN0ABg2;
            }
            long m678tryMaxWidthJN0ABg2 = m678tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m678tryMaxWidthJN0ABg2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m678tryMaxWidthJN0ABg2;
            }
            long m680tryMinHeightJN0ABg2 = m680tryMinHeightJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m680tryMinHeightJN0ABg2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m680tryMinHeightJN0ABg2;
            }
            long m682tryMinWidthJN0ABg2 = m682tryMinWidthJN0ABg(j, false);
            if (!IntSize.m5765equalsimpl0(m682tryMinWidthJN0ABg2, IntSize.Companion.m5772getZeroYbymL2g())) {
                return m682tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m5772getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m679tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m678tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg  reason: not valid java name */
    private final long m678tryMaxWidthJN0ABg(long j, boolean z) {
        int roundToInt;
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        if (m5551getMaxWidthimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m5551getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m5551getMaxWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m5566isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5772getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m677tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m676tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg  reason: not valid java name */
    private final long m676tryMaxHeightJN0ABg(long j, boolean z) {
        int roundToInt;
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        if (m5550getMaxHeightimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m5550getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m5550getMaxHeightimpl);
            if (!z || ConstraintsKt.m5566isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5772getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m683tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m682tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg  reason: not valid java name */
    private final long m682tryMinWidthJN0ABg(long j, boolean z) {
        int m5553getMinWidthimpl = Constraints.m5553getMinWidthimpl(j);
        int roundToInt = MathKt.roundToInt(m5553getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m5553getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m5566isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5772getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m681tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m680tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg  reason: not valid java name */
    private final long m680tryMinHeightJN0ABg(long j, boolean z) {
        int m5552getMinHeightimpl = Constraints.m5552getMinHeightimpl(j);
        int roundToInt = MathKt.roundToInt(m5552getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m5552getMinHeightimpl);
            if (!z || ConstraintsKt.m5566isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5772getZeroYbymL2g();
    }
}

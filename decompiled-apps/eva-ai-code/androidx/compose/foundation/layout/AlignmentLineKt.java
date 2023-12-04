package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", TtmlNode.ANNOTATION_POSITION_BEFORE, "Landroidx/compose/ui/unit/Dp;", TtmlNode.ANNOTATION_POSITION_AFTER, "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", ViewHierarchyConstants.DIMENSION_TOP_KEY, "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m626paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m625paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFrom-4j6BHR0  reason: not valid java name */
    public static final Modifier m625paddingFrom4j6BHR0(Modifier paddingFrom, AlignmentLine alignmentLine, float f, float f2) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default  reason: not valid java name */
    public static /* synthetic */ Modifier m628paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
        }
        return m627paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    /* renamed from: paddingFrom-Y_r0B1c  reason: not valid java name */
    public static final Modifier m627paddingFromY_r0B1c(Modifier paddingFrom, AlignmentLine alignmentLine, long j, long j2) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j, j2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j, j2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m630paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m629paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4  reason: not valid java name */
    public static final Modifier m629paddingFromBaselineVpY3zN4(Modifier paddingFromBaseline, float f, float f2) {
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        if (!Dp.m5612equalsimpl0(f, Dp.Companion.m5627getUnspecifiedD9Ej5fM())) {
            companion = m626paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            companion = Modifier.Companion;
        }
        Modifier then = paddingFromBaseline.then(companion);
        if (!Dp.m5612equalsimpl0(f2, Dp.Companion.m5627getUnspecifiedD9Ej5fM())) {
            companion2 = m626paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            companion2 = Modifier.Companion;
        }
        return then.then(companion2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m632paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
        }
        return m631paddingFromBaselinewCyjxdI(modifier, j, j2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI  reason: not valid java name */
    public static final Modifier m631paddingFromBaselinewCyjxdI(Modifier paddingFromBaseline, long j, long j2) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m5806isUnspecifiedR2X_6o(j) ? m628paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null) : Modifier.Companion).then(!TextUnitKt.m5806isUnspecifiedR2X_6o(j2) ? m628paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null) : Modifier.Companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA  reason: not valid java name */
    public static final MeasureResult m624alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f, float f2, Measurable measurable, long j) {
        int max;
        int height;
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo4545measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? mo4545measureBRTryo0.getHeight() : mo4545measureBRTryo0.getWidth();
        int m5550getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m5550getMaxHeightimpl(j) : Constraints.m5551getMaxWidthimpl(j)) - height2;
        int coerceIn = RangesKt.coerceIn((!Dp.m5612equalsimpl0(f, Dp.Companion.m5627getUnspecifiedD9Ej5fM()) ? measureScope.mo582roundToPx0680j_4(f) : 0) - i, 0, m5550getMaxHeightimpl);
        int coerceIn2 = RangesKt.coerceIn(((!Dp.m5612equalsimpl0(f2, Dp.Companion.m5627getUnspecifiedD9Ej5fM()) ? measureScope.mo582roundToPx0680j_4(f2) : 0) - height2) + i, 0, m5550getMaxHeightimpl - coerceIn);
        if (getHorizontal(alignmentLine)) {
            max = mo4545measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo4545measureBRTryo0.getWidth() + coerceIn + coerceIn2, Constraints.m5553getMinWidthimpl(j));
        }
        int i2 = max;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(mo4545measureBRTryo0.getHeight() + coerceIn + coerceIn2, Constraints.m5552getMinHeightimpl(j));
        } else {
            height = mo4545measureBRTryo0.getHeight();
        }
        int i3 = height;
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f, coerceIn, i2, coerceIn2, mo4545measureBRTryo0, i3), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }
}

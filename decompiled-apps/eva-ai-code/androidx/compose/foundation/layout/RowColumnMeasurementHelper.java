package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: RowColumnMeasurementHelper.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bJ\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "arrangement", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisPosition", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    private final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation orientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, float f, SizeMode crossAxisSize, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> measurables, Placeable[] placeables) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.orientation = orientation;
        this.arrangement = arrangement;
        this.arrangementSpacing = f;
        this.crossAxisSize = crossAxisSize;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = measurables;
        this.placeables = placeables;
        int size = measurables.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM  reason: not valid java name */
    public final float m774getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public final int crossAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y  reason: not valid java name */
    public final RowColumnMeasureHelperResult m775measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long j, int i, int i2) {
        int i3;
        int m5553getMinWidthimpl;
        int i4;
        int coerceAtMost;
        int i5;
        int i6;
        int i7;
        int i8;
        int max;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        long m717constructorimpl = OrientationIndependentConstraints.m717constructorimpl(j, this.orientation);
        int i13 = measureScope.mo582roundToPx0680j_4(this.arrangementSpacing);
        int i14 = i2 - i;
        float f = 0.0f;
        int i15 = 0;
        int i16 = i;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f2 = 0.0f;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i16 >= i2) {
                break;
            }
            Measurable measurable = this.measurables.get(i16);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i16];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > f) {
                f2 += weight;
                i19++;
                i11 = i16;
                i12 = i15;
            } else {
                int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(m717constructorimpl);
                Placeable placeable = this.placeables[i16];
                if (placeable == null) {
                    i9 = m5551getMaxWidthimpl;
                    i10 = i18;
                    i11 = i16;
                    i12 = i15;
                    placeable = measurable.mo4545measureBRTryo0(OrientationIndependentConstraints.m730toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m719copyyUG9Ft0$default(m717constructorimpl, 0, m5551getMaxWidthimpl == Integer.MAX_VALUE ? Integer.MAX_VALUE : m5551getMaxWidthimpl - i20, 0, 0, 8, null), this.orientation));
                } else {
                    i9 = m5551getMaxWidthimpl;
                    i10 = i18;
                    i11 = i16;
                    i12 = i15;
                }
                int min = Math.min(i13, (i9 - i20) - mainAxisSize(placeable));
                i20 += mainAxisSize(placeable) + min;
                int max2 = Math.max(i10, crossAxisSize(placeable));
                int i22 = (i21 != 0 || RowColumnImplKt.isRelative(rowColumnParentData)) ? 1 : i12;
                this.placeables[i11] = placeable;
                i17 = min;
                i18 = max2;
                i21 = i22;
            }
            i16 = i11 + 1;
            i15 = i12;
            f = 0.0f;
        }
        int i23 = i15;
        int i24 = i18;
        if (i19 == 0) {
            i20 -= i17;
            i4 = i24;
            coerceAtMost = i23;
        } else {
            int i25 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i25 > 0 && Constraints.m5551getMaxWidthimpl(m717constructorimpl) != Integer.MAX_VALUE) {
                m5553getMinWidthimpl = Constraints.m5551getMaxWidthimpl(m717constructorimpl);
            } else {
                m5553getMinWidthimpl = Constraints.m5553getMinWidthimpl(m717constructorimpl);
            }
            int i26 = i13 * (i19 - 1);
            int i27 = (m5553getMinWidthimpl - i20) - i26;
            float f3 = i25 > 0 ? i27 / f2 : 0.0f;
            Iterator<Integer> it = RangesKt.until(i, i2).iterator();
            int i28 = i23;
            while (it.hasNext()) {
                i28 += MathKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f3);
            }
            int i29 = i27 - i28;
            int i30 = i;
            i4 = i24;
            int i31 = i23;
            while (i30 < i2) {
                if (this.placeables[i30] == null) {
                    Measurable measurable2 = this.measurables.get(i30);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i30];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if ((weight2 > 0.0f ? 1 : i23) == 0) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(i29);
                    int i32 = i29 - sign;
                    int max3 = Math.max(i23, MathKt.roundToInt(weight2 * f3) + sign);
                    if (!RowColumnImplKt.getFill(rowColumnParentData2) || max3 == i3) {
                        i5 = i23;
                        i6 = i32;
                    } else {
                        i6 = i32;
                        i5 = max3;
                    }
                    Placeable mo4545measureBRTryo0 = measurable2.mo4545measureBRTryo0(OrientationIndependentConstraints.m730toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m715constructorimpl(i5, max3, i23, Constraints.m5550getMaxHeightimpl(m717constructorimpl)), this.orientation));
                    i31 += mainAxisSize(mo4545measureBRTryo0);
                    i4 = Math.max(i4, crossAxisSize(mo4545measureBRTryo0));
                    int i33 = (i21 != 0 || RowColumnImplKt.isRelative(rowColumnParentData2)) ? 1 : i23;
                    this.placeables[i30] = mo4545measureBRTryo0;
                    i29 = i6;
                    i21 = i33;
                }
                i30++;
                i3 = Integer.MAX_VALUE;
            }
            coerceAtMost = RangesKt.coerceAtMost(i31 + i26, Constraints.m5551getMaxWidthimpl(m717constructorimpl) - i20);
        }
        if (i21 != 0) {
            int i34 = i23;
            int i35 = i34;
            for (int i36 = i; i36 < i2; i36++) {
                Placeable placeable2 = this.placeables[i36];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i36]);
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    Integer num = calculateAlignmentLinePosition$foundation_layout_release;
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i23;
                    }
                    i34 = Math.max(i34, intValue);
                    int crossAxisSize = crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i35 = Math.max(i35, crossAxisSize - intValue2);
                }
            }
            int i37 = i35;
            i8 = i34;
            i7 = i37;
        } else {
            i7 = i23;
            i8 = i7;
        }
        int max4 = Math.max(i20 + coerceAtMost, Constraints.m5553getMinWidthimpl(m717constructorimpl));
        if (Constraints.m5550getMaxHeightimpl(m717constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) {
            max = Math.max(i4, Math.max(Constraints.m5552getMinHeightimpl(m717constructorimpl), i7 + i8));
        } else {
            max = Constraints.m5550getMaxHeightimpl(m717constructorimpl);
        }
        int[] iArr = new int[i14];
        for (int i38 = i23; i38 < i14; i38++) {
            iArr[i38] = i23;
        }
        int[] iArr2 = new int[i14];
        for (int i39 = i23; i39 < i14; i39++) {
            Placeable placeable3 = this.placeables[i39 + i];
            Intrinsics.checkNotNull(placeable3);
            iArr2[i39] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(max, max4, i, i2, i8, mainAxisPositions(max4, iArr2, iArr, measureScope));
    }

    private final int[] mainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(i), iArr, measureScope.getLayoutDirection(), measureScope, iArr2);
        return iArr2;
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int crossAxisSize = i - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisSize, layoutDirection, placeable, i2);
    }

    public final void placeHelper(Placeable.PlacementScope placeableScope, RowColumnMeasureHelperResult measureResult, int i, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + i;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}

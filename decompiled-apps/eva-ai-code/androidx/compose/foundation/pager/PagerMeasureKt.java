package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000bH\u0002\u001a@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000bH\u0002\u001a\u0017\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082\b\u001a\u008c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002\u001am\u0010\n\u001a\u00020\u0004*\u00020\u00152\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001aä\u0001\u00104\u001a\u000205*\u00020\u00152\u0006\u00106\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032/\u0010?\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\bB\u0012\u0004\u0012\u00020C0@H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, d2 = {OkHttpClientProviderKt.DEBUG_KEY, "", "createPagesAfterList", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "currentLastPage", "", "pagesCount", "beyondBoundsPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", FirebaseAnalytics.Param.INDEX, "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "pageCount", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "firstVisiblePage", "firstVisiblePageOffset", "scrollToBeConsumed", "", "constraints", TtmlNode.TAG_LAYOUT, "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-ntgEbfI", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIFJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    private static final boolean DEBUG = false;

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* renamed from: measurePager-ntgEbfI  reason: not valid java name */
    public static final PagerMeasureResult m973measurePagerntgEbfI(LazyLayoutMeasureScope measurePager, int i, PagerLazyLayoutItemProvider pagerItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, Orientation orientation, Alignment.Vertical vertical, Alignment.Horizontal horizontal, boolean z, long j2, int i8, int i9, List<Integer> pinnedPages, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i10;
        int i11;
        int i12;
        ArrayDeque arrayDeque;
        int i13;
        ArrayDeque arrayDeque2;
        int i14;
        int i15;
        int i16;
        ArrayDeque arrayDeque3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        MeasuredPage measuredPage;
        int i24;
        int i25;
        long j3;
        ArrayList arrayList;
        boolean z2;
        MeasuredPage measuredPage2;
        int i26;
        int i27;
        ArrayDeque arrayDeque4;
        int i28;
        Intrinsics.checkNotNullParameter(measurePager, "$this$measurePager");
        Intrinsics.checkNotNullParameter(pagerItemProvider, "pagerItemProvider");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(pinnedPages, "pinnedPages");
        Intrinsics.checkNotNullParameter(layout, "layout");
        int i29 = 0;
        if (i3 >= 0) {
            if (!(i4 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int coerceAtLeast = RangesKt.coerceAtLeast(i8 + i5, 0);
            if (i <= 0) {
                return new PagerMeasureResult(CollectionsKt.emptyList(), 0, i8, i5, i4, orientation, -i3, i2 + i4, false, 0.0f, null, null, 0, false, layout.invoke(Integer.valueOf(Constraints.m5553getMinWidthimpl(j)), Integer.valueOf(Constraints.m5552getMinHeightimpl(j)), PagerMeasureKt$measurePager$2.INSTANCE));
            }
            long Constraints$default = ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m5551getMaxWidthimpl(j) : i8, 0, orientation != Orientation.Vertical ? Constraints.m5550getMaxHeightimpl(j) : i8, 5, null);
            int i30 = i6;
            if (i30 >= i) {
                i30 = i - 1;
                i10 = 0;
            } else {
                i10 = i7;
            }
            int roundToInt = MathKt.roundToInt(f);
            int i31 = i10 - roundToInt;
            if (i30 == 0 && i31 < 0) {
                roundToInt += i31;
                i31 = 0;
            }
            ArrayDeque arrayDeque5 = new ArrayDeque();
            int i32 = -i3;
            int i33 = i32 + (i5 < 0 ? i5 : 0);
            int i34 = i31 + i33;
            int i35 = 0;
            while (i34 < 0 && i30 > 0) {
                int i36 = i30 - 1;
                int i37 = i33;
                int i38 = coerceAtLeast;
                int i39 = i29;
                MeasuredPage m972getAndMeasureSGf7dI0 = m972getAndMeasureSGf7dI0(measurePager, i36, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                arrayDeque5.add(i39, m972getAndMeasureSGf7dI0);
                i35 = Math.max(i35, m972getAndMeasureSGf7dI0.getCrossAxisSize());
                i34 += i38;
                coerceAtLeast = i38;
                i29 = i39;
                i30 = i36;
                i33 = i37;
            }
            int i40 = coerceAtLeast;
            int i41 = i33;
            int i42 = i29;
            int i43 = i34;
            if (i43 < i41) {
                roundToInt += i43;
                i43 = i41;
            }
            int i44 = i43 - i41;
            int i45 = i2;
            int i46 = i41;
            int i47 = i45 + i4;
            int coerceAtLeast2 = RangesKt.coerceAtLeast(i47, i42);
            int i48 = -i44;
            ArrayDeque arrayDeque6 = arrayDeque5;
            int size = arrayDeque6.size();
            int i49 = i30;
            for (int i50 = i42; i50 < size; i50++) {
                MeasuredPage measuredPage3 = (MeasuredPage) arrayDeque6.get(i50);
                i49++;
                i48 += i40;
            }
            int i51 = i49;
            int i52 = i35;
            int i53 = i30;
            int i54 = i48;
            int i55 = i44;
            int i56 = i;
            while (true) {
                if (i51 >= i56) {
                    i11 = i52;
                    i12 = i51;
                    arrayDeque = arrayDeque6;
                    i13 = i47;
                    arrayDeque2 = arrayDeque5;
                    i14 = i53;
                    i15 = i54;
                    i16 = i2;
                    break;
                } else if (i54 >= coerceAtLeast2 && i54 > 0 && !arrayDeque5.isEmpty()) {
                    i11 = i52;
                    arrayDeque = arrayDeque6;
                    i13 = i47;
                    arrayDeque2 = arrayDeque5;
                    i14 = i53;
                    i15 = i54;
                    i16 = i45;
                    i12 = i51;
                    break;
                } else {
                    int i57 = i53;
                    int i58 = i52;
                    ArrayDeque arrayDeque7 = arrayDeque5;
                    int i59 = i51;
                    ArrayDeque arrayDeque8 = arrayDeque6;
                    int i60 = coerceAtLeast2;
                    int i61 = i47;
                    int i62 = i46;
                    int i63 = i40;
                    MeasuredPage m972getAndMeasureSGf7dI02 = m972getAndMeasureSGf7dI0(measurePager, i51, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                    i54 += i63;
                    if (i54 <= i62) {
                        i40 = i63;
                        i27 = i;
                        i26 = i59;
                        if (i26 != i27 - 1) {
                            i28 = i26 + 1;
                            i55 -= i40;
                            arrayDeque4 = arrayDeque7;
                            i52 = i58;
                            int i64 = i26 + 1;
                            i45 = i2;
                            arrayDeque5 = arrayDeque4;
                            i46 = i62;
                            i56 = i27;
                            arrayDeque6 = arrayDeque8;
                            coerceAtLeast2 = i60;
                            i47 = i61;
                            i53 = i28;
                            i51 = i64;
                        }
                    } else {
                        i40 = i63;
                        i26 = i59;
                        i27 = i;
                    }
                    int max = Math.max(i58, m972getAndMeasureSGf7dI02.getCrossAxisSize());
                    arrayDeque4 = arrayDeque7;
                    arrayDeque4.add(m972getAndMeasureSGf7dI02);
                    i28 = i57;
                    i52 = max;
                    int i642 = i26 + 1;
                    i45 = i2;
                    arrayDeque5 = arrayDeque4;
                    i46 = i62;
                    i56 = i27;
                    arrayDeque6 = arrayDeque8;
                    coerceAtLeast2 = i60;
                    i47 = i61;
                    i53 = i28;
                    i51 = i642;
                }
            }
            if (i15 < i16) {
                int i65 = i16 - i15;
                int i66 = i15 + i65;
                int i67 = i3;
                int i68 = i14;
                int i69 = i11;
                int i70 = i55 - i65;
                while (i70 < i67 && i68 > 0) {
                    int i71 = i68 - 1;
                    ArrayDeque arrayDeque9 = arrayDeque2;
                    int i72 = i66;
                    int i73 = i40;
                    MeasuredPage m972getAndMeasureSGf7dI03 = m972getAndMeasureSGf7dI0(measurePager, i71, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                    arrayDeque9.add(0, m972getAndMeasureSGf7dI03);
                    i69 = Math.max(i69, m972getAndMeasureSGf7dI03.getCrossAxisSize());
                    i70 += i73;
                    i67 = i3;
                    i40 = i73;
                    arrayDeque2 = arrayDeque9;
                    i68 = i71;
                    i12 = i12;
                    i66 = i72;
                }
                i21 = i69;
                int i74 = i70;
                arrayDeque3 = arrayDeque2;
                i17 = i12;
                int i75 = i66;
                i18 = i40;
                int i76 = roundToInt + i65;
                if (i74 < 0) {
                    i19 = i68;
                    i20 = i75 + i74;
                    i22 = i76 + i74;
                    i23 = 0;
                } else {
                    i20 = i75;
                    i19 = i68;
                    i22 = i76;
                    i23 = i74;
                }
            } else {
                arrayDeque3 = arrayDeque2;
                i17 = i12;
                int i77 = i15;
                i18 = i40;
                i19 = i14;
                i20 = i77;
                i21 = i11;
                i22 = roundToInt;
                i23 = i55;
            }
            float f2 = (MathKt.getSign(MathKt.roundToInt(f)) != MathKt.getSign(i22) || Math.abs(MathKt.roundToInt(f)) < Math.abs(i22)) ? f : i22;
            if (!(i23 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i78 = -i23;
            MeasuredPage measuredPage4 = (MeasuredPage) arrayDeque3.first();
            if (i3 > 0 || i5 < 0) {
                int size2 = arrayDeque3.size();
                int i79 = i23;
                int i80 = 0;
                while (i80 < size2 && i79 != 0 && i18 <= i79 && i80 != CollectionsKt.getLastIndex(arrayDeque)) {
                    i79 -= i18;
                    i80++;
                    measuredPage4 = (MeasuredPage) arrayDeque3.get(i80);
                }
                measuredPage = measuredPage4;
                i24 = i79;
            } else {
                measuredPage = measuredPage4;
                i24 = i23;
            }
            int i81 = i21;
            List<MeasuredPage> createPagesBeforeList = createPagesBeforeList(i19, i9, pinnedPages, new PagerMeasureKt$measurePager$extraPagesBefore$1(measurePager, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, z, i8));
            int size3 = createPagesBeforeList.size();
            int i82 = i81;
            for (int i83 = 0; i83 < size3; i83++) {
                i82 = Math.max(i82, createPagesBeforeList.get(i83).getCrossAxisSize());
            }
            ArrayDeque arrayDeque10 = arrayDeque3;
            int i84 = i20;
            List<MeasuredPage> createPagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque3.last()).getIndex(), i, i9, pinnedPages, new PagerMeasureKt$measurePager$extraPagesAfter$1(measurePager, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, z, i8));
            int size4 = createPagesAfterList.size();
            int i85 = i82;
            for (int i86 = 0; i86 < size4; i86++) {
                i85 = Math.max(i85, createPagesAfterList.get(i86).getCrossAxisSize());
            }
            boolean z3 = Intrinsics.areEqual(measuredPage, arrayDeque10.first()) && createPagesBeforeList.isEmpty() && createPagesAfterList.isEmpty();
            if (orientation == Orientation.Vertical) {
                j3 = j;
                i25 = i85;
            } else {
                i25 = i84;
                j3 = j;
            }
            int m5565constrainWidthK40F9xA = ConstraintsKt.m5565constrainWidthK40F9xA(j3, i25);
            if (orientation == Orientation.Vertical) {
                i85 = i84;
            }
            int m5564constrainHeightK40F9xA = ConstraintsKt.m5564constrainHeightK40F9xA(j3, i85);
            LazyLayoutMeasureScope lazyLayoutMeasureScope = measurePager;
            MeasuredPage measuredPage5 = measuredPage;
            List<MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(measurePager, arrayDeque, createPagesBeforeList, createPagesAfterList, m5565constrainWidthK40F9xA, m5564constrainHeightK40F9xA, i84, i2, i78, orientation, z, lazyLayoutMeasureScope, i5, i8);
            if (z3) {
                arrayList = calculatePagesOffsets;
            } else {
                ArrayList arrayList2 = new ArrayList(calculatePagesOffsets.size());
                int size5 = calculatePagesOffsets.size();
                for (int i87 = 0; i87 < size5; i87++) {
                    MeasuredPage measuredPage6 = calculatePagesOffsets.get(i87);
                    MeasuredPage measuredPage7 = measuredPage6;
                    if (measuredPage7.getIndex() >= ((MeasuredPage) arrayDeque10.first()).getIndex() && measuredPage7.getIndex() <= ((MeasuredPage) arrayDeque10.last()).getIndex()) {
                        arrayList2.add(measuredPage6);
                    }
                }
                arrayList = arrayList2;
            }
            int i88 = orientation == Orientation.Vertical ? m5564constrainHeightK40F9xA : m5565constrainWidthK40F9xA;
            if (arrayList.isEmpty()) {
                measuredPage2 = null;
                z2 = true;
            } else {
                MeasuredPage measuredPage8 = arrayList.get(0);
                MeasuredPage measuredPage9 = measuredPage8;
                float f3 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(lazyLayoutMeasureScope, i88, i3, i4, i8, measuredPage9.getOffset(), measuredPage9.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                z2 = true;
                if (1 <= lastIndex) {
                    MeasuredPage measuredPage10 = measuredPage8;
                    int i89 = 1;
                    float f4 = f3;
                    while (true) {
                        MeasuredPage measuredPage11 = arrayList.get(i89);
                        MeasuredPage measuredPage12 = measuredPage11;
                        int i90 = i89;
                        float f5 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(lazyLayoutMeasureScope, i88, i3, i4, i8, measuredPage12.getOffset(), measuredPage12.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                        if (Float.compare(f4, f5) < 0) {
                            f4 = f5;
                            measuredPage10 = measuredPage11;
                        }
                        if (i90 == lastIndex) {
                            break;
                        }
                        i89 = i90 + 1;
                    }
                    measuredPage2 = measuredPage10;
                } else {
                    measuredPage2 = measuredPage8;
                }
            }
            MeasuredPage measuredPage13 = measuredPage2;
            MeasureResult invoke = layout.invoke(Integer.valueOf(m5565constrainWidthK40F9xA), Integer.valueOf(m5564constrainHeightK40F9xA), new PagerMeasureKt$measurePager$6(calculatePagesOffsets));
            if (i17 >= i && i84 <= i2) {
                z2 = false;
            }
            return new PagerMeasureResult(arrayList, i, i8, i5, i4, orientation, i32, i13, z, f2, measuredPage5, measuredPage13, i24, z2, invoke);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i2, int i3, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int min = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = list.get(i5).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i2, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0  reason: not valid java name */
    public static final MeasuredPage m972getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2) {
        return new MeasuredPage(i, i2, lazyLayoutMeasureScope.mo906measure0kLqBqw(i, j), j2, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z, null);
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, Density density, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i7 + i6;
        if (orientation == Orientation.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = true;
        boolean z3 = i3 < Math.min(i9, i8);
        if (z3) {
            if (!(i5 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!((list2.isEmpty() && list3.isEmpty()) ? false : false)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = i7;
            }
            int[] iArr2 = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr2[i12] = 0;
            }
            Arrangement.HorizontalOrVertical m658spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m658spacedBy0680j_4(lazyLayoutMeasureScope.mo585toDpu2uoSUM(i7));
            if (orientation == Orientation.Vertical) {
                m658spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
            } else {
                m658spacedBy0680j_4.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i13 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z, size));
                    if (z) {
                        i13 = (i9 - i13) - measuredPage.getSize();
                    }
                    measuredPage.position(i13, i, i2);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size2; i15++) {
                MeasuredPage measuredPage2 = list2.get(i15);
                i14 -= i10;
                measuredPage2.position(i14, i, i2);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            int i16 = i5;
            for (int i17 = 0; i17 < size3; i17++) {
                MeasuredPage measuredPage3 = list.get(i17);
                measuredPage3.position(i16, i, i2);
                arrayList.add(measuredPage3);
                i16 += i10;
            }
            int size4 = list3.size();
            for (int i18 = 0; i18 < size4; i18++) {
                MeasuredPage measuredPage4 = list3.get(i18);
                measuredPage4.position(i16, i, i2);
                arrayList.add(measuredPage4);
                i16 += i10;
            }
        }
        return arrayList;
    }
}

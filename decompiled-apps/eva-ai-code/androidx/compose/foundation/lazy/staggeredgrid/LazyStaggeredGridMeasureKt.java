package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000eH\u0083\b\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u001cH\u0002¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\u00020\u0005*\u00020\u00142\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0003H\u0002\u001a\u001c\u0010'\u001a\u00020\u0003*\u00020\u00142\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0002\u001a.\u0010*\u001a\u00020\u0005*\u00020+2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\f\u0010.\u001a\u00020\u0003*\u00020\u001fH\u0002\u001a2\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00100\u001a\u0016\u00101\u001a\u00020\u0003*\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u0003H\u0000\u001a!\u00103\u001a\u00020\u0003*\u00020\u001f2\u0006\u00104\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a,\u00107\u001a\u000208*\u00020\u00142\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0001H\u0003\u001a\u007f\u0010=\u001a\u000208*\u00020\f2\u0006\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010R\u001a\u00020\u0003H\u0002\u001a!\u0010S\u001a\u00020\u001f*\u00020\u001f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006T"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "measureStaggeredGrid-dSVRQoE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureStaggeredGrid-dSVRQoE  reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m940measureStaggeredGriddSVRQoE(LazyLayoutMeasureScope measureStaggeredGrid, LazyStaggeredGridState state, List<Integer> pinnedItems, LazyStaggeredGridItemProvider itemProvider, LazyStaggeredGridSlots resolvedSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4) {
        T t;
        int m939maxInRangejy6DScQ;
        T t2;
        int i5;
        Intrinsics.checkNotNullParameter(measureStaggeredGrid, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, pinnedItems, itemProvider, resolvedSlots, j, z, measureStaggeredGrid, i, j2, i3, i4, z2, i2, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(itemProvider, state.getScrollPosition$foundation_release().getIndices());
            int[] offsets = state.getScrollPosition$foundation_release().getOffsets();
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                t = updateScrollPositionIfTheFirstItemWasMoved$foundation_release;
            } else {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                int[] iArr = new int[laneCount];
                int i6 = 0;
                while (i6 < laneCount) {
                    if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m939maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                        m939maxInRangejy6DScQ = i6 == 0 ? 0 : m939maxInRangejy6DScQ(iArr, SpanRange.m949constructorimpl(0, i6)) + 1;
                    }
                    iArr[i6] = m939maxInRangejy6DScQ;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                    i6++;
                }
                t = iArr;
            }
            objectRef.element = t;
            if (offsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                t2 = offsets;
            } else {
                int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                int[] iArr2 = new int[laneCount2];
                int i7 = 0;
                while (i7 < laneCount2) {
                    if (i7 < offsets.length) {
                        i5 = offsets[i7];
                    } else {
                        i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                    }
                    iArr2[i7] = i5;
                    i7++;
                }
                t2 = iArr2;
            }
            objectRef2.element = t2;
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            return measure(lazyStaggeredGridMeasureContext, MathKt.roundToInt(state.getScrollToBeConsumed$foundation_release()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x0564, code lost:
        if (r7[r11] > r8) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0651  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        int[] iArr3;
        boolean z3;
        boolean z4;
        int i5;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i6;
        int i7;
        int m5565constrainWidthK40F9xA;
        int m5550getMaxHeightimpl;
        boolean z5;
        boolean z6;
        boolean z7;
        int[] iArr7;
        List<Integer> list;
        int i8;
        boolean z8;
        boolean z9;
        int i9;
        int[] iArr8;
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        int[] iArr9;
        int[] iArr10;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        int i17 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.CC.layout$default(measureScope, Constraints.m5553getMinWidthimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk()), Constraints.m5552getMinHeightimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk()), null, LazyStaggeredGridMeasureKt$measure$1$1.INSTANCE, 4, null), false, false, lazyStaggeredGridMeasureContext.isVertical(), itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m5553getMinWidthimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk()), Constraints.m5552getMinHeightimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str2 = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, copyOf, itemCount);
        offsetBy(copyOf2, -i17);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i18 = 0; i18 < laneCount; i18++) {
            arrayDequeArr[i18] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext2)) {
                i2 = -1;
                break;
            }
            i2 = indexOfMaxValue(copyOf);
            int i19 = copyOf[i2];
            int length = copyOf2.length;
            for (int i20 = 0; i20 < length; i20++) {
                if (copyOf[i20] != copyOf[i2]) {
                    int i21 = copyOf2[i20];
                    int i22 = copyOf2[i2];
                    if (i21 < i22) {
                        copyOf2[i20] = i22;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i19, i2);
            if (findPreviousItemIndex < 0) {
                break;
            }
            long m936getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex, i2);
            int i23 = (int) (4294967295L & m936getSpanRangelOCCd4c);
            int i24 = (int) (m936getSpanRangelOCCd4c >> 32);
            int i25 = i23 - i24;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex, i25 != 1 ? -2 : i24);
            LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(findPreviousItemIndex, m936getSpanRangelOCCd4c);
            int m939maxInRangejy6DScQ = m939maxInRangejy6DScQ(copyOf2, m936getSpanRangelOCCd4c);
            int[] gaps = i25 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            for (int i26 = i24; i26 < i23; i26++) {
                copyOf[i26] = findPreviousItemIndex;
                copyOf2[i26] = m939maxInRangejy6DScQ + m944getAndMeasurejy6DScQ.getSizeWithSpacings() + (gaps == null ? 0 : gaps[i26]);
            }
        }
        int i27 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i28 = copyOf2[0];
        if (i28 < i27) {
            i17 += i28;
            offsetBy(copyOf2, i27 - i28);
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i29 = -1;
        if (i2 == -1) {
            i2 = ArraysKt.indexOf(copyOf, 0);
        }
        if (i2 != -1 && measure$lambda$38$misalignedStart(copyOf, lazyStaggeredGridMeasureContext2, copyOf2, i2) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr11 = new int[length2];
            int i30 = 0;
            while (i30 < length2) {
                iArr11[i30] = i29;
                i30++;
                i29 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr12 = new int[length3];
            for (int i31 = 0; i31 < length3; i31++) {
                iArr12[i31] = copyOf2[i2];
            }
            return measure(lazyStaggeredGridMeasureContext2, i17, iArr11, iArr12, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, size)");
        int length4 = copyOf2.length;
        int[] iArr13 = new int[length4];
        for (int i32 = 0; i32 < length4; i32++) {
            iArr13[i32] = -copyOf2[i32];
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i33 = 0;
        while (indexOfMinValue$default != -1 && i33 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i34 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i34);
            int i35 = i33 + 1;
            if (i34 >= 0) {
                i16 = i35;
                str = str2;
                long m936getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i34, indexOfMinValue$default);
                LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(i34, m936getSpanRangelOCCd4c2);
                i13 = i17;
                iArr9 = copyOf;
                iArr10 = copyOf2;
                int i36 = (int) (m936getSpanRangelOCCd4c2 & 4294967295L);
                i14 = coerceAtLeast;
                i15 = i27;
                int i37 = (int) (m936getSpanRangelOCCd4c2 >> 32);
                int i38 = i36 - i37;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i34, i38 != 1 ? -2 : i37);
                int m939maxInRangejy6DScQ2 = m939maxInRangejy6DScQ(iArr13, m936getSpanRangelOCCd4c2) + m944getAndMeasurejy6DScQ2.getSizeWithSpacings();
                for (int i39 = i37; i39 < i36; i39++) {
                    iArr13[i39] = m939maxInRangejy6DScQ2;
                    copyOf3[i39] = i34;
                    arrayDequeArr[i39].addLast(m944getAndMeasurejy6DScQ2);
                }
                if (iArr13[i37] <= i15 + lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
                    m944getAndMeasurejy6DScQ2.setVisible(false);
                }
                if (i38 != 1) {
                    i33 = lazyStaggeredGridMeasureContext.getLaneCount();
                    coerceAtLeast = i14;
                    indexOfMinValue$default = indexOfMinValue;
                    str2 = str;
                    i17 = i13;
                    copyOf = iArr9;
                    copyOf2 = iArr10;
                    i27 = i15;
                }
            } else {
                i13 = i17;
                i14 = coerceAtLeast;
                i15 = i27;
                i16 = i35;
                str = str2;
                iArr9 = copyOf;
                iArr10 = copyOf2;
            }
            i33 = i16;
            coerceAtLeast = i14;
            indexOfMinValue$default = indexOfMinValue;
            str2 = str;
            i17 = i13;
            copyOf = iArr9;
            copyOf2 = iArr10;
            i27 = i15;
        }
        int i40 = i17;
        int i41 = coerceAtLeast;
        int i42 = i27;
        String str3 = str2;
        int[] iArr14 = copyOf;
        int[] iArr15 = copyOf2;
        while (true) {
            int i43 = 0;
            while (true) {
                if (i43 >= length4) {
                    i3 = i41;
                    z2 = false;
                    break;
                }
                int i44 = iArr13[i43];
                i3 = i41;
                if (i44 < i3 || i44 <= 0) {
                    z2 = true;
                    break;
                }
                i43++;
                i41 = i3;
            }
            if (!z2) {
                int i45 = 0;
                while (true) {
                    if (i45 >= laneCount) {
                        z11 = true;
                        break;
                    } else if (!arrayDequeArr[i45].isEmpty()) {
                        z11 = false;
                        break;
                    } else {
                        i45++;
                    }
                }
                if (!z11) {
                    i4 = 1;
                    break;
                }
            }
            i4 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr13, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            if (maxOrThrow >= itemCount) {
                break;
            }
            i41 = i3;
            int i46 = length4;
            String str4 = str3;
            int i47 = i40;
            int[] iArr16 = iArr14;
            int[] iArr17 = iArr13;
            long m936getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i48 = (int) (m936getSpanRangelOCCd4c3 & 4294967295L);
            int i49 = (int) (m936getSpanRangelOCCd4c3 >> 32);
            int i50 = i48 - i49;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i50 != 1 ? -2 : i49);
            LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(maxOrThrow, m936getSpanRangelOCCd4c3);
            int m939maxInRangejy6DScQ3 = m939maxInRangejy6DScQ(iArr17, m936getSpanRangelOCCd4c3);
            if (i50 != 1) {
                iArr3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr3 == null) {
                    iArr3 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr3 = null;
            }
            for (int i51 = i49; i51 < i48; i51++) {
                if (iArr3 != null) {
                    iArr3[i51] = m939maxInRangejy6DScQ3 - iArr17[i51];
                }
                copyOf3[i51] = maxOrThrow;
                iArr17[i51] = m939maxInRangejy6DScQ3 + m944getAndMeasurejy6DScQ3.getSizeWithSpacings();
                arrayDequeArr[i51].addLast(m944getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr3);
            if (iArr17[i49] <= i42 + lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
                m944getAndMeasurejy6DScQ3.setVisible(false);
            }
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            iArr13 = iArr17;
            str3 = str4;
            iArr14 = iArr16;
            length4 = i46;
            i40 = i47;
        }
        int i52 = 0;
        while (i52 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr[i52];
            while (arrayDeque.size() > i4 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).isVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i4 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr15[i52] = iArr15[i52] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i52]));
                i4 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr14[i52] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i52++;
            i4 = 1;
        }
        int length5 = copyOf3.length;
        int i53 = 0;
        while (true) {
            if (i53 >= length5) {
                z3 = false;
                break;
            }
            if (copyOf3[i53] == itemCount + (-1)) {
                z3 = true;
                break;
            }
            i53++;
        }
        if (z3) {
            offsetBy(iArr13, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
        }
        int i54 = 0;
        while (true) {
            if (i54 >= length4) {
                z4 = true;
                break;
            }
            if (!(iArr13[i54] < lazyStaggeredGridMeasureContext.getMainAxisAvailableSize())) {
                z4 = false;
                break;
            }
            i54++;
        }
        if (z4) {
            int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr13[indexOfMaxValue(iArr13)];
            iArr6 = iArr15;
            offsetBy(iArr6, -mainAxisAvailableSize);
            offsetBy(iArr13, mainAxisAvailableSize);
            boolean z12 = false;
            while (true) {
                int length6 = iArr6.length;
                int i55 = 0;
                while (true) {
                    if (i55 >= length6) {
                        z10 = false;
                        break;
                    }
                    if (iArr6[i55] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                        z10 = true;
                        break;
                    }
                    i55++;
                }
                if (!z10) {
                    i5 = i3;
                    iArr4 = copyOf3;
                    i11 = i40;
                    iArr5 = iArr14;
                    i12 = mainAxisAvailableSize;
                    break;
                }
                int indexOfMinValue$default3 = indexOfMinValue$default(iArr6, 0, 1, null);
                if (indexOfMinValue$default3 != indexOfMaxValue(iArr14)) {
                    z12 = true;
                }
                int i56 = iArr14[indexOfMinValue$default3];
                if (i56 == -1) {
                    i56 = itemCount;
                }
                int findPreviousItemIndex2 = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i56, indexOfMinValue$default3);
                if (findPreviousItemIndex2 < 0) {
                    iArr5 = iArr14;
                    if ((z12 || measure$lambda$38$misalignedStart(iArr5, lazyStaggeredGridMeasureContext2, iArr6, indexOfMinValue$default3)) && z) {
                        lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                        int length7 = iArr5.length;
                        int[] iArr18 = new int[length7];
                        for (int i57 = 0; i57 < length7; i57++) {
                            iArr18[i57] = -1;
                        }
                        int length8 = iArr6.length;
                        int[] iArr19 = new int[length8];
                        for (int i58 = 0; i58 < length8; i58++) {
                            iArr19[i58] = iArr6[indexOfMinValue$default3];
                        }
                        return measure(lazyStaggeredGridMeasureContext2, i40, iArr18, iArr19, false);
                    }
                    i11 = i40;
                    i12 = mainAxisAvailableSize;
                    i5 = i3;
                    iArr4 = copyOf3;
                } else {
                    int i59 = i40;
                    int[] iArr20 = iArr14;
                    long m936getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex2, indexOfMinValue$default3);
                    boolean z13 = z12;
                    int[] iArr21 = copyOf3;
                    int i60 = length4;
                    int i61 = (int) (m936getSpanRangelOCCd4c4 & 4294967295L);
                    int i62 = mainAxisAvailableSize;
                    int i63 = i3;
                    int i64 = (int) (m936getSpanRangelOCCd4c4 >> 32);
                    int i65 = i61 - i64;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex2, i65 != 1 ? -2 : i64);
                    LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(findPreviousItemIndex2, m936getSpanRangelOCCd4c4);
                    int m939maxInRangejy6DScQ4 = m939maxInRangejy6DScQ(iArr6, m936getSpanRangelOCCd4c4);
                    int[] gaps3 = i65 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex2) : null;
                    boolean z14 = z13;
                    for (int i66 = i64; i66 < i61; i66++) {
                        if (iArr6[i66] != m939maxInRangejy6DScQ4) {
                            z14 = true;
                        }
                        arrayDequeArr[i66].addFirst(m944getAndMeasurejy6DScQ4);
                        iArr20[i66] = findPreviousItemIndex2;
                        iArr6[i66] = m939maxInRangejy6DScQ4 + m944getAndMeasurejy6DScQ4.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i66]);
                    }
                    i3 = i63;
                    z12 = z14;
                    copyOf3 = iArr21;
                    length4 = i60;
                    mainAxisAvailableSize = i62;
                    iArr14 = iArr20;
                    i40 = i59;
                }
            }
            i6 = length4;
            if (z12 && z) {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                return measure(lazyStaggeredGridMeasureContext2, i11, iArr5, iArr6, false);
            }
            int i67 = i11 + i12;
            int i68 = iArr6[indexOfMinValue$default(iArr6, 0, 1, null)];
            if (i68 < 0) {
                i67 += i68;
                offsetBy(iArr13, i68);
                offsetBy(iArr6, -i68);
            }
            i7 = i67;
        } else {
            i5 = i3;
            iArr4 = copyOf3;
            int i69 = i40;
            iArr5 = iArr14;
            iArr6 = iArr15;
            i6 = length4;
            i7 = i69;
        }
        float scrollToBeConsumed$foundation_release = (MathKt.getSign(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed$foundation_release())) != MathKt.getSign(i7) || Math.abs(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed$foundation_release())) < Math.abs(i7)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed$foundation_release() : i7;
        int[] copyOf4 = Arrays.copyOf(iArr6, iArr6.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str3);
        int length9 = copyOf4.length;
        for (int i70 = 0; i70 < length9; i70++) {
            copyOf4[i70] = -copyOf4[i70];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i71 = 0; i71 < laneCount; i71++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i71];
                int size = arrayDeque2.size();
                int i72 = 0;
                while (i72 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i72);
                    int[] gaps4 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps4 == null ? 0 : gaps4[i71]);
                    if (i72 != CollectionsKt.getLastIndex(arrayDeque2) && (i10 = iArr6[i71]) != 0 && i10 >= sizeWithSpacings) {
                        iArr6[i71] = i10 - sizeWithSpacings;
                        i72++;
                        iArr5[i71] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i72)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.isVertical()) {
            m5565constrainWidthK40F9xA = Constraints.m5551getMaxWidthimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk());
        } else {
            m5565constrainWidthK40F9xA = ConstraintsKt.m5565constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk(), ArraysKt.maxOrThrow(iArr13) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.isVertical()) {
            m5550getMaxHeightimpl = ConstraintsKt.m5564constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk(), ArraysKt.maxOrThrow(iArr13) + beforeContentPadding);
        } else {
            m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(lazyStaggeredGridMeasureContext.m933getConstraintsmsEJaDk());
        }
        int min = (Math.min(lazyStaggeredGridMeasureContext.isVertical() ? m5550getMaxHeightimpl : m5565constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i73 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size();
        int i74 = 0;
        ArrayList arrayList = null;
        while (i74 < size2) {
            List<Integer> list2 = pinnedItems;
            int intValue = pinnedItems.get(i74).intValue();
            int i75 = size2;
            int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
            int[] iArr22 = iArr13;
            if (lane == -2 || lane == -1) {
                int length10 = iArr5.length;
                int i76 = 0;
                while (i76 < length10) {
                    int i77 = length10;
                    if (!(iArr5[i76] > intValue)) {
                        z9 = false;
                        break;
                    }
                    i76++;
                    length10 = i77;
                }
                z9 = true;
            }
            if (z9) {
                i9 = m5550getMaxHeightimpl;
                iArr8 = iArr6;
                long m936getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(intValue, m936getSpanRangelOCCd4c5);
                i73 -= m944getAndMeasurejy6DScQ5.getSizeWithSpacings();
                m944getAndMeasurejy6DScQ5.position(i73, 0, min);
                arrayList.add(m944getAndMeasurejy6DScQ5);
            } else {
                i9 = m5550getMaxHeightimpl;
                iArr8 = iArr6;
            }
            i74++;
            pinnedItems = list2;
            size2 = i75;
            m5550getMaxHeightimpl = i9;
            iArr13 = iArr22;
            iArr6 = iArr8;
        }
        int i78 = m5550getMaxHeightimpl;
        int[] iArr23 = iArr6;
        int[] iArr24 = iArr13;
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, copyOf4, min);
        int i79 = copyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        ArrayList arrayList2 = null;
        int i80 = 0;
        while (i80 < size3) {
            int intValue2 = pinnedItems2.get(i80).intValue();
            if (intValue2 < itemCount) {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                if (lane2 != -2 && lane2 != -1) {
                    if (iArr4[lane2] < intValue2) {
                        list = pinnedItems2;
                        i8 = size3;
                        iArr7 = iArr4;
                    }
                } else {
                    iArr7 = iArr4;
                    int length11 = iArr7.length;
                    list = pinnedItems2;
                    int i81 = 0;
                    while (i81 < length11) {
                        i8 = size3;
                        if (!(iArr7[i81] < intValue2)) {
                            z8 = false;
                            break;
                        }
                        i81++;
                        size3 = i8;
                    }
                    i8 = size3;
                }
                z8 = true;
                if (z8) {
                    iArr4 = iArr7;
                } else {
                    iArr4 = iArr7;
                    long m936getSpanRangelOCCd4c6 = lazyStaggeredGridMeasureContext2.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(intValue2, m936getSpanRangelOCCd4c6);
                    m944getAndMeasurejy6DScQ6.position(i79, 0, min);
                    i79 += m944getAndMeasurejy6DScQ6.getSizeWithSpacings();
                    arrayList2.add(m944getAndMeasurejy6DScQ6);
                }
                i80++;
                pinnedItems2 = list;
                size3 = i8;
            }
            list = pinnedItems2;
            i8 = size3;
            iArr7 = iArr4;
            z8 = false;
            if (z8) {
            }
            i80++;
            pinnedItems2 = list;
            size3 = i8;
        }
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(calculateVisibleItems);
        arrayList3.addAll(arrayList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator$foundation_release().onMeasured((int) scrollToBeConsumed$foundation_release, m5565constrainWidthK40F9xA, i78, arrayList3, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.isVertical(), lazyStaggeredGridMeasureContext.getLaneCount());
        boolean z15 = iArr5[0] != 0 || iArr23[0] > 0;
        int i82 = i6;
        int i83 = 0;
        while (true) {
            if (i83 >= i82) {
                z5 = false;
                break;
            }
            if (iArr24[i83] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z5 = true;
                break;
            }
            i83++;
        }
        if (!z5) {
            int[] iArr25 = iArr4;
            int length12 = iArr25.length;
            int i84 = 0;
            while (true) {
                if (i84 >= length12) {
                    z7 = true;
                    break;
                }
                if (!(iArr25[i84] < itemCount + (-1))) {
                    z7 = false;
                    break;
                }
                i84++;
            }
            if (!z7) {
                z6 = false;
                return new LazyStaggeredGridMeasureResult(iArr5, iArr23, scrollToBeConsumed$foundation_release, MeasureScope.CC.layout$default(measureScope, m5565constrainWidthK40F9xA, i78, null, new LazyStaggeredGridMeasureKt$measure$1$29(arrayList3, lazyStaggeredGridMeasureContext2), 4, null), z6, z15, lazyStaggeredGridMeasureContext.isVertical(), itemCount, calculateVisibleItems, IntSizeKt.IntSize(m5565constrainWidthK40F9xA, i78), i42, i5, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
            }
        }
        z6 = true;
        return new LazyStaggeredGridMeasureResult(iArr5, iArr23, scrollToBeConsumed$foundation_release, MeasureScope.CC.layout$default(measureScope, m5565constrainWidthK40F9xA, i78, null, new LazyStaggeredGridMeasureKt$measure$1$29(arrayList3, lazyStaggeredGridMeasureContext2), 4, null), z6, z15, lazyStaggeredGridMeasureContext.isVertical(), itemCount, calculateVisibleItems, IntSizeKt.IntSize(m5565constrainWidthK40F9xA, i78), i42, i5, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        boolean z;
        int i2 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i2 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        while (true) {
            int length = arrayDequeArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                }
                z = true;
                if (!arrayDequeArr[i3].isEmpty()) {
                    break;
                }
                i3++;
            }
            if (!z) {
                return arrayList;
            }
            int length2 = arrayDequeArr.length;
            int i4 = -1;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < length2; i6++) {
                LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i6].firstOrNull();
                int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                if (i5 > index) {
                    i4 = i6;
                    i5 = index;
                }
            }
            LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i4].removeFirst();
            if (removeFirst.getLane() == i4) {
                long m949constructorimpl = SpanRange.m949constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                int m939maxInRangejy6DScQ = m939maxInRangejy6DScQ(iArr, m949constructorimpl);
                int i7 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i4];
                if (removeFirst.getPlaceablesCount() != 0) {
                    removeFirst.position(m939maxInRangejy6DScQ, i7, i);
                    arrayList.add(removeFirst);
                    int i8 = (int) (m949constructorimpl & 4294967295L);
                    for (int i9 = (int) (m949constructorimpl >> 32); i9 < i8; i9++) {
                        iArr[i9] = removeFirst.getSizeWithSpacings() + m939maxInRangejy6DScQ;
                    }
                }
            }
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int intValue = pinnedItems.get(i).intValue();
            if (function12.invoke(Integer.valueOf(intValue)).booleanValue()) {
                long m936getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m936getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m944getAndMeasurejy6DScQ(intValue, m936getSpanRangelOCCd4c);
                function1.invoke(m944getAndMeasurejy6DScQ);
                arrayList.add(m944getAndMeasurejy6DScQ);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8  reason: not valid java name */
    private static final void m938forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ  reason: not valid java name */
    private static final int m939maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            boolean z = true;
            int i5 = i + 1;
            int i6 = iArr[i4];
            if ((i5 > i6 || i6 >= i3) ? false : false) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                }
                iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            }
            length = i2;
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }
}

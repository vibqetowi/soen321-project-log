package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: LazyGridMeasuredItem.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0010\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J:\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003J.\u0010A\u001a\u00020\u0013*\u00020\u00132\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030CH\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010)\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019R\u001f\u00101\u001a\u000202X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010,\u001a\u0004\b3\u0010+R\u0019\u0010\u0012\u001a\u00020\u0013X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010,R\u001b\u00104\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u00106R\u0018\u0010#\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u00107\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", FirebaseAnalytics.Param.INDEX, "", "key", "", "isVertical", "", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "contentType", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "column", "getColumn", "()I", "getContentType", "()Ljava/lang/Object;", "crossAxisOffset", "getCrossAxisOffset", "getCrossAxisSize", "getIndex", "()Z", "getKey", "mainAxisLayoutSize", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "row", "getRow", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "getParentData", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "mainAxisOffset", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private int column;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object key, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> placeables, long j, Object obj) {
        long IntSize;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.index = i;
        this.key = key;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = placeables;
        this.visualOffset = j;
        this.contentType = obj;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = placeables.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) placeables.get(i7);
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i3 + i6, 0);
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i6);
        } else {
            IntSize = IntSizeKt.IntSize(i6, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m5735getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final Object getParentData(int i) {
        return this.placeables.get(i).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo881getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo880getOffsetnOccac() {
        return this.offset;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m5725getXimpl(mo880getOffsetnOccac()) : IntOffset.m5726getYimpl(mo880getOffsetnOccac());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        long IntOffset;
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.crossAxisSize;
        }
        if (this.isVertical) {
            IntOffset = IntOffsetKt.IntOffset(i2, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, i2);
        }
        this.offset = IntOffset;
        this.row = i5;
        this.column = i6;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void place(Placeable.PlacementScope scope) {
        int m5726getYimpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long mo880getOffsetnOccac = mo880getOffsetnOccac();
            Object parentData = getParentData(i);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long m893getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m893getPlacementDeltanOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(mo880getOffsetnOccac) + IntOffset.m5725getXimpl(m893getPlacementDeltanOccac), IntOffset.m5726getYimpl(mo880getOffsetnOccac) + IntOffset.m5726getYimpl(m893getPlacementDeltanOccac));
                if ((m885getMainAxisgyyYBs(mo880getOffsetnOccac) <= mainAxisSize && m885getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m885getMainAxisgyyYBs(mo880getOffsetnOccac) >= i2 && m885getMainAxisgyyYBs(IntOffset) >= i2)) {
                    lazyLayoutAnimateItemModifierNode.cancelAnimation();
                }
                mo880getOffsetnOccac = IntOffset;
            }
            if (this.reverseLayout) {
                int m5725getXimpl = this.isVertical ? IntOffset.m5725getXimpl(mo880getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m5725getXimpl(mo880getOffsetnOccac)) - getMainAxisSize(placeable);
                if (this.isVertical) {
                    m5726getYimpl = (this.mainAxisLayoutSize - IntOffset.m5726getYimpl(mo880getOffsetnOccac)) - getMainAxisSize(placeable);
                } else {
                    m5726getYimpl = IntOffset.m5726getYimpl(mo880getOffsetnOccac);
                }
                mo880getOffsetnOccac = IntOffsetKt.IntOffset(m5725getXimpl, m5726getYimpl);
            }
            long j = this.visualOffset;
            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(mo880getOffsetnOccac) + IntOffset.m5725getXimpl(j), IntOffset.m5726getYimpl(mo880getOffsetnOccac) + IntOffset.m5726getYimpl(j));
            if (this.isVertical) {
                Placeable.PlacementScope.m4607placeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
            } else {
                Placeable.PlacementScope.m4606placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m885getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m5726getYimpl(j) : IntOffset.m5725getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m884copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int m5725getXimpl = this.isVertical ? IntOffset.m5725getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m5725getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int m5726getYimpl = IntOffset.m5726getYimpl(j);
        if (z) {
            m5726getYimpl = function1.invoke(Integer.valueOf(m5726getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m5725getXimpl, m5726getYimpl);
    }
}

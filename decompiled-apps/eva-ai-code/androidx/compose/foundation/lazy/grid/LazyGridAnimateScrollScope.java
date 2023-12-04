package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyGridAnimateScrollScope.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001fJ:\u0010 \u001a\u00020!2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\u00020!*\u00020$2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "numOfItemsForTeleport", "getNumOfItemsForTeleport", "calculateLineAverageMainAxisSize", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "isVertical", "", "expectedDistanceTo", "", FirebaseAnalytics.Param.INDEX, "targetScrollOffset", "getTargetItemOffset", "(I)Ljava/lang/Integer;", "scroll", "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "scrollOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(LazyGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List<? extends Object>) this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int i) {
        LazyGridItemInfo lazyGridItemInfo;
        int m5725getXimpl;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i2);
            if (lazyGridItemInfo.getIndex() == i) {
                break;
            }
            i2++;
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 != null) {
            if (this.state.isVertical$foundation_release()) {
                m5725getXimpl = IntOffset.m5726getYimpl(lazyGridItemInfo2.mo880getOffsetnOccac());
            } else {
                m5725getXimpl = IntOffset.m5725getXimpl(lazyGridItemInfo2.mo880getOffsetnOccac());
            }
            return Integer.valueOf(m5725getXimpl);
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(ScrollScope scrollScope, int i, int i2) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        this.state.snapToItemIndexInternal$foundation_release(i, i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i, int i2) {
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int calculateLineAverageMainAxisSize = calculateLineAverageMainAxisSize(this.state.getLayoutInfo(), this.state.isVertical$foundation_release());
        int firstVisibleItemIndex = ((i - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * (i < getFirstVisibleItemIndex() ? -1 : 1))) / slotsPerLine$foundation_release;
        int min = Math.min(Math.abs(i2), calculateLineAverageMainAxisSize);
        if (i2 < 0) {
            min *= -1;
        }
        return ((calculateLineAverageMainAxisSize * firstVisibleItemIndex) + min) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getSlotsPerLine$foundation_release() * 100;
    }

    private final int calculateLineAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo, boolean z) {
        int m5767getWidthimpl;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 = new LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(z, visibleItemsInfo);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int intValue = lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke((LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1) Integer.valueOf(i)).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < visibleItemsInfo.size() && lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke((LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1) Integer.valueOf(i)).intValue() == intValue) {
                    if (z) {
                        m5767getWidthimpl = IntSize.m5766getHeightimpl(visibleItemsInfo.get(i).mo881getSizeYbymL2g());
                    } else {
                        m5767getWidthimpl = IntSize.m5767getWidthimpl(visibleItemsInfo.get(i).mo881getSizeYbymL2g());
                    }
                    i4 = Math.max(i4, m5767getWidthimpl);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return (i2 / i3) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object scroll$default = ScrollableState.CC.scroll$default(this.state, null, function2, continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }
}

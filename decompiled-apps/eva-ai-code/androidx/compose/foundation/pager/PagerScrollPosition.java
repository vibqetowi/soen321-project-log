package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PagerScrollPosition.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000b¨\u0006$"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "initialPage", "", "initialScrollOffset", "(II)V", "<set-?>", "currentPage", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "firstVisiblePage", "getFirstVisiblePage", "setFirstVisiblePage", "firstVisiblePage$delegate", "hadFirstNotEmptyLayout", "", "lastKnownFirstPageKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPosition", "", FirebaseAnalytics.Param.INDEX, "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerScrollPosition {
    private final MutableIntState currentPage$delegate;
    private final MutableIntState firstVisiblePage$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownFirstPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    public PagerScrollPosition() {
        this(0, 0, 3, null);
    }

    public PagerScrollPosition(int i, int i2) {
        this.firstVisiblePage$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisiblePage() {
        return this.firstVisiblePage$delegate.getIntValue();
    }

    public final void setFirstVisiblePage(int i) {
        this.firstVisiblePage$delegate.setIntValue(i);
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final void setCurrentPage(int i) {
        this.currentPage$delegate.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(PagerMeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        MeasuredPage firstVisiblePage = measureResult.getFirstVisiblePage();
        this.lastKnownFirstPageKey = firstVisiblePage != null ? firstVisiblePage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getPagesCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisiblePageOffset = measureResult.getFirstVisiblePageOffset();
            if (!(((float) firstVisiblePageOffset) >= 0.0f)) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisiblePageOffset + ')').toString());
            }
            MeasuredPage firstVisiblePage2 = measureResult.getFirstVisiblePage();
            update(firstVisiblePage2 != null ? firstVisiblePage2.getIndex() : 0, firstVisiblePageOffset);
            PageInfo closestPageToSnapPosition = measureResult.getClosestPageToSnapPosition();
            if (closestPageToSnapPosition != null) {
                setCurrentPage(closestPageToSnapPosition.getIndex());
            }
        }
    }

    public final void requestPosition(int i, int i2) {
        update(i, i2);
        this.lastKnownFirstPageKey = null;
    }

    private final void update(int i, int i2) {
        if (!(((float) i) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        setFirstVisiblePage(i);
        this.nearestRangeState.update(i);
        setScrollOffset(i2);
    }
}

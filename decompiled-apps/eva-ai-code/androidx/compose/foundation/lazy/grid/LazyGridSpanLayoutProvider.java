package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: LazyGridSpanLayoutProvider.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003()*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u0006H\u0002ø\u0001\u0000J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "gridContent", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "bucketSize", "", "getBucketSize", "()I", "buckets", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "cachedBucket", "", "cachedBucketIndex", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "previousDefaultSpans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "value", "slotsPerLine", "getSlotsPerLine", "setSlotsPerLine", "(I)V", "totalSize", "getTotalSize", "getDefaultSpans", "currentSlotsPerLine", "getLineConfiguration", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "lineIndex", "getLineIndexOfItem", "itemIndex", "invalidateCache", "", "spanOf", "maxSpan", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent gridContent) {
        Intrinsics.checkNotNullParameter(gridContent, "gridContent");
        this.gridContent = gridContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        arrayList.add(new Bucket(0, 0, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.emptyList();
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "firstItemIndex", "", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "(ILjava/util/List;)V", "getFirstItemIndex", "()I", "getSpans", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i, List<GridItemSpan> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.firstItemIndex = i;
            this.spans = spans;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i) {
        if (i == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(GridItemSpan.m863boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        ArrayList arrayList2 = arrayList;
        this.previousDefaultSpans = arrayList2;
        return arrayList2;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            invalidateCache();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[LOOP:0: B:35:0x00ae->B:84:0x00ae, LOOP_START, PHI: r2 r4 r5 
      PHI: (r2v10 int) = (r2v9 int), (r2v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v6 int) = (r5v5 int), (r5v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LineConfiguration getLineConfiguration(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (!this.gridContent.getHasCustomSpans$foundation_release()) {
            int i5 = i * this.slotsPerLine;
            return new LineConfiguration(i5, getDefaultSpans(RangesKt.coerceAtLeast(RangesKt.coerceAtMost(this.slotsPerLine, getTotalSize() - i5), 0)));
        }
        int min = Math.min(i / getBucketSize(), this.buckets.size() - 1);
        int bucketSize = getBucketSize() * min;
        int firstItemIndex = this.buckets.get(min).getFirstItemIndex();
        int firstItemKnownSpan = this.buckets.get(min).getFirstItemKnownSpan();
        int i6 = this.lastLineIndex;
        if (bucketSize <= i6 && i6 <= i) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            bucketSize = i6;
        } else if (min == this.cachedBucketIndex && (i2 = i - bucketSize) < this.cachedBucket.size()) {
            firstItemIndex = this.cachedBucket.get(i2).intValue();
            bucketSize = i;
            firstItemKnownSpan = 0;
        }
        if (bucketSize % getBucketSize() == 0) {
            int i7 = i - bucketSize;
            if (2 <= i7 && i7 < getBucketSize()) {
                z = true;
                if (z) {
                    this.cachedBucketIndex = min;
                    this.cachedBucket.clear();
                }
                if (bucketSize > i) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                while (bucketSize < i && firstItemIndex < getTotalSize()) {
                    if (z) {
                        this.cachedBucket.add(Integer.valueOf(firstItemIndex));
                    }
                    int i8 = 0;
                    while (i8 < this.slotsPerLine && firstItemIndex < getTotalSize()) {
                        if (firstItemKnownSpan == 0) {
                            i4 = firstItemKnownSpan;
                            firstItemKnownSpan = spanOf(firstItemIndex, this.slotsPerLine - i8);
                        } else {
                            i4 = 0;
                        }
                        i8 += firstItemKnownSpan;
                        if (i8 > this.slotsPerLine) {
                            break;
                        }
                        firstItemIndex++;
                        firstItemKnownSpan = i4;
                    }
                    bucketSize++;
                    if (bucketSize % getBucketSize() == 0 && firstItemIndex < getTotalSize()) {
                        if (!(this.buckets.size() == bucketSize / getBucketSize())) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        this.buckets.add(new Bucket(firstItemIndex, firstItemKnownSpan));
                    }
                }
                this.lastLineIndex = i;
                this.lastLineStartItemIndex = firstItemIndex;
                this.lastLineStartKnownSpan = firstItemKnownSpan;
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                int i10 = firstItemIndex;
                while (i9 < this.slotsPerLine && i10 < getTotalSize()) {
                    if (firstItemKnownSpan == 0) {
                        int i11 = firstItemKnownSpan;
                        firstItemKnownSpan = spanOf(i10, this.slotsPerLine - i9);
                        i3 = i11;
                    } else {
                        i3 = 0;
                    }
                    i9 += firstItemKnownSpan;
                    if (i9 > this.slotsPerLine) {
                        break;
                    }
                    i10++;
                    arrayList.add(GridItemSpan.m863boximpl(LazyGridSpanKt.GridItemSpan(firstItemKnownSpan)));
                    firstItemKnownSpan = i3;
                }
                return new LineConfiguration(firstItemIndex, arrayList);
            }
        }
        z = false;
        if (z) {
        }
        if (bucketSize > i) {
        }
    }

    public final int getLineIndexOfItem(int i) {
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (!(i < getTotalSize())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.gridContent.getHasCustomSpans$foundation_release()) {
            return i / this.slotsPerLine;
        }
        int binarySearch$default = CollectionsKt.binarySearch$default(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i), 3, (Object) null);
        if (binarySearch$default < 0) {
            binarySearch$default = (-binarySearch$default) - 2;
        }
        int bucketSize = getBucketSize() * binarySearch$default;
        int firstItemIndex = this.buckets.get(binarySearch$default).getFirstItemIndex();
        if (firstItemIndex <= i) {
            int i2 = 0;
            while (firstItemIndex < i) {
                int i3 = firstItemIndex + 1;
                int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i2);
                i2 += spanOf;
                int i4 = this.slotsPerLine;
                if (i2 >= i4) {
                    if (i2 == i4) {
                        bucketSize++;
                        i2 = 0;
                    } else {
                        bucketSize++;
                        i2 = spanOf;
                    }
                }
                if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                    this.buckets.add(new Bucket(i3 - (i2 > 0 ? 1 : 0), 0, 2, null));
                }
                firstItemIndex = i3;
            }
            return i2 + spanOf(i, this.slotsPerLine - i2) > this.slotsPerLine ? bucketSize + 1 : bucketSize;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int spanOf(int i, int i2) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i2);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i);
        return GridItemSpan.m867getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i - interval.getStartIndex())).m870unboximpl());
    }

    private final void invalidateCache() {
        this.buckets.clear();
        this.buckets.add(new Bucket(0, 0, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "firstItemIndex", "", "firstItemKnownSpan", "(II)V", "getFirstItemIndex", "()I", "getFirstItemKnownSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }

        public /* synthetic */ Bucket(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "()V", "maxCurrentLineSpan", "", "getMaxCurrentLineSpan", "()I", "setMaxCurrentLineSpan", "(I)V", "maxLineSpan", "getMaxLineSpan", "setMaxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        public void setMaxCurrentLineSpan(int i) {
            maxCurrentLineSpan = i;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxLineSpan(int i) {
            maxLineSpan = i;
        }
    }
}

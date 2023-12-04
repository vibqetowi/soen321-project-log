package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "()V", "beyondBoundsItems", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", TtmlNode.END, "", "getEnd", "()I", TtmlNode.START, "getStart", "addInterval", "hasIntervals", "", "removeInterval", "", "interval", "Interval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    public final Interval addInterval(int i, int i2) {
        Interval interval = new Interval(i, i2);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final void removeInterval(Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.beyondBoundsItems.remove(interval);
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i = 0;
            do {
                Interval interval = content[i];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i++;
            } while (i < size);
            if (start >= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return start;
        }
        if (start >= 0) {
        }
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i = 0;
            do {
                Interval interval = content[i];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i++;
            } while (i < size);
            return end;
        }
        return end;
    }

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", TtmlNode.START, "", TtmlNode.END, "(II)V", "getEnd", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Interval {
        private final int end;
        private final int start;

        public static /* synthetic */ Interval copy$default(Interval interval, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = interval.start;
            }
            if ((i3 & 2) != 0) {
                i2 = interval.end;
            }
            return interval.copy(i, i2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i, int i2) {
            return new Interval(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Interval) {
                Interval interval = (Interval) obj;
                return this.start == interval.start && this.end == interval.end;
            }
            return false;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }

        public Interval(int i, int i2) {
            this.start = i;
            this.end = i2;
            if (!(i >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i2 >= i)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }
    }
}

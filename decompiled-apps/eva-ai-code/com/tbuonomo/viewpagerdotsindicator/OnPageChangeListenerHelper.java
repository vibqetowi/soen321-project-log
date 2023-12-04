package com.tbuonomo.viewpagerdotsindicator;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: OnPageChangeListenerHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ%\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH ¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "", "()V", "lastLeftPosition", "", "lastRightPosition", "pageCount", "getPageCount$viewpagerdotsindicator_release", "()I", "onPageScrolled", "", "position", "positionOffset", "", "selectedPosition", "nextPosition", "onPageScrolled$viewpagerdotsindicator_release", "resetPosition", "resetPosition$viewpagerdotsindicator_release", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OnPageChangeListenerHelper {
    private int lastLeftPosition = -1;
    private int lastRightPosition = -1;

    public abstract int getPageCount$viewpagerdotsindicator_release();

    public abstract void onPageScrolled$viewpagerdotsindicator_release(int i, int i2, float f);

    public abstract void resetPosition$viewpagerdotsindicator_release(int i);

    public final void onPageScrolled(int i, float f) {
        float f2 = i + f;
        float pageCount$viewpagerdotsindicator_release = getPageCount$viewpagerdotsindicator_release() - 1;
        if (f2 == pageCount$viewpagerdotsindicator_release) {
            f2 = pageCount$viewpagerdotsindicator_release - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > pageCount$viewpagerdotsindicator_release || i2 < 0) {
            return;
        }
        onPageScrolled$viewpagerdotsindicator_release(i2, i3, f2 % 1);
        int i4 = this.lastLeftPosition;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator<Integer> it = RangesKt.until(i4, i2).iterator();
                while (it.hasNext()) {
                    resetPosition$viewpagerdotsindicator_release(((IntIterator) it).nextInt());
                }
            }
            int i5 = this.lastRightPosition;
            if (i3 < i5) {
                resetPosition$viewpagerdotsindicator_release(i5);
                Iterator<Integer> it2 = new IntRange(i3 + 1, this.lastRightPosition).iterator();
                while (it2.hasNext()) {
                    resetPosition$viewpagerdotsindicator_release(((IntIterator) it2).nextInt());
                }
            }
        }
        this.lastLeftPosition = i2;
        this.lastRightPosition = i3;
    }
}

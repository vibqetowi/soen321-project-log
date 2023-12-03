package t0;

import android.view.View;
import android.view.ViewGroup;
import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class j0 implements Iterator<View>, ts.a, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f32323u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f32324v;

    public j0(ViewGroup viewGroup) {
        this.f32324v = viewGroup;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.f32323u < this.f32324v.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i6 = this.f32323u;
        this.f32323u = i6 + 1;
        View childAt = this.f32324v.getChildAt(i6);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        int i6 = this.f32323u - 1;
        this.f32323u = i6;
        this.f32324v.removeViewAt(i6);
    }
}

package h5;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: GraphRequestBatch.kt */
/* loaded from: classes.dex */
public final class t extends AbstractList<q> {

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicInteger f17310y = new AtomicInteger();

    /* renamed from: u  reason: collision with root package name */
    public Handler f17311u;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f17313w;

    /* renamed from: v  reason: collision with root package name */
    public final String f17312v = String.valueOf(Integer.valueOf(f17310y.incrementAndGet()));

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f17314x = new ArrayList();

    /* compiled from: GraphRequestBatch.kt */
    /* loaded from: classes.dex */
    public interface a {
        void b(t tVar);
    }

    /* compiled from: GraphRequestBatch.kt */
    /* loaded from: classes.dex */
    public interface b extends a {
        void a();
    }

    public t(List list) {
        this.f17313w = new ArrayList(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        q element = (q) obj;
        kotlin.jvm.internal.i.g(element, "element");
        this.f17313w.add(i6, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f17313w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof q;
        }
        if (!z10) {
            return false;
        }
        return super.contains((q) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return (q) this.f17313w.get(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof q;
        }
        if (!z10) {
            return -1;
        }
        return super.indexOf((q) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof q;
        }
        if (!z10) {
            return -1;
        }
        return super.lastIndexOf((q) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof q) {
            return super.remove((q) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        q element = (q) obj;
        kotlin.jvm.internal.i.g(element, "element");
        return (q) this.f17313w.set(i6, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17313w.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        return (q) this.f17313w.remove(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        q element = (q) obj;
        kotlin.jvm.internal.i.g(element, "element");
        return this.f17313w.add(element);
    }

    public t(q... qVarArr) {
        this.f17313w = new ArrayList(is.i.G1(qVarArr));
    }
}

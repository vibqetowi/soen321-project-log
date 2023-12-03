package c9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: CopyOnWriteMultiset.java */
/* loaded from: classes.dex */
public final class f<E> implements Iterable<E> {

    /* renamed from: u  reason: collision with root package name */
    public final Object f5134u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f5135v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public Set<E> f5136w = Collections.emptySet();

    /* renamed from: x  reason: collision with root package name */
    public List<E> f5137x = Collections.emptyList();

    public final int e(E e10) {
        int i6;
        synchronized (this.f5134u) {
            if (this.f5135v.containsKey(e10)) {
                i6 = ((Integer) this.f5135v.get(e10)).intValue();
            } else {
                i6 = 0;
            }
        }
        return i6;
    }

    public final void g(E e10) {
        synchronized (this.f5134u) {
            Integer num = (Integer) this.f5135v.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f5137x);
            arrayList.remove(e10);
            this.f5137x = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f5135v.remove(e10);
                HashSet hashSet = new HashSet(this.f5136w);
                hashSet.remove(e10);
                this.f5136w = Collections.unmodifiableSet(hashSet);
            } else {
                this.f5135v.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f5134u) {
            it = this.f5137x.iterator();
        }
        return it;
    }
}

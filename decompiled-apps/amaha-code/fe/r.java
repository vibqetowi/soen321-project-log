package fe;

import com.google.firebase.firestore.FirebaseFirestore;
import he.h0;
import j$.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: QuerySnapshot.java */
/* loaded from: classes.dex */
public final class r implements Iterable<q> {

    /* renamed from: u  reason: collision with root package name */
    public final com.google.firebase.firestore.d f15005u;

    /* renamed from: v  reason: collision with root package name */
    public final h0 f15006v;

    /* renamed from: w  reason: collision with root package name */
    public final FirebaseFirestore f15007w;

    /* renamed from: x  reason: collision with root package name */
    public final u f15008x;

    /* compiled from: QuerySnapshot.java */
    /* loaded from: classes.dex */
    public class a implements Iterator<q>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<ke.g> f15009u;

        public a(Iterator<ke.g> it) {
            this.f15009u = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f15009u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            ke.g next = this.f15009u.next();
            r rVar = r.this;
            FirebaseFirestore firebaseFirestore = rVar.f15007w;
            h0 h0Var = rVar.f15006v;
            return new q(firebaseFirestore, next.getKey(), next, h0Var.f17523e, h0Var.f.contains(next.getKey()));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public r(com.google.firebase.firestore.d dVar, h0 h0Var, FirebaseFirestore firebaseFirestore) {
        this.f15005u = dVar;
        h0Var.getClass();
        this.f15006v = h0Var;
        firebaseFirestore.getClass();
        this.f15007w = firebaseFirestore;
        this.f15008x = new u(!h0Var.f.isEmpty(), h0Var.f17523e);
    }

    public final ArrayList e() {
        h0 h0Var = this.f15006v;
        ArrayList arrayList = new ArrayList(h0Var.f17520b.size());
        java.util.Iterator<ke.g> it = h0Var.f17520b.iterator();
        while (it.hasNext()) {
            ke.g next = it.next();
            arrayList.add(new q(this.f15007w, next.getKey(), next, h0Var.f17523e, h0Var.f.contains(next.getKey())));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f15007w.equals(rVar.f15007w) && this.f15005u.equals(rVar.f15005u) && this.f15006v.equals(rVar.f15006v) && this.f15008x.equals(rVar.f15008x)) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Class cls) {
        ArrayList arrayList = new ArrayList();
        java.util.Iterator<q> it = iterator();
        while (true) {
            a aVar = (a) it;
            if (aVar.hasNext()) {
                arrayList.add(((g) aVar.next()).e(cls));
            } else {
                return arrayList;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.f15005u.hashCode();
        int hashCode2 = this.f15006v.hashCode();
        return this.f15008x.hashCode() + ((hashCode2 + ((hashCode + (this.f15007w.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<q> iterator() {
        return new a(this.f15006v.f17520b.iterator());
    }
}

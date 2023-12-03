package cv;

import java.util.Iterator;
/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes2.dex */
public abstract class a<K, V> implements Iterable<V>, ts.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: cv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0180a<K, V, T extends V> {

        /* renamed from: a  reason: collision with root package name */
        public final ys.d<? extends K> f12051a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12052b;

        public AbstractC0180a(ys.d<? extends K> dVar, int i6) {
            this.f12051a = dVar;
            this.f12052b = i6;
        }
    }

    public abstract b<V> g();

    public final boolean isEmpty() {
        if (((d) this).f12057u.g() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return g().iterator();
    }
}

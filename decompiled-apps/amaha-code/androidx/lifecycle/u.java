package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.b;
/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public final class u<T> extends w<T> {

    /* renamed from: l  reason: collision with root package name */
    public final n.b<LiveData<?>, a<?>> f2466l = new n.b<>();

    /* compiled from: MediatorLiveData.java */
    /* loaded from: classes.dex */
    public static class a<V> implements x<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f2467a;

        /* renamed from: b  reason: collision with root package name */
        public final x<? super V> f2468b;

        /* renamed from: c  reason: collision with root package name */
        public int f2469c = -1;

        public a(LiveData<V> liveData, x<? super V> xVar) {
            this.f2467a = liveData;
            this.f2468b = xVar;
        }

        @Override // androidx.lifecycle.x
        public final void a(V v10) {
            int i6 = this.f2469c;
            int i10 = this.f2467a.f2361g;
            if (i6 != i10) {
                this.f2469c = i10;
                this.f2468b.a(v10);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2466l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2467a.f(aVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2466l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2467a.j(aVar);
            } else {
                return;
            }
        }
    }

    public final <S> void m(LiveData<S> liveData, x<? super S> xVar) {
        boolean z10;
        if (liveData != null) {
            a<?> aVar = new a<>(liveData, xVar);
            a<?> g5 = this.f2466l.g(liveData, aVar);
            if (g5 != null && g5.f2468b != xVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (g5 != null) {
                return;
            }
            if (this.f2358c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                liveData.f(aVar);
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}

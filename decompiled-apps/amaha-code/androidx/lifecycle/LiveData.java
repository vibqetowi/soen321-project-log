package androidx.lifecycle;

import androidx.lifecycle.j;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import n.b;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2355k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2356a;

    /* renamed from: b  reason: collision with root package name */
    public final n.b<x<? super T>, LiveData<T>.c> f2357b;

    /* renamed from: c  reason: collision with root package name */
    public int f2358c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2359d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2360e;
    public volatile Object f;

    /* renamed from: g  reason: collision with root package name */
    public int f2361g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2362h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2363i;

    /* renamed from: j  reason: collision with root package name */
    public final a f2364j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements n {

        /* renamed from: y  reason: collision with root package name */
        public final p f2365y;

        public LifecycleBoundObserver(p pVar, x<? super T> xVar) {
            super(xVar);
            this.f2365y = pVar;
        }

        @Override // androidx.lifecycle.n
        public final void c(p pVar, j.b bVar) {
            p pVar2 = this.f2365y;
            j.c b10 = pVar2.getLifecycle().b();
            if (b10 == j.c.DESTROYED) {
                LiveData.this.j(this.f2368u);
                return;
            }
            j.c cVar = null;
            while (cVar != b10) {
                h(k());
                cVar = b10;
                b10 = pVar2.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void i() {
            this.f2365y.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean j(p pVar) {
            if (this.f2365y == pVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean k() {
            return this.f2365y.getLifecycle().b().d(j.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f2356a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.f2355k;
            }
            LiveData.this.l(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, x<? super T> xVar) {
            super(xVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean k() {
            return true;
        }
    }

    public LiveData(Serializable serializable) {
        this.f2356a = new Object();
        this.f2357b = new n.b<>();
        this.f2358c = 0;
        this.f = f2355k;
        this.f2364j = new a();
        this.f2360e = serializable;
        this.f2361g = 0;
    }

    public static void a(String str) {
        if (m.a.J().K()) {
            return;
        }
        throw new IllegalStateException(defpackage.b.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (!cVar.f2369v) {
            return;
        }
        if (!cVar.k()) {
            cVar.h(false);
            return;
        }
        int i6 = cVar.f2370w;
        int i10 = this.f2361g;
        if (i6 >= i10) {
            return;
        }
        cVar.f2370w = i10;
        cVar.f2368u.a((Object) this.f2360e);
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f2362h) {
            this.f2363i = true;
            return;
        }
        this.f2362h = true;
        do {
            this.f2363i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                n.b<x<? super T>, LiveData<T>.c> bVar = this.f2357b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f25764w.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2363i) {
                        break;
                    }
                }
            }
        } while (this.f2363i);
        this.f2362h = false;
    }

    public final T d() {
        T t3 = (T) this.f2360e;
        if (t3 != f2355k) {
            return t3;
        }
        return null;
    }

    public final void e(p pVar, x<? super T> xVar) {
        a("observe");
        if (pVar.getLifecycle().b() == j.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, xVar);
        LiveData<T>.c g5 = this.f2357b.g(xVar, lifecycleBoundObserver);
        if (g5 != null && !g5.j(pVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g5 != null) {
            return;
        }
        pVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public final void f(x<? super T> xVar) {
        a("observeForever");
        b bVar = new b(this, xVar);
        LiveData<T>.c g5 = this.f2357b.g(xVar, bVar);
        if (!(g5 instanceof LifecycleBoundObserver)) {
            if (g5 != null) {
                return;
            }
            bVar.h(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void i(T t3) {
        boolean z10;
        synchronized (this.f2356a) {
            if (this.f == f2355k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f = t3;
        }
        if (!z10) {
            return;
        }
        m.a.J().L(this.f2364j);
    }

    public void j(x<? super T> xVar) {
        a("removeObserver");
        LiveData<T>.c m10 = this.f2357b.m(xVar);
        if (m10 == null) {
            return;
        }
        m10.i();
        m10.h(false);
    }

    public final void k(p pVar) {
        a("removeObservers");
        Iterator<Map.Entry<x<? super T>, LiveData<T>.c>> it = this.f2357b.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((c) entry.getValue()).j(pVar)) {
                    j((x) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void l(T t3) {
        a("setValue");
        this.f2361g++;
        this.f2360e = t3;
        c(null);
    }

    public LiveData() {
        this.f2356a = new Object();
        this.f2357b = new n.b<>();
        this.f2358c = 0;
        Object obj = f2355k;
        this.f = obj;
        this.f2364j = new a();
        this.f2360e = obj;
        this.f2361g = -1;
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: u  reason: collision with root package name */
        public final x<? super T> f2368u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f2369v;

        /* renamed from: w  reason: collision with root package name */
        public int f2370w = -1;

        public c(x<? super T> xVar) {
            this.f2368u = xVar;
        }

        public final void h(boolean z10) {
            int i6;
            boolean z11;
            boolean z12;
            if (z10 == this.f2369v) {
                return;
            }
            this.f2369v = z10;
            if (z10) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            LiveData liveData = LiveData.this;
            int i10 = liveData.f2358c;
            liveData.f2358c = i6 + i10;
            if (!liveData.f2359d) {
                liveData.f2359d = true;
                while (true) {
                    try {
                        int i11 = liveData.f2358c;
                        if (i10 == i11) {
                            break;
                        }
                        if (i10 == 0 && i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 > 0 && i11 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            liveData.g();
                        } else if (z12) {
                            liveData.h();
                        }
                        i10 = i11;
                    } finally {
                        liveData.f2359d = false;
                    }
                }
            }
            if (this.f2369v) {
                liveData.c(this);
            }
        }

        public boolean j(p pVar) {
            return false;
        }

        public abstract boolean k();

        public void i() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}

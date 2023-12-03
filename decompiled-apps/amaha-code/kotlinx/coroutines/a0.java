package kotlinx.coroutines;

import ls.e;
import ls.f;
/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class a0 extends ls.a implements ls.e {

    /* renamed from: v  reason: collision with root package name */
    public static final a f23481v = new a();

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ls.b<ls.e, a0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: kotlinx.coroutines.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0360a extends kotlin.jvm.internal.k implements ss.l<f.b, a0> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0360a f23482u = new C0360a();

            public C0360a() {
                super(1);
            }

            @Override // ss.l
            public final a0 invoke(f.b bVar) {
                f.b bVar2 = bVar;
                if (bVar2 instanceof a0) {
                    return (a0) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f24519u, C0360a.f23482u);
        }
    }

    public a0() {
        super(e.a.f24519u);
    }

    public boolean K0() {
        return !(this instanceof v1);
    }

    @Override // ls.e
    public final kotlinx.coroutines.internal.d c0(ls.d dVar) {
        return new kotlinx.coroutines.internal.d(this, dVar);
    }

    @Override // ls.a, ls.f.b, ls.f
    public final <E extends f.b> E e(f.c<E> key) {
        boolean z10;
        kotlin.jvm.internal.i.g(key, "key");
        if (key instanceof ls.b) {
            ls.b bVar = (ls.b) key;
            f.c<?> key2 = this.f24509u;
            kotlin.jvm.internal.i.g(key2, "key");
            if (key2 != bVar && bVar.f24511v != key2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                E e10 = (E) bVar.f24510u.invoke(this);
                if (e10 instanceof f.b) {
                    return e10;
                }
            }
        } else if (e.a.f24519u == key) {
            return this;
        }
        return null;
    }

    public abstract void f0(ls.f fVar, Runnable runnable);

    @Override // ls.a, ls.f
    public final ls.f o(f.c<?> key) {
        boolean z10;
        kotlin.jvm.internal.i.g(key, "key");
        boolean z11 = key instanceof ls.b;
        ls.g gVar = ls.g.f24521u;
        if (z11) {
            ls.b bVar = (ls.b) key;
            f.c<?> key2 = this.f24509u;
            kotlin.jvm.internal.i.g(key2, "key");
            if (key2 != bVar && bVar.f24511v != key2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && ((f.b) bVar.f24510u.invoke(this)) != null) {
                return gVar;
            }
        } else if (e.a.f24519u == key) {
            return gVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.q(this);
    }

    @Override // ls.e
    public final void w0(ls.d<?> dVar) {
        ((kotlinx.coroutines.internal.d) dVar).o();
    }
}

package iv;

import androidx.recyclerview.widget.LinearLayoutManager;
import iv.i;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.g;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes2.dex */
public abstract class a<E> extends iv.b<E> implements iv.f<E> {

    /* compiled from: AbstractChannel.kt */
    /* renamed from: iv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0319a<E> implements h<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f20717a;

        /* renamed from: b  reason: collision with root package name */
        public Object f20718b = tr.r.f33548g0;

        public C0319a(a<E> aVar) {
            this.f20717a = aVar;
        }

        @Override // iv.h
        public final Object a(ns.i iVar) {
            kotlinx.coroutines.internal.l lVar;
            Object obj = this.f20718b;
            kotlinx.coroutines.internal.r rVar = tr.r.f33548g0;
            boolean z10 = false;
            if (obj != rVar) {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    if (kVar.f20752x != null) {
                        Throwable G = kVar.G();
                        int i6 = kotlinx.coroutines.internal.q.f23614a;
                        throw G;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            a<E> aVar = this.f20717a;
            Object x10 = aVar.x();
            this.f20718b = x10;
            if (x10 != rVar) {
                if (x10 instanceof k) {
                    k kVar2 = (k) x10;
                    if (kVar2.f20752x != null) {
                        Throwable G2 = kVar2.G();
                        int i10 = kotlinx.coroutines.internal.q.f23614a;
                        throw G2;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            kotlinx.coroutines.k y10 = ta.v.y(ca.a.G0(iVar));
            d dVar = new d(this, y10);
            while (true) {
                if (aVar.p(dVar)) {
                    y10.p(new e(dVar));
                    break;
                }
                Object x11 = aVar.x();
                this.f20718b = x11;
                if (x11 instanceof k) {
                    k kVar3 = (k) x11;
                    if (kVar3.f20752x == null) {
                        y10.resumeWith(Boolean.FALSE);
                    } else {
                        y10.resumeWith(sp.b.j(kVar3.G()));
                    }
                } else if (x11 != rVar) {
                    Boolean bool = Boolean.TRUE;
                    ss.l<E, hs.k> lVar2 = aVar.f20731u;
                    if (lVar2 != null) {
                        lVar = new kotlinx.coroutines.internal.l(lVar2, x11, y10.f23631y);
                    } else {
                        lVar = null;
                    }
                    y10.v(lVar, bool);
                }
            }
            return y10.s();
        }

        @Override // iv.h
        public final E next() {
            E e10 = (E) this.f20718b;
            if (!(e10 instanceof k)) {
                kotlinx.coroutines.internal.r rVar = tr.r.f33548g0;
                if (e10 != rVar) {
                    this.f20718b = rVar;
                    return e10;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable G = ((k) e10).G();
            int i6 = kotlinx.coroutines.internal.q.f23614a;
            throw G;
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes2.dex */
    public static class b<E> extends r<E> {

        /* renamed from: x  reason: collision with root package name */
        public final kotlinx.coroutines.j<Object> f20719x;

        /* renamed from: y  reason: collision with root package name */
        public final int f20720y = 1;

        public b(kotlinx.coroutines.k kVar) {
            this.f20719x = kVar;
        }

        @Override // iv.r
        public final void C(k<?> kVar) {
            int i6 = this.f20720y;
            kotlinx.coroutines.j<Object> jVar = this.f20719x;
            if (i6 == 1) {
                jVar.resumeWith(new i(new i.a(kVar.f20752x)));
            } else {
                jVar.resumeWith(sp.b.j(kVar.G()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // iv.t
        public final kotlinx.coroutines.internal.r b(Object obj) {
            i iVar;
            if (this.f20720y == 1) {
                iVar = new i(obj);
            } else {
                iVar = obj;
            }
            if (this.f20719x.c(iVar, B(obj)) == null) {
                return null;
            }
            return sc.b.I;
        }

        @Override // iv.t
        public final void j(E e10) {
            this.f20719x.i();
        }

        @Override // kotlinx.coroutines.internal.g
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReceiveElement@");
            sb2.append(e0.q(this));
            sb2.append("[receiveMode=");
            return defpackage.c.s(sb2, this.f20720y, ']');
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes2.dex */
    public static final class c<E> extends b<E> {

        /* renamed from: z  reason: collision with root package name */
        public final ss.l<E, hs.k> f20721z;

        public c(kotlinx.coroutines.k kVar, ss.l lVar) {
            super(kVar);
            this.f20721z = lVar;
        }

        @Override // iv.r
        public final ss.l<Throwable, hs.k> B(E e10) {
            return new kotlinx.coroutines.internal.l(this.f20721z, e10, this.f20719x.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes2.dex */
    public static class d<E> extends r<E> {

        /* renamed from: x  reason: collision with root package name */
        public final C0319a<E> f20722x;

        /* renamed from: y  reason: collision with root package name */
        public final kotlinx.coroutines.j<Boolean> f20723y;

        public d(C0319a c0319a, kotlinx.coroutines.k kVar) {
            this.f20722x = c0319a;
            this.f20723y = kVar;
        }

        @Override // iv.r
        public final ss.l<Throwable, hs.k> B(E e10) {
            ss.l<E, hs.k> lVar = this.f20722x.f20717a.f20731u;
            if (lVar != null) {
                return new kotlinx.coroutines.internal.l(lVar, e10, this.f20723y.getContext());
            }
            return null;
        }

        @Override // iv.r
        public final void C(k<?> kVar) {
            kotlinx.coroutines.internal.r t3;
            Throwable th2 = kVar.f20752x;
            kotlinx.coroutines.j<Boolean> jVar = this.f20723y;
            if (th2 == null) {
                t3 = jVar.d(Boolean.FALSE, null);
            } else {
                t3 = jVar.t(kVar.G());
            }
            if (t3 != null) {
                this.f20722x.f20718b = kVar;
                jVar.i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // iv.t
        public final kotlinx.coroutines.internal.r b(Object obj) {
            if (this.f20723y.c(Boolean.TRUE, B(obj)) == null) {
                return null;
            }
            return sc.b.I;
        }

        @Override // iv.t
        public final void j(E e10) {
            this.f20722x.f20718b = e10;
            this.f20723y.i();
        }

        @Override // kotlinx.coroutines.internal.g
        public final String toString() {
            return "ReceiveHasNext@" + e0.q(this);
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes2.dex */
    public final class e extends kotlinx.coroutines.d {

        /* renamed from: u  reason: collision with root package name */
        public final r<?> f20724u;

        public e(r<?> rVar) {
            this.f20724u = rVar;
        }

        @Override // kotlinx.coroutines.i
        public final void a(Throwable th2) {
            if (this.f20724u.w()) {
                a.this.getClass();
            }
        }

        @Override // ss.l
        public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
            a(th2);
            return hs.k.f19476a;
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f20724u + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static final class f extends g.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f20726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.internal.g gVar, a aVar) {
            super(gVar);
            this.f20726d = aVar;
        }

        @Override // kotlinx.coroutines.internal.a
        public final kotlinx.coroutines.internal.r c(Object obj) {
            kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) obj;
            if (this.f20726d.t()) {
                return null;
            }
            return b0.T;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @ns.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* loaded from: classes2.dex */
    public static final class g extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f20727u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a<E> f20728v;

        /* renamed from: w  reason: collision with root package name */
        public int f20729w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<E> aVar, ls.d<? super g> dVar) {
            super(dVar);
            this.f20728v = aVar;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f20727u = obj;
            this.f20729w |= LinearLayoutManager.INVALID_OFFSET;
            Object l2 = this.f20728v.l(this);
            if (l2 == ms.a.COROUTINE_SUSPENDED) {
                return l2;
            }
            return new i(l2);
        }
    }

    public a(ss.l<? super E, hs.k> lVar) {
        super(lVar);
    }

    @Override // iv.s
    public final void g(CancellationException cancellationException) {
        if (u()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        v(f(cancellationException));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r0v7, types: [iv.a$b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [iv.b, iv.a, iv.a<E>] */
    @Override // iv.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ls.d<? super i<? extends E>> dVar) {
        g gVar;
        int i6;
        c cVar;
        Object obj;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f20729w;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f20729w = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = gVar.f20727u;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = gVar.f20729w;
                if (i6 == 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj2);
                    Object x10 = x();
                    kotlinx.coroutines.internal.r rVar = tr.r.f33548g0;
                    if (x10 != rVar) {
                        if (x10 instanceof k) {
                            return new i.a(((k) x10).f20752x);
                        }
                        return x10;
                    }
                    gVar.f20729w = 1;
                    kotlinx.coroutines.k y10 = ta.v.y(ca.a.G0(gVar));
                    ss.l<E, hs.k> lVar = this.f20731u;
                    if (lVar == null) {
                        cVar = new b(y10);
                    } else {
                        cVar = new c(y10, lVar);
                    }
                    while (true) {
                        if (p(cVar)) {
                            y10.p(new e(cVar));
                            break;
                        }
                        Object x11 = x();
                        if (x11 instanceof k) {
                            cVar.C((k) x11);
                            break;
                        } else if (x11 != rVar) {
                            if (cVar.f20720y == 1) {
                                obj = new i(x11);
                            } else {
                                obj = x11;
                            }
                            y10.v(cVar.B(x11), obj);
                        }
                    }
                    obj2 = y10.s();
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                return ((i) obj2).f20746a;
            }
        }
        gVar = new g(this, dVar);
        Object obj22 = gVar.f20727u;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = gVar.f20729w;
        if (i6 == 0) {
        }
        return ((i) obj22).f20746a;
    }

    @Override // iv.b
    public final t<E> m() {
        t<E> m10 = super.m();
        if (m10 != null) {
            boolean z10 = m10 instanceof k;
        }
        return m10;
    }

    public boolean p(r<? super E> rVar) {
        int A;
        kotlinx.coroutines.internal.g s10;
        boolean s11 = s();
        kotlinx.coroutines.internal.f fVar = this.f20732v;
        if (s11) {
            do {
                s10 = fVar.s();
                if (!(!(s10 instanceof u))) {
                }
            } while (!s10.k(rVar, fVar));
            return true;
        }
        f fVar2 = new f(rVar, this);
        do {
            kotlinx.coroutines.internal.g s12 = fVar.s();
            if (!(!(s12 instanceof u))) {
                break;
            }
            A = s12.A(rVar, fVar, fVar2);
            if (A == 1) {
                return true;
            }
        } while (A != 2);
        return false;
    }

    public abstract boolean s();

    public abstract boolean t();

    public boolean u() {
        k kVar;
        kotlinx.coroutines.internal.g p10 = this.f20732v.p();
        k kVar2 = null;
        if (p10 instanceof k) {
            kVar = (k) p10;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            iv.b.h(kVar);
            kVar2 = kVar;
        }
        if (kVar2 != null && t()) {
            return true;
        }
        return false;
    }

    public void v(boolean z10) {
        k<?> e10 = e();
        if (e10 != null) {
            Object obj = null;
            while (true) {
                kotlinx.coroutines.internal.g s10 = e10.s();
                if (s10 instanceof kotlinx.coroutines.internal.f) {
                    w(obj, e10);
                    return;
                } else if (!s10.w()) {
                    ((kotlinx.coroutines.internal.n) s10.o()).f23612a.t();
                } else {
                    obj = hc.d.b0(obj, (u) s10);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void w(Object obj, k<?> kVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((u) obj).D(kVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((u) arrayList.get(size)).D(kVar);
            }
        }
    }

    public Object x() {
        while (true) {
            u o10 = o();
            if (o10 == null) {
                return tr.r.f33548g0;
            }
            if (o10.E() != null) {
                o10.B();
                return o10.C();
            }
            o10.F();
        }
    }
}

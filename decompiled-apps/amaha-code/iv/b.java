package iv;

import iv.i;
import iv.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.p1;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes2.dex */
public abstract class b<E> implements v<E> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20730w = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");

    /* renamed from: u  reason: collision with root package name */
    public final ss.l<E, hs.k> f20731u;

    /* renamed from: v  reason: collision with root package name */
    public final kotlinx.coroutines.internal.f f20732v = new kotlinx.coroutines.internal.f();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX WARN: Multi-variable type inference failed */
    public b(ss.l<? super E, hs.k> lVar) {
        this.f20731u = lVar;
    }

    public static final void a(b bVar, kotlinx.coroutines.k kVar, Object obj, k kVar2) {
        UndeliveredElementException l2;
        bVar.getClass();
        h(kVar2);
        Throwable th2 = kVar2.f20752x;
        if (th2 == null) {
            th2 = new ClosedSendChannelException();
        }
        ss.l<E, hs.k> lVar = bVar.f20731u;
        if (lVar != null && (l2 = kc.f.l(lVar, obj, null)) != null) {
            ca.a.h(l2, th2);
            kVar.resumeWith(sp.b.j(l2));
            return;
        }
        kVar.resumeWith(sp.b.j(th2));
    }

    public static void h(k kVar) {
        r rVar;
        Object obj = null;
        while (true) {
            kotlinx.coroutines.internal.g s10 = kVar.s();
            if (s10 instanceof r) {
                rVar = (r) s10;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                break;
            } else if (!rVar.w()) {
                ((kotlinx.coroutines.internal.n) rVar.o()).f23612a.t();
            } else {
                obj = hc.d.b0(obj, rVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((r) obj).C(kVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((r) arrayList.get(size)).C(kVar);
            }
        }
    }

    @Override // iv.v
    public final Object b(E e10, ls.d<? super hs.k> dVar) {
        boolean z10;
        w xVar;
        Object k10 = k(e10);
        kotlinx.coroutines.internal.r rVar = tr.r.e0;
        if (k10 == rVar) {
            return hs.k.f19476a;
        }
        kotlinx.coroutines.k y10 = ta.v.y(ca.a.G0(dVar));
        while (true) {
            if (!(this.f20732v.p() instanceof t) && j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ss.l<E, hs.k> lVar = this.f20731u;
                if (lVar == null) {
                    xVar = new w(e10, y10);
                } else {
                    xVar = new x(e10, y10, lVar);
                }
                Object c10 = c(xVar);
                if (c10 == null) {
                    y10.p(new p1(xVar));
                    break;
                } else if (c10 instanceof k) {
                    a(this, y10, e10, (k) c10);
                    break;
                } else if (c10 != tr.r.f33549h0 && !(c10 instanceof r)) {
                    throw new IllegalStateException(("enqueueSend returned " + c10).toString());
                }
            }
            Object k11 = k(e10);
            if (k11 == rVar) {
                y10.resumeWith(hs.k.f19476a);
                break;
            } else if (k11 != tr.r.f33547f0) {
                if (k11 instanceof k) {
                    a(this, y10, e10, (k) k11);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + k11).toString());
                }
            }
        }
        Object s10 = y10.s();
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        if (s10 != aVar) {
            s10 = hs.k.f19476a;
        }
        if (s10 == aVar) {
            return s10;
        }
        return hs.k.f19476a;
    }

    public Object c(w wVar) {
        boolean z10;
        kotlinx.coroutines.internal.g s10;
        boolean i6 = i();
        kotlinx.coroutines.internal.f fVar = this.f20732v;
        if (i6) {
            do {
                s10 = fVar.s();
                if (s10 instanceof t) {
                    return s10;
                }
            } while (!s10.k(wVar, fVar));
            return null;
        }
        c cVar = new c(wVar, this);
        while (true) {
            kotlinx.coroutines.internal.g s11 = fVar.s();
            if (s11 instanceof t) {
                return s11;
            }
            int A = s11.A(wVar, fVar, cVar);
            z10 = true;
            if (A != 1) {
                if (A == 2) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z10) {
            return tr.r.f33549h0;
        }
        return null;
    }

    public String d() {
        return "";
    }

    public final k<?> e() {
        k<?> kVar;
        kotlinx.coroutines.internal.g s10 = this.f20732v.s();
        if (s10 instanceof k) {
            kVar = (k) s10;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        h(kVar);
        return kVar;
    }

    @Override // iv.v
    public final boolean f(Throwable th2) {
        boolean z10;
        boolean z11;
        Object obj;
        kotlinx.coroutines.internal.r rVar;
        k kVar = new k(th2);
        kotlinx.coroutines.internal.f fVar = this.f20732v;
        while (true) {
            kotlinx.coroutines.internal.g s10 = fVar.s();
            z10 = false;
            if (!(!(s10 instanceof k))) {
                z11 = false;
                break;
            } else if (s10.k(kVar, fVar)) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            kVar = (k) this.f20732v.s();
        }
        h(kVar);
        if (z11 && (obj = this.onCloseHandler) != null && obj != (rVar = tr.r.f33550i0)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20730w;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z10) {
                c0.e(1, obj);
                ((ss.l) obj).invoke(th2);
            }
        }
        return z11;
    }

    public abstract boolean i();

    public abstract boolean j();

    public Object k(E e10) {
        t<E> m10;
        do {
            m10 = m();
            if (m10 == null) {
                return tr.r.f33547f0;
            }
        } while (m10.b(e10) == null);
        m10.j(e10);
        return m10.c();
    }

    public t<E> m() {
        kotlinx.coroutines.internal.g gVar;
        kotlinx.coroutines.internal.g z10;
        kotlinx.coroutines.internal.f fVar = this.f20732v;
        while (true) {
            gVar = (kotlinx.coroutines.internal.g) fVar.o();
            if (gVar != fVar && (gVar instanceof t)) {
                if (((((t) gVar) instanceof k) && !gVar.v()) || (z10 = gVar.z()) == null) {
                    break;
                }
                z10.t();
            }
        }
        gVar = null;
        return (t) gVar;
    }

    @Override // iv.v
    public final void n(n.b bVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20730w;
        while (true) {
            z10 = true;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                z11 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z11 = false;
                break;
            }
        }
        kotlinx.coroutines.internal.r rVar = tr.r.f33550i0;
        if (!z11) {
            Object obj = this.onCloseHandler;
            if (obj == rVar) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        k<?> e10 = e();
        if (e10 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20730w;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, bVar, rVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != bVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                bVar.invoke(e10.f20752x);
            }
        }
    }

    public final u o() {
        kotlinx.coroutines.internal.g gVar;
        kotlinx.coroutines.internal.g z10;
        kotlinx.coroutines.internal.f fVar = this.f20732v;
        while (true) {
            gVar = (kotlinx.coroutines.internal.g) fVar.o();
            if (gVar != fVar && (gVar instanceof u)) {
                if (((((u) gVar) instanceof k) && !gVar.v()) || (z10 = gVar.z()) == null) {
                    break;
                }
                z10.t();
            }
        }
        gVar = null;
        return (u) gVar;
    }

    @Override // iv.v
    public final Object q(E e10) {
        i.a aVar;
        Object k10 = k(e10);
        if (k10 == tr.r.e0) {
            return hs.k.f19476a;
        }
        if (k10 == tr.r.f33547f0) {
            k<?> e11 = e();
            if (e11 == null) {
                return i.f20745b;
            }
            h(e11);
            Throwable th2 = e11.f20752x;
            if (th2 == null) {
                th2 = new ClosedSendChannelException();
            }
            aVar = new i.a(th2);
        } else if (k10 instanceof k) {
            k kVar = (k) k10;
            h(kVar);
            Throwable th3 = kVar.f20752x;
            if (th3 == null) {
                th3 = new ClosedSendChannelException();
            }
            aVar = new i.a(th3);
        } else {
            throw new IllegalStateException(("trySend returned " + k10).toString());
        }
        return aVar;
    }

    @Override // iv.v
    public final boolean r() {
        if (e() != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.q(this));
        sb2.append('{');
        kotlinx.coroutines.internal.g gVar = this.f20732v;
        kotlinx.coroutines.internal.g p10 = gVar.p();
        if (p10 == gVar) {
            str2 = "EmptyQueue";
        } else {
            if (p10 instanceof k) {
                str = p10.toString();
            } else if (p10 instanceof r) {
                str = "ReceiveQueued";
            } else if (p10 instanceof u) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + p10;
            }
            kotlinx.coroutines.internal.g s10 = gVar.s();
            if (s10 != p10) {
                StringBuilder d10 = v.g.d(str, ",queueSize=");
                int i6 = 0;
                for (kotlinx.coroutines.internal.g gVar2 = (kotlinx.coroutines.internal.g) gVar.o(); !kotlin.jvm.internal.i.b(gVar2, gVar); gVar2 = gVar2.p()) {
                    if (gVar2 instanceof kotlinx.coroutines.internal.g) {
                        i6++;
                    }
                }
                d10.append(i6);
                str2 = d10.toString();
                if (s10 instanceof k) {
                    str2 = str2 + ",closedForSend=" + s10;
                }
            } else {
                str2 = str;
            }
        }
        sb2.append(str2);
        sb2.append('}');
        sb2.append(d());
        return sb2.toString();
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes2.dex */
    public static final class a<E> extends u {

        /* renamed from: x  reason: collision with root package name */
        public final E f20733x;

        public a(E e10) {
            this.f20733x = e10;
        }

        @Override // iv.u
        public final Object C() {
            return this.f20733x;
        }

        @Override // iv.u
        public final kotlinx.coroutines.internal.r E() {
            return sc.b.I;
        }

        @Override // kotlinx.coroutines.internal.g
        public final String toString() {
            return "SendBuffered@" + e0.q(this) + '(' + this.f20733x + ')';
        }

        @Override // iv.u
        public final void B() {
        }

        @Override // iv.u
        public final void D(k<?> kVar) {
        }
    }
}

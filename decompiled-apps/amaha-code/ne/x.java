package ne;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.protobuf.l1;
import he.u;
import java.util.ArrayDeque;
import java.util.HashMap;
import je.b1;
import je.l0;
import ne.d0;
import oe.a;
import rf.l;
import rf.q;
import tr.i0;
/* compiled from: RemoteStore.java */
/* loaded from: classes.dex */
public final class x implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f26274a;

    /* renamed from: b  reason: collision with root package name */
    public final je.k f26275b;

    /* renamed from: d  reason: collision with root package name */
    public final s f26277d;
    public final e0 f;

    /* renamed from: g  reason: collision with root package name */
    public final f0 f26279g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f26280h;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26278e = false;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f26276c = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayDeque f26281i = new ArrayDeque();

    /* compiled from: RemoteStore.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i6, i0 i0Var);

        void b(int i6, i0 i0Var);

        void c(he.w wVar);

        void d(q.f fVar);

        void e(q.f fVar);

        ImmutableSortedSet<ke.i> f(int i6);
    }

    public x(u.a aVar, je.k kVar, g gVar, oe.a aVar2, f fVar) {
        this.f26274a = aVar;
        this.f26275b = kVar;
        this.f26277d = new s(aVar2, new am.w(6, aVar));
        v vVar = new v(this);
        gVar.getClass();
        n nVar = gVar.f26224c;
        oe.a aVar3 = gVar.f26223b;
        t tVar = gVar.f26222a;
        this.f = new e0(nVar, aVar3, tVar, vVar);
        this.f26279g = new f0(nVar, aVar3, tVar, new w(this));
        fVar.a(new l0(this, 6, aVar2));
    }

    public final void a() {
        this.f26278e = true;
        com.google.protobuf.h h10 = this.f26275b.f21848c.h();
        f0 f0Var = this.f26279g;
        f0Var.getClass();
        h10.getClass();
        f0Var.f26220u = h10;
        if (g()) {
            i();
        } else {
            this.f26277d.c(he.w.UNKNOWN);
        }
        b();
    }

    public final void b() {
        int i6;
        boolean z10;
        f0 f0Var;
        ArrayDeque arrayDeque = this.f26281i;
        if (arrayDeque.isEmpty()) {
            i6 = -1;
        } else {
            i6 = ((le.g) arrayDeque.getLast()).f24218a;
        }
        while (true) {
            boolean z11 = true;
            if (this.f26278e && arrayDeque.size() < 10) {
                z10 = true;
            } else {
                z10 = false;
            }
            f0Var = this.f26279g;
            if (!z10) {
                break;
            }
            le.g f = this.f26275b.f21848c.f(i6);
            if (f == null) {
                if (arrayDeque.size() == 0 && f0Var.c() && f0Var.f26162b == null) {
                    f0Var.f26162b = f0Var.f.a(f0Var.f26166g, b.f26159p, f0Var.f26165e);
                }
            } else {
                ca.a.u0((!this.f26278e || arrayDeque.size() >= 10) ? false : false, "addToWritePipeline called when pipeline is full", new Object[0]);
                arrayDeque.add(f);
                if (f0Var.c() && f0Var.f26219t) {
                    f0Var.i(f.f24221d);
                }
                i6 = f.f24218a;
            }
        }
        if (h()) {
            ca.a.u0(h(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            f0Var.f();
        }
    }

    public final void c(b1 b1Var) {
        Integer valueOf = Integer.valueOf(b1Var.f21797b);
        HashMap hashMap = this.f26276c;
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, b1Var);
        if (g()) {
            i();
        } else if (this.f.c()) {
            f(b1Var);
        }
    }

    public final void d() {
        this.f26278e = false;
        e0 e0Var = this.f;
        boolean d10 = e0Var.d();
        y yVar = y.Initial;
        if (d10) {
            e0Var.a(yVar, i0.f33481e);
        }
        f0 f0Var = this.f26279g;
        if (f0Var.d()) {
            f0Var.a(yVar, i0.f33481e);
        }
        ArrayDeque arrayDeque = this.f26281i;
        if (!arrayDeque.isEmpty()) {
            kc.f.A(1, "RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.f26280h = null;
        this.f26277d.c(he.w.UNKNOWN);
        f0Var.b();
        e0Var.b();
        a();
    }

    public final void e(int i6) {
        this.f26280h.a(i6).f26178a++;
        e0 e0Var = this.f;
        ca.a.u0(e0Var.c(), "Unwatching targets requires an open stream", new Object[0]);
        l.a R = rf.l.R();
        String str = e0Var.f26213s.f26268b;
        R.u();
        rf.l.N((rf.l) R.f10073v, str);
        R.u();
        rf.l.P((rf.l) R.f10073v, i6);
        e0Var.h(R.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(b1 b1Var) {
        int ordinal;
        HashMap hashMap;
        String str;
        this.f26280h.a(b1Var.f21797b).f26178a++;
        e0 e0Var = this.f;
        ca.a.u0(e0Var.c(), "Watching queries requires an open stream", new Object[0]);
        l.a R = rf.l.R();
        t tVar = e0Var.f26213s;
        String str2 = tVar.f26268b;
        R.u();
        rf.l.N((rf.l) R.f10073v, str2);
        q.a R2 = rf.q.R();
        he.d0 d0Var = b1Var.f21796a;
        if (d0Var.e()) {
            q.b.a Q = q.b.Q();
            String k10 = t.k(tVar.f26267a, d0Var.f17473d);
            Q.u();
            q.b.M((q.b) Q.f10073v, k10);
            R2.u();
            rf.q.N((rf.q) R2.f10073v, Q.r());
        } else {
            q.c j10 = tVar.j(d0Var);
            R2.u();
            rf.q.M((rf.q) R2.f10073v, j10);
        }
        R2.u();
        rf.q.Q((rf.q) R2.f10073v, b1Var.f21797b);
        com.google.protobuf.h hVar = b1Var.f21801g;
        if (hVar.isEmpty()) {
            ke.r rVar = ke.r.f23293v;
            ke.r rVar2 = b1Var.f21800e;
            if (rVar2.compareTo(rVar) > 0) {
                l1 l2 = t.l(rVar2.f23294u);
                R2.u();
                rf.q.P((rf.q) R2.f10073v, l2);
                R.u();
                rf.l.O((rf.l) R.f10073v, R2.r());
                je.a0 a0Var = b1Var.f21799d;
                ordinal = a0Var.ordinal();
                hashMap = null;
                if (ordinal == 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            str = "limbo-document";
                        } else {
                            ca.a.V("Unrecognized query purpose: %s", a0Var);
                            throw null;
                        }
                    } else {
                        str = "existence-filter-mismatch";
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    hashMap = new HashMap(1);
                    hashMap.put("goog-listen-tags", str);
                }
                if (hashMap != null) {
                    R.u();
                    rf.l.M((rf.l) R.f10073v).putAll(hashMap);
                }
                e0Var.h(R.r());
            }
        }
        R2.u();
        rf.q.O((rf.q) R2.f10073v, hVar);
        R.u();
        rf.l.O((rf.l) R.f10073v, R2.r());
        je.a0 a0Var2 = b1Var.f21799d;
        ordinal = a0Var2.ordinal();
        hashMap = null;
        if (ordinal == 0) {
        }
        if (str != null) {
        }
        if (hashMap != null) {
        }
        e0Var.h(R.r());
    }

    public final boolean g() {
        if (this.f26278e && !this.f.d() && !this.f26276c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f26278e && !this.f26279g.d() && !this.f26281i.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ca.a.u0(g(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f26280h = new d0(this);
        this.f.f();
        s sVar = this.f26277d;
        if (sVar.f26263b == 0) {
            sVar.b(he.w.UNKNOWN);
            if (sVar.f26264c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "onlineStateTimer shouldn't be started yet", new Object[0]);
            sVar.f26264c = sVar.f26266e.a(a.c.ONLINE_STATE_TIMEOUT, 10000L, new je.o(3, sVar));
        }
    }

    public final void j(int i6) {
        boolean z10;
        HashMap hashMap = this.f26276c;
        if (((b1) hashMap.remove(Integer.valueOf(i6))) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "stopListening called on target no currently watched: %d", Integer.valueOf(i6));
        e0 e0Var = this.f;
        if (e0Var.c()) {
            e(i6);
        }
        if (hashMap.isEmpty()) {
            if (e0Var.c()) {
                if (e0Var.c() && e0Var.f26162b == null) {
                    e0Var.f26162b = e0Var.f.a(e0Var.f26166g, b.f26159p, e0Var.f26165e);
                }
            } else if (this.f26278e) {
                this.f26277d.c(he.w.UNKNOWN);
            }
        }
    }
}

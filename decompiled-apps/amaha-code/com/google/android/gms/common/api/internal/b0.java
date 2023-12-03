package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import v9.c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class b0<O extends a.c> implements c.a, c.b {

    /* renamed from: b  reason: collision with root package name */
    public final a.e f7344b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f7345c;

    /* renamed from: d  reason: collision with root package name */
    public final t f7346d;

    /* renamed from: g  reason: collision with root package name */
    public final int f7348g;

    /* renamed from: h  reason: collision with root package name */
    public final q0 f7349h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7350i;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ f f7354m;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f7343a = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f7347e = new HashSet();
    public final HashMap f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f7351j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public s9.b f7352k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f7353l = 0;

    public b0(f fVar, com.google.android.gms.common.api.b<O> bVar) {
        this.f7354m = fVar;
        Looper looper = fVar.G.getLooper();
        c.a a10 = bVar.a();
        v9.c cVar = new v9.c(a10.f34861a, a10.f34862b, a10.f34863c, a10.f34864d);
        a.AbstractC0142a<?, O> abstractC0142a = bVar.f7308c.f7303a;
        v9.o.h(abstractC0142a);
        a.e a11 = abstractC0142a.a(bVar.f7306a, looper, cVar, bVar.f7309d, this, this);
        String str = bVar.f7307b;
        if (str != null && (a11 instanceof v9.b)) {
            ((v9.b) a11).N = str;
        }
        if (str != null && (a11 instanceof j)) {
            ((j) a11).getClass();
        }
        this.f7344b = a11;
        this.f7345c = bVar.f7310e;
        this.f7346d = new t();
        this.f7348g = bVar.f7311g;
        if (a11.o()) {
            Context context = fVar.f7371y;
            ka.d dVar = fVar.G;
            c.a a12 = bVar.a();
            this.f7349h = new q0(context, dVar, new v9.c(a12.f34861a, a12.f34862b, a12.f34863c, a12.f34864d));
            return;
        }
        this.f7349h = null;
    }

    public final s9.d a(s9.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            s9.d[] m10 = this.f7344b.m();
            if (m10 == null) {
                m10 = new s9.d[0];
            }
            t.b bVar = new t.b(m10.length);
            for (s9.d dVar : m10) {
                bVar.put(dVar.f31333u, Long.valueOf(dVar.f0()));
            }
            for (s9.d dVar2 : dVarArr) {
                Long l2 = (Long) bVar.getOrDefault(dVar2.f31333u, null);
                if (l2 == null || l2.longValue() < dVar2.f0()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void b(s9.b bVar) {
        HashSet hashSet = this.f7347e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            if (v9.m.a(bVar, s9.b.f31321y)) {
                this.f7344b.e();
            }
            z0Var.getClass();
            throw null;
        }
        hashSet.clear();
    }

    public final void c(Status status) {
        v9.o.c(this.f7354m.G);
        d(status, null, false);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void c1() {
        Looper myLooper = Looper.myLooper();
        f fVar = this.f7354m;
        if (myLooper == fVar.G.getLooper()) {
            f();
        } else {
            fVar.G.post(new c4.u(8, this));
        }
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z10) {
        boolean z11;
        v9.o.c(this.f7354m.G);
        boolean z12 = true;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (runtimeException != null) {
            z12 = false;
        }
        if (z11 != z12) {
            Iterator it = this.f7343a.iterator();
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                if (!z10 || y0Var.f7446a == 2) {
                    if (status != null) {
                        y0Var.a(status);
                    } else {
                        y0Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void e() {
        LinkedList linkedList = this.f7343a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            y0 y0Var = (y0) arrayList.get(i6);
            if (this.f7344b.j()) {
                if (i(y0Var)) {
                    linkedList.remove(y0Var);
                }
            } else {
                return;
            }
        }
    }

    public final void f() {
        a.e eVar = this.f7344b;
        f fVar = this.f7354m;
        v9.o.c(fVar.G);
        this.f7352k = null;
        b(s9.b.f31321y);
        if (this.f7350i) {
            ka.d dVar = fVar.G;
            a<O> aVar = this.f7345c;
            dVar.removeMessages(11, aVar);
            fVar.G.removeMessages(9, aVar);
            this.f7350i = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (a(l0Var.f7404a.f7402b) != null) {
                it.remove();
            } else {
                try {
                    l<Object, ?> lVar = l0Var.f7404a;
                    ((n0) lVar).f7413d.f7407a.p(eVar, new ya.i());
                } catch (DeadObjectException unused) {
                    z(3);
                    eVar.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i6) {
        f fVar = this.f7354m;
        v9.o.c(fVar.G);
        this.f7352k = null;
        this.f7350i = true;
        String n10 = this.f7344b.n();
        t tVar = this.f7346d;
        tVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i6 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i6 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (n10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(n10);
        }
        tVar.a(true, new Status(20, sb2.toString()));
        ka.d dVar = fVar.G;
        a<O> aVar = this.f7345c;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, aVar), 5000L);
        ka.d dVar2 = fVar.G;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 11, aVar), 120000L);
        fVar.A.f34847a.clear();
        for (l0 l0Var : this.f.values()) {
            l0Var.f7406c.run();
        }
    }

    public final void h() {
        f fVar = this.f7354m;
        ka.d dVar = fVar.G;
        a<O> aVar = this.f7345c;
        dVar.removeMessages(12, aVar);
        ka.d dVar2 = fVar.G;
        dVar2.sendMessageDelayed(dVar2.obtainMessage(12, aVar), fVar.f7367u);
    }

    public final boolean i(y0 y0Var) {
        if (!(y0Var instanceof h0)) {
            a.e eVar = this.f7344b;
            y0Var.d(this.f7346d, eVar.o());
            try {
                y0Var.c(this);
            } catch (DeadObjectException unused) {
                z(1);
                eVar.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        h0 h0Var = (h0) y0Var;
        s9.d a10 = a(h0Var.g(this));
        if (a10 == null) {
            a.e eVar2 = this.f7344b;
            y0Var.d(this.f7346d, eVar2.o());
            try {
                y0Var.c(this);
            } catch (DeadObjectException unused2) {
                z(1);
                eVar2.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f7344b.getClass().getName();
        String str = a10.f31333u;
        long f02 = a10.f0();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(f02);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (this.f7354m.H && h0Var.f(this)) {
            c0 c0Var = new c0(this.f7345c, a10);
            int indexOf = this.f7351j.indexOf(c0Var);
            if (indexOf >= 0) {
                c0 c0Var2 = (c0) this.f7351j.get(indexOf);
                this.f7354m.G.removeMessages(15, c0Var2);
                ka.d dVar = this.f7354m.G;
                Message obtain = Message.obtain(dVar, 15, c0Var2);
                this.f7354m.getClass();
                dVar.sendMessageDelayed(obtain, 5000L);
                return false;
            }
            this.f7351j.add(c0Var);
            ka.d dVar2 = this.f7354m.G;
            Message obtain2 = Message.obtain(dVar2, 15, c0Var);
            this.f7354m.getClass();
            dVar2.sendMessageDelayed(obtain2, 5000L);
            ka.d dVar3 = this.f7354m.G;
            Message obtain3 = Message.obtain(dVar3, 16, c0Var);
            this.f7354m.getClass();
            dVar3.sendMessageDelayed(obtain3, 120000L);
            s9.b bVar = new s9.b(2, null);
            if (!j(bVar)) {
                this.f7354m.b(bVar, this.f7348g);
                return false;
            }
            return false;
        }
        h0Var.b(new UnsupportedApiCallException(a10));
        return true;
    }

    public final boolean j(s9.b bVar) {
        synchronized (f.K) {
            this.f7354m.getClass();
        }
        return false;
    }

    public final boolean k(boolean z10) {
        boolean z11;
        v9.o.c(this.f7354m.G);
        a.e eVar = this.f7344b;
        if (!eVar.j() || this.f.size() != 0) {
            return false;
        }
        t tVar = this.f7346d;
        if (tVar.f7436a.isEmpty() && tVar.f7437b.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (z10) {
                h();
            }
            return false;
        }
        eVar.b("Timing out service connection.");
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [va.f, com.google.android.gms.common.api.a$e] */
    public final void l() {
        f fVar = this.f7354m;
        v9.o.c(fVar.G);
        a.e eVar = this.f7344b;
        if (!eVar.j() && !eVar.d()) {
            try {
                v9.b0 b0Var = fVar.A;
                Context context = fVar.f7371y;
                b0Var.getClass();
                v9.o.h(context);
                int i6 = 0;
                if (eVar.k()) {
                    int l2 = eVar.l();
                    SparseIntArray sparseIntArray = b0Var.f34847a;
                    int i10 = sparseIntArray.get(l2, -1);
                    if (i10 != -1) {
                        i6 = i10;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < sparseIntArray.size()) {
                                int keyAt = sparseIntArray.keyAt(i11);
                                if (keyAt > l2 && sparseIntArray.get(keyAt) == 0) {
                                    break;
                                }
                                i11++;
                            } else {
                                i6 = -1;
                                break;
                            }
                        }
                        if (i6 == -1) {
                            i6 = b0Var.f34848b.b(l2, context);
                        }
                        sparseIntArray.put(l2, i6);
                    }
                }
                if (i6 != 0) {
                    s9.b bVar = new s9.b(i6, null);
                    String name = eVar.getClass().getName();
                    String bVar2 = bVar.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + bVar2.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(bVar2);
                    Log.w("GoogleApiManager", sb2.toString());
                    n(bVar, null);
                    return;
                }
                e0 e0Var = new e0(fVar, eVar, this.f7345c);
                if (eVar.o()) {
                    q0 q0Var = this.f7349h;
                    v9.o.h(q0Var);
                    va.f fVar2 = q0Var.f7427g;
                    if (fVar2 != null) {
                        fVar2.h();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(q0Var));
                    v9.c cVar = q0Var.f;
                    cVar.f34860h = valueOf;
                    va.b bVar3 = q0Var.f7425d;
                    Context context2 = q0Var.f7423b;
                    Handler handler = q0Var.f7424c;
                    q0Var.f7427g = bVar3.a(context2, handler.getLooper(), cVar, cVar.f34859g, q0Var, q0Var);
                    q0Var.f7428h = e0Var;
                    Set<Scope> set = q0Var.f7426e;
                    if (set != null && !set.isEmpty()) {
                        q0Var.f7427g.p();
                    } else {
                        handler.post(new c4.u(10, q0Var));
                    }
                }
                try {
                    eVar.i(e0Var);
                } catch (SecurityException e10) {
                    n(new s9.b(10), e10);
                }
            } catch (IllegalStateException e11) {
                n(new s9.b(10), e11);
            }
        }
    }

    public final void m(y0 y0Var) {
        boolean z10;
        v9.o.c(this.f7354m.G);
        boolean j10 = this.f7344b.j();
        LinkedList linkedList = this.f7343a;
        if (j10) {
            if (i(y0Var)) {
                h();
                return;
            } else {
                linkedList.add(y0Var);
                return;
            }
        }
        linkedList.add(y0Var);
        s9.b bVar = this.f7352k;
        if (bVar != null) {
            if (bVar.f31323v != 0 && bVar.f31324w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                n(bVar, null);
                return;
            }
        }
        l();
    }

    public final void n(s9.b bVar, RuntimeException runtimeException) {
        va.f fVar;
        v9.o.c(this.f7354m.G);
        q0 q0Var = this.f7349h;
        if (q0Var != null && (fVar = q0Var.f7427g) != null) {
            fVar.h();
        }
        v9.o.c(this.f7354m.G);
        this.f7352k = null;
        this.f7354m.A.f34847a.clear();
        b(bVar);
        if ((this.f7344b instanceof x9.d) && bVar.f31323v != 24) {
            f fVar2 = this.f7354m;
            fVar2.f7368v = true;
            ka.d dVar = fVar2.G;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (bVar.f31323v == 4) {
            c(f.J);
        } else if (this.f7343a.isEmpty()) {
            this.f7352k = bVar;
        } else if (runtimeException != null) {
            v9.o.c(this.f7354m.G);
            d(null, runtimeException, false);
        } else if (this.f7354m.H) {
            d(f.c(this.f7345c, bVar), null, true);
            if (!this.f7343a.isEmpty() && !j(bVar) && !this.f7354m.b(bVar, this.f7348g)) {
                if (bVar.f31323v == 18) {
                    this.f7350i = true;
                }
                if (this.f7350i) {
                    ka.d dVar2 = this.f7354m.G;
                    Message obtain = Message.obtain(dVar2, 9, this.f7345c);
                    this.f7354m.getClass();
                    dVar2.sendMessageDelayed(obtain, 5000L);
                    return;
                }
                c(f.c(this.f7345c, bVar));
            }
        } else {
            c(f.c(this.f7345c, bVar));
        }
    }

    public final void o() {
        v9.o.c(this.f7354m.G);
        Status status = f.I;
        c(status);
        t tVar = this.f7346d;
        tVar.getClass();
        tVar.a(false, status);
        for (i.a aVar : (i.a[]) this.f.keySet().toArray(new i.a[0])) {
            m(new x0(aVar, new ya.i()));
        }
        b(new s9.b(4));
        a.e eVar = this.f7344b;
        if (eVar.j()) {
            eVar.c(new a0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void v(s9.b bVar) {
        n(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void z(int i6) {
        Looper myLooper = Looper.myLooper();
        f fVar = this.f7354m;
        if (myLooper == fVar.G.getLooper()) {
            g(i6);
        } else {
            fVar.G.post(new m9.c0(i6, 1, this));
        }
    }
}

package o2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import androidx.work.q;
import androidx.work.u;
import g.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.a0;
import n2.r;
import n2.t;
import r2.d;
import v2.s;
import w2.n;
/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class c implements r, r2.c, n2.c {
    public static final String D = q.f("GreedyScheduler");
    public Boolean C;

    /* renamed from: u  reason: collision with root package name */
    public final Context f26991u;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f26992v;

    /* renamed from: w  reason: collision with root package name */
    public final d f26993w;

    /* renamed from: y  reason: collision with root package name */
    public final b f26995y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f26996z;

    /* renamed from: x  reason: collision with root package name */
    public final HashSet f26994x = new HashSet();
    public final l B = new l(2);
    public final Object A = new Object();

    public c(Context context, androidx.work.b bVar, v.c cVar, a0 a0Var) {
        this.f26991u = context;
        this.f26992v = a0Var;
        this.f26993w = new d(cVar, this);
        this.f26995y = new b(this, bVar.f3218e);
    }

    @Override // n2.c
    public final void a(v2.l lVar, boolean z10) {
        this.B.u(lVar);
        synchronized (this.A) {
            Iterator it = this.f26994x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if (ca.a.a0(sVar).equals(lVar)) {
                    q d10 = q.d();
                    String str = D;
                    d10.a(str, "Stopping tracking for " + lVar);
                    this.f26994x.remove(sVar);
                    this.f26993w.d(this.f26994x);
                    break;
                }
            }
        }
    }

    @Override // n2.r
    public final void b(s... sVarArr) {
        if (this.C == null) {
            this.C = Boolean.valueOf(n.a(this.f26991u, this.f26992v.f25793b));
        }
        if (!this.C.booleanValue()) {
            q.d().e(D, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f26996z) {
            this.f26992v.f.b(this);
            this.f26996z = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (s sVar : sVarArr) {
            if (!this.B.j(ca.a.a0(sVar))) {
                long a10 = sVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (sVar.f34735b == u.a.ENQUEUED) {
                    if (currentTimeMillis < a10) {
                        b bVar = this.f26995y;
                        if (bVar != null) {
                            HashMap hashMap = bVar.f26990c;
                            Runnable runnable = (Runnable) hashMap.remove(sVar.f34734a);
                            x xVar = bVar.f26989b;
                            if (runnable != null) {
                                ((Handler) xVar.f16143v).removeCallbacks(runnable);
                            }
                            a aVar = new a(bVar, sVar);
                            hashMap.put(sVar.f34734a, aVar);
                            ((Handler) xVar.f16143v).postDelayed(aVar, sVar.a() - System.currentTimeMillis());
                        }
                    } else if (sVar.b()) {
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 23 && sVar.f34742j.f3227c) {
                            q.d().a(D, "Ignoring " + sVar + ". Requires device idle.");
                        } else if (i6 >= 24 && (!sVar.f34742j.f3231h.isEmpty())) {
                            q.d().a(D, "Ignoring " + sVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(sVar);
                            hashSet2.add(sVar.f34734a);
                        }
                    } else if (!this.B.j(ca.a.a0(sVar))) {
                        q.d().a(D, "Starting work for " + sVar.f34734a);
                        a0 a0Var = this.f26992v;
                        l lVar = this.B;
                        lVar.getClass();
                        a0Var.j(lVar.x(ca.a.a0(sVar)), null);
                    }
                }
            }
        }
        synchronized (this.A) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                q.d().a(D, "Starting tracking for " + join);
                this.f26994x.addAll(hashSet);
                this.f26993w.d(this.f26994x);
            }
        }
    }

    @Override // n2.r
    public final boolean c() {
        return false;
    }

    @Override // n2.r
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.C;
        a0 a0Var = this.f26992v;
        if (bool == null) {
            this.C = Boolean.valueOf(n.a(this.f26991u, a0Var.f25793b));
        }
        boolean booleanValue = this.C.booleanValue();
        String str2 = D;
        if (!booleanValue) {
            q.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f26996z) {
            a0Var.f.b(this);
            this.f26996z = true;
        }
        q d10 = q.d();
        d10.a(str2, "Cancelling work ID " + str);
        b bVar = this.f26995y;
        if (bVar != null && (runnable = (Runnable) bVar.f26990c.remove(str)) != null) {
            ((Handler) bVar.f26989b.f16143v).removeCallbacks(runnable);
        }
        for (t tVar : this.B.t(str)) {
            a0Var.k(tVar);
        }
    }

    @Override // r2.c
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v2.l a02 = ca.a.a0((s) it.next());
            q d10 = q.d();
            d10.a(D, "Constraints not met: Cancelling work ID " + a02);
            t u10 = this.B.u(a02);
            if (u10 != null) {
                this.f26992v.k(u10);
            }
        }
    }

    @Override // r2.c
    public final void f(List<s> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            v2.l a02 = ca.a.a0((s) it.next());
            l lVar = this.B;
            if (!lVar.j(a02)) {
                q d10 = q.d();
                d10.a(D, "Constraints met: Scheduling work ID " + a02);
                this.f26992v.j(lVar.x(a02), null);
            }
        }
    }
}

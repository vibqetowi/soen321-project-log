package com.moengage.inapp.internal;

import ah.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ch.a;
import hh.g;
import ih.j;
import ih.k;
import ih.p;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import mi.a0;
import mi.b1;
import mi.c1;
import mi.h1;
import mi.i1;
import mi.j1;
import mi.k1;
import mi.l1;
import mi.n1;
import mi.o1;
import mi.p1;
import mi.q1;
import mi.r;
import mi.r1;
import mi.y;
import mi.y0;
import mi.z;
import ne.u;
import qg.g0;
import r9.o;
import si.b;
import si.c;
import si.d;
import si.f;
import vi.q;
/* compiled from: InAppHandlerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/inapp/internal/InAppHandlerImpl;", "Lch/a;", "<init>", "()V", "inapp_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class InAppHandlerImpl implements a {
    @Override // ch.a
    public final void a(Context context, Bundle bundle, p pVar) {
        i1.f25206a.getClass();
        h1 b10 = i1.b(pVar);
        p pVar2 = b10.f25197a;
        try {
            g.b(pVar2.f20105d, 0, new b1(b10), 3);
            new r1(pVar2).b(context, bundle);
        } catch (Exception e10) {
            pVar2.f20105d.a(1, e10, new c1(b10));
        }
    }

    @Override // ch.a
    public final void b(Activity currentActivity) {
        Activity activity;
        i.g(currentActivity, "currentActivity");
        Object obj = j1.f25215a;
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new o1(currentActivity), 3);
            WeakReference<Activity> weakReference = j1.f25218d;
            if (weakReference == null) {
                activity = null;
            } else {
                activity = weakReference.get();
            }
            if (i.b(activity, currentActivity)) {
                g.a.b(0, p1.f25251u, 3);
                j1.f25218d = null;
            }
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, q1.f25256u);
        }
    }

    @Override // ch.a
    public final void c(Context context, ih.i iVar, p pVar) {
        i1.f25206a.getClass();
        i1.b(pVar).d(context, iVar);
    }

    @Override // ch.a
    public final void d(Activity currentActivity) {
        i.g(currentActivity, "currentActivity");
        Object obj = j1.f25215a;
    }

    @Override // ch.a
    public final k e(j jVar) {
        boolean z10;
        si.a aVar = new si.a(jVar.f20093a, "", jVar.f20094b, 0L, new c(new f(null, null)), "", new b(jVar.f20095c, new d(0L, 0L, false)), null, null, 0, null, 1);
        long j10 = jVar.f20096d;
        long j11 = jVar.f20097e / 1000;
        if (jVar.f == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new k(si.a.a(aVar), df.b.h(new f8.g(j10, j11, z10)));
    }

    @Override // ch.a
    public final void f(Activity currentActivity) {
        i.g(currentActivity, "currentActivity");
    }

    @Override // ch.a
    public final void g(Activity currentActivity) {
        boolean z10;
        a0 a0Var;
        i.g(currentActivity, "currentActivity");
        Object obj = j1.f25215a;
        hh.a aVar = g.f17610d;
        g.a.b(0, new n1(currentActivity), 3);
        if (!i.b(j1.c(), currentActivity.getClass().getName())) {
            g.a.b(0, k1.f25225u, 3);
            j1.d();
        }
        j1.f25218d = new WeakReference<>(currentActivity);
        a0 a0Var2 = a0.f25129c;
        if (a0Var2 == null) {
            synchronized (a0.class) {
                a0Var = a0.f25129c;
                if (a0Var == null) {
                    a0Var = new a0();
                }
                a0.f25129c = a0Var;
            }
            a0Var2 = a0Var;
        }
        g.a.b(0, new r(a0Var2), 3);
        Activity b10 = j1.b();
        if (b10 != null) {
            o oVar = a0Var2.f25131b;
            String str = (String) oVar.f30642e;
            if (str != null) {
                p b11 = g0.b(str);
                if (b11 != null) {
                    if (i.b(b10.getClass().getName(), (String) oVar.f30641d) && oVar.f30639b != b10.getResources().getConfiguration().orientation) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b11.f20106e.a(new e("RE_RENDER_INAPP_ON_ORIENTATION_CHANGE", false, new u(b10, 14, b11)));
                    }
                } else {
                    return;
                }
            }
            try {
                String name = b10.getClass().getName();
                if (!i.b(name, (String) oVar.f30641d)) {
                    oVar.f30641d = name;
                }
                oVar.f30639b = b10.getResources().getConfiguration().orientation;
                g.a.b(0, new y(a0Var2), 3);
            } catch (Exception e10) {
                hh.a aVar2 = g.f17610d;
                g.a.a(1, e10, new z(a0Var2));
                a0Var2.f25131b.f30640c = null;
            }
        }
    }

    @Override // ch.a
    public final void initialiseModule(Context context) {
        i.g(context, "context");
        synchronized (j1.f25215a) {
            hh.a aVar = g.f17610d;
            g.a.b(0, l1.f25232u, 3);
            eh.o.f14029a.add(new ji.g(1));
            hs.k kVar = hs.k.f19476a;
        }
    }

    @Override // ch.a
    public final void onAppOpen(Context context, p pVar) {
        i1.f25206a.getClass();
        p pVar2 = i1.b(pVar).f25197a;
        pVar2.f20106e.a(new e("FETCH_IN_APP_META_TASK", true, new y0(context, pVar2, 1)));
    }

    @Override // ch.a
    public final void onLogout(Context context, p pVar) {
        i1.f25206a.getClass();
        h1 b10 = i1.b(pVar);
        b10.f25199c = false;
        p pVar2 = b10.f25197a;
        i1.c(pVar2).d(context);
        vi.o d10 = i1.d(context, pVar2);
        g.b(d10.f35210c.f20105d, 0, new q(d10), 3);
        d10.J();
        d10.b();
        d10.H();
    }
}

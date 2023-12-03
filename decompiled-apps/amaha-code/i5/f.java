package i5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import g.v;
import h5.q;
import h5.u;
import h5.w;
import i5.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import w5.e0;
import w5.v;
/* compiled from: AppEventQueue.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19852a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f19853b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile w.d f19854c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f19855d;

    /* renamed from: e  reason: collision with root package name */
    public static ScheduledFuture<?> f19856e;
    public static final b f;

    static {
        new f();
        f19852a = f.class.getName();
        f19853b = 100;
        f19854c = new w.d(1);
        f19855d = Executors.newSingleThreadScheduledExecutor();
        f = new b(1);
    }

    public static final h5.q a(a aVar, q qVar, boolean z10, n nVar) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            String str = aVar.f19831u;
            boolean z11 = false;
            w5.o f2 = w5.p.f(str, false);
            String str2 = h5.q.f17287j;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
            h5.q h10 = q.c.h(null, format, null, null);
            h10.f17297i = true;
            Bundle bundle = h10.f17293d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", aVar.f19832v);
            synchronized (i.c()) {
                b6.a.b(i.class);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i.f19861c;
            String c10 = i.a.c();
            if (c10 != null) {
                bundle.putString("install_referrer", c10);
            }
            h10.f17293d = bundle;
            if (f2 != null) {
                z11 = f2.f36512a;
            }
            int e10 = qVar.e(h10, h5.p.a(), z11, z10);
            if (e10 == 0) {
                return null;
            }
            nVar.f19876u += e10;
            h10.j(new h5.c(aVar, h10, qVar, nVar, 1));
            return h10;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final ArrayList b(w.d appEventCollection, n nVar) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(appEventCollection, "appEventCollection");
            boolean f2 = h5.p.f(h5.p.a());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                q b10 = appEventCollection.b(aVar);
                if (b10 != null) {
                    h5.q a10 = a(aVar, b10, f2, nVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                        k5.d.f22971a.getClass();
                        if (k5.d.f22973c) {
                            HashSet<Integer> hashSet = k5.f.f22988a;
                            androidx.activity.b bVar = new androidx.activity.b(9, a10);
                            e0 e0Var = e0.f36453a;
                            try {
                                h5.p.c().execute(bVar);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final void c(l lVar) {
        if (b6.a.b(f.class)) {
            return;
        }
        try {
            f19855d.execute(new androidx.activity.b(8, lVar));
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
        }
    }

    public static final void d(l lVar) {
        if (b6.a.b(f.class)) {
            return;
        }
        try {
            f19854c.a(e.a());
            try {
                n f2 = f(lVar, f19854c);
                if (f2 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f2.f19876u);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (m) f2.f19877v);
                    n1.a.a(h5.p.a()).c(intent);
                }
            } catch (Exception e10) {
                Log.w(f19852a, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
        }
    }

    public static final void e(h5.q qVar, u uVar, a aVar, n nVar, q qVar2) {
        m mVar;
        if (b6.a.b(f.class)) {
            return;
        }
        try {
            h5.n nVar2 = uVar.f17318c;
            m mVar2 = m.SUCCESS;
            m mVar3 = m.NO_CONNECTIVITY;
            boolean z10 = false;
            if (nVar2 != null) {
                if (nVar2.f17260v == -1) {
                    mVar = mVar3;
                } else {
                    kotlin.jvm.internal.i.f(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{uVar.toString(), nVar2.toString()}, 2)), "java.lang.String.format(format, *args)");
                    mVar = m.SERVER_ERROR;
                }
            } else {
                mVar = mVar2;
            }
            h5.p pVar = h5.p.f17269a;
            h5.p.i(w.APP_EVENTS);
            if (nVar2 != null) {
                z10 = true;
            }
            qVar2.b(z10);
            if (mVar == mVar3) {
                h5.p.c().execute(new v(aVar, 16, qVar2));
            }
            if (mVar != mVar2 && ((m) nVar.f19877v) != mVar3) {
                nVar.f19877v = mVar;
            }
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
        }
    }

    public static final n f(l lVar, w.d appEventCollection) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(appEventCollection, "appEventCollection");
            n nVar = new n(0);
            ArrayList b10 = b(appEventCollection, nVar);
            if (!(!b10.isEmpty())) {
                return null;
            }
            v.a aVar = w5.v.f36544d;
            w wVar = w.APP_EVENTS;
            String TAG = f19852a;
            kotlin.jvm.internal.i.f(TAG, "TAG");
            lVar.toString();
            h5.p.i(wVar);
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).c();
            }
            return nVar;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }
}

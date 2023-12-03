package jd;

import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import nd.g;
import nd.h;
import nd.q;
import nd.t;
import nd.x;
import w2.f;
/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final x f21791a;

    public e(x xVar) {
        this.f21791a = xVar;
    }

    public static e a() {
        e eVar = (e) sc.e.e().c(e.class);
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        t tVar = this.f21791a.f26137g;
        Thread currentThread = Thread.currentThread();
        tVar.getClass();
        q qVar = new q(tVar, System.currentTimeMillis(), th2, currentThread);
        g gVar = tVar.f26116e;
        gVar.getClass();
        gVar.a(new h(qVar));
    }

    public final void c(String str) {
        boolean equals;
        od.h hVar = this.f21791a.f26137g.f26115d;
        hVar.getClass();
        String a10 = od.b.a(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, str);
        synchronized (hVar.f) {
            String reference = hVar.f.getReference();
            if (a10 == null) {
                if (reference == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = a10.equals(reference);
            }
            if (!equals) {
                hVar.f.set(a10, true);
                hVar.f27376b.a(new f(2, hVar));
            }
        }
    }
}

package jd;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cast.w;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import re.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements md.b, ld.a, a.InterfaceC0519a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f21782u;

    public /* synthetic */ a(b bVar) {
        this.f21782u = bVar;
    }

    @Override // md.b
    public final void a(md.a aVar) {
        b bVar = this.f21782u;
        synchronized (bVar) {
            if (bVar.f21784b instanceof md.c) {
                bVar.f21785c.add(aVar);
            }
            bVar.f21784b.a(aVar);
        }
    }

    @Override // ld.a
    public final void e(Bundle bundle) {
        this.f21782u.f21783a.e(bundle);
    }

    @Override // re.a.InterfaceC0519a
    public final void i(re.b bVar) {
        b bVar2 = this.f21782u;
        bVar2.getClass();
        w wVar = w.A;
        wVar.e("AnalyticsConnector now available.");
        wc.a aVar = (wc.a) bVar.get();
        gd.d dVar = new gd.d(2, aVar);
        c cVar = new c();
        wc.b f = aVar.f("clx", cVar);
        if (f == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            wc.b f2 = aVar.f("crash", cVar);
            if (f2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            f = f2;
        }
        if (f != null) {
            wVar.e("Registered Firebase Analytics listener.");
            gd.d dVar2 = new gd.d(1);
            ld.c cVar2 = new ld.c(dVar, TimeUnit.MILLISECONDS);
            synchronized (bVar2) {
                Iterator it = bVar2.f21785c.iterator();
                while (it.hasNext()) {
                    dVar2.a((md.a) it.next());
                }
                cVar.f21787b = dVar2;
                cVar.f21786a = cVar2;
                bVar2.f21784b = dVar2;
                bVar2.f21783a = cVar2;
            }
            return;
        }
        wVar.j("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }
}

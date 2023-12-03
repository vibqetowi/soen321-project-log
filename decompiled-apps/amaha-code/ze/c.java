package ze;

import a7.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import kf.j;
import nf.f;
import sc.e;
/* compiled from: FirebasePerformance.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final df.a f39366e = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f39367a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final re.b<f> f39368b;

    /* renamed from: c  reason: collision with root package name */
    public final se.d f39369c;

    /* renamed from: d  reason: collision with root package name */
    public final re.b<g> f39370d;

    public c(e eVar, re.b<f> bVar, se.d dVar, re.b<g> bVar2, RemoteConfigManager remoteConfigManager, bf.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        kf.d dVar2;
        boolean k10;
        this.f39368b = bVar;
        this.f39369c = dVar;
        this.f39370d = bVar2;
        if (eVar == null) {
            new kf.d(new Bundle());
            return;
        }
        jf.e eVar2 = jf.e.M;
        eVar2.f22008x = eVar;
        eVar.b();
        sc.f fVar = eVar.f31434c;
        eVar2.J = fVar.f31449g;
        eVar2.f22010z = dVar;
        eVar2.A = bVar2;
        eVar2.C.execute(new jf.d(eVar2, 0));
        eVar.b();
        Context context = eVar.f31432a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            dVar2 = new kf.d(bundle);
        } else {
            dVar2 = new kf.d();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.f4253b = dVar2;
        bf.a.f4250d.f12837b = j.a(context);
        aVar.f4254c.b(context);
        sessionManager.setApplicationContext(context);
        Boolean g5 = aVar.g();
        df.a aVar2 = f39366e;
        if (aVar2.f12837b) {
            if (g5 != null) {
                k10 = g5.booleanValue();
            } else {
                k10 = e.e().k();
            }
            if (k10) {
                eVar.b();
                String format = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", String.format("%s/trends?utm_source=%s&utm_medium=%s", ca.a.p0(fVar.f31449g, context.getPackageName()), "perf-android-sdk", "android-ide"));
                if (aVar2.f12837b) {
                    aVar2.f12836a.getClass();
                    Log.i("FirebasePerformance", format);
                }
            }
        }
    }
}

package androidx.activity;

import am.w;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.p;
import androidx.work.q;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import dc.k;
import e9.j;
import f0.g;
import g.v;
import gv.r;
import h5.q;
import is.e0;
import is.u;
import j7.l;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import je.e;
import k5.a;
import k5.e;
import k5.f;
import kotlin.UninitializedPropertyAccessException;
import l5.c;
import n2.a0;
import oe.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.n;
import p7.o;
import r1.d;
import u5.g;
import v2.s;
import v2.t;
import w5.a;
import w5.n;
import w5.p;
import w5.v;
import x2.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f953u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f954v;

    public /* synthetic */ b(int i6, Object obj) {
        this.f953u = i6;
        this.f954v = obj;
    }

    private final void a() {
        String str;
        boolean z10;
        ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f954v;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (!(this$0.f3321x.f37581u instanceof a.b)) {
            Object obj = this$0.getInputData().f3236a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            q d10 = q.d();
            kotlin.jvm.internal.i.f(d10, "get()");
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                d10.b(z2.a.f39137a, "No worker to delegate to.");
                x2.c<p.a> future = this$0.f3321x;
                kotlin.jvm.internal.i.f(future, "future");
                future.i(new p.a.C0043a());
                return;
            }
            p a10 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), str, this$0.f3318u);
            this$0.f3322y = a10;
            if (a10 == null) {
                d10.a(z2.a.f39137a, "No worker to delegate to.");
                x2.c<p.a> future2 = this$0.f3321x;
                kotlin.jvm.internal.i.f(future2, "future");
                future2.i(new p.a.C0043a());
                return;
            }
            a0 e10 = a0.e(this$0.getApplicationContext());
            kotlin.jvm.internal.i.f(e10, "getInstance(applicationContext)");
            t u10 = e10.f25794c.u();
            String uuid = this$0.getId().toString();
            kotlin.jvm.internal.i.f(uuid, "id.toString()");
            s p10 = u10.p(uuid);
            if (p10 == null) {
                x2.c<p.a> future3 = this$0.f3321x;
                kotlin.jvm.internal.i.f(future3, "future");
                String str2 = z2.a.f39137a;
                future3.i(new p.a.C0043a());
                return;
            }
            v.c cVar = e10.f25800j;
            kotlin.jvm.internal.i.f(cVar, "workManagerImpl.trackers");
            r2.d dVar = new r2.d(cVar, this$0);
            dVar.d(ca.a.O0(p10));
            String uuid2 = this$0.getId().toString();
            kotlin.jvm.internal.i.f(uuid2, "id.toString()");
            if (dVar.c(uuid2)) {
                String str3 = z2.a.f39137a;
                d10.a(str3, "Constraints met for delegate " + str);
                try {
                    p pVar = this$0.f3322y;
                    kotlin.jvm.internal.i.d(pVar);
                    rc.b<p.a> startWork = pVar.startWork();
                    kotlin.jvm.internal.i.f(startWork, "delegate!!.startWork()");
                    startWork.d(new v(this$0, 10, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    String str4 = z2.a.f39137a;
                    String m10 = defpackage.b.m("Delegated worker ", str, " threw exception in startWork.");
                    if (((q.a) d10).f3335c <= 3) {
                        Log.d(str4, m10, th2);
                    }
                    synchronized (this$0.f3319v) {
                        if (this$0.f3320w) {
                            d10.a(str4, "Constraints were unmet, Retrying.");
                            x2.c<p.a> future4 = this$0.f3321x;
                            kotlin.jvm.internal.i.f(future4, "future");
                            future4.i(new p.a.b());
                            return;
                        }
                        x2.c<p.a> future5 = this$0.f3321x;
                        kotlin.jvm.internal.i.f(future5, "future");
                        future5.i(new p.a.C0043a());
                        return;
                    }
                }
            }
            String str5 = z2.a.f39137a;
            d10.a(str5, "Constraints not met for delegate " + str + ". Requesting retry.");
            x2.c<p.a> future6 = this$0.f3321x;
            kotlin.jvm.internal.i.f(future6, "future");
            future6.i(new p.a.b());
        }
    }

    private final void b() {
        boolean z10;
        u5.e this$0 = (u5.e) this.f954v;
        HashMap hashMap = u5.e.f33823x;
        if (!b6.a.b(u5.e.class)) {
            try {
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    int i6 = q5.d.f29148a;
                    WeakReference<Activity> weakReference = this$0.f33824u;
                    View b10 = q5.d.b(weakReference.get());
                    Activity activity = weakReference.get();
                    if (b10 != null && activity != null) {
                        Iterator it = u5.c.a(b10).iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            if (!m5.d.b(view)) {
                                String d10 = u5.c.d(view);
                                if (d10.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && d10.length() <= 300) {
                                    HashSet hashSet = u5.g.f33832y;
                                    String localClassName = activity.getLocalClassName();
                                    kotlin.jvm.internal.i.f(localClassName, "activity.localClassName");
                                    g.a.b(view, b10, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                b6.a.a(u5.e.class, th2);
            }
        }
    }

    private final void c() {
        w5.p pVar = w5.p.f36526a;
        ((p.b) this.f954v).onError();
    }

    private final void d() {
        g6.h this$0 = (g6.h) this.f954v;
        int i6 = g6.h.F;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.P();
    }

    private final void e() {
        l lVar = (l) this.f954v;
        lVar.getClass();
        lVar.f21741d.e(new f0.b(11, lVar));
    }

    private final void f() {
        int i6 = c0.b.f6353b;
        ((c0) this.f954v).c();
    }

    private final void g() {
        n nVar = (n) this.f954v;
        o.a m02 = nVar.m0();
        nVar.r0(m02, 1036, new p7.e(m02, 1));
        nVar.f27968z.c();
    }

    private final void h() {
        DefaultDrmSessionManager.c cVar = (DefaultDrmSessionManager.c) this.f954v;
        if (!cVar.f6417w) {
            DrmSession drmSession = cVar.f6416v;
            if (drmSession != null) {
                drmSession.b(cVar.f6415u);
            }
            DefaultDrmSessionManager.this.f6403n.remove(cVar);
            cVar.f6417w = true;
        }
    }

    private final void i() {
        ((DefaultDrmSession) this.f954v).b(null);
    }

    private final void j() {
        int i6 = com.google.android.exoplayer2.ui.b.f7083k0;
        ((com.google.android.exoplayer2.ui.b) this.f954v).f(false);
    }

    private final void k() {
        e9.j jVar = (e9.j) this.f954v;
        Surface surface = jVar.B;
        if (surface != null) {
            Iterator<j.b> it = jVar.f13910u.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
        }
        SurfaceTexture surfaceTexture = jVar.A;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        jVar.A = null;
        jVar.B = null;
    }

    private final void l() {
        SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f954v;
        cVar.f9128b = false;
        SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
        a1.c cVar2 = sideSheetBehavior.f9114i;
        if (cVar2 != null && cVar2.g()) {
            cVar.a(cVar.f9127a);
        } else if (sideSheetBehavior.f9113h == 2) {
            sideSheetBehavior.setStateInternal(cVar.f9127a);
        }
    }

    private final void m() {
        ((dc.e) this.f954v).t(true);
    }

    private final void n() {
        k kVar = (k) this.f954v;
        boolean isPopupShowing = kVar.f12754h.isPopupShowing();
        kVar.t(isPopupShowing);
        kVar.f12759m = isPopupShowing;
    }

    private final void o() {
        e.a aVar = (e.a) this.f954v;
        je.e eVar = aVar.f21815b;
        eVar.getClass();
        kc.f.A(1, "IndexBackfiller", "Documents written: %s", Integer.valueOf(((Integer) eVar.f21810b.z("Backfill Indexes", new w(3, eVar))).intValue()));
        aVar.f21814a.a(a.c.INDEX_BACKFILL, je.e.f21808g, new b(29, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06cc A[Catch: IOException -> 0x072a, UnknownHostException -> 0x073f, TRY_LEAVE, TryCatch #18 {UnknownHostException -> 0x073f, IOException -> 0x072a, blocks: (B:291:0x063c, B:293:0x064d, B:300:0x0675, B:302:0x067f, B:307:0x068f, B:309:0x06cc, B:315:0x06e7, B:324:0x06f4, B:296:0x065b, B:297:0x065f, B:299:0x0665, B:325:0x0722, B:326:0x0729, B:310:0x06da, B:312:0x06e0, B:313:0x06e4), top: B:454:0x063c }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        Object obj;
        boolean z11;
        boolean z12;
        List a12;
        f.a aVar;
        h5.w wVar;
        h5.q qVar;
        String str;
        String str2;
        String str3;
        ?? r02;
        boolean z13;
        k5.a aVar2;
        k5.b bVar;
        String str4;
        LinkedHashMap linkedHashMap;
        e.a aVar3;
        ArrayList arrayList;
        k5.l lVar;
        k5.k kVar;
        k5.k kVar2;
        String a10;
        Locale locale;
        ?? r42 = 2;
        boolean z14 = true;
        switch (this.f953u) {
            case 0:
                ((ComponentActivity) this.f954v).invalidateMenu();
                return;
            case 1:
                g.a((g) this.f954v);
                return;
            case 2:
                ((OnBackPressedDispatcher) this.f954v).b();
                return;
            case 3:
                Activity activity = (Activity) this.f954v;
                int i6 = f0.a.f14598c;
                if (!activity.isFinishing()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                        Class<?> cls = f0.g.f14624a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = f0.g.f14624a;
                        if (i10 != 26 && i10 != 27) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        Method method = f0.g.f;
                        if ((!z10 || method != null) && (f0.g.f14628e != null || f0.g.f14627d != null)) {
                            try {
                                Object obj2 = f0.g.f14626c.get(activity);
                                if (obj2 != null && (obj = f0.g.f14625b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    g.a aVar4 = new g.a(activity);
                                    application.registerActivityLifecycleCallbacks(aVar4);
                                    Handler handler = f0.g.f14629g;
                                    handler.post(new f0.d(aVar4, obj2));
                                    if (i10 != 26 && i10 != 27) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    try {
                                        if (z11) {
                                            try {
                                                Object[] objArr = new Object[9];
                                                objArr[0] = obj2;
                                                objArr[1] = null;
                                                objArr[2] = null;
                                                objArr[3] = 0;
                                                Boolean bool = Boolean.FALSE;
                                                objArr[4] = bool;
                                                objArr[5] = null;
                                                objArr[6] = null;
                                                objArr[7] = bool;
                                                objArr[8] = bool;
                                                method.invoke(obj, objArr);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                handler.post(new f0.e(application, aVar4));
                                                throw th;
                                            }
                                        } else {
                                            activity.recreate();
                                        }
                                        try {
                                            handler.post(new f0.e(application, aVar4));
                                        } catch (Throwable unused) {
                                            z12 = false;
                                            if (!z12) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        z12 = false;
                        if (!z12) {
                            activity.recreate();
                            return;
                        }
                        return;
                    }
                    z12 = true;
                    if (!z12) {
                    }
                } else {
                    return;
                }
                break;
            case 4:
                ((d.c) this.f954v).f30232n = -1;
                return;
            case 5:
                x1.h hVar = (x1.h) this.f954v;
                synchronized (hVar.f37484m) {
                    hVar.f37478g = false;
                    hVar.f37480i.d();
                    hs.k kVar3 = hs.k.f19476a;
                }
                return;
            case 6:
                CoroutineWorker.a((CoroutineWorker) this.f954v);
                return;
            case 7:
                a();
                return;
            case 8:
                i5.l reason = (i5.l) this.f954v;
                String str5 = i5.f.f19852a;
                if (!b6.a.b(i5.f.class)) {
                    try {
                        kotlin.jvm.internal.i.g(reason, "$reason");
                        i5.f.d(reason);
                        return;
                    } catch (Throwable th4) {
                        b6.a.a(i5.f.class, th4);
                        return;
                    }
                }
                return;
            case 9:
                h5.q request = (h5.q) this.f954v;
                HashSet<Integer> hashSet = k5.f.f22988a;
                String str6 = "POST";
                kotlin.jvm.internal.i.g(request, "$request");
                String str7 = request.f17291b;
                if (str7 == null) {
                    a12 = null;
                } else {
                    a12 = r.a1(str7, new String[]{"/"}, 0, 6);
                }
                h5.w wVar2 = h5.w.DEVELOPER_ERRORS;
                String str8 = "CAPITransformerWebRequests";
                if (a12 != null && a12.size() == 2) {
                    try {
                        aVar = k5.f.f22990c;
                    } catch (UninitializedPropertyAccessException e10) {
                        e = e10;
                        r42 = "CAPITransformerWebRequests";
                    }
                    try {
                        if (aVar != null) {
                            String str9 = aVar.f22994b;
                            if (aVar != null) {
                                String str10 = str9 + "/capi/" + aVar.f22993a + "/events";
                                JSONObject jSONObject = request.f17292c;
                                h5.w wVar3 = h5.w.APP_EVENTS;
                                if (jSONObject != null) {
                                    LinkedHashMap z02 = e0.z0(w5.e0.h(jSONObject));
                                    Object obj3 = request.f17294e;
                                    if (obj3 != null) {
                                        String str11 = "custom_events";
                                        z02.put("custom_events", obj3);
                                        StringBuilder sb2 = new StringBuilder();
                                        for (String str12 : z02.keySet()) {
                                            sb2.append(str12);
                                            sb2.append(" : ");
                                            sb2.append(z02.get(str12));
                                            sb2.append(System.getProperty("line.separator"));
                                        }
                                        v.a aVar5 = w5.v.f36544d;
                                        v.a.b(wVar3, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
                                        Map<k5.b, e.c> map = k5.e.f22974a;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        ArrayList arrayList2 = new ArrayList();
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                        Object obj4 = z02.get("event");
                                        a.C0353a c0353a = k5.a.f22959u;
                                        if (obj4 != null) {
                                            String str13 = (String) obj4;
                                            c0353a.getClass();
                                            if (kotlin.jvm.internal.i.b(str13, "MOBILE_APP_INSTALL")) {
                                                aVar2 = k5.a.MOBILE_APP_INSTALL;
                                            } else if (kotlin.jvm.internal.i.b(str13, "CUSTOM_APP_EVENTS")) {
                                                aVar2 = k5.a.CUSTOM;
                                            } else {
                                                aVar2 = k5.a.OTHER;
                                            }
                                            k5.a aVar6 = aVar2;
                                            if (aVar6 != k5.a.OTHER) {
                                                for (Map.Entry entry : z02.entrySet()) {
                                                    h5.w wVar4 = wVar2;
                                                    String rawValue = (String) entry.getKey();
                                                    String str14 = str6;
                                                    Object value = entry.getValue();
                                                    String str15 = str8;
                                                    String str16 = "rawValue";
                                                    kotlin.jvm.internal.i.g(rawValue, "rawValue");
                                                    k5.b[] valuesCustom = k5.b.valuesCustom();
                                                    h5.q qVar2 = request;
                                                    int length = valuesCustom.length;
                                                    String str17 = str10;
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 < length) {
                                                            int i12 = length;
                                                            bVar = valuesCustom[i11];
                                                            k5.b[] bVarArr = valuesCustom;
                                                            if (!kotlin.jvm.internal.i.b(bVar.f22969u, rawValue)) {
                                                                i11++;
                                                                length = i12;
                                                                valuesCustom = bVarArr;
                                                            }
                                                        } else {
                                                            bVar = null;
                                                        }
                                                    }
                                                    LinkedHashMap linkedHashMap5 = z02;
                                                    if (bVar != null) {
                                                        kotlin.jvm.internal.i.g(value, "value");
                                                        Map<k5.b, e.c> map2 = k5.e.f22974a;
                                                        e.c cVar = map2.get(bVar);
                                                        if (cVar != null) {
                                                            int ordinal = cVar.f22981a.ordinal();
                                                            if (ordinal != 0) {
                                                                if (ordinal == 1) {
                                                                    e.c cVar2 = map2.get(bVar);
                                                                    if (cVar2 == null) {
                                                                        kVar2 = null;
                                                                    } else {
                                                                        kVar2 = cVar2.f22982b;
                                                                    }
                                                                    if (kVar2 != null) {
                                                                        linkedHashMap3.put(kVar2.f23018u, value);
                                                                    }
                                                                }
                                                            } else if (bVar == k5.b.USER_DATA) {
                                                                try {
                                                                    w5.e0 e0Var = w5.e0.f36453a;
                                                                    linkedHashMap2.putAll(w5.e0.h(new JSONObject((String) value)));
                                                                } catch (JSONException e11) {
                                                                    v.a aVar7 = w5.v.f36544d;
                                                                    v.a.b(wVar3, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e11);
                                                                }
                                                            } else {
                                                                e.c cVar3 = map2.get(bVar);
                                                                if (cVar3 == null) {
                                                                    kVar = null;
                                                                } else {
                                                                    kVar = cVar3.f22982b;
                                                                }
                                                                if (kVar != null) {
                                                                    linkedHashMap2.put(kVar.f23018u, value);
                                                                }
                                                            }
                                                        }
                                                        linkedHashMap = linkedHashMap3;
                                                        str4 = str11;
                                                    } else {
                                                        boolean b10 = kotlin.jvm.internal.i.b(rawValue, str11);
                                                        boolean z15 = value instanceof String;
                                                        str4 = str11;
                                                        if (aVar6 == k5.a.CUSTOM && b10 && z15) {
                                                            String appEvents = (String) value;
                                                            kotlin.jvm.internal.i.g(appEvents, "appEvents");
                                                            ArrayList arrayList3 = new ArrayList();
                                                            try {
                                                                w5.e0 e0Var2 = w5.e0.f36453a;
                                                                for (String str18 : w5.e0.g(new JSONArray(appEvents))) {
                                                                    w5.e0 e0Var3 = w5.e0.f36453a;
                                                                    arrayList3.add(w5.e0.h(new JSONObject(str18)));
                                                                }
                                                            } catch (JSONException e12) {
                                                                linkedHashMap = linkedHashMap3;
                                                                v.a aVar8 = w5.v.f36544d;
                                                                v.a.b(wVar3, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e12);
                                                            }
                                                            if (arrayList3.isEmpty()) {
                                                                linkedHashMap = linkedHashMap3;
                                                                arrayList = null;
                                                                if (arrayList == null) {
                                                                    arrayList2.addAll(arrayList);
                                                                }
                                                            } else {
                                                                arrayList = new ArrayList();
                                                                Iterator it = arrayList3.iterator();
                                                                while (it.hasNext()) {
                                                                    Map map3 = (Map) it.next();
                                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                                    for (String str19 : map3.keySet()) {
                                                                        kotlin.jvm.internal.i.g(str19, str16);
                                                                        Iterator it2 = it;
                                                                        k5.l[] valuesCustom2 = k5.l.valuesCustom();
                                                                        String str20 = str16;
                                                                        int length2 = valuesCustom2.length;
                                                                        LinkedHashMap linkedHashMap8 = linkedHashMap3;
                                                                        int i13 = 0;
                                                                        while (true) {
                                                                            if (i13 < length2) {
                                                                                int i14 = length2;
                                                                                lVar = valuesCustom2[i13];
                                                                                k5.l[] lVarArr = valuesCustom2;
                                                                                if (!kotlin.jvm.internal.i.b(lVar.f23024u, str19)) {
                                                                                    i13++;
                                                                                    length2 = i14;
                                                                                    valuesCustom2 = lVarArr;
                                                                                }
                                                                            } else {
                                                                                lVar = null;
                                                                            }
                                                                        }
                                                                        e.b bVar2 = k5.e.f22975b.get(lVar);
                                                                        if (lVar != null && bVar2 != null) {
                                                                            k5.h hVar2 = bVar2.f22980b;
                                                                            k5.j jVar = bVar2.f22979a;
                                                                            if (jVar != null) {
                                                                                if (jVar == k5.j.CUSTOM_DATA) {
                                                                                    String str21 = hVar2.f23002u;
                                                                                    Object obj5 = map3.get(str19);
                                                                                    if (obj5 != null) {
                                                                                        Object a11 = k5.e.a(obj5, str19);
                                                                                        if (a11 != null) {
                                                                                            linkedHashMap6.put(str21, a11);
                                                                                        } else {
                                                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                        }
                                                                                    } else {
                                                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    String str22 = hVar2.f23002u;
                                                                                    if (lVar == k5.l.EVENT_NAME && ((String) map3.get(str19)) != null) {
                                                                                        Object obj6 = map3.get(str19);
                                                                                        if (obj6 != null) {
                                                                                            String str23 = (String) obj6;
                                                                                            Map<String, k5.i> map4 = k5.e.f22976c;
                                                                                            if (map4.containsKey(str23)) {
                                                                                                k5.i iVar = map4.get(str23);
                                                                                                if (iVar == null) {
                                                                                                    str23 = "";
                                                                                                } else {
                                                                                                    str23 = iVar.f23008u;
                                                                                                }
                                                                                            }
                                                                                            linkedHashMap7.put(str22, str23);
                                                                                        } else {
                                                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                                                        }
                                                                                    } else if (lVar == k5.l.EVENT_TIME && ((Integer) map3.get(str19)) != null) {
                                                                                        Object obj7 = map3.get(str19);
                                                                                        if (obj7 != null) {
                                                                                            Object a13 = k5.e.a(obj7, str19);
                                                                                            if (a13 != null) {
                                                                                                linkedHashMap7.put(str22, a13);
                                                                                            } else {
                                                                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                            }
                                                                                        } else {
                                                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                        }
                                                                                    }
                                                                                } catch (ClassCastException e13) {
                                                                                    v.a aVar9 = w5.v.f36544d;
                                                                                    v.a.b(wVar3, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", ca.a.o1(e13));
                                                                                }
                                                                            }
                                                                        }
                                                                        it = it2;
                                                                        str16 = str20;
                                                                        linkedHashMap3 = linkedHashMap8;
                                                                    }
                                                                    LinkedHashMap linkedHashMap9 = linkedHashMap3;
                                                                    Iterator it3 = it;
                                                                    String str24 = str16;
                                                                    if (!linkedHashMap6.isEmpty()) {
                                                                        linkedHashMap7.put("custom_data", linkedHashMap6);
                                                                    }
                                                                    arrayList.add(linkedHashMap7);
                                                                    it = it3;
                                                                    str16 = str24;
                                                                    linkedHashMap3 = linkedHashMap9;
                                                                }
                                                                linkedHashMap = linkedHashMap3;
                                                                if (arrayList == null) {
                                                                }
                                                            }
                                                        } else {
                                                            linkedHashMap = linkedHashMap3;
                                                            e.a[] valuesCustom3 = e.a.valuesCustom();
                                                            int length3 = valuesCustom3.length;
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < length3) {
                                                                    aVar3 = valuesCustom3[i15];
                                                                    if (!kotlin.jvm.internal.i.b(aVar3.f22978u, rawValue)) {
                                                                        i15++;
                                                                    }
                                                                } else {
                                                                    aVar3 = null;
                                                                }
                                                            }
                                                            if (aVar3 != null) {
                                                                linkedHashMap4.put(rawValue, value);
                                                            }
                                                        }
                                                    }
                                                    str6 = str14;
                                                    wVar2 = wVar4;
                                                    str8 = str15;
                                                    request = qVar2;
                                                    str10 = str17;
                                                    z02 = linkedHashMap5;
                                                    str11 = str4;
                                                    linkedHashMap3 = linkedHashMap;
                                                }
                                            }
                                            wVar = wVar2;
                                            LinkedHashMap linkedHashMap10 = linkedHashMap3;
                                            qVar = request;
                                            str = str6;
                                            str2 = str8;
                                            str3 = str10;
                                            LinkedHashMap linkedHashMap11 = z02;
                                            if (aVar6 != k5.a.OTHER) {
                                                Object obj8 = linkedHashMap11.get("install_timestamp");
                                                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                                linkedHashMap12.put("action_source", "app");
                                                linkedHashMap12.put("user_data", linkedHashMap2);
                                                linkedHashMap12.put("app_data", linkedHashMap10);
                                                linkedHashMap12.putAll(linkedHashMap4);
                                                int ordinal2 = aVar6.ordinal();
                                                if (ordinal2 != 0) {
                                                    if (ordinal2 == 1 && !arrayList2.isEmpty()) {
                                                        r02 = new ArrayList();
                                                        Iterator it4 = arrayList2.iterator();
                                                        while (it4.hasNext()) {
                                                            LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                                                            linkedHashMap13.putAll(linkedHashMap12);
                                                            linkedHashMap13.putAll((Map) it4.next());
                                                            r02.add(linkedHashMap13);
                                                        }
                                                    }
                                                } else if (obj8 != null) {
                                                    LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                                                    linkedHashMap14.putAll(linkedHashMap12);
                                                    linkedHashMap14.put("event_name", "MobileAppInstall");
                                                    linkedHashMap14.put("event_time", obj8);
                                                    r02 = ca.a.O0(linkedHashMap14);
                                                }
                                                if (r02 == 0) {
                                                    k5.f.b().addAll(r02);
                                                    int max = Math.max(0, k5.f.b().size() - 1000);
                                                    if (max > 0) {
                                                        List<Map<String, Object>> b11 = kotlin.jvm.internal.c0.b(u.b2(k5.f.b(), max));
                                                        kotlin.jvm.internal.i.g(b11, "<set-?>");
                                                        k5.f.f22991d = b11;
                                                    }
                                                    int min = Math.min(k5.f.b().size(), 10);
                                                    List B2 = u.B2(k5.f.b(), new xs.f(0, min - 1));
                                                    k5.f.b().subList(0, min).clear();
                                                    JSONArray jSONArray = new JSONArray((Collection) B2);
                                                    LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                                                    linkedHashMap15.put("data", jSONArray);
                                                    f.a aVar10 = k5.f.f22990c;
                                                    if (aVar10 != null) {
                                                        linkedHashMap15.put("accessKey", aVar10.f22995c);
                                                        JSONObject jSONObject2 = new JSONObject(linkedHashMap15);
                                                        v.a aVar11 = w5.v.f36544d;
                                                        String jSONObject3 = jSONObject2.toString(2);
                                                        kotlin.jvm.internal.i.f(jSONObject3, "jsonBodyStr.toString(2)");
                                                        Object[] objArr2 = {str3, qVar, jSONObject3};
                                                        String str25 = str2;
                                                        v.a.b(wVar3, str25, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", objArr2);
                                                        String jSONObject4 = jSONObject2.toString();
                                                        Map Q = sp.b.Q(new hs.f("Content-Type", "application/json"));
                                                        k5.g gVar = new k5.g(B2);
                                                        String urlStr = str3;
                                                        kotlin.jvm.internal.i.g(urlStr, "urlStr");
                                                        try {
                                                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
                                                            if (uRLConnection != null) {
                                                                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                                                                String str26 = str;
                                                                httpURLConnection.setRequestMethod(str26);
                                                                Set<String> keySet = Q.keySet();
                                                                if (keySet != null) {
                                                                    for (String str27 : keySet) {
                                                                        httpURLConnection.setRequestProperty(str27, (String) Q.get(str27));
                                                                    }
                                                                }
                                                                if (!httpURLConnection.getRequestMethod().equals(str26) && !httpURLConnection.getRequestMethod().equals("PUT")) {
                                                                    z13 = false;
                                                                    httpURLConnection.setDoOutput(z13);
                                                                    httpURLConnection.setConnectTimeout(60000);
                                                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                                                                    bufferedWriter.write(jSONObject4);
                                                                    bufferedWriter.flush();
                                                                    bufferedWriter.close();
                                                                    bufferedOutputStream.close();
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    if (k5.f.f22988a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                                                        while (true) {
                                                                            String readLine = bufferedReader.readLine();
                                                                            if (readLine != null) {
                                                                                sb3.append(readLine);
                                                                            } else {
                                                                                hs.k kVar4 = hs.k.f19476a;
                                                                                ca.a.z(bufferedReader, null);
                                                                            }
                                                                        }
                                                                    }
                                                                    String sb4 = sb3.toString();
                                                                    kotlin.jvm.internal.i.f(sb4, "connResponseSB.toString()");
                                                                    v.a aVar12 = w5.v.f36544d;
                                                                    v.a.b(wVar3, str25, "\nResponse Received: \n%s\n%s", sb4, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                                    gVar.invoke(sb4, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                                    return;
                                                                }
                                                                z13 = true;
                                                                httpURLConnection.setDoOutput(z13);
                                                                httpURLConnection.setConnectTimeout(60000);
                                                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                                                                bufferedWriter2.write(jSONObject4);
                                                                bufferedWriter2.flush();
                                                                bufferedWriter2.close();
                                                                bufferedOutputStream2.close();
                                                                StringBuilder sb32 = new StringBuilder();
                                                                if (k5.f.f22988a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                                                }
                                                                String sb42 = sb32.toString();
                                                                kotlin.jvm.internal.i.f(sb42, "connResponseSB.toString()");
                                                                v.a aVar122 = w5.v.f36544d;
                                                                v.a.b(wVar3, str25, "\nResponse Received: \n%s\n%s", sb42, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                                gVar.invoke(sb42, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                                                        } catch (UnknownHostException e14) {
                                                            v.a aVar13 = w5.v.f36544d;
                                                            v.a.b(wVar3, str25, "Connection failed, retrying: \n%s", e14.toString());
                                                            gVar.invoke(null, 503);
                                                            return;
                                                        } catch (IOException e15) {
                                                            v.a aVar14 = w5.v.f36544d;
                                                            v.a.b(wVar, str25, "Send to server failed: \n%s", e15.toString());
                                                            return;
                                                        }
                                                    }
                                                    kotlin.jvm.internal.i.q("credentials");
                                                    throw null;
                                                }
                                                return;
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                } else {
                                    wVar = wVar2;
                                    qVar = request;
                                    str = "POST";
                                    str2 = "CAPITransformerWebRequests";
                                    str3 = str10;
                                }
                                r02 = 0;
                                if (r02 == 0) {
                                }
                            } else {
                                kotlin.jvm.internal.i.q("credentials");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("credentials");
                            throw null;
                        }
                    } catch (UninitializedPropertyAccessException e16) {
                        e = e16;
                        v.a aVar15 = w5.v.f36544d;
                        v.a.b(wVar2, r42, "\n Credentials not initialized Error when logging: \n%s", e);
                        return;
                    }
                } else {
                    v.a aVar16 = w5.v.f36544d;
                    v.a.b(wVar2, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
                    return;
                }
                break;
            case 10:
                String str28 = (String) this.f954v;
                l5.b bVar3 = l5.b.f24059a;
                String str29 = "0";
                if (!b6.a.b(l5.b.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        Context a14 = h5.p.a();
                        w5.a aVar17 = w5.a.f;
                        w5.a a15 = a.C0610a.a(a14);
                        JSONArray jSONArray2 = new JSONArray();
                        String str30 = Build.MODEL;
                        if (str30 == null) {
                            str30 = "";
                        }
                        jSONArray2.put(str30);
                        if (a15 == null) {
                            a10 = null;
                        } else {
                            a10 = a15.a();
                        }
                        if (a10 != null) {
                            jSONArray2.put(a15.a());
                        } else {
                            jSONArray2.put("");
                        }
                        jSONArray2.put("0");
                        if (q5.d.c()) {
                            str29 = "1";
                        }
                        jSONArray2.put(str29);
                        w5.e0 e0Var4 = w5.e0.f36453a;
                        try {
                            locale = h5.p.a().getResources().getConfiguration().locale;
                        } catch (Exception unused3) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            kotlin.jvm.internal.i.f(locale, "getDefault()");
                        }
                        jSONArray2.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                        String jSONArray3 = jSONArray2.toString();
                        kotlin.jvm.internal.i.f(jSONArray3, "extInfoArray.toString()");
                        bundle.putString("device_session_id", l5.b.a());
                        bundle.putString("extinfo", jSONArray3);
                        String str31 = h5.q.f17287j;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str28}, 1));
                        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                        JSONObject jSONObject5 = q.c.i(format, bundle, null).c().f17317b;
                        AtomicBoolean atomicBoolean = l5.b.f24064g;
                        if (jSONObject5 == null || !jSONObject5.optBoolean("is_app_indexing_enabled", false)) {
                            z14 = false;
                        }
                        atomicBoolean.set(z14);
                        if (!atomicBoolean.get()) {
                            l5.b.f24063e = null;
                        } else {
                            l5.e eVar = l5.b.f24062d;
                            if (eVar != null) {
                                eVar.c();
                            }
                        }
                        l5.b.f24065h = false;
                        return;
                    } catch (Throwable th5) {
                        b6.a.a(l5.b.class, th5);
                        return;
                    }
                }
                return;
            case 11:
                l5.c this$0 = (l5.c) this.f954v;
                c.a aVar18 = l5.c.f;
                if (!b6.a.b(l5.c.class)) {
                    try {
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.b();
                        return;
                    } catch (Throwable th6) {
                        b6.a.a(l5.c.class, th6);
                        return;
                    }
                }
                return;
            case 12:
                b();
                return;
            case 13:
                w5.k.g((w5.k) this.f954v);
                return;
            case 14:
                w5.n nVar = w5.n.f36507a;
                ((n.a) this.f954v).a();
                return;
            case 15:
                c();
                return;
            case 16:
                d();
                return;
            case 17:
                e();
                return;
            case 18:
                f();
                return;
            case 19:
                g();
                return;
            case 20:
                h();
                return;
            case 21:
                i();
                return;
            case 22:
                ((MediaCodec) this.f954v).start();
                return;
            case 23:
                j();
                return;
            case 24:
                k();
                return;
            case 25:
            default:
                o();
                return;
            case 26:
                l();
                return;
            case 27:
                m();
                return;
            case 28:
                n();
                return;
        }
    }
}

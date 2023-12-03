package g;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.strictmode.Violation;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.p;
import com.facebook.FacebookException;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.source.i;
import g.w;
import h1.a;
import h5.a;
import h5.q;
import h5.t;
import i0.f;
import i5.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.e;
import n.b;
import n2.d0;
import o5.e;
import org.json.JSONException;
import org.json.JSONObject;
import q5.e;
import s5.d;
import w5.a;
import w5.e0;
import w5.p;
import x1.h;
import x1.k;
import x2.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16135u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f16136v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f16137w;

    public /* synthetic */ v(Object obj, int i6, Object obj2) {
        this.f16135u = i6;
        this.f16136v = obj;
        this.f16137w = obj2;
    }

    private final void a() {
        ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f16136v;
        rc.b<? extends p.a> innerFuture = (rc.b) this.f16137w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(innerFuture, "$innerFuture");
        synchronized (this$0.f3319v) {
            if (this$0.f3320w) {
                x2.c<p.a> future = this$0.f3321x;
                kotlin.jvm.internal.i.f(future, "future");
                String str = z2.a.f39137a;
                future.i(new p.a.b());
            } else {
                this$0.f3321x.k(innerFuture);
            }
            hs.k kVar = hs.k.f19476a;
        }
    }

    private final void b() {
        i5.a accessTokenAppId = (i5.a) this.f16136v;
        i5.d appEvent = (i5.d) this.f16137w;
        String str = i5.f.f19852a;
        if (!b6.a.b(i5.f.class)) {
            try {
                kotlin.jvm.internal.i.g(accessTokenAppId, "$accessTokenAppId");
                kotlin.jvm.internal.i.g(appEvent, "$appEvent");
                w.d dVar = i5.f.f19854c;
                synchronized (dVar) {
                    i5.q e10 = dVar.e(accessTokenAppId);
                    if (e10 != null) {
                        e10.a(appEvent);
                    }
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i5.i.f19861c;
                if (i.a.b() != i5.h.EXPLICIT_ONLY && i5.f.f19854c.c() > i5.f.f19853b) {
                    i5.f.d(i5.l.EVENT_THRESHOLD);
                } else if (i5.f.f19856e == null) {
                    i5.f.f19856e = i5.f.f19855d.schedule(i5.f.f, 15L, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                b6.a.a(i5.f.class, th2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        switch (this.f16135u) {
            case 0:
                w.a aVar = (w.a) this.f16136v;
                Runnable runnable = (Runnable) this.f16137w;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                androidx.constraintlayout.motion.widget.c cVar = (androidx.constraintlayout.motion.widget.c) this.f16136v;
                View[] viewArr = (View[]) this.f16137w;
                if (cVar.f1729p != -1) {
                    for (View view : viewArr) {
                        view.setTag(cVar.f1729p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (cVar.f1730q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(cVar.f1730q, null);
                    }
                    return;
                }
                return;
            case 2:
                ((f.e) this.f16136v).d((Typeface) this.f16137w);
                return;
            case 3:
            default:
                com.google.android.exoplayer2.x xVar = (com.google.android.exoplayer2.x) this.f16137w;
                ((com.google.android.exoplayer2.m) this.f16136v).getClass();
                try {
                    com.google.android.exoplayer2.m.d(xVar);
                    return;
                } catch (ExoPlaybackException e10) {
                    ca.a.Q("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 4:
                Violation violation = (Violation) this.f16137w;
                a.b bVar = h1.a.f16999a;
                kotlin.jvm.internal.i.g(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) this.f16136v), violation);
                throw violation;
            case 5:
                x1.k this$0 = (x1.k) this.f16136v;
                String[] tables = (String[]) this.f16137w;
                int i6 = k.b.f37510b;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(tables, "$tables");
                x1.h hVar = this$0.f37501b;
                String[] tables2 = (String[]) Arrays.copyOf(tables, tables.length);
                hVar.getClass();
                kotlin.jvm.internal.i.g(tables2, "tables");
                synchronized (hVar.f37482k) {
                    Iterator<Map.Entry<h.c, h.d>> it = hVar.f37482k.iterator();
                    while (true) {
                        b.e eVar = (b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            kotlin.jvm.internal.i.f(entry, "(observer, wrapper)");
                            h.c cVar2 = (h.c) entry.getKey();
                            h.d dVar = (h.d) entry.getValue();
                            cVar2.getClass();
                            if (!(cVar2 instanceof k.a)) {
                                dVar.b(tables2);
                            }
                        } else {
                            hs.k kVar = hs.k.f19476a;
                        }
                    }
                }
                return;
            case 6:
                Runnable command = (Runnable) this.f16137w;
                x1.v this$02 = (x1.v) this.f16136v;
                kotlin.jvm.internal.i.g(command, "$command");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$02.a();
                }
            case 7:
                rc.b bVar2 = (rc.b) this.f16137w;
                if (((d0) this.f16136v).K.f37581u instanceof a.b) {
                    bVar2.cancel(true);
                    return;
                }
                return;
            case 8:
                List<r2.a> listenersList = (List) this.f16136v;
                t2.g this$03 = (t2.g) this.f16137w;
                kotlin.jvm.internal.i.g(listenersList, "$listenersList");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                for (r2.a aVar2 : listenersList) {
                    aVar2.a(this$03.f32398e);
                }
                return;
            case 9:
                w2.u uVar = (w2.u) this.f16136v;
                x2.c cVar3 = (x2.c) this.f16137w;
                if (!(uVar.f36325u.f37581u instanceof a.b)) {
                    cVar3.k(uVar.f36328x.getForegroundInfoAsync());
                    return;
                } else {
                    cVar3.cancel(true);
                    return;
                }
            case 10:
                a();
                return;
            case 11:
                h5.f this$04 = (h5.f) this.f16136v;
                defpackage.e.t(this.f16137w);
                kotlin.jvm.internal.i.g(this$04, "this$0");
                this$04.a();
                return;
            case 12:
                Context applicationContext = (Context) this.f16136v;
                String applicationId = (String) this.f16137w;
                h5.p pVar = h5.p.f17269a;
                kotlin.jvm.internal.i.g(applicationId, "$applicationId");
                kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
                h5.p pVar2 = h5.p.f17269a;
                pVar2.getClass();
                try {
                    if (!b6.a.b(pVar2)) {
                        try {
                            w5.a aVar3 = w5.a.f;
                            w5.a a10 = a.C0610a.a(applicationContext);
                            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                            String n10 = kotlin.jvm.internal.i.n("ping", applicationId);
                            long j11 = sharedPreferences.getLong(n10, 0L);
                            try {
                                HashMap hashMap = q5.e.f29149a;
                                JSONObject a11 = q5.e.a(e.a.MOBILE_INSTALL_EVENT, a10, kc.f.D(applicationContext), h5.p.f(applicationContext), applicationContext);
                                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
                                kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                                h5.p.f17285s.getClass();
                                String str = h5.q.f17287j;
                                h5.q h10 = q.c.h(null, format, a11, null);
                                if (j11 == 0 && h10.c().f17318c == null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putLong(n10, System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            } catch (JSONException e11) {
                                throw new FacebookException("An error occurred while publishing install.", e11);
                            }
                        } catch (Exception unused) {
                            e0 e0Var = e0.f36453a;
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    b6.a.a(pVar2, th2);
                    return;
                }
            case 13:
                ArrayList callbacks = (ArrayList) this.f16136v;
                h5.t requests = (h5.t) this.f16137w;
                kotlin.jvm.internal.i.g(callbacks, "$callbacks");
                kotlin.jvm.internal.i.g(requests, "$requests");
                Iterator it2 = callbacks.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Object obj = pair.second;
                    kotlin.jvm.internal.i.f(obj, "pair.second");
                    ((q.b) pair.first).a((h5.u) obj);
                }
                Iterator it3 = requests.f17314x.iterator();
                while (it3.hasNext()) {
                    ((t.a) it3.next()).b(requests);
                }
                return;
            case 14:
                t.a callback = (t.a) this.f16136v;
                int i10 = h5.b0.B;
                kotlin.jvm.internal.i.g(callback, "$callback");
                kotlin.jvm.internal.i.g((h5.b0) this.f16137w, "this$0");
                ((t.b) callback).a();
                return;
            case 15:
                b();
                return;
            case 16:
                i5.a accessTokenAppId = (i5.a) this.f16136v;
                i5.q appEvents = (i5.q) this.f16137w;
                String str2 = i5.f.f19852a;
                if (!b6.a.b(i5.f.class)) {
                    try {
                        kotlin.jvm.internal.i.g(accessTokenAppId, "$accessTokenAppId");
                        kotlin.jvm.internal.i.g(appEvents, "$appEvents");
                        i5.g.a(accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th3) {
                        b6.a.a(i5.f.class, th3);
                        return;
                    }
                }
                return;
            case 17:
                Context context = (Context) this.f16136v;
                i5.i logger = (i5.i) this.f16137w;
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(logger, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    String str3 = strArr[i11];
                    String str4 = strArr2[i11];
                    try {
                        Class.forName(str3);
                        bundle.putInt(str4, 1);
                        i12 |= 1 << i11;
                    } catch (ClassNotFoundException unused2) {
                    }
                    if (i13 > 10) {
                        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences2.getInt("kitsBitmask", 0) != i12) {
                            sharedPreferences2.edit().putInt("kitsBitmask", i12).apply();
                            logger.f("fb_sdk_initialize", bundle);
                            return;
                        }
                        return;
                    }
                    i11 = i13;
                }
            case 18:
                View view3 = (View) this.f16136v;
                j5.d this$05 = (j5.d) this.f16137w;
                HashMap hashMap2 = j5.d.f21678y;
                if (!b6.a.b(j5.d.class)) {
                    try {
                        kotlin.jvm.internal.i.g(view3, "$view");
                        kotlin.jvm.internal.i.g(this$05, "this$0");
                        if (view3 instanceof EditText) {
                            this$05.b(view3);
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        b6.a.a(j5.d.class, th4);
                        return;
                    }
                }
                return;
            case 19:
                Integer num = (Integer) this.f16136v;
                List processedEvents = (List) this.f16137w;
                kotlin.jvm.internal.i.g(processedEvents, "$processedEvents");
                if (!is.u.Z1(k5.f.f22988a, num) && is.u.Z1(k5.f.f22989b, num)) {
                    if (k5.f.f22992e >= 5) {
                        k5.f.b().clear();
                        k5.f.f22992e = 0;
                        return;
                    }
                    k5.f.b().addAll(0, processedEvents);
                    k5.f.f22992e++;
                    return;
                }
                return;
            case 20:
                String eventName = (String) this.f16136v;
                Bundle parameters = (Bundle) this.f16137w;
                l5.a aVar4 = l5.a.f24048a;
                if (!b6.a.b(l5.a.class)) {
                    try {
                        kotlin.jvm.internal.i.g(eventName, "$eventName");
                        kotlin.jvm.internal.i.g(parameters, "$parameters");
                        new i5.i(h5.p.a(), (String) null).d(parameters, eventName);
                        return;
                    } catch (Throwable th5) {
                        b6.a.a(l5.a.class, th5);
                        return;
                    }
                }
                return;
            case 21:
                l5.e this$06 = (l5.e) this.f16136v;
                TimerTask indexingTask = (TimerTask) this.f16137w;
                String str5 = l5.e.f24084e;
                if (!b6.a.b(l5.e.class)) {
                    try {
                        kotlin.jvm.internal.i.g(this$06, "this$0");
                        kotlin.jvm.internal.i.g(indexingTask, "$indexingTask");
                        try {
                            Timer timer = this$06.f24087c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            this$06.f24088d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                            this$06.f24087c = timer2;
                            return;
                        } catch (Exception e12) {
                            Log.e(l5.e.f24084e, "Error scheduling indexing job", e12);
                            return;
                        }
                    } catch (Throwable th6) {
                        b6.a.a(l5.e.class, th6);
                        return;
                    }
                }
                return;
            case 22:
                String tree = (String) this.f16136v;
                l5.e this$07 = (l5.e) this.f16137w;
                String str6 = l5.e.f24084e;
                if (!b6.a.b(l5.e.class)) {
                    try {
                        kotlin.jvm.internal.i.g(tree, "$tree");
                        kotlin.jvm.internal.i.g(this$07, "this$0");
                        e0.f36453a.getClass();
                        byte[] bytes = tree.getBytes(gv.a.f16927b);
                        kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                        String u10 = e0.u("MD5", bytes);
                        Date date = h5.a.F;
                        h5.a b10 = a.b.b();
                        if (u10 == null || !kotlin.jvm.internal.i.b(u10, this$07.f24088d)) {
                            this$07.b(e.a.a(tree, b10, h5.p.b()), u10);
                            return;
                        }
                        return;
                    } catch (Throwable th7) {
                        b6.a.a(l5.e.class, th7);
                        return;
                    }
                }
                return;
            case 23:
                o5.e this$08 = (o5.e) this.f16136v;
                Runnable queryPurchaseHistoryRunnable = (Runnable) this.f16137w;
                e.b bVar3 = o5.e.f27128s;
                if (!b6.a.b(o5.e.class)) {
                    try {
                        kotlin.jvm.internal.i.g(this$08, "this$0");
                        kotlin.jvm.internal.i.g(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
                        this$08.d(new ArrayList(this$08.r), queryPurchaseHistoryRunnable);
                        return;
                    } catch (Throwable th8) {
                        b6.a.a(o5.e.class, th8);
                        return;
                    }
                }
                return;
            case 24:
                String applicationId2 = (String) this.f16136v;
                i5.d event = (i5.d) this.f16137w;
                s5.b bVar4 = s5.b.f31274a;
                if (!b6.a.b(s5.b.class)) {
                    try {
                        kotlin.jvm.internal.i.g(applicationId2, "$applicationId");
                        kotlin.jvm.internal.i.g(event, "$event");
                        s5.d dVar2 = s5.d.f31277a;
                        List<i5.d> O0 = ca.a.O0(event);
                        if (!b6.a.b(s5.d.class)) {
                            s5.d.f31277a.b(d.a.CUSTOM_APP_EVENTS, applicationId2, O0);
                            return;
                        }
                        return;
                    } catch (Throwable th9) {
                        b6.a.a(s5.b.class, th9);
                        return;
                    }
                }
                return;
            case 25:
                w5.p pVar3 = w5.p.f36526a;
                ((p.b) this.f16136v).onSuccess();
                return;
            case 26:
                g6.s this$09 = (g6.s) this.f16136v;
                Bundle bundle2 = (Bundle) this.f16137w;
                ScheduledExecutorService scheduledExecutorService = g6.s.f16328d;
                if (!b6.a.b(g6.s.class)) {
                    try {
                        kotlin.jvm.internal.i.g(this$09, "this$0");
                        kotlin.jvm.internal.i.g(bundle2, "$bundle");
                        this$09.f16330b.a(bundle2, "fb_mobile_login_heartbeat");
                        return;
                    } catch (Throwable th10) {
                        b6.a.a(g6.s.class, th10);
                        return;
                    }
                }
                return;
            case 27:
                int i14 = JobInfoSchedulerService.f6153u;
                ((JobInfoSchedulerService) this.f16136v).jobFinished((JobParameters) this.f16137w, false);
                return;
            case 28:
                com.google.android.exoplayer2.k kVar2 = (com.google.android.exoplayer2.k) this.f16136v;
                m.d dVar3 = (m.d) this.f16137w;
                int i15 = kVar2.f6552w - dVar3.f6578c;
                kVar2.f6552w = i15;
                if (dVar3.f6579d) {
                    kVar2.f6553x = dVar3.f6580e;
                    kVar2.f6554y = true;
                }
                if (dVar3.f) {
                    kVar2.f6555z = dVar3.f6581g;
                }
                if (i15 == 0) {
                    com.google.android.exoplayer2.e0 e0Var2 = dVar3.f6577b.f27235a;
                    if (!kVar2.E.f27235a.q() && e0Var2.q()) {
                        kVar2.F = -1;
                        kVar2.G = 0L;
                    }
                    if (!e0Var2.q()) {
                        List asList = Arrays.asList(((o7.t) e0Var2).D);
                        if (asList.size() == kVar2.f6542l.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        sc.b.C(z11);
                        for (int i16 = 0; i16 < asList.size(); i16++) {
                            ((k.a) kVar2.f6542l.get(i16)).f6557b = (com.google.android.exoplayer2.e0) asList.get(i16);
                        }
                    }
                    long j12 = -9223372036854775807L;
                    if (kVar2.f6554y) {
                        if (dVar3.f6577b.f27236b.equals(kVar2.E.f27236b) && dVar3.f6577b.f27238d == kVar2.E.f27251s) {
                            z12 = false;
                        }
                        if (z12) {
                            if (!e0Var2.q() && !dVar3.f6577b.f27236b.a()) {
                                o7.s sVar = dVar3.f6577b;
                                i.a aVar5 = sVar.f27236b;
                                long j13 = sVar.f27238d;
                                Object obj2 = aVar5.f27272a;
                                e0.b bVar5 = kVar2.f6541k;
                                e0Var2.h(obj2, bVar5);
                                j12 = j13 + bVar5.f6469y;
                            } else {
                                j12 = dVar3.f6577b.f27238d;
                            }
                        }
                        j10 = j12;
                        z10 = z12;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    kVar2.f6554y = false;
                    kVar2.A0(dVar3.f6577b, 1, kVar2.f6555z, false, z10, kVar2.f6553x, j10, -1);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v(Runnable runnable, x1.v vVar) {
        this.f16135u = 6;
        this.f16137w = runnable;
        this.f16136v = vVar;
    }
}

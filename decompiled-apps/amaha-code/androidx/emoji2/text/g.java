package androidx.emoji2.text;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import com.appsflyer.internal.AFb1xSDK;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.w;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.perf.session.SessionManager;
import d9.o;
import g6.b0;
import g6.p;
import he.c0;
import he.d0;
import he.e0;
import hh.g;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import je.a0;
import je.b1;
import je.k;
import lf.i;
import mi.i1;
import mi.r1;
import mi.t1;
import nd.z;
import p7.n;
import qg.f0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2050u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f2051v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f2052w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f2053x;

    public /* synthetic */ g(int i6, Object obj, Object obj2, Object obj3) {
        this.f2050u = i6;
        this.f2051v = obj;
        this.f2052w = obj2;
        this.f2053x = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        T t3;
        switch (this.f2050u) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f2051v;
                f.h hVar = (f.h) this.f2052w;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f2053x;
                bVar.getClass();
                try {
                    l a10 = c.a(bVar.f2027a);
                    if (a10 != null) {
                        l.b bVar2 = (l.b) a10.f2045a;
                        synchronized (bVar2.f2075d) {
                            bVar2.f = threadPoolExecutor;
                        }
                        a10.f2045a.a(new h(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    hVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                String sql = (String) this.f2052w;
                List inputArguments = (List) this.f2053x;
                kotlin.jvm.internal.i.g((x1.l) this.f2051v, "this$0");
                kotlin.jvm.internal.i.g(sql, "$sql");
                kotlin.jvm.internal.i.g(inputArguments, "$inputArguments");
                throw null;
            case 2:
                ((AFb1xSDK) this.f2051v).values((Context) this.f2052w, (Intent) this.f2053x);
                return;
            case 3:
                g6.b this$0 = (g6.b) this.f2051v;
                p.d request = (p.d) this.f2052w;
                Bundle values = (Bundle) this.f2053x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(request, "$request");
                kotlin.jvm.internal.i.g(values, "$values");
                try {
                    this$0.i(values, request);
                    this$0.n(request, values, null);
                    return;
                } catch (FacebookException e10) {
                    this$0.n(request, null, e10);
                    return;
                }
            case 4:
                b0 this$02 = (b0) this.f2051v;
                p.d request2 = (p.d) this.f2052w;
                Bundle extras = (Bundle) this.f2053x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(request2, "$request");
                kotlin.jvm.internal.i.g(extras, "$extras");
                try {
                    this$02.i(extras, request2);
                    this$02.o(extras, request2);
                    return;
                } catch (FacebookServiceException e11) {
                    h5.n nVar = e11.f6110v;
                    this$02.n(request2, nVar.f17262x, nVar.a(), String.valueOf(nVar.f17260v));
                    return;
                } catch (FacebookException e12) {
                    this$02.n(request2, null, e12.getMessage(), null);
                    return;
                }
            case 5:
                com.google.android.exoplayer2.s sVar = (com.google.android.exoplayer2.s) this.f2051v;
                i.a aVar = (i.a) this.f2053x;
                sVar.getClass();
                l0 c10 = ((s.a) this.f2052w).c();
                p7.n nVar2 = sVar.f6785c;
                w wVar = nVar2.A;
                wVar.getClass();
                n.a aVar2 = nVar2.f27966x;
                aVar2.getClass();
                aVar2.f27970b = com.google.common.collect.s.z(c10);
                if (!c10.isEmpty()) {
                    aVar2.f27973e = (i.a) c10.get(0);
                    aVar.getClass();
                    aVar2.f = aVar;
                }
                if (aVar2.f27972d == null) {
                    aVar2.f27972d = n.a.b(wVar, aVar2.f27970b, aVar2.f27973e, aVar2.f27969a);
                }
                aVar2.d(wVar.Q());
                return;
            case 6:
                a.C0132a c0132a = (a.C0132a) this.f2051v;
                c0132a.getClass();
                int i6 = c9.w.f5205a;
                com.google.android.exoplayer2.audio.a aVar3 = c0132a.f6254b;
                aVar3.d();
                aVar3.U((com.google.android.exoplayer2.n) this.f2052w, (r7.f) this.f2053x);
                return;
            case 7:
                c.a aVar4 = (c.a) this.f2051v;
                ((com.google.android.exoplayer2.drm.c) this.f2052w).u(aVar4.f6438a, aVar4.f6439b, (Exception) this.f2053x);
                return;
            case 8:
                j.a aVar5 = (j.a) this.f2051v;
                ((com.google.android.exoplayer2.source.j) this.f2052w).n(aVar5.f6896a, aVar5.f6897b, (o8.e) this.f2053x);
                return;
            case 9:
                ((AdsMediaSource.a) this.f2051v).getClass();
                int i10 = AdsMediaSource.f6823j;
                throw null;
            case 10:
                o.a aVar6 = (o.a) this.f2051v;
                aVar6.getClass();
                int i11 = c9.w.f5205a;
                d9.o oVar = aVar6.f12710b;
                oVar.j();
                oVar.a0((com.google.android.exoplayer2.n) this.f2052w, (r7.f) this.f2053x);
                return;
            case 11:
                he.d dVar = (he.d) this.f2051v;
                Object obj = this.f2052w;
                FirebaseFirestoreException firebaseFirestoreException = (FirebaseFirestoreException) this.f2053x;
                if (!dVar.f17469c) {
                    dVar.f17468b.a(obj, firebaseFirestoreException);
                    return;
                }
                return;
            case 12:
                List<le.f> list = (List) this.f2052w;
                ya.i iVar = (ya.i) this.f2053x;
                c0 c0Var = ((he.n) this.f2051v).f17554g;
                c0Var.g("writeMutations");
                je.k kVar = c0Var.f17452a;
                kVar.getClass();
                sc.h hVar2 = new sc.h(new Date());
                HashSet hashSet = new HashSet();
                for (le.f fVar : list) {
                    hashSet.add(fVar.f24215a);
                }
                je.g gVar = (je.g) kVar.f21846a.z("Locally write mutations", new k7.m(kVar, hashSet, list, hVar2));
                int i12 = gVar.f21825a;
                HashMap hashMap = c0Var.f17460j;
                Map map = (Map) hashMap.get(c0Var.f17463m);
                if (map == null) {
                    map = new HashMap();
                    hashMap.put(c0Var.f17463m, map);
                }
                map.put(Integer.valueOf(i12), iVar);
                c0Var.h(gVar.f21826b, null);
                c0Var.f17453b.b();
                return;
            case 13:
                je.k kVar2 = (je.k) this.f2051v;
                k.a aVar7 = (k.a) this.f2052w;
                d0 d0Var = (d0) this.f2053x;
                e0 e0Var = kVar2.f21856l;
                int i13 = e0Var.f17480b;
                e0Var.f17480b = i13 + 2;
                aVar7.f21858b = i13;
                b1 b1Var = new b1(d0Var, i13, kVar2.f21846a.r().d(), a0.LISTEN);
                aVar7.f21857a = b1Var;
                kVar2.f21853i.a(b1Var);
                return;
            case 14:
                com.google.firebase.messaging.i.b((com.google.firebase.messaging.i) this.f2051v, (Intent) this.f2052w, (ya.i) this.f2053x);
                return;
            case 15:
                SessionManager.b((SessionManager) this.f2051v, (Context) this.f2052w, (hf.a) this.f2053x);
                return;
            case 16:
                jf.e eVar = (jf.e) this.f2051v;
                df.a aVar8 = jf.e.L;
                eVar.getClass();
                i.a S = lf.i.S();
                S.u();
                lf.i.O((lf.i) S.f10073v, (lf.m) this.f2052w);
                eVar.d(S, (lf.d) this.f2053x);
                return;
            case 17:
                jf.e eVar2 = (jf.e) this.f2051v;
                df.a aVar9 = jf.e.L;
                eVar2.getClass();
                i.a S2 = lf.i.S();
                S2.u();
                lf.i.P((lf.i) S2.f10073v, (lf.h) this.f2052w);
                eVar2.d(S2, (lf.d) this.f2053x);
                return;
            case 18:
                jf.e eVar3 = (jf.e) this.f2051v;
                df.a aVar10 = jf.e.L;
                eVar3.getClass();
                i.a S3 = lf.i.S();
                S3.u();
                lf.i.N((lf.i) S3.f10073v, (lf.g) this.f2052w);
                eVar3.d(S3, (lf.d) this.f2053x);
                return;
            case 19:
                Pattern pattern = of.d.f27448e;
                ((aa.b) this.f2051v).a((String) this.f2052w, (of.c) this.f2053x);
                return;
            case 20:
                qg.d this$03 = (qg.d) this.f2051v;
                Context context = (Context) this.f2052w;
                ih.b complianceType = (ih.b) this.f2053x;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                ih.p pVar = this$03.f29536a;
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(complianceType, "$complianceType");
                try {
                    hh.g.b(pVar.f20105d, 0, new qg.a(this$03), 3);
                    qg.w.f29578a.getClass();
                    qg.w.f(context, pVar).r();
                    if (complianceType != ih.b.GDPR) {
                        sg.a a11 = qg.w.a(context, pVar);
                        ih.p pVar2 = a11.f31520b;
                        hh.g.b(pVar2.f20105d, 0, new sg.o(a11), 3);
                        hh.g.b(pVar2.f20105d, 0, new sg.c(a11), 3);
                        a11.f31524g = null;
                        qg.w.f(a11.f31519a, pVar2).O();
                    }
                    gh.a aVar11 = gh.c.f16512a;
                    if (aVar11 != null) {
                        aVar11.b();
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    pVar.f20105d.a(1, e13, new qg.b(this$03));
                    return;
                }
            case 21:
                qg.g this$04 = (qg.g) this.f2051v;
                Context context2 = (Context) this.f2052w;
                fi.b status = (fi.b) this.f2053x;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(context2, "$context");
                kotlin.jvm.internal.i.g(status, "$status");
                ug.b bVar3 = this$04.f29548c;
                ih.p pVar3 = bVar3.f34102a;
                try {
                    hh.g.b(pVar3.f20105d, 0, new ug.d(bVar3, status), 3);
                    if (di.b.u(context2, pVar3)) {
                        qg.w.f29578a.getClass();
                        uh.b f = qg.w.f(context2, pVar3);
                        bh.a.f4292a.getClass();
                        int i14 = bh.a.a(context2).f504a;
                        int ordinal = status.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                bVar3.c(context2, f, i14);
                            }
                        } else {
                            bVar3.b(context2, f, i14);
                        }
                        f.m(i14);
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    pVar3.f20105d.a(1, e14, new ug.e(bVar3));
                    return;
                }
            case 22:
                ei.c listener = (ei.c) this.f2051v;
                fi.a logoutMeta = (fi.a) this.f2052w;
                f0 this$05 = (f0) this.f2053x;
                kotlin.jvm.internal.i.g(listener, "$listener");
                kotlin.jvm.internal.i.g(logoutMeta, "$logoutMeta");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                try {
                    listener.a();
                    return;
                } catch (Exception e15) {
                    this$05.f29544a.f20105d.a(1, e15, new qg.c0(this$05));
                    return;
                }
            case 23:
                ug.b this$06 = (ug.b) this.f2051v;
                Context context3 = (Context) this.f2052w;
                ih.i event = (ih.i) this.f2053x;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(context3, "$context");
                kotlin.jvm.internal.i.g(event, "$event");
                xg.g gVar2 = this$06.f34104c;
                ih.p pVar4 = gVar2.f37768a;
                String eventName = event.f20088a;
                try {
                    hh.g.b(pVar4.f20105d, 0, new xg.a(gVar2, event), 3);
                    qg.w.f29578a.getClass();
                    uh.b f2 = qg.w.f(context3, pVar4);
                    if (!di.b.u(context3, pVar4)) {
                        hh.g.b(pVar4.f20105d, 0, new xg.b(gVar2), 3);
                        return;
                    }
                    th.a aVar12 = pVar4.f20104c;
                    boolean z11 = f2.Q().f20083a;
                    ph.a aVar13 = aVar12.f33012c;
                    Set<String> gdprWhitelistEvent = aVar13.f28431g;
                    Set<String> blackListEvents = aVar13.f28429d;
                    kotlin.jvm.internal.i.g(gdprWhitelistEvent, "gdprWhitelistEvent");
                    kotlin.jvm.internal.i.g(blackListEvents, "blackListEvents");
                    kotlin.jvm.internal.i.g(eventName, "eventName");
                    if (blackListEvents.contains(eventName)) {
                        z10 = false;
                    } else if (z11) {
                        z10 = gdprWhitelistEvent.contains(eventName);
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        hh.g.b(pVar4.f20105d, 3, new xg.c(gVar2, event), 2);
                        return;
                    }
                    gVar2.a(context3, event);
                    gVar2.f37769b++;
                    ug.l.f(context3, event, pVar4);
                    if (pVar4.f20104c.f33012c.f28430e.contains(eventName)) {
                        yg.n.b(context3, pVar4);
                    }
                    hh.g.b(pVar4.f20105d, 0, new xg.d(gVar2), 3);
                    if (gVar2.f37769b == aVar12.f33012c.f28428c) {
                        hh.g.b(pVar4.f20105d, 0, new xg.e(gVar2), 3);
                        yg.n.b(context3, pVar4);
                        gVar2.f37769b = 0;
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    pVar4.f20105d.a(1, th3, new xg.f(gVar2));
                    return;
                }
            case 24:
                Context context4 = (Context) this.f2051v;
                z jobParameters = (z) this.f2052w;
                String syncType = (String) this.f2053x;
                ScheduledExecutorService scheduledExecutorService = yg.n.f38599a;
                kotlin.jvm.internal.i.g(context4, "$context");
                kotlin.jvm.internal.i.g(jobParameters, "$jobParameters");
                kotlin.jvm.internal.i.g(syncType, "$syncType");
                try {
                    hh.a aVar14 = hh.g.f17610d;
                    g.a.b(0, yg.o.f38612u, 3);
                    boolean g5 = yg.n.g(context4);
                    g.a.b(0, new yg.p(g5), 3);
                    if (!g5) {
                        yg.n.f(jobParameters, context4);
                    }
                    if (kotlin.jvm.internal.i.b(syncType, "SYNC_TYPE_PERIODIC_BACKGROUND_SYNC") || kotlin.jvm.internal.i.b(syncType, "SYNC_TYPE_BACKGROUND_MODE_PERIODIC_SYNC")) {
                        yg.n.f38600b.b(context4, syncType);
                    }
                    ((fh.b) jobParameters.f26149c).a(new c9.d((JobParameters) jobParameters.f26148b));
                    return;
                } catch (Throwable th4) {
                    hh.a aVar15 = hh.g.f17610d;
                    g.a.a(1, th4, yg.q.f38614u);
                    return;
                }
            case 25:
                dh.i this$07 = (dh.i) this.f2051v;
                Context context5 = (Context) this.f2052w;
                ih.p sdkInstance = (ih.p) this.f2053x;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(sdkInstance, "$sdkInstance");
                hh.g gVar3 = sdkInstance.f20105d;
                kotlin.jvm.internal.i.f(context5, "context");
                try {
                    hh.g.b(sdkInstance.f20105d, 0, new dh.g(this$07), 3);
                    th.a a12 = new th.c().a(context5, sdkInstance);
                    sdkInstance.f20104c = a12;
                    if (a12.f.f28438b) {
                        hh.h hVar3 = new hh.h(context5, sdkInstance);
                        gVar3.getClass();
                        try {
                            gVar3.f17613c.add(hVar3);
                        } catch (Exception unused) {
                        }
                        hh.d.f17605a.add(hVar3);
                    }
                    qg.w.f29578a.getClass();
                    if (qg.w.f(context5, sdkInstance).Y()) {
                        dh.a aVar16 = sdkInstance.f20103b;
                        pg.h hVar4 = new pg.h(5, true);
                        aVar16.getClass();
                        aVar16.f12859e = hVar4;
                    }
                    Set<String> U = qg.w.f(context5, sdkInstance).U();
                    if (U != null) {
                        qg.w.c(sdkInstance).f572a.addAll(U);
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    gVar3.a(1, e16, new dh.h(this$07));
                    return;
                }
            case 26:
                eh.d this$08 = (eh.d) this.f2051v;
                Activity activity = (Activity) this.f2052w;
                s1.s activityMeta = (s1.s) this.f2053x;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(activity, "$activity");
                kotlin.jvm.internal.i.g(activityMeta, "$activityMeta");
                Context applicationContext = activity.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "activity.applicationContext");
                ih.p pVar5 = this$08.f13992a;
                try {
                    hh.g.b(pVar5.f20105d, 0, new eh.e(this$08), 3);
                    qg.w wVar2 = qg.w.f29578a;
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext2, "context.applicationContext");
                    wVar2.getClass();
                    qg.w.a(applicationContext2, pVar5).c(activityMeta);
                    eh.d.c(applicationContext, pVar5, (String) activityMeta.f31225w);
                    return;
                } catch (Exception e17) {
                    pVar5.f20105d.a(1, e17, new eh.f(this$08));
                    return;
                }
            case 27:
                zi.b listener2 = (zi.b) this.f2051v;
                aj.b data = (aj.b) this.f2052w;
                mi.a this$09 = (mi.a) this.f2053x;
                kotlin.jvm.internal.i.g(listener2, "$listener");
                kotlin.jvm.internal.i.g(data, "$data");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                try {
                    listener2.a(data);
                    return;
                } catch (Exception e18) {
                    this$09.C.f20105d.a(1, e18, new mi.h(this$09));
                    return;
                }
            case 28:
                Context context6 = (Context) this.f2051v;
                ih.p sdkInstance2 = (ih.p) this.f2052w;
                String campaignId = (String) this.f2053x;
                kotlin.jvm.internal.i.g(context6, "$context");
                kotlin.jvm.internal.i.g(sdkInstance2, "$sdkInstance");
                kotlin.jvm.internal.i.g(campaignId, "$campaignId");
                yi.e eVar4 = new yi.e(context6, sdkInstance2, campaignId);
                try {
                    i1.f25206a.getClass();
                    vi.o d10 = i1.d(context6, sdkInstance2);
                    hh.g.b(sdkInstance2.f20105d, 0, new yi.f(eVar4), 3);
                    if (t1.g(context6, sdkInstance2)) {
                        if (gv.n.B0(campaignId)) {
                            hh.g.b(sdkInstance2.f20105d, 0, new yi.g(eVar4), 3);
                            return;
                        }
                        new vi.c(context6, sdkInstance2).a(ca.a.l1(campaignId));
                        ih.m D = d10.D(campaignId, di.b.g(context6));
                        if (D == null) {
                            yi.e.b(kotlin.jvm.internal.i.n(campaignId, "Something went wrong. Could not show in-app.\n Try again or Contact MoEngage Support. Draft-id: "));
                            return;
                        }
                        if (D instanceof ih.n) {
                            if (((ih.n) D).f20100a != 0) {
                                yi.e.b(((String) t3) + " Draft-Id: " + campaignId);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (D instanceof ih.o) {
                            T t10 = ((ih.o) D).f20101a;
                            if (t10 != 0) {
                                eVar4.a((pi.d) t10);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.moengage.inapp.internal.model.CampaignPayload");
                            }
                        }
                        hh.g.b(sdkInstance2.f20105d, 0, new yi.h(eVar4), 3);
                        return;
                    }
                    return;
                } catch (Exception e19) {
                    sdkInstance2.f20105d.a(1, e19, new yi.i(eVar4));
                    return;
                }
            default:
                Context context7 = (Context) this.f2051v;
                r1 this$010 = (r1) this.f2052w;
                String campaignId2 = (String) this.f2053x;
                kotlin.jvm.internal.i.g(context7, "$context");
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(campaignId2, "$campaignId");
                ih.p sdkInstance3 = this$010.f25262a;
                kotlin.jvm.internal.i.g(sdkInstance3, "sdkInstance");
                sdkInstance3.f20106e.a(new ah.e("INAPP_SHOW_TEST_INAPP_TASK", true, new g(28, context7, sdkInstance3, campaignId2)));
                return;
        }
    }
}

package jf;

import a7.f;
import a7.g;
import af.a;
import android.content.Context;
import android.text.TextUtils;
import bf.u;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.c;
import lf.h;
import lf.i;
import lf.j;
import lf.m;
import ya.k;
/* compiled from: TransportManager.java */
/* loaded from: classes.dex */
public final class e implements a.b {
    public static final df.a L = df.a.d();
    public static final e M = new e();
    public re.b<g> A;
    public a B;
    public Context D;
    public bf.a E;
    public c F;
    public af.a G;
    public c.a H;
    public String I;
    public String J;

    /* renamed from: u  reason: collision with root package name */
    public final ConcurrentHashMap f22005u;

    /* renamed from: x  reason: collision with root package name */
    public sc.e f22008x;

    /* renamed from: y  reason: collision with root package name */
    public ze.c f22009y;

    /* renamed from: z  reason: collision with root package name */
    public se.d f22010z;

    /* renamed from: v  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f22006v = new ConcurrentLinkedQueue<>();

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f22007w = new AtomicBoolean(false);
    public boolean K = false;
    public final ThreadPoolExecutor C = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f22005u = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(j jVar) {
        long j10;
        String str;
        if (jVar.h()) {
            m j11 = jVar.j();
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", j11.b0(), new DecimalFormat("#.####").format(j11.a0() / 1000.0d));
        } else if (jVar.l()) {
            h m10 = jVar.m();
            if (m10.q0()) {
                j10 = m10.h0();
            } else {
                j10 = 0;
            }
            if (m10.m0()) {
                str = String.valueOf(m10.c0());
            } else {
                str = "UNKNOWN";
            }
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", m10.j0(), str, new DecimalFormat("#.####").format(j10 / 1000.0d));
        } else if (jVar.e()) {
            lf.g n10 = jVar.n();
            return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(n10.U()), Integer.valueOf(n10.R()), Integer.valueOf(n10.Q()));
        } else {
            return "log";
        }
    }

    public final void b(i iVar) {
        if (iVar.h()) {
            this.G.b("_fstec");
        } else if (iVar.l()) {
            this.G.b("_fsntc");
        }
    }

    public final void c(m mVar, lf.d dVar) {
        this.C.execute(new androidx.emoji2.text.g(16, this, mVar, dVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f6, code lost:
        if (jf.c.a(r14.j().c0()) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(i.a aVar, lf.d dVar) {
        ze.c cVar;
        Object emptyMap;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean b10;
        boolean z15;
        u uVar;
        float floatValue;
        boolean z16;
        String format;
        String str;
        boolean z17;
        boolean z18 = false;
        if (!this.f22007w.get()) {
            ConcurrentHashMap concurrentHashMap = this.f22005u;
            int intValue = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING")).intValue();
            int intValue2 = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING")).intValue();
            int intValue3 = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING")).intValue();
            if (aVar.h() && intValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            } else if (aVar.l() && intValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            } else if (aVar.e() && intValue3 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            } else {
                L.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(aVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                z17 = false;
                if (!z17) {
                    L.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(aVar));
                    this.f22006v.add(new b(aVar, dVar));
                    return;
                }
                return;
            }
            z17 = true;
            if (!z17) {
            }
        } else {
            df.a aVar2 = L;
            if (this.E.u() && (!((lf.c) this.H.f10073v).U() || this.K)) {
                try {
                    str = (String) k.b(this.f22010z.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    aVar2.c("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                    c.a aVar3 = this.H;
                    aVar3.u();
                    lf.c.N((lf.c) aVar3.f10073v, dVar);
                    if (!aVar.h()) {
                    }
                    v.a aVar4 = (v.a) aVar3.f10072u.y(v.f.NEW_BUILDER);
                    aVar4.f10073v = aVar3.t();
                    aVar3 = (c.a) aVar4;
                    if (this.f22009y == null) {
                        df.a aVar5 = ze.c.f39366e;
                        this.f22009y = (ze.c) sc.e.e().c(ze.c.class);
                    }
                    cVar = this.f22009y;
                    if (cVar == null) {
                    }
                    aVar3.u();
                    lf.c.O((lf.c) aVar3.f10073v).putAll(emptyMap);
                    aVar.u();
                    i.M((i) aVar.f10073v, aVar3.r());
                    i r = aVar.r();
                    if (this.E.u()) {
                    }
                    z15 = false;
                    if (z15) {
                    }
                } catch (ExecutionException e11) {
                    aVar2.c("Unable to retrieve Installation Id: %s", e11.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                    c.a aVar32 = this.H;
                    aVar32.u();
                    lf.c.N((lf.c) aVar32.f10073v, dVar);
                    if (!aVar.h()) {
                    }
                    v.a aVar42 = (v.a) aVar32.f10072u.y(v.f.NEW_BUILDER);
                    aVar42.f10073v = aVar32.t();
                    aVar32 = (c.a) aVar42;
                    if (this.f22009y == null) {
                    }
                    cVar = this.f22009y;
                    if (cVar == null) {
                    }
                    aVar32.u();
                    lf.c.O((lf.c) aVar32.f10073v).putAll(emptyMap);
                    aVar.u();
                    i.M((i) aVar.f10073v, aVar32.r());
                    i r10 = aVar.r();
                    if (this.E.u()) {
                    }
                    z15 = false;
                    if (z15) {
                    }
                } catch (TimeoutException e12) {
                    aVar2.c("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                    c.a aVar322 = this.H;
                    aVar322.u();
                    lf.c.N((lf.c) aVar322.f10073v, dVar);
                    if (!aVar.h()) {
                    }
                    v.a aVar422 = (v.a) aVar322.f10072u.y(v.f.NEW_BUILDER);
                    aVar422.f10073v = aVar322.t();
                    aVar322 = (c.a) aVar422;
                    if (this.f22009y == null) {
                    }
                    cVar = this.f22009y;
                    if (cVar == null) {
                    }
                    aVar322.u();
                    lf.c.O((lf.c) aVar322.f10073v).putAll(emptyMap);
                    aVar.u();
                    i.M((i) aVar.f10073v, aVar322.r());
                    i r102 = aVar.r();
                    if (this.E.u()) {
                    }
                    z15 = false;
                    if (z15) {
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    c.a aVar6 = this.H;
                    aVar6.u();
                    lf.c.P((lf.c) aVar6.f10073v, str);
                } else {
                    aVar2.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                }
            }
            c.a aVar3222 = this.H;
            aVar3222.u();
            lf.c.N((lf.c) aVar3222.f10073v, dVar);
            if (!aVar.h() || aVar.l()) {
                v.a aVar4222 = (v.a) aVar3222.f10072u.y(v.f.NEW_BUILDER);
                aVar4222.f10073v = aVar3222.t();
                aVar3222 = (c.a) aVar4222;
                if (this.f22009y == null && this.f22007w.get()) {
                    df.a aVar52 = ze.c.f39366e;
                    this.f22009y = (ze.c) sc.e.e().c(ze.c.class);
                }
                cVar = this.f22009y;
                if (cVar == null) {
                    emptyMap = new HashMap(cVar.f39367a);
                } else {
                    emptyMap = Collections.emptyMap();
                }
                aVar3222.u();
                lf.c.O((lf.c) aVar3222.f10073v).putAll(emptyMap);
            }
            aVar.u();
            i.M((i) aVar.f10073v, aVar3222.r());
            i r1022 = aVar.r();
            if (this.E.u()) {
                L.e("Performance collection is not enabled, dropping %s", a(r1022));
            } else if (!r1022.Q().U()) {
                L.g("App Instance ID is null or empty, dropping %s", a(r1022));
            } else {
                Context context = this.D;
                ArrayList arrayList = new ArrayList();
                if (r1022.h()) {
                    arrayList.add(new ff.d(r1022.j()));
                }
                if (r1022.l()) {
                    arrayList.add(new ff.c(r1022.m(), context));
                }
                if (r1022.R()) {
                    arrayList.add(new ff.a(r1022.Q()));
                }
                if (r1022.e()) {
                    arrayList.add(new ff.b(r1022.n()));
                }
                if (arrayList.isEmpty()) {
                    df.a.d().a("No validators found for PerfMetric.");
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((ff.e) it.next()).a()) {
                        }
                    }
                    z10 = true;
                    if (z10) {
                        L.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(r1022));
                    } else {
                        c cVar2 = this.F;
                        cVar2.getClass();
                        if (r1022.h()) {
                            bf.a aVar7 = cVar2.f21987a;
                            aVar7.getClass();
                            synchronized (u.class) {
                                if (u.f4275v == null) {
                                    u.f4275v = new u();
                                }
                                uVar = u.f4275v;
                            }
                            RemoteConfigManager remoteConfigManager = aVar7.f4252a;
                            uVar.getClass();
                            kf.e<Float> eVar = remoteConfigManager.getFloat("fpr_vc_trace_sampling_rate");
                            if (eVar.b() && bf.a.v(eVar.a().floatValue())) {
                                aVar7.f4254c.c(eVar.a().floatValue(), "com.google.firebase.perf.TraceSamplingRate");
                                floatValue = eVar.a().floatValue();
                            } else {
                                kf.e<Float> b11 = aVar7.b(uVar);
                                if (b11.b() && bf.a.v(b11.a().floatValue())) {
                                    floatValue = b11.a().floatValue();
                                } else {
                                    floatValue = Float.valueOf(1.0f).floatValue();
                                }
                            }
                            if (cVar2.f21988b < floatValue) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!z16) {
                            }
                        }
                        if (r1022.h() && r1022.j().b0().startsWith("_st_") && r1022.j().V()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((!z11 || cVar2.b() || c.a(r1022.j().c0())) && (!r1022.l() || cVar2.c() || c.a(r1022.m().d0()))) {
                            z12 = true;
                            if (z12) {
                                b(r1022);
                                L.e("Event dropped due to device sampling - %s", a(r1022));
                            } else {
                                c cVar3 = this.F;
                                cVar3.getClass();
                                if ((r1022.h() && ((r1022.j().b0().equals("_fs") || r1022.j().b0().equals("_bs")) && r1022.j().W() > 0)) || r1022.e()) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (!z13) {
                                    z14 = false;
                                } else {
                                    if (r1022.l()) {
                                        b10 = cVar3.f21991e.b();
                                    } else if (r1022.h()) {
                                        b10 = cVar3.f21990d.b();
                                    } else {
                                        z14 = true;
                                    }
                                    z14 = !b10;
                                }
                                if (z14) {
                                    b(r1022);
                                    L.e("Rate limited (per device) - %s", a(r1022));
                                } else {
                                    z15 = true;
                                    if (z15) {
                                        boolean h10 = r1022.h();
                                        df.a aVar8 = L;
                                        if (h10) {
                                            Object[] objArr = new Object[2];
                                            objArr[0] = a(r1022);
                                            String b02 = r1022.j().b0();
                                            if (b02.startsWith("_st_")) {
                                                format = String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", ca.a.p0(this.J, this.I), b02, "perf-android-sdk", "android-ide");
                                            } else {
                                                format = String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", ca.a.p0(this.J, this.I), b02, "perf-android-sdk", "android-ide");
                                            }
                                            objArr[1] = format;
                                            aVar8.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", objArr);
                                        } else {
                                            aVar8.e("Logging %s", a(r1022));
                                        }
                                        a aVar9 = this.B;
                                        f<i> fVar = aVar9.f21984c;
                                        df.a aVar10 = a.f21981d;
                                        if (fVar == null) {
                                            g gVar = aVar9.f21983b.get();
                                            if (gVar != null) {
                                                aVar9.f21984c = gVar.a(aVar9.f21982a, new a7.b("proto"), new com.google.firebase.messaging.j(2));
                                            } else {
                                                aVar10.f("Flg TransportFactory is not available at the moment");
                                            }
                                        }
                                        f<i> fVar2 = aVar9.f21984c;
                                        if (fVar2 != null) {
                                            z18 = true;
                                        }
                                        if (!z18) {
                                            aVar10.f("Unable to dispatch event because Flg Transport is not available");
                                        } else {
                                            a7.a aVar11 = new a7.a(null, r1022, a7.d.DEFAULT);
                                            d7.u uVar2 = (d7.u) fVar2;
                                            uVar2.getClass();
                                            uVar2.a(aVar11, new p7.b(18));
                                        }
                                        SessionManager.getInstance().updatePerfSessionIfExpired();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        z12 = false;
                        if (z12) {
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            z15 = false;
            if (z15) {
            }
        }
    }

    @Override // af.a.b
    public final void onUpdateAppState(lf.d dVar) {
        boolean z10;
        if (dVar == lf.d.FOREGROUND) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        if (this.f22007w.get()) {
            this.C.execute(new d(this, 1));
        }
    }
}

package dd;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.b;
import c9.j;
import com.android.volley.VolleyError;
import com.google.android.exoplayer2.w;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.messaging.z;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import d9.q;
import e4.l;
import g6.w;
import g6.x;
import g7.c;
import h5.g0;
import h5.p;
import hd.e;
import hr.l7;
import ik.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import je.b1;
import je.c0;
import je.k;
import je.k0;
import je.l0;
import je.o0;
import je.p;
import je.s0;
import je.y0;
import ke.n;
import ke.r;
import l5.f;
import l7.a;
import mf.e;
import o7.s;
import oe.i;
import p.a;
import p7.o;
import q5.g;
import r1.a0;
import r5.c;
import re.a;
import tk.c;
import tr.b0;
import tr.d0;
import w5.d;
import w5.o;
import w5.y;
import ya.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, l.a, a0.b, f.a, g.a, y.a, b, a.InterfaceC0377a, j.a, j.b, a.InterfaceC0519a, oe.l, i, ya.b, a.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12812u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f12813v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f12814w;

    public /* synthetic */ a(Object obj, int i6, Object obj2) {
        this.f12812u = i6;
        this.f12813v = obj;
        this.f12814w = obj2;
    }

    private final void h(h hVar) {
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f12813v;
        Date date = (Date) this.f12814w;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f9815j;
        aVar.getClass();
        if (hVar.isSuccessful()) {
            com.google.firebase.remoteconfig.internal.b bVar = aVar.f9821g;
            synchronized (bVar.f9829b) {
                bVar.f9828a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return;
        }
        Exception exception = hVar.getException();
        if (exception != null) {
            if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                aVar.f9821g.d();
            } else {
                aVar.f9821g.c();
            }
        }
    }

    @Override // p.a.e
    public void a(View v10, ViewGroup viewGroup) {
        c this$0 = (c) this.f12813v;
        List communitiesGroupData = (List) this.f12814w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(communitiesGroupData, "$communitiesGroupData");
        kotlin.jvm.internal.i.g(v10, "v");
        v10.setOnClickListener(DebouncedOnClickListener.wrap(new j1(this$0, 6, communitiesGroupData)));
        if (viewGroup != null) {
            viewGroup.addView(v10);
        }
    }

    @Override // oe.i
    public Object apply(Object obj) {
        boolean z10;
        Set set = (Set) this.f12814w;
        n nVar = (n) obj;
        if (!((he.y) this.f12813v).i(nVar) && !set.contains(nVar.f23285b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // androidx.activity.result.b
    public void b(Object obj) {
        x.a this$0 = (x.a) this.f12813v;
        w launcherHolder = (w) this.f12814w;
        Pair pair = (Pair) obj;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(launcherHolder, "$launcherHolder");
        int d10 = d.c.Login.d();
        Object obj2 = pair.first;
        kotlin.jvm.internal.i.f(obj2, "result.first");
        this$0.f16344b.a(d10, ((Number) obj2).intValue(), (Intent) pair.second);
        androidx.activity.result.c<Intent> cVar = launcherHolder.f16335a;
        if (cVar != null) {
            cVar.b();
        }
        launcherHolder.f16335a = null;
    }

    @Override // q5.g.a
    public void c(File file) {
        c.b slave = (c.b) this.f12813v;
        kotlin.jvm.internal.i.g(slave, "$slave");
        kotlin.jvm.internal.i.g(file, "file");
        slave.f30479g = (r5.b) this.f12814w;
        slave.f = file;
        Runnable runnable = slave.f30480h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        boolean z10;
        o oVar = (o) this.f12813v;
        String appId = (String) this.f12814w;
        l5.b bVar = l5.b.f24059a;
        if (!b6.a.b(l5.b.class)) {
            try {
                kotlin.jvm.internal.i.g(appId, "$appId");
                boolean z11 = false;
                if (oVar != null && oVar.f36518h) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p pVar = p.f17269a;
                g0 g0Var = g0.f17231a;
                if (!b6.a.b(g0.class)) {
                    g0.f17231a.d();
                    z11 = g0.f17237h.a();
                }
                if (z10 && z11) {
                    l5.b bVar2 = l5.b.f24059a;
                    bVar2.getClass();
                    if (!b6.a.b(bVar2) && !l5.b.f24065h) {
                        l5.b.f24065h = true;
                        p.c().execute(new androidx.activity.b(10, appId));
                    }
                }
            } catch (Throwable th2) {
                b6.a.a(l5.b.class, th2);
            }
        }
    }

    @Override // hd.e
    public Object e(hd.p pVar) {
        String a10;
        int i6;
        int i10 = this.f12812u;
        Object obj = this.f12814w;
        Object obj2 = this.f12813v;
        switch (i10) {
            case 0:
                return new ed.c((sc.e) pVar.a(sc.e.class), (Executor) pVar.e((hd.o) obj2), (Executor) pVar.e((hd.o) obj));
            case 1:
                String str = (String) obj2;
                Context context = (Context) pVar.a(Context.class);
                switch (((d9.p) ((e.a) obj)).f12711u) {
                    case 2:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            a10 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        a10 = "";
                        break;
                    case 3:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i6 = applicationInfo2.minSdkVersion;
                            a10 = String.valueOf(i6);
                            break;
                        }
                        a10 = "";
                        break;
                    case 4:
                        int i11 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            a10 = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            a10 = "watch";
                            break;
                        } else if (i11 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            a10 = "auto";
                            break;
                        } else {
                            if (i11 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                a10 = "embedded";
                                break;
                            }
                            a10 = "";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            a10 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        a10 = "";
                        break;
                }
                return new mf.a(str, a10);
            default:
                hd.b bVar = (hd.b) obj;
                try {
                    Trace.beginSection((String) obj2);
                    return bVar.f.e(pVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // c9.j.b
    public void f(Object obj, c9.h hVar) {
        p7.o oVar = (p7.o) obj;
        SparseArray<o.a> sparseArray = ((p7.n) this.f12813v).f27967y;
        SparseArray sparseArray2 = new SparseArray(hVar.b());
        for (int i6 = 0; i6 < hVar.b(); i6++) {
            int a10 = hVar.a(i6);
            o.a aVar = sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        oVar.O();
    }

    @Override // l7.a.InterfaceC0377a
    public Object g() {
        int i6 = this.f12812u;
        Object obj = this.f12814w;
        Object obj2 = this.f12813v;
        switch (i6) {
            case 5:
                ((j7.j) obj2).f21726c.l((Iterable) obj);
                return null;
            default:
                j7.j jVar = (j7.j) obj2;
                jVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jVar.f21731i.g(((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // oe.l
    public Object get() {
        boolean z10;
        boolean z11;
        long longValue;
        long j10;
        long j11;
        int i6 = this.f12812u;
        Object obj = this.f12814w;
        Object obj2 = this.f12813v;
        switch (i6) {
            case 19:
                je.p pVar = (je.p) obj;
                SparseArray<b1> sparseArray = ((k) obj2).f21854j;
                p.b bVar = pVar.f21894b;
                if (bVar.f21899a == -1) {
                    kc.f.A(1, "LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
                    return new p.c();
                }
                o0 o0Var = (o0) pVar.f21893a;
                s0 s0Var = o0Var.f21886u;
                long longValue2 = ((Long) s0Var.G("PRAGMA page_size").c(new d9.p(26))).longValue() * ((Long) s0Var.G("PRAGMA page_count").c(new d9.p(27))).longValue();
                long j12 = bVar.f21899a;
                if (longValue2 < j12) {
                    kc.f.A(1, "LruGarbageCollector", "Garbage collection skipped; Cache size " + longValue2 + " is lower than threshold " + j12, new Object[0]);
                    return new p.c();
                }
                long currentTimeMillis = System.currentTimeMillis();
                s0 s0Var2 = o0Var.f21886u;
                int longValue3 = (int) ((10 / 100.0f) * ((float) (((Long) s0Var2.G("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").c(new d9.p(25))).longValue() + s0Var2.f21923d.f)));
                if (longValue3 > 1000) {
                    kc.f.A(1, "LruGarbageCollector", c.p("Capping sequence numbers to collect down to the maximum of 1000 from ", longValue3), new Object[0]);
                    longValue3 = 1000;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                y0 y0Var = s0Var2.f21923d;
                if (longValue3 == 0) {
                    longValue = -1;
                } else {
                    final p.d dVar = new p.d(longValue3);
                    y0Var.f21971a.G("SELECT target_proto FROM targets").d(new l0(y0Var, 5, new oe.d() { // from class: je.n
                        @Override // oe.d
                        public final void accept(Object obj3) {
                            int i10 = r2;
                            p.d dVar2 = dVar;
                            switch (i10) {
                                case 0:
                                    dVar2.a(Long.valueOf(((b1) obj3).f21798c));
                                    return;
                                default:
                                    dVar2.a((Long) obj3);
                                    return;
                            }
                        }
                    }));
                    final oe.d dVar2 = new oe.d() { // from class: je.n
                        @Override // oe.d
                        public final void accept(Object obj3) {
                            int i10 = r2;
                            p.d dVar22 = dVar;
                            switch (i10) {
                                case 0:
                                    dVar22.a(Long.valueOf(((b1) obj3).f21798c));
                                    return;
                                default:
                                    dVar22.a((Long) obj3);
                                    return;
                            }
                        }
                    };
                    s0Var2.G("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").d(new oe.d() { // from class: je.n0
                        @Override // oe.d
                        public final void accept(Object obj3) {
                            int i10 = r2;
                            oe.d dVar3 = dVar2;
                            switch (i10) {
                                case 0:
                                    dVar3.accept(Long.valueOf(((Cursor) obj3).getLong(0)));
                                    return;
                                case 1:
                                    dVar3.accept(ca.a.O(((Cursor) obj3).getString(0)).t());
                                    return;
                                default:
                                    dVar3.accept(ca.a.O(((Cursor) obj3).getString(0)).t());
                                    return;
                            }
                        }
                    });
                    longValue = dVar.f21901a.peek().longValue();
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                int[] iArr = new int[1];
                s0.d G = y0Var.f21971a.G("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                G.a(Long.valueOf(longValue));
                G.d(new k0(5, y0Var, sparseArray, iArr));
                y0Var.k();
                int i10 = iArr[0];
                long currentTimeMillis4 = System.currentTimeMillis();
                int[] iArr2 = new int[1];
                ArrayList arrayList = new ArrayList();
                while (true) {
                    boolean z12 = true;
                    while (z12) {
                        s0.d G2 = s0Var2.G("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?");
                        j10 = currentTimeMillis4;
                        j11 = longValue;
                        G2.a(Long.valueOf(longValue), 100);
                        if (G2.d(new k0(1, o0Var, iArr2, arrayList)) == 100) {
                            break;
                        }
                        z12 = false;
                        currentTimeMillis4 = j10;
                        longValue = j11;
                    }
                    long j13 = currentTimeMillis4;
                    s0Var2.f.f(arrayList);
                    int i11 = iArr2[0];
                    long currentTimeMillis5 = System.currentTimeMillis();
                    StringBuilder c10 = v.h.c("LRU Garbage Collection:\n\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
                    Locale locale = Locale.ROOT;
                    c10.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(longValue3), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)));
                    StringBuilder c11 = v.h.c(c10.toString());
                    c11.append(String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(i10), Long.valueOf(j13 - currentTimeMillis3)));
                    StringBuilder c12 = v.h.c(c11.toString());
                    c12.append(String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(i11), Long.valueOf(currentTimeMillis5 - j13)));
                    StringBuilder c13 = v.h.c(c12.toString());
                    c13.append(String.format(locale, "Total Duration: %dms", Long.valueOf(currentTimeMillis5 - currentTimeMillis)));
                    kc.f.A(1, "LruGarbageCollector", c13.toString(), new Object[0]);
                    return new p.c();
                    currentTimeMillis4 = j10;
                    longValue = j11;
                    break;
                }
                break;
            default:
                k kVar = (k) obj2;
                q.f fVar = (q.f) obj;
                int i12 = k.f21845n;
                kVar.getClass();
                le.g gVar = (le.g) fVar.f29104v;
                kVar.f21848c.b(gVar, (com.google.protobuf.h) fVar.f29107y);
                le.g gVar2 = (le.g) fVar.f29104v;
                Iterator it = gVar2.b().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    List<le.f> list = gVar2.f24221d;
                    Object obj3 = fVar.f29106x;
                    if (hasNext) {
                        ke.i iVar = (ke.i) it.next();
                        c0 c0Var = kVar.f21850e;
                        n b10 = c0Var.b(iVar);
                        r rVar = (r) ((ImmutableSortedMap) fVar.f29108z).get(iVar);
                        if (rVar != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ca.a.u0(z10, "docVersions should contain every doc in the write.", new Object[0]);
                        if (b10.f23287d.compareTo(rVar) < 0) {
                            int size = list.size();
                            List list2 = (List) obj3;
                            if (list2.size() == size) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ca.a.u0(z11, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(list2.size()));
                            for (int i13 = 0; i13 < size; i13++) {
                                le.f fVar2 = list.get(i13);
                                if (fVar2.f24215a.equals(b10.f23285b)) {
                                    fVar2.b(b10, (le.h) list2.get(i13));
                                }
                            }
                            if (!v.h.b(b10.f23286c, 1)) {
                                c0Var.a(b10, (r) fVar.f29105w);
                            }
                        }
                    } else {
                        int i14 = 0;
                        kVar.f21848c.c(gVar2);
                        kVar.f21848c.a();
                        kVar.f21849d.e(gVar2.f24218a);
                        je.h hVar = kVar.f;
                        HashSet hashSet = new HashSet();
                        while (true) {
                            List list3 = (List) obj3;
                            if (i14 < list3.size()) {
                                if (!((le.h) list3.get(i14)).f24223b.isEmpty()) {
                                    hashSet.add(list.get(i14).f24215a);
                                }
                                i14++;
                            } else {
                                hVar.g(hVar.f21830a.e(hashSet));
                                return kVar.f.b(gVar.b());
                            }
                        }
                    }
                }
        }
    }

    @Override // re.a.InterfaceC0519a
    public void i(re.b bVar) {
        ((a.InterfaceC0519a) this.f12813v).i(bVar);
        ((a.InterfaceC0519a) this.f12814w).i(bVar);
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        int i6 = this.f12812u;
        Object obj2 = this.f12814w;
        switch (i6) {
            case 7:
                int i10 = com.google.android.exoplayer2.k.H;
                ((w.b) obj).G(((s) this.f12813v).f27241h, (z8.h) obj2);
                return;
            case 8:
                ((p7.o) obj).d0();
                return;
            case 9:
            default:
                ((p7.o) obj).L();
                return;
            case 10:
                ((p7.o) obj).j0();
                return;
            case 11:
                ((p7.o) obj).N();
                return;
            case 12:
                p7.o oVar = (p7.o) obj;
                oVar.o0();
                int i11 = ((q) obj2).f12713u;
                oVar.W();
                return;
            case 13:
                ((p7.o) obj).n();
                return;
            case 14:
                ((p7.o) obj).q0();
                return;
            case 15:
                ((p7.o) obj).M();
                return;
            case 16:
                ((p7.o) obj).T();
                return;
        }
    }

    @Override // e4.l.a
    public void onErrorResponse(VolleyError error) {
        int i6 = this.f12812u;
        Object obj = this.f12814w;
        Object obj2 = this.f12813v;
        switch (i6) {
            case 0:
                ss.p pVar = (ss.p) obj2;
                hn.b bVar = (hn.b) obj;
                try {
                    pVar.invoke(Boolean.FALSE, null);
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = bVar.f17789a;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper.e(str, error);
                    return;
                } catch (Exception unused) {
                    pVar.invoke(Boolean.FALSE, null);
                    return;
                }
            case 1:
                ss.p pVar2 = (ss.p) obj2;
                kp.c cVar = (kp.c) obj;
                try {
                    pVar2.invoke(Boolean.FALSE, null);
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    String str2 = cVar.f23726u;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper2.e(str2, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", error);
                    return;
                } catch (Exception e10) {
                    pVar2.invoke(Boolean.FALSE, null);
                    LogHelper.INSTANCE.e(cVar.f23726u, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e10);
                    return;
                }
            case 2:
                ss.p pVar3 = (ss.p) obj2;
                kp.i iVar = (kp.i) obj;
                try {
                    pVar3.invoke(Boolean.FALSE, null);
                    LogHelper logHelper3 = LogHelper.INSTANCE;
                    String str3 = iVar.f23751u;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper3.e(str3, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", error);
                    return;
                } catch (Exception e11) {
                    pVar3.invoke(Boolean.FALSE, null);
                    LogHelper.INSTANCE.e(iVar.f23751u, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e11);
                    return;
                }
            default:
                com.theinnerhour.b2b.fragment.coping.a this$0 = (com.theinnerhour.b2b.fragment.coping.a) obj2;
                ProgressDialog progressDialog = (ProgressDialog) obj;
                int i10 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(progressDialog, "$progressDialog");
                try {
                    Toast.makeText(this$0.requireActivity(), "Error in sending feedback", 0).show();
                    progressDialog.dismiss();
                    LogHelper logHelper4 = LogHelper.INSTANCE;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper4.e("dashboardactivity", "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", error);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e("dashboardactivity", "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e12);
                    return;
                }
        }
    }

    @Override // ya.b
    public Object then(h it) {
        switch (this.f12812u) {
            case 22:
                ne.p pVar = (ne.p) this.f12813v;
                pVar.getClass();
                return ya.k.e(((b0) it.getResult()).w((d0) this.f12814w, pVar.f26258c));
            case 23:
                Context context = (Context) this.f12813v;
                Intent intent = (Intent) this.f12814w;
                Object obj = com.google.firebase.messaging.k.f9742c;
                if (aa.g.a() && ((Integer) it.getResult()).intValue() == 402) {
                    return com.google.firebase.messaging.k.a(context, intent).continueWith(new oe.f(3), new com.google.firebase.messaging.j(0));
                }
                return it;
            case 24:
                z zVar = (z) this.f12813v;
                String str = (String) this.f12814w;
                synchronized (zVar) {
                    zVar.f9789b.remove(str);
                }
                return it;
            case 25:
                h(it);
                return it;
            default:
                l7 this$0 = (l7) this.f12813v;
                StorageReference storageRef = (StorageReference) this.f12814w;
                int i6 = l7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(storageRef, "$storageRef");
                kotlin.jvm.internal.i.g(it, "it");
                LogHelper.INSTANCE.i(this$0.f18751u, "continue with task");
                return storageRef.getDownloadUrl();
        }
    }
}

package q7;

import android.app.Activity;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import androidx.fragment.app.y;
import c9.n;
import c9.w;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.firestore.FirebaseFirestoreException;
import d7.u;
import d9.o;
import e9.j;
import he.a;
import he.c0;
import id.f;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import je.b1;
import ke.r;
import nd.z;
import ne.b;
import ne.x;
import org.json.JSONException;
import org.json.JSONObject;
import pd.b0;
import re.a;
import tr.c0;
import tr.i0;
import u7.t;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29253u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f29254v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f29255w;

    public /* synthetic */ f(Object obj, int i6, Object obj2) {
        this.f29253u = i6;
        this.f29254v = obj;
        this.f29255w = obj2;
    }

    private final void a() {
        a.InterfaceC0519a<T> interfaceC0519a;
        hd.n nVar = (hd.n) this.f29254v;
        re.b<T> bVar = (re.b) this.f29255w;
        if (nVar.f17437b == hd.n.f17435d) {
            synchronized (nVar) {
                interfaceC0519a = nVar.f17436a;
                nVar.f17436a = null;
                nVar.f17437b = bVar;
            }
            interfaceC0519a.i(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void b() {
        hd.m mVar = (hd.m) this.f29254v;
        re.b bVar = (re.b) this.f29255w;
        synchronized (mVar) {
            if (mVar.f17433b == null) {
                mVar.f17432a.add(bVar);
            } else {
                mVar.f17433b.add(bVar.get());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0476 -> B:137:0x04a3). Please submit an issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t bVar;
        ad.b bVar2;
        a7.f<b0> fVar;
        a7.d dVar;
        boolean z10;
        boolean z11;
        boolean z12;
        Set<String> unmodifiableSet;
        String str = null;
        boolean z13 = false;
        int i6 = 1;
        switch (this.f29253u) {
            case 0:
                a.C0132a c0132a = (a.C0132a) this.f29254v;
                c0132a.getClass();
                int i10 = w.f5205a;
                c0132a.f6254b.B((String) this.f29255w);
                return;
            case 1:
                DefaultDrmSessionManager.c cVar = (DefaultDrmSessionManager.c) this.f29254v;
                com.google.android.exoplayer2.n nVar = (com.google.android.exoplayer2.n) this.f29255w;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f6405p != 0 && !cVar.f6417w) {
                    Looper looper = defaultDrmSessionManager.f6408t;
                    looper.getClass();
                    cVar.f6416v = defaultDrmSessionManager.e(looper, cVar.f6415u, nVar, false);
                    defaultDrmSessionManager.f6403n.add(cVar);
                    return;
                }
                return;
            case 2:
                f8.e eVar = (f8.e) this.f29254v;
                Runnable runnable = (Runnable) this.f29255w;
                synchronized (eVar.f14894a) {
                    if (!eVar.f14904l) {
                        long j10 = eVar.f14903k - 1;
                        eVar.f14903k = j10;
                        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i11 <= 0) {
                            if (i11 < 0) {
                                eVar.b(new IllegalStateException());
                            } else {
                                eVar.a();
                                try {
                                    runnable.run();
                                } catch (IllegalStateException e10) {
                                    eVar.b(e10);
                                } catch (Exception e11) {
                                    eVar.b(new IllegalStateException(e11));
                                }
                            }
                        }
                    }
                }
                return;
            case 3:
                com.google.android.exoplayer2.source.m mVar = (com.google.android.exoplayer2.source.m) this.f29254v;
                t tVar = (t) this.f29255w;
                if (mVar.L == null) {
                    bVar = tVar;
                } else {
                    bVar = new t.b(-9223372036854775807L);
                }
                mVar.S = bVar;
                mVar.T = tVar.j();
                if (mVar.Z == -1 && tVar.j() == -9223372036854775807L) {
                    z13 = true;
                }
                mVar.U = z13;
                if (z13) {
                    i6 = 7;
                }
                mVar.V = i6;
                ((com.google.android.exoplayer2.source.n) mVar.A).u(mVar.T, tVar.d(), mVar.U);
                if (!mVar.P) {
                    mVar.x();
                    return;
                }
                return;
            case 4:
                ((AdsMediaSource.a) this.f29254v).getClass();
                int i12 = AdsMediaSource.f6823j;
                throw null;
            case 5:
                ((n.a) this.f29255w).a(((c9.n) this.f29254v).b());
                return;
            case 6:
                o.a aVar = (o.a) this.f29254v;
                aVar.getClass();
                int i13 = w.f5205a;
                aVar.f12710b.m((String) this.f29255w);
                return;
            case 7:
                o.a aVar2 = (o.a) this.f29254v;
                aVar2.getClass();
                int i14 = w.f5205a;
                aVar2.f12710b.c((d9.q) this.f29255w);
                return;
            case 8:
                o.a aVar3 = (o.a) this.f29254v;
                aVar3.getClass();
                int i15 = w.f5205a;
                aVar3.f12710b.Z((Exception) this.f29255w);
                return;
            case 9:
                e9.j jVar = (e9.j) this.f29254v;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f29255w;
                SurfaceTexture surfaceTexture2 = jVar.A;
                Surface surface = jVar.B;
                Surface surface2 = new Surface(surfaceTexture);
                jVar.A = surfaceTexture;
                jVar.B = surface2;
                Iterator<j.b> it = jVar.f13910u.iterator();
                while (it.hasNext()) {
                    it.next().p(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 10:
                ad.d dVar2 = (ad.d) this.f29254v;
                ya.i iVar = (ya.i) this.f29255w;
                dVar2.getClass();
                dm.e eVar2 = ad.l.f517b;
                hd.l<SharedPreferences> lVar = dVar2.f487e.f518a;
                String string = lVar.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = lVar.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string != null && string2 != null) {
                    try {
                        int d10 = v.h.d(defpackage.d.z(string));
                        if (d10 != 0) {
                            if (d10 != 1) {
                                Log.e(eVar2.f13148u, "Reached unreachable section in #retrieveAppCheckToken()", null);
                            } else {
                                bVar2 = ad.b.c(string2);
                            }
                        } else {
                            bVar2 = ad.b.d(string2);
                        }
                    } catch (IllegalArgumentException e12) {
                        StringBuilder g5 = defpackage.d.g("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        g5.append(e12.getMessage());
                        Log.e(eVar2.f13148u, g5.toString(), null);
                        lVar.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    if (bVar2 != null) {
                        dVar2.f494m = bVar2;
                    }
                    iVar.b(null);
                    return;
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                iVar.b(null);
                return;
            case 11:
                zc.b bVar3 = (zc.b) this.f29255w;
                ad.l lVar2 = ((ad.d) this.f29254v).f487e;
                lVar2.getClass();
                boolean z14 = bVar3 instanceof ad.b;
                hd.l<SharedPreferences> lVar3 = lVar2.f518a;
                if (z14) {
                    SharedPreferences.Editor edit = lVar3.get().edit();
                    ad.b bVar4 = (ad.b) bVar3;
                    bVar4.getClass();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("token", bVar4.f478a);
                        jSONObject.put("receivedAt", bVar4.f479b);
                        jSONObject.put("expiresIn", bVar4.f480c);
                        str = jSONObject.toString();
                    } catch (JSONException e13) {
                        Log.e("ad.b", "Could not serialize token: " + e13.getMessage());
                    }
                    edit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", str).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
                    return;
                }
                lVar3.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", bVar3.b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
                return;
            case 12:
                a();
                return;
            case 13:
                b();
                return;
            case 14:
                ((ee.b) ((Map.Entry) this.f29254v).getKey()).a((ee.a) this.f29255w);
                return;
            case 15:
                id.a aVar4 = (id.a) this.f29254v;
                Runnable runnable2 = (Runnable) this.f29255w;
                Process.setThreadPriority(aVar4.f19959w);
                StrictMode.ThreadPolicy threadPolicy = aVar4.f19960x;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.f29254v;
                f.b bVar5 = (f.b) this.f29255w;
                try {
                    Object call = callable.call();
                    id.f fVar2 = id.f.this;
                    fVar2.getClass();
                    if (call == null) {
                        call = u.a.A;
                    }
                    if (u.a.f33705z.b(fVar2, null, call)) {
                        u.a.i(fVar2);
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    ((f.a) bVar5).a(e14);
                    return;
                }
            case 17:
                td.b bVar6 = (td.b) this.f29254v;
                CountDownLatch countDownLatch = (CountDownLatch) this.f29255w;
                bVar6.getClass();
                try {
                    fVar = bVar6.f33001g;
                    dVar = a7.d.HIGHEST;
                } catch (SQLException unused) {
                }
                if (fVar instanceof u) {
                    d7.w.a().f12271d.a(((u) fVar).f12262a.e(dVar), 1);
                    countDownLatch.countDown();
                    return;
                }
                throw new IllegalArgumentException("Expected instance of TransportImpl.");
            case 18:
                AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$3((TokenProvider.TokenChangeListener) this.f29254v, (zc.c) this.f29255w);
                return;
            case 19:
                AndroidAuthTokenProvider.lambda$addTokenChangeListener$3((TokenProvider.TokenChangeListener) this.f29254v, (we.b) this.f29255w);
                return;
            case 20:
                Activity activity = (Activity) this.f29254v;
                Runnable runnable3 = (Runnable) this.f29255w;
                a.b bVar7 = (a.b) he.a.a(activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment", a.b.class);
                if (bVar7 == null || bVar7.isRemoving()) {
                    bVar7 = new a.b();
                    activity.getFragmentManager().beginTransaction().add(bVar7, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
                    activity.getFragmentManager().executePendingTransactions();
                }
                bVar7.f17447u.a(runnable3);
                return;
            case 21:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f29254v;
                Runnable runnable4 = (Runnable) this.f29255w;
                a.c cVar2 = (a.c) he.a.a(pVar.getSupportFragmentManager().F("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment", a.c.class);
                if (cVar2 == null || cVar2.isRemoving()) {
                    cVar2 = new a.c();
                    y supportFragmentManager = pVar.getSupportFragmentManager();
                    androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                    l2.e(0, cVar2, "FirestoreOnStopObserverSupportFragment", 1);
                    l2.k();
                    pVar.getSupportFragmentManager().B();
                }
                cVar2.f17448u.a(runnable4);
                return;
            case 22:
                he.n nVar2 = (he.n) this.f29254v;
                ge.e eVar3 = (ge.e) this.f29255w;
                if (nVar2.f17554g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "SyncEngine not yet initialized", new Object[0]);
                kc.f.A(1, "FirestoreClient", "Credential changed. Current user: %s", eVar3.f16468a);
                c0 c0Var = nVar2.f17554g;
                boolean z15 = !c0Var.f17463m.equals(eVar3);
                c0Var.f17463m = eVar3;
                if (z15) {
                    HashMap hashMap = c0Var.f17461k;
                    for (Map.Entry entry : hashMap.entrySet()) {
                        for (ya.i iVar2 : (List) entry.getValue()) {
                            iVar2.a(new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change.", FirebaseFirestoreException.a.CANCELLED));
                        }
                    }
                    hashMap.clear();
                    je.k kVar = c0Var.f17452a;
                    List<le.g> j11 = kVar.f21848c.j();
                    kVar.b(eVar3);
                    kVar.f21846a.A("Start IndexManager", new je.j(kVar, 0));
                    kVar.f21846a.A("Start MutationQueue", new je.j(kVar, 1));
                    List<le.g> j12 = kVar.f21848c.j();
                    ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
                    for (List<le.g> list : Arrays.asList(j11, j12)) {
                        for (le.g gVar : list) {
                            for (le.f fVar3 : gVar.f24221d) {
                                immutableSortedSet = immutableSortedSet.insert(fVar3.f24215a);
                            }
                        }
                    }
                    c0Var.h(kVar.f.b(immutableSortedSet), null);
                }
                x xVar = c0Var.f17453b;
                if (xVar.f26278e) {
                    kc.f.A(1, "RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    xVar.d();
                    return;
                }
                return;
            case 23:
                je.k kVar2 = (je.k) this.f29254v;
                int i16 = je.k.f21845n;
                kVar2.getClass();
                for (je.l lVar4 : (List) this.f29255w) {
                    int i17 = lVar4.f21863a;
                    z zVar = kVar2.f21852h;
                    ImmutableSortedSet<ke.i> immutableSortedSet2 = lVar4.f21865c;
                    zVar.getClass();
                    Iterator<ke.i> it2 = immutableSortedSet2.iterator();
                    while (it2.hasNext()) {
                        je.c cVar3 = new je.c(i17, it2.next());
                        zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).insert(cVar3);
                        zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).insert(cVar3);
                    }
                    ImmutableSortedSet<ke.i> immutableSortedSet3 = lVar4.f21866d;
                    Iterator<ke.i> it3 = immutableSortedSet3.iterator();
                    while (it3.hasNext()) {
                        kVar2.f21846a.r().i(it3.next());
                    }
                    Iterator<ke.i> it4 = immutableSortedSet3.iterator();
                    while (it4.hasNext()) {
                        je.c cVar4 = new je.c(i17, it4.next());
                        zVar.f26148b = ((ImmutableSortedSet) zVar.f26148b).remove(cVar4);
                        zVar.f26149c = ((ImmutableSortedSet) zVar.f26149c).remove(cVar4);
                    }
                    if (!lVar4.f21864b) {
                        SparseArray<b1> sparseArray = kVar2.f21854j;
                        b1 b1Var = sparseArray.get(i17);
                        if (b1Var != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ca.a.u0(z11, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(i17));
                        r rVar = b1Var.f21800e;
                        sparseArray.put(i17, new b1(b1Var.f21796a, b1Var.f21797b, b1Var.f21798c, b1Var.f21799d, rVar, rVar, b1Var.f21801g));
                    }
                }
                return;
            case 24:
                ((je.k) this.f29254v).f21848c.d((com.google.protobuf.h) this.f29255w);
                return;
            case 25:
                b.c cVar5 = (b.c) this.f29254v;
                i0 i0Var = (i0) this.f29255w;
                cVar5.getClass();
                boolean e15 = i0Var.e();
                ne.b bVar8 = ne.b.this;
                if (e15) {
                    kc.f.A(1, bVar8.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(bVar8)));
                } else {
                    kc.f.A(2, bVar8.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(bVar8)), i0Var);
                }
                ca.a.u0(bVar8.d(), "Can't handle server close on non-started stream!", new Object[0]);
                bVar8.a(ne.y.Error, i0Var);
                return;
            case 26:
                ne.b bVar9 = ne.b.this;
                String simpleName = bVar9.getClass().getSimpleName();
                Object obj = this.f29255w;
                kc.f.A(1, simpleName, "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(bVar9)), obj);
                bVar9.e(obj);
                return;
            default:
                b.c cVar6 = (b.c) this.f29254v;
                tr.c0 c0Var2 = (tr.c0) this.f29255w;
                cVar6.getClass();
                HashMap hashMap2 = new HashMap();
                if (c0Var2.f33443b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    unmodifiableSet = Collections.emptySet();
                } else {
                    HashSet hashSet = new HashSet(c0Var2.f33443b);
                    for (int i18 = 0; i18 < c0Var2.f33443b; i18++) {
                        hashSet.add(new String(c0Var2.e(i18), 0));
                    }
                    unmodifiableSet = Collections.unmodifiableSet(hashSet);
                }
                for (String str2 : unmodifiableSet) {
                    if (ne.g.f26221d.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        c0.a aVar5 = tr.c0.f33440d;
                        BitSet bitSet = c0.d.f33445d;
                        hashMap2.put(str2, (String) c0Var2.c(new c0.b(str2, aVar5)));
                    }
                }
                if (!hashMap2.isEmpty()) {
                    ne.b bVar10 = ne.b.this;
                    kc.f.A(1, bVar10.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(bVar10)), hashMap2);
                    return;
                }
                return;
        }
    }
}

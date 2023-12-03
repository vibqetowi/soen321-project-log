package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b9.r;
import c9.l;
import c9.w;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.n;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import com.google.common.collect.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.d {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f6392b;

    /* renamed from: c  reason: collision with root package name */
    public final g.c f6393c;

    /* renamed from: d  reason: collision with root package name */
    public final j f6394d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, String> f6395e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f6396g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6397h;

    /* renamed from: i  reason: collision with root package name */
    public final d f6398i;

    /* renamed from: j  reason: collision with root package name */
    public final r f6399j;

    /* renamed from: k  reason: collision with root package name */
    public final e f6400k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6401l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f6402m;

    /* renamed from: n  reason: collision with root package name */
    public final Set<c> f6403n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<DefaultDrmSession> f6404o;

    /* renamed from: p  reason: collision with root package name */
    public int f6405p;

    /* renamed from: q  reason: collision with root package name */
    public g f6406q;
    public DefaultDrmSession r;

    /* renamed from: s  reason: collision with root package name */
    public DefaultDrmSession f6407s;

    /* renamed from: t  reason: collision with root package name */
    public Looper f6408t;

    /* renamed from: u  reason: collision with root package name */
    public Handler f6409u;

    /* renamed from: v  reason: collision with root package name */
    public int f6410v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f6411w;

    /* renamed from: x  reason: collision with root package name */
    public volatile b f6412x;

    /* loaded from: classes.dex */
    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MissingSchemeDataException(UUID uuid) {
            super(r1.toString());
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
            sb2.append("Media does not support uuid: ");
            sb2.append(valueOf);
        }
    }

    /* loaded from: classes.dex */
    public class a implements g.b {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = DefaultDrmSessionManager.this.f6402m.iterator();
            while (it.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                if (Arrays.equals(defaultDrmSession.f6381t, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f6368e == 0 && defaultDrmSession.f6376n == 4) {
                        int i6 = w.f5205a;
                        defaultDrmSession.g(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements d.b {

        /* renamed from: u  reason: collision with root package name */
        public final c.a f6415u;

        /* renamed from: v  reason: collision with root package name */
        public DrmSession f6416v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f6417w;

        public c(c.a aVar) {
            this.f6415u = aVar;
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public final void a() {
            Handler handler = DefaultDrmSessionManager.this.f6409u;
            handler.getClass();
            w.B(handler, new androidx.activity.b(20, this));
        }
    }

    /* loaded from: classes.dex */
    public class d implements DefaultDrmSession.a {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f6419a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public DefaultDrmSession f6420b;

        public final void a(Exception exc, boolean z10) {
            int i6;
            this.f6420b = null;
            HashSet hashSet = this.f6419a;
            s z11 = s.z(hashSet);
            hashSet.clear();
            s.b listIterator = z11.listIterator(0);
            while (listIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) listIterator.next();
                defaultDrmSession.getClass();
                if (z10) {
                    i6 = 1;
                } else {
                    i6 = 3;
                }
                defaultDrmSession.i(i6, exc);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements DefaultDrmSession.b {
        public e() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, g.c cVar, i iVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, com.google.android.exoplayer2.upstream.a aVar, long j10) {
        uuid.getClass();
        sc.b.p("Use C.CLEARKEY_UUID instead", !o7.b.f27181b.equals(uuid));
        this.f6392b = uuid;
        this.f6393c = cVar;
        this.f6394d = iVar;
        this.f6395e = hashMap;
        this.f = z10;
        this.f6396g = iArr;
        this.f6397h = z11;
        this.f6399j = aVar;
        this.f6398i = new d();
        this.f6400k = new e();
        this.f6410v = 0;
        this.f6402m = new ArrayList();
        this.f6403n = Collections.newSetFromMap(new IdentityHashMap());
        this.f6404o = Collections.newSetFromMap(new IdentityHashMap());
        this.f6401l = j10;
    }

    public static boolean f(DefaultDrmSession defaultDrmSession) {
        if (defaultDrmSession.f6376n == 1) {
            if (w.f5205a < 19) {
                return true;
            }
            DrmSession.DrmSessionException error = defaultDrmSession.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(com.google.android.exoplayer2.drm.b bVar, UUID uuid, boolean z10) {
        boolean z11;
        ArrayList arrayList = new ArrayList(bVar.f6432x);
        for (int i6 = 0; i6 < bVar.f6432x; i6++) {
            b.C0134b c0134b = bVar.f6429u[i6];
            if (!c0134b.a(uuid) && (!o7.b.f27182c.equals(uuid) || !c0134b.a(o7.b.f27181b))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && (c0134b.f6437y != null || z10)) {
                arrayList.add(c0134b);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void a() {
        int i6 = this.f6405p - 1;
        this.f6405p = i6;
        if (i6 != 0) {
            return;
        }
        if (this.f6401l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f6402m);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((DefaultDrmSession) arrayList.get(i10)).b(null);
            }
        }
        Iterator it = u.z(this.f6403n).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
        k();
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final d.b b(Looper looper, c.a aVar, n nVar) {
        boolean z10;
        if (this.f6405p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        j(looper);
        c cVar = new c(aVar);
        Handler handler = this.f6409u;
        handler.getClass();
        handler.post(new q7.f(cVar, 1, nVar));
        return cVar;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final DrmSession c(Looper looper, c.a aVar, n nVar) {
        boolean z10;
        if (this.f6405p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        j(looper);
        return e(looper, aVar, nVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(n nVar) {
        g gVar = this.f6406q;
        gVar.getClass();
        int l2 = gVar.l();
        com.google.android.exoplayer2.drm.b bVar = nVar.I;
        boolean z10 = false;
        if (bVar == null) {
            int g5 = l.g(nVar.F);
            int i6 = 0;
            while (true) {
                int[] iArr = this.f6396g;
                if (i6 < iArr.length) {
                    if (iArr[i6] == g5) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 == -1) {
                return 0;
            }
            return l2;
        }
        if (this.f6411w == null) {
            UUID uuid = this.f6392b;
            if (i(bVar, uuid, true).isEmpty()) {
                if (bVar.f6432x == 1 && bVar.f6429u[0].a(o7.b.f27181b)) {
                    String valueOf = String.valueOf(uuid);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
                    sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                    sb2.append(valueOf);
                    Log.w("DefaultDrmSessionMgr", sb2.toString());
                }
                if (!z10) {
                    return 1;
                }
                return l2;
            }
            String str = bVar.f6431w;
            if (str != null) {
                if (!"cenc".equals(str)) {
                    if ("cbcs".equals(str)) {
                    }
                    if (!z10) {
                    }
                }
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    public final DrmSession e(Looper looper, c.a aVar, n nVar, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        if (this.f6412x == null) {
            this.f6412x = new b(looper);
        }
        com.google.android.exoplayer2.drm.b bVar = nVar.I;
        int i6 = 0;
        DefaultDrmSession defaultDrmSession = null;
        if (bVar == null) {
            int g5 = l.g(nVar.F);
            g gVar = this.f6406q;
            gVar.getClass();
            if (gVar.l() == 2 && s7.g.f31300d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return null;
            }
            int[] iArr = this.f6396g;
            while (true) {
                if (i6 < iArr.length) {
                    if (iArr[i6] == g5) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 == -1 || gVar.l() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession2 = this.r;
            if (defaultDrmSession2 == null) {
                s.b bVar2 = s.f9446v;
                DefaultDrmSession h10 = h(l0.f9412y, true, null, z10);
                this.f6402m.add(h10);
                this.r = h10;
            } else {
                defaultDrmSession2.a(null);
            }
            return this.r;
        }
        if (this.f6411w == null) {
            arrayList = i(bVar, this.f6392b, false);
            if (arrayList.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f6392b);
                ca.a.Q("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.e(missingSchemeDataException);
                }
                return new f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            arrayList = null;
        }
        if (!this.f) {
            defaultDrmSession = this.f6407s;
        } else {
            Iterator it = this.f6402m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) it.next();
                if (w.a(defaultDrmSession3.f6364a, arrayList)) {
                    defaultDrmSession = defaultDrmSession3;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = h(arrayList, false, aVar, z10);
            if (!this.f) {
                this.f6407s = defaultDrmSession;
            }
            this.f6402m.add(defaultDrmSession);
        } else {
            defaultDrmSession.a(aVar);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession g(List<b.C0134b> list, boolean z10, c.a aVar) {
        this.f6406q.getClass();
        UUID uuid = this.f6392b;
        g gVar = this.f6406q;
        d dVar = this.f6398i;
        e eVar = this.f6400k;
        int i6 = this.f6410v;
        byte[] bArr = this.f6411w;
        HashMap<String, String> hashMap = this.f6395e;
        j jVar = this.f6394d;
        Looper looper = this.f6408t;
        looper.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, gVar, dVar, eVar, list, i6, this.f6397h | z10, z10, bArr, hashMap, jVar, looper, this.f6399j);
        defaultDrmSession.a(aVar);
        if (this.f6401l != -9223372036854775807L) {
            defaultDrmSession.a(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession h(List<b.C0134b> list, boolean z10, c.a aVar, boolean z11) {
        DefaultDrmSession g5 = g(list, z10, aVar);
        boolean f = f(g5);
        long j10 = this.f6401l;
        Set<DefaultDrmSession> set = this.f6404o;
        if (f && !set.isEmpty()) {
            Iterator it = u.z(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).b(null);
            }
            g5.b(aVar);
            if (j10 != -9223372036854775807L) {
                g5.b(null);
            }
            g5 = g(list, z10, aVar);
        }
        if (f(g5) && z11) {
            Set<c> set2 = this.f6403n;
            if (!set2.isEmpty()) {
                Iterator it2 = u.z(set2).iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    Iterator it3 = u.z(set).iterator();
                    while (it3.hasNext()) {
                        ((DrmSession) it3.next()).b(null);
                    }
                }
                g5.b(aVar);
                if (j10 != -9223372036854775807L) {
                    g5.b(null);
                }
                return g(list, z10, aVar);
            }
            return g5;
        }
        return g5;
    }

    public final synchronized void j(Looper looper) {
        boolean z10;
        Looper looper2 = this.f6408t;
        if (looper2 == null) {
            this.f6408t = looper;
            this.f6409u = new Handler(looper);
        } else {
            if (looper2 == looper) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            this.f6409u.getClass();
        }
    }

    public final void k() {
        if (this.f6406q != null && this.f6405p == 0 && this.f6402m.isEmpty() && this.f6403n.isEmpty()) {
            g gVar = this.f6406q;
            gVar.getClass();
            gVar.a();
            this.f6406q = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void l() {
        int i6 = this.f6405p;
        this.f6405p = i6 + 1;
        if (i6 != 0) {
            return;
        }
        if (this.f6406q == null) {
            g a10 = this.f6393c.a(this.f6392b);
            this.f6406q = a10;
            a10.j(new a());
        } else if (this.f6401l != -9223372036854775807L) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f6402m;
                if (i10 < arrayList.size()) {
                    ((DefaultDrmSession) arrayList.get(i10)).a(null);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}

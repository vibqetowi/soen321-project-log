package r1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.media.AudioAttributes;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import o1.u;
import r1.c0;
import r1.d;
import r1.e0;
import r1.g;
import r1.k;
import r1.l;
/* compiled from: MediaRouter.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f30290c = Log.isLoggable("MediaRouter", 3);

    /* renamed from: d  reason: collision with root package name */
    public static d f30291d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30292a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f30293b = new ArrayList<>();

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final l f30294a;

        /* renamed from: b  reason: collision with root package name */
        public final a f30295b;

        /* renamed from: c  reason: collision with root package name */
        public k f30296c = k.f30286c;

        /* renamed from: d  reason: collision with root package name */
        public int f30297d;

        public b(l lVar, a aVar) {
            this.f30294a = lVar;
            this.f30295b = aVar;
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class d implements e0.e, c0.c {
        public MediaSessionCompat A;
        public final b B;

        /* renamed from: a  reason: collision with root package name */
        public final Context f30298a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30299b;

        /* renamed from: c  reason: collision with root package name */
        public final r1.d f30300c;

        /* renamed from: l  reason: collision with root package name */
        public final e0.d f30308l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f30309m;

        /* renamed from: n  reason: collision with root package name */
        public x f30310n;

        /* renamed from: o  reason: collision with root package name */
        public g f30311o;

        /* renamed from: p  reason: collision with root package name */
        public g f30312p;

        /* renamed from: q  reason: collision with root package name */
        public g f30313q;
        public g.e r;

        /* renamed from: s  reason: collision with root package name */
        public g f30314s;

        /* renamed from: t  reason: collision with root package name */
        public g.b f30315t;

        /* renamed from: v  reason: collision with root package name */
        public r1.f f30317v;

        /* renamed from: w  reason: collision with root package name */
        public r1.f f30318w;

        /* renamed from: x  reason: collision with root package name */
        public int f30319x;

        /* renamed from: y  reason: collision with root package name */
        public g f30320y;

        /* renamed from: z  reason: collision with root package name */
        public C0516d f30321z;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<WeakReference<l>> f30301d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<g> f30302e = new ArrayList<>();
        public final HashMap f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        public final ArrayList<f> f30303g = new ArrayList<>();

        /* renamed from: h  reason: collision with root package name */
        public final ArrayList<g> f30304h = new ArrayList<>();

        /* renamed from: i  reason: collision with root package name */
        public final d0 f30305i = new d0();

        /* renamed from: j  reason: collision with root package name */
        public final f f30306j = new f();

        /* renamed from: k  reason: collision with root package name */
        public final c f30307k = new c();

        /* renamed from: u  reason: collision with root package name */
        public final HashMap f30316u = new HashMap();

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public class a implements MediaSessionCompat.g {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.g
            public final void a() {
                d.this.getClass();
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public class b implements g.b.InterfaceC0515b {
            public b() {
            }

            public final void a(g.b bVar, r1.e eVar, Collection<g.b.a> collection) {
                d dVar = d.this;
                if (bVar == dVar.f30315t && eVar != null) {
                    f fVar = dVar.f30314s.f30341a;
                    String d10 = eVar.d();
                    g gVar = new g(fVar, d10, dVar.b(fVar, d10));
                    gVar.i(eVar);
                    g gVar2 = dVar.f30314s;
                    if (dVar.f30313q != gVar) {
                        dVar.i(3);
                        dVar.f30313q = gVar;
                        dVar.r = dVar.f30315t;
                        dVar.f30314s = null;
                        dVar.f30315t = null;
                        Message obtainMessage = dVar.f30307k.obtainMessage(264, new s0.c(gVar2, gVar));
                        obtainMessage.arg1 = 3;
                        obtainMessage.sendToTarget();
                        dVar.f30316u.clear();
                        dVar.f30313q.m(collection);
                        dVar.h();
                        dVar.m();
                    }
                } else if (bVar == dVar.r) {
                    if (eVar != null) {
                        dVar.o(dVar.f30313q, eVar);
                    }
                    dVar.f30313q.m(collection);
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class c extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b> f30324a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final ArrayList f30325b = new ArrayList();

            public c() {
            }

            public static void a(b bVar, int i6, Object obj, int i10) {
                g gVar;
                g gVar2;
                boolean z10;
                x xVar;
                l lVar = bVar.f30294a;
                int i11 = 65280 & i6;
                a aVar = bVar.f30295b;
                if (i11 != 256) {
                    if (i11 == 512) {
                        f fVar = (f) obj;
                        switch (i6) {
                            case 513:
                                aVar.a(lVar);
                                return;
                            case 514:
                                aVar.c(lVar);
                                return;
                            case 515:
                                aVar.b(lVar);
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                }
                if (i6 != 264 && i6 != 262) {
                    gVar = (g) obj;
                } else {
                    gVar = (g) ((s0.c) obj).f31065b;
                }
                if (i6 != 264 && i6 != 262) {
                    gVar2 = null;
                } else {
                    gVar2 = (g) ((s0.c) obj).f31064a;
                }
                if (gVar != null) {
                    boolean z11 = true;
                    if ((bVar.f30297d & 2) == 0 && !gVar.h(bVar.f30296c)) {
                        d dVar = l.f30291d;
                        if (dVar == null || (xVar = dVar.f30310n) == null) {
                            z10 = false;
                        } else {
                            z10 = xVar.f30370b;
                        }
                        z11 = (z10 && gVar.d() && i6 == 262 && i10 == 3 && gVar2 != null) ? true ^ gVar2.d() : false;
                    }
                    if (z11) {
                        switch (i6) {
                            case 257:
                                aVar.d(lVar, gVar);
                                return;
                            case 258:
                                aVar.f(lVar, gVar);
                                return;
                            case 259:
                                aVar.e(lVar, gVar);
                                return;
                            case 260:
                                aVar.j(gVar);
                                return;
                            case 261:
                                aVar.getClass();
                                return;
                            case 262:
                                aVar.g(gVar);
                                return;
                            case 263:
                                aVar.i(lVar, gVar, i10);
                                return;
                            case 264:
                                aVar.g(gVar);
                                return;
                            default:
                                return;
                        }
                    }
                }
            }

            public final void b(int i6, Object obj) {
                obtainMessage(i6, obj).sendToTarget();
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int u10;
                ArrayList<b> arrayList = this.f30324a;
                int i6 = message.what;
                Object obj = message.obj;
                int i10 = message.arg1;
                d dVar = d.this;
                if (i6 == 259 && dVar.g().f30343c.equals(((g) obj).f30343c)) {
                    dVar.p(true);
                }
                ArrayList arrayList2 = this.f30325b;
                if (i6 != 262) {
                    if (i6 != 264) {
                        switch (i6) {
                            case 257:
                                dVar.f30308l.y((g) obj);
                                break;
                            case 258:
                                dVar.f30308l.z((g) obj);
                                break;
                            case 259:
                                e0.d dVar2 = dVar.f30308l;
                                g gVar = (g) obj;
                                dVar2.getClass();
                                if (gVar.c() != dVar2 && (u10 = dVar2.u(gVar)) >= 0) {
                                    dVar2.F(dVar2.L.get(u10));
                                    break;
                                }
                                break;
                        }
                    } else {
                        g gVar2 = (g) ((s0.c) obj).f31065b;
                        arrayList2.add(gVar2);
                        dVar.f30308l.y(gVar2);
                        dVar.f30308l.A(gVar2);
                    }
                } else {
                    g gVar3 = (g) ((s0.c) obj).f31065b;
                    dVar.f30308l.A(gVar3);
                    if (dVar.f30311o != null && gVar3.d()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            dVar.f30308l.z((g) it.next());
                        }
                        arrayList2.clear();
                    }
                }
                try {
                    int size = dVar.f30301d.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            ArrayList<WeakReference<l>> arrayList3 = dVar.f30301d;
                            l lVar = arrayList3.get(size).get();
                            if (lVar == null) {
                                arrayList3.remove(size);
                            } else {
                                arrayList.addAll(lVar.f30293b);
                            }
                        } else {
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                a(arrayList.get(i11), i6, obj, i10);
                            }
                            return;
                        }
                    }
                } finally {
                    arrayList.clear();
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* renamed from: r1.l$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0516d {

            /* renamed from: a  reason: collision with root package name */
            public final MediaSessionCompat f30327a;

            /* renamed from: b  reason: collision with root package name */
            public p f30328b;

            public C0516d(MediaSessionCompat mediaSessionCompat) {
                this.f30327a = mediaSessionCompat;
            }

            public final void a() {
                MediaSessionCompat mediaSessionCompat = this.f30327a;
                if (mediaSessionCompat != null) {
                    int i6 = d.this.f30305i.f30242d;
                    MediaSessionCompat.c cVar = mediaSessionCompat.f879a;
                    cVar.getClass();
                    AudioAttributes.Builder builder = new AudioAttributes.Builder();
                    builder.setLegacyStreamType(i6);
                    cVar.f897a.setPlaybackToLocal(builder.build());
                    this.f30328b = null;
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class e extends d.a {
            public e() {
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class f extends g.a {
            public f() {
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class g {
            public g() {
                throw null;
            }
        }

        public d(Context context) {
            e0.d dVar;
            new a();
            this.B = new b();
            this.f30298a = context;
            WeakHashMap<Context, l0.a> weakHashMap = l0.a.f23990a;
            synchronized (weakHashMap) {
                if (weakHashMap.get(context) == null) {
                    weakHashMap.put(context, new l0.a());
                }
            }
            this.f30309m = ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).isLowRamDevice();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                int i10 = y.f30373a;
                Intent intent = new Intent(context, y.class);
                intent.setPackage(context.getPackageName());
                this.f30299b = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
            } else {
                this.f30299b = false;
            }
            if (this.f30299b) {
                this.f30300c = new r1.d(context, new e());
            } else {
                this.f30300c = null;
            }
            if (i6 >= 24) {
                dVar = new e0.a(context, this);
            } else {
                dVar = new e0.d(context, this);
            }
            this.f30308l = dVar;
        }

        public final void a(r1.g gVar) {
            if (d(gVar) == null) {
                f fVar = new f(gVar);
                this.f30303g.add(fVar);
                if (l.f30290c) {
                    Log.d("MediaRouter", "Provider added: " + fVar);
                }
                this.f30307k.b(513, fVar);
                n(fVar, gVar.A);
                l.b();
                gVar.f30261x = this.f30306j;
                gVar.q(this.f30317v);
            }
        }

        public final String b(f fVar, String str) {
            String flattenToShortString = fVar.f30339c.f30275a.flattenToShortString();
            String f2 = defpackage.d.f(flattenToShortString, ":", str);
            int e10 = e(f2);
            HashMap hashMap = this.f;
            if (e10 < 0) {
                hashMap.put(new s0.c(flattenToShortString, str), f2);
                return f2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i6 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", f2, Integer.valueOf(i6));
                if (e(format) < 0) {
                    hashMap.put(new s0.c(flattenToShortString, str), format);
                    return format;
                }
                i6++;
            }
        }

        public final g c() {
            boolean z10;
            Iterator<g> it = this.f30302e.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next != this.f30311o) {
                    if (next.c() == this.f30308l && next.l("android.media.intent.category.LIVE_AUDIO") && !next.l("android.media.intent.category.LIVE_VIDEO")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && next.f()) {
                        return next;
                    }
                }
            }
            return this.f30311o;
        }

        public final f d(r1.g gVar) {
            ArrayList<f> arrayList = this.f30303g;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).f30337a == gVar) {
                    return arrayList.get(i6);
                }
            }
            return null;
        }

        public final int e(String str) {
            ArrayList<g> arrayList = this.f30302e;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).f30343c.equals(str)) {
                    return i6;
                }
            }
            return -1;
        }

        public final g f() {
            g gVar = this.f30311o;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public final g g() {
            g gVar = this.f30313q;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public final void h() {
            if (!this.f30313q.e()) {
                return;
            }
            List<g> b10 = this.f30313q.b();
            HashSet hashSet = new HashSet();
            for (g gVar : b10) {
                hashSet.add(gVar.f30343c);
            }
            HashMap hashMap = this.f30316u;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    g.e eVar = (g.e) entry.getValue();
                    eVar.h(0);
                    eVar.d();
                    it.remove();
                }
            }
            for (g gVar2 : b10) {
                if (!hashMap.containsKey(gVar2.f30343c)) {
                    g.e n10 = gVar2.c().n(gVar2.f30342b, this.f30313q.f30342b);
                    n10.e();
                    hashMap.put(gVar2.f30343c, n10);
                }
            }
        }

        public final void i(int i6) {
            if (this.f30313q == null) {
                return;
            }
            e eVar = new e(this, i6);
            this.f30320y = this.f30313q;
            eVar.a();
            Message obtainMessage = this.f30307k.obtainMessage(263, this.f30313q);
            obtainMessage.arg1 = i6;
            obtainMessage.sendToTarget();
            this.r = null;
            this.f30316u.clear();
            this.f30313q = null;
        }

        public final void j(g gVar, int i6) {
            if (!this.f30302e.contains(gVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + gVar);
            } else if (!gVar.f30346g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + gVar);
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    r1.g c10 = gVar.c();
                    r1.d dVar = this.f30300c;
                    if (c10 == dVar && this.f30313q != gVar) {
                        String str = gVar.f30342b;
                        MediaRoute2Info r = dVar.r(str);
                        if (r != null) {
                            dVar.C.transferTo(r);
                            return;
                        }
                        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                        return;
                    }
                }
                k(gVar, i6);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r0 != false) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void k(g gVar, int i6) {
            Executor fVar;
            boolean z10;
            boolean z11 = false;
            if (l.f30291d != null) {
                if (this.f30312p != null) {
                    gVar.getClass();
                    l.b();
                    if (l.f30291d.f() == gVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.f30313q != gVar) {
                    return;
                }
                if (this.f30314s != null) {
                    this.f30314s = null;
                    g.b bVar = this.f30315t;
                    if (bVar != null) {
                        bVar.h(3);
                        this.f30315t.d();
                        this.f30315t = null;
                    }
                }
                if (this.f30299b) {
                    j jVar = gVar.f30341a.f30340d;
                    if (jVar != null && jVar.f30285b) {
                        z11 = true;
                    }
                    if (z11) {
                        g.b l2 = gVar.c().l(gVar.f30342b);
                        if (l2 != null) {
                            Context context = this.f30298a;
                            Object obj = g0.a.f16164a;
                            if (Build.VERSION.SDK_INT >= 28) {
                                fVar = a.g.a(context);
                            } else {
                                fVar = new o0.f(new Handler(context.getMainLooper()));
                            }
                            b bVar2 = this.B;
                            synchronized (l2.f30264a) {
                                if (fVar != null) {
                                    if (bVar2 != null) {
                                        l2.f30265b = fVar;
                                        l2.f30266c = bVar2;
                                        ArrayList arrayList = l2.f30268e;
                                        if (arrayList != null && !arrayList.isEmpty()) {
                                            r1.e eVar = l2.f30267d;
                                            ArrayList arrayList2 = l2.f30268e;
                                            l2.f30267d = null;
                                            l2.f30268e = null;
                                            l2.f30265b.execute(new h(l2, bVar2, eVar, arrayList2));
                                        }
                                    } else {
                                        throw new NullPointerException("Listener shouldn't be null");
                                    }
                                } else {
                                    throw new NullPointerException("Executor shouldn't be null");
                                }
                            }
                            this.f30314s = gVar;
                            this.f30315t = l2;
                            l2.e();
                            return;
                        }
                        Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + gVar);
                    }
                }
                g gVar2 = this.f30313q;
                i(i6);
                g.e m10 = gVar.c().m(gVar.f30342b);
                this.r = m10;
                this.f30313q = gVar;
                if (m10 != null) {
                    m10.e();
                }
                if (l.f30290c) {
                    Log.d("MediaRouter", "Route selected: " + this.f30313q);
                }
                Message obtainMessage = this.f30307k.obtainMessage(262, new s0.c(gVar2, this.f30313q));
                obtainMessage.arg1 = i6;
                obtainMessage.sendToTarget();
                this.f30316u.clear();
                h();
                m();
                return;
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 3; i10 < stackTrace.length; i10++) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                sb2.append(stackTraceElement.getClassName());
                sb2.append(".");
                sb2.append(stackTraceElement.getMethodName());
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
                sb2.append("  ");
            }
            if (l.f30291d == null) {
                Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.f30298a.getPackageName() + ", callers=" + sb2.toString());
            } else {
                Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.f30298a.getPackageName() + ", callers=" + sb2.toString());
            }
            if (this.f30313q != gVar) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r14.f30318w.b() == r6) goto L56;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l() {
            k kVar;
            k.a aVar = new k.a();
            ArrayList<WeakReference<l>> arrayList = this.f30301d;
            int size = arrayList.size();
            int i6 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                size--;
                boolean z12 = this.f30309m;
                if (size >= 0) {
                    l lVar = arrayList.get(size).get();
                    if (lVar == null) {
                        arrayList.remove(size);
                    } else {
                        ArrayList<b> arrayList2 = lVar.f30293b;
                        int size2 = arrayList2.size();
                        i6 += size2;
                        for (int i10 = 0; i10 < size2; i10++) {
                            b bVar = arrayList2.get(i10);
                            k kVar2 = bVar.f30296c;
                            if (kVar2 != null) {
                                kVar2.a();
                                aVar.a(kVar2.f30288b);
                                int i11 = bVar.f30297d;
                                if ((i11 & 1) != 0) {
                                    z10 = true;
                                    z11 = true;
                                }
                                if ((i11 & 4) != 0 && !z12) {
                                    z10 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    z10 = true;
                                }
                            } else {
                                throw new IllegalArgumentException("selector must not be null");
                            }
                        }
                        continue;
                    }
                } else {
                    this.f30319x = i6;
                    if (z10) {
                        kVar = aVar.b();
                    } else {
                        kVar = k.f30286c;
                    }
                    k b10 = aVar.b();
                    boolean z13 = this.f30299b;
                    r1.d dVar = this.f30300c;
                    if (z13) {
                        r1.f fVar = this.f30318w;
                        if (fVar != null) {
                            fVar.a();
                            if (fVar.f30257b.equals(b10)) {
                            }
                        }
                        if (b10.c() && !z11) {
                            if (this.f30318w != null) {
                                this.f30318w = null;
                            }
                        } else {
                            this.f30318w = new r1.f(b10, z11);
                        }
                        if (l.f30290c) {
                            Log.d("MediaRouter", "Updated MediaRoute2Provider's discovery request: " + this.f30318w);
                        }
                        dVar.q(this.f30318w);
                    }
                    r1.f fVar2 = this.f30317v;
                    if (fVar2 != null) {
                        fVar2.a();
                        if (fVar2.f30257b.equals(kVar) && this.f30317v.b() == z11) {
                            return;
                        }
                    }
                    if (kVar.c() && !z11) {
                        if (this.f30317v == null) {
                            return;
                        }
                        this.f30317v = null;
                    } else {
                        this.f30317v = new r1.f(kVar, z11);
                    }
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Updated discovery request: " + this.f30317v);
                    }
                    if (z10 && !z11 && z12) {
                        Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                    }
                    ArrayList<f> arrayList3 = this.f30303g;
                    int size3 = arrayList3.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        r1.g gVar = arrayList3.get(i12).f30337a;
                        if (gVar != dVar) {
                            gVar.q(this.f30317v);
                        }
                    }
                    return;
                }
            }
        }

        public final void m() {
            int i6;
            String str;
            MediaRouter2.RoutingController routingController;
            g gVar = this.f30313q;
            if (gVar != null) {
                int i10 = gVar.f30354o;
                d0 d0Var = this.f30305i;
                d0Var.f30239a = i10;
                d0Var.f30240b = gVar.f30355p;
                d0Var.f30241c = gVar.f30353n;
                d0Var.f30242d = gVar.f30351l;
                int i11 = gVar.f30350k;
                d0Var.getClass();
                if (this.f30299b && gVar.c() == this.f30300c) {
                    g.e eVar = this.r;
                    int i12 = r1.d.L;
                    if ((eVar instanceof d.c) && (routingController = ((d.c) eVar).f30225g) != null) {
                        str = routingController.getId();
                    } else {
                        str = null;
                    }
                    d0Var.f30243e = str;
                } else {
                    d0Var.f30243e = null;
                }
                ArrayList<g> arrayList = this.f30304h;
                if (arrayList.size() <= 0) {
                    if (this.f30321z != null) {
                        if (this.f30313q != f() && this.f30313q != this.f30312p) {
                            if (d0Var.f30241c == 1) {
                                i6 = 2;
                            } else {
                                i6 = 0;
                            }
                            C0516d c0516d = this.f30321z;
                            int i13 = d0Var.f30240b;
                            int i14 = d0Var.f30239a;
                            String str2 = d0Var.f30243e;
                            MediaSessionCompat mediaSessionCompat = c0516d.f30327a;
                            if (mediaSessionCompat != null) {
                                p pVar = c0516d.f30328b;
                                if (pVar != null && i6 == 0 && i13 == 0) {
                                    pVar.f26983d = i14;
                                    u.a.a(pVar.a(), i14);
                                    return;
                                }
                                p pVar2 = new p(c0516d, i6, i13, i14, str2);
                                c0516d.f30328b = pVar2;
                                MediaSessionCompat.c cVar = mediaSessionCompat.f879a;
                                cVar.getClass();
                                cVar.f897a.setPlaybackToRemote(pVar2.a());
                                return;
                            }
                            return;
                        }
                        this.f30321z.a();
                        return;
                    }
                    return;
                }
                arrayList.get(0).getClass();
                throw null;
            }
            C0516d c0516d2 = this.f30321z;
            if (c0516d2 != null) {
                c0516d2.a();
            }
        }

        public final void n(f fVar, j jVar) {
            boolean z10;
            boolean z11;
            int i6;
            Iterator<r1.e> it;
            if (fVar.f30340d != jVar) {
                fVar.f30340d = jVar;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            ArrayList<g> arrayList = this.f30302e;
            ArrayList arrayList2 = fVar.f30338b;
            c cVar = this.f30307k;
            if (jVar != null && (jVar.b() || jVar == this.f30308l.A)) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator<r1.e> it2 = jVar.f30284a.iterator();
                boolean z12 = false;
                i6 = 0;
                while (it2.hasNext()) {
                    r1.e next = it2.next();
                    if (next != null && next.e()) {
                        String d10 = next.d();
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                it = it2;
                                if (((g) arrayList2.get(i10)).f30342b.equals(d10)) {
                                    break;
                                }
                                i10++;
                                it2 = it;
                            } else {
                                it = it2;
                                i10 = -1;
                                break;
                            }
                        }
                        if (i10 < 0) {
                            g gVar = new g(fVar, d10, b(fVar, d10));
                            int i11 = i6 + 1;
                            arrayList2.add(i6, gVar);
                            arrayList.add(gVar);
                            if (next.b().size() > 0) {
                                arrayList3.add(new s0.c(gVar, next));
                            } else {
                                gVar.i(next);
                                if (l.f30290c) {
                                    Log.d("MediaRouter", "Route added: " + gVar);
                                }
                                cVar.b(257, gVar);
                            }
                            i6 = i11;
                        } else if (i10 < i6) {
                            Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + next);
                        } else {
                            g gVar2 = (g) arrayList2.get(i10);
                            int i12 = i6 + 1;
                            Collections.swap(arrayList2, i10, i6);
                            if (next.b().size() > 0) {
                                arrayList4.add(new s0.c(gVar2, next));
                            } else if (o(gVar2, next) != 0 && gVar2 == this.f30313q) {
                                i6 = i12;
                                z12 = true;
                            }
                            i6 = i12;
                        }
                    } else {
                        it = it2;
                        Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + next);
                    }
                    it2 = it;
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    s0.c cVar2 = (s0.c) it3.next();
                    g gVar3 = (g) cVar2.f31064a;
                    gVar3.i((r1.e) cVar2.f31065b);
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Route added: " + gVar3);
                    }
                    cVar.b(257, gVar3);
                }
                Iterator it4 = arrayList4.iterator();
                z11 = z12;
                while (it4.hasNext()) {
                    s0.c cVar3 = (s0.c) it4.next();
                    g gVar4 = (g) cVar3.f31064a;
                    if (o(gVar4, (r1.e) cVar3.f31065b) != 0 && gVar4 == this.f30313q) {
                        z11 = true;
                    }
                }
            } else {
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + jVar);
                z11 = false;
                i6 = 0;
            }
            for (int size2 = arrayList2.size() - 1; size2 >= i6; size2--) {
                g gVar5 = (g) arrayList2.get(size2);
                gVar5.i(null);
                arrayList.remove(gVar5);
            }
            p(z11);
            for (int size3 = arrayList2.size() - 1; size3 >= i6; size3--) {
                g gVar6 = (g) arrayList2.remove(size3);
                if (l.f30290c) {
                    Log.d("MediaRouter", "Route removed: " + gVar6);
                }
                cVar.b(258, gVar6);
            }
            if (l.f30290c) {
                Log.d("MediaRouter", "Provider changed: " + fVar);
            }
            cVar.b(515, fVar);
        }

        public final int o(g gVar, r1.e eVar) {
            int i6 = gVar.i(eVar);
            if (i6 != 0) {
                int i10 = i6 & 1;
                c cVar = this.f30307k;
                if (i10 != 0) {
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Route changed: " + gVar);
                    }
                    cVar.b(259, gVar);
                }
                if ((i6 & 2) != 0) {
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Route volume changed: " + gVar);
                    }
                    cVar.b(260, gVar);
                }
                if ((i6 & 4) != 0) {
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + gVar);
                    }
                    cVar.b(261, gVar);
                }
            }
            return i6;
        }

        public final void p(boolean z10) {
            boolean z11;
            boolean z12;
            g gVar = this.f30311o;
            if (gVar != null && !gVar.f()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f30311o);
                this.f30311o = null;
            }
            g gVar2 = this.f30311o;
            ArrayList<g> arrayList = this.f30302e;
            e0.d dVar = this.f30308l;
            if (gVar2 == null && !arrayList.isEmpty()) {
                Iterator<g> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (next.c() == dVar && next.f30342b.equals("DEFAULT_ROUTE")) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12 && next.f()) {
                        this.f30311o = next;
                        Log.i("MediaRouter", "Found default route: " + this.f30311o);
                        break;
                    }
                }
            }
            g gVar3 = this.f30312p;
            if (gVar3 != null && !gVar3.f()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f30312p);
                this.f30312p = null;
            }
            if (this.f30312p == null && !arrayList.isEmpty()) {
                Iterator<g> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    g next2 = it2.next();
                    if (next2.c() == dVar && next2.l("android.media.intent.category.LIVE_AUDIO") && !next2.l("android.media.intent.category.LIVE_VIDEO")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && next2.f()) {
                        this.f30312p = next2;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f30312p);
                        break;
                    }
                }
            }
            g gVar4 = this.f30313q;
            if (gVar4 != null && gVar4.f30346g) {
                if (z10) {
                    h();
                    m();
                    return;
                }
                return;
            }
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f30313q);
            k(c(), 0);
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f30332a;

        /* renamed from: b  reason: collision with root package name */
        public final g f30333b;

        /* renamed from: c  reason: collision with root package name */
        public final g.e f30334c;

        /* renamed from: d  reason: collision with root package name */
        public final HashMap f30335d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakReference<d> f30336e;
        public boolean f;

        public e(d dVar, int i6) {
            HashMap hashMap = new HashMap();
            this.f30335d = hashMap;
            this.f = false;
            this.f30332a = i6;
            this.f30333b = dVar.f30313q;
            this.f30334c = dVar.r;
            hashMap.putAll(dVar.f30316u);
            this.f30336e = new WeakReference<>(dVar);
            dVar.f30307k.postDelayed(new Runnable() { // from class: r1.m
                @Override // java.lang.Runnable
                public final void run() {
                    l.e.this.a();
                }
            }, 15000L);
        }

        public final void a() {
            l.b();
            if (this.f) {
                return;
            }
            this.f = true;
            d dVar = this.f30336e.get();
            if (dVar != null && dVar.f30320y == this.f30333b) {
                dVar.f30320y = null;
            }
            int i6 = this.f30332a;
            g.e eVar = this.f30334c;
            if (eVar != null) {
                eVar.h(i6);
                eVar.d();
            }
            HashMap hashMap = this.f30335d;
            if (!hashMap.isEmpty()) {
                for (g.e eVar2 : hashMap.values()) {
                    eVar2.h(i6);
                    eVar2.d();
                }
                hashMap.clear();
            }
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final r1.g f30337a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f30338b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final g.d f30339c;

        /* renamed from: d  reason: collision with root package name */
        public j f30340d;

        public f(r1.g gVar) {
            this.f30337a = gVar;
            this.f30339c = gVar.f30259v;
        }

        public final g a(String str) {
            ArrayList arrayList = this.f30338b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((g) arrayList.get(i6)).f30342b.equals(str)) {
                    return (g) arrayList.get(i6);
                }
            }
            return null;
        }

        public final String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + this.f30339c.f30275a.getPackageName() + " }";
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final f f30341a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30342b;

        /* renamed from: c  reason: collision with root package name */
        public final String f30343c;

        /* renamed from: d  reason: collision with root package name */
        public String f30344d;

        /* renamed from: e  reason: collision with root package name */
        public String f30345e;
        public Uri f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f30346g;

        /* renamed from: h  reason: collision with root package name */
        public int f30347h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f30348i;

        /* renamed from: k  reason: collision with root package name */
        public int f30350k;

        /* renamed from: l  reason: collision with root package name */
        public int f30351l;

        /* renamed from: m  reason: collision with root package name */
        public int f30352m;

        /* renamed from: n  reason: collision with root package name */
        public int f30353n;

        /* renamed from: o  reason: collision with root package name */
        public int f30354o;

        /* renamed from: p  reason: collision with root package name */
        public int f30355p;
        public Bundle r;

        /* renamed from: s  reason: collision with root package name */
        public IntentSender f30357s;

        /* renamed from: t  reason: collision with root package name */
        public r1.e f30358t;

        /* renamed from: v  reason: collision with root package name */
        public t.b f30360v;

        /* renamed from: j  reason: collision with root package name */
        public final ArrayList<IntentFilter> f30349j = new ArrayList<>();

        /* renamed from: q  reason: collision with root package name */
        public int f30356q = -1;

        /* renamed from: u  reason: collision with root package name */
        public ArrayList f30359u = new ArrayList();

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final g.b.a f30361a;

            public a(g.b.a aVar) {
                this.f30361a = aVar;
            }
        }

        public g(f fVar, String str, String str2) {
            this.f30341a = fVar;
            this.f30342b = str;
            this.f30343c = str2;
        }

        public final a a(g gVar) {
            t.b bVar = this.f30360v;
            if (bVar == null || !bVar.containsKey(gVar.f30343c)) {
                return null;
            }
            return new a((g.b.a) this.f30360v.getOrDefault(gVar.f30343c, null));
        }

        public final List<g> b() {
            return Collections.unmodifiableList(this.f30359u);
        }

        public final r1.g c() {
            f fVar = this.f30341a;
            fVar.getClass();
            l.b();
            return fVar.f30337a;
        }

        public final boolean d() {
            boolean z10;
            l.b();
            if (l.f30291d.f() == this) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f30352m == 3) {
                return true;
            }
            if (TextUtils.equals(c().f30259v.f30275a.getPackageName(), "android") && l("android.media.intent.category.LIVE_AUDIO") && !l("android.media.intent.category.LIVE_VIDEO")) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            if (b().size() >= 1) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            if (this.f30358t != null && this.f30346g) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            l.b();
            if (l.f30291d.g() == this) {
                return true;
            }
            return false;
        }

        public final boolean h(k kVar) {
            if (kVar != null) {
                l.b();
                ArrayList<IntentFilter> arrayList = this.f30349j;
                if (arrayList == null) {
                    return false;
                }
                kVar.a();
                int size = kVar.f30288b.size();
                if (size == 0) {
                    return false;
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    IntentFilter intentFilter = arrayList.get(i6);
                    if (intentFilter != null) {
                        for (int i10 = 0; i10 < size; i10++) {
                            if (intentFilter.hasCategory(kVar.f30288b.get(i10))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
            if (r5.hasNext() == false) goto L131;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x00fe A[EDGE_INSN: B:124:0x00fe->B:66:0x00fe ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int i(r1.e eVar) {
            int i6;
            boolean z10;
            List<String> b10;
            g gVar;
            boolean z11;
            int countActions;
            boolean z12 = false;
            if (this.f30358t == eVar) {
                return 0;
            }
            this.f30358t = eVar;
            if (eVar == null) {
                return 0;
            }
            String str = this.f30344d;
            Bundle bundle = eVar.f30244a;
            if (!s0.b.a(str, bundle.getString(SessionManager.KEY_NAME))) {
                this.f30344d = bundle.getString(SessionManager.KEY_NAME);
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (!s0.b.a(this.f30345e, bundle.getString("status"))) {
                this.f30345e = bundle.getString("status");
                i6 |= 1;
            }
            if (!s0.b.a(this.f, eVar.c())) {
                this.f = eVar.c();
                i6 |= 1;
            }
            if (this.f30346g != bundle.getBoolean("enabled", true)) {
                this.f30346g = bundle.getBoolean("enabled", true);
                i6 |= 1;
            }
            if (this.f30347h != bundle.getInt("connectionState", 0)) {
                this.f30347h = bundle.getInt("connectionState", 0);
                i6 |= 1;
            }
            ArrayList<IntentFilter> arrayList = this.f30349j;
            eVar.a();
            List<IntentFilter> list = eVar.f30246c;
            if (arrayList != list) {
                if (arrayList != null && list != null) {
                    ListIterator<IntentFilter> listIterator = arrayList.listIterator();
                    ListIterator<IntentFilter> listIterator2 = list.listIterator();
                    while (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter next = listIterator.next();
                        IntentFilter next2 = listIterator2.next();
                        if (next != next2) {
                            if (next != null && next2 != null && (countActions = next.countActions()) == next2.countActions()) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < countActions) {
                                        if (!next.getAction(i10).equals(next2.getAction(i10))) {
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        int countCategories = next.countCategories();
                                        if (countCategories == next2.countCategories()) {
                                            for (int i11 = 0; i11 < countCategories; i11++) {
                                                if (next.getCategory(i11).equals(next2.getCategory(i11))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            continue;
                            if (!z11) {
                                break;
                            }
                        }
                        z11 = true;
                        continue;
                        if (!z11) {
                        }
                    }
                    if (!listIterator.hasNext()) {
                    }
                }
                z10 = false;
                if (!z10) {
                    arrayList.clear();
                    eVar.a();
                    arrayList.addAll(eVar.f30246c);
                    i6 |= 1;
                }
                if (this.f30350k != bundle.getInt("playbackType", 1)) {
                    this.f30350k = bundle.getInt("playbackType", 1);
                    i6 |= 1;
                }
                if (this.f30351l != bundle.getInt("playbackStream", -1)) {
                    this.f30351l = bundle.getInt("playbackStream", -1);
                    i6 |= 1;
                }
                if (this.f30352m != bundle.getInt("deviceType")) {
                    this.f30352m = bundle.getInt("deviceType");
                    i6 |= 1;
                }
                if (this.f30353n != bundle.getInt("volumeHandling", 0)) {
                    this.f30353n = bundle.getInt("volumeHandling", 0);
                    i6 |= 3;
                }
                if (this.f30354o != bundle.getInt("volume")) {
                    this.f30354o = bundle.getInt("volume");
                    i6 |= 3;
                }
                if (this.f30355p != bundle.getInt("volumeMax")) {
                    this.f30355p = bundle.getInt("volumeMax");
                    i6 |= 3;
                }
                if (this.f30356q != bundle.getInt("presentationDisplayId", -1)) {
                    this.f30356q = bundle.getInt("presentationDisplayId", -1);
                    i6 |= 5;
                }
                if (!s0.b.a(this.r, bundle.getBundle("extras"))) {
                    this.r = bundle.getBundle("extras");
                    i6 |= 1;
                }
                if (!s0.b.a(this.f30357s, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.f30357s = (IntentSender) bundle.getParcelable("settingsIntent");
                    i6 |= 1;
                }
                if (this.f30348i != bundle.getBoolean("canDisconnect", false)) {
                    this.f30348i = bundle.getBoolean("canDisconnect", false);
                    i6 |= 5;
                }
                b10 = eVar.b();
                ArrayList arrayList2 = new ArrayList();
                if (b10.size() != this.f30359u.size()) {
                    z12 = true;
                }
                for (String str2 : b10) {
                    d dVar = l.f30291d;
                    dVar.getClass();
                    String str3 = (String) dVar.f.get(new s0.c(this.f30341a.f30339c.f30275a.flattenToShortString(), str2));
                    Iterator<g> it = l.f30291d.f30302e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            gVar = it.next();
                            if (gVar.f30343c.equals(str3)) {
                                break;
                            }
                        } else {
                            gVar = null;
                            break;
                        }
                    }
                    if (gVar != null) {
                        arrayList2.add(gVar);
                        if (!z12 && !this.f30359u.contains(gVar)) {
                            z12 = true;
                        }
                    }
                }
                if (!z12) {
                    this.f30359u = arrayList2;
                    return i6 | 1;
                }
                return i6;
            }
            z10 = true;
            if (!z10) {
            }
            if (this.f30350k != bundle.getInt("playbackType", 1)) {
            }
            if (this.f30351l != bundle.getInt("playbackStream", -1)) {
            }
            if (this.f30352m != bundle.getInt("deviceType")) {
            }
            if (this.f30353n != bundle.getInt("volumeHandling", 0)) {
            }
            if (this.f30354o != bundle.getInt("volume")) {
            }
            if (this.f30355p != bundle.getInt("volumeMax")) {
            }
            if (this.f30356q != bundle.getInt("presentationDisplayId", -1)) {
            }
            if (!s0.b.a(this.r, bundle.getBundle("extras"))) {
            }
            if (!s0.b.a(this.f30357s, (IntentSender) bundle.getParcelable("settingsIntent"))) {
            }
            if (this.f30348i != bundle.getBoolean("canDisconnect", false)) {
            }
            b10 = eVar.b();
            ArrayList arrayList22 = new ArrayList();
            if (b10.size() != this.f30359u.size()) {
            }
            while (r14.hasNext()) {
            }
            if (!z12) {
            }
        }

        public final void j(int i6) {
            g.e eVar;
            g.e eVar2;
            l.b();
            d dVar = l.f30291d;
            int min = Math.min(this.f30355p, Math.max(0, i6));
            if (this == dVar.f30313q && (eVar2 = dVar.r) != null) {
                eVar2.f(min);
                return;
            }
            HashMap hashMap = dVar.f30316u;
            if (!hashMap.isEmpty() && (eVar = (g.e) hashMap.get(this.f30343c)) != null) {
                eVar.f(min);
            }
        }

        public final void k(int i6) {
            g.e eVar;
            g.e eVar2;
            l.b();
            if (i6 != 0) {
                d dVar = l.f30291d;
                if (this == dVar.f30313q && (eVar2 = dVar.r) != null) {
                    eVar2.i(i6);
                    return;
                }
                HashMap hashMap = dVar.f30316u;
                if (!hashMap.isEmpty() && (eVar = (g.e) hashMap.get(this.f30343c)) != null) {
                    eVar.i(i6);
                }
            }
        }

        public final boolean l(String str) {
            l.b();
            ArrayList<IntentFilter> arrayList = this.f30349j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public final void m(Collection<g.b.a> collection) {
            this.f30359u.clear();
            if (this.f30360v == null) {
                this.f30360v = new t.b();
            }
            this.f30360v.clear();
            for (g.b.a aVar : collection) {
                g a10 = this.f30341a.a(aVar.f30269a.d());
                if (a10 != null) {
                    this.f30360v.put(a10.f30343c, aVar);
                    int i6 = aVar.f30270b;
                    if (i6 == 2 || i6 == 3) {
                        this.f30359u.add(a10);
                    }
                }
            }
            l.f30291d.f30307k.b(259, this);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaRouter.RouteInfo{ uniqueId=" + this.f30343c + ", name=" + this.f30344d + ", description=" + this.f30345e + ", iconUri=" + this.f + ", enabled=" + this.f30346g + ", connectionState=" + this.f30347h + ", canDisconnect=" + this.f30348i + ", playbackType=" + this.f30350k + ", playbackStream=" + this.f30351l + ", deviceType=" + this.f30352m + ", volumeHandling=" + this.f30353n + ", volume=" + this.f30354o + ", volumeMax=" + this.f30355p + ", presentationDisplayId=" + this.f30356q + ", extras=" + this.r + ", settingsIntent=" + this.f30357s + ", providerPackageName=" + this.f30341a.f30339c.f30275a.getPackageName());
            if (e()) {
                sb2.append(", members=[");
                int size = this.f30359u.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    if (this.f30359u.get(i6) != this) {
                        sb2.append(((g) this.f30359u.get(i6)).f30343c);
                    }
                }
                sb2.append(']');
            }
            sb2.append(" }");
            return sb2.toString();
        }
    }

    public l(Context context) {
        this.f30292a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static l c(Context context) {
        if (context != null) {
            b();
            if (f30291d == null) {
                d dVar = new d(context.getApplicationContext());
                f30291d = dVar;
                dVar.a(dVar.f30308l);
                r1.d dVar2 = dVar.f30300c;
                if (dVar2 != null) {
                    dVar.a(dVar2);
                }
                c0 c0Var = new c0(dVar.f30298a, dVar);
                if (!c0Var.f) {
                    c0Var.f = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    Handler handler = c0Var.f30217c;
                    c0Var.f30215a.registerReceiver(c0Var.f30220g, intentFilter, null, handler);
                    handler.post(c0Var.f30221h);
                }
            }
            ArrayList<WeakReference<l>> arrayList = f30291d.f30301d;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    l lVar = arrayList.get(size).get();
                    if (lVar == null) {
                        arrayList.remove(size);
                    } else if (lVar.f30292a == context) {
                        return lVar;
                    }
                } else {
                    l lVar2 = new l(context);
                    arrayList.add(new WeakReference<>(lVar2));
                    return lVar2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat.Token d() {
        d dVar = f30291d;
        d.C0516d c0516d = dVar.f30321z;
        if (c0516d != null) {
            MediaSessionCompat mediaSessionCompat = c0516d.f30327a;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.f879a.f898b;
            }
        } else {
            MediaSessionCompat mediaSessionCompat2 = dVar.A;
            if (mediaSessionCompat2 != null) {
                return mediaSessionCompat2.f879a.f898b;
            }
        }
        return null;
    }

    public static g e() {
        b();
        return f30291d.g();
    }

    public static boolean f(k kVar, int i6) {
        if (kVar != null) {
            b();
            d dVar = f30291d;
            dVar.getClass();
            if (kVar.c()) {
                return false;
            }
            if ((i6 & 2) != 0 || !dVar.f30309m) {
                ArrayList<g> arrayList = dVar.f30302e;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = arrayList.get(i10);
                    if (((i6 & 1) != 0 && gVar.d()) || !gVar.h(kVar)) {
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public static void h(g gVar) {
        if (gVar != null) {
            b();
            if (f30290c) {
                Log.d("MediaRouter", "selectRoute: " + gVar);
            }
            f30291d.j(gVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public static void i(int i6) {
        if (i6 >= 0 && i6 <= 3) {
            b();
            g c10 = f30291d.c();
            if (f30291d.g() != c10) {
                f30291d.j(c10, i6);
                return;
            }
            d dVar = f30291d;
            dVar.j(dVar.f(), i6);
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(k kVar, a aVar, int i6) {
        b bVar;
        if (kVar != null) {
            if (aVar != null) {
                b();
                if (f30290c) {
                    Log.d("MediaRouter", "addCallback: selector=" + kVar + ", callback=" + aVar + ", flags=" + Integer.toHexString(i6));
                }
                ArrayList<b> arrayList = this.f30293b;
                int size = arrayList.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        if (arrayList.get(i10).f30295b == aVar) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    bVar = new b(this, aVar);
                    arrayList.add(bVar);
                } else {
                    bVar = arrayList.get(i10);
                }
                boolean z11 = true;
                if (i6 != bVar.f30297d) {
                    bVar.f30297d = i6;
                    z10 = true;
                }
                k kVar2 = bVar.f30296c;
                kVar2.a();
                kVar.a();
                if (!kVar2.f30288b.containsAll(kVar.f30288b)) {
                    k.a aVar2 = new k.a(bVar.f30296c);
                    kVar.a();
                    aVar2.a(kVar.f30288b);
                    bVar.f30296c = aVar2.b();
                } else {
                    z11 = z10;
                }
                if (z11) {
                    f30291d.l();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void g(a aVar) {
        if (aVar != null) {
            b();
            if (f30290c) {
                Log.d("MediaRouter", "removeCallback: callback=" + aVar);
            }
            ArrayList<b> arrayList = this.f30293b;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    if (arrayList.get(i6).f30295b == aVar) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                arrayList.remove(i6);
                f30291d.l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void i(l lVar, g gVar, int i6) {
            h();
        }

        @Deprecated
        public void h() {
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
        }

        @Deprecated
        public void g(g gVar) {
        }

        public void j(g gVar) {
        }

        public void d(l lVar, g gVar) {
        }

        public void e(l lVar, g gVar) {
        }

        public void f(l lVar, g gVar) {
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public void b(Bundle bundle) {
        }

        public void a(String str, Bundle bundle) {
        }
    }
}

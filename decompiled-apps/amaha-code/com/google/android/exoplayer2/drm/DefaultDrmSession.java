package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import b9.r;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class DefaultDrmSession implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    public final List<b.C0134b> f6364a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6365b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6366c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6367d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6368e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6369g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, String> f6370h;

    /* renamed from: i  reason: collision with root package name */
    public final c9.f<c.a> f6371i;

    /* renamed from: j  reason: collision with root package name */
    public final r f6372j;

    /* renamed from: k  reason: collision with root package name */
    public final j f6373k;

    /* renamed from: l  reason: collision with root package name */
    public final UUID f6374l;

    /* renamed from: m  reason: collision with root package name */
    public final e f6375m;

    /* renamed from: n  reason: collision with root package name */
    public int f6376n;

    /* renamed from: o  reason: collision with root package name */
    public int f6377o;

    /* renamed from: p  reason: collision with root package name */
    public HandlerThread f6378p;

    /* renamed from: q  reason: collision with root package name */
    public c f6379q;
    public r7.b r;

    /* renamed from: s  reason: collision with root package name */
    public DrmSession.DrmSessionException f6380s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f6381t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f6382u;

    /* renamed from: v  reason: collision with root package name */
    public g.a f6383v;

    /* renamed from: w  reason: collision with root package name */
    public g.d f6384w;

    /* loaded from: classes.dex */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6385a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            Throwable unexpectedDrmSessionException;
            long j10;
            boolean z10;
            d dVar = (d) message.obj;
            if (!dVar.f6388b) {
                return false;
            }
            int i6 = dVar.f6390d + 1;
            dVar.f6390d = i6;
            if (i6 > ((com.google.android.exoplayer2.upstream.a) DefaultDrmSession.this.f6372j).a(3)) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                unexpectedDrmSessionException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                unexpectedDrmSessionException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            r rVar = DefaultDrmSession.this.f6372j;
            int i10 = dVar.f6390d;
            ((com.google.android.exoplayer2.upstream.a) rVar).getClass();
            if (!(unexpectedDrmSessionException instanceof ParserException) && !(unexpectedDrmSessionException instanceof FileNotFoundException) && !(unexpectedDrmSessionException instanceof HttpDataSource$CleartextNotPermittedException) && !(unexpectedDrmSessionException instanceof Loader.UnexpectedLoaderException)) {
                int i11 = DataSourceException.f7152v;
                while (true) {
                    if (unexpectedDrmSessionException != null) {
                        if ((unexpectedDrmSessionException instanceof DataSourceException) && ((DataSourceException) unexpectedDrmSessionException).f7153u == 2008) {
                            z10 = true;
                            break;
                        }
                        unexpectedDrmSessionException = unexpectedDrmSessionException.getCause();
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    j10 = Math.min((i10 - 1) * 1000, 5000);
                    if (j10 != -9223372036854775807L) {
                        return false;
                    }
                    synchronized (this) {
                        if (this.f6385a) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), j10);
                        return true;
                    }
                }
            }
            j10 = -9223372036854775807L;
            if (j10 != -9223372036854775807L) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i6 = message.what;
                if (i6 != 0) {
                    if (i6 == 1) {
                        DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                        bArr = ((i) defaultDrmSession.f6373k).a(defaultDrmSession.f6374l, (g.a) dVar.f6389c);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    bArr = ((i) DefaultDrmSession.this.f6373k).c((g.d) dVar.f6389c);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean a10 = a(message, e10);
                bArr = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                ca.a.B1("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                bArr = e11;
            }
            r rVar = DefaultDrmSession.this.f6372j;
            long j10 = dVar.f6387a;
            rVar.getClass();
            synchronized (this) {
                if (!this.f6385a) {
                    DefaultDrmSession.this.f6375m.obtainMessage(message.what, Pair.create(dVar.f6389c, bArr)).sendToTarget();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f6387a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6388b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f6389c;

        /* renamed from: d  reason: collision with root package name */
        public int f6390d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f6387a = j10;
            this.f6388b = z10;
            this.f6389c = obj;
        }
    }

    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<c.a> set;
            Set<c.a> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 == 1) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    if (obj == defaultDrmSession.f6383v && defaultDrmSession.h()) {
                        defaultDrmSession.f6383v = null;
                        if (obj2 instanceof Exception) {
                            defaultDrmSession.j((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (defaultDrmSession.f6368e == 3) {
                                g gVar = defaultDrmSession.f6365b;
                                byte[] bArr2 = defaultDrmSession.f6382u;
                                int i10 = w.f5205a;
                                gVar.h(bArr2, bArr);
                                c9.f<c.a> fVar = defaultDrmSession.f6371i;
                                synchronized (fVar.f5134u) {
                                    set2 = fVar.f5136w;
                                }
                                for (c.a aVar : set2) {
                                    aVar.b();
                                }
                                return;
                            }
                            byte[] h10 = defaultDrmSession.f6365b.h(defaultDrmSession.f6381t, bArr);
                            int i11 = defaultDrmSession.f6368e;
                            if ((i11 == 2 || (i11 == 0 && defaultDrmSession.f6382u != null)) && h10 != null && h10.length != 0) {
                                defaultDrmSession.f6382u = h10;
                            }
                            defaultDrmSession.f6376n = 4;
                            c9.f<c.a> fVar2 = defaultDrmSession.f6371i;
                            synchronized (fVar2.f5134u) {
                                set = fVar2.f5136w;
                            }
                            for (c.a aVar2 : set) {
                                aVar2.a();
                            }
                            return;
                        } catch (Exception e10) {
                            defaultDrmSession.j(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.f6384w) {
                if (defaultDrmSession2.f6376n == 2 || defaultDrmSession2.h()) {
                    defaultDrmSession2.f6384w = null;
                    boolean z10 = obj2 instanceof Exception;
                    a aVar3 = defaultDrmSession2.f6366c;
                    if (z10) {
                        ((DefaultDrmSessionManager.d) aVar3).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        defaultDrmSession2.f6365b.i((byte[]) obj2);
                        DefaultDrmSessionManager.d dVar = (DefaultDrmSessionManager.d) aVar3;
                        dVar.f6420b = null;
                        HashSet hashSet = dVar.f6419a;
                        s z11 = s.z(hashSet);
                        hashSet.clear();
                        s.b listIterator = z11.listIterator(0);
                        while (listIterator.hasNext()) {
                            DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) listIterator.next();
                            if (defaultDrmSession3.k()) {
                                defaultDrmSession3.g(true);
                            }
                        }
                    } catch (Exception e11) {
                        ((DefaultDrmSessionManager.d) aVar3).a(e11, true);
                    }
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, g gVar, DefaultDrmSessionManager.d dVar, DefaultDrmSessionManager.e eVar, List list, int i6, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, j jVar, Looper looper, r rVar) {
        if (i6 == 1 || i6 == 3) {
            bArr.getClass();
        }
        this.f6374l = uuid;
        this.f6366c = dVar;
        this.f6367d = eVar;
        this.f6365b = gVar;
        this.f6368e = i6;
        this.f = z10;
        this.f6369g = z11;
        if (bArr != null) {
            this.f6382u = bArr;
            this.f6364a = null;
        } else {
            list.getClass();
            this.f6364a = Collections.unmodifiableList(list);
        }
        this.f6370h = hashMap;
        this.f6373k = jVar;
        this.f6371i = new c9.f<>();
        this.f6372j = rVar;
        this.f6376n = 2;
        this.f6375m = new e(looper);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void a(c.a aVar) {
        int i6;
        int i10 = this.f6377o;
        boolean z10 = false;
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i10);
            Log.e("DefaultDrmSession", sb2.toString());
            this.f6377o = 0;
        }
        if (aVar != null) {
            c9.f<c.a> fVar = this.f6371i;
            synchronized (fVar.f5134u) {
                ArrayList arrayList = new ArrayList(fVar.f5137x);
                arrayList.add(aVar);
                fVar.f5137x = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) fVar.f5135v.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(fVar.f5136w);
                    hashSet.add(aVar);
                    fVar.f5136w = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = fVar.f5135v;
                if (num != null) {
                    i6 = num.intValue() + 1;
                } else {
                    i6 = 1;
                }
                hashMap.put(aVar, Integer.valueOf(i6));
            }
        }
        int i11 = this.f6377o + 1;
        this.f6377o = i11;
        if (i11 == 1) {
            if (this.f6376n == 2) {
                z10 = true;
            }
            sc.b.C(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f6378p = handlerThread;
            handlerThread.start();
            this.f6379q = new c(this.f6378p.getLooper());
            if (k()) {
                g(true);
            }
        } else if (aVar != null && h() && this.f6371i.e(aVar) == 1) {
            aVar.d(this.f6376n);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f6401l != -9223372036854775807L) {
            defaultDrmSessionManager.f6404o.remove(this);
            Handler handler = defaultDrmSessionManager.f6409u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void b(c.a aVar) {
        int i6 = this.f6377o;
        if (i6 <= 0) {
            Log.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i6 - 1;
        this.f6377o = i10;
        if (i10 == 0) {
            this.f6376n = 0;
            e eVar = this.f6375m;
            int i11 = w.f5205a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f6379q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f6385a = true;
            }
            this.f6379q = null;
            this.f6378p.quit();
            this.f6378p = null;
            this.r = null;
            this.f6380s = null;
            this.f6383v = null;
            this.f6384w = null;
            byte[] bArr = this.f6381t;
            if (bArr != null) {
                this.f6365b.g(bArr);
                this.f6381t = null;
            }
        }
        if (aVar != null) {
            this.f6371i.g(aVar);
            if (this.f6371i.e(aVar) == 0) {
                aVar.f();
            }
        }
        b bVar = this.f6367d;
        int i12 = this.f6377o;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i12 == 1 && defaultDrmSessionManager.f6405p > 0 && defaultDrmSessionManager.f6401l != -9223372036854775807L) {
            defaultDrmSessionManager.f6404o.add(this);
            Handler handler = defaultDrmSessionManager.f6409u;
            handler.getClass();
            handler.postAtTime(new androidx.activity.b(21, this), this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f6401l);
        } else if (i12 == 0) {
            defaultDrmSessionManager.f6402m.remove(this);
            if (defaultDrmSessionManager.r == this) {
                defaultDrmSessionManager.r = null;
            }
            if (defaultDrmSessionManager.f6407s == this) {
                defaultDrmSessionManager.f6407s = null;
            }
            DefaultDrmSessionManager.d dVar = defaultDrmSessionManager.f6398i;
            HashSet hashSet = dVar.f6419a;
            hashSet.remove(this);
            if (dVar.f6420b == this) {
                dVar.f6420b = null;
                if (!hashSet.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet.iterator().next();
                    dVar.f6420b = defaultDrmSession;
                    g.d c10 = defaultDrmSession.f6365b.c();
                    defaultDrmSession.f6384w = c10;
                    c cVar2 = defaultDrmSession.f6379q;
                    int i13 = w.f5205a;
                    c10.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new d(o8.d.f27264b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c10)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f6401l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.f6409u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f6404o.remove(this);
            }
        }
        defaultDrmSessionManager.k();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return this.f6374l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean e(String str) {
        byte[] bArr = this.f6381t;
        sc.b.E(bArr);
        return this.f6365b.m(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final r7.b f() {
        return this.r;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:64|65|66|(6:68|69|70|71|(1:73)|75)|78|69|70|71|(0)|75) */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[Catch: NumberFormatException -> 0x009c, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x009c, blocks: (B:44:0x0090, B:46:0x0098), top: B:77:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z10) {
        long j10;
        Pair pair;
        String str;
        String str2;
        long min;
        Set<c.a> set;
        if (this.f6369g) {
            return;
        }
        byte[] bArr = this.f6381t;
        int i6 = w.f5205a;
        int i10 = this.f6368e;
        boolean z11 = false;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f6382u.getClass();
                    this.f6381t.getClass();
                    l(this.f6382u, 3, z10);
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f6382u;
            if (bArr2 != null) {
                try {
                    this.f6365b.f(bArr, bArr2);
                    z11 = true;
                } catch (Exception e10) {
                    i(1, e10);
                }
                if (!z11) {
                    return;
                }
            }
            l(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f6382u;
        if (bArr3 == null) {
            l(bArr, 1, z10);
            return;
        }
        if (this.f6376n != 4) {
            try {
                this.f6365b.f(bArr, bArr3);
                z11 = true;
            } catch (Exception e11) {
                i(1, e11);
            }
            if (!z11) {
                return;
            }
        }
        if (!o7.b.f27183d.equals(this.f6374l)) {
            min = Long.MAX_VALUE;
        } else {
            Map<String, String> m10 = m();
            if (m10 == null) {
                pair = null;
            } else {
                long j11 = -9223372036854775807L;
                try {
                    str2 = m10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = m10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = m10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j11));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        if (this.f6368e == 0 && min <= 60) {
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb2.append(min);
            Log.d("DefaultDrmSession", sb2.toString());
            l(bArr, 2, z10);
        } else if (min <= 0) {
            i(2, new KeysExpiredException());
        } else {
            this.f6376n = 4;
            c9.f<c.a> fVar = this.f6371i;
            synchronized (fVar.f5134u) {
                set = fVar.f5136w;
            }
            for (c.a aVar : set) {
                aVar.c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.f6376n == 1) {
            return this.f6380s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f6376n;
    }

    public final boolean h() {
        int i6 = this.f6376n;
        if (i6 != 3 && i6 != 4) {
            return false;
        }
        return true;
    }

    public final void i(int i6, Exception exc) {
        int i10;
        Set<c.a> set;
        int i11 = w.f5205a;
        if (i11 >= 21 && s7.e.a(exc)) {
            i10 = s7.e.b(exc);
        } else {
            if (i11 < 23 || !s7.f.a(exc)) {
                if (i11 < 18 || !s7.d.b(exc)) {
                    if (i11 >= 18 && s7.d.a(exc)) {
                        i10 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i10 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                        i10 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
                        i10 = 6008;
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            i10 = 6004;
                        } else if (i6 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f6380s = new DrmSession.DrmSessionException(exc, i10);
        ca.a.Q("DefaultDrmSession", "DRM session error", exc);
        f0.b bVar = new f0.b(17, exc);
        c9.f<c.a> fVar = this.f6371i;
        synchronized (fVar.f5134u) {
            set = fVar.f5136w;
        }
        for (c.a aVar : set) {
            bVar.accept(aVar);
        }
        if (this.f6376n != 4) {
            this.f6376n = 1;
        }
    }

    public final void j(Exception exc, boolean z10) {
        int i6;
        if (exc instanceof NotProvisionedException) {
            DefaultDrmSessionManager.d dVar = (DefaultDrmSessionManager.d) this.f6366c;
            dVar.f6419a.add(this);
            if (dVar.f6420b == null) {
                dVar.f6420b = this;
                g.d c10 = this.f6365b.c();
                this.f6384w = c10;
                c cVar = this.f6379q;
                int i10 = w.f5205a;
                c10.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(o8.d.f27264b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c10)).sendToTarget();
                return;
            }
            return;
        }
        if (z10) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        i(i6, exc);
    }

    public final boolean k() {
        Set<c.a> set;
        if (h()) {
            return true;
        }
        try {
            byte[] e10 = this.f6365b.e();
            this.f6381t = e10;
            this.r = this.f6365b.d(e10);
            this.f6376n = 3;
            c9.f<c.a> fVar = this.f6371i;
            synchronized (fVar.f5134u) {
                set = fVar.f5136w;
            }
            for (c.a aVar : set) {
                aVar.d(3);
            }
            this.f6381t.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.d dVar = (DefaultDrmSessionManager.d) this.f6366c;
            dVar.f6419a.add(this);
            if (dVar.f6420b == null) {
                dVar.f6420b = this;
                g.d c10 = this.f6365b.c();
                this.f6384w = c10;
                c cVar = this.f6379q;
                int i6 = w.f5205a;
                c10.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(o8.d.f27264b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c10)).sendToTarget();
            }
            return false;
        } catch (Exception e11) {
            i(1, e11);
            return false;
        }
    }

    public final void l(byte[] bArr, int i6, boolean z10) {
        try {
            g.a k10 = this.f6365b.k(bArr, this.f6364a, i6, this.f6370h);
            this.f6383v = k10;
            c cVar = this.f6379q;
            int i10 = w.f5205a;
            k10.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(o8.d.f27264b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k10)).sendToTarget();
        } catch (Exception e10) {
            j(e10, true);
        }
    }

    public final Map<String, String> m() {
        byte[] bArr = this.f6381t;
        if (bArr == null) {
            return null;
        }
        return this.f6365b.b(bArr);
    }
}

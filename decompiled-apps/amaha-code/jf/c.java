package jf;

import android.content.Context;
import bf.h;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.protobuf.y;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kf.g;
import kf.i;
import kf.j;
import lf.k;
import lf.l;
/* compiled from: RateLimiter.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final bf.a f21987a;

    /* renamed from: b  reason: collision with root package name */
    public final float f21988b;

    /* renamed from: c  reason: collision with root package name */
    public final float f21989c;

    /* renamed from: d  reason: collision with root package name */
    public final a f21990d;

    /* renamed from: e  reason: collision with root package name */
    public final a f21991e;

    /* compiled from: RateLimiter.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static final df.a f21992k = df.a.d();

        /* renamed from: l  reason: collision with root package name */
        public static final long f21993l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        public final df.b f21994a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21995b;

        /* renamed from: d  reason: collision with root package name */
        public g f21997d;

        /* renamed from: g  reason: collision with root package name */
        public g f21999g;

        /* renamed from: h  reason: collision with root package name */
        public g f22000h;

        /* renamed from: i  reason: collision with root package name */
        public long f22001i;

        /* renamed from: j  reason: collision with root package name */
        public long f22002j;

        /* renamed from: e  reason: collision with root package name */
        public long f21998e = 500;
        public double f = 500;

        /* renamed from: c  reason: collision with root package name */
        public i f21996c = new i();

        public a(g gVar, df.b bVar, bf.a aVar, String str) {
            long l2;
            h hVar;
            long longValue;
            long l10;
            this.f21994a = bVar;
            this.f21997d = gVar;
            if (str == "Trace") {
                l2 = aVar.l();
            } else {
                l2 = aVar.l();
            }
            long j10 = l2;
            if (str == "Trace") {
                longValue = aVar.q();
            } else {
                synchronized (h.class) {
                    if (h.f4262v == null) {
                        h.f4262v = new h();
                    }
                    hVar = h.f4262v;
                }
                kf.e<Long> m10 = aVar.m(hVar);
                if (m10.b() && bf.a.r(m10.a().longValue())) {
                    aVar.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    longValue = m10.a().longValue();
                } else {
                    kf.e<Long> c10 = aVar.c(hVar);
                    if (c10.b() && bf.a.r(c10.a().longValue())) {
                        longValue = c10.a().longValue();
                    } else {
                        Long l11 = 700L;
                        longValue = l11.longValue();
                    }
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f21999g = new g(longValue, j10, timeUnit);
            this.f22001i = longValue;
            if (str == "Trace") {
                l10 = aVar.l();
            } else {
                l10 = aVar.l();
            }
            long c11 = c(aVar, str);
            this.f22000h = new g(c11, l10, timeUnit);
            this.f22002j = c11;
            this.f21995b = false;
        }

        public static long c(bf.a aVar, String str) {
            bf.g gVar;
            if (str == "Trace") {
                return aVar.p();
            }
            aVar.getClass();
            synchronized (bf.g.class) {
                if (bf.g.f4261v == null) {
                    bf.g.f4261v = new bf.g();
                }
                gVar = bf.g.f4261v;
            }
            kf.e<Long> m10 = aVar.m(gVar);
            if (m10.b() && bf.a.r(m10.a().longValue())) {
                aVar.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                return m10.a().longValue();
            }
            kf.e<Long> c10 = aVar.c(gVar);
            if (c10.b() && bf.a.r(c10.a().longValue())) {
                return c10.a().longValue();
            }
            Long l2 = 70L;
            return l2.longValue();
        }

        public final synchronized void a(boolean z10) {
            g gVar;
            long j10;
            if (z10) {
                gVar = this.f21999g;
            } else {
                gVar = this.f22000h;
            }
            this.f21997d = gVar;
            if (z10) {
                j10 = this.f22001i;
            } else {
                j10 = this.f22002j;
            }
            this.f21998e = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: all -> 0x0091, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0068, B:17:0x0076, B:19:0x007e, B:22:0x0083, B:24:0x0087, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0068, B:17:0x0076, B:19:0x007e, B:22:0x0083, B:24:0x0087, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0068, B:17:0x0076, B:19:0x007e, B:22:0x0083, B:24:0x0087, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized boolean b() {
            TimeUnit timeUnit;
            double d10;
            long nanos;
            double d11;
            double d12;
            double d13;
            this.f21994a.getClass();
            i iVar = new i();
            i iVar2 = this.f21996c;
            iVar2.getClass();
            double d14 = iVar.f23323v - iVar2.f23323v;
            g gVar = this.f21997d;
            gVar.getClass();
            int i6 = g.a.f23320a[gVar.f23319c.ordinal()];
            long j10 = gVar.f23318b;
            long j11 = gVar.f23317a;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        d11 = j11 / timeUnit.toSeconds(j10);
                        d12 = (d14 * d11) / f21993l;
                        if (d12 > 0.0d) {
                            this.f = Math.min(this.f + d12, this.f21998e);
                            this.f21996c = iVar;
                        }
                        d13 = this.f;
                        if (d13 < 1.0d) {
                            this.f = d13 - 1.0d;
                            return true;
                        }
                        if (this.f21995b) {
                            f21992k.f("Exceeded log rate limit, dropping the log.");
                        }
                        return false;
                    }
                    d10 = j11 / j10;
                    nanos = TimeUnit.SECONDS.toMillis(1L);
                } else {
                    d10 = j11 / j10;
                    nanos = TimeUnit.SECONDS.toMicros(1L);
                }
            } else {
                d10 = j11 / j10;
                nanos = TimeUnit.SECONDS.toNanos(1L);
            }
            d11 = d10 * nanos;
            d12 = (d14 * d11) / f21993l;
            if (d12 > 0.0d) {
            }
            d13 = this.f;
            if (d13 < 1.0d) {
            }
        }
    }

    public c(Context context, g gVar) {
        boolean z10;
        df.b bVar = new df.b(17);
        float nextFloat = new Random().nextFloat();
        float nextFloat2 = new Random().nextFloat();
        bf.a e10 = bf.a.e();
        this.f21990d = null;
        this.f21991e = null;
        boolean z11 = true;
        if (0.0f <= nextFloat && nextFloat < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((0.0f > nextFloat2 || nextFloat2 >= 1.0f) ? false : false) {
                this.f21988b = nextFloat;
                this.f21989c = nextFloat2;
                this.f21987a = e10;
                this.f21990d = new a(gVar, bVar, e10, "Trace");
                this.f21991e = new a(gVar, bVar, e10, "Network");
                j.a(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0f, 1.0f).");
    }

    public static boolean a(y.d dVar) {
        if (dVar.size() <= 0 || ((k) dVar.get(0)).P() <= 0 || ((k) dVar.get(0)).O() != l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (bf.a.v(r1) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        bf.e eVar;
        float floatValue;
        bf.a aVar = this.f21987a;
        aVar.getClass();
        synchronized (bf.e.class) {
            if (bf.e.f4258v == null) {
                bf.e.f4258v = new bf.e();
            }
            eVar = bf.e.f4258v;
        }
        kf.e<Float> j10 = aVar.j(eVar);
        if (j10.b()) {
            floatValue = j10.a().floatValue() / 100.0f;
        }
        kf.e<Float> eVar2 = aVar.f4252a.getFloat("fpr_vc_fragment_sampling_rate");
        if (eVar2.b() && bf.a.v(eVar2.a().floatValue())) {
            aVar.f4254c.c(eVar2.a().floatValue(), "com.google.firebase.perf.FragmentSamplingRate");
            floatValue = eVar2.a().floatValue();
        } else {
            kf.e<Float> b10 = aVar.b(eVar);
            if (b10.b() && bf.a.v(b10.a().floatValue())) {
                floatValue = b10.a().floatValue();
            } else {
                floatValue = Float.valueOf(0.0f).floatValue();
            }
        }
        if (this.f21989c < floatValue) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        bf.i iVar;
        float floatValue;
        bf.a aVar = this.f21987a;
        aVar.getClass();
        synchronized (bf.i.class) {
            if (bf.i.f4263v == null) {
                bf.i.f4263v = new bf.i();
            }
            iVar = bf.i.f4263v;
        }
        RemoteConfigManager remoteConfigManager = aVar.f4252a;
        iVar.getClass();
        kf.e<Float> eVar = remoteConfigManager.getFloat("fpr_vc_network_request_sampling_rate");
        if (eVar.b() && bf.a.v(eVar.a().floatValue())) {
            aVar.f4254c.c(eVar.a().floatValue(), "com.google.firebase.perf.NetworkRequestSamplingRate");
            floatValue = eVar.a().floatValue();
        } else {
            kf.e<Float> b10 = aVar.b(iVar);
            if (b10.b() && bf.a.v(b10.a().floatValue())) {
                floatValue = b10.a().floatValue();
            } else {
                floatValue = Float.valueOf(1.0f).floatValue();
            }
        }
        if (this.f21988b < floatValue) {
            return true;
        }
        return false;
    }
}

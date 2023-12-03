package lv;

import java.io.Closeable;
import lv.d;
import lv.s;
/* compiled from: Response.kt */
/* loaded from: classes2.dex */
public final class d0 implements Closeable {
    public final e0 A;
    public final d0 B;
    public final d0 C;
    public final d0 D;
    public final long E;
    public final long F;
    public final pv.b G;
    public d H;

    /* renamed from: u  reason: collision with root package name */
    public final z f24583u;

    /* renamed from: v  reason: collision with root package name */
    public final y f24584v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24585w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24586x;

    /* renamed from: y  reason: collision with root package name */
    public final r f24587y;

    /* renamed from: z  reason: collision with root package name */
    public final s f24588z;

    public d0(z zVar, y yVar, String str, int i6, r rVar, s sVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, pv.b bVar) {
        this.f24583u = zVar;
        this.f24584v = yVar;
        this.f24585w = str;
        this.f24586x = i6;
        this.f24587y = rVar;
        this.f24588z = sVar;
        this.A = e0Var;
        this.B = d0Var;
        this.C = d0Var2;
        this.D = d0Var3;
        this.E = j10;
        this.F = j11;
        this.G = bVar;
    }

    public static String e(d0 d0Var, String str) {
        d0Var.getClass();
        String g5 = d0Var.f24588z.g(str);
        if (g5 == null) {
            return null;
        }
        return g5;
    }

    public final d a() {
        d dVar = this.H;
        if (dVar == null) {
            int i6 = d.f24570n;
            d b10 = d.b.b(this.f24588z);
            this.H = b10;
            return b10;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        return "Response{protocol=" + this.f24584v + ", code=" + this.f24586x + ", message=" + this.f24585w + ", url=" + this.f24583u.f24751a + '}';
    }

    /* compiled from: Response.kt */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public z f24589a;

        /* renamed from: b  reason: collision with root package name */
        public y f24590b;

        /* renamed from: c  reason: collision with root package name */
        public int f24591c;

        /* renamed from: d  reason: collision with root package name */
        public String f24592d;

        /* renamed from: e  reason: collision with root package name */
        public r f24593e;
        public s.a f;

        /* renamed from: g  reason: collision with root package name */
        public e0 f24594g;

        /* renamed from: h  reason: collision with root package name */
        public d0 f24595h;

        /* renamed from: i  reason: collision with root package name */
        public d0 f24596i;

        /* renamed from: j  reason: collision with root package name */
        public d0 f24597j;

        /* renamed from: k  reason: collision with root package name */
        public long f24598k;

        /* renamed from: l  reason: collision with root package name */
        public long f24599l;

        /* renamed from: m  reason: collision with root package name */
        public pv.b f24600m;

        public a() {
            this.f24591c = -1;
            this.f = new s.a();
        }

        public static void b(String str, d0 d0Var) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (d0Var != null) {
                boolean z13 = false;
                if (d0Var.A == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (d0Var.B == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (d0Var.C == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (d0Var.D == null) {
                                z13 = true;
                            }
                            if (z13) {
                                return;
                            }
                            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(".priorResponse != null", str).toString());
                        }
                        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(".cacheResponse != null", str).toString());
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.i.n(".networkResponse != null", str).toString());
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(".body != null", str).toString());
            }
        }

        public final d0 a() {
            boolean z10;
            int i6 = this.f24591c;
            if (i6 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z zVar = this.f24589a;
                if (zVar != null) {
                    y yVar = this.f24590b;
                    if (yVar != null) {
                        String str = this.f24592d;
                        if (str != null) {
                            return new d0(zVar, yVar, str, i6, this.f24593e, this.f.d(), this.f24594g, this.f24595h, this.f24596i, this.f24597j, this.f24598k, this.f24599l, this.f24600m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "code < 0: ").toString());
        }

        public final void c(s headers) {
            kotlin.jvm.internal.i.g(headers, "headers");
            this.f = headers.o();
        }

        public a(d0 response) {
            kotlin.jvm.internal.i.g(response, "response");
            this.f24589a = response.f24583u;
            this.f24590b = response.f24584v;
            this.f24591c = response.f24586x;
            this.f24592d = response.f24585w;
            this.f24593e = response.f24587y;
            this.f = response.f24588z.o();
            this.f24594g = response.A;
            this.f24595h = response.B;
            this.f24596i = response.C;
            this.f24597j = response.D;
            this.f24598k = response.E;
            this.f24599l = response.F;
            this.f24600m = response.G;
        }
    }
}

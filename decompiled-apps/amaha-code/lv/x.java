package lv;

import com.theinnerhour.b2b.utils.Constants;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import lv.e;
import lv.o;
/* compiled from: OkHttpClient.kt */
/* loaded from: classes2.dex */
public final class x implements Cloneable, e.a {
    public static final List<y> U = mv.b.l(y.HTTP_2, y.HTTP_1_1);
    public static final List<j> V = mv.b.l(j.f24642e, j.f);
    public final kotlin.jvm.internal.b0 A;
    public final boolean B;
    public final boolean C;
    public final kotlin.jvm.internal.h D;
    public final c E;
    public final tr.r F;
    public final ProxySelector G;
    public final kotlin.jvm.internal.b0 H;
    public final SocketFactory I;
    public final SSLSocketFactory J;
    public final X509TrustManager K;
    public final List<j> L;
    public final List<y> M;
    public final xv.c N;
    public final g O;
    public final androidx.work.k P;
    public final int Q;
    public final int R;
    public final int S;
    public final hh.a T;

    /* renamed from: u  reason: collision with root package name */
    public final m f24720u;

    /* renamed from: v  reason: collision with root package name */
    public final gd.d f24721v;

    /* renamed from: w  reason: collision with root package name */
    public final List<u> f24722w;

    /* renamed from: x  reason: collision with root package name */
    public final List<u> f24723x;

    /* renamed from: y  reason: collision with root package name */
    public final hd.a f24724y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f24725z;

    /* compiled from: OkHttpClient.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f24726a = new m();

        /* renamed from: b  reason: collision with root package name */
        public final gd.d f24727b = new gd.d(14);

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f24728c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f24729d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final hd.a f24730e;
        public final boolean f;

        /* renamed from: g  reason: collision with root package name */
        public final kotlin.jvm.internal.b0 f24731g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f24732h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f24733i;

        /* renamed from: j  reason: collision with root package name */
        public final kotlin.jvm.internal.h f24734j;

        /* renamed from: k  reason: collision with root package name */
        public c f24735k;

        /* renamed from: l  reason: collision with root package name */
        public final tr.r f24736l;

        /* renamed from: m  reason: collision with root package name */
        public final kotlin.jvm.internal.b0 f24737m;

        /* renamed from: n  reason: collision with root package name */
        public final SocketFactory f24738n;

        /* renamed from: o  reason: collision with root package name */
        public final List<j> f24739o;

        /* renamed from: p  reason: collision with root package name */
        public final List<? extends y> f24740p;

        /* renamed from: q  reason: collision with root package name */
        public final xv.c f24741q;
        public final g r;

        /* renamed from: s  reason: collision with root package name */
        public int f24742s;

        /* renamed from: t  reason: collision with root package name */
        public int f24743t;

        /* renamed from: u  reason: collision with root package name */
        public int f24744u;

        public a() {
            o.a aVar = o.f24669a;
            byte[] bArr = mv.b.f25755a;
            kotlin.jvm.internal.i.g(aVar, "<this>");
            this.f24730e = new hd.a(17, aVar);
            this.f = true;
            kotlin.jvm.internal.b0 b0Var = b.f24540o;
            this.f24731g = b0Var;
            this.f24732h = true;
            this.f24733i = true;
            this.f24734j = l.f24663p;
            this.f24736l = n.f24668q;
            this.f24737m = b0Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.i.f(socketFactory, "getDefault()");
            this.f24738n = socketFactory;
            this.f24739o = x.V;
            this.f24740p = x.U;
            this.f24741q = xv.c.f38131a;
            this.r = g.f24609c;
            this.f24742s = Constants.TIMEOUT_MS;
            this.f24743t = Constants.TIMEOUT_MS;
            this.f24744u = Constants.TIMEOUT_MS;
        }
    }

    public x(a aVar) {
        boolean z10;
        boolean z11;
        this.f24720u = aVar.f24726a;
        this.f24721v = aVar.f24727b;
        this.f24722w = mv.b.x(aVar.f24728c);
        this.f24723x = mv.b.x(aVar.f24729d);
        this.f24724y = aVar.f24730e;
        this.f24725z = aVar.f;
        this.A = aVar.f24731g;
        this.B = aVar.f24732h;
        this.C = aVar.f24733i;
        this.D = aVar.f24734j;
        this.E = aVar.f24735k;
        this.F = aVar.f24736l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.G = proxySelector == null ? wv.a.f37327a : proxySelector;
        this.H = aVar.f24737m;
        this.I = aVar.f24738n;
        List<j> list = aVar.f24739o;
        this.L = list;
        this.M = aVar.f24740p;
        this.N = aVar.f24741q;
        this.Q = aVar.f24742s;
        this.R = aVar.f24743t;
        this.S = aVar.f24744u;
        this.T = new hh.a(1);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (j jVar : list) {
                if (jVar.f24643a) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.J = null;
            this.P = null;
            this.K = null;
            this.O = g.f24609c;
        } else {
            uv.h hVar = uv.h.f34614a;
            X509TrustManager n10 = uv.h.f34614a.n();
            this.K = n10;
            uv.h hVar2 = uv.h.f34614a;
            kotlin.jvm.internal.i.d(n10);
            this.J = hVar2.m(n10);
            androidx.work.k b10 = uv.h.f34614a.b(n10);
            this.P = b10;
            g gVar = aVar.r;
            kotlin.jvm.internal.i.d(b10);
            this.O = kotlin.jvm.internal.i.b(gVar.f24611b, b10) ? gVar : new g(gVar.f24610a, b10);
        }
        List<u> list2 = this.f24722w;
        if (!list2.contains(null)) {
            List<u> list3 = this.f24723x;
            if (!list3.contains(null)) {
                List<j> list4 = this.L;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    for (j jVar2 : list4) {
                        if (jVar2.f24643a) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                X509TrustManager x509TrustManager = this.K;
                androidx.work.k kVar = this.P;
                SSLSocketFactory sSLSocketFactory = this.J;
                if (!z11) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (kVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
                if (!(sSLSocketFactory == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(kVar == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (x509TrustManager == null) {
                    if (!kotlin.jvm.internal.i.b(this.O, g.f24609c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException(kotlin.jvm.internal.i.n(list3, "Null network interceptor: ").toString());
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(list2, "Null interceptor: ").toString());
    }

    @Override // lv.e.a
    public final pv.d a(z zVar) {
        return new pv.d(this, zVar, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public x() {
        this(new a());
    }
}

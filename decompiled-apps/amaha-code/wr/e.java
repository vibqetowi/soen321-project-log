package wr;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import r1.b0;
import tr.n0;
import vr.c1;
import vr.c3;
import vr.d2;
import vr.e3;
import vr.i;
import vr.l2;
import vr.m0;
import vr.m3;
import vr.n1;
import vr.u;
import vr.u0;
import vr.w;
import xr.b;
/* compiled from: OkHttpChannelBuilder.java */
/* loaded from: classes2.dex */
public final class e extends vr.b<e> {

    /* renamed from: m  reason: collision with root package name */
    public static final xr.b f37095m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f37096n;

    /* renamed from: o  reason: collision with root package name */
    public static final e3 f37097o;

    /* renamed from: b  reason: collision with root package name */
    public final d2 f37098b;
    public SSLSocketFactory f;

    /* renamed from: c  reason: collision with root package name */
    public final m3.a f37099c = m3.f35768c;

    /* renamed from: d  reason: collision with root package name */
    public l2<Executor> f37100d = f37097o;

    /* renamed from: e  reason: collision with root package name */
    public l2<ScheduledExecutorService> f37101e = new e3(u0.f35988q);

    /* renamed from: g  reason: collision with root package name */
    public final xr.b f37102g = f37095m;

    /* renamed from: h  reason: collision with root package name */
    public int f37103h = 1;

    /* renamed from: i  reason: collision with root package name */
    public long f37104i = Long.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public final long f37105j = u0.f35983l;

    /* renamed from: k  reason: collision with root package name */
    public final int f37106k = 65535;

    /* renamed from: l  reason: collision with root package name */
    public final int f37107l = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public class a implements c3.c<Executor> {
        @Override // vr.c3.c
        public final Executor a() {
            return Executors.newCachedThreadPool(u0.d("grpc-okhttp-%d"));
        }

        @Override // vr.c3.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public final class b implements d2.a {
        public b() {
        }

        @Override // vr.d2.a
        public final int a() {
            e eVar = e.this;
            int d10 = v.h.d(eVar.f37103h);
            if (d10 != 0) {
                if (d10 == 1) {
                    return 80;
                }
                throw new AssertionError(b0.i(eVar.f37103h).concat(" not handled"));
            }
            return 443;
        }
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public final class c implements d2.b {
        public c() {
        }

        @Override // vr.d2.b
        public final d a() {
            boolean z10;
            SSLSocketFactory sSLSocketFactory;
            e eVar = e.this;
            if (eVar.f37104i != Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            l2<Executor> l2Var = eVar.f37100d;
            l2<ScheduledExecutorService> l2Var2 = eVar.f37101e;
            int d10 = v.h.d(eVar.f37103h);
            if (d10 != 0) {
                if (d10 == 1) {
                    sSLSocketFactory = null;
                } else {
                    throw new RuntimeException("Unknown negotiation type: ".concat(b0.i(eVar.f37103h)));
                }
            } else {
                try {
                    if (eVar.f == null) {
                        eVar.f = SSLContext.getInstance("Default", xr.i.f37961d.f37962a).getSocketFactory();
                    }
                    sSLSocketFactory = eVar.f;
                } catch (GeneralSecurityException e10) {
                    throw new RuntimeException("TLS Provider failure", e10);
                }
            }
            return new d(l2Var, l2Var2, sSLSocketFactory, eVar.f37102g, eVar.f35399a, z10, eVar.f37104i, eVar.f37105j, eVar.f37106k, eVar.f37107l, eVar.f37099c);
        }
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* loaded from: classes2.dex */
    public static final class d implements u {
        public final SSLSocketFactory A;
        public final xr.b C;
        public final int D;
        public final boolean E;
        public final vr.i F;
        public final long G;
        public final int H;
        public final int J;
        public boolean L;

        /* renamed from: u  reason: collision with root package name */
        public final l2<Executor> f37110u;

        /* renamed from: v  reason: collision with root package name */
        public final Executor f37111v;

        /* renamed from: w  reason: collision with root package name */
        public final l2<ScheduledExecutorService> f37112w;

        /* renamed from: x  reason: collision with root package name */
        public final ScheduledExecutorService f37113x;

        /* renamed from: y  reason: collision with root package name */
        public final m3.a f37114y;

        /* renamed from: z  reason: collision with root package name */
        public final SocketFactory f37115z = null;
        public final HostnameVerifier B = null;
        public final boolean I = false;
        public final boolean K = false;

        public d(l2 l2Var, l2 l2Var2, SSLSocketFactory sSLSocketFactory, xr.b bVar, int i6, boolean z10, long j10, long j11, int i10, int i11, m3.a aVar) {
            this.f37110u = l2Var;
            this.f37111v = (Executor) l2Var.b();
            this.f37112w = l2Var2;
            this.f37113x = (ScheduledExecutorService) l2Var2.b();
            this.A = sSLSocketFactory;
            this.C = bVar;
            this.D = i6;
            this.E = z10;
            this.F = new vr.i(j10);
            this.G = j11;
            this.H = i10;
            this.J = i11;
            sc.b.w(aVar, "transportTracerFactory");
            this.f37114y = aVar;
        }

        @Override // vr.u, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.L) {
                return;
            }
            this.L = true;
            this.f37110u.a(this.f37111v);
            this.f37112w.a(this.f37113x);
        }

        @Override // vr.u
        public final ScheduledExecutorService u0() {
            return this.f37113x;
        }

        @Override // vr.u
        public final w x0(SocketAddress socketAddress, u.a aVar, c1.f fVar) {
            if (!this.L) {
                vr.i iVar = this.F;
                long j10 = iVar.f35693b.get();
                i iVar2 = new i(this, (InetSocketAddress) socketAddress, aVar.f35969a, aVar.f35971c, aVar.f35970b, aVar.f35972d, new f(new i.a(j10)));
                if (this.E) {
                    iVar2.H = true;
                    iVar2.I = j10;
                    iVar2.J = this.G;
                    iVar2.K = this.I;
                }
                return iVar2;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }
    }

    static {
        Logger.getLogger(e.class.getName());
        b.a aVar = new b.a(xr.b.f37940e);
        aVar.a(xr.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, xr.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, xr.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, xr.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, xr.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, xr.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        aVar.b(xr.k.TLS_1_2);
        if (aVar.f37945a) {
            aVar.f37948d = true;
            f37095m = new xr.b(aVar);
            f37096n = TimeUnit.DAYS.toNanos(1000L);
            f37097o = new e3(new a());
            EnumSet.of(n0.MTLS, n0.CUSTOM_MANAGERS);
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public e(String str) {
        this.f37098b = new d2(str, new c(), new b());
    }

    public static e forTarget(String str) {
        return new e(str);
    }

    @Override // io.grpc.k
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.f37104i = nanos;
        long max = Math.max(nanos, n1.f35774l);
        this.f37104i = max;
        if (max >= f37096n) {
            this.f37104i = Long.MAX_VALUE;
        }
    }

    @Override // io.grpc.k
    public final void c() {
        this.f37103h = 2;
    }

    public e scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        sc.b.w(scheduledExecutorService, "scheduledExecutorService");
        this.f37101e = new m0(scheduledExecutorService);
        return this;
    }

    public e sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f = sSLSocketFactory;
        this.f37103h = 1;
        return this;
    }

    public e transportExecutor(Executor executor) {
        if (executor == null) {
            this.f37100d = f37097o;
        } else {
            this.f37100d = new m0(executor);
        }
        return this;
    }
}

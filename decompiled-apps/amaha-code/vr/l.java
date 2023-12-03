package vr;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import tr.a;
import vr.c1;
import vr.j2;
import vr.q1;
import vr.u;
/* compiled from: CallCredentialsApplyingTransportFactory.java */
/* loaded from: classes2.dex */
public final class l implements u {

    /* renamed from: u  reason: collision with root package name */
    public final u f35749u;

    /* renamed from: v  reason: collision with root package name */
    public final tr.a f35750v;

    /* renamed from: w  reason: collision with root package name */
    public final Executor f35751w;

    /* compiled from: CallCredentialsApplyingTransportFactory.java */
    /* loaded from: classes2.dex */
    public class a extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final w f35752a;

        /* renamed from: c  reason: collision with root package name */
        public volatile tr.i0 f35754c;

        /* renamed from: d  reason: collision with root package name */
        public tr.i0 f35755d;

        /* renamed from: e  reason: collision with root package name */
        public tr.i0 f35756e;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f35753b = new AtomicInteger(-2147483647);
        public final C0605a f = new C0605a();

        /* compiled from: CallCredentialsApplyingTransportFactory.java */
        /* renamed from: vr.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0605a implements j2.a {
            public C0605a() {
            }
        }

        /* compiled from: CallCredentialsApplyingTransportFactory.java */
        /* loaded from: classes2.dex */
        public class b extends a.b {
        }

        public a(w wVar, String str) {
            sc.b.w(wVar, "delegate");
            this.f35752a = wVar;
            sc.b.w(str, "authority");
        }

        public static void b(a aVar) {
            synchronized (aVar) {
                if (aVar.f35753b.get() == 0) {
                    tr.i0 i0Var = aVar.f35755d;
                    tr.i0 i0Var2 = aVar.f35756e;
                    aVar.f35755d = null;
                    aVar.f35756e = null;
                    if (i0Var != null) {
                        super.h(i0Var);
                    }
                    if (i0Var2 != null) {
                        super.c(i0Var2);
                    }
                }
            }
        }

        @Override // vr.p0
        public final w a() {
            return this.f35752a;
        }

        @Override // vr.p0, vr.g2
        public final void c(tr.i0 i0Var) {
            sc.b.w(i0Var, "status");
            synchronized (this) {
                if (this.f35753b.get() < 0) {
                    this.f35754c = i0Var;
                    this.f35753b.addAndGet(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                } else if (this.f35756e != null) {
                    return;
                }
                if (this.f35753b.get() != 0) {
                    this.f35756e = i0Var;
                } else {
                    super.c(i0Var);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [tr.a] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [tr.a] */
        /* JADX WARN: Type inference failed for: r0v8, types: [tr.a] */
        @Override // vr.t
        public final r f(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            f0 f0Var;
            Executor executor;
            ?? r02 = bVar.f20435d;
            if (r02 == null) {
                r02 = l.this.f35750v;
            } else {
                tr.a aVar = l.this.f35750v;
                if (aVar != null) {
                    r02 = new tr.g(aVar, r02);
                }
            }
            if (r02 != null) {
                j2 j2Var = new j2(this.f35752a, d0Var, c0Var, bVar, this.f, cVarArr);
                if (this.f35753b.incrementAndGet() > 0) {
                    a aVar2 = a.this;
                    if (aVar2.f35753b.decrementAndGet() == 0) {
                        b(aVar2);
                    }
                    return new k0(this.f35754c, cVarArr);
                }
                b bVar2 = new b();
                try {
                    if (!(r02 instanceof tr.x) || !r02.a() || (executor = bVar.f20433b) == null) {
                        executor = l.this.f35751w;
                    }
                    r02.a(bVar2, executor, j2Var);
                } catch (Throwable th2) {
                    j2Var.b(tr.i0.f33485j.g("Credentials should use fail() instead of throwing exceptions").f(th2));
                }
                synchronized (j2Var.f35734h) {
                    r rVar = j2Var.f35735i;
                    f0Var = rVar;
                    if (rVar == null) {
                        f0 f0Var2 = new f0();
                        j2Var.f35737k = f0Var2;
                        j2Var.f35735i = f0Var2;
                        f0Var = f0Var2;
                    }
                }
                return f0Var;
            } else if (this.f35753b.get() >= 0) {
                return new k0(this.f35754c, cVarArr);
            } else {
                return this.f35752a.f(d0Var, c0Var, bVar, cVarArr);
            }
        }

        @Override // vr.p0, vr.g2
        public final void h(tr.i0 i0Var) {
            sc.b.w(i0Var, "status");
            synchronized (this) {
                if (this.f35753b.get() < 0) {
                    this.f35754c = i0Var;
                    this.f35753b.addAndGet(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                    if (this.f35753b.get() != 0) {
                        this.f35755d = i0Var;
                    } else {
                        super.h(i0Var);
                    }
                }
            }
        }
    }

    public l(u uVar, tr.a aVar, q1.i iVar) {
        sc.b.w(uVar, "delegate");
        this.f35749u = uVar;
        this.f35750v = aVar;
        this.f35751w = iVar;
    }

    @Override // vr.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35749u.close();
    }

    @Override // vr.u
    public final ScheduledExecutorService u0() {
        return this.f35749u.u0();
    }

    @Override // vr.u
    public final w x0(SocketAddress socketAddress, u.a aVar, c1.f fVar) {
        return new a(this.f35749u.x0(socketAddress, aVar, fVar), aVar.f35969a);
    }
}

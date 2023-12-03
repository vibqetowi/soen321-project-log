package ne;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import ne.z;
import oe.a;
import tr.i0;
/* compiled from: AbstractStream.java */
/* loaded from: classes.dex */
public abstract class b<ReqT, RespT, CallbackT extends z> {

    /* renamed from: n  reason: collision with root package name */
    public static final long f26157n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f26158o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f26159p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f26160q;
    public static final long r;

    /* renamed from: a  reason: collision with root package name */
    public a.C0452a f26161a;

    /* renamed from: b  reason: collision with root package name */
    public a.C0452a f26162b;

    /* renamed from: c  reason: collision with root package name */
    public final n f26163c;

    /* renamed from: d  reason: collision with root package name */
    public final tr.d0<ReqT, RespT> f26164d;

    /* renamed from: e  reason: collision with root package name */
    public final b<ReqT, RespT, CallbackT>.RunnableC0429b f26165e;
    public final oe.a f;

    /* renamed from: g  reason: collision with root package name */
    public final a.c f26166g;

    /* renamed from: h  reason: collision with root package name */
    public final a.c f26167h;

    /* renamed from: i  reason: collision with root package name */
    public y f26168i;

    /* renamed from: j  reason: collision with root package name */
    public long f26169j;

    /* renamed from: k  reason: collision with root package name */
    public m f26170k;

    /* renamed from: l  reason: collision with root package name */
    public final oe.h f26171l;

    /* renamed from: m  reason: collision with root package name */
    public final CallbackT f26172m;

    /* compiled from: AbstractStream.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f26173a;

        public a(long j10) {
            this.f26173a = j10;
        }

        public final void a(Runnable runnable) {
            b bVar = b.this;
            bVar.f.d();
            if (bVar.f26169j == this.f26173a) {
                runnable.run();
            } else {
                kc.f.A(1, bVar.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* compiled from: AbstractStream.java */
    /* renamed from: ne.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0429b implements Runnable {
        public RunnableC0429b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.c()) {
                bVar.a(y.Initial, i0.f33481e);
            }
        }
    }

    /* compiled from: AbstractStream.java */
    /* loaded from: classes.dex */
    public class c implements r<RespT> {

        /* renamed from: a  reason: collision with root package name */
        public final b<ReqT, RespT, CallbackT>.a f26176a;

        public c(b<ReqT, RespT, CallbackT>.a aVar) {
            this.f26176a = aVar;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f26157n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f26158o = timeUnit2.toMillis(1L);
        f26159p = timeUnit2.toMillis(1L);
        f26160q = timeUnit.toMillis(10L);
        r = timeUnit.toMillis(10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(n nVar, tr.d0 d0Var, oe.a aVar, a.c cVar, a.c cVar2, z zVar) {
        a.c cVar3 = a.c.HEALTH_CHECK_TIMEOUT;
        this.f26168i = y.Initial;
        this.f26169j = 0L;
        this.f26163c = nVar;
        this.f26164d = d0Var;
        this.f = aVar;
        this.f26166g = cVar2;
        this.f26167h = cVar3;
        this.f26172m = zVar;
        this.f26165e = new RunnableC0429b();
        this.f26171l = new oe.h(aVar, cVar, f26157n, f26158o);
    }

    public final void a(y yVar, i0 i0Var) {
        boolean z10;
        ca.a.u0(d(), "Only started streams should be closed.", new Object[0]);
        y yVar2 = y.Error;
        if (yVar != yVar2 && !i0Var.e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "Can't provide an error when not in an error state.", new Object[0]);
        this.f.d();
        HashSet hashSet = g.f26221d;
        i0.a aVar = i0Var.f33491a;
        Throwable th2 = i0Var.f33493c;
        if (th2 instanceof SSLHandshakeException) {
            th2.getMessage().contains("no ciphers available");
        }
        a.C0452a c0452a = this.f26162b;
        if (c0452a != null) {
            c0452a.a();
            this.f26162b = null;
        }
        a.C0452a c0452a2 = this.f26161a;
        if (c0452a2 != null) {
            c0452a2.a();
            this.f26161a = null;
        }
        oe.h hVar = this.f26171l;
        a.C0452a c0452a3 = hVar.f27429h;
        if (c0452a3 != null) {
            c0452a3.a();
            hVar.f27429h = null;
        }
        this.f26169j++;
        i0.a aVar2 = i0.a.OK;
        i0.a aVar3 = i0Var.f33491a;
        if (aVar3 == aVar2) {
            hVar.f = 0L;
        } else if (aVar3 == i0.a.RESOURCE_EXHAUSTED) {
            kc.f.A(1, getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            hVar.f = hVar.f27427e;
        } else if (aVar3 == i0.a.UNAUTHENTICATED && this.f26168i != y.Healthy) {
            n nVar = this.f26163c;
            nVar.f26249b.l();
            nVar.f26250c.l();
        } else if (aVar3 == i0.a.UNAVAILABLE && ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException))) {
            hVar.f27427e = r;
        }
        if (yVar != yVar2) {
            kc.f.A(1, getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            g();
        }
        if (this.f26170k != null) {
            if (i0Var.e()) {
                kc.f.A(1, getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f26170k.b();
            }
            this.f26170k = null;
        }
        this.f26168i = yVar;
        this.f26172m.a(i0Var);
    }

    public final void b() {
        ca.a.u0(!d(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f.d();
        this.f26168i = y.Initial;
        this.f26171l.f = 0L;
    }

    public final boolean c() {
        this.f.d();
        y yVar = this.f26168i;
        if (yVar != y.Open && yVar != y.Healthy) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        this.f.d();
        y yVar = this.f26168i;
        if (yVar != y.Starting && yVar != y.Backoff && !c()) {
            return false;
        }
        return true;
    }

    public abstract void e(RespT respt);

    /* JADX WARN: Type inference failed for: r6v2, types: [tr.c[], java.io.Serializable] */
    public void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f.d();
        if (this.f26170k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Last call still set", new Object[0]);
        if (this.f26162b == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ca.a.u0(z11, "Idle timer still set", new Object[0]);
        y yVar = this.f26168i;
        y yVar2 = y.Error;
        if (yVar == yVar2) {
            if (yVar == yVar2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ca.a.u0(z13, "Should only perform backoff in an error state", new Object[0]);
            this.f26168i = y.Backoff;
            ne.a aVar = new ne.a(this, 0);
            oe.h hVar = this.f26171l;
            a.C0452a c0452a = hVar.f27429h;
            if (c0452a != null) {
                c0452a.a();
                hVar.f27429h = null;
            }
            long random = hVar.f + ((long) ((Math.random() - 0.5d) * hVar.f));
            long max = Math.max(0L, new Date().getTime() - hVar.f27428g);
            long max2 = Math.max(0L, random - max);
            if (hVar.f > 0) {
                kc.f.A(1, oe.h.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(hVar.f), Long.valueOf(random), Long.valueOf(max));
            }
            hVar.f27429h = hVar.f27423a.a(hVar.f27424b, max2, new u(hVar, 3, aVar));
            long j10 = (long) (hVar.f * 1.5d);
            hVar.f = j10;
            long j11 = hVar.f27425c;
            if (j10 < j11) {
                hVar.f = j11;
            } else {
                long j12 = hVar.f27427e;
                if (j10 > j12) {
                    hVar.f = j12;
                }
            }
            hVar.f27427e = hVar.f27426d;
            return;
        }
        if (yVar == y.Initial) {
            z12 = true;
        } else {
            z12 = false;
        }
        ca.a.u0(z12, "Already started", new Object[0]);
        c cVar = new c(new a(this.f26169j));
        n nVar = this.f26163c;
        nVar.getClass();
        ?? r62 = {0};
        p pVar = nVar.f26251d;
        ya.h continueWithTask = pVar.f26256a.continueWithTask(pVar.f26257b.f27381a, new dd.a(pVar, 22, this.f26164d));
        continueWithTask.addOnCompleteListener(nVar.f26248a.f27381a, new i(nVar, r62, cVar, 1));
        this.f26170k = new m(nVar, r62, continueWithTask);
        this.f26168i = y.Starting;
    }

    public final void h(com.google.protobuf.v vVar) {
        this.f.d();
        kc.f.A(1, getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), vVar);
        a.C0452a c0452a = this.f26162b;
        if (c0452a != null) {
            c0452a.a();
            this.f26162b = null;
        }
        this.f26170k.d(vVar);
    }

    public void g() {
    }
}

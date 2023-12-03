package vr;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.grpc.StatusRuntimeException;
import io.grpc.c;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import tr.c0;
import tr.i0;
import vr.i3;
import vr.s;
/* compiled from: RetriableStream.java */
/* loaded from: classes2.dex */
public abstract class v2<ReqT> implements vr.r {
    public static final c0.b A;
    public static final c0.b B;
    public static final tr.i0 C;
    public static final Random D;

    /* renamed from: a  reason: collision with root package name */
    public final tr.d0<ReqT, ?> f36019a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f36020b;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f36022d;

    /* renamed from: e  reason: collision with root package name */
    public final tr.c0 f36023e;
    public final x2 f;

    /* renamed from: g  reason: collision with root package name */
    public final w0 f36024g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f36025h;

    /* renamed from: j  reason: collision with root package name */
    public final s f36027j;

    /* renamed from: k  reason: collision with root package name */
    public final long f36028k;

    /* renamed from: l  reason: collision with root package name */
    public final long f36029l;

    /* renamed from: m  reason: collision with root package name */
    public final a0 f36030m;

    /* renamed from: s  reason: collision with root package name */
    public tr.i0 f36035s;

    /* renamed from: t  reason: collision with root package name */
    public long f36036t;

    /* renamed from: u  reason: collision with root package name */
    public vr.s f36037u;

    /* renamed from: v  reason: collision with root package name */
    public t f36038v;

    /* renamed from: w  reason: collision with root package name */
    public t f36039w;

    /* renamed from: x  reason: collision with root package name */
    public long f36040x;

    /* renamed from: y  reason: collision with root package name */
    public tr.i0 f36041y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f36042z;

    /* renamed from: c  reason: collision with root package name */
    public final tr.l0 f36021c = new tr.l0(new a());

    /* renamed from: i  reason: collision with root package name */
    public final Object f36026i = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final b1 f36031n = new b1();

    /* renamed from: o  reason: collision with root package name */
    public volatile x f36032o = new x(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p  reason: collision with root package name */
    public final AtomicBoolean f36033p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    public final AtomicInteger f36034q = new AtomicInteger();
    public final AtomicInteger r = new AtomicInteger();

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th2) {
            throw new StatusRuntimeException(tr.i0.d(th2).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class a0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f36043a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36044b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36045c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f36046d;

        public a0(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f36046d = atomicInteger;
            this.f36045c = (int) (f2 * 1000.0f);
            int i6 = (int) (f * 1000.0f);
            this.f36043a = i6;
            this.f36044b = i6 / 2;
            atomicInteger.set(i6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            if (this.f36043a == a0Var.f36043a && this.f36045c == a0Var.f36045c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36043a), Integer.valueOf(this.f36045c)});
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class b implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f36047a;

        public b(String str) {
            this.f36047a = str;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.l(this.f36047a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class c implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tr.h f36048a;

        public c(tr.h hVar) {
            this.f36048a = hVar;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.a(this.f36048a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class d implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tr.m f36049a;

        public d(tr.m mVar) {
            this.f36049a = mVar;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.i(this.f36049a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class e implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tr.o f36050a;

        public e(tr.o oVar) {
            this.f36050a = oVar;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.k(this.f36050a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class f implements q {
        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.flush();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class g implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f36051a;

        public g(boolean z10) {
            this.f36051a = z10;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.p(this.f36051a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class h implements q {
        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.m();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class i implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f36052a;

        public i(int i6) {
            this.f36052a = i6;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.g(this.f36052a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class j implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f36053a;

        public j(int i6) {
            this.f36053a = i6;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.h(this.f36053a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class k implements q {
        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.c();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class l implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f36054a;

        public l(int i6) {
            this.f36054a = i6;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.e(this.f36054a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class m implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f36055a;

        public m(Object obj) {
            this.f36055a = obj;
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.b(v2.this.f36019a.f33453d.b(this.f36055a));
            zVar.f36096a.flush();
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class n extends c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.grpc.c f36057a;

        public n(r rVar) {
            this.f36057a = rVar;
        }

        @Override // io.grpc.c.a
        public final io.grpc.c a() {
            return this.f36057a;
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v2 v2Var = v2.this;
            if (!v2Var.f36042z) {
                v2Var.f36037u.onReady();
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.i0 f36059u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ s.a f36060v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ tr.c0 f36061w;

        public p(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
            this.f36059u = i0Var;
            this.f36060v = aVar;
            this.f36061w = c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v2 v2Var = v2.this;
            v2Var.f36042z = true;
            v2Var.f36037u.b(this.f36059u, this.f36060v, this.f36061w);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public interface q {
        void a(z zVar);
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class r extends io.grpc.c {

        /* renamed from: v  reason: collision with root package name */
        public final z f36063v;

        /* renamed from: w  reason: collision with root package name */
        public long f36064w;

        public r(z zVar) {
            this.f36063v = zVar;
        }

        @Override // com.android.volley.toolbox.a
        public final void o(long j10) {
            w2 w2Var;
            if (v2.this.f36032o.f != null) {
                return;
            }
            synchronized (v2.this.f36026i) {
                if (v2.this.f36032o.f == null) {
                    z zVar = this.f36063v;
                    if (!zVar.f36097b) {
                        long j11 = this.f36064w + j10;
                        this.f36064w = j11;
                        v2 v2Var = v2.this;
                        long j12 = v2Var.f36036t;
                        if (j11 <= j12) {
                            return;
                        }
                        if (j11 > v2Var.f36028k) {
                            zVar.f36098c = true;
                        } else {
                            long addAndGet = v2Var.f36027j.f36066a.addAndGet(j11 - j12);
                            v2 v2Var2 = v2.this;
                            v2Var2.f36036t = this.f36064w;
                            if (addAndGet > v2Var2.f36029l) {
                                this.f36063v.f36098c = true;
                            }
                        }
                        z zVar2 = this.f36063v;
                        if (zVar2.f36098c) {
                            w2Var = v2.this.q(zVar2);
                        } else {
                            w2Var = null;
                        }
                        if (w2Var != null) {
                            w2Var.run();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class s {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicLong f36066a = new AtomicLong();
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class t {

        /* renamed from: a  reason: collision with root package name */
        public final Object f36067a;

        /* renamed from: b  reason: collision with root package name */
        public Future<?> f36068b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f36069c;

        public t(Object obj) {
            this.f36067a = obj;
        }

        public final void a(ScheduledFuture scheduledFuture) {
            synchronized (this.f36067a) {
                if (!this.f36069c) {
                    this.f36068b = scheduledFuture;
                }
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public final class u implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final t f36070u;

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ z f36072u;

            public a(z zVar) {
                this.f36072u = zVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                t tVar;
                synchronized (v2.this.f36026i) {
                    try {
                        u uVar = u.this;
                        z10 = true;
                        tVar = null;
                        if (!uVar.f36070u.f36069c) {
                            v2 v2Var = v2.this;
                            v2Var.f36032o = v2Var.f36032o.a(this.f36072u);
                            v2 v2Var2 = v2.this;
                            if (v2Var2.v(v2Var2.f36032o)) {
                                a0 a0Var = v2.this.f36030m;
                                if (a0Var != null) {
                                    if (a0Var.f36046d.get() <= a0Var.f36044b) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                    }
                                }
                                v2 v2Var3 = v2.this;
                                t tVar2 = new t(v2Var3.f36026i);
                                v2Var3.f36039w = tVar2;
                                tVar = tVar2;
                                z10 = false;
                            }
                            v2 v2Var4 = v2.this;
                            x xVar = v2Var4.f36032o;
                            if (!xVar.f36083h) {
                                xVar = new x(xVar.f36078b, xVar.f36079c, xVar.f36080d, xVar.f, xVar.f36082g, xVar.f36077a, true, xVar.f36081e);
                            }
                            v2Var4.f36032o = xVar;
                            v2.this.f36039w = null;
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    this.f36072u.f36096a.o(tr.i0.f.g("Unneeded hedging"));
                    return;
                }
                if (tVar != null) {
                    v2 v2Var5 = v2.this;
                    tVar.a(v2Var5.f36022d.schedule(new u(tVar), v2Var5.f36024g.f36101b, TimeUnit.NANOSECONDS));
                }
                v2.this.t(this.f36072u);
            }
        }

        public u(t tVar) {
            this.f36070u = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v2 v2Var = v2.this;
            z r = v2Var.r(v2Var.f36032o.f36081e, false);
            if (r == null) {
                return;
            }
            v2.this.f36020b.execute(new a(r));
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f36074a;

        /* renamed from: b  reason: collision with root package name */
        public final long f36075b;

        public v(boolean z10, long j10) {
            this.f36074a = z10;
            this.f36075b = j10;
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public class w implements q {
        public w() {
        }

        @Override // vr.v2.q
        public final void a(z zVar) {
            zVar.f36096a.n(new y(zVar));
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class x {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f36077a;

        /* renamed from: b  reason: collision with root package name */
        public final List<q> f36078b;

        /* renamed from: c  reason: collision with root package name */
        public final Collection<z> f36079c;

        /* renamed from: d  reason: collision with root package name */
        public final Collection<z> f36080d;

        /* renamed from: e  reason: collision with root package name */
        public final int f36081e;
        public final z f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f36082g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f36083h;

        public x(List<q> list, Collection<z> collection, Collection<z> collection2, z zVar, boolean z10, boolean z11, boolean z12, int i6) {
            boolean z13;
            boolean z14;
            boolean z15;
            this.f36078b = list;
            sc.b.w(collection, "drainedSubstreams");
            this.f36079c = collection;
            this.f = zVar;
            this.f36080d = collection2;
            this.f36082g = z10;
            this.f36077a = z11;
            this.f36083h = z12;
            this.f36081e = i6;
            boolean z16 = false;
            if (z11 && list != null) {
                z13 = false;
            } else {
                z13 = true;
            }
            sc.b.B("passThrough should imply buffer is null", z13);
            if (z11 && zVar == null) {
                z14 = false;
            } else {
                z14 = true;
            }
            sc.b.B("passThrough should imply winningSubstream != null", z14);
            if (z11 && ((collection.size() != 1 || !collection.contains(zVar)) && (collection.size() != 0 || !zVar.f36097b))) {
                z15 = false;
            } else {
                z15 = true;
            }
            sc.b.B("passThrough should imply winningSubstream is drained", z15);
            sc.b.B("cancelled should imply committed", (z10 && zVar == null) ? true : true);
        }

        public final x a(z zVar) {
            boolean z10;
            Collection unmodifiableCollection;
            sc.b.B("hedging frozen", !this.f36083h);
            if (this.f == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("already committed", z10);
            Collection<z> collection = this.f36080d;
            if (collection == null) {
                unmodifiableCollection = Collections.singleton(zVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(zVar);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new x(this.f36078b, this.f36079c, unmodifiableCollection, this.f, this.f36082g, this.f36077a, this.f36083h, this.f36081e + 1);
        }

        public final x b(z zVar) {
            ArrayList arrayList = new ArrayList(this.f36080d);
            arrayList.remove(zVar);
            return new x(this.f36078b, this.f36079c, Collections.unmodifiableCollection(arrayList), this.f, this.f36082g, this.f36077a, this.f36083h, this.f36081e);
        }

        public final x c(z zVar, z zVar2) {
            ArrayList arrayList = new ArrayList(this.f36080d);
            arrayList.remove(zVar);
            arrayList.add(zVar2);
            return new x(this.f36078b, this.f36079c, Collections.unmodifiableCollection(arrayList), this.f, this.f36082g, this.f36077a, this.f36083h, this.f36081e);
        }

        public final x d(z zVar) {
            zVar.f36097b = true;
            Collection<z> collection = this.f36079c;
            if (collection.contains(zVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(zVar);
                return new x(this.f36078b, Collections.unmodifiableCollection(arrayList), this.f36080d, this.f, this.f36082g, this.f36077a, this.f36083h, this.f36081e);
            }
            return this;
        }

        public final x e(z zVar) {
            boolean z10;
            List<q> list;
            boolean z11 = true;
            sc.b.B("Already passThrough", !this.f36077a);
            boolean z12 = zVar.f36097b;
            Collection collection = this.f36079c;
            if (!z12) {
                if (collection.isEmpty()) {
                    collection = Collections.singletonList(zVar);
                } else {
                    ArrayList arrayList = new ArrayList(collection);
                    arrayList.add(zVar);
                    collection = Collections.unmodifiableCollection(arrayList);
                }
            }
            Collection collection2 = collection;
            z zVar2 = this.f;
            if (zVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (zVar2 != zVar) {
                    z11 = false;
                }
                sc.b.B("Another RPC attempt has already committed", z11);
                list = null;
            } else {
                list = this.f36078b;
            }
            return new x(list, collection2, this.f36080d, this.f, this.f36082g, z10, this.f36083h, this.f36081e);
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public final class y implements vr.s {

        /* renamed from: a  reason: collision with root package name */
        public final z f36084a;

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f36086u;

            public a(tr.c0 c0Var) {
                this.f36086u = c0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v2.this.f36037u.c(this.f36086u);
            }
        }

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ z f36088u;

            /* compiled from: RetriableStream.java */
            /* loaded from: classes2.dex */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    v2 v2Var = v2.this;
                    z zVar = bVar.f36088u;
                    c0.b bVar2 = v2.A;
                    v2Var.t(zVar);
                }
            }

            public b(z zVar) {
                this.f36088u = zVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v2.this.f36020b.execute(new a());
            }
        }

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ z f36091u;

            public c(z zVar) {
                this.f36091u = zVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v2 v2Var = v2.this;
                c0.b bVar = v2.A;
                v2Var.t(this.f36091u);
            }
        }

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ i3.a f36093u;

            public d(i3.a aVar) {
                this.f36093u = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v2.this.f36037u.a(this.f36093u);
            }
        }

        /* compiled from: RetriableStream.java */
        /* loaded from: classes2.dex */
        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                v2 v2Var = v2.this;
                if (!v2Var.f36042z) {
                    v2Var.f36037u.onReady();
                }
            }
        }

        public y(z zVar) {
            this.f36084a = zVar;
        }

        @Override // vr.i3
        public final void a(i3.a aVar) {
            boolean z10;
            x xVar = v2.this.f36032o;
            if (xVar.f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("Headers should be received prior to messages.", z10);
            if (xVar.f != this.f36084a) {
                return;
            }
            v2.this.f36021c.execute(new d(aVar));
        }

        @Override // vr.s
        public final void b(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
            boolean z10;
            boolean z11;
            v vVar;
            long nanos;
            boolean z12;
            v2 v2Var;
            t tVar;
            boolean z13;
            boolean z14;
            synchronized (v2.this.f36026i) {
                v2 v2Var2 = v2.this;
                v2Var2.f36032o = v2Var2.f36032o.d(this.f36084a);
                b1 b1Var = v2.this.f36031n;
                i0.a aVar2 = i0Var.f33491a;
                b1Var.getClass();
                b1Var.f35403b.add(String.valueOf(aVar2));
            }
            if (v2.this.r.decrementAndGet() == Integer.MIN_VALUE) {
                v2 v2Var3 = v2.this;
                v2Var3.z(v2Var3.f36035s, s.a.PROCESSED, new tr.c0());
                return;
            }
            z zVar = this.f36084a;
            if (zVar.f36098c) {
                v2.d(v2.this, zVar);
                if (v2.this.f36032o.f == this.f36084a) {
                    v2.this.z(i0Var, aVar, c0Var);
                    return;
                }
                return;
            }
            s.a aVar3 = s.a.MISCARRIED;
            if (aVar == aVar3 && v2.this.f36034q.incrementAndGet() > 1000) {
                v2.d(v2.this, this.f36084a);
                if (v2.this.f36032o.f == this.f36084a) {
                    v2.this.z(tr.i0.f33487l.g("Too many transparent retries. Might be a bug in gRPC").f(new StatusRuntimeException(i0Var)), aVar, c0Var);
                    return;
                }
                return;
            }
            if (v2.this.f36032o.f == null) {
                boolean z15 = true;
                if (aVar != aVar3 && (aVar != s.a.REFUSED || !v2.this.f36033p.compareAndSet(false, true))) {
                    if (aVar == s.a.DROPPED) {
                        v2 v2Var4 = v2.this;
                        if (v2Var4.f36025h) {
                            v2Var4.u();
                        }
                    } else {
                        v2.this.f36033p.set(true);
                        v2 v2Var5 = v2.this;
                        Integer num = null;
                        if (v2Var5.f36025h) {
                            String str = (String) c0Var.c(v2.B);
                            if (str != null) {
                                try {
                                    num = Integer.valueOf(str);
                                } catch (NumberFormatException unused) {
                                    num = -1;
                                }
                            }
                            v2 v2Var6 = v2.this;
                            boolean z16 = !v2Var6.f36024g.f36102c.contains(i0Var.f33491a);
                            if (v2Var6.f36030m != null && (!z16 || (num != null && num.intValue() < 0))) {
                                a0 a0Var = v2Var6.f36030m;
                                while (true) {
                                    AtomicInteger atomicInteger = a0Var.f36046d;
                                    int i6 = atomicInteger.get();
                                    if (i6 == 0) {
                                        break;
                                    }
                                    int i10 = i6 - 1000;
                                    if (atomicInteger.compareAndSet(i6, Math.max(i10, 0))) {
                                        if (i10 > a0Var.f36044b) {
                                            z14 = true;
                                        }
                                    }
                                }
                                z14 = false;
                                z13 = !z14;
                            } else {
                                z13 = false;
                            }
                            z15 = (z16 || z13) ? false : false;
                            if (z15) {
                                v2.f(v2.this, num);
                            }
                            synchronized (v2.this.f36026i) {
                                v2 v2Var7 = v2.this;
                                v2Var7.f36032o = v2Var7.f36032o.b(this.f36084a);
                                if (z15) {
                                    v2 v2Var8 = v2.this;
                                    if (v2Var8.v(v2Var8.f36032o) || !v2.this.f36032o.f36080d.isEmpty()) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            x2 x2Var = v2Var5.f;
                            long j10 = 0;
                            if (x2Var == null) {
                                vVar = new v(false, 0L);
                            } else {
                                boolean contains = x2Var.f.contains(i0Var.f33491a);
                                String str2 = (String) c0Var.c(v2.B);
                                if (str2 != null) {
                                    try {
                                        num = Integer.valueOf(str2);
                                    } catch (NumberFormatException unused2) {
                                        num = -1;
                                    }
                                }
                                if (v2Var5.f36030m != null && (contains || (num != null && num.intValue() < 0))) {
                                    a0 a0Var2 = v2Var5.f36030m;
                                    while (true) {
                                        AtomicInteger atomicInteger2 = a0Var2.f36046d;
                                        int i11 = atomicInteger2.get();
                                        if (i11 == 0) {
                                            break;
                                        }
                                        int i12 = i11 - 1000;
                                        if (atomicInteger2.compareAndSet(i11, Math.max(i12, 0))) {
                                            if (i12 > a0Var2.f36044b) {
                                                z12 = true;
                                            }
                                        }
                                    }
                                    z12 = false;
                                    z10 = !z12;
                                } else {
                                    z10 = false;
                                }
                                if (v2Var5.f.f36118a > this.f36084a.f36099d + 1 && !z10) {
                                    if (num == null) {
                                        if (contains) {
                                            nanos = (long) (v2.D.nextDouble() * v2Var5.f36040x);
                                            x2 x2Var2 = v2Var5.f;
                                            v2Var5.f36040x = Math.min((long) (v2Var5.f36040x * x2Var2.f36121d), x2Var2.f36120c);
                                            j10 = nanos;
                                            z11 = true;
                                        }
                                    } else if (num.intValue() >= 0) {
                                        nanos = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                        v2Var5.f36040x = v2Var5.f.f36119b;
                                        j10 = nanos;
                                        z11 = true;
                                    }
                                    vVar = new v(z11, j10);
                                }
                                z11 = false;
                                vVar = new v(z11, j10);
                            }
                            if (vVar.f36074a) {
                                z r = v2.this.r(this.f36084a.f36099d + 1, false);
                                if (r == null) {
                                    return;
                                }
                                synchronized (v2.this.f36026i) {
                                    v2Var = v2.this;
                                    tVar = new t(v2Var.f36026i);
                                    v2Var.f36038v = tVar;
                                }
                                tVar.a(v2Var.f36022d.schedule(new b(r), vVar.f36075b, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                } else {
                    z r10 = v2.this.r(this.f36084a.f36099d, true);
                    if (r10 == null) {
                        return;
                    }
                    v2 v2Var9 = v2.this;
                    if (v2Var9.f36025h) {
                        synchronized (v2Var9.f36026i) {
                            v2 v2Var10 = v2.this;
                            v2Var10.f36032o = v2Var10.f36032o.c(this.f36084a, r10);
                            v2 v2Var11 = v2.this;
                            if (v2Var11.v(v2Var11.f36032o) || v2.this.f36032o.f36080d.size() != 1) {
                                z15 = false;
                            }
                        }
                        if (z15) {
                            v2.d(v2.this, r10);
                        }
                    } else {
                        x2 x2Var3 = v2Var9.f;
                        if (x2Var3 == null || x2Var3.f36118a == 1) {
                            v2.d(v2Var9, r10);
                        }
                    }
                    v2.this.f36020b.execute(new c(r10));
                    return;
                }
            }
            v2.d(v2.this, this.f36084a);
            if (v2.this.f36032o.f == this.f36084a) {
                v2.this.z(i0Var, aVar, c0Var);
            }
        }

        @Override // vr.s
        public final void c(tr.c0 c0Var) {
            AtomicInteger atomicInteger;
            int i6;
            int i10;
            v2.d(v2.this, this.f36084a);
            if (v2.this.f36032o.f == this.f36084a) {
                a0 a0Var = v2.this.f36030m;
                if (a0Var != null) {
                    do {
                        atomicInteger = a0Var.f36046d;
                        i6 = atomicInteger.get();
                        i10 = a0Var.f36043a;
                        if (i6 == i10) {
                            break;
                        }
                    } while (!atomicInteger.compareAndSet(i6, Math.min(a0Var.f36045c + i6, i10)));
                }
                v2.this.f36021c.execute(new a(c0Var));
            }
        }

        @Override // vr.i3
        public final void onReady() {
            v2 v2Var = v2.this;
            if (!v2Var.isReady()) {
                return;
            }
            v2Var.f36021c.execute(new e());
        }
    }

    /* compiled from: RetriableStream.java */
    /* loaded from: classes2.dex */
    public static final class z {

        /* renamed from: a  reason: collision with root package name */
        public vr.r f36096a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f36097b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f36098c;

        /* renamed from: d  reason: collision with root package name */
        public final int f36099d;

        public z(int i6) {
            this.f36099d = i6;
        }
    }

    static {
        c0.a aVar = tr.c0.f33440d;
        BitSet bitSet = c0.d.f33445d;
        A = new c0.b("grpc-previous-rpc-attempts", aVar);
        B = new c0.b("grpc-retry-pushback-ms", aVar);
        C = tr.i0.f.g("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public v2(tr.d0<ReqT, ?> d0Var, tr.c0 c0Var, s sVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, x2 x2Var, w0 w0Var, a0 a0Var) {
        boolean z10;
        this.f36019a = d0Var;
        this.f36027j = sVar;
        this.f36028k = j10;
        this.f36029l = j11;
        this.f36020b = executor;
        this.f36022d = scheduledExecutorService;
        this.f36023e = c0Var;
        this.f = x2Var;
        if (x2Var != null) {
            this.f36040x = x2Var.f36119b;
        }
        this.f36024g = w0Var;
        if (x2Var != null && w0Var != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.s("Should not provide both retryPolicy and hedgingPolicy", z10);
        this.f36025h = w0Var != null;
        this.f36030m = a0Var;
    }

    public static void d(v2 v2Var, z zVar) {
        w2 q10 = v2Var.q(zVar);
        if (q10 != null) {
            q10.run();
        }
    }

    public static void f(v2 v2Var, Integer num) {
        v2Var.getClass();
        if (num != null) {
            if (num.intValue() < 0) {
                v2Var.u();
                return;
            }
            synchronized (v2Var.f36026i) {
                t tVar = v2Var.f36039w;
                if (tVar != null) {
                    tVar.f36069c = true;
                    Future<?> future = tVar.f36068b;
                    t tVar2 = new t(v2Var.f36026i);
                    v2Var.f36039w = tVar2;
                    if (future != null) {
                        future.cancel(false);
                    }
                    tVar2.a(v2Var.f36022d.schedule(new u(tVar2), num.intValue(), TimeUnit.MILLISECONDS));
                }
            }
        }
    }

    public final void A(ReqT reqt) {
        x xVar = this.f36032o;
        if (xVar.f36077a) {
            xVar.f.f36096a.b(this.f36019a.f33453d.b(reqt));
        } else {
            s(new m(reqt));
        }
    }

    @Override // vr.h3
    public final void a(tr.h hVar) {
        s(new c(hVar));
    }

    @Override // vr.h3
    public final void b(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // vr.h3
    public final void c() {
        s(new k());
    }

    @Override // vr.h3
    public final void e(int i6) {
        x xVar = this.f36032o;
        if (xVar.f36077a) {
            xVar.f.f36096a.e(i6);
        } else {
            s(new l(i6));
        }
    }

    @Override // vr.h3
    public final void flush() {
        x xVar = this.f36032o;
        if (xVar.f36077a) {
            xVar.f.f36096a.flush();
        } else {
            s(new f());
        }
    }

    @Override // vr.r
    public final void g(int i6) {
        s(new i(i6));
    }

    @Override // vr.r
    public final void h(int i6) {
        s(new j(i6));
    }

    @Override // vr.r
    public final void i(tr.m mVar) {
        s(new d(mVar));
    }

    @Override // vr.h3
    public final boolean isReady() {
        for (z zVar : this.f36032o.f36079c) {
            if (zVar.f36096a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // vr.r
    public final void j(b1 b1Var) {
        x xVar;
        synchronized (this.f36026i) {
            b1Var.c(this.f36031n, "closed");
            xVar = this.f36032o;
        }
        if (xVar.f != null) {
            b1 b1Var2 = new b1();
            xVar.f.f36096a.j(b1Var2);
            b1Var.c(b1Var2, "committed");
            return;
        }
        b1 b1Var3 = new b1();
        for (z zVar : xVar.f36079c) {
            b1 b1Var4 = new b1();
            zVar.f36096a.j(b1Var4);
            b1Var3.f35403b.add(String.valueOf(b1Var4));
        }
        b1Var.c(b1Var3, "open");
    }

    @Override // vr.r
    public final void k(tr.o oVar) {
        s(new e(oVar));
    }

    @Override // vr.r
    public final void l(String str) {
        s(new b(str));
    }

    @Override // vr.r
    public final void m() {
        s(new h());
    }

    @Override // vr.r
    public final void n(vr.s sVar) {
        t tVar;
        this.f36037u = sVar;
        tr.i0 y10 = y();
        if (y10 != null) {
            o(y10);
            return;
        }
        synchronized (this.f36026i) {
            this.f36032o.f36078b.add(new w());
        }
        boolean z10 = false;
        z r10 = r(0, false);
        if (r10 == null) {
            return;
        }
        if (this.f36025h) {
            synchronized (this.f36026i) {
                try {
                    this.f36032o = this.f36032o.a(r10);
                    if (v(this.f36032o)) {
                        a0 a0Var = this.f36030m;
                        if (a0Var != null) {
                            if (a0Var.f36046d.get() > a0Var.f36044b) {
                                z10 = true;
                            }
                            if (z10) {
                            }
                        }
                        tVar = new t(this.f36026i);
                        this.f36039w = tVar;
                    }
                    tVar = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (tVar != null) {
                tVar.a(this.f36022d.schedule(new u(tVar), this.f36024g.f36101b, TimeUnit.NANOSECONDS));
            }
        }
        t(r10);
    }

    @Override // vr.r
    public final void o(tr.i0 i0Var) {
        z zVar;
        z zVar2 = new z(0);
        zVar2.f36096a = new k2();
        w2 q10 = q(zVar2);
        if (q10 != null) {
            this.f36035s = i0Var;
            q10.run();
            if (this.r.addAndGet(LinearLayoutManager.INVALID_OFFSET) == Integer.MIN_VALUE) {
                z(i0Var, s.a.PROCESSED, new tr.c0());
                return;
            }
            return;
        }
        synchronized (this.f36026i) {
            if (this.f36032o.f36079c.contains(this.f36032o.f)) {
                zVar = this.f36032o.f;
            } else {
                this.f36041y = i0Var;
                zVar = null;
            }
            x xVar = this.f36032o;
            this.f36032o = new x(xVar.f36078b, xVar.f36079c, xVar.f36080d, xVar.f, true, xVar.f36077a, xVar.f36083h, xVar.f36081e);
        }
        if (zVar != null) {
            zVar.f36096a.o(i0Var);
        }
    }

    @Override // vr.r
    public final void p(boolean z10) {
        s(new g(z10));
    }

    public final w2 q(z zVar) {
        boolean z10;
        Collection emptyList;
        List<q> list;
        boolean z11;
        Future<?> future;
        Future<?> future2;
        synchronized (this.f36026i) {
            if (this.f36032o.f != null) {
                return null;
            }
            Collection<z> collection = this.f36032o.f36079c;
            x xVar = this.f36032o;
            if (xVar.f == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("Already committed", z10);
            if (xVar.f36079c.contains(zVar)) {
                list = null;
                emptyList = Collections.singleton(zVar);
                z11 = true;
            } else {
                emptyList = Collections.emptyList();
                list = xVar.f36078b;
                z11 = false;
            }
            this.f36032o = new x(list, emptyList, xVar.f36080d, zVar, xVar.f36082g, z11, xVar.f36083h, xVar.f36081e);
            this.f36027j.f36066a.addAndGet(-this.f36036t);
            t tVar = this.f36038v;
            if (tVar != null) {
                tVar.f36069c = true;
                future = tVar.f36068b;
                this.f36038v = null;
            } else {
                future = null;
            }
            t tVar2 = this.f36039w;
            if (tVar2 != null) {
                tVar2.f36069c = true;
                Future<?> future3 = tVar2.f36068b;
                this.f36039w = null;
                future2 = future3;
            } else {
                future2 = null;
            }
            return new w2(this, collection, zVar, future, future2);
        }
    }

    public final z r(int i6, boolean z10) {
        AtomicInteger atomicInteger;
        int i10;
        do {
            atomicInteger = this.r;
            i10 = atomicInteger.get();
            if (i10 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i10, i10 + 1));
        z zVar = new z(i6);
        n nVar = new n(new r(zVar));
        tr.c0 c0Var = new tr.c0();
        c0Var.d(this.f36023e);
        if (i6 > 0) {
            c0Var.f(A, String.valueOf(i6));
        }
        zVar.f36096a = w(c0Var, nVar, i6, z10);
        return zVar;
    }

    public final void s(q qVar) {
        Collection<z> collection;
        synchronized (this.f36026i) {
            if (!this.f36032o.f36077a) {
                this.f36032o.f36078b.add(qVar);
            }
            collection = this.f36032o.f36079c;
        }
        for (z zVar : collection) {
            qVar.a(zVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        r8.f36021c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        r0 = r9.f36096a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r8.f36032o.f != r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        r9 = r8.f36041y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        r9 = vr.v2.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r0.o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        r4 = (vr.v2.q) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        if ((r4 instanceof vr.v2.w) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r0 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = r8.f36032o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
        if (r4.f36082g == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(z zVar) {
        int min;
        boolean z10 = false;
        o oVar = null;
        ArrayList arrayList = null;
        int i6 = 0;
        while (true) {
            synchronized (this.f36026i) {
                x xVar = this.f36032o;
                if (z10) {
                    z zVar2 = xVar.f;
                    if (zVar2 == null || zVar2 == zVar) {
                        if (xVar.f36082g) {
                        }
                    }
                }
                if (i6 == xVar.f36078b.size()) {
                    this.f36032o = xVar.e(zVar);
                    if (!isReady()) {
                        return;
                    }
                    oVar = new o();
                } else if (zVar.f36097b) {
                    return;
                } else {
                    min = Math.min(i6 + 128, xVar.f36078b.size());
                    if (arrayList == null) {
                        arrayList = new ArrayList(xVar.f36078b.subList(i6, min));
                    } else {
                        arrayList.clear();
                        arrayList.addAll(xVar.f36078b.subList(i6, min));
                    }
                }
            }
            i6 = min;
        }
    }

    public final void u() {
        Future<?> future;
        synchronized (this.f36026i) {
            t tVar = this.f36039w;
            future = null;
            if (tVar != null) {
                tVar.f36069c = true;
                Future<?> future2 = tVar.f36068b;
                this.f36039w = null;
                future = future2;
            }
            x xVar = this.f36032o;
            if (!xVar.f36083h) {
                xVar = new x(xVar.f36078b, xVar.f36079c, xVar.f36080d, xVar.f, xVar.f36082g, xVar.f36077a, true, xVar.f36081e);
            }
            this.f36032o = xVar;
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(x xVar) {
        if (xVar.f == null) {
            if (xVar.f36081e < this.f36024g.f36100a && !xVar.f36083h) {
                return true;
            }
        }
        return false;
    }

    public abstract vr.r w(tr.c0 c0Var, n nVar, int i6, boolean z10);

    public abstract void x();

    public abstract tr.i0 y();

    public final void z(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
        this.f36021c.execute(new p(i0Var, aVar, c0Var));
    }
}

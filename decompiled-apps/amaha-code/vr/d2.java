package vr;

import io.grpc.n;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vr.j0;
import vr.u0;
import wr.e;
/* compiled from: ManagedChannelImplBuilder.java */
/* loaded from: classes2.dex */
public final class d2 extends io.grpc.k<d2> {

    /* renamed from: a  reason: collision with root package name */
    public final e3 f35495a;

    /* renamed from: b  reason: collision with root package name */
    public final e3 f35496b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f35497c;

    /* renamed from: d  reason: collision with root package name */
    public final n.a f35498d;

    /* renamed from: e  reason: collision with root package name */
    public final String f35499e;
    public final tr.a f;

    /* renamed from: g  reason: collision with root package name */
    public final String f35500g;

    /* renamed from: h  reason: collision with root package name */
    public final tr.o f35501h;

    /* renamed from: i  reason: collision with root package name */
    public final tr.i f35502i;

    /* renamed from: j  reason: collision with root package name */
    public final long f35503j;

    /* renamed from: k  reason: collision with root package name */
    public final int f35504k;

    /* renamed from: l  reason: collision with root package name */
    public final int f35505l;

    /* renamed from: m  reason: collision with root package name */
    public final long f35506m;

    /* renamed from: n  reason: collision with root package name */
    public final long f35507n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f35508o;

    /* renamed from: p  reason: collision with root package name */
    public final tr.u f35509p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f35510q;
    public final boolean r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f35511s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f35512t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f35513u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f35514v;

    /* renamed from: w  reason: collision with root package name */
    public final b f35515w;

    /* renamed from: x  reason: collision with root package name */
    public final a f35516x;

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f35493y = Logger.getLogger(d2.class.getName());

    /* renamed from: z  reason: collision with root package name */
    public static final long f35494z = TimeUnit.MINUTES.toMillis(30);
    public static final long A = TimeUnit.SECONDS.toMillis(1);
    public static final e3 B = new e3(u0.f35987p);
    public static final tr.o C = tr.o.f33539d;
    public static final tr.i D = tr.i.f33478b;

    /* compiled from: ManagedChannelImplBuilder.java */
    /* loaded from: classes2.dex */
    public interface a {
        int a();
    }

    /* compiled from: ManagedChannelImplBuilder.java */
    /* loaded from: classes2.dex */
    public interface b {
        e.d a();
    }

    public d2(String str, e.c cVar, e.b bVar) {
        io.grpc.n nVar;
        e3 e3Var = B;
        this.f35495a = e3Var;
        this.f35496b = e3Var;
        this.f35497c = new ArrayList();
        Logger logger = io.grpc.n.f20496e;
        synchronized (io.grpc.n.class) {
            if (io.grpc.n.f == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(i0.class);
                } catch (ClassNotFoundException e10) {
                    io.grpc.n.f20496e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
                }
                List<io.grpc.m> a10 = io.grpc.p.a(io.grpc.m.class, Collections.unmodifiableList(arrayList), io.grpc.m.class.getClassLoader(), new n.b());
                if (a10.isEmpty()) {
                    io.grpc.n.f20496e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                io.grpc.n.f = new io.grpc.n();
                for (io.grpc.m mVar : a10) {
                    Logger logger2 = io.grpc.n.f20496e;
                    logger2.fine("Service loader found " + mVar);
                    io.grpc.n.f.a(mVar);
                }
                io.grpc.n.f.b();
            }
            nVar = io.grpc.n.f;
        }
        this.f35498d = nVar.f20497a;
        this.f35500g = "pick_first";
        this.f35501h = C;
        this.f35502i = D;
        this.f35503j = f35494z;
        this.f35504k = 5;
        this.f35505l = 5;
        this.f35506m = 16777216L;
        this.f35507n = 1048576L;
        this.f35508o = true;
        this.f35509p = tr.u.f33582e;
        this.f35510q = true;
        this.r = true;
        this.f35511s = true;
        this.f35512t = true;
        this.f35513u = true;
        this.f35514v = true;
        sc.b.w(str, "target");
        this.f35499e = str;
        this.f = null;
        this.f35515w = cVar;
        this.f35516x = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.grpc.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tr.b0 a() {
        tr.d dVar;
        e.d a10 = this.f35515w.a();
        j0.a aVar = new j0.a();
        e3 e3Var = new e3(u0.f35987p);
        u0.d dVar2 = u0.r;
        ArrayList arrayList = new ArrayList(this.f35497c);
        synchronized (tr.r.class) {
        }
        tr.d dVar3 = null;
        if (this.r) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                dVar = (tr.d) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f35511s), Boolean.valueOf(this.f35512t), Boolean.FALSE, Boolean.valueOf(this.f35513u));
            } catch (ClassNotFoundException e10) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
                dVar = null;
                if (dVar != null) {
                }
                if (this.f35514v) {
                }
                return new e2(new q1(this, a10, aVar, e3Var, dVar2, arrayList));
            } catch (IllegalAccessException e11) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                dVar = null;
                if (dVar != null) {
                }
                if (this.f35514v) {
                }
                return new e2(new q1(this, a10, aVar, e3Var, dVar2, arrayList));
            } catch (NoSuchMethodException e12) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
                dVar = null;
                if (dVar != null) {
                }
                if (this.f35514v) {
                }
                return new e2(new q1(this, a10, aVar, e3Var, dVar2, arrayList));
            } catch (InvocationTargetException e13) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
                dVar = null;
                if (dVar != null) {
                }
                if (this.f35514v) {
                }
                return new e2(new q1(this, a10, aVar, e3Var, dVar2, arrayList));
            }
            if (dVar != null) {
                arrayList.add(0, dVar);
            }
        }
        if (this.f35514v) {
            try {
                dVar3 = (tr.d) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException e14) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
            } catch (IllegalAccessException e15) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
            } catch (NoSuchMethodException e16) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e16);
            } catch (InvocationTargetException e17) {
                f35493y.log(Level.FINE, "Unable to apply census stats", (Throwable) e17);
            }
            if (dVar3 != null) {
                arrayList.add(0, dVar3);
            }
        }
        return new e2(new q1(this, a10, aVar, e3Var, dVar2, arrayList));
    }
}

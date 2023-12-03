package vr;

import com.google.common.base.VerifyException;
import com.theinnerhour.b2b.utils.SessionManager;
import io.grpc.l;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import vr.c3;
import vr.k1;
import vr.u0;
/* compiled from: DnsNameResolver.java */
/* loaded from: classes2.dex */
public final class h0 extends io.grpc.l {

    /* renamed from: s  reason: collision with root package name */
    public static final Logger f35646s;

    /* renamed from: t  reason: collision with root package name */
    public static final Set<String> f35647t;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f35648u;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f35649v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f35650w;

    /* renamed from: x  reason: collision with root package name */
    public static final e f35651x;

    /* renamed from: y  reason: collision with root package name */
    public static String f35652y;

    /* renamed from: a  reason: collision with root package name */
    public final tr.g0 f35653a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f35654b = new Random();

    /* renamed from: c  reason: collision with root package name */
    public volatile b f35655c = b.f35672u;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<d> f35656d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final String f35657e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final int f35658g;

    /* renamed from: h  reason: collision with root package name */
    public final c3.c<Executor> f35659h;

    /* renamed from: i  reason: collision with root package name */
    public final long f35660i;

    /* renamed from: j  reason: collision with root package name */
    public final tr.l0 f35661j;

    /* renamed from: k  reason: collision with root package name */
    public final nc.l f35662k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f35663l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f35664m;

    /* renamed from: n  reason: collision with root package name */
    public Executor f35665n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f35666o;

    /* renamed from: p  reason: collision with root package name */
    public final l.f f35667p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f35668q;
    public l.d r;

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public tr.i0 f35669a;

        /* renamed from: b  reason: collision with root package name */
        public List<io.grpc.d> f35670b;

        /* renamed from: c  reason: collision with root package name */
        public l.b f35671c;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: u  reason: collision with root package name */
        public static final b f35672u;

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ b[] f35673v;

        static {
            b bVar = new b();
            f35672u = bVar;
            f35673v = new b[]{bVar};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f35673v.clone();
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public final class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final l.d f35674u;

        /* compiled from: DnsNameResolver.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ boolean f35676u;

            public a(boolean z10) {
                this.f35676u = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f35676u;
                c cVar = c.this;
                if (z10) {
                    h0 h0Var = h0.this;
                    h0Var.f35663l = true;
                    if (h0Var.f35660i > 0) {
                        nc.l lVar = h0Var.f35662k;
                        lVar.f26011b = false;
                        lVar.b();
                    }
                }
                h0.this.f35668q = false;
            }
        }

        public c(l.d dVar) {
            sc.b.w(dVar, "savedListener");
            this.f35674u = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar;
            IOException e10;
            a aVar2;
            tr.l0 l0Var;
            io.grpc.d dVar;
            io.grpc.a aVar3;
            a aVar4;
            List<io.grpc.d> list;
            l.d dVar2 = this.f35674u;
            Logger logger = h0.f35646s;
            Level level = Level.FINER;
            boolean isLoggable = logger.isLoggable(level);
            h0 h0Var = h0.this;
            if (isLoggable) {
                logger.finer("Attempting DNS resolution of " + h0Var.f);
            }
            boolean z10 = false;
            a aVar5 = null;
            r7 = null;
            l.b bVar = null;
            a aVar6 = null;
            try {
                try {
                    tr.f0 a10 = h0Var.f35653a.a(InetSocketAddress.createUnresolved(h0Var.f, h0Var.f35658g));
                    if (a10 != null) {
                        dVar = new io.grpc.d(a10);
                    } else {
                        dVar = null;
                    }
                    List<io.grpc.d> emptyList = Collections.emptyList();
                    aVar3 = io.grpc.a.f20426b;
                    l0Var = h0Var.f35661j;
                    if (dVar != null) {
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + dVar);
                        }
                        list = Collections.singletonList(dVar);
                        aVar4 = null;
                    } else {
                        aVar = h0Var.e();
                        try {
                            tr.i0 i0Var = aVar.f35669a;
                            if (i0Var != null) {
                                dVar2.a(i0Var);
                                if (aVar.f35669a == null) {
                                    z10 = true;
                                }
                                l0Var.execute(new a(z10));
                                return;
                            }
                            List<io.grpc.d> list2 = aVar.f35670b;
                            if (list2 != null) {
                                emptyList = list2;
                            }
                            l.b bVar2 = aVar.f35671c;
                            if (bVar2 != null) {
                                bVar = bVar2;
                            }
                            aVar4 = aVar;
                            list = emptyList;
                        } catch (IOException e11) {
                            e10 = e11;
                            aVar5 = aVar;
                            dVar2.a(tr.i0.f33488m.g("Unable to resolve host " + h0Var.f).f(e10));
                            if (aVar5 != null && aVar5.f35669a == null) {
                                z10 = true;
                            }
                            aVar2 = new a(z10);
                            l0Var = h0Var.f35661j;
                            l0Var.execute(aVar2);
                        } catch (Throwable th2) {
                            th = th2;
                            if (aVar != null && aVar.f35669a == null) {
                                z10 = true;
                            }
                            h0Var.f35661j.execute(new a(z10));
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
            try {
                dVar2.b(new l.e(list, aVar3, bVar));
                if (aVar4 != null && aVar4.f35669a == null) {
                    z10 = true;
                }
                aVar2 = new a(z10);
            } catch (IOException e13) {
                e = e13;
                aVar5 = aVar4;
                e10 = e;
                dVar2.a(tr.i0.f33488m.g("Unable to resolve host " + h0Var.f).f(e10));
                if (aVar5 != null) {
                    z10 = true;
                }
                aVar2 = new a(z10);
                l0Var = h0Var.f35661j;
                l0Var.execute(aVar2);
            } catch (Throwable th4) {
                th = th4;
                aVar6 = aVar4;
                aVar = aVar6;
                if (aVar != null) {
                    z10 = true;
                }
                h0Var.f35661j.execute(new a(z10));
                throw th;
            }
            l0Var.execute(aVar2);
        }
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public interface d {
        List<String> a(String str);
    }

    /* compiled from: DnsNameResolver.java */
    /* loaded from: classes2.dex */
    public interface e {
        k1.b a();

        Throwable b();
    }

    static {
        e eVar;
        Logger logger = Logger.getLogger(h0.class.getName());
        f35646s = logger;
        f35647t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f35648u = Boolean.parseBoolean(property);
        f35649v = Boolean.parseBoolean(property2);
        f35650w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    eVar = (e) Class.forName("vr.k1", true, h0.class.getClassLoader()).asSubclass(e.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
            }
        } catch (ClassCastException e12) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
        } catch (ClassNotFoundException e13) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
        }
        if (eVar.b() != null) {
            logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", eVar.b());
            eVar = null;
        }
        f35651x = eVar;
    }

    public h0(String str, l.a aVar, u0.b bVar, nc.l lVar, boolean z10) {
        boolean z11;
        sc.b.w(aVar, "args");
        this.f35659h = bVar;
        sc.b.w(str, SessionManager.KEY_NAME);
        URI create = URI.create("//".concat(str));
        if (create.getHost() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.m(str, "Invalid DNS name: %s", z11);
        String authority = create.getAuthority();
        if (authority != null) {
            this.f35657e = authority;
            this.f = create.getHost();
            if (create.getPort() == -1) {
                this.f35658g = aVar.f20484a;
            } else {
                this.f35658g = create.getPort();
            }
            tr.g0 g0Var = aVar.f20485b;
            sc.b.w(g0Var, "proxyDetector");
            this.f35653a = g0Var;
            long j10 = 0;
            if (!z10) {
                String property = System.getProperty("networkaddress.cache.ttl");
                long j11 = 30;
                if (property != null) {
                    try {
                        j11 = Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                        f35646s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                    }
                }
                if (j11 > 0) {
                    j10 = TimeUnit.SECONDS.toNanos(j11);
                } else {
                    j10 = j11;
                }
            }
            this.f35660i = j10;
            this.f35662k = lVar;
            tr.l0 l0Var = aVar.f20486c;
            sc.b.w(l0Var, "syncContext");
            this.f35661j = l0Var;
            Executor executor = aVar.f20489g;
            this.f35665n = executor;
            this.f35666o = executor == null;
            l.f fVar = aVar.f20487d;
            sc.b.w(fVar, "serviceConfigParser");
            this.f35667p = fVar;
            return;
        }
        throw new NullPointerException(kotlin.jvm.internal.h.P("nameUri (%s) doesn't have an authority", create));
    }

    public static Map<String, ?> f(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            f6.b.U0(entry, "Bad key: %s", f35647t.contains(entry.getKey()));
        }
        List c10 = m1.c("clientLanguage", map);
        if (c10 != null && !c10.isEmpty()) {
            Iterator it = c10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase((String) it.next())) {
                        z12 = true;
                        break;
                    }
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                return null;
            }
        }
        Double d10 = m1.d("percentage", map);
        if (d10 != null) {
            int intValue = d10.intValue();
            if (intValue >= 0 && intValue <= 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            f6.b.U0(d10, "Bad percentage: %s", z11);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List c11 = m1.c("clientHostname", map);
        if (c11 != null && !c11.isEmpty()) {
            Iterator it2 = c11.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((String) it2.next()).equals(str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
        }
        Map<String, ?> f = m1.f("serviceConfig", map);
        if (f != null) {
            return f;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.startsWith("grpc_config=")) {
                f35646s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                String substring = str.substring(12);
                Logger logger = l1.f35761a;
                yf.a aVar = new yf.a(new StringReader(substring));
                try {
                    Object a10 = l1.a(aVar);
                    if (a10 instanceof List) {
                        List list2 = (List) a10;
                        m1.a(list2);
                        arrayList.addAll(list2);
                    } else {
                        throw new ClassCastException("wrong type " + a10);
                    }
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e10) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e10);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // io.grpc.l
    public final String a() {
        return this.f35657e;
    }

    @Override // io.grpc.l
    public final void b() {
        boolean z10;
        if (this.r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("not started", z10);
        h();
    }

    @Override // io.grpc.l
    public final void c() {
        if (this.f35664m) {
            return;
        }
        this.f35664m = true;
        Executor executor = this.f35665n;
        if (executor != null && this.f35666o) {
            c3.b(this.f35659h, executor);
            this.f35665n = null;
        }
    }

    @Override // io.grpc.l
    public final void d(l.d dVar) {
        boolean z10;
        if (this.r == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("already started", z10);
        if (this.f35666o) {
            this.f35665n = (Executor) c3.a(this.f35659h);
        }
        this.r = dVar;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a e() {
        boolean z10;
        d dVar;
        e eVar;
        l.b bVar;
        boolean z11;
        String str = this.f;
        a aVar = new a();
        try {
            aVar.f35670b = i();
            if (f35650w) {
                List<String> emptyList = Collections.emptyList();
                if (f35648u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z10 = f35649v;
                    } else if (!str.contains(":")) {
                        boolean z12 = true;
                        for (int i6 = 0; i6 < str.length(); i6++) {
                            char charAt = str.charAt(i6);
                            if (charAt != '.') {
                                if (charAt >= '0' && charAt <= '9') {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 &= z11;
                            }
                        }
                        z10 = !z12;
                    }
                    l.b bVar2 = null;
                    if (z10) {
                        dVar = null;
                    } else {
                        dVar = this.f35656d.get();
                        if (dVar == null && (eVar = f35651x) != null) {
                            dVar = eVar.a();
                        }
                    }
                    Logger logger = f35646s;
                    if (dVar != null) {
                        try {
                            emptyList = dVar.a("_grpc_config." + str);
                        } catch (Exception e10) {
                            logger.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
                        }
                    }
                    if (emptyList.isEmpty()) {
                        Random random = this.f35654b;
                        if (f35652y == null) {
                            try {
                                f35652y = InetAddress.getLocalHost().getHostName();
                            } catch (UnknownHostException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                        String str2 = f35652y;
                        try {
                            Iterator it = g(emptyList).iterator();
                            Map<String, ?> map = null;
                            while (it.hasNext()) {
                                try {
                                    map = f((Map) it.next(), random, str2);
                                    if (map != null) {
                                        break;
                                    }
                                } catch (RuntimeException e12) {
                                    bVar = new l.b(tr.i0.f33482g.g("failed to pick service config choice").f(e12));
                                }
                            }
                            if (map == null) {
                                bVar = null;
                            } else {
                                bVar = new l.b(map);
                            }
                        } catch (IOException | RuntimeException e13) {
                            bVar = new l.b(tr.i0.f33482g.g("failed to parse TXT records").f(e13));
                        }
                        if (bVar != null) {
                            tr.i0 i0Var = bVar.f20491a;
                            bVar2 = i0Var != null ? new l.b(i0Var) : this.f35667p.a((Map) bVar.f20492b);
                        }
                    } else {
                        logger.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                    }
                    aVar.f35671c = bVar2;
                }
                z10 = false;
                l.b bVar22 = null;
                if (z10) {
                }
                Logger logger2 = f35646s;
                if (dVar != null) {
                }
                if (emptyList.isEmpty()) {
                }
                aVar.f35671c = bVar22;
            }
            return aVar;
        } catch (Exception e14) {
            aVar.f35669a = tr.i0.f33488m.g("Unable to resolve host " + str).f(e14);
            return aVar;
        }
    }

    public final void h() {
        boolean z10;
        long j10;
        int i6;
        if (!this.f35668q && !this.f35664m) {
            if (this.f35663l && (this.f35660i) != 0 && (i6 <= 0 || this.f35662k.a(TimeUnit.NANOSECONDS) <= j10)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f35668q = true;
                this.f35665n.execute(new c(this.r));
            }
        }
    }

    public final List<io.grpc.d> i() {
        try {
            try {
                b bVar = this.f35655c;
                String str = this.f;
                bVar.getClass();
                List<InetAddress> unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                for (InetAddress inetAddress : unmodifiableList) {
                    arrayList.add(new io.grpc.d(new InetSocketAddress(inetAddress, this.f35658g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e10) {
                Object obj = nc.n.f26014a;
                if (!(e10 instanceof RuntimeException)) {
                    if (!(e10 instanceof Error)) {
                        throw new RuntimeException(e10);
                    }
                    throw ((Error) e10);
                }
                throw ((RuntimeException) e10);
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                f35646s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th2;
        }
    }
}

package vr;

import io.grpc.b;
import io.grpc.c;
import io.grpc.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.b;
import tr.c0;
import tr.i0;
import tr.y;
import vr.c3;
import vr.s;
/* compiled from: GrpcUtil.java */
/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f35973a = Logger.getLogger(u0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Set<i0.a> f35974b = Collections.unmodifiableSet(EnumSet.of(i0.a.OK, i0.a.INVALID_ARGUMENT, i0.a.NOT_FOUND, i0.a.ALREADY_EXISTS, i0.a.FAILED_PRECONDITION, i0.a.ABORTED, i0.a.OUT_OF_RANGE, i0.a.DATA_LOSS));

    /* renamed from: c  reason: collision with root package name */
    public static final c0.b f35975c;

    /* renamed from: d  reason: collision with root package name */
    public static final c0.b f35976d;

    /* renamed from: e  reason: collision with root package name */
    public static final c0.f f35977e;
    public static final c0.b f;

    /* renamed from: g  reason: collision with root package name */
    public static final c0.f f35978g;

    /* renamed from: h  reason: collision with root package name */
    public static final c0.b f35979h;

    /* renamed from: i  reason: collision with root package name */
    public static final c0.b f35980i;

    /* renamed from: j  reason: collision with root package name */
    public static final c0.b f35981j;

    /* renamed from: k  reason: collision with root package name */
    public static final c0.b f35982k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f35983l;

    /* renamed from: m  reason: collision with root package name */
    public static final q2 f35984m;

    /* renamed from: n  reason: collision with root package name */
    public static final b.C0308b<Boolean> f35985n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f35986o;

    /* renamed from: p  reason: collision with root package name */
    public static final b f35987p;

    /* renamed from: q  reason: collision with root package name */
    public static final c f35988q;
    public static final d r;

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public class a extends io.grpc.c {
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public class b implements c3.c<Executor> {
        @Override // vr.c3.c
        public final Executor a() {
            return Executors.newCachedThreadPool(u0.d("grpc-default-executor-%d"));
        }

        @Override // vr.c3.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public class c implements c3.c<ScheduledExecutorService> {
        @Override // vr.c3.c
        public final ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, u0.d("grpc-timer-%d"));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }

        @Override // vr.c3.c
        public final void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public class d implements nc.m<nc.l> {
        @Override // nc.m
        public final nc.l get() {
            return new nc.l();
        }
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public class e implements t {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f35989a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f35990b;

        public e(c.a aVar, t tVar) {
            this.f35989a = aVar;
            this.f35990b = tVar;
        }

        @Override // vr.t
        public final r f(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            boolean z10;
            io.grpc.b bVar2 = io.grpc.b.f20431k;
            sc.b.w(bVar, "callOptions cannot be null");
            io.grpc.c a10 = this.f35989a.a();
            if (cVarArr[cVarArr.length - 1] == u0.f35986o) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("lb tracer already assigned", z10);
            cVarArr[cVarArr.length - 1] = a10;
            return this.f35990b.f(d0Var, c0Var, bVar, cVarArr);
        }

        @Override // tr.v
        public final tr.w g() {
            return this.f35990b.g();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF0 uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: w  reason: collision with root package name */
        public static final g f35991w;

        /* renamed from: x  reason: collision with root package name */
        public static final g[] f35992x;

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ g[] f35993y;

        /* renamed from: u  reason: collision with root package name */
        public final int f35994u;

        /* renamed from: v  reason: collision with root package name */
        public final tr.i0 f35995v;
        /* JADX INFO: Fake field, exist only in values array */
        g EF0;

        static {
            g[] values;
            tr.i0 i0Var = tr.i0.f33488m;
            g gVar = new g("NO_ERROR", 0, 0, i0Var);
            tr.i0 i0Var2 = tr.i0.f33487l;
            g gVar2 = new g("PROTOCOL_ERROR", 1, 1, i0Var2);
            g gVar3 = new g("INTERNAL_ERROR", 2, 2, i0Var2);
            f35991w = gVar3;
            f35993y = new g[]{gVar, gVar2, gVar3, new g("FLOW_CONTROL_ERROR", 3, 3, i0Var2), new g("SETTINGS_TIMEOUT", 4, 4, i0Var2), new g("STREAM_CLOSED", 5, 5, i0Var2), new g("FRAME_SIZE_ERROR", 6, 6, i0Var2), new g("REFUSED_STREAM", 7, 7, i0Var), new g("CANCEL", 8, 8, tr.i0.f), new g("COMPRESSION_ERROR", 9, 9, i0Var2), new g("CONNECT_ERROR", 10, 10, i0Var2), new g("ENHANCE_YOUR_CALM", 11, 11, tr.i0.f33486k.g("Bandwidth exhausted")), new g("INADEQUATE_SECURITY", 12, 12, tr.i0.f33484i.g("Permission denied as protocol is not secure enough to call")), new g("HTTP_1_1_REQUIRED", 13, 13, tr.i0.f33482g)};
            g[] gVarArr = new g[values[values.length - 1].f35994u + 1];
            for (g gVar4 : values()) {
                gVarArr[gVar4.f35994u] = gVar4;
            }
            f35992x = gVarArr;
        }

        public g(String str, int i6, int i10, tr.i0 i0Var) {
            this.f35994u = i10;
            String str2 = "HTTP/2 error code: " + name();
            this.f35995v = i0Var.g(i0Var.f33492b != null ? r1.b0.b(v.g.d(str2, " ("), i0Var.f33492b, ")") : str2);
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f35993y.clone();
        }
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public static class h implements c0.c<Long> {
        @Override // tr.c0.c
        public final String a(Serializable serializable) {
            Long l2 = (Long) serializable;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l2.longValue() >= 0) {
                if (l2.longValue() < 100000000) {
                    return l2 + "n";
                } else if (l2.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l2.longValue()) + "u";
                } else if (l2.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l2.longValue()) + "m";
                } else if (l2.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l2.longValue()) + "S";
                } else if (l2.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l2.longValue()) + "M";
                } else {
                    return timeUnit.toHours(l2.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }

        @Override // tr.c0.c
        public final Long b(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.s("empty timeout", z10);
            if (str.length() <= 9) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.s("bad timeout format", z11);
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt != 'H') {
                if (charAt != 'M') {
                    if (charAt != 'S') {
                        if (charAt != 'u') {
                            if (charAt != 'm') {
                                if (charAt == 'n') {
                                    return Long.valueOf(parseLong);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
    }

    static {
        Charset.forName("US-ASCII");
        f35975c = new c0.b("grpc-timeout", new h());
        c0.a aVar = tr.c0.f33440d;
        f35976d = new c0.b("grpc-encoding", aVar);
        f35977e = tr.y.a("grpc-accept-encoding", new f());
        f = new c0.b("content-encoding", aVar);
        f35978g = tr.y.a("accept-encoding", new f());
        f35979h = new c0.b("content-length", aVar);
        f35980i = new c0.b("content-type", aVar);
        f35981j = new c0.b("te", aVar);
        f35982k = new c0.b("user-agent", aVar);
        nc.k.a(',');
        b.e.f25985w.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f35983l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f35984m = new q2();
        f35985n = new b.C0308b<>("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f35986o = new a();
        f35987p = new b();
        f35988q = new c();
        r = new d();
    }

    public static URI a(String str) {
        sc.b.w(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e10);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f35973a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static io.grpc.c[] c(io.grpc.b bVar, tr.c0 c0Var, int i6, boolean z10) {
        List<c.a> list = bVar.f20437g;
        int size = list.size() + 1;
        io.grpc.c[] cVarArr = new io.grpc.c[size];
        io.grpc.b bVar2 = io.grpc.b.f20431k;
        for (int i10 = 0; i10 < list.size(); i10++) {
            cVarArr[i10] = list.get(i10).a();
        }
        cVarArr[size - 1] = f35986o;
        return cVarArr;
    }

    public static rc.c d(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new rc.c(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    public static t e(h.d dVar, boolean z10) {
        g2 g2Var;
        h.g gVar = dVar.f20471a;
        if (gVar != null) {
            g2Var = ((l3) gVar.d()).a();
        } else {
            g2Var = null;
        }
        if (g2Var != null) {
            c.a aVar = dVar.f20472b;
            if (aVar == null) {
                return g2Var;
            }
            return new e(aVar, g2Var);
        }
        tr.i0 i0Var = dVar.f20473c;
        if (!i0Var.e()) {
            if (dVar.f20474d) {
                return new l0(g(i0Var), s.a.DROPPED);
            }
            if (!z10) {
                return new l0(g(i0Var), s.a.PROCESSED);
            }
        }
        return null;
    }

    public static tr.i0 f(int i6) {
        i0.a aVar;
        if (i6 >= 100 && i6 < 200) {
            aVar = i0.a.INTERNAL;
        } else {
            if (i6 != 400) {
                if (i6 != 401) {
                    if (i6 != 403) {
                        if (i6 != 404) {
                            if (i6 != 429) {
                                if (i6 != 431) {
                                    switch (i6) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            aVar = i0.a.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            aVar = i0.a.UNAVAILABLE;
                        } else {
                            aVar = i0.a.UNIMPLEMENTED;
                        }
                    } else {
                        aVar = i0.a.PERMISSION_DENIED;
                    }
                } else {
                    aVar = i0.a.UNAUTHENTICATED;
                }
            }
            aVar = i0.a.INTERNAL;
        }
        tr.i0 d10 = aVar.d();
        return d10.g("HTTP status code " + i6);
    }

    public static tr.i0 g(tr.i0 i0Var) {
        boolean z10;
        if (i0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.t(z10);
        if (f35974b.contains(i0Var.f33491a)) {
            tr.i0 i0Var2 = tr.i0.f33487l;
            return i0Var2.g("Inappropriate status code from control plane: " + i0Var.f33491a + " " + i0Var.f33492b).f(i0Var.f33493c);
        }
        return i0Var;
    }

    /* compiled from: GrpcUtil.java */
    /* loaded from: classes2.dex */
    public static final class f implements y.a<byte[]> {
        @Override // tr.c0.g
        public final byte[] a(Serializable serializable) {
            return (byte[]) serializable;
        }

        @Override // tr.c0.g
        public final Object b(byte[] bArr) {
            return bArr;
        }
    }
}

package wr;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import io.grpc.StatusException;
import io.grpc.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import nc.f;
import ta.v;
import tr.c0;
import tr.d0;
import tr.h0;
import tr.i0;
import tr.s;
import tr.u;
import vr.a1;
import vr.a3;
import vr.g2;
import vr.g3;
import vr.m3;
import vr.n1;
import vr.r;
import vr.s;
import vr.t0;
import vr.u0;
import vr.w;
import vr.z0;
import wr.a;
import wr.b;
import wr.e;
import wr.h;
import wr.o;
import yr.b;
import yr.f;
import zr.a;
import zr.b;
import zv.a0;
import zv.t;
import zv.z;
/* compiled from: OkHttpClientTransport.java */
/* loaded from: classes2.dex */
public final class i implements w, b.a, o.c {
    public static final Map<yr.a, i0> S;
    public static final Logger T;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public final HostnameVerifier C;
    public int D;
    public final LinkedList E;
    public final xr.b F;
    public n1 G;
    public boolean H;
    public long I;
    public long J;
    public boolean K;
    public final Runnable L;
    public final int M;
    public final boolean N;
    public final m3 O;
    public final a P;
    public final s Q;
    public final int R;

    /* renamed from: a  reason: collision with root package name */
    public final InetSocketAddress f37131a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37132b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37133c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f37134d;

    /* renamed from: e  reason: collision with root package name */
    public final nc.m<nc.l> f37135e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final yr.h f37136g;

    /* renamed from: h  reason: collision with root package name */
    public g2.a f37137h;

    /* renamed from: i  reason: collision with root package name */
    public wr.b f37138i;

    /* renamed from: j  reason: collision with root package name */
    public o f37139j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f37140k;

    /* renamed from: l  reason: collision with root package name */
    public final tr.w f37141l;

    /* renamed from: m  reason: collision with root package name */
    public int f37142m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f37143n;

    /* renamed from: o  reason: collision with root package name */
    public final Executor f37144o;

    /* renamed from: p  reason: collision with root package name */
    public final a3 f37145p;

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledExecutorService f37146q;
    public final int r;

    /* renamed from: s  reason: collision with root package name */
    public int f37147s;

    /* renamed from: t  reason: collision with root package name */
    public d f37148t;

    /* renamed from: u  reason: collision with root package name */
    public io.grpc.a f37149u;

    /* renamed from: v  reason: collision with root package name */
    public i0 f37150v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f37151w;

    /* renamed from: x  reason: collision with root package name */
    public a1 f37152x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f37153y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f37154z;

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class a extends g3.f {
        public a() {
        }

        @Override // g3.f
        public final void a() {
            i.this.f37137h.d(true);
        }

        @Override // g3.f
        public final void b() {
            i.this.f37137h.d(false);
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.getClass();
            i iVar = i.this;
            iVar.f37144o.execute(iVar.f37148t);
            synchronized (i.this.f37140k) {
                i iVar2 = i.this;
                iVar2.D = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                iVar2.u();
            }
            i.this.getClass();
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class d implements b.a, Runnable {

        /* renamed from: v  reason: collision with root package name */
        public final yr.b f37161v;

        /* renamed from: u  reason: collision with root package name */
        public final j f37160u = new j(Level.FINE);

        /* renamed from: w  reason: collision with root package name */
        public boolean f37162w = true;

        public d(yr.b bVar) {
            this.f37161v = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar;
            i0 i0Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (((f.c) this.f37161v).a(this)) {
                try {
                    n1 n1Var = i.this.G;
                    if (n1Var != null) {
                        n1Var.a();
                    }
                } catch (Throwable th2) {
                    try {
                        i iVar2 = i.this;
                        yr.a aVar = yr.a.PROTOCOL_ERROR;
                        i0 f = i0.f33487l.g("error in frame handler").f(th2);
                        Map<yr.a, i0> map = i.S;
                        iVar2.t(0, aVar, f);
                        try {
                            ((f.c) this.f37161v).close();
                        } catch (IOException e10) {
                            i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e10);
                        }
                        iVar = i.this;
                    } catch (Throwable th3) {
                        try {
                            ((f.c) this.f37161v).close();
                        } catch (IOException e11) {
                            i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                        }
                        i.this.f37137h.b();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (i.this.f37140k) {
                i0Var = i.this.f37150v;
            }
            if (i0Var == null) {
                i0Var = i0.f33488m.g("End of stream or IOException");
            }
            i.this.t(0, yr.a.INTERNAL_ERROR, i0Var);
            try {
                ((f.c) this.f37161v).close();
            } catch (IOException e12) {
                i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
            }
            iVar = i.this;
            iVar.f37137h.b();
            Thread.currentThread().setName(name);
        }
    }

    static {
        EnumMap enumMap = new EnumMap(yr.a.class);
        yr.a aVar = yr.a.NO_ERROR;
        i0 i0Var = i0.f33487l;
        enumMap.put((EnumMap) aVar, (yr.a) i0Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) yr.a.PROTOCOL_ERROR, (yr.a) i0Var.g("Protocol error"));
        enumMap.put((EnumMap) yr.a.INTERNAL_ERROR, (yr.a) i0Var.g("Internal error"));
        enumMap.put((EnumMap) yr.a.FLOW_CONTROL_ERROR, (yr.a) i0Var.g("Flow control error"));
        enumMap.put((EnumMap) yr.a.STREAM_CLOSED, (yr.a) i0Var.g("Stream closed"));
        enumMap.put((EnumMap) yr.a.FRAME_TOO_LARGE, (yr.a) i0Var.g("Frame too large"));
        enumMap.put((EnumMap) yr.a.REFUSED_STREAM, (yr.a) i0.f33488m.g("Refused stream"));
        enumMap.put((EnumMap) yr.a.CANCEL, (yr.a) i0.f.g("Cancelled"));
        enumMap.put((EnumMap) yr.a.COMPRESSION_ERROR, (yr.a) i0Var.g("Compression error"));
        enumMap.put((EnumMap) yr.a.CONNECT_ERROR, (yr.a) i0Var.g("Connect error"));
        enumMap.put((EnumMap) yr.a.ENHANCE_YOUR_CALM, (yr.a) i0.f33486k.g("Enhance your calm"));
        enumMap.put((EnumMap) yr.a.INADEQUATE_SECURITY, (yr.a) i0.f33484i.g("Inadequate security"));
        S = Collections.unmodifiableMap(enumMap);
        T = Logger.getLogger(i.class.getName());
    }

    public i() {
        throw null;
    }

    public i(e.d dVar, InetSocketAddress inetSocketAddress, String str, String str2, io.grpc.a aVar, s sVar, f fVar) {
        u0.d dVar2 = u0.r;
        yr.f fVar2 = new yr.f();
        this.f37134d = new Random();
        Object obj = new Object();
        this.f37140k = obj;
        this.f37143n = new HashMap();
        this.D = 0;
        this.E = new LinkedList();
        this.P = new a();
        this.R = 30000;
        sc.b.w(inetSocketAddress, "address");
        this.f37131a = inetSocketAddress;
        this.f37132b = str;
        this.r = dVar.D;
        this.f = dVar.H;
        Executor executor = dVar.f37111v;
        sc.b.w(executor, "executor");
        this.f37144o = executor;
        this.f37145p = new a3(dVar.f37111v);
        ScheduledExecutorService scheduledExecutorService = dVar.f37113x;
        sc.b.w(scheduledExecutorService, "scheduledExecutorService");
        this.f37146q = scheduledExecutorService;
        this.f37142m = 3;
        SocketFactory socketFactory = dVar.f37115z;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = dVar.A;
        this.C = dVar.B;
        xr.b bVar = dVar.C;
        sc.b.w(bVar, "connectionSpec");
        this.F = bVar;
        sc.b.w(dVar2, "stopwatchFactory");
        this.f37135e = dVar2;
        this.f37136g = fVar2;
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-okhttp/1.52.1");
        this.f37133c = sb2.toString();
        this.Q = sVar;
        this.L = fVar;
        this.M = dVar.J;
        m3.a aVar2 = dVar.f37114y;
        aVar2.getClass();
        this.O = new m3(aVar2.f35771a);
        this.f37141l = tr.w.a(i.class, inetSocketAddress.toString());
        io.grpc.a aVar3 = io.grpc.a.f20426b;
        a.b<io.grpc.a> bVar2 = t0.f35959b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar2, aVar);
        for (Map.Entry<a.b<?>, Object> entry : aVar3.f20427a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f37149u = new io.grpc.a(identityHashMap);
        this.N = dVar.K;
        synchronized (obj) {
        }
    }

    public static void i(i iVar, String str) {
        yr.a aVar = yr.a.PROTOCOL_ERROR;
        iVar.getClass();
        iVar.t(0, aVar, x(aVar).a(str));
    }

    public static Socket j(i iVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        int i6;
        String str4;
        iVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = iVar.A;
            if (address != null) {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            createSocket.setTcpNoDelay(true);
            createSocket.setSoTimeout(iVar.R);
            zv.c O = v.O(createSocket);
            zv.s h10 = v.h(v.N(createSocket));
            zr.b k10 = iVar.k(inetSocketAddress, str, str2);
            xr.d dVar = k10.f39834b;
            zr.a aVar = k10.f39833a;
            h10.T(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVar.f39827a, Integer.valueOf(aVar.f39828b)));
            h10.T("\r\n");
            int length = dVar.f37955a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                String[] strArr = dVar.f37955a;
                if (i11 >= 0 && i11 < strArr.length) {
                    str3 = strArr[i11];
                    h10.T(str3);
                    h10.T(": ");
                    i6 = i11 + 1;
                    if (i6 >= 0 && i6 < strArr.length) {
                        str4 = strArr[i6];
                        h10.T(str4);
                        h10.T("\r\n");
                    }
                    str4 = null;
                    h10.T(str4);
                    h10.T("\r\n");
                }
                str3 = null;
                h10.T(str3);
                h10.T(": ");
                i6 = i11 + 1;
                if (i6 >= 0) {
                    str4 = strArr[i6];
                    h10.T(str4);
                    h10.T("\r\n");
                }
                str4 = null;
                h10.T(str4);
                h10.T("\r\n");
            }
            h10.T("\r\n");
            h10.flush();
            a9.a b10 = a9.a.b(r(O));
            do {
            } while (!r(O).equals(""));
            int i12 = b10.f374b;
            if (i12 >= 200 && i12 < 300) {
                createSocket.setSoTimeout(0);
                return createSocket;
            }
            zv.e eVar = new zv.e();
            try {
                createSocket.shutdownOutput();
                O.o0(eVar, 1024L);
            } catch (IOException e11) {
                eVar.R0("Unable to read body: " + e11.toString());
            }
            try {
                createSocket.close();
            } catch (IOException unused) {
            }
            throw new StatusException(i0.f33488m.g(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(i12), (String) b10.f376d, eVar.k0())));
        } catch (IOException e12) {
            e = e12;
            socket = createSocket;
            if (socket != null) {
                u0.b(socket);
            }
            throw new StatusException(i0.f33488m.g("Failed trying to connect with proxy").f(e));
        }
    }

    public static String r(zv.c cVar) {
        zv.e eVar = new zv.e();
        while (cVar.o0(eVar, 1L) != -1) {
            if (eVar.m(eVar.f39885v - 1) == 10) {
                return eVar.j0();
            }
        }
        throw new EOFException("\\n not found: " + eVar.e0().i());
    }

    public static i0 x(yr.a aVar) {
        i0 i0Var = S.get(aVar);
        if (i0Var == null) {
            i0 i0Var2 = i0.f33482g;
            return i0Var2.g("Unknown http2 error code: " + aVar.f38923u);
        }
        return i0Var;
    }

    @Override // wr.b.a
    public final void a(Exception exc) {
        t(0, yr.a.INTERNAL_ERROR, i0.f33488m.f(exc));
    }

    @Override // wr.o.c
    public final o.b[] b() {
        o.b[] bVarArr;
        synchronized (this.f37140k) {
            bVarArr = new o.b[this.f37143n.size()];
            int i6 = 0;
            for (h hVar : this.f37143n.values()) {
                bVarArr[i6] = hVar.f37122l.r();
                i6++;
            }
        }
        return bVarArr;
    }

    @Override // vr.g2
    public final void c(i0 i0Var) {
        h(i0Var);
        synchronized (this.f37140k) {
            Iterator it = this.f37143n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((h) entry.getValue()).f37122l.k(new c0(), i0Var, false);
                q((h) entry.getValue());
            }
            for (h hVar : this.E) {
                hVar.f37122l.l(i0Var, s.a.MISCARRIED, true, new c0());
                q(hVar);
            }
            this.E.clear();
            w();
        }
    }

    @Override // vr.t
    public final void d(n1.c.a aVar) {
        boolean z10;
        long j10;
        boolean z11;
        rc.a aVar2 = rc.a.f30653u;
        synchronized (this.f37140k) {
            try {
                if (this.f37138i != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.D(z10);
                if (this.f37153y) {
                    StatusException n10 = n();
                    Logger logger = a1.f35385g;
                    aVar2.execute(new z0(aVar, n10));
                    return;
                }
                a1 a1Var = this.f37152x;
                if (a1Var != null) {
                    j10 = 0;
                    z11 = false;
                } else {
                    long nextLong = this.f37134d.nextLong();
                    nc.l lVar = this.f37135e.get();
                    lVar.b();
                    a1 a1Var2 = new a1(nextLong, lVar);
                    this.f37152x = a1Var2;
                    this.O.getClass();
                    a1Var = a1Var2;
                    j10 = nextLong;
                    z11 = true;
                }
                if (z11) {
                    this.f37138i.i((int) (j10 >>> 32), (int) j10, false);
                }
                a1Var.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vr.g2
    public final Runnable e(g2.a aVar) {
        this.f37137h = aVar;
        if (this.H) {
            n1 n1Var = new n1(new n1.c(this), this.f37146q, this.I, this.J, this.K);
            this.G = n1Var;
            n1Var.c();
        }
        wr.a aVar2 = new wr.a(this.f37145p, this);
        a.d dVar = new a.d(this.f37136g.b(v.h(aVar2)));
        synchronized (this.f37140k) {
            wr.b bVar = new wr.b(this, dVar);
            this.f37138i = bVar;
            this.f37139j = new o(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f37145p.execute(new b(countDownLatch, aVar2));
        try {
            s();
            countDownLatch.countDown();
            this.f37145p.execute(new c());
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    @Override // vr.t
    public final r f(d0 d0Var, c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
        sc.b.w(d0Var, "method");
        sc.b.w(c0Var, "headers");
        g3 g3Var = new g3(cVarArr);
        for (io.grpc.c cVar : cVarArr) {
            cVar.getClass();
        }
        synchronized (this.f37140k) {
            try {
                try {
                    return new h(d0Var, c0Var, this.f37138i, this, this.f37139j, this.f37140k, this.r, this.f, this.f37132b, this.f37133c, g3Var, this.O, bVar, this.N);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // tr.v
    public final tr.w g() {
        return this.f37141l;
    }

    @Override // vr.g2
    public final void h(i0 i0Var) {
        synchronized (this.f37140k) {
            if (this.f37150v != null) {
                return;
            }
            this.f37150v = i0Var;
            this.f37137h.c(i0Var);
            w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
        if (r11 == 16) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0181, code lost:
        if (r13 != (-1)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0186, code lost:
        r3 = r11 - r13;
        java.lang.System.arraycopy(r10, r13, r10, 16 - r3, r3);
        java.util.Arrays.fill(r10, r13, (16 - r11) + r13, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0194, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0195, code lost:
        r5 = java.net.InetAddress.getByAddress(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020a, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0242, code lost:
        if (r5 != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zr.b k(InetSocketAddress inetSocketAddress, String str, String str2) {
        String substring;
        String str3;
        String lowerCase;
        boolean z10;
        int i6;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        a.C0685a c0685a = new a.C0685a();
        c0685a.f39830a = "https";
        String hostName = inetSocketAddress.getHostName();
        if (hostName != null) {
            int length = hostName.length();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i15 < length) {
                    if (hostName.charAt(i15) != '%') {
                        i15++;
                    } else {
                        zv.e eVar = new zv.e();
                        eVar.Q0(0, i15, hostName);
                        while (i15 < length) {
                            int codePointAt = hostName.codePointAt(i15);
                            if (codePointAt == 37 && (i13 = i15 + 2) < length) {
                                int a10 = zr.a.a(hostName.charAt(i15 + 1));
                                int a11 = zr.a.a(hostName.charAt(i13));
                                if (a10 != -1 && a11 != -1) {
                                    eVar.L0((a10 << 4) + a11);
                                    i15 = i13;
                                    i15 += Character.charCount(codePointAt);
                                }
                            }
                            eVar.S0(codePointAt);
                            i15 += Character.charCount(codePointAt);
                        }
                        substring = eVar.k0();
                    }
                } else {
                    substring = hostName.substring(0, length);
                    break;
                }
            }
            if (substring.startsWith("[") && substring.endsWith("]")) {
                int length2 = substring.length() - 1;
                int i16 = 16;
                byte[] bArr = new byte[16];
                int i17 = 0;
                int i18 = 1;
                int i19 = -1;
                int i20 = -1;
                while (true) {
                    if (i18 < length2) {
                        if (i17 == i16) {
                            break;
                        }
                        int i21 = i18 + 2;
                        if (i21 <= length2) {
                            i6 = i20;
                            if (substring.regionMatches(i18, "::", i14, 2)) {
                                if (i19 != -1) {
                                    break;
                                }
                                i17 += 2;
                                str3 = hostName;
                                if (i21 == length2) {
                                    i19 = i17;
                                    break;
                                }
                                i20 = i21;
                                i19 = i17;
                                i11 = 0;
                                i18 = i20;
                                while (i18 < length2) {
                                    int a12 = zr.a.a(substring.charAt(i18));
                                    if (a12 == -1) {
                                        break;
                                    }
                                    i11 = (i11 << 4) + a12;
                                    i18++;
                                }
                                i12 = i18 - i20;
                                if (i12 != 0 || i12 > 4) {
                                    break;
                                    break;
                                }
                                int i22 = i17 + 1;
                                bArr[i17] = (byte) ((i11 >>> 8) & 255);
                                i17 = i22 + 1;
                                bArr[i22] = (byte) (i11 & 255);
                                i14 = 0;
                                i16 = 16;
                                hostName = str3;
                            }
                        } else {
                            i6 = i20;
                        }
                        if (i17 != 0) {
                            if (substring.regionMatches(i18, ":", i14, 1)) {
                                i18++;
                            } else if (substring.regionMatches(i18, ".", i14, 1)) {
                                int i23 = i17 - 2;
                                int i24 = i23;
                                int i25 = i6;
                                loop7: while (true) {
                                    if (i25 < length2) {
                                        if (i24 == 16) {
                                            break;
                                        }
                                        if (i24 != i23) {
                                            if (substring.charAt(i25) != '.') {
                                                break;
                                            }
                                            i25++;
                                        }
                                        int i26 = 0;
                                        int i27 = i25;
                                        while (true) {
                                            if (i27 < length2) {
                                                i10 = i19;
                                                char charAt = substring.charAt(i27);
                                                str3 = hostName;
                                                if (charAt < '0' || charAt > '9') {
                                                    break;
                                                } else if ((i26 == 0 && i25 != i27) || ((i26 * 10) + charAt) - 48 > 255) {
                                                    break loop7;
                                                } else {
                                                    i27++;
                                                    i19 = i10;
                                                    hostName = str3;
                                                }
                                            } else {
                                                str3 = hostName;
                                                i10 = i19;
                                                break;
                                            }
                                        }
                                        if (i27 - i25 == 0) {
                                            break;
                                        }
                                        bArr[i24] = (byte) i26;
                                        i24++;
                                        i25 = i27;
                                        i19 = i10;
                                        hostName = str3;
                                    } else {
                                        str3 = hostName;
                                        i10 = i19;
                                        if (i24 == i23 + 4) {
                                            z11 = true;
                                        }
                                    }
                                }
                                str3 = hostName;
                                i10 = i19;
                                z11 = false;
                                if (z11) {
                                    i17 += 2;
                                    i19 = i10;
                                }
                            }
                        }
                        str3 = hostName;
                        i20 = i18;
                        i19 = i19;
                        i11 = 0;
                        i18 = i20;
                        while (i18 < length2) {
                        }
                        i12 = i18 - i20;
                        if (i12 != 0) {
                            break;
                        }
                        int i222 = i17 + 1;
                        bArr[i17] = (byte) ((i11 >>> 8) & 255);
                        i17 = i222 + 1;
                        bArr[i222] = (byte) (i11 & 255);
                        i14 = 0;
                        i16 = 16;
                        hostName = str3;
                    } else {
                        str3 = hostName;
                        break;
                    }
                }
                str3 = hostName;
                int i28 = 0;
                InetAddress byAddress = null;
                if (byAddress != null) {
                    byte[] address = byAddress.getAddress();
                    int i29 = 16;
                    if (address.length == 16) {
                        int i30 = 0;
                        int i31 = -1;
                        int i32 = 0;
                        while (i30 < address.length) {
                            int i33 = i30;
                            while (i33 < i29 && address[i33] == 0 && address[i33 + 1] == 0) {
                                i33 += 2;
                                i29 = 16;
                            }
                            int i34 = i33 - i30;
                            if (i34 > i32) {
                                i31 = i30;
                                i32 = i34;
                            }
                            i30 = i33 + 2;
                            i29 = 16;
                        }
                        zv.e eVar2 = new zv.e();
                        while (i28 < address.length) {
                            if (i28 == i31) {
                                eVar2.L0(58);
                                i28 += i32;
                                if (i28 == 16) {
                                    eVar2.L0(58);
                                }
                            } else {
                                if (i28 > 0) {
                                    eVar2.L0(58);
                                }
                                eVar2.N0(((address[i28] & 255) << 8) | (address[i28 + 1] & 255));
                                i28 += 2;
                            }
                        }
                        lowerCase = eVar2.k0();
                    } else {
                        throw new AssertionError();
                    }
                }
                lowerCase = null;
            } else {
                str3 = hostName;
                try {
                    lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                    if (!lowerCase.isEmpty()) {
                        for (int i35 = 0; i35 < lowerCase.length(); i35++) {
                            char charAt2 = lowerCase.charAt(i35);
                            if (charAt2 > 31 && charAt2 < 127 && " #%/:?@[\\]".indexOf(charAt2) == -1) {
                            }
                            z10 = true;
                        }
                        z10 = false;
                    }
                } catch (IllegalArgumentException unused) {
                }
                lowerCase = null;
            }
            if (lowerCase != null) {
                c0685a.f39831b = lowerCase;
                int port = inetSocketAddress.getPort();
                if (port > 0 && port <= 65535) {
                    c0685a.f39832c = port;
                    if (c0685a.f39830a != null) {
                        if (c0685a.f39831b != null) {
                            zr.a aVar = new zr.a(c0685a);
                            b.a aVar2 = new b.a();
                            aVar2.f39835a = aVar;
                            aVar2.a("Host", aVar.f39827a + ":" + aVar.f39828b);
                            aVar2.a("User-Agent", this.f37133c);
                            if (str != null && str2 != null) {
                                try {
                                    aVar2.a("Proxy-Authorization", "Basic " + zv.i.l((str + ":" + str2).getBytes("ISO-8859-1")).d());
                                } catch (UnsupportedEncodingException unused2) {
                                    throw new AssertionError();
                                }
                            }
                            if (aVar2.f39835a != null) {
                                return new zr.b(aVar2);
                            }
                            throw new IllegalStateException("url == null");
                        }
                        throw new IllegalStateException("host == null");
                    }
                    throw new IllegalStateException("scheme == null");
                }
                throw new IllegalArgumentException(defpackage.c.p("unexpected port: ", port));
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str3));
        }
        throw new IllegalArgumentException("host == null");
    }

    public final void l(int i6, i0 i0Var, s.a aVar, boolean z10, yr.a aVar2, c0 c0Var) {
        synchronized (this.f37140k) {
            h hVar = (h) this.f37143n.remove(Integer.valueOf(i6));
            if (hVar != null) {
                if (aVar2 != null) {
                    this.f37138i.N(i6, yr.a.CANCEL);
                }
                if (i0Var != null) {
                    h.b bVar = hVar.f37122l;
                    if (c0Var == null) {
                        c0Var = new c0();
                    }
                    bVar.l(i0Var, aVar, z10, c0Var);
                }
                if (!u()) {
                    w();
                    q(hVar);
                }
            }
        }
    }

    public final int m() {
        URI a10 = u0.a(this.f37132b);
        if (a10.getPort() != -1) {
            return a10.getPort();
        }
        return this.f37131a.getPort();
    }

    public final StatusException n() {
        synchronized (this.f37140k) {
            i0 i0Var = this.f37150v;
            if (i0Var != null) {
                return new StatusException(i0Var);
            }
            return new StatusException(i0.f33488m.g("Connection closed"));
        }
    }

    public final h o(int i6) {
        h hVar;
        synchronized (this.f37140k) {
            hVar = (h) this.f37143n.get(Integer.valueOf(i6));
        }
        return hVar;
    }

    public final boolean p(int i6) {
        boolean z10;
        synchronized (this.f37140k) {
            if (i6 < this.f37142m) {
                z10 = true;
                if ((i6 & 1) == 1) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final void q(h hVar) {
        if (this.f37154z && this.E.isEmpty() && this.f37143n.isEmpty()) {
            this.f37154z = false;
            n1 n1Var = this.G;
            if (n1Var != null) {
                synchronized (n1Var) {
                    if (!n1Var.f35778d) {
                        int i6 = n1Var.f35779e;
                        if (i6 == 2 || i6 == 3) {
                            n1Var.f35779e = 1;
                        }
                        if (n1Var.f35779e == 4) {
                            n1Var.f35779e = 5;
                        }
                    }
                }
            }
        }
        if (hVar.f35362c) {
            this.P.c(hVar, false);
        }
    }

    public final void s() {
        synchronized (this.f37140k) {
            this.f37138i.C();
            hg.a aVar = new hg.a();
            aVar.d(7, this.f);
            this.f37138i.b0(aVar);
            int i6 = this.f;
            if (i6 > 65535) {
                this.f37138i.f(0, i6 - 65535);
            }
        }
    }

    public final void t(int i6, yr.a aVar, i0 i0Var) {
        synchronized (this.f37140k) {
            if (this.f37150v == null) {
                this.f37150v = i0Var;
                this.f37137h.c(i0Var);
            }
            if (aVar != null && !this.f37151w) {
                this.f37151w = true;
                this.f37138i.F(aVar, new byte[0]);
            }
            Iterator it = this.f37143n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i6) {
                    it.remove();
                    ((h) entry.getValue()).f37122l.l(i0Var, s.a.REFUSED, false, new c0());
                    q((h) entry.getValue());
                }
            }
            for (h hVar : this.E) {
                hVar.f37122l.l(i0Var, s.a.MISCARRIED, true, new c0());
                q(hVar);
            }
            this.E.clear();
            w();
        }
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.b(this.f37141l.f33589c, "logId");
        c10.c(this.f37131a, "address");
        return c10.toString();
    }

    public final boolean u() {
        boolean z10 = false;
        while (true) {
            LinkedList linkedList = this.E;
            if (linkedList.isEmpty() || this.f37143n.size() >= this.D) {
                break;
            }
            v((h) linkedList.poll());
            z10 = true;
        }
        return z10;
    }

    public final void v(h hVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (hVar.f37122l.L == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("StreamId already assigned", z10);
        this.f37143n.put(Integer.valueOf(this.f37142m), hVar);
        if (!this.f37154z) {
            this.f37154z = true;
            n1 n1Var = this.G;
            if (n1Var != null) {
                n1Var.b();
            }
        }
        if (hVar.f35362c) {
            this.P.c(hVar, true);
        }
        h.b bVar = hVar.f37122l;
        int i6 = this.f37142m;
        if (bVar.L == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.A("the stream has been started with id %s", i6, z11);
        bVar.L = i6;
        o oVar = bVar.G;
        bVar.K = new o.b(i6, oVar.f37191c, bVar);
        h.b bVar2 = h.this.f37122l;
        if (bVar2.f35372j != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        sc.b.D(z12);
        synchronized (bVar2.f35522b) {
            sc.b.B("Already allocated", !bVar2.f);
            bVar2.f = true;
        }
        bVar2.h();
        m3 m3Var = bVar2.f35523c;
        m3Var.getClass();
        m3Var.f35769a.a();
        if (bVar.I) {
            bVar.F.E(h.this.f37125o, bVar.L, bVar.f37129y);
            for (com.android.volley.toolbox.a aVar : h.this.f37120j.f35635a) {
                ((io.grpc.c) aVar).getClass();
            }
            bVar.f37129y = null;
            zv.e eVar = bVar.f37130z;
            if (eVar.f39885v > 0) {
                bVar.G.a(bVar.A, bVar.K, eVar, bVar.B);
            }
            bVar.I = false;
        }
        d0.b bVar3 = hVar.f37118h.f33450a;
        if ((bVar3 != d0.b.UNARY && bVar3 != d0.b.SERVER_STREAMING) || hVar.f37125o) {
            this.f37138i.flush();
        }
        int i10 = this.f37142m;
        if (i10 >= 2147483645) {
            this.f37142m = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            t(SubsamplingScaleImageView.TILE_SIZE_AUTO, yr.a.NO_ERROR, i0.f33488m.g("Stream ids exhausted"));
            return;
        }
        this.f37142m = i10 + 2;
    }

    public final void w() {
        if (this.f37150v == null || !this.f37143n.isEmpty() || !this.E.isEmpty() || this.f37153y) {
            return;
        }
        this.f37153y = true;
        n1 n1Var = this.G;
        if (n1Var != null) {
            synchronized (n1Var) {
                if (n1Var.f35779e != 6) {
                    n1Var.f35779e = 6;
                    ScheduledFuture<?> scheduledFuture = n1Var.f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledFuture<?> scheduledFuture2 = n1Var.f35780g;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                        n1Var.f35780g = null;
                    }
                }
            }
        }
        a1 a1Var = this.f37152x;
        if (a1Var != null) {
            a1Var.c(n());
            this.f37152x = null;
        }
        if (!this.f37151w) {
            this.f37151w = true;
            this.f37138i.F(yr.a.NO_ERROR, new byte[0]);
        }
        this.f37138i.close();
    }

    /* compiled from: OkHttpClientTransport.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f37156u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ wr.a f37157v;

        public b(CountDownLatch countDownLatch, wr.a aVar) {
            this.f37156u = countDownLatch;
            this.f37157v = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar;
            d dVar;
            Socket j10;
            SSLSession sSLSession;
            SSLSocket sSLSocket;
            h0 h0Var;
            try {
                this.f37156u.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            t j11 = v.j(new a());
            try {
                try {
                    i iVar2 = i.this;
                    tr.s sVar = iVar2.Q;
                    if (sVar == null) {
                        j10 = iVar2.A.createSocket(iVar2.f37131a.getAddress(), i.this.f37131a.getPort());
                    } else {
                        SocketAddress socketAddress = sVar.f33568u;
                        if (socketAddress instanceof InetSocketAddress) {
                            j10 = i.j(iVar2, sVar.f33569v, (InetSocketAddress) socketAddress, sVar.f33570w, sVar.f33571x);
                        } else {
                            i0 i0Var = i0.f33487l;
                            throw new StatusException(i0Var.g("Unsupported SocketAddress implementation " + i.this.Q.f33568u.getClass()));
                        }
                    }
                    Socket socket = j10;
                    i iVar3 = i.this;
                    SSLSocketFactory sSLSocketFactory = iVar3.B;
                    if (sSLSocketFactory != null) {
                        HostnameVerifier hostnameVerifier = iVar3.C;
                        String str = iVar3.f37132b;
                        URI a10 = u0.a(str);
                        if (a10.getHost() != null) {
                            str = a10.getHost();
                        }
                        SSLSocket a11 = m.a(sSLSocketFactory, hostnameVerifier, socket, str, i.this.m(), i.this.F);
                        sSLSession = a11.getSession();
                        sSLSocket = a11;
                    } else {
                        sSLSession = null;
                        sSLSocket = socket;
                    }
                    sSLSocket.setTcpNoDelay(true);
                    t j12 = v.j(v.O(sSLSocket));
                    this.f37157v.a(v.N(sSLSocket), sSLSocket);
                    i iVar4 = i.this;
                    io.grpc.a aVar = iVar4.f37149u;
                    aVar.getClass();
                    a.C0307a c0307a = new a.C0307a(aVar);
                    c0307a.c(io.grpc.f.f20455a, sSLSocket.getRemoteSocketAddress());
                    c0307a.c(io.grpc.f.f20456b, sSLSocket.getLocalSocketAddress());
                    c0307a.c(io.grpc.f.f20457c, sSLSession);
                    a.b<h0> bVar = t0.f35958a;
                    if (sSLSession == null) {
                        h0Var = h0.NONE;
                    } else {
                        h0Var = h0.PRIVACY_AND_INTEGRITY;
                    }
                    c0307a.c(bVar, h0Var);
                    iVar4.f37149u = c0307a.a();
                    i iVar5 = i.this;
                    iVar5.f37148t = new d(iVar5.f37136g.a(j12));
                    synchronized (i.this.f37140k) {
                        i.this.getClass();
                        if (sSLSession != null) {
                            i iVar6 = i.this;
                            new u.a(sSLSession);
                            iVar6.getClass();
                        }
                    }
                } catch (Throwable th2) {
                    i iVar7 = i.this;
                    iVar7.f37148t = new d(iVar7.f37136g.a(j11));
                    throw th2;
                }
            } catch (StatusException e10) {
                i.this.t(0, yr.a.INTERNAL_ERROR, e10.f20422u);
                iVar = i.this;
                dVar = new d(iVar.f37136g.a(j11));
                iVar.f37148t = dVar;
            } catch (Exception e11) {
                i.this.a(e11);
                iVar = i.this;
                dVar = new d(iVar.f37136g.a(j11));
                iVar.f37148t = dVar;
            }
        }

        /* compiled from: OkHttpClientTransport.java */
        /* loaded from: classes2.dex */
        public class a implements z {
            @Override // zv.z
            public final a0 d() {
                return a0.f39875d;
            }

            @Override // zv.z
            public final long o0(zv.e eVar, long j10) {
                return -1L;
            }

            @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }
    }
}

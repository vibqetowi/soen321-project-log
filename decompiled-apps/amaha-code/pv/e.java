package pv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import lv.d0;
import lv.g0;
import lv.o;
import lv.r;
import lv.s;
import lv.x;
import lv.y;
import lv.z;
import okhttp3.internal.connection.RouteException;
import rv.b;
import sv.e;
import sv.q;
import sv.u;
import ta.u2;
import ta.v;
import zv.i;
import zv.s;
import zv.t;
/* compiled from: RealConnection.kt */
/* loaded from: classes2.dex */
public final class e extends e.b {

    /* renamed from: b  reason: collision with root package name */
    public final g0 f29059b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f29060c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f29061d;

    /* renamed from: e  reason: collision with root package name */
    public r f29062e;
    public y f;

    /* renamed from: g  reason: collision with root package name */
    public sv.e f29063g;

    /* renamed from: h  reason: collision with root package name */
    public t f29064h;

    /* renamed from: i  reason: collision with root package name */
    public s f29065i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f29066j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f29067k;

    /* renamed from: l  reason: collision with root package name */
    public int f29068l;

    /* renamed from: m  reason: collision with root package name */
    public int f29069m;

    /* renamed from: n  reason: collision with root package name */
    public int f29070n;

    /* renamed from: o  reason: collision with root package name */
    public int f29071o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f29072p;

    /* renamed from: q  reason: collision with root package name */
    public long f29073q;

    /* compiled from: RealConnection.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29074a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f29074a = iArr;
        }
    }

    public e(i connectionPool, g0 route) {
        kotlin.jvm.internal.i.g(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.g(route, "route");
        this.f29059b = route;
        this.f29071o = 1;
        this.f29072p = new ArrayList();
        this.f29073q = Long.MAX_VALUE;
    }

    public static void d(x client, g0 failedRoute, IOException failure) {
        kotlin.jvm.internal.i.g(client, "client");
        kotlin.jvm.internal.i.g(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.g(failure, "failure");
        if (failedRoute.f24613b.type() != Proxy.Type.DIRECT) {
            lv.a aVar = failedRoute.f24612a;
            aVar.f24534h.connectFailed(aVar.f24535i.g(), failedRoute.f24613b.address(), failure);
        }
        hh.a aVar2 = client.T;
        synchronized (aVar2) {
            aVar2.f17604a.add(failedRoute);
        }
    }

    @Override // sv.e.b
    public final synchronized void a(sv.e connection, u settings) {
        int i6;
        kotlin.jvm.internal.i.g(connection, "connection");
        kotlin.jvm.internal.i.g(settings, "settings");
        if ((settings.f32220a & 16) != 0) {
            i6 = settings.f32221b[4];
        } else {
            i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        this.f29071o = i6;
    }

    @Override // sv.e.b
    public final void b(q stream) {
        kotlin.jvm.internal.i.g(stream, "stream");
        stream.c(sv.a.REFUSED_STREAM, null);
    }

    public final void c(int i6, int i10, int i11, boolean z10, d call, o eventListener) {
        boolean z11;
        boolean z12;
        boolean z13;
        g0 g0Var;
        boolean z14;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(eventListener, "eventListener");
        if (this.f == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            List<lv.j> list = this.f29059b.f24612a.f24537k;
            u2 u2Var = new u2(list);
            lv.a aVar = this.f29059b.f24612a;
            if (aVar.f24530c == null) {
                if (list.contains(lv.j.f)) {
                    String str = this.f29059b.f24612a.f24535i.f24689d;
                    uv.h hVar = uv.h.f34614a;
                    if (!uv.h.f34614a.h(str)) {
                        throw new RouteException(new UnknownServiceException(defpackage.b.m("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (aVar.f24536j.contains(y.H2_PRIOR_KNOWLEDGE)) {
                throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            RouteException routeException = null;
            do {
                try {
                    g0 g0Var2 = this.f29059b;
                    if (g0Var2.f24612a.f24530c != null && g0Var2.f24613b.type() == Proxy.Type.HTTP) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f(i6, i10, i11, call, eventListener);
                        if (this.f29060c == null) {
                            g0Var = this.f29059b;
                            if (g0Var.f24612a.f24530c == null && g0Var.f24613b.type() == Proxy.Type.HTTP) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14 && this.f29060c == null) {
                                throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f29073q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i6, i10, call, eventListener);
                        } catch (IOException e10) {
                            e = e10;
                            Socket socket = this.f29061d;
                            if (socket != null) {
                                mv.b.e(socket);
                            }
                            Socket socket2 = this.f29060c;
                            if (socket2 != null) {
                                mv.b.e(socket2);
                            }
                            this.f29061d = null;
                            this.f29060c = null;
                            this.f29064h = null;
                            this.f29065i = null;
                            this.f29062e = null;
                            this.f = null;
                            this.f29063g = null;
                            this.f29071o = 1;
                            g0 g0Var3 = this.f29059b;
                            InetSocketAddress inetSocketAddress = g0Var3.f24614c;
                            Proxy proxy = g0Var3.f24613b;
                            kotlin.jvm.internal.i.g(inetSocketAddress, "inetSocketAddress");
                            kotlin.jvm.internal.i.g(proxy, "proxy");
                            if (routeException == null) {
                                routeException = new RouteException(e);
                            } else {
                                ca.a.h(routeException.f27604u, e);
                                routeException.f27605v = e;
                            }
                            if (!z10) {
                                break;
                            }
                            u2Var.f32893c = true;
                            if (u2Var.f32892b && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                z12 = true;
                                continue;
                            } else {
                                z12 = false;
                                continue;
                            }
                            if (!z12) {
                            }
                            throw routeException;
                        }
                    }
                    g(u2Var, call, eventListener);
                    g0 g0Var4 = this.f29059b;
                    InetSocketAddress inetSocketAddress2 = g0Var4.f24614c;
                    Proxy proxy2 = g0Var4.f24613b;
                    o.a aVar2 = o.f24669a;
                    kotlin.jvm.internal.i.g(inetSocketAddress2, "inetSocketAddress");
                    kotlin.jvm.internal.i.g(proxy2, "proxy");
                    g0Var = this.f29059b;
                    if (g0Var.f24612a.f24530c == null) {
                    }
                    z14 = false;
                    if (!z14) {
                    }
                    this.f29073q = System.nanoTime();
                    return;
                } catch (IOException e11) {
                    e = e11;
                }
            } while (!z12);
            throw routeException;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i6, int i10, d call, o oVar) {
        int i11;
        Socket createSocket;
        g0 g0Var = this.f29059b;
        Proxy proxy = g0Var.f24613b;
        lv.a aVar = g0Var.f24612a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = a.f29074a[type.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.f24529b.createSocket();
            kotlin.jvm.internal.i.d(createSocket);
        }
        this.f29060c = createSocket;
        InetSocketAddress inetSocketAddress = this.f29059b.f24614c;
        oVar.getClass();
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i10);
        try {
            uv.h hVar = uv.h.f34614a;
            uv.h.f34614a.e(createSocket, this.f29059b.f24614c, i6);
            try {
                this.f29064h = v.j(v.O(createSocket));
                this.f29065i = v.h(v.N(createSocket));
            } catch (NullPointerException e10) {
                if (!kotlin.jvm.internal.i.b(e10.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e10);
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(kotlin.jvm.internal.i.n(this.f29059b.f24614c, "Failed to connect to "));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i6, int i10, int i11, d dVar, o oVar) {
        z.a aVar = new z.a();
        g0 g0Var = this.f29059b;
        lv.t url = g0Var.f24612a.f24535i;
        kotlin.jvm.internal.i.g(url, "url");
        aVar.f24756a = url;
        aVar.c("CONNECT", null);
        lv.a aVar2 = g0Var.f24612a;
        aVar.b("Host", mv.b.w(aVar2.f24535i, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.10.0");
        z a10 = aVar.a();
        d0.a aVar3 = new d0.a();
        aVar3.f24589a = a10;
        aVar3.f24590b = y.HTTP_1_1;
        aVar3.f24591c = 407;
        aVar3.f24592d = "Preemptive Authenticate";
        aVar3.f24594g = mv.b.f25757c;
        aVar3.f24598k = -1L;
        aVar3.f24599l = -1L;
        s.a aVar4 = aVar3.f;
        aVar4.getClass();
        s.b.a("Proxy-Authenticate");
        s.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar4.f("Proxy-Authenticate");
        aVar4.c("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f.b(g0Var, aVar3.a());
        e(i6, i10, dVar, oVar);
        t tVar = this.f29064h;
        kotlin.jvm.internal.i.d(tVar);
        zv.s sVar = this.f29065i;
        kotlin.jvm.internal.i.d(sVar);
        rv.b bVar = new rv.b(null, this, tVar, sVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.d().g(i10, timeUnit);
        sVar.d().g(i11, timeUnit);
        bVar.k(a10.f24753c, "CONNECT " + mv.b.w(a10.f24751a, true) + " HTTP/1.1");
        bVar.b();
        d0.a c10 = bVar.c(false);
        kotlin.jvm.internal.i.d(c10);
        c10.f24589a = a10;
        d0 a11 = c10.a();
        long k10 = mv.b.k(a11);
        if (k10 != -1) {
            b.d j10 = bVar.j(k10);
            mv.b.u(j10, SubsamplingScaleImageView.TILE_SIZE_AUTO, timeUnit);
            j10.close();
        }
        int i12 = a11.f24586x;
        if (i12 != 200) {
            if (i12 == 407) {
                aVar2.f.b(g0Var, a11);
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(kotlin.jvm.internal.i.n(Integer.valueOf(i12), "Unexpected response code for CONNECT: "));
        } else if (tVar.f39915v.B() && sVar.f39912v.B()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(u2 u2Var, d call, o oVar) {
        lv.a aVar = this.f29059b.f24612a;
        SSLSocketFactory sSLSocketFactory = aVar.f24530c;
        y yVar = y.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List<y> list = aVar.f24536j;
            y yVar2 = y.H2_PRIOR_KNOWLEDGE;
            if (list.contains(yVar2)) {
                this.f29061d = this.f29060c;
                this.f = yVar2;
                m();
                return;
            }
            this.f29061d = this.f29060c;
            this.f = yVar;
            return;
        }
        oVar.getClass();
        kotlin.jvm.internal.i.g(call, "call");
        lv.a aVar2 = this.f29059b.f24612a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f24530c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            kotlin.jvm.internal.i.d(sSLSocketFactory2);
            Socket socket = this.f29060c;
            lv.t tVar = aVar2.f24535i;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, tVar.f24689d, tVar.f24690e, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    lv.j a10 = u2Var.a(sSLSocket2);
                    if (a10.f24644b) {
                        uv.h hVar = uv.h.f34614a;
                        uv.h.f34614a.d(sSLSocket2, aVar2.f24535i.f24689d, aVar2.f24536j);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession sslSocketSession = sSLSocket2.getSession();
                    kotlin.jvm.internal.i.f(sslSocketSession, "sslSocketSession");
                    r a11 = r.a.a(sslSocketSession);
                    HostnameVerifier hostnameVerifier = aVar2.f24531d;
                    kotlin.jvm.internal.i.d(hostnameVerifier);
                    if (!hostnameVerifier.verify(aVar2.f24535i.f24689d, sslSocketSession)) {
                        List<Certificate> a12 = a11.a();
                        if (!a12.isEmpty()) {
                            X509Certificate certificate = (X509Certificate) a12.get(0);
                            StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                            sb2.append(aVar2.f24535i.f24689d);
                            sb2.append(" not verified:\n              |    certificate: ");
                            lv.g gVar = lv.g.f24609c;
                            kotlin.jvm.internal.i.g(certificate, "certificate");
                            zv.i iVar = zv.i.f39888x;
                            byte[] encoded = certificate.getPublicKey().getEncoded();
                            kotlin.jvm.internal.i.f(encoded, "publicKey.encoded");
                            sb2.append(kotlin.jvm.internal.i.n(i.a.d(encoded).f("SHA-256").d(), "sha256/"));
                            sb2.append("\n              |    DN: ");
                            sb2.append((Object) certificate.getSubjectDN().getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(is.u.u2(xv.c.a(certificate, 2), xv.c.a(certificate, 7)));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(gv.j.v0(sb2.toString()));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.f24535i.f24689d + " not verified (no certificates)");
                    }
                    lv.g gVar2 = aVar2.f24532e;
                    kotlin.jvm.internal.i.d(gVar2);
                    this.f29062e = new r(a11.f24677a, a11.f24678b, a11.f24679c, new f(gVar2, a11, aVar2));
                    gVar2.a(aVar2.f24535i.f24689d, new g(this));
                    if (a10.f24644b) {
                        uv.h hVar2 = uv.h.f34614a;
                        str = uv.h.f34614a.f(sSLSocket2);
                    }
                    this.f29061d = sSLSocket2;
                    this.f29064h = v.j(v.O(sSLSocket2));
                    this.f29065i = v.h(v.N(sSLSocket2));
                    if (str != null) {
                        yVar = y.a.a(str);
                    }
                    this.f = yVar;
                    uv.h hVar3 = uv.h.f34614a;
                    uv.h.f34614a.a(sSLSocket2);
                    if (this.f == y.HTTP_2) {
                        m();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        uv.h hVar4 = uv.h.f34614a;
                        uv.h.f34614a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        mv.b.e(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized void h() {
        this.f29069m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
        if (r10 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(lv.a address, List<g0> list) {
        boolean z10;
        boolean z11;
        r rVar;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.i.g(address, "address");
        byte[] bArr = mv.b.f25755a;
        if (this.f29072p.size() < this.f29071o && !this.f29066j) {
            g0 g0Var = this.f29059b;
            if (!g0Var.f24612a.a(address)) {
                return false;
            }
            lv.t tVar = address.f24535i;
            String str = tVar.f24689d;
            lv.a aVar = g0Var.f24612a;
            if (kotlin.jvm.internal.i.b(str, aVar.f24535i.f24689d)) {
                return true;
            }
            if (this.f29063g != null && list != null) {
                if (!list.isEmpty()) {
                    for (g0 g0Var2 : list) {
                        if (g0Var2.f24613b.type() == Proxy.Type.DIRECT && g0Var.f24613b.type() == Proxy.Type.DIRECT && kotlin.jvm.internal.i.b(g0Var.f24614c, g0Var2.f24614c)) {
                            z13 = true;
                            continue;
                        } else {
                            z13 = false;
                            continue;
                        }
                        if (z13) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    if (address.f24531d != xv.c.f38131a) {
                        return false;
                    }
                    byte[] bArr2 = mv.b.f25755a;
                    lv.t tVar2 = aVar.f24535i;
                    int i6 = tVar2.f24690e;
                    String hostname = tVar.f24689d;
                    if (tVar.f24690e == i6) {
                        if (!kotlin.jvm.internal.i.b(hostname, tVar2.f24689d)) {
                            if (!this.f29067k && (rVar = this.f29062e) != null) {
                                List<Certificate> a10 = rVar.a();
                                if ((!a10.isEmpty()) && xv.c.c(hostname, (X509Certificate) a10.get(0))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                            return false;
                        }
                        try {
                            lv.g gVar = address.f24532e;
                            kotlin.jvm.internal.i.d(gVar);
                            r rVar2 = this.f29062e;
                            kotlin.jvm.internal.i.d(rVar2);
                            List<Certificate> peerCertificates = rVar2.a();
                            kotlin.jvm.internal.i.g(hostname, "hostname");
                            kotlin.jvm.internal.i.g(peerCertificates, "peerCertificates");
                            gVar.a(hostname, new lv.h(gVar, peerCertificates, hostname));
                            return true;
                        } catch (SSLPeerUnverifiedException unused) {
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z10) {
        long j10;
        byte[] bArr = mv.b.f25755a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f29060c;
        kotlin.jvm.internal.i.d(socket);
        Socket socket2 = this.f29061d;
        kotlin.jvm.internal.i.d(socket2);
        t tVar = this.f29064h;
        kotlin.jvm.internal.i.d(tVar);
        boolean z11 = false;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        sv.e eVar = this.f29063g;
        if (eVar != null) {
            return eVar.h(nanoTime);
        }
        synchronized (this) {
            j10 = nanoTime - this.f29073q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            boolean z12 = !tVar.B();
            socket2.setSoTimeout(soTimeout);
            z11 = z12;
            return z11;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z11;
        }
    }

    public final qv.d k(x xVar, qv.f fVar) {
        Socket socket = this.f29061d;
        kotlin.jvm.internal.i.d(socket);
        t tVar = this.f29064h;
        kotlin.jvm.internal.i.d(tVar);
        zv.s sVar = this.f29065i;
        kotlin.jvm.internal.i.d(sVar);
        sv.e eVar = this.f29063g;
        if (eVar != null) {
            return new sv.o(xVar, this, fVar, eVar);
        }
        int i6 = fVar.f30151g;
        socket.setSoTimeout(i6);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.d().g(i6, timeUnit);
        sVar.d().g(fVar.f30152h, timeUnit);
        return new rv.b(xVar, this, tVar, sVar);
    }

    public final synchronized void l() {
        this.f29066j = true;
    }

    public final void m() {
        String n10;
        int i6;
        int a10;
        Socket socket = this.f29061d;
        kotlin.jvm.internal.i.d(socket);
        t tVar = this.f29064h;
        kotlin.jvm.internal.i.d(tVar);
        zv.s sVar = this.f29065i;
        kotlin.jvm.internal.i.d(sVar);
        socket.setSoTimeout(0);
        ov.d dVar = ov.d.f27799i;
        e.a aVar = new e.a(dVar);
        String peerName = this.f29059b.f24612a.f24535i.f24689d;
        kotlin.jvm.internal.i.g(peerName, "peerName");
        aVar.f32135c = socket;
        if (aVar.f32133a) {
            n10 = mv.b.f25760g + ' ' + peerName;
        } else {
            n10 = kotlin.jvm.internal.i.n(peerName, "MockWebServer ");
        }
        kotlin.jvm.internal.i.g(n10, "<set-?>");
        aVar.f32136d = n10;
        aVar.f32137e = tVar;
        aVar.f = sVar;
        aVar.f32138g = this;
        aVar.f32140i = 0;
        sv.e eVar = new sv.e(aVar);
        this.f29063g = eVar;
        u uVar = sv.e.V;
        if ((uVar.f32220a & 16) != 0) {
            i6 = uVar.f32221b[4];
        } else {
            i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        this.f29071o = i6;
        sv.r rVar = eVar.S;
        synchronized (rVar) {
            if (!rVar.f32211y) {
                if (rVar.f32208v) {
                    Logger logger = sv.r.A;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(mv.b.i(kotlin.jvm.internal.i.n(sv.d.f32123b.i(), ">> CONNECTION "), new Object[0]));
                    }
                    rVar.f32207u.z(sv.d.f32123b);
                    rVar.f32207u.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        eVar.S.m(eVar.L);
        if (eVar.L.a() != 65535) {
            eVar.S.f(0, a10 - 65535);
        }
        dVar.f().c(new ov.b(eVar.f32130x, eVar.T), 0L);
    }

    public final String toString() {
        lv.i iVar;
        StringBuilder sb2 = new StringBuilder("Connection{");
        g0 g0Var = this.f29059b;
        sb2.append(g0Var.f24612a.f24535i.f24689d);
        sb2.append(':');
        sb2.append(g0Var.f24612a.f24535i.f24690e);
        sb2.append(", proxy=");
        sb2.append(g0Var.f24613b);
        sb2.append(" hostAddress=");
        sb2.append(g0Var.f24614c);
        sb2.append(" cipherSuite=");
        r rVar = this.f29062e;
        Object obj = Constants.SUBSCRIPTION_NONE;
        if (rVar != null && (iVar = rVar.f24678b) != null) {
            obj = iVar;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f);
        sb2.append('}');
        return sb2.toString();
    }
}

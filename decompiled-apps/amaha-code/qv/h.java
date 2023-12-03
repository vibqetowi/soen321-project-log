package qv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import hs.k;
import is.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.b0;
import lv.c0;
import lv.d0;
import lv.e0;
import lv.g0;
import lv.t;
import lv.u;
import lv.x;
import lv.z;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import pv.j;
/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes2.dex */
public final class h implements u {

    /* renamed from: a  reason: collision with root package name */
    public final x f30157a;

    public h(x client) {
        kotlin.jvm.internal.i.g(client, "client");
        this.f30157a = client;
    }

    public static int d(d0 d0Var, int i6) {
        String e10 = d0.e(d0Var, "Retry-After");
        if (e10 == null) {
            return i6;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
        if (compile.matcher(e10).matches()) {
            Integer valueOf = Integer.valueOf(e10);
            kotlin.jvm.internal.i.f(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    @Override // lv.u
    public final d0 a(f fVar) {
        boolean z10;
        List list;
        int i6;
        List v22;
        boolean z11;
        pv.b bVar;
        boolean z12;
        SSLSocketFactory sSLSocketFactory;
        xv.c cVar;
        lv.g gVar;
        z zVar = fVar.f30150e;
        pv.d dVar = fVar.f30146a;
        boolean z13 = true;
        List list2 = w.f20676u;
        int i10 = 0;
        d0 d0Var = null;
        z request = zVar;
        boolean z14 = true;
        while (true) {
            dVar.getClass();
            kotlin.jvm.internal.i.g(request, "request");
            if (dVar.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (dVar) {
                    if (dVar.H ^ z13) {
                        if (dVar.G ^ z13) {
                            k kVar = k.f19476a;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                }
                if (z14) {
                    pv.i iVar = dVar.f29051x;
                    t tVar = request.f24751a;
                    boolean z15 = tVar.f24694j;
                    x xVar = dVar.f29048u;
                    if (z15) {
                        SSLSocketFactory sSLSocketFactory2 = xVar.J;
                        if (sSLSocketFactory2 != null) {
                            xv.c cVar2 = xVar.N;
                            gVar = xVar.O;
                            sSLSocketFactory = sSLSocketFactory2;
                            cVar = cVar2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        cVar = null;
                        gVar = null;
                    }
                    list = list2;
                    i6 = i10;
                    dVar.C = new pv.c(iVar, new lv.a(tVar.f24689d, tVar.f24690e, xVar.F, xVar.I, sSLSocketFactory, cVar, gVar, xVar.H, xVar.M, xVar.L, xVar.G), dVar, dVar.f29052y);
                } else {
                    list = list2;
                    i6 = i10;
                }
                try {
                    if (!dVar.J) {
                        try {
                            d0 c10 = fVar.c(request);
                            if (d0Var != null) {
                                d0.a aVar = new d0.a(c10);
                                d0.a aVar2 = new d0.a(d0Var);
                                aVar2.f24594g = null;
                                d0 a10 = aVar2.a();
                                if (a10.A == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    aVar.f24597j = a10;
                                    c10 = aVar.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            d0Var = c10;
                            bVar = dVar.F;
                            request = b(d0Var, bVar);
                        } catch (IOException e10) {
                            if (!(e10 instanceof ConnectionShutdownException)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (c(e10, dVar, request, z11)) {
                                v22 = is.u.v2(e10, list);
                                dVar.d(true);
                                list = v22;
                                i10 = i6;
                                z14 = false;
                                list2 = list;
                                z13 = true;
                            } else {
                                mv.b.A(e10, list);
                                throw e10;
                            }
                        } catch (RouteException e11) {
                            List list3 = list;
                            if (c(e11.f27605v, dVar, request, false)) {
                                v22 = is.u.v2(e11.f27604u, list3);
                                dVar.d(true);
                                list = v22;
                                i10 = i6;
                                z14 = false;
                                list2 = list;
                                z13 = true;
                            } else {
                                IOException iOException = e11.f27604u;
                                mv.b.A(iOException, list3);
                                throw iOException;
                            }
                        }
                        if (request == null) {
                            if (bVar != null && bVar.f29028e) {
                                if (!dVar.E) {
                                    dVar.E = true;
                                    dVar.f29053z.i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            dVar.d(false);
                            return d0Var;
                        }
                        e0 e0Var = d0Var.A;
                        if (e0Var != null) {
                            mv.b.d(e0Var);
                        }
                        i10 = i6 + 1;
                        if (i10 <= 20) {
                            dVar.d(true);
                            z14 = true;
                            list2 = list;
                            z13 = true;
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.i.n(Integer.valueOf(i10), "Too many follow-up requests: "));
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th2) {
                    dVar.d(true);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public final z b(d0 d0Var, pv.b bVar) {
        g0 g0Var;
        String e10;
        t.a aVar;
        t a10;
        pv.e eVar;
        c0 c0Var = null;
        if (bVar == null || (eVar = bVar.f) == null) {
            g0Var = null;
        } else {
            g0Var = eVar.f29059b;
        }
        int i6 = d0Var.f24586x;
        String str = d0Var.f24583u.f24752b;
        boolean z10 = false;
        if (i6 != 307 && i6 != 308) {
            if (i6 != 401) {
                if (i6 != 421) {
                    if (i6 != 503) {
                        if (i6 != 407) {
                            if (i6 != 408) {
                                switch (i6) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f30157a.f24725z) {
                                return null;
                            } else {
                                d0 d0Var2 = d0Var.D;
                                if ((d0Var2 != null && d0Var2.f24586x == 408) || d(d0Var, 0) > 0) {
                                    return null;
                                }
                                return d0Var.f24583u;
                            }
                        } else {
                            kotlin.jvm.internal.i.d(g0Var);
                            if (g0Var.f24613b.type() == Proxy.Type.HTTP) {
                                this.f30157a.H.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        d0 d0Var3 = d0Var.D;
                        if ((d0Var3 != null && d0Var3.f24586x == 503) || d(d0Var, SubsamplingScaleImageView.TILE_SIZE_AUTO) != 0) {
                            return null;
                        }
                        return d0Var.f24583u;
                    }
                } else if (bVar == null || !(!kotlin.jvm.internal.i.b(bVar.f29026c.f29040b.f24535i.f24689d, bVar.f.f29059b.f24612a.f24535i.f24689d))) {
                    return null;
                } else {
                    pv.e eVar2 = bVar.f;
                    synchronized (eVar2) {
                        eVar2.f29067k = true;
                    }
                    return d0Var.f24583u;
                }
            } else {
                this.f30157a.A.getClass();
                return null;
            }
        }
        x xVar = this.f30157a;
        if (!xVar.B || (e10 = d0.e(d0Var, "Location")) == null) {
            return null;
        }
        z zVar = d0Var.f24583u;
        t tVar = zVar.f24751a;
        tVar.getClass();
        try {
            aVar = new t.a();
            aVar.d(tVar, e10);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar == null) {
            a10 = null;
        } else {
            a10 = aVar.a();
        }
        if (a10 == null) {
            return null;
        }
        if (!kotlin.jvm.internal.i.b(a10.f24686a, zVar.f24751a.f24686a) && !xVar.C) {
            return null;
        }
        z.a aVar2 = new z.a(zVar);
        if (b0.p(str)) {
            boolean b10 = kotlin.jvm.internal.i.b(str, "PROPFIND");
            int i10 = d0Var.f24586x;
            z10 = (b10 || i10 == 308 || i10 == 307) ? true : true;
            if ((true ^ kotlin.jvm.internal.i.b(str, "PROPFIND")) && i10 != 308 && i10 != 307) {
                aVar2.c("GET", null);
            } else {
                if (z10) {
                    c0Var = zVar.f24754d;
                }
                aVar2.c(str, c0Var);
            }
            if (!z10) {
                aVar2.f24758c.f("Transfer-Encoding");
                aVar2.f24758c.f("Content-Length");
                aVar2.f24758c.f("Content-Type");
            }
        }
        if (!mv.b.a(zVar.f24751a, a10)) {
            aVar2.f24758c.f("Authorization");
        }
        aVar2.f24756a = a10;
        return aVar2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(IOException iOException, pv.d dVar, z zVar, boolean z10) {
        boolean z11;
        boolean z12;
        g0 g0Var;
        boolean z13;
        j jVar;
        pv.e eVar;
        if (!this.f30157a.f24725z) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z10))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        pv.c cVar = dVar.C;
        kotlin.jvm.internal.i.d(cVar);
        int i6 = cVar.f29044g;
        if (i6 == 0 && cVar.f29045h == 0 && cVar.f29046i == 0) {
            z12 = false;
        } else {
            if (cVar.f29047j == null) {
                if (i6 <= 1 && cVar.f29045h <= 1 && cVar.f29046i <= 0 && (eVar = cVar.f29041c.D) != null) {
                    synchronized (eVar) {
                        if (eVar.f29068l == 0) {
                            if (mv.b.a(eVar.f29059b.f24612a.f24535i, cVar.f29040b.f24535i)) {
                                g0Var = eVar.f29059b;
                            }
                        }
                    }
                    if (g0Var == null) {
                        cVar.f29047j = g0Var;
                    } else {
                        j.a aVar = cVar.f29043e;
                        if (aVar != null && aVar.a()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13 && (jVar = cVar.f) != null) {
                            z12 = jVar.a();
                        }
                    }
                }
                g0Var = null;
                if (g0Var == null) {
                }
            }
            z12 = true;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}

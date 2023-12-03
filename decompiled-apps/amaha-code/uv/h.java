package uv;

import android.util.Log;
import androidx.work.k;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import lv.x;
import lv.y;
/* compiled from: Platform.kt */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a */
    public static volatile h f34614a;

    /* renamed from: b */
    public static final Logger f34615b;

    /* compiled from: Platform.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ArrayList a(List protocols) {
            boolean z10;
            i.g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((y) obj) != y.HTTP_1_0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).f24750u);
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            i.g(protocols, "protocols");
            zv.e eVar = new zv.e();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.L0(str.length());
                eVar.R0(str);
            }
            return eVar.c0(eVar.f39885v);
        }

        public static boolean c() {
            return i.b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0096, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00b7, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00d8, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0100, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0171  */
    static {
        h hVar;
        Level level;
        new a();
        h hVar2 = null;
        if (a.c()) {
            for (Map.Entry<String, String> entry : vv.c.f36166b.entrySet()) {
                String value = entry.getValue();
                Logger logger = Logger.getLogger(entry.getKey());
                if (vv.c.f36165a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    if (Log.isLoggable(value, 3)) {
                        level = Level.FINE;
                    } else if (Log.isLoggable(value, 4)) {
                        level = Level.INFO;
                    } else {
                        level = Level.WARNING;
                    }
                    logger.setLevel(level);
                    logger.addHandler(vv.d.f36167a);
                }
            }
            if (uv.a.f34592d) {
                hVar = new uv.a();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                if (b.f34594e) {
                    hVar2 = new b();
                }
                i.d(hVar2);
                hVar = hVar2;
            }
        } else {
            if (i.b("Conscrypt", Security.getProviders()[0].getName())) {
                if (d.f34601d) {
                    hVar = new d();
                } else {
                    hVar = null;
                }
            }
            if (i.b("BC", Security.getProviders()[0].getName())) {
                if (c.f34599d) {
                    hVar = new c();
                } else {
                    hVar = null;
                }
            }
            if (i.b("OpenJSSE", Security.getProviders()[0].getName())) {
                if (g.f34612d) {
                    hVar = new g();
                } else {
                    hVar = null;
                }
            }
            if (f.f34611c) {
                hVar = new f();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                String jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    i.f(jvmVersion, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f34614a = hVar;
        f34615b = Logger.getLogger(x.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName(i.n("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> clientProviderClass = Class.forName(i.n("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> serverProviderClass = Class.forName(i.n("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
            Method getMethod = cls.getMethod("get", SSLSocket.class);
            Method removeMethod = cls.getMethod("remove", SSLSocket.class);
            i.f(putMethod, "putMethod");
            i.f(getMethod, "getMethod");
            i.f(removeMethod, "removeMethod");
            i.f(clientProviderClass, "clientProviderClass");
            i.f(serverProviderClass, "serverProviderClass");
            hVar2 = new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (hVar2 == null) {
            hVar = new h();
            f34614a = hVar;
            f34615b = Logger.getLogger(x.class.getName());
        }
        hVar = hVar2;
        f34614a = hVar;
        f34615b = Logger.getLogger(x.class.getName());
        if (hVar2 == null) {
        }
        hVar = hVar2;
        f34614a = hVar;
        f34615b = Logger.getLogger(x.class.getName());
    }

    public static void i(int i6, String message, Throwable th2) {
        Level level;
        i.g(message, "message");
        if (i6 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f34615b.log(level, message, th2);
    }

    public static /* synthetic */ void j(h hVar, String str, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i6 = 4;
        }
        hVar.getClass();
        i(i6, str, null);
    }

    public k b(X509TrustManager x509TrustManager) {
        return new xv.a(c(x509TrustManager));
    }

    public xv.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new xv.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        i.g(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i6) {
        i.g(address, "address");
        socket.connect(address, i6);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f34615b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        i.g(hostname, "hostname");
        return true;
    }

    public void k(Object obj, String message) {
        i.g(message, "message");
        if (obj == null) {
            message = i.n(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        i.f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l2 = l();
            l2.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l2.getSocketFactory();
            i.f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(i.n(e10, "No System TLS: "), e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        i.d(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        i.f(arrays, "toString(this)");
        throw new IllegalStateException(i.n(arrays, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}

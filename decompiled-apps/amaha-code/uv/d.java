package uv;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import lv.y;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import uv.h;
/* compiled from: ConscryptPlatform.kt */
/* loaded from: classes2.dex */
public final class d extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f34601d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34602c;

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
                return true;
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
                return true;
            } else if (version.patch() < 0) {
                return false;
            } else {
                return true;
            }
        }

        public static boolean b() {
            return d.f34601d;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34603a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (a.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f34601d = z10;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        i.f(newProvider, "newProvider()");
        this.f34602c = newProvider;
    }

    @Override // uv.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        i.g(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, protocols);
    }

    @Override // uv.h
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // uv.h
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f34602c);
        i.f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // uv.h
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l2 = l();
        l2.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = l2.getSocketFactory();
        i.f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // uv.h
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        i.d(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f34603a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        i.f(arrays, "toString(this)");
        throw new IllegalStateException(i.n(arrays, "Unexpected default trust managers: ").toString());
    }
}

package uv;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import lv.y;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import uv.h;
/* compiled from: BouncyCastlePlatform.kt */
/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f34599d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34600c = new BouncyCastleJsseProvider();

    /* compiled from: BouncyCastlePlatform.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f34599d = z10;
    }

    @Override // uv.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        i.g(protocols, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, protocols);
    }

    @Override // uv.h
    public final String f(SSLSocket sSLSocket) {
        boolean b10;
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null) {
                b10 = true;
            } else {
                b10 = i.b(applicationProtocol, "");
            }
            if (!b10) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // uv.h
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f34600c);
        i.f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // uv.h
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}

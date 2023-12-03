package vv;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
/* compiled from: AndroidCertificateChainCleaner.kt */
/* loaded from: classes2.dex */
public final class b extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f36163b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f36164c;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f36163b = x509TrustManager;
        this.f36164c = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f36163b == this.f36163b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f36163b);
    }

    @Override // androidx.work.k
    public final List j(String hostname, List chain) {
        kotlin.jvm.internal.i.g(chain, "chain");
        kotlin.jvm.internal.i.g(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f36164c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                kotlin.jvm.internal.i.f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

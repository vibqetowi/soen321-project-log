package xv;

import androidx.work.k;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;
/* compiled from: BasicCertificateChainCleaner.kt */
/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: b  reason: collision with root package name */
    public final d f38129b;

    public a(d trustRootIndex) {
        i.g(trustRootIndex, "trustRootIndex");
        this.f38129b = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && i.b(((a) obj).f38129b, this.f38129b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38129b.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c A[SYNTHETIC] */
    @Override // androidx.work.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j(String hostname, List chain) {
        boolean z10;
        boolean z11;
        i.g(chain, "chain");
        i.g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.f(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i6 = 0;
        boolean z12 = false;
        while (i6 < 9) {
            i6++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a10 = this.f38129b.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || !i.b(x509Certificate, a10)) {
                    arrayList.add(a10);
                }
                if (i.b(a10.getIssuerDN(), a10.getSubjectDN())) {
                    try {
                        a10.verify(a10.getPublicKey());
                        z10 = true;
                    } catch (GeneralSecurityException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        return arrayList;
                    }
                    z12 = true;
                }
                z10 = false;
                if (!z10) {
                }
            } else {
                Iterator it = arrayDeque.iterator();
                i.f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (i.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                            try {
                                x509Certificate.verify(x509Certificate2.getPublicKey());
                                z11 = true;
                                continue;
                            } catch (GeneralSecurityException unused2) {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        }
                        z11 = false;
                        continue;
                        if (z11) {
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z12) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(i.n(x509Certificate, "Failed to find a trusted cert that signed "));
            }
        }
        throw new SSLPeerUnverifiedException(i.n(arrayList, "Certificate chain too long: "));
    }
}

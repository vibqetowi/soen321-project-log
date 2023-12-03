package xv;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.i;
/* compiled from: BasicTrustRootIndex.kt */
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f38130a;

    public b(X509Certificate... caCerts) {
        i.g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i6 = 0;
        while (i6 < length) {
            X509Certificate x509Certificate = caCerts[i6];
            i6++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            i.f(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f38130a = linkedHashMap;
    }

    @Override // xv.d
    public final X509Certificate a(X509Certificate cert) {
        boolean z10;
        i.g(cert, "cert");
        Set set = (Set) this.f38130a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
                continue;
            } catch (Exception unused) {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof b) || !i.b(((b) obj).f38130a, this.f38130a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f38130a.hashCode();
    }
}

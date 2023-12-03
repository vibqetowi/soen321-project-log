package lv;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: CertificatePinner.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f24609c = new g(is.u.M2(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f24610a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.work.k f24611b;

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            if (!kotlin.jvm.internal.i.b(null, null)) {
                return false;
            }
            aVar.getClass();
            if (!kotlin.jvm.internal.i.b(null, null)) {
                return false;
            }
            aVar.getClass();
            if (kotlin.jvm.internal.i.b(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public g(Set<a> pins, androidx.work.k kVar) {
        kotlin.jvm.internal.i.g(pins, "pins");
        this.f24610a = pins;
        this.f24611b = kVar;
    }

    public final void a(String hostname, ss.a<? extends List<? extends X509Certificate>> aVar) {
        kotlin.jvm.internal.i.g(hostname, "hostname");
        Iterator<T> it = this.f24610a.iterator();
        if (!it.hasNext()) {
            return;
        }
        ((a) it.next()).getClass();
        gv.n.H0(null, "**.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.i.b(gVar.f24610a, this.f24610a) && kotlin.jvm.internal.i.b(gVar.f24611b, this.f24611b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = (this.f24610a.hashCode() + 1517) * 41;
        androidx.work.k kVar = this.f24611b;
        if (kVar != null) {
            i6 = kVar.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }
}

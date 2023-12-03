package r1;

import android.os.Bundle;
/* compiled from: MediaRouteDiscoveryRequest.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f30256a;

    /* renamed from: b  reason: collision with root package name */
    public k f30257b;

    public f(k kVar, boolean z10) {
        if (kVar != null) {
            Bundle bundle = new Bundle();
            this.f30256a = bundle;
            this.f30257b = kVar;
            bundle.putBundle("selector", kVar.f30287a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f30257b == null) {
            k b10 = k.b(this.f30256a.getBundle("selector"));
            this.f30257b = b10;
            if (b10 == null) {
                this.f30257b = k.f30286c;
            }
        }
    }

    public final boolean b() {
        return this.f30256a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        a();
        k kVar = this.f30257b;
        fVar.a();
        if (!kVar.equals(fVar.f30257b) || b() != fVar.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        a();
        return this.f30257b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f30257b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        k kVar = this.f30257b;
        kVar.a();
        sb2.append(!kVar.f30288b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}

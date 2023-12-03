package qu;

import kotlin.jvm.internal.i;
import wu.b0;
import wu.i0;
/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes2.dex */
public final class c implements d, f {

    /* renamed from: a  reason: collision with root package name */
    public final gt.e f30139a;

    /* renamed from: b  reason: collision with root package name */
    public final gt.e f30140b;

    public c(kt.b classDescriptor) {
        i.g(classDescriptor, "classDescriptor");
        this.f30139a = classDescriptor;
        this.f30140b = classDescriptor;
    }

    @Override // qu.d
    public final b0 a() {
        i0 r = this.f30139a.r();
        i.f(r, "classDescriptor.defaultType");
        return r;
    }

    public final boolean equals(Object obj) {
        c cVar;
        gt.e eVar = null;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            eVar = cVar.f30139a;
        }
        return i.b(this.f30139a, eVar);
    }

    public final int hashCode() {
        return this.f30139a.hashCode();
    }

    @Override // qu.f
    public final gt.e q() {
        return this.f30139a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        i0 r = this.f30139a.r();
        i.f(r, "classDescriptor.defaultType");
        sb2.append(r);
        sb2.append('}');
        return sb2.toString();
    }
}

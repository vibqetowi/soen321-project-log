package c7;

import c7.o;
/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f5060a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f5061b;

    public i(o.b bVar, o.a aVar) {
        this.f5060a = bVar;
        this.f5061b = aVar;
    }

    @Override // c7.o
    public final o.a a() {
        return this.f5061b;
    }

    @Override // c7.o
    public final o.b b() {
        return this.f5060a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f5060a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f5061b;
            if (aVar == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        o.b bVar = this.f5060a;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        o.a aVar = this.f5061b;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return i6 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5060a + ", mobileSubtype=" + this.f5061b + "}";
    }
}

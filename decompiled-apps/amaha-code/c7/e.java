package c7;

import c7.k;
/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f5039a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5040b;

    public e(k.a aVar, a aVar2) {
        this.f5039a = aVar;
        this.f5040b = aVar2;
    }

    @Override // c7.k
    public final a a() {
        return this.f5040b;
    }

    @Override // c7.k
    public final k.a b() {
        return this.f5039a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f5039a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f5040b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        k.a aVar = this.f5039a;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        a aVar2 = this.f5040b;
        if (aVar2 != null) {
            i6 = aVar2.hashCode();
        }
        return i6 ^ i10;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f5039a + ", androidClientInfo=" + this.f5040b + "}";
    }
}

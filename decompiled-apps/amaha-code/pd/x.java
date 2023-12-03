package pd;

import pd.d0;
/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes.dex */
public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0.a f28374a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.c f28375b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.b f28376c;

    public x(y yVar, a0 a0Var, z zVar) {
        this.f28374a = yVar;
        this.f28375b = a0Var;
        this.f28376c = zVar;
    }

    @Override // pd.d0
    public final d0.a a() {
        return this.f28374a;
    }

    @Override // pd.d0
    public final d0.b b() {
        return this.f28376c;
    }

    @Override // pd.d0
    public final d0.c c() {
        return this.f28375b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f28374a.equals(d0Var.a()) && this.f28375b.equals(d0Var.c()) && this.f28376c.equals(d0Var.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f28374a.hashCode() ^ 1000003) * 1000003) ^ this.f28375b.hashCode()) * 1000003) ^ this.f28376c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f28374a + ", osData=" + this.f28375b + ", deviceData=" + this.f28376c + "}";
    }
}

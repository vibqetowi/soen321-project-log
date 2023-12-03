package tr;
/* compiled from: ConnectivityStateInfo.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final j f33510a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f33511b;

    public k(j jVar, i0 i0Var) {
        this.f33510a = jVar;
        sc.b.w(i0Var, "status is null");
        this.f33511b = i0Var;
    }

    public static k a(j jVar) {
        boolean z10;
        if (jVar != j.TRANSIENT_FAILURE) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.s("state is TRANSIENT_ERROR. Use forError() instead", z10);
        return new k(jVar, i0.f33481e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f33510a.equals(kVar.f33510a) || !this.f33511b.equals(kVar.f33511b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f33510a.hashCode() ^ this.f33511b.hashCode();
    }

    public final String toString() {
        i0 i0Var = this.f33511b;
        boolean e10 = i0Var.e();
        j jVar = this.f33510a;
        if (e10) {
            return jVar.toString();
        }
        return jVar + "(" + i0Var + ")";
    }
}

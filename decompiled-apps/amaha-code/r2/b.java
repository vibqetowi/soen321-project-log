package r2;
/* compiled from: NetworkState.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30375a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30376b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30377c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f30378d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30375a = z10;
        this.f30376b = z11;
        this.f30377c = z12;
        this.f30378d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f30375a == bVar.f30375a && this.f30376b == bVar.f30376b && this.f30377c == bVar.f30377c && this.f30378d == bVar.f30378d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i6 = 1;
        boolean z10 = this.f30375a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        boolean z11 = this.f30376b;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f30377c;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f30378d;
        if (!z13) {
            i6 = z13 ? 1 : 0;
        }
        return i15 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f30375a);
        sb2.append(", isValidated=");
        sb2.append(this.f30376b);
        sb2.append(", isMetered=");
        sb2.append(this.f30377c);
        sb2.append(", isNotRoaming=");
        return defpackage.c.t(sb2, this.f30378d, ')');
    }
}

package fe;
/* compiled from: SnapshotMetadata.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15015a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15016b;

    public u(boolean z10, boolean z11) {
        this.f15015a = z10;
        this.f15016b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f15015a == uVar.f15015a && this.f15016b == uVar.f15016b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15015a ? 1 : 0) * 31) + (this.f15016b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnapshotMetadata{hasPendingWrites=");
        sb2.append(this.f15015a);
        sb2.append(", isFromCache=");
        return defpackage.c.t(sb2, this.f15016b, '}');
    }
}

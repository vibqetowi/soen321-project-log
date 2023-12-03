package ke;
/* compiled from: SnapshotVersion.java */
/* loaded from: classes.dex */
public final class r implements Comparable<r> {

    /* renamed from: v  reason: collision with root package name */
    public static final r f23293v = new r(new sc.h(0, 0));

    /* renamed from: u  reason: collision with root package name */
    public final sc.h f23294u;

    public r(sc.h hVar) {
        this.f23294u = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(r rVar) {
        return this.f23294u.compareTo(rVar.f23294u);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && compareTo((r) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23294u.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnapshotVersion(seconds=");
        sc.h hVar = this.f23294u;
        sb2.append(hVar.f31450u);
        sb2.append(", nanos=");
        return pl.a.g(sb2, hVar.f31451v, ")");
    }
}

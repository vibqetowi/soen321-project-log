package fe;
/* compiled from: Blob.java */
/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: u  reason: collision with root package name */
    public final com.google.protobuf.h f14978u;

    public a(com.google.protobuf.h hVar) {
        this.f14978u = hVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return oe.n.c(this.f14978u, aVar.f14978u);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f14978u.equals(((a) obj).f14978u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14978u.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + oe.n.h(this.f14978u) + " }";
    }
}

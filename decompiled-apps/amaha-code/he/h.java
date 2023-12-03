package he;
/* compiled from: DocumentViewChange.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a f17512a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.g f17513b;

    /* compiled from: DocumentViewChange.java */
    /* loaded from: classes.dex */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public h(a aVar, ke.g gVar) {
        this.f17512a = aVar;
        this.f17513b = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f17512a.equals(hVar.f17512a) || !this.f17513b.equals(hVar.f17513b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ke.g gVar = this.f17513b;
        int hashCode = gVar.getKey().hashCode();
        return gVar.getData().hashCode() + ((hashCode + ((this.f17512a.hashCode() + 1891) * 31)) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f17513b + "," + this.f17512a + ")";
    }
}

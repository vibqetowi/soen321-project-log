package he;
/* compiled from: LimboDocumentChange.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final a f17560a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.i f17561b;

    /* compiled from: LimboDocumentChange.java */
    /* loaded from: classes.dex */
    public enum a {
        ADDED,
        REMOVED
    }

    public s(a aVar, ke.i iVar) {
        this.f17560a = aVar;
        this.f17561b = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f17560a.equals(sVar.f17560a) || !this.f17561b.equals(sVar.f17561b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17561b.hashCode() + ((this.f17560a.hashCode() + 2077) * 31);
    }
}

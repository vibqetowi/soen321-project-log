package si;
/* compiled from: DisplayControl.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f31585a;

    public c(f fVar) {
        this.f31585a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        f fVar = ((c) obj).f31585a;
        f fVar2 = this.f31585a;
        if (fVar2 != null) {
            return fVar2.equals(fVar);
        }
        if (fVar == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DisplayControl{rules=" + this.f31585a + '}';
    }
}

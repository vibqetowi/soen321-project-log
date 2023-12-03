package pi;
/* compiled from: Border.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f28443a;

    /* renamed from: b  reason: collision with root package name */
    public final double f28444b;

    /* renamed from: c  reason: collision with root package name */
    public final double f28445c;

    public b(f fVar, double d10, double d11) {
        this.f28443a = fVar;
        this.f28444b = d10;
        this.f28445c = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (Double.compare(bVar.f28444b, this.f28444b) != 0 || Double.compare(bVar.f28445c, this.f28445c) != 0) {
            return false;
        }
        f fVar = bVar.f28443a;
        f fVar2 = this.f28443a;
        if (fVar2 != null) {
            return fVar2.equals(fVar);
        }
        if (fVar == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Border{color='" + this.f28443a + "', radius=" + this.f28444b + ", width=" + this.f28445c + '}';
    }
}

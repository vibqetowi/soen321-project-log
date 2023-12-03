package le;
/* compiled from: AutoValue_Overlay.java */
/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public final int f24209a;

    /* renamed from: b  reason: collision with root package name */
    public final f f24210b;

    public b(int i6, f fVar) {
        this.f24209a = i6;
        this.f24210b = fVar;
    }

    @Override // le.j
    public final int b() {
        return this.f24209a;
    }

    @Override // le.j
    public final f c() {
        return this.f24210b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f24209a == jVar.b() && this.f24210b.equals(jVar.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24209a ^ 1000003) * 1000003) ^ this.f24210b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f24209a + ", mutation=" + this.f24210b + "}";
    }
}

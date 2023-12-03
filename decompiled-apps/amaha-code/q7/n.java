package q7;
/* compiled from: AuxEffectInfo.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f29288a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final float f29289b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f29288a == nVar.f29288a && Float.compare(nVar.f29289b, this.f29289b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29289b) + ((527 + this.f29288a) * 31);
    }
}

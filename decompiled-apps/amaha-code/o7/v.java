package o7;
/* compiled from: RendererConfiguration.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final v f27253b = new v(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27254a;

    public v(boolean z10) {
        this.f27254a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass() && this.f27254a == ((v) obj).f27254a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f27254a ? 1 : 0;
    }
}

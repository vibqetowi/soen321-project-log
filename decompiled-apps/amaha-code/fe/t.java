package fe;
/* compiled from: SetOptions.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final t f15011c = new t(false);

    /* renamed from: d  reason: collision with root package name */
    public static final t f15012d = new t(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15013a;

    /* renamed from: b  reason: collision with root package name */
    public final le.d f15014b = null;

    public t(boolean z10) {
        this.f15013a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f15013a != tVar.f15013a) {
            return false;
        }
        le.d dVar = tVar.f15014b;
        le.d dVar2 = this.f15014b;
        if (dVar2 != null) {
            return dVar2.equals(dVar);
        }
        if (dVar == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (this.f15013a ? 1 : 0) * 31;
        le.d dVar = this.f15014b;
        if (dVar != null) {
            i6 = dVar.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }
}

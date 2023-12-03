package sf;
/* compiled from: JsonObject.java */
/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: u  reason: collision with root package name */
    public final uf.k<String, m> f31511u = new uf.k<>();

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof o) || !((o) obj).f31511u.equals(this.f31511u))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f31511u.hashCode();
    }
}

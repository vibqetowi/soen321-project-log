package s0;
/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f31064a;

    /* renamed from: b  reason: collision with root package name */
    public final S f31065b;

    public c(F f, S s10) {
        this.f31064a = f;
        this.f31065b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f31064a, this.f31064a) || !b.a(cVar.f31065b, this.f31065b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        F f = this.f31064a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s10 = this.f31065b;
        if (s10 != null) {
            i6 = s10.hashCode();
        }
        return i6 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f31064a + " " + this.f31065b + "}";
    }
}

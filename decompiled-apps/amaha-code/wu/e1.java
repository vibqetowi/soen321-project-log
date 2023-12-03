package wu;
/* compiled from: TypeProjectionBase.java */
/* loaded from: classes2.dex */
public abstract class e1 implements d1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (d() == d1Var.d() && b() == d1Var.b() && a().equals(d1Var.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = b().hashCode();
        if (k1.q(a())) {
            return (hashCode2 * 31) + 19;
        }
        int i6 = hashCode2 * 31;
        if (d()) {
            hashCode = 17;
        } else {
            hashCode = a().hashCode();
        }
        return i6 + hashCode;
    }

    public final String toString() {
        if (d()) {
            return "*";
        }
        if (b() == n1.INVARIANT) {
            return a().toString();
        }
        return b() + " " + a();
    }
}

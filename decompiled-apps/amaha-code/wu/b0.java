package wu;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class b0 implements ht.a, zu.h {

    /* renamed from: u  reason: collision with root package name */
    public int f37208u;

    public abstract List<d1> M0();

    public abstract v0 N0();

    public abstract x0 O0();

    public abstract boolean P0();

    public abstract b0 Q0(xu.e eVar);

    public abstract m1 R0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (P0() == b0Var.P0()) {
            m1 a10 = R0();
            m1 b10 = b0Var.R0();
            kotlin.jvm.internal.i.g(a10, "a");
            kotlin.jvm.internal.i.g(b10, "b");
            if (uf.c.c(f6.b.M, a10, b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        return j.a(N0());
    }

    public final int hashCode() {
        int hashCode;
        int i6 = this.f37208u;
        if (i6 != 0) {
            return i6;
        }
        if (ta.v.E(this)) {
            hashCode = super.hashCode();
        } else {
            int hashCode2 = M0().hashCode();
            hashCode = (P0() ? 1 : 0) + ((hashCode2 + (O0().hashCode() * 31)) * 31);
        }
        this.f37208u = hashCode;
        return hashCode;
    }

    public abstract pu.i p();
}

package wu;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class o1 extends b0 {
    @Override // wu.b0
    public final List<d1> M0() {
        return S0().M0();
    }

    @Override // wu.b0
    public final v0 N0() {
        return S0().N0();
    }

    @Override // wu.b0
    public final x0 O0() {
        return S0().O0();
    }

    @Override // wu.b0
    public final boolean P0() {
        return S0().P0();
    }

    @Override // wu.b0
    public final m1 R0() {
        b0 S0 = S0();
        while (S0 instanceof o1) {
            S0 = ((o1) S0).S0();
        }
        kotlin.jvm.internal.i.e(S0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (m1) S0;
    }

    public abstract b0 S0();

    public boolean T0() {
        return true;
    }

    @Override // wu.b0
    public final pu.i p() {
        return S0().p();
    }

    public final String toString() {
        if (T0()) {
            return S0().toString();
        }
        return "<Not computed yet>";
    }
}

package wu;

import java.util.List;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public abstract class q extends i0 {
    @Override // wu.b0
    public final List<d1> M0() {
        return X0().M0();
    }

    @Override // wu.b0
    public v0 N0() {
        return X0().N0();
    }

    @Override // wu.b0
    public final x0 O0() {
        return X0().O0();
    }

    @Override // wu.b0
    public boolean P0() {
        return X0().P0();
    }

    public abstract i0 X0();

    @Override // wu.m1
    /* renamed from: Y0 */
    public i0 T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(X0());
        kotlin.jvm.internal.i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Z0((i0) H);
    }

    public abstract q Z0(i0 i0Var);

    @Override // wu.b0
    public final pu.i p() {
        return X0().p();
    }
}

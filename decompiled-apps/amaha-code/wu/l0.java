package wu;
/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes2.dex */
public final class l0 extends q implements l1 {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f37267v;

    /* renamed from: w  reason: collision with root package name */
    public final b0 f37268w;

    public l0(i0 delegate, b0 enhancement) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        kotlin.jvm.internal.i.g(enhancement, "enhancement");
        this.f37267v = delegate;
        this.f37268w = enhancement;
    }

    @Override // wu.l1
    public final b0 I() {
        return this.f37268w;
    }

    @Override // wu.l1
    public final m1 I0() {
        return this.f37267v;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        m1 C1 = ca.a.C1(this.f37267v.S0(z10), this.f37268w.R0().S0(z10));
        kotlin.jvm.internal.i.e(C1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (i0) C1;
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        m1 C1 = ca.a.C1(this.f37267v.U0(newAttributes), this.f37268w);
        kotlin.jvm.internal.i.e(C1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (i0) C1;
    }

    @Override // wu.q
    public final i0 X0() {
        return this.f37267v;
    }

    @Override // wu.q
    public final q Z0(i0 i0Var) {
        return new l0(i0Var, this.f37268w);
    }

    @Override // wu.q
    /* renamed from: a1 */
    public final l0 Y0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(this.f37267v);
        kotlin.jvm.internal.i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new l0((i0) H, kotlinTypeRefiner.H(this.f37268w));
    }

    @Override // wu.i0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f37268w + ")] " + this.f37267v;
    }
}

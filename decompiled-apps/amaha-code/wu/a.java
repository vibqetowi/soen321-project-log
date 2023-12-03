package wu;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class a extends q {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f37199v;

    /* renamed from: w  reason: collision with root package name */
    public final i0 f37200w;

    public a(i0 delegate, i0 abbreviation) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        kotlin.jvm.internal.i.g(abbreviation, "abbreviation");
        this.f37199v = delegate;
        this.f37200w = abbreviation;
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new a(this.f37199v.U0(newAttributes), this.f37200w);
    }

    @Override // wu.q
    public final i0 X0() {
        return this.f37199v;
    }

    @Override // wu.q
    public final q Z0(i0 i0Var) {
        return new a(i0Var, this.f37200w);
    }

    @Override // wu.i0
    /* renamed from: a1 */
    public final a V0(boolean z10) {
        return new a(this.f37199v.S0(z10), this.f37200w.S0(z10));
    }

    @Override // wu.q
    /* renamed from: b1 */
    public final a Y0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(this.f37199v);
        kotlin.jvm.internal.i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        b0 H2 = kotlinTypeRefiner.H(this.f37200w);
        kotlin.jvm.internal.i.e(H2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((i0) H, (i0) H2);
    }
}

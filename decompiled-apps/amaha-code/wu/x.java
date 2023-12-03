package wu;
/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes2.dex */
public final class x extends v implements l1 {

    /* renamed from: x  reason: collision with root package name */
    public final v f37313x;

    /* renamed from: y  reason: collision with root package name */
    public final b0 f37314y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v origin, b0 enhancement) {
        super(origin.f37298v, origin.f37299w);
        kotlin.jvm.internal.i.g(origin, "origin");
        kotlin.jvm.internal.i.g(enhancement, "enhancement");
        this.f37313x = origin;
        this.f37314y = enhancement;
    }

    @Override // wu.l1
    public final b0 I() {
        return this.f37314y;
    }

    @Override // wu.l1
    public final m1 I0() {
        return this.f37313x;
    }

    @Override // wu.m1
    public final m1 S0(boolean z10) {
        return ca.a.C1(this.f37313x.S0(z10), this.f37314y.R0().S0(z10));
    }

    @Override // wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return ca.a.C1(this.f37313x.U0(newAttributes), this.f37314y);
    }

    @Override // wu.v
    public final i0 V0() {
        return this.f37313x.V0();
    }

    @Override // wu.v
    public final String W0(hu.c renderer, hu.j options) {
        kotlin.jvm.internal.i.g(renderer, "renderer");
        kotlin.jvm.internal.i.g(options, "options");
        if (options.e()) {
            return renderer.u(this.f37314y);
        }
        return this.f37313x.W0(renderer, options);
    }

    @Override // wu.m1
    /* renamed from: X0 */
    public final x T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(this.f37313x);
        kotlin.jvm.internal.i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new x((v) H, kotlinTypeRefiner.H(this.f37314y));
    }

    @Override // wu.v
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f37314y + ")] " + this.f37313x;
    }
}

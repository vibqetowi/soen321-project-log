package wu;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class k0 extends r {

    /* renamed from: w  reason: collision with root package name */
    public final v0 f37260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 delegate, v0 attributes) {
        super(delegate);
        kotlin.jvm.internal.i.g(delegate, "delegate");
        kotlin.jvm.internal.i.g(attributes, "attributes");
        this.f37260w = attributes;
    }

    @Override // wu.q, wu.b0
    public final v0 N0() {
        return this.f37260w;
    }

    @Override // wu.q
    public final q Z0(i0 i0Var) {
        return new k0(i0Var, this.f37260w);
    }
}

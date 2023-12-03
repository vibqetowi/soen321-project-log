package wu;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public abstract class r extends q {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f37288v;

    public r(i0 delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f37288v = delegate;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10 == P0()) {
            return this;
        }
        return this.f37288v.S0(z10).U0(N0());
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        if (newAttributes != N0()) {
            return new k0(this, newAttributes);
        }
        return this;
    }

    @Override // wu.q
    public final i0 X0() {
        return this.f37288v;
    }
}

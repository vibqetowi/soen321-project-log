package wu;

import java.util.List;
/* compiled from: StubTypes.kt */
/* loaded from: classes2.dex */
public abstract class c extends i0 {

    /* renamed from: v  reason: collision with root package name */
    public final xu.m f37210v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f37211w;

    /* renamed from: x  reason: collision with root package name */
    public final yu.e f37212x;

    public c(xu.m originalTypeVariable, boolean z10) {
        kotlin.jvm.internal.i.g(originalTypeVariable, "originalTypeVariable");
        this.f37210v = originalTypeVariable;
        this.f37211w = z10;
        this.f37212x = yu.i.b(5, originalTypeVariable.toString());
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return is.w.f20676u;
    }

    @Override // wu.b0
    public final v0 N0() {
        v0.f37300v.getClass();
        return v0.f37301w;
    }

    @Override // wu.b0
    public final boolean P0() {
        return this.f37211w;
    }

    @Override // wu.b0
    public final b0 Q0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // wu.m1
    public final m1 T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // wu.i0, wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return this;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10 == this.f37211w) {
            return this;
        }
        return X0(z10);
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return this;
    }

    public abstract p0 X0(boolean z10);

    @Override // wu.b0
    public pu.i p() {
        return this.f37212x;
    }
}

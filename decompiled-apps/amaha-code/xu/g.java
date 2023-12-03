package xu;

import is.w;
import java.util.List;
import wu.d1;
import wu.i0;
import wu.m1;
import wu.v0;
import wu.x0;
/* compiled from: NewCapturedType.kt */
/* loaded from: classes2.dex */
public final class g extends i0 implements zu.d {
    public final boolean A;

    /* renamed from: v  reason: collision with root package name */
    public final zu.b f38099v;

    /* renamed from: w  reason: collision with root package name */
    public final i f38100w;

    /* renamed from: x  reason: collision with root package name */
    public final m1 f38101x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f38102y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f38103z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(zu.b bVar, i iVar, m1 m1Var, v0 v0Var, boolean z10, int i6) {
        this(bVar, iVar, m1Var, v0Var, (i6 & 16) != 0 ? false : z10, false);
        if ((i6 & 8) != 0) {
            v0.f37300v.getClass();
            v0Var = v0.f37301w;
        }
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return w.f20676u;
    }

    @Override // wu.b0
    public final v0 N0() {
        return this.f38102y;
    }

    @Override // wu.b0
    public final x0 O0() {
        return this.f38100w;
    }

    @Override // wu.b0
    public final boolean P0() {
        return this.f38103z;
    }

    @Override // wu.i0, wu.m1
    public final m1 S0(boolean z10) {
        return new g(this.f38099v, this.f38100w, this.f38101x, this.f38102y, z10, 32);
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        return new g(this.f38099v, this.f38100w, this.f38101x, this.f38102y, z10, 32);
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new g(this.f38099v, this.f38100w, this.f38101x, newAttributes, this.f38103z, this.A);
    }

    @Override // wu.m1
    /* renamed from: X0 */
    public final g T0(e kotlinTypeRefiner) {
        m1 m1Var;
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        zu.b bVar = this.f38099v;
        i f = this.f38100w.f(kotlinTypeRefiner);
        m1 m1Var2 = this.f38101x;
        if (m1Var2 != null) {
            m1Var = kotlinTypeRefiner.H(m1Var2).R0();
        } else {
            m1Var = null;
        }
        return new g(bVar, f, m1Var, this.f38102y, this.f38103z, 32);
    }

    @Override // wu.b0
    public final pu.i p() {
        return yu.i.a(1, true, new String[0]);
    }

    public g(zu.b captureStatus, i constructor, m1 m1Var, v0 attributes, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.g(captureStatus, "captureStatus");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(attributes, "attributes");
        this.f38099v = captureStatus;
        this.f38100w = constructor;
        this.f38101x = m1Var;
        this.f38102y = attributes;
        this.f38103z = z10;
        this.A = z11;
    }
}

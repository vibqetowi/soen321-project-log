package wu;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class v extends m1 implements zu.f {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f37298v;

    /* renamed from: w  reason: collision with root package name */
    public final i0 f37299w;

    public v(i0 lowerBound, i0 upperBound) {
        kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.i.g(upperBound, "upperBound");
        this.f37298v = lowerBound;
        this.f37299w = upperBound;
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return V0().M0();
    }

    @Override // wu.b0
    public v0 N0() {
        return V0().N0();
    }

    @Override // wu.b0
    public final x0 O0() {
        return V0().O0();
    }

    @Override // wu.b0
    public boolean P0() {
        return V0().P0();
    }

    public abstract i0 V0();

    public abstract String W0(hu.c cVar, hu.j jVar);

    @Override // wu.b0
    public pu.i p() {
        return V0().p();
    }

    public String toString() {
        return hu.c.f19529b.u(this);
    }
}

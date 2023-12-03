package gt;
/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes2.dex */
public abstract class o extends q {

    /* renamed from: a  reason: collision with root package name */
    public final c1 f16793a;

    public o(c1 delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f16793a = delegate;
    }

    @Override // gt.q
    public final c1 a() {
        return this.f16793a;
    }

    @Override // gt.q
    public final String b() {
        return this.f16793a.b();
    }

    @Override // gt.q
    public final q d() {
        return p.g(this.f16793a.c());
    }
}

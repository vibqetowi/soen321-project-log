package wu;
/* compiled from: StubTypes.kt */
/* loaded from: classes2.dex */
public final class p0 extends c {

    /* renamed from: y  reason: collision with root package name */
    public final x0 f37284y;

    /* renamed from: z  reason: collision with root package name */
    public final pu.i f37285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(xu.m originalTypeVariable, boolean z10, x0 constructor) {
        super(originalTypeVariable, z10);
        kotlin.jvm.internal.i.g(originalTypeVariable, "originalTypeVariable");
        kotlin.jvm.internal.i.g(constructor, "constructor");
        this.f37284y = constructor;
        this.f37285z = originalTypeVariable.o().f().p();
    }

    @Override // wu.b0
    public final x0 O0() {
        return this.f37284y;
    }

    @Override // wu.c
    public final p0 X0(boolean z10) {
        return new p0(this.f37210v, z10, this.f37284y);
    }

    @Override // wu.c, wu.b0
    public final pu.i p() {
        return this.f37285z;
    }

    @Override // wu.i0
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(this.f37210v);
        if (this.f37211w) {
            str = "?";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

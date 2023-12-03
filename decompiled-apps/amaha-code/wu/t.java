package wu;
/* compiled from: dynamicTypes.kt */
/* loaded from: classes2.dex */
public final class t extends v {

    /* renamed from: x  reason: collision with root package name */
    public final v0 f37297x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(dt.j jVar, v0 attributes) {
        super(r0, r3);
        kotlin.jvm.internal.i.g(attributes, "attributes");
        i0 o10 = jVar.o();
        kotlin.jvm.internal.i.f(o10, "builtIns.nothingType");
        i0 p10 = jVar.p();
        kotlin.jvm.internal.i.f(p10, "builtIns.nullableAnyType");
        this.f37297x = attributes;
    }

    @Override // wu.v, wu.b0
    public final v0 N0() {
        return this.f37297x;
    }

    @Override // wu.v, wu.b0
    public final boolean P0() {
        return false;
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

    @Override // wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new t(hc.d.F(this.f37299w), newAttributes);
    }

    @Override // wu.v
    public final i0 V0() {
        return this.f37299w;
    }

    @Override // wu.v
    public final String W0(hu.c renderer, hu.j options) {
        kotlin.jvm.internal.i.g(renderer, "renderer");
        kotlin.jvm.internal.i.g(options, "options");
        return "dynamic";
    }

    @Override // wu.m1
    public final m1 S0(boolean z10) {
        return this;
    }
}

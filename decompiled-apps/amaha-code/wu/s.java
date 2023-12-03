package wu;
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes2.dex */
public final class s extends g1 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f37293d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final g1 f37294b;

    /* renamed from: c  reason: collision with root package name */
    public final g1 f37295c;

    public s(g1 g1Var, g1 g1Var2) {
        this.f37294b = g1Var;
        this.f37295c = g1Var2;
    }

    @Override // wu.g1
    public final boolean a() {
        if (!this.f37294b.a() && !this.f37295c.a()) {
            return false;
        }
        return true;
    }

    @Override // wu.g1
    public final boolean b() {
        if (!this.f37294b.b() && !this.f37295c.b()) {
            return false;
        }
        return true;
    }

    @Override // wu.g1
    public final ht.h c(ht.h annotations) {
        kotlin.jvm.internal.i.g(annotations, "annotations");
        return this.f37295c.c(this.f37294b.c(annotations));
    }

    @Override // wu.g1
    public final d1 d(b0 b0Var) {
        d1 d10 = this.f37294b.d(b0Var);
        if (d10 == null) {
            return this.f37295c.d(b0Var);
        }
        return d10;
    }

    @Override // wu.g1
    public final b0 f(b0 topLevelType, n1 position) {
        kotlin.jvm.internal.i.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.i.g(position, "position");
        return this.f37295c.f(this.f37294b.f(topLevelType, position), position);
    }
}

package wu;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public final class y extends g1 {

    /* renamed from: b  reason: collision with root package name */
    public final gt.v0[] f37315b;

    /* renamed from: c  reason: collision with root package name */
    public final d1[] f37316c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f37317d;

    public y() {
        throw null;
    }

    public y(gt.v0[] parameters, d1[] arguments, boolean z10) {
        kotlin.jvm.internal.i.g(parameters, "parameters");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        this.f37315b = parameters;
        this.f37316c = arguments;
        this.f37317d = z10;
    }

    @Override // wu.g1
    public final boolean b() {
        return this.f37317d;
    }

    @Override // wu.g1
    public final d1 d(b0 b0Var) {
        gt.v0 v0Var;
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof gt.v0) {
            v0Var = (gt.v0) a10;
        } else {
            v0Var = null;
        }
        if (v0Var == null) {
            return null;
        }
        int index = v0Var.getIndex();
        gt.v0[] v0VarArr = this.f37315b;
        if (index >= v0VarArr.length || !kotlin.jvm.internal.i.b(v0VarArr[index].l(), v0Var.l())) {
            return null;
        }
        return this.f37316c[index];
    }

    @Override // wu.g1
    public final boolean e() {
        if (this.f37316c.length == 0) {
            return true;
        }
        return false;
    }
}

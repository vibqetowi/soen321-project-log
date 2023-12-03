package wu;
/* compiled from: ClassifierBasedTypeConstructor.kt */
/* loaded from: classes2.dex */
public abstract class l implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public int f37266a;

    @Override // wu.x0
    public abstract gt.g a();

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0) || obj.hashCode() != hashCode()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (x0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        gt.g a10 = a();
        gt.g a11 = x0Var.a();
        if (a11 == null) {
            return false;
        }
        if (!yu.i.f(a10) && !iu.g.o(a10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((yu.i.f(a11) || iu.g.o(a11)) ? false : false) {
                return f(a11);
            }
        }
        return false;
    }

    public abstract boolean f(gt.g gVar);

    public final int hashCode() {
        boolean z10;
        int identityHashCode;
        int i6 = this.f37266a;
        if (i6 != 0) {
            return i6;
        }
        gt.g a10 = a();
        if (!yu.i.f(a10) && !iu.g.o(a10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            identityHashCode = iu.g.g(a10).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f37266a = identityHashCode;
        return identityHashCode;
    }
}

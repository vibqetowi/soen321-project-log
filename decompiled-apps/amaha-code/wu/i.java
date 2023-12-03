package wu;
/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes2.dex */
public final class i extends t0<i> {

    /* renamed from: a  reason: collision with root package name */
    public final ht.h f37247a;

    public i(ht.h annotations) {
        kotlin.jvm.internal.i.g(annotations, "annotations");
        this.f37247a = annotations;
    }

    @Override // wu.t0
    public final i a(t0 t0Var) {
        i iVar = (i) t0Var;
        if (iVar == null) {
            return this;
        }
        return new i(ca.a.B(this.f37247a, iVar.f37247a));
    }

    @Override // wu.t0
    public final ys.d<? extends i> b() {
        return kotlin.jvm.internal.y.a(i.class);
    }

    @Override // wu.t0
    public final i c(t0 t0Var) {
        if (kotlin.jvm.internal.i.b((i) t0Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.i.b(((i) obj).f37247a, this.f37247a);
    }

    public final int hashCode() {
        return this.f37247a.hashCode();
    }
}

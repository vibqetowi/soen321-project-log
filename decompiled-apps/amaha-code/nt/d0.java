package nt;

import java.util.Collection;
/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes2.dex */
public final class d0 extends w implements wt.t {

    /* renamed from: a  reason: collision with root package name */
    public final fu.c f26801a;

    public d0(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        this.f26801a = fqName;
    }

    @Override // wt.t
    public final void P(ss.l nameFilter) {
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
    }

    @Override // wt.t
    public final fu.c e() {
        return this.f26801a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            if (kotlin.jvm.internal.i.b(this.f26801a, ((d0) obj).f26801a)) {
                return true;
            }
        }
        return false;
    }

    @Override // wt.d
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return is.w.f20676u;
    }

    public final int hashCode() {
        return this.f26801a.hashCode();
    }

    @Override // wt.d
    public final wt.a l(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return null;
    }

    public final String toString() {
        return d0.class.getName() + ": " + this.f26801a;
    }

    @Override // wt.t
    public final void C() {
    }

    @Override // wt.d
    public final void o() {
    }
}

package kt;

import java.util.Collection;
import java.util.List;
/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes2.dex */
public final class g implements wu.x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f23839a;

    public g(f fVar) {
        this.f23839a = fVar;
    }

    @Override // wu.x0
    public final gt.g a() {
        return this.f23839a;
    }

    @Override // wu.x0
    public final Collection<wu.b0> c() {
        Collection<wu.b0> c10 = ((uu.m) this.f23839a).g0().O0().c();
        kotlin.jvm.internal.i.f(c10, "declarationDescriptor.un…pe.constructor.supertypes");
        return c10;
    }

    @Override // wu.x0
    public final boolean d() {
        return true;
    }

    @Override // wu.x0
    public final List<gt.v0> getParameters() {
        List list = ((uu.m) this.f23839a).K;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("typeConstructorParameters");
        throw null;
    }

    @Override // wu.x0
    public final dt.j o() {
        return mu.a.e(this.f23839a);
    }

    public final String toString() {
        return "[typealias " + this.f23839a.getName().f() + ']';
    }
}

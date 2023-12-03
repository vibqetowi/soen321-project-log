package ju;

import dt.j;
import gt.g;
import gt.v0;
import is.w;
import java.util.Collection;
import java.util.List;
import wu.b0;
import wu.d1;
import wu.n1;
import xu.i;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final d1 f22632a;

    /* renamed from: b  reason: collision with root package name */
    public i f22633b;

    public c(d1 projection) {
        kotlin.jvm.internal.i.g(projection, "projection");
        this.f22632a = projection;
        projection.b();
    }

    @Override // wu.x0
    public final /* bridge */ /* synthetic */ g a() {
        return null;
    }

    @Override // wu.x0
    public final Collection<b0> c() {
        b0 p10;
        d1 d1Var = this.f22632a;
        if (d1Var.b() == n1.OUT_VARIANCE) {
            p10 = d1Var.a();
        } else {
            p10 = o().p();
        }
        kotlin.jvm.internal.i.f(p10, "if (projection.projectio… builtIns.nullableAnyType");
        return ca.a.O0(p10);
    }

    @Override // wu.x0
    public final boolean d() {
        return false;
    }

    @Override // ju.b
    public final d1 e() {
        return this.f22632a;
    }

    @Override // wu.x0
    public final List<v0> getParameters() {
        return w.f20676u;
    }

    @Override // wu.x0
    public final j o() {
        j o10 = this.f22632a.a().O0().o();
        kotlin.jvm.internal.i.f(o10, "projection.type.constructor.builtIns");
        return o10;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f22632a + ')';
    }
}

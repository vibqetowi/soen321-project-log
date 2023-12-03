package cv;

import cv.e;
import dt.l;
import dt.n;
import gt.a0;
import gt.z0;
import java.util.List;
import wu.b0;
import wu.c0;
import wu.i0;
import wu.k1;
import wu.n0;
import wu.v0;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12070a = new l();

    @Override // cv.e
    public final String a() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // cv.e
    public final String b(gt.u uVar) {
        return e.a.a(this, uVar);
    }

    @Override // cv.e
    public final boolean c(gt.u functionDescriptor) {
        i0 e10;
        kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
        z0 secondParameter = functionDescriptor.i().get(1);
        l.b bVar = dt.l.f13376d;
        kotlin.jvm.internal.i.f(secondParameter, "secondParameter");
        a0 j10 = mu.a.j(secondParameter);
        bVar.getClass();
        gt.e a10 = gt.t.a(j10, n.a.Q);
        if (a10 == null) {
            e10 = null;
        } else {
            v0.f37300v.getClass();
            v0 v0Var = v0.f37301w;
            List<gt.v0> parameters = a10.l().getParameters();
            kotlin.jvm.internal.i.f(parameters, "kPropertyClass.typeConstructor.parameters");
            Object y22 = is.u.y2(parameters);
            kotlin.jvm.internal.i.f(y22, "kPropertyClass.typeConstructor.parameters.single()");
            e10 = c0.e(v0Var, a10, ca.a.O0(new n0((gt.v0) y22)));
        }
        if (e10 != null) {
            b0 a11 = secondParameter.a();
            kotlin.jvm.internal.i.f(a11, "secondParameter.type");
            return hc.d.U(e10, k1.i(a11));
        }
        return false;
    }
}

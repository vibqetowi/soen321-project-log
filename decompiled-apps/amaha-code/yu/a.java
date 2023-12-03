package yu;

import gt.b;
import gt.k;
import gt.p;
import gt.q0;
import gt.z;
import ht.h;
import is.w;
import kt.l;
import kt.n;
import wu.g1;
import wu.j1;
/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class a extends n {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(fu.e eVar) {
        super(r2, eVar, r4, 1, r10, vu.c.f36140e);
        i iVar = i.f39090a;
        c cVar = i.f39091b;
        z zVar = z.OPEN;
        w wVar = w.f20676u;
        q0.a aVar = q0.f16815a;
        l lVar = new l(this, null, h.a.f19495a, true, b.a.DECLARATION, aVar);
        lVar.X0(wVar, p.f16803d);
        String str = lVar.getName().f15930u;
        kotlin.jvm.internal.i.f(str, "errorConstructor.name.toString()");
        e b10 = i.b(9, str, "");
        h hVar = h.P;
        lVar.U0(new f(i.d(hVar, new String[0]), b10, hVar, wVar, false, new String[0]));
        M0(b10, ca.a.l1(lVar), lVar);
    }

    @Override // kt.b, kt.b0
    public final pu.i I(g1 typeSubstitution, xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(typeSubstitution, "typeSubstitution");
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        String str = getName().f15930u;
        kotlin.jvm.internal.i.f(str, "name.toString()");
        return i.b(9, str, typeSubstitution.toString());
    }

    @Override // kt.b
    public final gt.e I0(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        return this;
    }

    @Override // kt.b, gt.s0
    public final k d(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        return this;
    }

    @Override // kt.n
    public final String toString() {
        String f = getName().f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        return f;
    }
}

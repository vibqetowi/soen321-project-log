package xt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pt.z;
import wu.h0;
import wu.m1;
import xt.a;
import xu.a;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<a.C0642a, Iterable<? extends a.C0642a>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a<Object> f38010u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(1);
        this.f38010u = aVar;
    }

    @Override // ss.l
    public final Iterable<? extends a.C0642a> invoke(a.C0642a c0642a) {
        zu.l l02;
        a.C0642a c0642a2;
        h0 h0Var;
        wu.v g5;
        a.C0642a it = c0642a;
        kotlin.jvm.internal.i.g(it, "it");
        a<Object> aVar = this.f38010u;
        boolean z10 = ((u) aVar).f38088e;
        f6.b bVar = f6.b.M;
        zu.h hVar = it.f38004a;
        if (z10) {
            if (hVar != null && (g5 = a.C0645a.g(hVar)) != null) {
                h0Var = a.C0645a.h(g5);
            } else {
                h0Var = null;
            }
            if (h0Var != null) {
                return null;
            }
        }
        if (hVar == null || (l02 = a.C0645a.l0(bVar, hVar)) == null) {
            return null;
        }
        List s10 = a.C0645a.s(l02);
        List p10 = a.C0645a.p(hVar);
        Iterator it2 = s10.iterator();
        Iterator it3 = p10.iterator();
        ArrayList arrayList = new ArrayList(Math.min(is.i.H1(s10, 10), is.i.H1(p10, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            zu.k kVar = (zu.k) it3.next();
            zu.m mVar = (zu.m) next;
            boolean U = a.C0645a.U(kVar);
            z zVar = it.f38005b;
            if (U) {
                c0642a2 = new a.C0642a(null, zVar, mVar);
            } else {
                m1 w10 = a.C0645a.w(kVar);
                aVar.getClass();
                pt.e eVar = ((st.c) ((u) aVar).f38086c.f29104v).f31949q;
                kotlin.jvm.internal.i.g(w10, "<this>");
                c0642a2 = new a.C0642a(w10, eVar.b(zVar, w10.getAnnotations()), mVar);
            }
            arrayList.add(c0642a2);
        }
        return arrayList;
    }
}

package iu;

import gt.u0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pu.k;
import wu.b0;
/* compiled from: SealedClassInheritorsProvider.kt */
/* loaded from: classes2.dex */
public final class b extends com.android.volley.toolbox.a {
    public static final void J(uu.d dVar, LinkedHashSet linkedHashSet, pu.i iVar, boolean z10) {
        boolean z11;
        for (gt.j jVar : k.a.a(iVar, pu.d.f28987o, 2)) {
            if (jVar instanceof gt.e) {
                gt.e eVar = (gt.e) jVar;
                if (eVar.M()) {
                    fu.e name = eVar.getName();
                    kotlin.jvm.internal.i.f(name, "descriptor.name");
                    gt.g g5 = iVar.g(name, ot.c.WHEN_GET_ALL_DESCRIPTORS);
                    if (g5 instanceof gt.e) {
                        eVar = (gt.e) g5;
                    } else if (g5 instanceof u0) {
                        eVar = ((u0) g5).q();
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null) {
                    int i6 = g.f20688a;
                    Iterator<b0> it = eVar.l().c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (g.p(it.next(), dVar)) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        linkedHashSet.add(eVar);
                    }
                    if (z10) {
                        pu.i A0 = eVar.A0();
                        kotlin.jvm.internal.i.f(A0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        J(dVar, linkedHashSet, A0, z10);
                    }
                }
            }
        }
    }
}

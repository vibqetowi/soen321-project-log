package pt;

import gt.k0;
import iu.h;
/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class p implements iu.h {
    @Override // iu.h
    public h.b a(gt.a superDescriptor, gt.a subDescriptor, gt.e eVar) {
        kotlin.jvm.internal.i.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.i.g(subDescriptor, "subDescriptor");
        boolean z10 = subDescriptor instanceof k0;
        h.b bVar = h.b.UNKNOWN;
        if (z10 && (superDescriptor instanceof k0)) {
            k0 k0Var = (k0) subDescriptor;
            k0 k0Var2 = (k0) superDescriptor;
            if (!kotlin.jvm.internal.i.b(k0Var.getName(), k0Var2.getName())) {
                return bVar;
            }
            if (kotlin.jvm.internal.h.I(k0Var) && kotlin.jvm.internal.h.I(k0Var2)) {
                return h.b.OVERRIDABLE;
            }
            if (!kotlin.jvm.internal.h.I(k0Var) && !kotlin.jvm.internal.h.I(k0Var2)) {
                return bVar;
            }
            return h.b.INCOMPATIBLE;
        }
        return bVar;
    }

    @Override // iu.h
    public h.a b() {
        return h.a.BOTH;
    }
}

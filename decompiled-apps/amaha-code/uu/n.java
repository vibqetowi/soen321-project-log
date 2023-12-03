package uu;

import au.p;
import au.r;
import gt.t0;
import ht.h;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import su.j0;
import ta.v;
import wu.b0;
import wu.n1;
/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes2.dex */
public final class n extends kt.c {
    public final j7.k E;
    public final r F;
    public final uu.a G;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            n nVar = n.this;
            j7.k kVar = nVar.E;
            return u.I2(((su.l) kVar.f21732u).f32048e.e(nVar.F, (cu.c) kVar.f21733v));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(j7.k c10, r rVar, int i6) {
        super(r2, r3, r4, r5, r0, rVar.f3842z, i6, t0.a.f16820a);
        n1 n1Var;
        kotlin.jvm.internal.i.g(c10, "c");
        vu.l c11 = c10.c();
        gt.j jVar = (gt.j) c10.f21734w;
        h.a.C0293a c0293a = h.a.f19495a;
        fu.e x10 = v.x((cu.c) c10.f21733v, rVar.f3841y);
        r.c cVar = rVar.A;
        kotlin.jvm.internal.i.f(cVar, "proto.variance");
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    n1Var = n1.INVARIANT;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                n1Var = n1.OUT_VARIANCE;
            }
        } else {
            n1Var = n1.IN_VARIANCE;
        }
        this.E = c10;
        this.F = rVar;
        this.G = new uu.a(c10.c(), new a());
    }

    @Override // kt.k
    public final void M0(b0 type) {
        kotlin.jvm.internal.i.g(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kt.k
    public final List<b0> N0() {
        j7.k kVar = this.E;
        cu.e typeTable = (cu.e) kVar.f21735x;
        r rVar = this.F;
        kotlin.jvm.internal.i.g(rVar, "<this>");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        List<p> list = rVar.B;
        if (!(!list.isEmpty())) {
            list = null;
        }
        ArrayList arrayList = list;
        if (list == null) {
            List<Integer> upperBoundIdList = rVar.C;
            kotlin.jvm.internal.i.f(upperBoundIdList, "upperBoundIdList");
            ArrayList arrayList2 = new ArrayList(is.i.H1(upperBoundIdList, 10));
            for (Integer it : upperBoundIdList) {
                kotlin.jvm.internal.i.f(it, "it");
                arrayList2.add(typeTable.a(it.intValue()));
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return ca.a.O0(mu.a.e(this).n());
        }
        j0 j0Var = (j0) kVar.B;
        ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList, 10));
        for (p pVar : arrayList) {
            arrayList3.add(j0Var.g(pVar));
        }
        return arrayList3;
    }

    @Override // ht.b, ht.a
    public final ht.h getAnnotations() {
        return this.G;
    }
}

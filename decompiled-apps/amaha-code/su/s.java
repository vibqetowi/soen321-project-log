package su;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes2.dex */
public abstract class s extends q {
    public final cu.a A;
    public final uu.g B;
    public final cu.d C;
    public final e0 D;
    public au.l E;
    public uu.j F;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Collection<? extends fu.e>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Collection<? extends fu.e> invoke() {
            boolean z10;
            Set keySet = s.this.D.f32002d.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                fu.b bVar = (fu.b) obj;
                if (!bVar.k() && !j.f32023c.contains(bVar)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fu.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fu.c fqName, vu.l storageManager, gt.a0 module, au.l lVar, cu.a aVar) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(module, "module");
        this.A = aVar;
        this.B = null;
        au.o oVar = lVar.f3761x;
        kotlin.jvm.internal.i.f(oVar, "proto.strings");
        au.n nVar = lVar.f3762y;
        kotlin.jvm.internal.i.f(nVar, "proto.qualifiedNames");
        cu.d dVar = new cu.d(oVar, nVar);
        this.C = dVar;
        this.D = new e0(lVar, dVar, aVar, new r(this));
        this.E = lVar;
    }

    @Override // su.q
    public final e0 I0() {
        return this.D;
    }

    public final void M0(l lVar) {
        au.l lVar2 = this.E;
        if (lVar2 != null) {
            this.E = null;
            au.k kVar = lVar2.f3763z;
            kotlin.jvm.internal.i.f(kVar, "proto.`package`");
            cu.d dVar = this.C;
            cu.a aVar = this.A;
            uu.g gVar = this.B;
            this.F = new uu.j(this, kVar, dVar, aVar, gVar, lVar, "scope of " + this, new a());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // gt.d0
    public final pu.i p() {
        uu.j jVar = this.F;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.i.q("_memberScope");
        throw null;
    }
}

package et;

import et.c;
import gt.a0;
import gt.d0;
import gv.n;
import gv.r;
import is.u;
import is.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kt.g0;
import vu.l;
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes2.dex */
public final class a implements jt.b {

    /* renamed from: a  reason: collision with root package name */
    public final l f14543a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f14544b;

    public a(l storageManager, g0 module) {
        i.g(storageManager, "storageManager");
        i.g(module, "module");
        this.f14543a = storageManager;
        this.f14544b = module;
    }

    @Override // jt.b
    public final gt.e a(fu.b classId) {
        i.g(classId, "classId");
        if (classId.f15920c || classId.k()) {
            return null;
        }
        String b10 = classId.i().b();
        if (!r.J0(b10, "Function")) {
            return null;
        }
        fu.c h10 = classId.h();
        i.f(h10, "classId.packageFqName");
        c.f14548w.getClass();
        c.a.C0224a a10 = c.a.a(b10, h10);
        if (a10 == null) {
            return null;
        }
        List<d0> J = this.f14544b.H(h10).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (obj instanceof dt.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof dt.e) {
                arrayList2.add(next);
            }
        }
        dt.b bVar = (dt.e) u.i2(arrayList2);
        if (bVar == null) {
            bVar = (dt.b) u.g2(arrayList);
        }
        return new b(this.f14543a, bVar, a10.f14554a, a10.f14555b);
    }

    @Override // jt.b
    public final Collection<gt.e> b(fu.c packageFqName) {
        i.g(packageFqName, "packageFqName");
        return y.f20678u;
    }

    @Override // jt.b
    public final boolean c(fu.c packageFqName, fu.e name) {
        i.g(packageFqName, "packageFqName");
        i.g(name, "name");
        String f = name.f();
        i.f(f, "name.asString()");
        if (n.H0(f, "Function") || n.H0(f, "KFunction") || n.H0(f, "SuspendFunction") || n.H0(f, "KSuspendFunction")) {
            c.f14548w.getClass();
            if (c.a.a(f, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }
}

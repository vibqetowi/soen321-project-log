package et;

import cv.s;
import gt.b;
import gt.j;
import gt.n0;
import gt.p;
import gt.q0;
import gt.v0;
import gt.z0;
import hs.f;
import ht.h;
import is.a0;
import is.b0;
import is.u;
import is.w;
import is.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kt.p0;
import kt.x;
import wu.i0;
import wu.j1;
import wu.n1;
/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes2.dex */
public final class e extends p0 {

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static e a(b functionClass, boolean z10) {
            String lowerCase;
            boolean z11;
            i.g(functionClass, "functionClass");
            e eVar = new e(functionClass, null, b.a.DECLARATION, z10);
            n0 L0 = functionClass.L0();
            w wVar = w.f20676u;
            ArrayList arrayList = new ArrayList();
            List<v0> list = functionClass.E;
            for (Object obj : list) {
                if (((v0) obj).O() == n1.IN_VARIANCE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                arrayList.add(obj);
            }
            a0 N2 = u.N2(arrayList);
            ArrayList arrayList2 = new ArrayList(is.i.H1(N2, 10));
            Iterator it = N2.iterator();
            while (true) {
                b0 b0Var = (b0) it;
                if (b0Var.hasNext()) {
                    z zVar = (z) b0Var.next();
                    int i6 = zVar.f20679a;
                    v0 v0Var = (v0) zVar.f20680b;
                    String f = v0Var.getName().f();
                    i.f(f, "typeParameter.name.asString()");
                    if (i.b(f, "T")) {
                        lowerCase = "instance";
                    } else if (i.b(f, "E")) {
                        lowerCase = "receiver";
                    } else {
                        lowerCase = f.toLowerCase(Locale.ROOT);
                        i.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    h.a.C0293a c0293a = h.a.f19495a;
                    fu.e j10 = fu.e.j(lowerCase);
                    i0 r = v0Var.r();
                    i.f(r, "typeParameter.defaultType");
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new kt.v0(eVar, null, i6, c0293a, j10, r, false, false, false, null, q0.f16815a));
                    arrayList2 = arrayList3;
                } else {
                    eVar.P0(null, L0, wVar, wVar, arrayList2, ((v0) u.o2(list)).r(), gt.z.ABSTRACT, p.f16804e);
                    eVar.R = true;
                    return eVar;
                }
            }
        }
    }

    public e(j jVar, e eVar, b.a aVar, boolean z10) {
        super(jVar, eVar, h.a.f19495a, s.f12090g, aVar, q0.f16815a);
        this.G = true;
        this.P = z10;
        this.Q = false;
    }

    @Override // kt.p0, kt.x
    public final x M0(b.a kind, j newOwner, gt.u uVar, q0 q0Var, h annotations, fu.e eVar) {
        i.g(newOwner, "newOwner");
        i.g(kind, "kind");
        i.g(annotations, "annotations");
        return new e(newOwner, (e) uVar, kind, this.P);
    }

    @Override // kt.x
    public final x N0(x.a configuration) {
        boolean z10;
        boolean z11;
        fu.e eVar;
        boolean z12;
        boolean z13;
        i.g(configuration, "configuration");
        e eVar2 = (e) super.N0(configuration);
        if (eVar2 == null) {
            return null;
        }
        List<z0> i6 = eVar2.i();
        i.f(i6, "substituted.valueParameters");
        boolean z14 = true;
        if (!i6.isEmpty()) {
            for (z0 z0Var : i6) {
                wu.b0 a10 = z0Var.a();
                i.f(a10, "it.type");
                if (ca.a.T(a10) != null) {
                    z13 = true;
                    continue;
                } else {
                    z13 = false;
                    continue;
                }
                if (z13) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return eVar2;
        }
        List<z0> i10 = eVar2.i();
        i.f(i10, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(is.i.H1(i10, 10));
        for (z0 z0Var2 : i10) {
            wu.b0 a11 = z0Var2.a();
            i.f(a11, "it.type");
            arrayList.add(ca.a.T(a11));
        }
        int size = eVar2.i().size() - arrayList.size();
        if (size == 0) {
            List<z0> valueParameters = eVar2.i();
            i.f(valueParameters, "valueParameters");
            ArrayList O2 = u.O2(arrayList, valueParameters);
            if (!O2.isEmpty()) {
                Iterator it = O2.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (!i.b((fu.e) fVar.f19464u, ((z0) fVar.f19465v).getName())) {
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = true;
            if (z12) {
                return eVar2;
            }
        }
        List<z0> valueParameters2 = eVar2.i();
        i.f(valueParameters2, "valueParameters");
        ArrayList arrayList2 = new ArrayList(is.i.H1(valueParameters2, 10));
        for (z0 z0Var3 : valueParameters2) {
            fu.e name = z0Var3.getName();
            i.f(name, "it.name");
            int index = z0Var3.getIndex();
            int i11 = index - size;
            if (i11 >= 0 && (eVar = (fu.e) arrayList.get(i11)) != null) {
                name = eVar;
            }
            arrayList2.add(z0Var3.a0(eVar2, name, index));
        }
        x.a Q0 = eVar2.Q0(j1.f37255b);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((fu.e) it2.next()) == null) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z14 = false;
        Q0.f23924v = Boolean.valueOf(z14);
        Q0.f23910g = arrayList2;
        Q0.f23909e = eVar2.b();
        x N0 = super.N0(Q0);
        i.d(N0);
        return N0;
    }

    @Override // kt.x, gt.u
    public final boolean Q() {
        return false;
    }

    @Override // kt.x, gt.y
    public final boolean isExternal() {
        return false;
    }

    @Override // kt.x, gt.u
    public final boolean isInline() {
        return false;
    }
}

package ut;

import gv.r;
import hu.j;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import wu.b0;
import wu.d1;
import wu.h0;
import wu.i0;
import wu.m1;
import wu.v;
import wu.v0;
/* compiled from: RawType.kt */
/* loaded from: classes2.dex */
public final class g extends v implements h0 {

    /* compiled from: RawType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<String, CharSequence> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f34527u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final CharSequence invoke(String str) {
            String it = str;
            i.g(it, "it");
            return "(raw) ".concat(it);
        }
    }

    public g(i0 i0Var, i0 i0Var2, boolean z10) {
        super(i0Var, i0Var2);
        if (z10) {
            return;
        }
        xu.c.f38095a.d(i0Var, i0Var2);
    }

    public static final ArrayList Y0(hu.c cVar, i0 i0Var) {
        List<d1> M0 = i0Var.M0();
        ArrayList arrayList = new ArrayList(is.i.H1(M0, 10));
        for (d1 d1Var : M0) {
            arrayList.add(cVar.v(d1Var));
        }
        return arrayList;
    }

    public static final String Z0(String str, String str2) {
        if (!r.I0(str, '<')) {
            return str;
        }
        return r.g1(str, '<') + '<' + str2 + '>' + r.e1(str, '>');
    }

    @Override // wu.m1
    public final m1 S0(boolean z10) {
        return new g(this.f37298v.S0(z10), this.f37299w.S0(z10));
    }

    @Override // wu.m1
    public final m1 U0(v0 newAttributes) {
        i.g(newAttributes, "newAttributes");
        return new g(this.f37298v.U0(newAttributes), this.f37299w.U0(newAttributes));
    }

    @Override // wu.v
    public final i0 V0() {
        return this.f37298v;
    }

    @Override // wu.v
    public final String W0(hu.c renderer, j options) {
        boolean z10;
        i.g(renderer, "renderer");
        i.g(options, "options");
        i0 i0Var = this.f37298v;
        String u10 = renderer.u(i0Var);
        i0 i0Var2 = this.f37299w;
        String u11 = renderer.u(i0Var2);
        if (options.m()) {
            return "raw (" + u10 + ".." + u11 + ')';
        } else if (i0Var2.M0().isEmpty()) {
            return renderer.r(u10, u11, hc.d.F(this));
        } else {
            ArrayList Y0 = Y0(renderer, i0Var);
            ArrayList Y02 = Y0(renderer, i0Var2);
            String m22 = u.m2(Y0, ", ", null, null, a.f34527u, 30);
            ArrayList O2 = u.O2(Y0, Y02);
            boolean z11 = true;
            if (!O2.isEmpty()) {
                Iterator it = O2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    hs.f fVar = (hs.f) it.next();
                    String str = (String) fVar.f19465v;
                    if (!i.b((String) fVar.f19464u, r.V0("out ", str)) && !i.b(str, "*")) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (!z10) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (z11) {
                u11 = Z0(u11, m22);
            }
            String Z0 = Z0(u10, m22);
            if (i.b(Z0, u11)) {
                return Z0;
            }
            return renderer.r(Z0, u11, hc.d.F(this));
        }
    }

    @Override // wu.m1
    /* renamed from: X0 */
    public final v T0(xu.e kotlinTypeRefiner) {
        i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(this.f37298v);
        i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        b0 H2 = kotlinTypeRefiner.H(this.f37299w);
        i.e(H2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new g((i0) H, (i0) H2, true);
    }

    @Override // wu.v, wu.b0
    public final pu.i p() {
        gt.e eVar;
        gt.g a10 = O0().a();
        if (a10 instanceof gt.e) {
            eVar = (gt.e) a10;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            pu.i z02 = eVar.z0(new f());
            i.f(z02, "classDescriptor.getMemberScope(RawSubstitution())");
            return z02;
        }
        throw new IllegalStateException(("Incorrect classifier: " + O0().a()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(i0 lowerBound, i0 upperBound) {
        this(lowerBound, upperBound, false);
        i.g(lowerBound, "lowerBound");
        i.g(upperBound, "upperBound");
    }
}

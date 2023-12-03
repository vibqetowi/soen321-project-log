package ut;

import dt.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
import wu.a1;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.f1;
import wu.g1;
import wu.i0;
import wu.n1;
import wu.v0;
import wu.x0;
import yu.h;
/* compiled from: RawSubstitution.kt */
/* loaded from: classes2.dex */
public final class f extends g1 {

    /* renamed from: d  reason: collision with root package name */
    public static final ut.a f34522d = ca.a.u1(2, false, true, null, 5).f(3);

    /* renamed from: e  reason: collision with root package name */
    public static final ut.a f34523e = ca.a.u1(2, false, true, null, 5).f(2);

    /* renamed from: b  reason: collision with root package name */
    public final e f34524b;

    /* renamed from: c  reason: collision with root package name */
    public final a1 f34525c;

    /* compiled from: RawSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<xu.e, i0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ gt.e f34526u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gt.e eVar, ut.a aVar, f fVar, i0 i0Var) {
            super(1);
            this.f34526u = eVar;
        }

        @Override // ss.l
        public final i0 invoke(xu.e eVar) {
            fu.b f;
            xu.e kotlinTypeRefiner = eVar;
            i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            gt.e eVar2 = this.f34526u;
            if (!(eVar2 instanceof gt.e)) {
                eVar2 = null;
            }
            if (eVar2 != null && (f = mu.a.f(eVar2)) != null) {
                kotlinTypeRefiner.D(f);
            }
            return null;
        }
    }

    public f() {
        e eVar = new e();
        this.f34524b = eVar;
        this.f34525c = new a1(eVar);
    }

    @Override // wu.g1
    public final d1 d(b0 b0Var) {
        return new f1(h(b0Var, new ut.a(2, false, false, null, 62)));
    }

    public final hs.f<i0, Boolean> g(i0 i0Var, gt.e eVar, ut.a aVar) {
        if (i0Var.O0().getParameters().isEmpty()) {
            return new hs.f<>(i0Var, Boolean.FALSE);
        }
        if (j.z(i0Var)) {
            d1 d1Var = i0Var.M0().get(0);
            n1 b10 = d1Var.b();
            b0 a10 = d1Var.a();
            i.f(a10, "componentTypeProjection.type");
            return new hs.f<>(c0.f(i0Var.N0(), i0Var.O0(), ca.a.O0(new f1(h(a10, aVar), b10)), i0Var.P0(), null), Boolean.FALSE);
        } else if (v.E(i0Var)) {
            return new hs.f<>(yu.i.c(h.H, i0Var.O0().toString()), Boolean.FALSE);
        } else {
            pu.i z02 = eVar.z0(this);
            i.f(z02, "declaration.getMemberScope(this)");
            v0 N0 = i0Var.N0();
            x0 l2 = eVar.l();
            i.f(l2, "declaration.typeConstructor");
            List<gt.v0> parameters = eVar.l().getParameters();
            i.f(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
            for (gt.v0 parameter : parameters) {
                i.f(parameter, "parameter");
                a1 a1Var = this.f34525c;
                arrayList.add(this.f34524b.H(parameter, aVar, a1Var, a1Var.b(parameter, aVar)));
            }
            return new hs.f<>(c0.h(N0, l2, arrayList, i0Var.P0(), z02, new a(eVar, aVar, this, i0Var)), Boolean.TRUE);
        }
    }

    public final b0 h(b0 b0Var, ut.a aVar) {
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof gt.v0) {
            aVar.getClass();
            ut.a e10 = ut.a.e(aVar, 0, true, null, null, 59);
            return h(this.f34525c.b((gt.v0) a10, e10), aVar);
        } else if (a10 instanceof gt.e) {
            gt.g a11 = ca.a.A1(b0Var).O0().a();
            if (a11 instanceof gt.e) {
                hs.f<i0, Boolean> g5 = g(ca.a.V0(b0Var), (gt.e) a10, f34522d);
                i0 i0Var = g5.f19464u;
                boolean booleanValue = g5.f19465v.booleanValue();
                hs.f<i0, Boolean> g10 = g(ca.a.A1(b0Var), (gt.e) a11, f34523e);
                i0 i0Var2 = g10.f19464u;
                boolean booleanValue2 = g10.f19465v.booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return c0.c(i0Var, i0Var2);
                }
                return new g(i0Var, i0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + a11 + "\" while for lower it's \"" + a10 + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + a10).toString());
        }
    }
}

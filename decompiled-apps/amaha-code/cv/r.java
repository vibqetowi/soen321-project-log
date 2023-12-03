package cv;

import cv.m;
import cv.t;
import cv.v;
import dt.n;
import gt.n0;
import gt.u0;
import gt.z0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import wu.b0;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class r extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public static final r f12080v = new r();

    /* renamed from: w  reason: collision with root package name */
    public static final List<j> f12081w;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<gt.u, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f12082u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final String invoke(gt.u uVar) {
            boolean z10;
            gt.u $receiver = uVar;
            kotlin.jvm.internal.i.g($receiver, "$this$$receiver");
            List<z0> valueParameters = $receiver.i();
            kotlin.jvm.internal.i.f(valueParameters, "valueParameters");
            z0 z0Var = (z0) is.u.p2(valueParameters);
            boolean z11 = false;
            if (z0Var != null) {
                if (!mu.a.a(z0Var) && z0Var.j0() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            r rVar = r.f12080v;
            if (!z11) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<gt.u, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f12083u = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String invoke(gt.u uVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            gt.u $receiver = uVar;
            kotlin.jvm.internal.i.g($receiver, "$this$$receiver");
            r rVar = r.f12080v;
            gt.j containingDeclaration = $receiver.c();
            kotlin.jvm.internal.i.f(containingDeclaration, "containingDeclaration");
            boolean z13 = true;
            if (containingDeclaration instanceof gt.e) {
                fu.e eVar = dt.j.f13360e;
                if (dt.j.c((gt.e) containingDeclaration, n.a.f13395a)) {
                    z10 = true;
                    if (!z10) {
                        Collection<? extends gt.u> overriddenDescriptors = $receiver.f();
                        kotlin.jvm.internal.i.f(overriddenDescriptors, "overriddenDescriptors");
                        if (!overriddenDescriptors.isEmpty()) {
                            for (gt.u uVar2 : overriddenDescriptors) {
                                gt.j c10 = uVar2.c();
                                kotlin.jvm.internal.i.f(c10, "it.containingDeclaration");
                                if (c10 instanceof gt.e) {
                                    fu.e eVar2 = dt.j.f13360e;
                                    if (dt.j.c((gt.e) c10, n.a.f13395a)) {
                                        z12 = true;
                                        continue;
                                        if (z12) {
                                            z11 = true;
                                            break;
                                        }
                                    }
                                }
                                z12 = false;
                                continue;
                                if (z12) {
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        return "must override ''equals()'' in Any";
                    }
                    return null;
                }
            }
            z10 = false;
            if (!z10) {
            }
            if (z13) {
            }
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<gt.u, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f12084u = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
            if (r8 == false) goto L28;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String invoke(gt.u uVar) {
            boolean z10;
            boolean z11;
            fu.b f;
            b0 returnType;
            gt.u $receiver = uVar;
            kotlin.jvm.internal.i.g($receiver, "$this$$receiver");
            n0 f02 = $receiver.f0();
            if (f02 == null) {
                f02 = $receiver.k0();
            }
            r rVar = r.f12080v;
            boolean z12 = false;
            if (f02 != null) {
                b0 returnType2 = $receiver.getReturnType();
                if (returnType2 != null) {
                    b0 a10 = f02.a();
                    kotlin.jvm.internal.i.f(a10, "receiver.type");
                    z10 = hc.d.U(returnType2, a10);
                } else {
                    z10 = false;
                }
                if (!z10) {
                    rVar.getClass();
                    qu.d value = f02.getValue();
                    kotlin.jvm.internal.i.f(value, "receiver.value");
                    if (value instanceof qu.c) {
                        gt.e eVar = ((qu.c) value).f30139a;
                        if (eVar.M() && (f = mu.a.f(eVar)) != null) {
                            gt.g b10 = gt.t.b(mu.a.j(eVar), f);
                            if (!(b10 instanceof u0)) {
                                b10 = null;
                            }
                            u0 u0Var = (u0) b10;
                            if (u0Var != null && (returnType = $receiver.getReturnType()) != null) {
                                z11 = hc.d.U(returnType, u0Var.W());
                            }
                        }
                    }
                    z11 = false;
                }
                z12 = true;
            }
            if (z12) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        fu.e eVar = s.f12092i;
        m.b bVar = m.b.f12073b;
        e[] eVarArr = {bVar, new v.a(1)};
        fu.e eVar2 = s.f12093j;
        e[] eVarArr2 = {bVar, new v.a(2)};
        fu.e eVar3 = s.f12085a;
        o oVar = o.f12075a;
        l lVar = l.f12070a;
        e[] eVarArr3 = {bVar, oVar, new v.a(2), lVar};
        fu.e eVar4 = s.f12086b;
        e[] eVarArr4 = {bVar, oVar, new v.a(3), lVar};
        fu.e eVar5 = s.f12087c;
        e[] eVarArr5 = {bVar, oVar, new v.b(), lVar};
        fu.e eVar6 = s.f12090g;
        e[] eVarArr6 = {bVar};
        fu.e eVar7 = s.f;
        v.d dVar = v.d.f12118b;
        t.a aVar = t.a.f12105c;
        e[] eVarArr7 = {bVar, dVar, oVar, aVar};
        fu.e eVar8 = s.f12091h;
        v.c cVar = v.c.f12117b;
        e[] eVarArr8 = {bVar, cVar};
        fu.e eVar9 = s.f12094k;
        e[] eVarArr9 = {bVar, cVar};
        fu.e eVar10 = s.f12095l;
        e[] eVarArr10 = {bVar, cVar, aVar};
        fu.e eVar11 = s.f12099p;
        e[] eVarArr11 = {bVar, dVar, oVar};
        fu.e eVar12 = s.f12100q;
        e[] eVarArr12 = {bVar, dVar, oVar};
        fu.e eVar13 = s.f12088d;
        e[] eVarArr13 = {m.a.f12072b};
        fu.e eVar14 = s.f12089e;
        e[] eVarArr14 = {bVar, t.b.f12107c, dVar, oVar};
        Set<fu.e> set = s.f12101s;
        e[] eVarArr15 = {bVar, dVar, oVar};
        Set<fu.e> set2 = s.r;
        e[] eVarArr16 = {bVar, cVar};
        List P0 = ca.a.P0(s.f12097n, s.f12098o);
        e[] eVarArr17 = {bVar};
        Set<fu.e> set3 = s.f12102t;
        e[] eVarArr18 = {bVar, t.c.f12109c, dVar, oVar};
        gv.e regex = s.f12096m;
        e[] eVarArr19 = {bVar, cVar};
        h additionalChecks = h.f12062u;
        kotlin.jvm.internal.i.g(regex, "regex");
        kotlin.jvm.internal.i.g(additionalChecks, "additionalChecks");
        f12081w = ca.a.P0(new j(eVar, eVarArr), new j(eVar2, eVarArr2, a.f12082u), new j(eVar3, eVarArr3), new j(eVar4, eVarArr4), new j(eVar5, eVarArr5), new j(eVar6, eVarArr6), new j(eVar7, eVarArr7), new j(eVar8, eVarArr8), new j(eVar9, eVarArr9), new j(eVar10, eVarArr10), new j(eVar11, eVarArr11), new j(eVar12, eVarArr12), new j(eVar13, eVarArr13, b.f12083u), new j(eVar14, eVarArr14), new j(set, eVarArr15), new j(set2, eVarArr16), new j(P0, eVarArr17, c.f12084u), new j(set3, eVarArr18), new j(null, regex, null, additionalChecks, (e[]) Arrays.copyOf(eVarArr19, 2)));
    }
}

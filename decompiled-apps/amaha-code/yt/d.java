package yt;

import au.b;
import du.a;
import eu.d;
import gt.q0;
import gu.g;
import is.w;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import r1.b0;
import su.f0;
import vu.c;
import yt.a;
import yt.d.a;
import yt.r;
/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes2.dex */
public abstract class d<A, S extends a<? extends A>> implements su.g<A> {

    /* renamed from: a  reason: collision with root package name */
    public final n f39007a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes2.dex */
    public static abstract class a<A> {
    }

    public d(mt.d dVar) {
        this.f39007a = dVar;
    }

    public static /* synthetic */ List m(d dVar, f0 f0Var, r rVar, boolean z10, Boolean bool, boolean z11, int i6) {
        boolean z12;
        boolean z13;
        if ((i6 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i6 & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i6 & 32) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        return dVar.l(f0Var, rVar, z12, false, bool2, z13);
    }

    public static r n(gu.n proto, cu.c nameResolver, cu.e typeTable, su.c kind, boolean z10) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(kind, "kind");
        if (proto instanceof au.c) {
            gu.e eVar = eu.h.f14568a;
            d.b a10 = eu.h.a((au.c) proto, nameResolver, typeTable);
            if (a10 == null) {
                return null;
            }
            return r.a.a(a10);
        } else if (proto instanceof au.h) {
            gu.e eVar2 = eu.h.f14568a;
            d.b c10 = eu.h.c((au.h) proto, nameResolver, typeTable);
            if (c10 == null) {
                return null;
            }
            return r.a.a(c10);
        } else if (!(proto instanceof au.m)) {
            return null;
        } else {
            g.e<au.m, a.c> propertySignature = du.a.f13439d;
            kotlin.jvm.internal.i.f(propertySignature, "propertySignature");
            a.c cVar = (a.c) kotlin.jvm.internal.h.w((g.c) proto, propertySignature);
            if (cVar == null) {
                return null;
            }
            int ordinal = kind.ordinal();
            boolean z11 = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                    if ((cVar.f13468v & 8) != 8) {
                        z11 = false;
                    }
                    if (!z11) {
                        return null;
                    }
                    a.b bVar = cVar.f13472z;
                    kotlin.jvm.internal.i.f(bVar, "signature.setter");
                    String name = nameResolver.getString(bVar.f13460w);
                    String desc = nameResolver.getString(bVar.f13461x);
                    kotlin.jvm.internal.i.g(name, "name");
                    kotlin.jvm.internal.i.g(desc, "desc");
                    return new r(name.concat(desc));
                }
                if ((cVar.f13468v & 4) != 4) {
                    z11 = false;
                }
                if (!z11) {
                    return null;
                }
                a.b bVar2 = cVar.f13471y;
                kotlin.jvm.internal.i.f(bVar2, "signature.getter");
                String name2 = nameResolver.getString(bVar2.f13460w);
                String desc2 = nameResolver.getString(bVar2.f13461x);
                kotlin.jvm.internal.i.g(name2, "name");
                kotlin.jvm.internal.i.g(desc2, "desc");
                return new r(name2.concat(desc2));
            }
            return kotlin.jvm.internal.h.A((au.m) proto, nameResolver, typeTable, true, true, z10);
        }
    }

    @Override // su.g
    public final ArrayList a(f0.a container) {
        q qVar;
        kotlin.jvm.internal.i.g(container, "container");
        q0 q0Var = container.f32008c;
        o oVar = null;
        if (q0Var instanceof q) {
            qVar = (q) q0Var;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            oVar = qVar.f39055b;
        }
        if (oVar != null) {
            ArrayList arrayList = new ArrayList(1);
            oVar.c(new e(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // su.g
    public final List b(f0.a container, au.f proto) {
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(proto, "proto");
        String name = container.f32006a.getString(proto.f3718x);
        String c10 = container.f.c();
        kotlin.jvm.internal.i.f(c10, "container as ProtoContai…Class).classId.asString()");
        String desc = eu.b.b(c10);
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(desc, "desc");
        return m(this, container, new r(name + '#' + desc), false, null, false, 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (r10 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
        if (r10.f32012h != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
        r1 = 1;
     */
    @Override // su.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<A> c(f0 container, gu.n callableProto, su.c kind, int i6, au.t proto) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(callableProto, "callableProto");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(proto, "proto");
        int i10 = 0;
        r n10 = n(callableProto, container.f32006a, container.f32007b, kind, false);
        if (n10 != null) {
            if (callableProto instanceof au.h) {
                int i11 = ((au.h) callableProto).f3740w;
                if ((i11 & 32) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    if ((i11 & 64) == 64) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        z14 = false;
                    }
                }
                z14 = true;
            } else if (callableProto instanceof au.m) {
                int i12 = ((au.m) callableProto).f3768w;
                if ((i12 & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if ((i12 & 64) == 64) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        z11 = false;
                    }
                }
                z11 = true;
            } else if (callableProto instanceof au.c) {
                f0.a aVar = (f0.a) container;
                if (aVar.f32011g == b.c.ENUM_CLASS) {
                    i10 = 2;
                }
            } else {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            return m(this, container, new r(n10.f39056a + '@' + (i6 + i10)), false, null, false, 60);
        }
        return w.f20676u;
    }

    @Override // su.g
    public final ArrayList e(au.r proto, cu.c nameResolver) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        Object k10 = proto.k(du.a.f13442h);
        kotlin.jvm.internal.i.f(k10, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<au.a> iterable = (Iterable) k10;
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a it : iterable) {
            kotlin.jvm.internal.i.f(it, "it");
            arrayList.add(((g) this).f39017e.a(it, nameResolver));
        }
        return arrayList;
    }

    @Override // su.g
    public final List<A> f(f0 f0Var, au.m proto) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return s(f0Var, proto, 2);
    }

    @Override // su.g
    public final List<A> g(f0 f0Var, gu.n proto, su.c kind) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(kind, "kind");
        if (kind == su.c.PROPERTY) {
            return s(f0Var, (au.m) proto, 1);
        }
        r n10 = n(proto, f0Var.f32006a, f0Var.f32007b, kind, false);
        if (n10 == null) {
            return w.f20676u;
        }
        return m(this, f0Var, n10, false, null, false, 60);
    }

    @Override // su.g
    public final ArrayList h(au.p proto, cu.c nameResolver) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        Object k10 = proto.k(du.a.f);
        kotlin.jvm.internal.i.f(k10, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<au.a> iterable = (Iterable) k10;
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a it : iterable) {
            kotlin.jvm.internal.i.f(it, "it");
            arrayList.add(((g) this).f39017e.a(it, nameResolver));
        }
        return arrayList;
    }

    @Override // su.g
    public final List<A> i(f0 f0Var, au.m proto) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return s(f0Var, proto, 3);
    }

    @Override // su.g
    public final List<A> j(f0 f0Var, gu.n proto, su.c kind) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(kind, "kind");
        r n10 = n(proto, f0Var.f32006a, f0Var.f32007b, kind, false);
        if (n10 != null) {
            return m(this, f0Var, new r(b0.b(new StringBuilder(), n10.f39056a, "@0")), false, null, false, 60);
        }
        return w.f20676u;
    }

    public final List<A> l(f0 f0Var, r rVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        q qVar;
        o o10 = o(f0Var, z10, z11, bool, z12);
        if (o10 == null) {
            if (f0Var instanceof f0.a) {
                q0 q0Var = ((f0.a) f0Var).f32008c;
                if (q0Var instanceof q) {
                    qVar = (q) q0Var;
                } else {
                    qVar = null;
                }
                if (qVar != null) {
                    o10 = qVar.f39055b;
                }
            }
            o10 = null;
        }
        w wVar = w.f20676u;
        if (o10 == null) {
            return wVar;
        }
        List<A> list = ((a.C0659a) ((c.k) ((yt.a) this).f38993b).invoke(o10)).f38994a.get(rVar);
        if (list != null) {
            return list;
        }
        return wVar;
    }

    public final o o(f0 container, boolean z10, boolean z11, Boolean bool, boolean z12) {
        f0.a aVar;
        q qVar;
        l lVar;
        nu.b bVar;
        kotlin.jvm.internal.i.g(container, "container");
        b.c cVar = b.c.INTERFACE;
        n nVar = this.f39007a;
        q0 q0Var = container.f32008c;
        if (z10) {
            if (bool != null) {
                if (container instanceof f0.a) {
                    f0.a aVar2 = (f0.a) container;
                    if (aVar2.f32011g == cVar) {
                        return kotlin.jvm.internal.h.u(nVar, aVar2.f.d(fu.e.j("DefaultImpls")));
                    }
                }
                if (bool.booleanValue() && (container instanceof f0.b)) {
                    if (q0Var instanceof l) {
                        lVar = (l) q0Var;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        bVar = lVar.f39041c;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        String e10 = bVar.e();
                        kotlin.jvm.internal.i.f(e10, "facadeClassName.internalName");
                        return kotlin.jvm.internal.h.u(nVar, fu.b.l(new fu.c(gv.n.E0(e10, '/', '.'))));
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
        }
        if (z11 && (container instanceof f0.a)) {
            f0.a aVar3 = (f0.a) container;
            if (aVar3.f32011g == b.c.COMPANION_OBJECT && (aVar = aVar3.f32010e) != null) {
                b.c cVar2 = b.c.CLASS;
                b.c cVar3 = aVar.f32011g;
                if (cVar3 == cVar2 || cVar3 == b.c.ENUM_CLASS || (z12 && (cVar3 == cVar || cVar3 == b.c.ANNOTATION_CLASS))) {
                    q0 q0Var2 = aVar.f32008c;
                    if (q0Var2 instanceof q) {
                        qVar = (q) q0Var2;
                    } else {
                        qVar = null;
                    }
                    if (qVar == null) {
                        return null;
                    }
                    return qVar.f39055b;
                }
            }
        }
        if (!(container instanceof f0.b) || !(q0Var instanceof l)) {
            return null;
        }
        kotlin.jvm.internal.i.e(q0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        l lVar2 = (l) q0Var;
        o oVar = lVar2.f39042d;
        if (oVar == null) {
            return kotlin.jvm.internal.h.u(nVar, lVar2.d());
        }
        return oVar;
    }

    public final boolean p(fu.b classId) {
        o u10;
        kotlin.jvm.internal.i.g(classId, "classId");
        if (classId.g() != null && kotlin.jvm.internal.i.b(classId.j().f(), "Container") && (u10 = kotlin.jvm.internal.h.u(this.f39007a, classId)) != null) {
            LinkedHashSet linkedHashSet = ct.b.f12012a;
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            u10.c(new ct.a(uVar));
            if (uVar.f23466u) {
                return true;
            }
        }
        return false;
    }

    public abstract h q(fu.b bVar, q0 q0Var, List list);

    public final h r(fu.b bVar, mt.a aVar, List result) {
        kotlin.jvm.internal.i.g(result, "result");
        if (ct.b.f12012a.contains(bVar)) {
            return null;
        }
        return q(bVar, aVar, result);
    }

    /* JADX WARN: Incorrect types in method signature: (Lsu/f0;Lau/m;Ljava/lang/Object;)Ljava/util/List<TA;>; */
    public final List s(f0 f0Var, au.m mVar, int i6) {
        boolean g5 = ri.e.g(cu.b.A, mVar.f3769x, "IS_CONST.get(proto.flags)");
        boolean d10 = eu.h.d(mVar);
        w wVar = w.f20676u;
        boolean z10 = true;
        if (i6 == 1) {
            r B = kotlin.jvm.internal.h.B(mVar, f0Var.f32006a, f0Var.f32007b, false, true, 40);
            if (B == null) {
                return wVar;
            }
            return m(this, f0Var, B, true, Boolean.valueOf(g5), d10, 8);
        }
        r B2 = kotlin.jvm.internal.h.B(mVar, f0Var.f32006a, f0Var.f32007b, true, false, 48);
        if (B2 == null) {
            return wVar;
        }
        boolean J0 = gv.r.J0(B2.f39056a, "$delegate");
        if (i6 != 3) {
            z10 = false;
        }
        if (J0 != z10) {
            return wVar;
        }
        return l(f0Var, B2, true, true, Boolean.valueOf(g5), d10);
    }
}

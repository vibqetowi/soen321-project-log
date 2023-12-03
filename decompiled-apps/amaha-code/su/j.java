package su;

import cu.f;
import dt.n;
import gt.q0;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ClassDeserializer.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final Set<fu.b> f32023c = ca.a.l1(fu.b.l(n.a.f13399c.h()));

    /* renamed from: a  reason: collision with root package name */
    public final l f32024a;

    /* renamed from: b  reason: collision with root package name */
    public final vu.h f32025b;

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fu.b f32026a;

        /* renamed from: b  reason: collision with root package name */
        public final h f32027b;

        public a(fu.b classId, h hVar) {
            kotlin.jvm.internal.i.g(classId, "classId");
            this.f32026a = classId;
            this.f32027b = hVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.i.b(this.f32026a, ((a) obj).f32026a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f32026a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<a, gt.e> {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[EDGE_INSN: B:49:0x00c8->B:41:0x00c8 ?: BREAK  , SYNTHETIC] */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final gt.e invoke(a aVar) {
            Object obj;
            j7.k a10;
            boolean z10;
            uu.d dVar;
            gt.e a11;
            a key = aVar;
            kotlin.jvm.internal.i.g(key, "key");
            j jVar = j.this;
            jVar.getClass();
            l lVar = jVar.f32024a;
            Iterator<jt.b> it = lVar.f32053k.iterator();
            do {
                boolean hasNext = it.hasNext();
                fu.b bVar = key.f32026a;
                if (hasNext) {
                    a11 = it.next().a(bVar);
                } else if (j.f32023c.contains(bVar)) {
                    return null;
                } else {
                    h hVar = key.f32027b;
                    if (hVar == null && (hVar = lVar.f32047d.a(bVar)) == null) {
                        return null;
                    }
                    cu.c cVar = hVar.f32016a;
                    au.b bVar2 = hVar.f32017b;
                    cu.a aVar2 = hVar.f32018c;
                    q0 q0Var = hVar.f32019d;
                    fu.b g5 = bVar.g();
                    if (g5 != null) {
                        gt.e a12 = jVar.a(g5, null);
                        if (a12 instanceof uu.d) {
                            dVar = (uu.d) a12;
                        } else {
                            dVar = null;
                        }
                        if (dVar == null) {
                            return null;
                        }
                        fu.e j10 = bVar.j();
                        kotlin.jvm.internal.i.f(j10, "classId.shortClassName");
                        if (!dVar.M0().m().contains(j10)) {
                            return null;
                        }
                        a10 = dVar.F;
                    } else {
                        fu.c h10 = bVar.h();
                        kotlin.jvm.internal.i.f(h10, "classId.packageFqName");
                        Iterator it2 = kotlin.jvm.internal.h.U(lVar.f, h10).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                gt.d0 d0Var = (gt.d0) obj;
                                if (d0Var instanceof q) {
                                    q qVar = (q) d0Var;
                                    fu.e j11 = bVar.j();
                                    kotlin.jvm.internal.i.f(j11, "classId.shortClassName");
                                    qVar.getClass();
                                    if (!((uu.i) ((s) qVar).p()).m().contains(j11)) {
                                        z10 = false;
                                        continue;
                                        if (z10) {
                                            break;
                                        }
                                    }
                                }
                                z10 = true;
                                continue;
                                if (z10) {
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        gt.d0 d0Var2 = (gt.d0) obj;
                        if (d0Var2 == null) {
                            return null;
                        }
                        l lVar2 = jVar.f32024a;
                        au.s sVar = bVar2.Y;
                        kotlin.jvm.internal.i.f(sVar, "classProto.typeTable");
                        cu.e eVar = new cu.e(sVar);
                        cu.f fVar = cu.f.f12049b;
                        au.v vVar = bVar2.f3663a0;
                        kotlin.jvm.internal.i.f(vVar, "classProto.versionRequirementTable");
                        a10 = lVar2.a(d0Var2, cVar, eVar, f.a.a(vVar), aVar2, null);
                    }
                    return new uu.d(a10, bVar2, cVar, aVar2, q0Var);
                }
            } while (a11 == null);
            return a11;
        }
    }

    public j(l components) {
        kotlin.jvm.internal.i.g(components, "components");
        this.f32024a = components;
        this.f32025b = components.f32044a.b(new b());
    }

    public final gt.e a(fu.b classId, h hVar) {
        kotlin.jvm.internal.i.g(classId, "classId");
        return (gt.e) this.f32025b.invoke(new a(classId, hVar));
    }
}

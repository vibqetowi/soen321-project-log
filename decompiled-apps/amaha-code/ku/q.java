package ku;

import dt.n;
import gt.a0;
import kotlin.NoWhenBranchMatchedException;
import wu.b0;
import wu.c0;
import wu.f1;
import wu.i0;
import wu.m1;
import wu.v0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class q extends g<a> {

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: constantValues.kt */
        /* renamed from: ku.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0371a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b0 f23954a;

            public C0371a(b0 b0Var) {
                this.f23954a = b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0371a) && kotlin.jvm.internal.i.b(this.f23954a, ((C0371a) obj).f23954a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f23954a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f23954a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final f f23955a;

            public b(f fVar) {
                this.f23955a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && kotlin.jvm.internal.i.b(this.f23955a, ((b) obj).f23955a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f23955a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f23955a + ')';
            }
        }
    }

    public q(a.C0371a c0371a) {
        super(c0371a);
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        b0 b0Var;
        kotlin.jvm.internal.i.g(module, "module");
        v0.f37300v.getClass();
        v0 v0Var = v0.f37301w;
        dt.j o10 = module.o();
        o10.getClass();
        gt.e j10 = o10.j(n.a.P.h());
        T t3 = this.f23941a;
        a aVar = (a) t3;
        if (aVar instanceof a.C0371a) {
            b0Var = ((a.C0371a) t3).f23954a;
        } else if (aVar instanceof a.b) {
            f fVar = ((a.b) t3).f23955a;
            fu.b bVar = fVar.f23939a;
            gt.e a10 = gt.t.a(module, bVar);
            int i6 = fVar.f23940b;
            if (a10 == null) {
                yu.h hVar = yu.h.f39085x;
                String bVar2 = bVar.toString();
                kotlin.jvm.internal.i.f(bVar2, "classId.toString()");
                b0Var = yu.i.c(hVar, bVar2, String.valueOf(i6));
            } else {
                i0 r = a10.r();
                kotlin.jvm.internal.i.f(r, "descriptor.defaultType");
                m1 g02 = hc.d.g0(r);
                for (int i10 = 0; i10 < i6; i10++) {
                    g02 = module.o().h(g02);
                }
                b0Var = g02;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c0.e(v0Var, j10, ca.a.O0(new f1(b0Var)));
    }

    public q(f fVar) {
        super(new a.b(fVar));
    }

    public q(fu.b bVar, int i6) {
        super(new a.b(new f(bVar, i6)));
    }
}

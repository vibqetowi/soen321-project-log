package ku;

import gt.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wu.b0;
import wu.c0;
import wu.f1;
import wu.i0;
import wu.n1;
import wu.v0;
import wu.x0;
/* compiled from: IntegerLiteralTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class m implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f23947a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f23948b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b0> f23949c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f23950d;

    /* renamed from: e  reason: collision with root package name */
    public final hs.i f23951e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<i0>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final List<i0> invoke() {
            boolean z10 = true;
            m mVar = m.this;
            i0 r = mVar.o().k("Comparable").r();
            kotlin.jvm.internal.i.f(r, "builtIns.comparable.defaultType");
            ArrayList Y0 = ca.a.Y0(kotlin.jvm.internal.h.d0(r, ca.a.O0(new f1(mVar.f23950d, n1.IN_VARIANCE)), null, 2));
            a0 a0Var = mVar.f23948b;
            kotlin.jvm.internal.i.g(a0Var, "<this>");
            i0[] i0VarArr = new i0[4];
            dt.j o10 = a0Var.o();
            o10.getClass();
            i0 t3 = o10.t(dt.k.INT);
            if (t3 != null) {
                i0VarArr[0] = t3;
                dt.j o11 = a0Var.o();
                o11.getClass();
                i0 t10 = o11.t(dt.k.LONG);
                if (t10 != null) {
                    i0VarArr[1] = t10;
                    dt.j o12 = a0Var.o();
                    o12.getClass();
                    i0 t11 = o12.t(dt.k.BYTE);
                    if (t11 != null) {
                        i0VarArr[2] = t11;
                        dt.j o13 = a0Var.o();
                        o13.getClass();
                        i0 t12 = o13.t(dt.k.SHORT);
                        if (t12 != null) {
                            i0VarArr[3] = t12;
                            List P0 = ca.a.P0(i0VarArr);
                            if (!P0.isEmpty()) {
                                Iterator it = P0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (!(!mVar.f23949c.contains((b0) it.next()))) {
                                        z10 = false;
                                        break;
                                    }
                                }
                            }
                            if (!z10) {
                                i0 r10 = mVar.o().k("Number").r();
                                if (r10 != null) {
                                    Y0.add(r10);
                                } else {
                                    dt.j.a(55);
                                    throw null;
                                }
                            }
                            return Y0;
                        }
                        dt.j.a(57);
                        throw null;
                    }
                    dt.j.a(56);
                    throw null;
                }
                dt.j.a(59);
                throw null;
            }
            dt.j.a(58);
            throw null;
        }
    }

    public m() {
        throw null;
    }

    public m(long j10, a0 a0Var, Set set) {
        v0.f37300v.getClass();
        this.f23950d = c0.d(v0.f37301w, this);
        this.f23951e = sp.b.O(new a());
        this.f23947a = j10;
        this.f23948b = a0Var;
        this.f23949c = set;
    }

    @Override // wu.x0
    public final gt.g a() {
        return null;
    }

    @Override // wu.x0
    public final Collection<b0> c() {
        return (List) this.f23951e.getValue();
    }

    @Override // wu.x0
    public final boolean d() {
        return false;
    }

    @Override // wu.x0
    public final List<gt.v0> getParameters() {
        return is.w.f20676u;
    }

    @Override // wu.x0
    public final dt.j o() {
        return this.f23948b.o();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + is.u.m2(this.f23949c, ",", null, null, n.f23953u, 30) + ']');
        return sb2.toString();
    }
}

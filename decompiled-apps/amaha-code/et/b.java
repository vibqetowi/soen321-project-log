package et;

import dt.n;
import gt.a0;
import gt.d0;
import gt.g;
import gt.j;
import gt.p;
import gt.q;
import gt.q0;
import gt.t;
import gt.t0;
import gt.v0;
import gt.x0;
import gt.z;
import hs.k;
import ht.h;
import is.i;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import pu.i;
import vu.l;
import wu.b0;
import wu.c0;
import wu.f1;
import wu.i0;
import wu.n1;
import xs.f;
/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class b extends kt.b {
    public static final fu.b F = new fu.b(n.f13390j, fu.e.j("Function"));
    public static final fu.b G = new fu.b(n.f13387g, fu.e.j("KFunction"));
    public final c A;
    public final int B;
    public final a C;
    public final d D;
    public final List<v0> E;

    /* renamed from: y  reason: collision with root package name */
    public final l f14545y;

    /* renamed from: z  reason: collision with root package name */
    public final d0 f14546z;

    /* compiled from: FunctionClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class a extends wu.b {
        public a() {
            super(b.this.f14545y);
        }

        @Override // wu.b, wu.l, wu.x0
        public final g a() {
            return b.this;
        }

        @Override // wu.x0
        public final boolean d() {
            return true;
        }

        @Override // wu.f
        public final Collection<b0> g() {
            List<fu.b> O0;
            boolean z10;
            Iterable<v0> iterable;
            b bVar = b.this;
            int ordinal = bVar.A.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    int i6 = bVar.B;
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            O0 = ca.a.P0(b.G, new fu.b(n.f13385d, c.f14550y.d(i6)));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        O0 = ca.a.P0(b.G, new fu.b(n.f13390j, c.f14549x.d(i6)));
                    }
                } else {
                    O0 = ca.a.O0(b.F);
                }
            } else {
                O0 = ca.a.O0(b.F);
            }
            a0 c10 = bVar.f14546z.c();
            ArrayList arrayList = new ArrayList(i.H1(O0, 10));
            for (fu.b bVar2 : O0) {
                gt.e a10 = t.a(c10, bVar2);
                if (a10 != null) {
                    int size = a10.l().getParameters().size();
                    List<v0> list = bVar.E;
                    kotlin.jvm.internal.i.g(list, "<this>");
                    if (size >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (size == 0) {
                            iterable = w.f20676u;
                        } else {
                            int size2 = list.size();
                            if (size >= size2) {
                                iterable = u.I2(list);
                            } else if (size == 1) {
                                iterable = ca.a.O0(u.o2(list));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list instanceof RandomAccess) {
                                    for (int i10 = size2 - size; i10 < size2; i10++) {
                                        arrayList2.add(list.get(i10));
                                    }
                                } else {
                                    ListIterator<v0> listIterator = list.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                iterable = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(i.H1(iterable, 10));
                        for (v0 v0Var : iterable) {
                            arrayList3.add(new f1(v0Var.r()));
                        }
                        wu.v0.f37300v.getClass();
                        arrayList.add(c0.e(wu.v0.f37301w, a10, arrayList3));
                    } else {
                        throw new IllegalArgumentException(defpackage.c.q("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar2 + " not found").toString());
                }
            }
            return u.I2(arrayList);
        }

        @Override // wu.x0
        public final List<v0> getParameters() {
            return b.this.E;
        }

        @Override // wu.f
        public final t0 j() {
            return t0.a.f16820a;
        }

        @Override // wu.b
        public final gt.e p() {
            return b.this;
        }

        public final String toString() {
            return b.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l storageManager, dt.b containingDeclaration, c functionKind, int i6) {
        super(storageManager, functionKind.d(i6));
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(functionKind, "functionKind");
        this.f14545y = storageManager;
        this.f14546z = containingDeclaration;
        this.A = functionKind;
        this.B = i6;
        this.C = new a();
        this.D = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        f fVar = new f(1, i6);
        ArrayList arrayList2 = new ArrayList(i.H1(fVar, 10));
        xs.e it = fVar.iterator();
        while (it.f38001w) {
            int nextInt = it.nextInt();
            n1 n1Var = n1.IN_VARIANCE;
            arrayList.add(kt.t0.Q0(this, n1Var, fu.e.j("P" + nextInt), arrayList.size(), this.f14545y));
            arrayList2.add(k.f19476a);
        }
        arrayList.add(kt.t0.Q0(this, n1.OUT_VARIANCE, fu.e.j("R"), arrayList.size(), this.f14545y));
        this.E = u.I2(arrayList);
    }

    @Override // gt.e
    public final boolean B() {
        return false;
    }

    @Override // gt.e
    public final x0<i0> B0() {
        return null;
    }

    @Override // kt.b0
    public final pu.i C0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.D;
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // gt.e
    public final /* bridge */ /* synthetic */ Collection K() {
        return w.f20676u;
    }

    @Override // gt.e
    public final boolean K0() {
        return false;
    }

    @Override // gt.e
    public final boolean L() {
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    @Override // gt.h
    public final boolean N() {
        return false;
    }

    @Override // gt.e
    public final /* bridge */ /* synthetic */ gt.d R() {
        return null;
    }

    @Override // gt.e
    public final pu.i S() {
        return i.b.f29008b;
    }

    @Override // gt.e
    public final /* bridge */ /* synthetic */ gt.e U() {
        return null;
    }

    @Override // gt.e, gt.k, gt.j
    public final j c() {
        return this.f14546z;
    }

    @Override // gt.m
    public final q0 g() {
        return q0.f16815a;
    }

    @Override // ht.a
    public final h getAnnotations() {
        return h.a.f19495a;
    }

    @Override // gt.e, gt.n, gt.y
    public final q getVisibility() {
        p.h PUBLIC = p.f16804e;
        kotlin.jvm.internal.i.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return false;
    }

    @Override // gt.e
    public final boolean isInline() {
        return false;
    }

    @Override // gt.e
    public final int j() {
        return 2;
    }

    @Override // gt.g
    public final wu.x0 l() {
        return this.C;
    }

    @Override // gt.e, gt.y
    public final z m() {
        return z.ABSTRACT;
    }

    @Override // gt.e, gt.h
    public final List<v0> t() {
        return this.E;
    }

    public final String toString() {
        String f = getName().f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        return f;
    }

    @Override // gt.e
    public final boolean w() {
        return false;
    }

    @Override // gt.e
    public final /* bridge */ /* synthetic */ Collection y() {
        return w.f20676u;
    }
}

package xu;

import gt.v0;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import wu.b0;
import wu.d1;
import wu.m1;
/* compiled from: NewCapturedType.kt */
/* loaded from: classes2.dex */
public final class i implements ju.b {

    /* renamed from: a  reason: collision with root package name */
    public final d1 f38105a;

    /* renamed from: b  reason: collision with root package name */
    public ss.a<? extends List<? extends m1>> f38106b;

    /* renamed from: c  reason: collision with root package name */
    public final i f38107c;

    /* renamed from: d  reason: collision with root package name */
    public final v0 f38108d;

    /* renamed from: e  reason: collision with root package name */
    public final hs.d f38109e;

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends m1>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends m1> invoke() {
            ss.a<? extends List<? extends m1>> aVar = i.this.f38106b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends m1>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f38112v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar) {
            super(0);
            this.f38112v = eVar;
        }

        @Override // ss.a
        public final List<? extends m1> invoke() {
            Iterable<m1> iterable = (List) i.this.f38109e.getValue();
            if (iterable == null) {
                iterable = w.f20676u;
            }
            ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
            for (m1 m1Var : iterable) {
                arrayList.add(m1Var.T0(this.f38112v));
            }
            return arrayList;
        }
    }

    public i() {
        throw null;
    }

    public i(d1 d1Var, ss.a<? extends List<? extends m1>> aVar, i iVar, v0 v0Var) {
        this.f38105a = d1Var;
        this.f38106b = aVar;
        this.f38107c = iVar;
        this.f38108d = v0Var;
        this.f38109e = sp.b.N(2, new a());
    }

    @Override // wu.x0
    public final gt.g a() {
        return null;
    }

    @Override // wu.x0
    public final Collection c() {
        List list = (List) this.f38109e.getValue();
        if (list == null) {
            return w.f20676u;
        }
        return list;
    }

    @Override // wu.x0
    public final boolean d() {
        return false;
    }

    @Override // ju.b
    public final d1 e() {
        return this.f38105a;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!kotlin.jvm.internal.i.b(i.class, cls)) {
            return false;
        }
        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.f38107c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        i iVar3 = iVar.f38107c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        if (iVar2 == iVar) {
            return true;
        }
        return false;
    }

    public final i f(e kotlinTypeRefiner) {
        b bVar;
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        d1 c10 = this.f38105a.c(kotlinTypeRefiner);
        kotlin.jvm.internal.i.f(c10, "projection.refine(kotlinTypeRefiner)");
        if (this.f38106b != null) {
            bVar = new b(kotlinTypeRefiner);
        } else {
            bVar = null;
        }
        i iVar = this.f38107c;
        if (iVar == null) {
            iVar = this;
        }
        return new i(c10, bVar, iVar, this.f38108d);
    }

    @Override // wu.x0
    public final List<v0> getParameters() {
        return w.f20676u;
    }

    public final int hashCode() {
        i iVar = this.f38107c;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return super.hashCode();
    }

    @Override // wu.x0
    public final dt.j o() {
        b0 a10 = this.f38105a.a();
        kotlin.jvm.internal.i.f(a10, "projection.type");
        return hc.d.F(a10);
    }

    public final String toString() {
        return "CapturedType(" + this.f38105a + ')';
    }

    public /* synthetic */ i(d1 d1Var, h hVar, i iVar, v0 v0Var, int i6) {
        this(d1Var, (i6 & 2) != 0 ? null : hVar, (i6 & 4) != 0 ? null : iVar, (i6 & 8) != 0 ? null : v0Var);
    }
}

package qt;

import gt.q0;
import is.u;
import is.x;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import wu.b0;
import wu.i0;
import ys.m;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public class b implements ht.c, rt.g {
    public static final /* synthetic */ m<Object>[] f = {y.c(new s(y.a(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a  reason: collision with root package name */
    public final fu.c f30109a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f30110b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.i f30111c;

    /* renamed from: d  reason: collision with root package name */
    public final wt.b f30112d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f30113e;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<i0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q.f f30114u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f30115v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q.f fVar, b bVar) {
            super(0);
            this.f30114u = fVar;
            this.f30115v = bVar;
        }

        @Override // ss.a
        public final i0 invoke() {
            i0 r = this.f30114u.a().o().j(this.f30115v.f30109a).r();
            kotlin.jvm.internal.i.f(r, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return r;
        }
    }

    public b(q.f c10, wt.a aVar, fu.c fqName) {
        q0 q0Var;
        wt.b bVar;
        ArrayList d10;
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(fqName, "fqName");
        this.f30109a = fqName;
        this.f30110b = (aVar == null || (q0Var = ((st.c) c10.f29104v).f31942j.a(aVar)) == null) ? q0.f16815a : q0Var;
        this.f30111c = c10.b().e(new a(c10, this));
        if (aVar != null && (d10 = aVar.d()) != null) {
            bVar = (wt.b) u.h2(d10);
        } else {
            bVar = null;
        }
        this.f30112d = bVar;
        if (aVar != null) {
            aVar.h();
        }
        this.f30113e = false;
    }

    @Override // ht.c
    public final b0 a() {
        return (i0) kotlin.jvm.internal.h.C(this.f30111c, f[0]);
    }

    @Override // ht.c
    public Map<fu.e, ku.g<?>> b() {
        return x.f20677u;
    }

    @Override // ht.c
    public final fu.c e() {
        return this.f30109a;
    }

    @Override // ht.c
    public final q0 g() {
        return this.f30110b;
    }

    @Override // rt.g
    public final boolean h() {
        return this.f30113e;
    }
}

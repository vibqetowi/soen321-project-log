package qt;

import dt.n;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import ku.u;
import ys.m;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class f extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f30123h = {y.c(new s(y.a(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    public final vu.i f30124g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Map<fu.e, ? extends u>> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f30125u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final Map<fu.e, ? extends u> invoke() {
            return sp.b.Q(new hs.f(c.f30116a, new u("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wt.a aVar, q.f c10) {
        super(c10, aVar, n.a.f13408m);
        kotlin.jvm.internal.i.g(c10, "c");
        this.f30124g = c10.b().e(a.f30125u);
    }

    @Override // qt.b, ht.c
    public final Map<fu.e, ku.g<?>> b() {
        return (Map) kotlin.jvm.internal.h.C(this.f30124g, f30123h[0]);
    }
}

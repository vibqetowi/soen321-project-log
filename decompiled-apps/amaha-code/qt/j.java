package qt;

import dt.n;
import ht.n;
import is.x;
import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import ys.m;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class j extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f30131h = {y.c(new s(y.a(j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    public final vu.i f30132g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Map<fu.e, ? extends ku.g<? extends Object>>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Map<fu.e, ? extends ku.g<? extends Object>> invoke() {
            ku.b bVar;
            wt.b bVar2 = j.this.f30112d;
            Map<fu.e, ? extends ku.g<? extends Object>> map = null;
            if (bVar2 instanceof wt.e) {
                Map<String, EnumSet<n>> map2 = e.f30121a;
                bVar = e.a(((wt.e) bVar2).getElements());
            } else if (bVar2 instanceof wt.m) {
                Map<String, EnumSet<n>> map3 = e.f30121a;
                bVar = e.a(ca.a.O0(bVar2));
            } else {
                bVar = null;
            }
            if (bVar != null) {
                map = sp.b.Q(new hs.f(c.f30117b, bVar));
            }
            if (map == null) {
                return x.f20677u;
            }
            return map;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wt.a annotation, q.f c10) {
        super(c10, annotation, n.a.f13414t);
        kotlin.jvm.internal.i.g(annotation, "annotation");
        kotlin.jvm.internal.i.g(c10, "c");
        this.f30132g = c10.b().e(new a());
    }

    @Override // qt.b, ht.c
    public final Map<fu.e, ku.g<Object>> b() {
        return (Map) kotlin.jvm.internal.h.C(this.f30132g, f30131h[0]);
    }
}

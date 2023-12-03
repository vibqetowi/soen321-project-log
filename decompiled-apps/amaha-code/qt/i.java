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
public final class i extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f30128h = {y.c(new s(y.a(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    public final vu.i f30129g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Map<fu.e, ? extends ku.g<?>>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // ss.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<fu.e, ? extends ku.g<?>> invoke() {
            wt.m mVar;
            ku.j jVar;
            String str;
            Map<String, EnumSet<n>> map = e.f30121a;
            wt.b bVar = i.this.f30112d;
            Map<fu.e, ? extends ku.g<?>> map2 = null;
            if (bVar instanceof wt.m) {
                mVar = (wt.m) bVar;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                Map<String, ht.m> map3 = e.f30122b;
                fu.e d10 = mVar.d();
                if (d10 != null) {
                    str = d10.f();
                } else {
                    str = null;
                }
                ht.m mVar2 = map3.get(str);
                if (mVar2 != null) {
                    jVar = new ku.j(fu.b.l(n.a.f13416v), fu.e.j(mVar2.name()));
                    if (jVar != null) {
                        map2 = sp.b.Q(new hs.f(c.f30118c, jVar));
                    }
                    if (map2 != null) {
                        return x.f20677u;
                    }
                    return map2;
                }
            }
            jVar = null;
            if (jVar != null) {
            }
            if (map2 != null) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wt.a annotation, q.f c10) {
        super(c10, annotation, n.a.f13417w);
        kotlin.jvm.internal.i.g(annotation, "annotation");
        kotlin.jvm.internal.i.g(c10, "c");
        this.f30129g = c10.b().e(new a());
    }

    @Override // qt.b, ht.c
    public final Map<fu.e, ku.g<?>> b() {
        return (Map) kotlin.jvm.internal.h.C(this.f30129g, f30128h[0]);
    }
}

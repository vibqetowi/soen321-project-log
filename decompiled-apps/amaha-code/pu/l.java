package pu;

import gt.p0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes2.dex */
public final class l extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f29009d = {y.c(new s(y.a(l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final gt.e f29010b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.i f29011c;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends p0>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends p0> invoke() {
            l lVar = l.this;
            return ca.a.P0(iu.f.e(lVar.f29010b), iu.f.f(lVar.f29010b));
        }
    }

    public l(vu.l storageManager, gt.e containingClass) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(containingClass, "containingClass");
        this.f29010b = containingClass;
        containingClass.j();
        this.f29011c = storageManager.e(new a());
    }

    @Override // pu.j, pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        ys.m<Object> mVar = f29009d[0];
        dv.d dVar = new dv.d();
        for (Object obj : (List) kotlin.jvm.internal.h.C(this.f29011c, mVar)) {
            if (kotlin.jvm.internal.i.b(((p0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // pu.j, pu.k
    public final Collection f(d kindFilter, ss.l nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return (List) kotlin.jvm.internal.h.C(this.f29011c, f29009d[0]);
    }

    @Override // pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return null;
    }
}

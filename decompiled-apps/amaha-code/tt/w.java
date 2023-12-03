package tt;

import dv.b;
import java.util.Collection;
import java.util.Set;
/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes2.dex */
public final class w extends b.a<gt.e, hs.k> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gt.e f33695a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set<Object> f33696b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ss.l<pu.i, Collection<Object>> f33697c;

    public w(e eVar, Set set, ss.l lVar) {
        this.f33695a = eVar;
        this.f33696b = set;
        this.f33697c = lVar;
    }

    @Override // dv.b.c
    public final /* bridge */ /* synthetic */ Object a() {
        return hs.k.f19476a;
    }

    @Override // dv.b.c
    public final boolean c(Object obj) {
        gt.e current = (gt.e) obj;
        kotlin.jvm.internal.i.g(current, "current");
        if (current != this.f33695a) {
            pu.i S = current.S();
            kotlin.jvm.internal.i.f(S, "current.staticScope");
            if (S instanceof y) {
                this.f33696b.addAll(this.f33697c.invoke(S));
                return false;
            }
        }
        return true;
    }
}

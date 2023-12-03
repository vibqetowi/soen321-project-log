package su;

import java.util.List;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f32088u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ gu.n f32089v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f32090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, gu.n nVar, c cVar) {
        super(0);
        this.f32088u = yVar;
        this.f32089v = nVar;
        this.f32090w = cVar;
    }

    @Override // ss.a
    public final List<? extends ht.c> invoke() {
        List<ht.c> list;
        y yVar = this.f32088u;
        f0 a10 = yVar.a((gt.j) yVar.f32074a.f21734w);
        if (a10 != null) {
            list = ((l) yVar.f32074a.f21732u).f32048e.j(a10, this.f32089v, this.f32090w);
        } else {
            list = null;
        }
        if (list == null) {
            return is.w.f20676u;
        }
        return list;
    }
}

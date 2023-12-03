package ut;

import gt.v0;
import kotlin.jvm.internal.k;
import wt.j;
import wu.a1;
import wu.b0;
import wu.i0;
import wu.x0;
/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes2.dex */
public final class b extends k implements ss.a<b0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f34512u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v0 f34513v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f34514w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ x0 f34515x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ j f34516y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, v0 v0Var, a aVar, x0 x0Var, j jVar) {
        super(0);
        this.f34512u = cVar;
        this.f34513v = v0Var;
        this.f34514w = aVar;
        this.f34515x = x0Var;
        this.f34516y = jVar;
    }

    @Override // ss.a
    public final b0 invoke() {
        i0 i0Var;
        a1 a1Var = this.f34512u.f34520d;
        gt.g a10 = this.f34515x.a();
        if (a10 != null) {
            i0Var = a10.r();
        } else {
            i0Var = null;
        }
        a aVar = this.f34514w;
        aVar.getClass();
        return a1Var.b(this.f34513v, a.e(a.e(aVar, 0, false, null, i0Var, 31), 0, this.f34516y.A(), null, null, 59));
    }
}

package su;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.k implements ss.a<ku.g<?>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f31991u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ au.m f31992v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ uu.k f31993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y yVar, au.m mVar, uu.k kVar) {
        super(0);
        this.f31991u = yVar;
        this.f31992v = mVar;
        this.f31993w = kVar;
    }

    @Override // ss.a
    public final ku.g<?> invoke() {
        y yVar = this.f31991u;
        f0 a10 = yVar.a((gt.j) yVar.f32074a.f21734w);
        kotlin.jvm.internal.i.d(a10);
        d<ht.c, ku.g<?>> dVar = ((l) yVar.f32074a.f21732u).f32048e;
        wu.b0 returnType = this.f31993w.getReturnType();
        kotlin.jvm.internal.i.f(returnType, "property.returnType");
        return dVar.k(a10, this.f31992v, returnType);
    }
}

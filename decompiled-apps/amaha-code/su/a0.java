package su;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.k implements ss.a<ku.g<?>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f31975u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ au.m f31976v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ uu.k f31977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, au.m mVar, uu.k kVar) {
        super(0);
        this.f31975u = yVar;
        this.f31976v = mVar;
        this.f31977w = kVar;
    }

    @Override // ss.a
    public final ku.g<?> invoke() {
        y yVar = this.f31975u;
        f0 a10 = yVar.a((gt.j) yVar.f32074a.f21734w);
        kotlin.jvm.internal.i.d(a10);
        d<ht.c, ku.g<?>> dVar = ((l) yVar.f32074a.f21732u).f32048e;
        wu.b0 returnType = this.f31977w.getReturnType();
        kotlin.jvm.internal.i.f(returnType, "property.returnType");
        return dVar.d(a10, this.f31976v, returnType);
    }
}

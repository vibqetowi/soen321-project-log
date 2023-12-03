package mi;
/* compiled from: ViewHandler.kt */
/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e2 f25185u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25186v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(e2 e2Var, pi.d dVar) {
        super(0);
        this.f25185u = e2Var;
        this.f25186v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25185u.f25172b + " buildAndShowInApp() : Could not create view for in-app campaign " + this.f25186v.b() + ",reason: Activity is null.";
    }
}

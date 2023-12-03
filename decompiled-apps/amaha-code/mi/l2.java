package mi;
/* compiled from: ViewHandler.kt */
/* loaded from: classes.dex */
public final class l2 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e2 f25233u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25234v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(e2 e2Var, pi.d dVar) {
        super(0);
        this.f25233u = e2Var;
        this.f25234v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25233u.f25172b + " showInApp() : Will try to show in-app. Campaign id: " + this.f25234v.b();
    }
}

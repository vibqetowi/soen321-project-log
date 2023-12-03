package mi;
/* compiled from: ViewHandler.kt */
/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e2 f25192u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25193v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e2 e2Var, pi.d dVar) {
        super(0);
        this.f25192u = e2Var;
        this.f25193v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25192u.f25172b + " canShowInApp(): Another campaign visible,cannot show campaign " + this.f25193v.b();
    }
}

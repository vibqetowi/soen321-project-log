package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25188u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ si.e f25189v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ri.a f25190w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, si.e eVar, ri.a aVar) {
        super(0);
        this.f25188u = f0Var;
        this.f25189v = eVar;
        this.f25190w = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25188u.f25180b + " getEligibleCampaignFromList() : Cannot show campaign: " + ((Object) this.f25189v.f31592d.f31572a) + " reason: " + this.f25190w.name();
    }
}

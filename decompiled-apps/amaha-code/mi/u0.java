package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25278u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ si.a f25279v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(f0 f0Var, si.a aVar) {
        super(0);
        this.f25278u = f0Var;
        this.f25279v = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25278u.f25180b + " isCampaignEligibleForDisplay() : Cannot show campaign: " + ((Object) this.f25279v.f31572a) + " reason: global delay failure";
    }
}

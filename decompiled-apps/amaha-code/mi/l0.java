package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25230u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ si.a f25231v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f0 f0Var, si.a aVar) {
        super(0);
        this.f25230u = f0Var;
        this.f25231v = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25230u.f25180b + " isCampaignEligibleForDisplay() : Cannot show campaign: " + ((Object) this.f25231v.f31572a) + "reason: already shown max times";
    }
}

package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25287u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(f0 f0Var) {
        super(0);
        this.f25287u = f0Var;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" isCampaignEligibleForDisplay() : Cannot show campaign: meta.campaignId reason: campaign expired", this.f25287u.f25180b);
    }
}

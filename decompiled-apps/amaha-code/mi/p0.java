package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25248u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ si.a f25249v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f8.g f25250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(f0 f0Var, si.a aVar, f8.g gVar) {
        super(0);
        this.f25248u = f0Var;
        this.f25249v = aVar;
        this.f25250w = gVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25248u.f25180b);
        sb2.append(" isCampaignEligibleForDisplay() : Evaluating: ");
        si.a aVar = this.f25249v;
        sb2.append((Object) aVar.f31572a);
        sb2.append("\n Campaign meta: ");
        sb2.append(aVar);
        sb2.append(" \n State: ");
        sb2.append(this.f25250w);
        return sb2.toString();
    }
}

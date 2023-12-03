package mi;

import java.util.Set;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25259u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ si.a f25260v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f25261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(f0 f0Var, si.a aVar, int i6) {
        super(0);
        this.f25259u = f0Var;
        this.f25260v = aVar;
        this.f25261w = i6;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25259u.f25180b);
        sb2.append(" isCampaignEligibleForDisplay() : Cannot show campaign: ");
        si.a aVar = this.f25260v;
        sb2.append((Object) aVar.f31572a);
        sb2.append(" current screen orientation: ");
        sb2.append(this.f25261w);
        sb2.append(" supported orientations : ");
        Set<ri.c> set = aVar.f31581k;
        kotlin.jvm.internal.i.f(set, "meta.supportedOrientations");
        sb2.append(set);
        sb2.append(" reason: in-app is not supported on current orientation.");
        return sb2.toString();
    }
}

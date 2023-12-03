package yi;
/* compiled from: UpdateCampaignState.kt */
/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f38648u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f38649v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i6) {
        super(0);
        this.f38648u = mVar;
        this.f38649v = i6;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f38648u;
        sb2.append(mVar.f38653c);
        sb2.append(" update() : State Updates: ");
        sb2.append(mVar.f38652b);
        sb2.append(", Count: ");
        sb2.append(this.f38649v);
        return sb2.toString();
    }
}

package yi;
/* compiled from: UpdateCampaignState.kt */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f38647u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar) {
        super(0);
        this.f38647u = mVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f38647u;
        sb2.append(mVar.f38653c);
        sb2.append(" update() : Update State: ");
        sb2.append(mVar.f38651a);
        sb2.append(", Campaign-id:");
        sb2.append(mVar.f38652b);
        return sb2.toString();
    }
}

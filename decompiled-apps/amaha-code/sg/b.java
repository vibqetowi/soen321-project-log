package sg;
/* compiled from: AnalyticsHandler.kt */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f31542u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(0);
        this.f31542u = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        a aVar = this.f31542u;
        sb2.append(aVar.f31521c);
        sb2.append(" createAndPersistNewSession() : ");
        sb2.append(aVar.f31524g);
        return sb2.toString();
    }
}

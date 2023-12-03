package sg;
/* compiled from: AnalyticsHandler.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f31545u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ih.i f31546v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ih.i iVar) {
        super(0);
        this.f31545u = aVar;
        this.f31546v = iVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f31545u.f31521c + " onEventTracked() : Will update last interaction time if required. Datapoint: " + this.f31546v.f20090c;
    }
}

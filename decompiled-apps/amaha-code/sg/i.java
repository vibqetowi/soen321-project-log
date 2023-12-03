package sg;
/* compiled from: AnalyticsHandler.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f31550u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar) {
        super(0);
        this.f31550u = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onEventTracked() : App is in foreground, return", this.f31550u.f31521c);
    }
}

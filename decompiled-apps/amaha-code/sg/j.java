package sg;
/* compiled from: AnalyticsHandler.kt */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f31551u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar) {
        super(0);
        this.f31551u = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onEventTracked() : No existing session, creating new one.", this.f31551u.f31521c);
    }
}

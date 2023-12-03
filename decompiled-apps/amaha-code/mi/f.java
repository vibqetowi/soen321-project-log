package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25177u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25178v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, pi.d dVar) {
        super(0);
        this.f25177u = aVar;
        this.f25178v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25177u.D + " conditionAction() : Given view is not a rating widget, " + this.f25178v.b();
    }
}

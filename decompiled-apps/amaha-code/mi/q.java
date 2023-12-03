package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25252u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25253v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, pi.d dVar) {
        super(0);
        this.f25252u = aVar;
        this.f25253v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25252u.D + " userInputAction() : given view is not rating, aborting, " + this.f25253v.b();
    }
}

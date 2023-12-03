package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25147u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25148v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, pi.d dVar) {
        super(0);
        this.f25147u = aVar;
        this.f25148v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25147u.D + " conditionAction() : Not a valid condition action, " + this.f25148v.b();
    }
}

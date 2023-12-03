package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25166u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25167v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, pi.d dVar) {
        super(0);
        this.f25166u = aVar;
        this.f25167v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25166u.D + " conditionAction() : Did not find view with id, " + this.f25167v.b();
    }
}

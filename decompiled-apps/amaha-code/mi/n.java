package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25238u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25239v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, pi.d dVar) {
        super(0);
        this.f25238u = aVar;
        this.f25239v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25238u.D + " userInputAction() : Not a valid user input action, " + this.f25239v.b();
    }
}

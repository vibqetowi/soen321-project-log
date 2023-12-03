package mi;
/* compiled from: ConfigurationChangeHandler.kt */
/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f25265u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25266v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, pi.d dVar) {
        super(0);
        this.f25265u = a0Var;
        this.f25266v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25265u.f25130a + " saveLastInAppShownData() : " + this.f25266v.b() + " is an embedded template, not a supported template type.";
    }
}

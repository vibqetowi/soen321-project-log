package mi;
/* compiled from: ConfigurationChangeHandler.kt */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f25285u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25286v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, pi.d dVar) {
        super(0);
        this.f25285u = a0Var;
        this.f25286v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25285u.f25130a + " showInAppOnConfigurationChange() : " + this.f25286v.b() + " is not supported in current orientation.";
    }
}

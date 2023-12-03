package mi;
/* compiled from: ConfigurationChangeHandler.kt */
/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f25281u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var) {
        super(0);
        this.f25281u = a0Var;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        a0 a0Var = this.f25281u;
        sb2.append(a0Var.f25130a);
        sb2.append(" showInAppOnConfigurationChange() : Will try to show in-app, ");
        sb2.append((pi.d) a0Var.f25131b.f30640c);
        return sb2.toString();
    }
}

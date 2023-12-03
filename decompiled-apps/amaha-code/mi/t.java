package mi;
/* compiled from: ConfigurationChangeHandler.kt */
/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f25269u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.d f25270v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, pi.d dVar) {
        super(0);
        this.f25269u = a0Var;
        this.f25270v = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25269u.f25130a);
        sb2.append(" saveLastInAppShownData() : Saving last in-app shown data: ");
        pi.d dVar = this.f25270v;
        sb2.append(dVar.b());
        sb2.append(' ');
        sb2.append(pl.a.j(dVar.e()));
        return sb2.toString();
    }
}

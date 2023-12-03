package mi;
/* compiled from: ConfigurationChangeHandler.kt */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f25292u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var) {
        super(0);
        this.f25292u = a0Var;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        a0 a0Var = this.f25292u;
        sb2.append(a0Var.f25130a);
        sb2.append(" updateActivityData() : configChangeMeta: configChangeMeta:[");
        r9.o oVar = a0Var.f25131b;
        sb2.append((Object) ((String) oVar.f30641d));
        sb2.append(", ");
        return defpackage.c.s(sb2, oVar.f30639b, ']');
    }
}

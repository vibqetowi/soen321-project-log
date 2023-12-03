package tj;
/* compiled from: TimerTemplateBuilder.kt */
/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s0 f33138u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var) {
        super(0);
        this.f33138u = s0Var;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        s0 s0Var = this.f33138u;
        sb2.append(s0Var.f);
        sb2.append(" buildCollapsedTimerTemplate() : Template: ");
        sb2.append(s0Var.f33141b.f34215d);
        return sb2.toString();
    }
}

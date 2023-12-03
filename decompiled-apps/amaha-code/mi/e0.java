package mi;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f0 f25168u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f25169v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, String str) {
        super(0);
        this.f25168u = f0Var;
        this.f25169v = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25168u.f25180b + " canShowInAppOnActivity() : InApp blocked on screen: " + this.f25169v;
    }
}

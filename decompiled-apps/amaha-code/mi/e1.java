package mi;
/* compiled from: InAppController.kt */
/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h1 f25170u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var) {
        super(0);
        this.f25170u = h1Var;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" showInAppIfPossible() :  showInApp() cannot processed, will be processed only when the current orientation is same as the orientation when the in-app show method was called for the first time on the current screen.", this.f25170u.f25198b);
    }
}

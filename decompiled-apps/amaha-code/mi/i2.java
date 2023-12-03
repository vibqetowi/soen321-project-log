package mi;
/* compiled from: ViewHandler.kt */
/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e2 f25211u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(e2 e2Var) {
        super(0);
        this.f25211u = e2Var;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" canShowInApp() : Cannot show in-app, view dimensions exceed device dimensions.", this.f25211u.f25172b);
    }
}

package wu;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.a<Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w0 f37218u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ zu.n f37219v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ zu.i f37220w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ zu.i f37221x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w0 w0Var, zu.n nVar, zu.i iVar, zu.i iVar2) {
        super(0);
        this.f37218u = w0Var;
        this.f37219v = nVar;
        this.f37220w = iVar;
        this.f37221x = iVar2;
    }

    @Override // ss.a
    public final Boolean invoke() {
        return Boolean.valueOf(kc.f.L(this.f37218u, this.f37219v.K(this.f37220w), this.f37221x));
    }
}

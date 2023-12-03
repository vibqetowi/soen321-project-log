package hr;
/* compiled from: ScreenResult2FragmentNew.kt */
/* loaded from: classes2.dex */
public final class r2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q2 f19078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(q2 q2Var) {
        super(1);
        this.f19078u = q2Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            q2 q2Var = this.f19078u;
            q2Var.K().K0(false);
            if (q2Var.K().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(q2Var.K().getIntent().getStringExtra("source"), "goals")) {
                q2Var.K().n0();
            } else {
                q2Var.K().t0();
            }
        }
        return hs.k.f19476a;
    }
}

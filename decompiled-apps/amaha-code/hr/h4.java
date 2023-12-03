package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult9FragmentNew.kt */
/* loaded from: classes2.dex */
public final class h4 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g4 f18528u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(g4 g4Var) {
        super(1);
        this.f18528u = g4Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            g4 g4Var = this.f18528u;
            TemplateActivity templateActivity = g4Var.f18442x;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = g4Var.f18442x;
                if (templateActivity2 != null) {
                    templateActivity2.t0();
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}

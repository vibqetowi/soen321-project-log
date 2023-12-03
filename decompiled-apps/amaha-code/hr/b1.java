package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult18FragmentNew.kt */
/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a1 f18183u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a1 a1Var) {
        super(1);
        this.f18183u = a1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            a1 a1Var = this.f18183u;
            TemplateActivity templateActivity = a1Var.f18124w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = a1Var.f18124w;
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

package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult20FragmentNew.kt */
/* loaded from: classes2.dex */
public final class n1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m1 f18874u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(m1 m1Var) {
        super(1);
        this.f18874u = m1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            m1 m1Var = this.f18874u;
            TemplateActivity templateActivity = m1Var.f18788w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = m1Var.f18788w;
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

package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult5FragmentNew.kt */
/* loaded from: classes2.dex */
public final class n3 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m3 f18878u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(m3 m3Var) {
        super(1);
        this.f18878u = m3Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            m3 m3Var = this.f18878u;
            TemplateActivity templateActivity = m3Var.f18809w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = m3Var.f18809w;
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

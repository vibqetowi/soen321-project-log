package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult25FragmentNew.kt */
/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d2 f18331u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d2 d2Var) {
        super(1);
        this.f18331u = d2Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            d2 d2Var = this.f18331u;
            TemplateActivity templateActivity = d2Var.f18295v;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = d2Var.f18295v;
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

package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult7FragmentNew.kt */
/* loaded from: classes2.dex */
public final class y3 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x3 f19411u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(x3 x3Var) {
        super(1);
        this.f19411u = x3Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            x3 x3Var = this.f19411u;
            TemplateActivity templateActivity = x3Var.f19375x;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = x3Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}

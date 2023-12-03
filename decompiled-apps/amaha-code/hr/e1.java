package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult19FragmentNew.kt */
/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d1 f18330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(d1 d1Var) {
        super(1);
        this.f18330u = d1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        TemplateActivity templateActivity;
        if (bool != null) {
            d1 d1Var = this.f18330u;
            androidx.fragment.app.p requireActivity = d1Var.requireActivity();
            if (requireActivity instanceof TemplateActivity) {
                templateActivity = (TemplateActivity) requireActivity;
            } else {
                templateActivity = null;
            }
            if (templateActivity != null) {
                templateActivity.K0(false);
            }
            androidx.fragment.app.p activity = d1Var.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity).t0();
        }
        return hs.k.f19476a;
    }
}

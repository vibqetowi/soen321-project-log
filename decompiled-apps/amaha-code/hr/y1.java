package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult22FragmentNew.kt */
/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w1 f19407u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(w1 w1Var) {
        super(1);
        this.f19407u = w1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            w1 w1Var = this.f19407u;
            TemplateActivity templateActivity = w1Var.f19333x;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = w1Var.getActivity();
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

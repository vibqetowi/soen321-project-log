package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult17FragmentNew.kt */
/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w0 f19368u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(w0 w0Var) {
        super(1);
        this.f19368u = w0Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            w0 w0Var = this.f19368u;
            TemplateActivity templateActivity = w0Var.f19317w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = w0Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity).x0();
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}

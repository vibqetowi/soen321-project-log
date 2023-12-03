package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult1FragmentNew.kt */
/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i1 f18611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i1 i1Var) {
        super(1);
        this.f18611u = i1Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        i1 i1Var = this.f18611u;
        TemplateActivity templateActivity = i1Var.f18560v;
        if (templateActivity != null) {
            templateActivity.K0(false);
            androidx.fragment.app.p activity = i1Var.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity2 = i1Var.f18560v;
                if (templateActivity2 != null) {
                    if (r1.b0.c(templateActivity2, "source", "goals")) {
                        androidx.fragment.app.p activity2 = i1Var.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity2).n0();
                        return hs.k.f19476a;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity3 = i1Var.f18560v;
            if (templateActivity3 != null) {
                templateActivity3.t0();
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }
}

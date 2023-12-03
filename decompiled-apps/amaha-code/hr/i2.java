package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult26FragmentNew.kt */
/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h2 f18572u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2 h2Var) {
        super(1);
        this.f18572u = h2Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            h2 h2Var = this.f18572u;
            TemplateActivity templateActivity = h2Var.f18500v;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = h2Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity2 = h2Var.f18500v;
                    if (templateActivity2 != null) {
                        if (r1.b0.c(templateActivity2, "source", "goals")) {
                            androidx.fragment.app.p activity2 = h2Var.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).n0();
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity3 = h2Var.f18500v;
                if (templateActivity3 != null) {
                    templateActivity3.t0();
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

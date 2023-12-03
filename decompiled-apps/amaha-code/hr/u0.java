package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult16FragmentNew.kt */
/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s0 f19229u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var) {
        super(1);
        this.f19229u = s0Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            s0 s0Var = this.f19229u;
            TemplateActivity templateActivity = s0Var.f19113v;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = s0Var.f19113v;
                if (templateActivity2 != null) {
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = s0Var.f19113v;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = s0Var.f19113v;
                                if (templateActivity4 != null) {
                                    templateActivity4.n0();
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    TemplateActivity templateActivity5 = s0Var.f19113v;
                    if (templateActivity5 != null) {
                        templateActivity5.t0();
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
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

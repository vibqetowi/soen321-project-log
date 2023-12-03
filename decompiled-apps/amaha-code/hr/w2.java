package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult30FragmentNew.kt */
/* loaded from: classes2.dex */
public final class w2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ v2 f19341u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(v2 v2Var) {
        super(1);
        this.f19341u = v2Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            v2 v2Var = this.f19341u;
            TemplateActivity templateActivity = v2Var.f19276v;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = v2Var.f19276v;
                if (templateActivity2 != null) {
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = v2Var.f19276v;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = v2Var.f19276v;
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
                    TemplateActivity templateActivity5 = v2Var.f19276v;
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

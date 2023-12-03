package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult15FragmentNew.kt */
/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n0 f18906u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0 n0Var) {
        super(1);
        this.f18906u = n0Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            n0 n0Var = this.f18906u;
            TemplateActivity templateActivity = n0Var.f18863z;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = n0Var.f18863z;
                if (templateActivity2 != null) {
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = n0Var.f18863z;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = n0Var.f18863z;
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
                    TemplateActivity templateActivity5 = n0Var.f18863z;
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

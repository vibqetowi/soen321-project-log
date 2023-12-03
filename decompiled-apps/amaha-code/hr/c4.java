package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: ScreenResult8FragmentNew.kt */
/* loaded from: classes2.dex */
public final class c4 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b4 f18232u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(b4 b4Var) {
        super(1);
        this.f18232u = b4Var;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool != null) {
            b4 b4Var = this.f18232u;
            TemplateActivity templateActivity = b4Var.f18189v;
            if (templateActivity != null) {
                templateActivity.K0(false);
                TemplateActivity templateActivity2 = b4Var.f18189v;
                if (templateActivity2 != null) {
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = b4Var.f18189v;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = b4Var.f18189v;
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
                    TemplateActivity templateActivity5 = b4Var.f18189v;
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

package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18358u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h0 f18359v;

    public /* synthetic */ f0(h0 h0Var, int i6) {
        this.f18358u = i6;
        this.f18359v = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18358u;
        h0 this$0 = this.f18359v;
        switch (i6) {
            case 0:
                int i10 = h0.f18483y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18486w;
                if (templateActivity != null) {
                    templateActivity.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i11 = h0.f18483y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity2 = this$0.f18486w;
                if (templateActivity2 != null) {
                    templateActivity2.P = true;
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = this$0.f18486w;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = this$0.f18486w;
                                if (templateActivity4 != null) {
                                    templateActivity4.I = false;
                                    templateActivity4.R = true;
                                    Goal y02 = templateActivity4.y0();
                                    kotlin.jvm.internal.i.d(y02);
                                    if (kotlin.jvm.internal.i.b(y02.getGoalId(), "6qK2pb8neT5Ihz0k252g")) {
                                        TemplateActivity templateActivity5 = this$0.f18486w;
                                        if (templateActivity5 != null) {
                                            templateActivity5.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    TemplateActivity templateActivity6 = this$0.f18486w;
                                    if (templateActivity6 != null) {
                                        templateActivity6.onBackPressed();
                                        TemplateActivity templateActivity7 = this$0.f18486w;
                                        if (templateActivity7 != null) {
                                            templateActivity7.onBackPressed();
                                            TemplateActivity templateActivity8 = this$0.f18486w;
                                            if (templateActivity8 != null) {
                                                templateActivity8.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    TemplateActivity templateActivity9 = this$0.f18486w;
                    if (templateActivity9 != null) {
                        templateActivity9.onBackPressed();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
        }
    }
}

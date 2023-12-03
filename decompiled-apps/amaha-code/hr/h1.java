package hr;

import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.TemplateModel;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18497u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i1 f18498v;

    public /* synthetic */ h1(i1 i1Var, int i6) {
        this.f18497u = i6;
        this.f18498v = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18497u;
        i1 this$0 = this.f18498v;
        switch (i6) {
            case 0:
                int i10 = i1.f18558z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$0, 10);
                a1Var.b();
                return;
            case 1:
                int i11 = i1.f18558z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity).I = false;
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).R = true;
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).onBackPressed();
                return;
            default:
                int i12 = i1.f18558z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18560v;
                String str = null;
                if (templateActivity != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity.F.get("log_back"), Boolean.TRUE)) {
                        TemplateActivity templateActivity2 = this$0.f18560v;
                        if (templateActivity2 != null) {
                            androidx.fragment.app.y yVar = templateActivity2.B;
                            kotlin.jvm.internal.i.d(yVar);
                            yVar.W();
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    androidx.fragment.app.p activity4 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = this$0.f18560v;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = this$0.f18560v;
                                if (templateActivity4 != null) {
                                    TemplateModel templateModel = templateActivity4.f10547y;
                                    if (templateModel != null) {
                                        str = templateModel.getLabel();
                                    }
                                    if (kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity5).I = false;
                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity6).R = true;
                                        androidx.fragment.app.p activity7 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity7).onBackPressed();
                                        return;
                                    }
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity8).o0();
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    androidx.fragment.app.p activity9 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity9).I = false;
                    androidx.fragment.app.p activity10 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity10).onBackPressed();
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
        }
    }
}

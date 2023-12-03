package hr;

import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.TemplateModel;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19009u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s3 f19010v;

    public /* synthetic */ q3(s3 s3Var, int i6) {
        this.f19009u = i6;
        this.f19010v = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f19009u;
        String str = null;
        s3 this$0 = this.f19010v;
        switch (i6) {
            case 0:
                int i10 = s3.f19129z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$0, 20);
                a1Var.b();
                return;
            case 1:
                int i11 = s3.f19129z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity).I = false;
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).R = true;
                TemplateActivity templateActivity = this$0.f19131v;
                if (templateActivity != null) {
                    templateActivity.F.put("edit_back", Boolean.TRUE);
                    androidx.fragment.app.p activity3 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).onBackPressed();
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            default:
                int i12 = s3.f19129z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                    androidx.fragment.app.p activity5 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (r1.b0.c((TemplateActivity) activity5, "source", "goals")) {
                        ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e", "GOorgabeKajhZhtBwFqL");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        TemplateModel templateModel = ((TemplateActivity) activity6).f10547y;
                        if (templateModel != null) {
                            str = templateModel.getLabel();
                        }
                        if (!is.u.Z1(k10, str)) {
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity7).o0();
                            return;
                        }
                    }
                }
                androidx.fragment.app.p activity8 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity8).I = false;
                androidx.fragment.app.p activity9 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity9).onBackPressed();
                return;
        }
    }
}

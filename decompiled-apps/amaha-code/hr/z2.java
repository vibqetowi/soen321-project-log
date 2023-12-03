package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z2 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19434u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a3 f19435v;

    public /* synthetic */ z2(a3 a3Var, int i6) {
        this.f19434u = i6;
        this.f19435v = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f19434u;
        a3 this$0 = this.f19435v;
        String str2 = null;
        switch (i6) {
            case 0:
                int i10 = a3.f18139z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18142w;
                if (templateActivity != null) {
                    templateActivity.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i11 = a3.f18139z;
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
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity2 = this$0.f18142w;
                    if (templateActivity2 != null) {
                        if (r1.b0.c(templateActivity2, "source", "goals")) {
                            ArrayList k10 = ca.a.k("xe7jcogqngzLjogc87oW", "RCjiqbnaYq7GiSwjDK9b");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            TemplateModel templateModel = ((TemplateActivity) activity5).f10547y;
                            if (templateModel != null) {
                                str = templateModel.getLabel();
                            } else {
                                str = null;
                            }
                            if (is.u.Z1(k10, str)) {
                                androidx.fragment.app.p activity6 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity6).onBackPressed();
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                String[] strArr = {"Q3xwy0JpjsDxMhMSz2iJ", "RLeP6oZozGdOkedoDWi6"};
                androidx.fragment.app.p activity7 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y02 = ((TemplateActivity) activity7).y0();
                if (y02 != null) {
                    str2 = y02.getGoalId();
                }
                if (is.k.Q1(str2, strArr)) {
                    androidx.fragment.app.p activity8 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity8).onBackPressed();
                    androidx.fragment.app.p activity9 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity9).onBackPressed();
                    androidx.fragment.app.p activity10 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity10).onBackPressed();
                    androidx.fragment.app.p activity11 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity11).onBackPressed();
                    return;
                }
                return;
        }
    }
}

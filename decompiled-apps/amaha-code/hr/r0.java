package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19065u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s0 f19066v;

    public /* synthetic */ r0(s0 s0Var, int i6) {
        this.f19065u = i6;
        this.f19066v = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f19065u;
        s0 this$0 = this.f19066v;
        switch (i6) {
            case 0:
                int i10 = s0.f19111y;
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
            case 1:
                int i11 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K();
                return;
            case 2:
                int i12 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity = this$0.f19113v;
                    if (templateActivity != null) {
                        if (r1.b0.c(templateActivity, "source", "goals")) {
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity5).o0();
                            return;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                androidx.fragment.app.p activity6 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity6).I = false;
                androidx.fragment.app.p activity7 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity7).onBackPressed();
                return;
            case 3:
                int i13 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity2 = this$0.f19113v;
                if (templateActivity2 != null) {
                    templateActivity2.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 4:
                int i14 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K();
                return;
            default:
                int i15 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity8 = this$0.getActivity();
                if (activity8 != null) {
                    activity8.finish();
                    return;
                }
                return;
        }
    }
}

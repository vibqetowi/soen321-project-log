package hr;

import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g3 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18436u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h3 f18437v;

    public /* synthetic */ g3(h3 h3Var, int i6) {
        this.f18436u = i6;
        this.f18437v = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18436u;
        h3 this$0 = this.f18437v;
        switch (i6) {
            case 0:
                int i10 = h3.f18513z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$0, 18);
                a1Var.b();
                return;
            case 1:
                int i11 = h3.f18513z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18516w;
                if (templateActivity != null) {
                    androidx.fragment.app.y yVar = templateActivity.B;
                    kotlin.jvm.internal.i.d(yVar);
                    yVar.W();
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 2:
                int i12 = h3.f18513z;
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
                int i13 = h3.f18513z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity2 = this$0.f18516w;
                if (templateActivity2 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity2.F.get("log_back"), Boolean.TRUE)) {
                        TemplateActivity templateActivity3 = this$0.f18516w;
                        if (templateActivity3 != null) {
                            androidx.fragment.app.y yVar2 = templateActivity3.B;
                            kotlin.jvm.internal.i.d(yVar2);
                            yVar2.W();
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    androidx.fragment.app.p activity4 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity4 = this$0.f18516w;
                        if (templateActivity4 != null) {
                            if (r1.b0.c(templateActivity4, "source", "goals")) {
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
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
        }
    }
}

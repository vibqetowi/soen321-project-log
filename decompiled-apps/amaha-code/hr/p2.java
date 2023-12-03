package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18948u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q2 f18949v;

    public /* synthetic */ p2(q2 q2Var, int i6) {
        this.f18948u = i6;
        this.f18949v = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18948u;
        q2 this$0 = this.f18949v;
        switch (i6) {
            case 0:
                int i10 = q2.f18995z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().o0();
                return;
            default:
                int i11 = q2.f18995z;
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
        }
    }
}

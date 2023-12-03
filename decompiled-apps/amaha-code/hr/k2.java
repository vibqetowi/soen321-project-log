package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k2 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18674u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l2 f18675v;

    public /* synthetic */ k2(l2 l2Var, int i6) {
        this.f18674u = i6;
        this.f18675v = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18674u;
        l2 this$0 = this.f18675v;
        switch (i6) {
            case 0:
                int i10 = l2.f18725y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18728w;
                if (templateActivity != null) {
                    templateActivity.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 1:
                int i11 = l2.f18725y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity2 = this$0.f18728w;
                if (templateActivity2 != null) {
                    templateActivity2.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i12 = l2.f18725y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity).t0();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18726u, "exception on click listener", e10);
                    return;
                }
        }
    }
}

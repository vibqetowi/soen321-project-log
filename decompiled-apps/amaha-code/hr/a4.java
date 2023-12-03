package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a4 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18153u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b4 f18154v;

    public /* synthetic */ a4(b4 b4Var, int i6) {
        this.f18153u = i6;
        this.f18154v = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18153u;
        b4 this$0 = this.f18154v;
        switch (i6) {
            case 0:
                int i10 = b4.f18187z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18189v;
                if (templateActivity != null) {
                    templateActivity.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i11 = b4.f18187z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
        }
    }
}

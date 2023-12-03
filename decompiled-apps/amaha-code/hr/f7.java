package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f7 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18388u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g7 f18389v;

    public /* synthetic */ f7(g7 g7Var, int i6) {
        this.f18388u = i6;
        this.f18389v = g7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18388u;
        g7 this$0 = this.f18389v;
        switch (i6) {
            case 0:
                int i10 = g7.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
            case 1:
                int i11 = g7.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
            case 2:
                int i12 = g7.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.D;
                if (templateActivity != null) {
                    templateActivity.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i13 = g7.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
        }
    }
}

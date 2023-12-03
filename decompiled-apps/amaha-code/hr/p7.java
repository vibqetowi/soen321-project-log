package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p7 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18975u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q7 f18976v;

    public /* synthetic */ p7(q7 q7Var, int i6) {
        this.f18975u = i6;
        this.f18976v = q7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18975u;
        q7 this$0 = this.f18976v;
        switch (i6) {
            case 0:
                int i10 = q7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
            case 1:
                int i11 = q7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
            case 2:
                int i12 = q7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.C;
                if (templateActivity != null) {
                    templateActivity.o0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i13 = q7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.O();
                return;
        }
    }
}

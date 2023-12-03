package ho;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17963u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f17964v;

    public /* synthetic */ a0(c0 c0Var, int i6) {
        this.f17963u = i6;
        this.f17964v = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f17963u;
        c0 this$0 = this.f17964v;
        switch (i6) {
            case 0:
                int i10 = c0.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                gk.a.b(null, "pro_assessment_fetch_fail");
                ProInitialAssessmentActivity proInitialAssessmentActivity = this$0.f17979v;
                if (proInitialAssessmentActivity != null) {
                    proInitialAssessmentActivity.finish();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i11 = c0.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("retries", this$0.f17980w);
                    gk.a.b(bundle, "pro_assessment_fetch_retry");
                    this$0.O();
                    ProInitialAssessmentActivity proInitialAssessmentActivity2 = this$0.f17979v;
                    if (proInitialAssessmentActivity2 != null) {
                        proInitialAssessmentActivity2.w0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                return;
        }
    }
}

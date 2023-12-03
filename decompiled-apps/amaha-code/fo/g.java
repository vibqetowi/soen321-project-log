package fo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.network.model.RequestStatus;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15642u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f15643v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ProInitialAssessmentActivity f15644w;

    public /* synthetic */ g(Dialog dialog, ProInitialAssessmentActivity proInitialAssessmentActivity) {
        this.f15643v = dialog;
        this.f15644w = proInitialAssessmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15642u;
        Dialog dialog = this.f15643v;
        ProInitialAssessmentActivity this$0 = this.f15644w;
        switch (i6) {
            case 0:
                int i10 = ProInitialAssessmentActivity.G;
                i.g(this$0, "this$0");
                i.g(dialog, "$dialog");
                Bundle bundle = new Bundle();
                bundle.putInt("page", this$0.f11517x - 1);
                gk.a.b(bundle, "pro_assessment_quit_yes");
                if (this$0.f11517x >= 14) {
                    RequestStatus requestStatus = this$0.C;
                    if (requestStatus != null) {
                        if (requestStatus == RequestStatus.REQUEST_SUCCESS) {
                            ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                        }
                    } else {
                        i.q("requestStatus");
                        throw null;
                    }
                }
                dialog.dismiss();
                this$0.finish();
                return;
            default:
                int i11 = ProInitialAssessmentActivity.G;
                i.g(dialog, "$dialog");
                i.g(this$0, "this$0");
                Bundle bundle2 = new Bundle();
                bundle2.putInt("page", this$0.f11517x - 1);
                gk.a.b(bundle2, "pro_assessment_quit_no");
                dialog.dismiss();
                return;
        }
    }

    public /* synthetic */ g(ProInitialAssessmentActivity proInitialAssessmentActivity, Dialog dialog) {
        this.f15644w = proInitialAssessmentActivity;
        this.f15643v = dialog;
    }
}

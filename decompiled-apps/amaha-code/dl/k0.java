package dl;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.network.model.ResendVerifyEmailModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13055u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13056v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Dialog f13057w;

    public /* synthetic */ k0(Dialog dialog, V3DashboardActivity v3DashboardActivity, int i6) {
        this.f13055u = i6;
        this.f13057w = dialog;
        this.f13056v = v3DashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f13055u;
        V3DashboardActivity this$0 = this.f13056v;
        Dialog dialog = this.f13057w;
        switch (i6) {
            case 0:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                gk.a.b(null, "b2b_resend_verification_pop_up_click");
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                if (stringValue != null) {
                    ml.c0 P0 = this$0.P0();
                    try {
                        ta.v.H(kc.f.H(P0), null, 0, new ml.q0(P0, new ResendVerifyEmailModel(stringValue), null), 3);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(P0.A, e10);
                    }
                }
                dialog.dismiss();
                return;
            case 1:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$subscriptionExpireDialog");
                this$0.F0.a(tr.r.s(this$0, false).putExtra("source", Constants.SCREEN_DASHBOARD));
                dialog.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_cta_click");
                return;
            case 2:
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                this$0.startActivity(new Intent(this$0, AllTopicalCoursesActivity.class));
                dialog.dismiss();
                return;
            case 3:
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                dialog.dismiss();
                this$0.H.showBadFeedbackDialog();
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_cancel");
                return;
            default:
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str2 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_positive");
                dialog.dismiss();
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils utils = Utils.INSTANCE;
                    String string = this$0.getString(R.string.topicalCourseEndNoteToast);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.topicalCourseEndNoteToast)");
                    utils.showCustomToast(this$0, string);
                    return;
                }
                this$0.H.showPlayStoreReviewFeedbackPopup();
                return;
        }
    }

    public /* synthetic */ k0(V3DashboardActivity v3DashboardActivity, Dialog dialog, int i6) {
        this.f13055u = i6;
        this.f13056v = v3DashboardActivity;
        this.f13057w = dialog;
    }
}

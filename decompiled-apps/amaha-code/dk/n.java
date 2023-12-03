package dk;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N18AScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N3ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N9AScreenFragment;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import ik.b1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12939u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f12940v;

    public /* synthetic */ n(Dialog dialog, int i6) {
        this.f12939u = i6;
        this.f12940v = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f12939u;
        Dialog dialog = this.f12940v;
        switch (i6) {
            case 0:
                int i10 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 1:
                int i11 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 2:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 3:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 4:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 5:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 6:
                int i12 = b1.I;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 7:
                int i13 = b1.I;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 8:
                int i14 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 9:
                int i15 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 10:
                int i16 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                try {
                    dialog.dismiss();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e10);
                    return;
                }
            case 11:
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                gk.a.b(null, "b2b_resend_verification_pop_up_dismiss_click");
                dialog.dismiss();
                return;
            case 12:
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$subscriptionExpireDialog");
                dialog.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_dismiss");
                return;
            case 13:
                int i19 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 14:
                int i20 = hl.g.K;
                kotlin.jvm.internal.i.g(dialog, "$subscriptionExpireDialog");
                dialog.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_dismiss");
                return;
            case 15:
                int i21 = hl.s.f17728g0;
                kotlin.jvm.internal.i.g(dialog, "$subscriptionExpireDialog");
                dialog.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_dismiss");
                return;
            case 16:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 17:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 18:
                int i22 = N18AScreenFragment.A;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 19:
                int i23 = N3ScreenFragment.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 20:
                int i24 = N9AScreenFragment.f11084z;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 21:
                int i25 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 22:
                int i26 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule_cancel");
                return;
            case 23:
                int i27 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                String str2 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule_cancel");
                return;
            case 24:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 25:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 26:
                int i28 = cm.l.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                String str3 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule_cancel");
                return;
            case 27:
                int i29 = cm.l.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 28:
                int i30 = cm.p.G;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                String str4 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule_cancel");
                return;
            default:
                int i31 = cm.p.G;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
        }
    }
}

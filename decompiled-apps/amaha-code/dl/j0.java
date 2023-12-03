package dl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13048u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13049v;

    public /* synthetic */ j0(V3DashboardActivity v3DashboardActivity, int i6) {
        this.f13048u = i6;
        this.f13049v = v3DashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f13048u;
        V3DashboardActivity this$0 = this.f13049v;
        switch (i6) {
            case 0:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null) {
                    user.setCurrentCourseName(Constants.COURSE_ADHD);
                }
                User user2 = firebasePersistence.getUser();
                if (user2 != null) {
                    user2.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_ADHD));
                }
                firebasePersistence.updateUserOnFirebase();
                this$0.startActivity(new Intent(this$0, CustomDashboardActivity.class));
                this$0.finish();
                String str = gk.a.f16573a;
                Bundle a10 = r1.b0.a("course", Constants.COURSE_ADHD);
                a10.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a10.putBoolean("reset_flow", false);
                a10.putString("source", "top_nav");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "pre_domain_selection_existing");
                return;
            case 1:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                User user3 = firebasePersistence2.getUser();
                if (user3 != null) {
                    user3.setCurrentCourseName(Constants.COURSE_OCD);
                }
                User user4 = firebasePersistence2.getUser();
                if (user4 != null) {
                    user4.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_OCD));
                }
                firebasePersistence2.updateUserOnFirebase();
                this$0.startActivity(new Intent(this$0, CustomDashboardActivity.class));
                this$0.finish();
                String str2 = gk.a.f16573a;
                Bundle a11 = r1.b0.a("course", Constants.COURSE_OCD);
                a11.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a11.putBoolean("reset_flow", false);
                a11.putString("source", "top_nav");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(a11, "pre_domain_selection_existing");
                return;
            case 2:
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                User user5 = firebasePersistence3.getUser();
                if (user5 != null) {
                    user5.setCurrentCourseName(Constants.COURSE_GENERIC);
                }
                User user6 = firebasePersistence3.getUser();
                if (user6 != null) {
                    user6.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_GENERIC));
                }
                firebasePersistence3.updateUserOnFirebase();
                this$0.startActivity(new Intent(this$0, CustomDashboardActivity.class));
                this$0.finish();
                String str3 = gk.a.f16573a;
                Bundle a12 = r1.b0.a("course", Constants.COURSE_GENERIC);
                a12.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a12.putBoolean("reset_flow", false);
                a12.putString("source", "top_nav");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(a12, "pre_domain_selection_existing");
                return;
            case 3:
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    this$0.finish();
                    this$0.startActivity(tr.r.r(this$0).putExtra("source", "top_nav"));
                    return;
                }
                return;
            case 4:
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(6);
                    return;
                }
                return;
            case 5:
                int i15 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar2 != null) {
                    appCompatSeekBar2.setProgress(7);
                    return;
                }
                return;
            case 6:
                int i16 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar3 != null) {
                    appCompatSeekBar3.setProgress(8);
                    return;
                }
                return;
            case 7:
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar4 != null) {
                    appCompatSeekBar4.setProgress(9);
                    return;
                }
                return;
            case 8:
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar5 != null) {
                    appCompatSeekBar5.setProgress(10);
                    return;
                }
                return;
            case 9:
                int i19 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clNPSBottomSheet)).setState(4);
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                defpackage.e.s(bundle, "course", "type", "overall");
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle, "self_care_nps_cancel");
                return;
            case 10:
                int i20 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar6 != null) {
                    appCompatSeekBar6.setProgress(0);
                    return;
                }
                return;
            case 11:
                int i21 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar7 != null) {
                    appCompatSeekBar7.setProgress(1);
                    return;
                }
                return;
            case 12:
                int i22 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar8 != null) {
                    appCompatSeekBar8.setProgress(2);
                    return;
                }
                return;
            case 13:
                int i23 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar9 != null) {
                    appCompatSeekBar9.setProgress(3);
                    return;
                }
                return;
            case 14:
                int i24 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar10 != null) {
                    appCompatSeekBar10.setProgress(4);
                    return;
                }
                return;
            case 15:
                int i25 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar11 != null) {
                    appCompatSeekBar11.setProgress(5);
                    return;
                }
                return;
            case 16:
                int i26 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.c1(0);
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
                this$0.h1(null);
                return;
            case 17:
                int i27 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.c1(15);
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
                this$0.h1(null);
                return;
            case 18:
                int i28 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.c1(30);
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
                this$0.h1(null);
                return;
            case 19:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str5 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(bundle2, "dashboard_activity_view_all_click");
                    this$0.startActivity(new Intent(this$0, RecommendedActivitiesExperimentActivity.class));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10748v, "exception", e10);
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0, WebviewActivity.class).putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/org/dashboard").putExtra("requireAccessToken", true));
                String str6 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                bundle3.putString("org_id", SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID));
                bundle3.putString("org_name", SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_NAME));
                hs.k kVar6 = hs.k.f19476a;
                gk.a.b(bundle3, "app_entry_emp_lp_click");
                return;
        }
    }
}

package dl;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13012u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f13013v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13014w;

    public /* synthetic */ f(Dialog dialog, V2DashboardActivity v2DashboardActivity, int i6) {
        this.f13012u = i6;
        this.f13013v = dialog;
        this.f13014w = v2DashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f13012u;
        int i10 = 0;
        boolean z10 = true;
        V2DashboardActivity this$0 = this.f13014w;
        Dialog dialog = this.f13013v;
        switch (i6) {
            case 0:
                CourseDayModel courseDayModel = null;
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle, "welocme_main_cta");
                    dialog.dismiss();
                    if (!kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                        ArrayList<CourseDayModel> plan = this$0.I0().getPlan();
                        long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                        try {
                            int size = plan.size();
                            while (i10 < size) {
                                if (plan.get(i10).getPosition() != 1 && (plan.get(i10).getStart_date() == 0 || plan.get(i10).getStart_date() > todayTimeInSeconds)) {
                                    if (i10 > 0 && plan.get(i10).getStart_date() == 0) {
                                        int i12 = i10 - 1;
                                        if (plan.get(i12).getStart_date() != 0) {
                                            if (plan.get(i12).getStart_date() >= todayTimeInSeconds) {
                                            }
                                        }
                                    }
                                    i10++;
                                }
                                courseDayModel = plan.get(i10);
                                i10++;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e10);
                        }
                        kotlin.jvm.internal.i.d(courseDayModel);
                        this$0.o0(courseDayModel);
                        return;
                    } else if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        ArrayList<CourseDayModel> plan2 = this$0.I0().getPlan();
                        long todayTimeInSeconds2 = Utils.INSTANCE.getTodayTimeInSeconds();
                        try {
                            int size2 = plan2.size();
                            while (i10 < size2) {
                                if (plan2.get(i10).getPosition() != 1 && (plan2.get(i10).getStart_date() == 0 || plan2.get(i10).getStart_date() > todayTimeInSeconds2)) {
                                    if (i10 > 0 && plan2.get(i10).getStart_date() == 0) {
                                        int i13 = i10 - 1;
                                        if (plan2.get(i13).getStart_date() != 0) {
                                            if (plan2.get(i13).getStart_date() >= todayTimeInSeconds2) {
                                            }
                                        }
                                    }
                                    i10++;
                                }
                                courseDayModel = plan2.get(i10);
                                i10++;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e11);
                        }
                        kotlin.jvm.internal.i.d(courseDayModel);
                        this$0.o0(courseDayModel);
                        return;
                    } else if (this$0.f10660i0 != null && !this$0.M0().isEmpty()) {
                        Intent intent = new Intent(this$0, MiniCourseActivity.class);
                        String domain = this$0.M0().get(0).getDomain();
                        kotlin.jvm.internal.i.d(domain);
                        this$0.startActivityForResult(intent.putExtra("mccourse", domain), this$0.I);
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e12);
                    return;
                }
                LogHelper.INSTANCE.e(this$0.f10673v, "exception", e12);
                return;
            case 1:
                int i14 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle2, "welcome_secondary_cta");
                    dialog.dismiss();
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e13);
                    return;
                }
            case 2:
                int i15 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                Intent putExtra = new Intent(this$0, MiniCourseActivity.class).putExtra("newTut", true);
                String domain2 = this$0.M0().get(0).getDomain();
                kotlin.jvm.internal.i.d(domain2);
                this$0.startActivityForResult(putExtra.putExtra("mccourse", domain2), this$0.I);
                new Handler().postDelayed(new d(dialog, 1), 750L);
                return;
            case 3:
                int i16 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                View findViewById = dialog.findViewById(R.id.feedback);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                Editable text = ((RobertoEditText) findViewById).getText();
                kotlin.jvm.internal.i.d(text);
                String obj = text.toString();
                if (gv.n.F0(obj, " ", "").length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    if (Utils.INSTANCE.checkConnectivity(this$0)) {
                        try {
                            this$0.O0().show();
                            ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new r(this$0, obj, dialog, null), 3);
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e("dashboardactivity", "error in send", e14);
                        }
                        Bundle bundle3 = new Bundle();
                        if (FirebasePersistence.getInstance().getUser() != null) {
                            defpackage.d.m(bundle3, "course");
                        }
                        gk.a.b(bundle3, "af_negative_fb_send");
                        return;
                    }
                    return;
                }
                Extensions extensions = Extensions.INSTANCE;
                String string = this$0.getString(R.string.feedback_input_error);
                kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_input_error)");
                Extensions.toast$default(extensions, this$0, string, 0, 2, null);
                return;
            case 4:
                int i17 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                this$0.Z = true;
                CourseDayModel courseDayModel2 = this$0.X;
                if (courseDayModel2 != null) {
                    this$0.o0(courseDayModel2);
                    new Handler().postDelayed(new d(dialog, 0), 750L);
                    return;
                }
                kotlin.jvm.internal.i.q("onboardingTutorialActivityTitle");
                throw null;
            case 5:
                int i18 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                dialog.dismiss();
                this$0.w1();
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_cancel");
                return;
            case 6:
                int i19 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str2 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_positive");
                dialog.dismiss();
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils utils = Utils.INSTANCE;
                    String string2 = this$0.getString(R.string.topicalCourseEndNoteToast);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.topicalCourseEndNoteToast)");
                    utils.showCustomToast(this$0, string2);
                    return;
                }
                this$0.B1();
                return;
            case 7:
                int i20 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                this$0.startActivity(new Intent(this$0, AllTopicalCoursesActivity.class));
                dialog.dismiss();
                return;
            default:
                int i21 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                try {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                    intent2.addFlags(1208483840);
                    try {
                        this$0.startActivity(intent2);
                    } catch (Exception e15) {
                        LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e15);
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                    }
                    dialog.dismiss();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle4, "af_playstore_click");
                    return;
                } catch (Exception e16) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e16);
                    return;
                }
        }
    }

    public /* synthetic */ f(V2DashboardActivity v2DashboardActivity, Dialog dialog, int i6) {
        this.f13012u = i6;
        this.f13014w = v2DashboardActivity;
        this.f13013v = dialog;
    }
}

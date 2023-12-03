package dk;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12928u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f12929v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MiniCourseActivity f12930w;

    public /* synthetic */ i(Dialog dialog, MiniCourseActivity miniCourseActivity, int i6) {
        this.f12928u = i6;
        this.f12929v = dialog;
        this.f12930w = miniCourseActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MiniCourse miniCourse;
        int i6 = this.f12928u;
        Dialog dialog = this.f12929v;
        MiniCourseActivity this$0 = this.f12930w;
        switch (i6) {
            case 0:
                int i10 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent.addFlags(1208483840);
                try {
                    this$0.startActivity(intent);
                } catch (Exception unused) {
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                }
                dialog.dismiss();
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_basic_course_playstore_positive");
                return;
            case 1:
                int i11 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    dialog.dismiss();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle2, "feedback_basic_course_playstore_negative");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.I, "error in creating intent for play store rating", e10);
                    return;
                }
            default:
                int i12 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    dialog.dismiss();
                    ProgressDialog progressDialog = this$0.f10449z;
                    if (progressDialog != null) {
                        progressDialog.show();
                        Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                miniCourse = it.next();
                                String domain = miniCourse.getDomain();
                                String str = this$0.f10446w;
                                if (str != null) {
                                    if (kotlin.jvm.internal.i.b(domain, str)) {
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("miniCourseDomain");
                                    throw null;
                                }
                            } else {
                                miniCourse = null;
                            }
                        }
                        if (miniCourse != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<CourseDayModelV1> it2 = miniCourse.getPlan().iterator();
                            while (it2.hasNext()) {
                                CourseDayModelV1 next = it2.next();
                                next.setCompleted(false);
                                next.setFavorite(false);
                                next.setStart_date(0L);
                                if (next.getContent_id() != null) {
                                    String content_id = next.getContent_id();
                                    kotlin.jvm.internal.i.d(content_id);
                                    arrayList.add(content_id);
                                }
                            }
                            ArrayList<Goal> arrayList2 = new ArrayList<>();
                            Iterator<Goal> it3 = FirebasePersistence.getInstance().getUser().getUserGoals().iterator();
                            while (it3.hasNext()) {
                                Goal next2 = it3.next();
                                if (!is.u.Z1(arrayList, next2.getGoalId())) {
                                    arrayList2.add(next2);
                                }
                            }
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            User user = firebasePersistence.getUser();
                            if (user != null) {
                                user.setUserGoals(arrayList2);
                            }
                            firebasePersistence.updateUserOnFirebase();
                            NpsPersistence.INSTANCE.resetNpsDataForMiniCourse(miniCourse.getDomain());
                            ApplicationPersistence.getInstance().setBooleanValue("mc_welcome_" + miniCourse.getDomain(), false);
                            ApplicationPersistence.getInstance().deleteKey(miniCourse.getDomain() + "_mc_time");
                            ProgressDialog progressDialog2 = this$0.f10449z;
                            if (progressDialog2 != null) {
                                progressDialog2.dismiss();
                                Utils.INSTANCE.showCustomToast(this$0, "Your data for this course has been reset.");
                                this$0.finish();
                                return;
                            }
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.I, e11);
                    return;
                }
        }
    }

    public /* synthetic */ i(MiniCourseActivity miniCourseActivity, Dialog dialog) {
        this.f12928u = 0;
        this.f12930w = miniCourseActivity;
        this.f12929v = dialog;
    }
}

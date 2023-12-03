package zo;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.Calendar;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39680u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Calendar f39681v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f39682w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Goal f39683x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ rr.b f39684y;

    public /* synthetic */ a(Calendar calendar, FirestoreGoal firestoreGoal, rr.b bVar, Goal goal, int i6) {
        this.f39680u = i6;
        this.f39681v = calendar;
        this.f39682w = firestoreGoal;
        this.f39684y = bVar;
        this.f39683x = goal;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        int i11 = this.f39680u;
        Goal goal = this.f39683x;
        FirestoreGoal firestoreGoal = this.f39682w;
        rr.b bVar = this.f39684y;
        Calendar calendar = this.f39681v;
        switch (i11) {
            case 0:
                e this$0 = (e) bVar;
                int i12 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    if (firestoreGoal != null) {
                        firestoreGoal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        firestoreGoal.setVisible(true);
                        firestoreGoal.setNotificationScheduled(true);
                        this$0.S().f(firestoreGoal);
                        Utils utils = Utils.INSTANCE;
                        Context applicationContext = this$0.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                        long j10 = 1000;
                        String type = firestoreGoal.getType();
                        kotlin.jvm.internal.i.d(type);
                        String goalId = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        String courseName = firestoreGoal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName);
                        String goalName = firestoreGoal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName);
                        utils.updateActivityNotification(applicationContext, true, firestoreGoal.getStartDate().getTime() * j10, j10 * firestoreGoal.getScheduledDate().getTime(), type, goalId, courseName, goalName, this$0.Q().getReminderTitle(), this$0.Q().getReminderDescription());
                    } else if (goal != null) {
                        goal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        goal.setVisible(true);
                        goal.setNotificationScheduled(true);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                        Utils utils2 = Utils.INSTANCE;
                        Context applicationContext2 = this$0.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                        long time = goal.getmStartDate().getTime();
                        long time2 = goal.getmScheduleDate().getTime();
                        String type2 = goal.getType();
                        kotlin.jvm.internal.i.d(type2);
                        String goalId2 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId2);
                        String courseName2 = goal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName2);
                        String goalName2 = goal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName2);
                        utils2.updateActivityNotification(applicationContext2, true, time, time2, type2, goalId2, courseName2, goalName2, this$0.Q().getReminderTitle(), this$0.Q().getReminderDescription());
                    }
                    this$0.M();
                    if (this$0.E) {
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                    }
                    this$0.C = true;
                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                    RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = requireActivity instanceof RecommendedActivitiesPlaybackActivity ? (RecommendedActivitiesPlaybackActivity) requireActivity : null;
                    if (recommendedActivitiesPlaybackActivity != null) {
                        recommendedActivitiesPlaybackActivity.B = true;
                    }
                    String str = this$0.W.get("goal_added_toast");
                    if (str != null) {
                        Utils.INSTANCE.showCustomToast(this$0.requireActivity(), str);
                    }
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                        badges.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    if (this$0.requireArguments().getBoolean("proceed_on_schedule", false)) {
                        this$0.O();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f39693u, "exception", e10);
                    return;
                }
            case 1:
                i this$02 = (i) bVar;
                int i13 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    if (firestoreGoal != null) {
                        firestoreGoal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        firestoreGoal.setVisible(true);
                        firestoreGoal.setNotificationScheduled(true);
                        this$02.U().f(firestoreGoal);
                        Utils utils3 = Utils.INSTANCE;
                        Context applicationContext3 = this$02.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                        long j11 = 1000;
                        String type3 = firestoreGoal.getType();
                        kotlin.jvm.internal.i.d(type3);
                        String goalId3 = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId3);
                        String courseName3 = firestoreGoal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName3);
                        String goalName3 = firestoreGoal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName3);
                        utils3.updateActivityNotification(applicationContext3, true, firestoreGoal.getStartDate().getTime() * j11, firestoreGoal.getScheduledDate().getTime() * j11, type3, goalId3, courseName3, goalName3, this$02.S().getReminderTitle(), this$02.S().getReminderDescription());
                    } else if (goal != null) {
                        goal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        goal.setVisible(true);
                        goal.setNotificationScheduled(true);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                        Utils utils4 = Utils.INSTANCE;
                        Context applicationContext4 = this$02.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                        long j12 = 1000;
                        String type4 = goal.getType();
                        kotlin.jvm.internal.i.d(type4);
                        String goalId4 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId4);
                        String courseName4 = goal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName4);
                        String goalName4 = goal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName4);
                        utils4.updateActivityNotification(applicationContext4, true, goal.getStartDate().getTime() * j12, goal.getScheduledDate().getTime() * j12, type4, goalId4, courseName4, goalName4, this$02.S().getReminderTitle(), this$02.S().getReminderDescription());
                    }
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges2, "getInstance().user.userGamificationModel.badges");
                        badges2.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    this$02.O();
                    if (this$02.R) {
                        ((RobertoButton) this$02._$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                    }
                    this$02.X = true;
                    androidx.fragment.app.p requireActivity2 = this$02.requireActivity();
                    RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity2 = requireActivity2 instanceof RecommendedActivitiesPlaybackActivity ? (RecommendedActivitiesPlaybackActivity) requireActivity2 : null;
                    if (recommendedActivitiesPlaybackActivity2 != null) {
                        recommendedActivitiesPlaybackActivity2.B = true;
                    }
                    String str2 = this$02.Y.get("goal_added_toast");
                    if (str2 != null) {
                        Utils.INSTANCE.showCustomToast(this$02.requireActivity(), str2);
                    }
                    if (this$02.requireArguments().getBoolean("proceed_on_schedule", false)) {
                        this$02.P();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$02.f39723u, "exception", e11);
                    return;
                }
            case 2:
                p this$03 = (p) bVar;
                int i14 = p.R;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    if (firestoreGoal != null) {
                        firestoreGoal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        firestoreGoal.setVisible(true);
                        firestoreGoal.setNotificationScheduled(true);
                        this$03.Q().f(firestoreGoal);
                        Utils utils5 = Utils.INSTANCE;
                        Context applicationContext5 = this$03.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                        long j13 = 1000;
                        String type5 = firestoreGoal.getType();
                        kotlin.jvm.internal.i.d(type5);
                        String goalId5 = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId5);
                        String courseName5 = firestoreGoal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName5);
                        String goalName5 = firestoreGoal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName5);
                        utils5.updateActivityNotification(applicationContext5, true, firestoreGoal.getStartDate().getTime() * j13, j13 * firestoreGoal.getScheduledDate().getTime(), type5, goalId5, courseName5, goalName5, this$03.P().getReminderTitle(), this$03.P().getReminderDescription());
                    } else if (goal != null) {
                        goal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        goal.setVisible(true);
                        goal.setNotificationScheduled(true);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                        Utils utils6 = Utils.INSTANCE;
                        Context applicationContext6 = this$03.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                        long time3 = goal.getmStartDate().getTime();
                        long time4 = goal.getmScheduleDate().getTime();
                        String type6 = goal.getType();
                        kotlin.jvm.internal.i.d(type6);
                        String goalId6 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId6);
                        String courseName6 = goal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName6);
                        String goalName6 = goal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName6);
                        utils6.updateActivityNotification(applicationContext6, true, time3, time4, type6, goalId6, courseName6, goalName6, this$03.P().getReminderTitle(), this$03.P().getReminderDescription());
                    }
                    this$03.K();
                    this$03.f39761z = true;
                    androidx.fragment.app.p requireActivity3 = this$03.requireActivity();
                    RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity3 = requireActivity3 instanceof RecommendedActivitiesPlaybackActivity ? (RecommendedActivitiesPlaybackActivity) requireActivity3 : null;
                    if (recommendedActivitiesPlaybackActivity3 != null) {
                        recommendedActivitiesPlaybackActivity3.B = true;
                    }
                    if (!this$03.f39760y && this$03.A) {
                        this$03.M();
                    }
                    String str3 = this$03.F.get("goal_added_toast");
                    if (str3 != null) {
                        Utils.INSTANCE.showCustomToast(this$03.requireActivity(), str3);
                    }
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges3 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges3, "getInstance().user.userGamificationModel.badges");
                        badges3.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    if (this$03.requireArguments().getBoolean("proceed_on_schedule", false)) {
                        this$03.O();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$03.f39756u, "exception", e12);
                    return;
                }
            default:
                com.theinnerhour.b2b.fragment.coping.a this$04 = (com.theinnerhour.b2b.fragment.coping.a) bVar;
                int i15 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    ((RobertoButton) this$04._$_findCachedViewById(R.id.btnSubmitLogin)).setText("DONE");
                    if (!this$04.J) {
                        Utils utils7 = Utils.INSTANCE;
                        androidx.fragment.app.p requireActivity4 = this$04.requireActivity();
                        String string = this$04.getString(R.string.audioGoalAdded);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.audioGoalAdded)");
                        utils7.showCustomToast(requireActivity4, string);
                    }
                    if (goal != null) {
                        goal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        goal.setVisible(true);
                        goal.setNotificationScheduled(true);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                        Utils utils8 = Utils.INSTANCE;
                        Context applicationContext7 = this$04.requireActivity().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext7, "requireActivity().applicationContext");
                        long time5 = goal.getmStartDate().getTime();
                        long time6 = goal.getmScheduleDate().getTime();
                        String type7 = goal.getType();
                        kotlin.jvm.internal.i.d(type7);
                        String goalId7 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId7);
                        String courseName7 = goal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName7);
                        String goalName7 = goal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName7);
                        Utils.updateActivityNotification$default(utils8, applicationContext7, true, time5, time6, type7, goalId7, courseName7, goalName7, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    }
                    if (firestoreGoal != null) {
                        firestoreGoal.getScheduledDate().setTime(calendar.getTimeInMillis());
                        firestoreGoal.setVisible(true);
                        firestoreGoal.setNotificationScheduled(true);
                        this$04.e0 = true;
                        fm.a aVar = this$04.f11689f0;
                        if (aVar == null) {
                            kotlin.jvm.internal.i.q("firestoreGoalsViewModel");
                            throw null;
                        }
                        aVar.g(firestoreGoal, true);
                    }
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges4 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges4, "getInstance().user.userGamificationModel.badges");
                        badges4.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    if (this$04.requireArguments().getBoolean("proceed_on_schedule", false)) {
                        androidx.fragment.app.p activity = this$04.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity).t0();
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$04.f11694u, "exception", e13);
                    return;
                }
        }
    }

    public /* synthetic */ a(Calendar calendar, com.theinnerhour.b2b.fragment.coping.a aVar, Goal goal, FirestoreGoal firestoreGoal) {
        this.f39680u = 3;
        this.f39681v = calendar;
        this.f39684y = aVar;
        this.f39683x = goal;
        this.f39682w = firestoreGoal;
    }
}

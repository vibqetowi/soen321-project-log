package cm;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.Calendar;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5365u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Calendar f5366v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f5367w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Fragment f5368x;

    public /* synthetic */ o(Calendar calendar, Object obj, Fragment fragment, int i6) {
        this.f5365u = i6;
        this.f5366v = calendar;
        this.f5367w = obj;
        this.f5368x = fragment;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        ConstraintLayout constraintLayout;
        int i11 = this.f5365u;
        Fragment fragment = this.f5368x;
        Object obj = this.f5367w;
        Calendar calendar = this.f5366v;
        switch (i11) {
            case 0:
                FirestoreGoal goal = (FirestoreGoal) obj;
                p this$0 = (p) fragment;
                int i12 = p.G;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    goal.getScheduledDate().setTime(calendar.getTimeInMillis());
                    goal.setVisible(true);
                    goal.setNotificationScheduled(true);
                    Toast.makeText(this$0.getContext(), this$0.getString(R.string.goalAddedSuccessToast), 0).show();
                    fm.a aVar = this$0.f5373y;
                    if (aVar != null) {
                        aVar.g(goal, true);
                    }
                    yp.k kVar = this$0.f5370v;
                    if (kVar != null && (constraintLayout = kVar.f38842c) != null) {
                        Extensions.INSTANCE.gone(constraintLayout);
                    }
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                        badges.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f5369u, "exception", e10);
                    return;
                }
            default:
                Goal goal2 = (Goal) obj;
                c0 this$02 = (c0) fragment;
                int i13 = c0.J;
                kotlin.jvm.internal.i.g(goal2, "$goal");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                try {
                    calendar.set(11, i6);
                    calendar.set(12, i10);
                    goal2.getScheduledDate().setTime(calendar.getTimeInMillis());
                    goal2.setVisible(true);
                    goal2.setNotificationScheduled(true);
                    Toast.makeText(this$02.getContext(), "Activity Scheduled", 0).show();
                    FirebasePersistence.getInstance().updateGoal(goal2, Boolean.FALSE);
                    Utils utils = Utils.INSTANCE;
                    Context applicationContext = this$02.requireContext().getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                    long time = goal2.getmStartDate().getTime();
                    long time2 = goal2.getmScheduleDate().getTime();
                    String type = goal2.getType();
                    kotlin.jvm.internal.i.d(type);
                    String goalId = goal2.getGoalId();
                    kotlin.jvm.internal.i.d(goalId);
                    String courseName = goal2.getCourseName();
                    kotlin.jvm.internal.i.d(courseName);
                    String goalName = goal2.getGoalName();
                    kotlin.jvm.internal.i.d(goalName);
                    Utils.updateActivityNotification$default(utils, applicationContext, true, time, time2, type, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges2, "getInstance().user.userGamificationModel.badges");
                        badges2.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    ((ConstraintLayout) this$02._$_findCachedViewById(R.id.clRegularGoalRAExperiment)).setVisibility(8);
                    this$02.U();
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$02.f5316u, "exception", e11);
                    return;
                }
        }
    }
}

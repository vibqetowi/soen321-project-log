package bm;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4462u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Goal f4463v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f4464w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.e f4465x;

    public /* synthetic */ h(Goal goal, RecyclerView.e eVar, int i6, int i10) {
        this.f4462u = i10;
        this.f4463v = goal;
        this.f4465x = eVar;
        this.f4464w = i6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        String str;
        String str2;
        String str3;
        int i10 = this.f4462u;
        int i11 = this.f4464w;
        Goal goal = this.f4463v;
        RecyclerView.e eVar = this.f4465x;
        switch (i10) {
            case 0:
                i this$0 = (i) eVar;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence.getInstance().removeGoalById(goal.getGoalId(), goal.getCourseId());
                if (kotlin.jvm.internal.i.b(goal.getType(), "physical_activity") || kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    Utils utils = Utils.INSTANCE;
                    Activity activity = this$0.f4466x;
                    long time = goal.getmStartDate().getTime();
                    long time2 = goal.getmScheduleDate().getTime();
                    String type = goal.getType();
                    kotlin.jvm.internal.i.d(type);
                    String goalId = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId);
                    String courseName = goal.getCourseName();
                    kotlin.jvm.internal.i.d(courseName);
                    String goalName = goal.getGoalName();
                    kotlin.jvm.internal.i.d(goalName);
                    Utils.updateActivityNotification$default(utils, activity, false, time, time2, type, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                }
                ArrayList<Object> arrayList = this$0.f4468z;
                if (arrayList.size() > i11) {
                    arrayList.remove(i11);
                }
                this$0.l(i11);
                this$0.k(i11, arrayList.size());
                this$0.A.b();
                return;
            case 1:
                m this$02 = (m) eVar;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                FirebasePersistence.getInstance().removeGoalById(goal.getGoalId(), goal.getCourseId());
                Utils utils2 = Utils.INSTANCE;
                MyApplication a10 = MyApplication.V.a();
                long time3 = 1000 * goal.getScheduledDate().getTime();
                String type2 = goal.getType();
                if (type2 == null) {
                    str = "";
                } else {
                    str = type2;
                }
                String goalId2 = goal.getGoalId();
                if (goalId2 == null) {
                    str2 = "";
                } else {
                    str2 = goalId2;
                }
                String goalName2 = goal.getGoalName();
                if (goalName2 == null) {
                    str3 = "";
                } else {
                    str3 = goalName2;
                }
                Activity activity2 = this$02.f4489x;
                String string = activity2.getString(R.string.customGoalNotifiationHeader);
                kotlin.jvm.internal.i.f(string, "activity.getString(R.str…tomGoalNotifiationHeader)");
                boolean z10 = true;
                String goalName3 = goal.getGoalName();
                kotlin.jvm.internal.i.d(goalName3);
                String string2 = activity2.getString(R.string.customGoalNotifiationBody, goalName3);
                kotlin.jvm.internal.i.f(string2, "activity.getString(R.str…ionBody, goal.goalName!!)");
                utils2.updateV3ActivityNotification(a10, false, time3, str, str2, str3, "independent", string, string2);
                if (this$02.C.size() > i11) {
                    this$02.C.remove(i11);
                }
                this$02.l(i11);
                this$02.k(i11, this$02.C.size());
                this$02.E.V();
                Bundle bundle = new Bundle();
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !this$02.D) {
                    z10 = false;
                }
                bundle.putBoolean("subscription_status", z10);
                gk.a.b(bundle, "custom_goal_removed");
                return;
            case 2:
                o this$03 = (o) eVar;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                FirebasePersistence.getInstance().removeGoalById(goal.getGoalId(), goal.getCourseId());
                if (!kotlin.jvm.internal.i.b(goal.getType(), "physical_activity") && !kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    if (kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) || kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY) || kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                        String goalId3 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId3);
                        FireStoreUtilsKt.fetchCourseContentV3("en", goalId3, new q(goal));
                    }
                } else {
                    Utils utils3 = Utils.INSTANCE;
                    Activity activity3 = this$03.f4509x;
                    long time4 = goal.getmStartDate().getTime();
                    long time5 = goal.getmScheduleDate().getTime();
                    String type3 = goal.getType();
                    kotlin.jvm.internal.i.d(type3);
                    String goalId4 = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId4);
                    String courseName2 = goal.getCourseName();
                    kotlin.jvm.internal.i.d(courseName2);
                    String goalName4 = goal.getGoalName();
                    kotlin.jvm.internal.i.d(goalName4);
                    Utils.updateActivityNotification$default(utils3, activity3, false, time4, time5, type3, goalId4, courseName2, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                }
                ArrayList<hs.f<?, ?>> arrayList2 = this$03.C;
                if (arrayList2.size() > i11) {
                    arrayList2.remove(i11);
                }
                this$03.l(i11);
                this$03.k(i11, arrayList2.size());
                this$03.D.b();
                return;
            default:
                up.c this$04 = (up.c) eVar;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("topicalCourse", goal.getSource());
                analyticsBundle.putString(Constants.GOAL_ID, goal.getGoalId());
                analyticsBundle.putString(Constants.GOAL_NAME, goal.getGoalName());
                analyticsBundle.putString(Constants.GOAL_TYPE, goal.getType());
                analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                UtilsKt.fireAnalytics("topical_goal_delete", analyticsBundle);
                FirebasePersistence.getInstance().removeTopicalGoalById(goal.getGoalId());
                ArrayList<Goal> arrayList3 = this$04.B;
                if (arrayList3.size() > i11) {
                    arrayList3.remove(i11);
                }
                this$04.l(i11);
                this$04.k(i11, arrayList3.size());
                this$04.C.b();
                return;
        }
    }
}

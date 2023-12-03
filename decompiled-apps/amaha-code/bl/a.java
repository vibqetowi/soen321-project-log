package bl;

import android.content.Intent;
import android.view.View;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.activity.DailyPlanOverview;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4338u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f4339v;

    public /* synthetic */ a(i iVar, int i6) {
        this.f4338u = i6;
        this.f4339v = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4338u;
        i this$0 = this.f4339v;
        switch (i6) {
            case 0:
                int i10 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.Z().getPlan().get(this$0.f4365z).isCompleted()) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                    ((DailyPlanOverview) activity).w0();
                    return;
                }
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((DailyPlanOverview) activity2).finish();
                return;
            case 1:
                int i11 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent intent = new Intent(this$0.getActivity(), V2GoalsActivity.class);
                intent.putExtra("tutorial", this$0.R);
                intent.putExtra("source", "plan");
                this$0.startActivityForResult(intent, this$0.W);
                return;
            case 2:
                int i12 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Course courseById = FirebasePersistence.getInstance().getCourseById(this$0.b0());
                    kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
                    this$0.f4363x = courseById;
                    if (this$0.Z().getPlan().get(this$0.f4365z).getStart_date() == 0) {
                        Iterator<CourseDayModel> it = this$0.Z().getPlan().iterator();
                        while (it.hasNext()) {
                            CourseDayModel next = it.next();
                            if (this$0.Z().getPlan().get(this$0.f4365z).getPosition() == next.getPosition()) {
                                next.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                            }
                        }
                    }
                    CourseDayModel courseDayModel = this$0.Z().getPlan().get(this$0.f4365z);
                    kotlin.jvm.internal.i.f(courseDayModel, "course.plan[dayModelposition]");
                    this$0.U = courseDayModel;
                    String str = this$0.A;
                    if (str != null) {
                        this$0.m0(this$0.getArguments(), str);
                        ArrayList<Integer> courseDailyTaskList = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseDailyTaskList();
                        CourseDayModel courseDayModel2 = this$0.Z().getPlan().get(this$0.f4365z);
                        kotlin.jvm.internal.i.d(courseDayModel2);
                        if (!courseDailyTaskList.contains(Integer.valueOf(courseDayModel2.getPosition()))) {
                            GamificationModel gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            ArrayList<Integer> courseDailyTaskList2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseDailyTaskList();
                            CourseDayModel courseDayModel3 = this$0.Z().getPlan().get(this$0.f4365z);
                            kotlin.jvm.internal.i.d(courseDayModel3);
                            courseDailyTaskList2.add(Integer.valueOf(courseDayModel3.getPosition()));
                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(gamificationModel);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("intentLink");
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f4360u, e10);
                    return;
                }
            case 3:
                int i13 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(new Intent(this$0.getActivity(), LearningHubActivity.class).putExtra("learningHubList", this$0.f4361v).putExtra("showPage", true).putExtra("isOnboarding", this$0.S).putExtra("source", "plan"), this$0.X);
                return;
            case 4:
                int i14 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0.getActivity(), AddGoalsActivity.class));
                return;
            case 5:
                int i15 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k0(1);
                return;
            case 6:
                int i16 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k0(2);
                return;
            case 7:
                int i17 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k0(3);
                return;
            case 8:
                int i18 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k0(4);
                return;
            default:
                int i19 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k0(5);
                return;
        }
    }
}

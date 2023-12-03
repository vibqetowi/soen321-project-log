package bl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.activity.DailyPlanOverviewV3;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import fm.y0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4373u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f4374v;

    public /* synthetic */ l(p pVar, int i6) {
        this.f4373u = i6;
        this.f4374v = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0232  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Intent intent;
        String str;
        ArrayList<Goal> userGoals;
        boolean z10;
        boolean z11;
        int i6 = this.f4373u;
        boolean z12 = false;
        p this$0 = this.f4374v;
        switch (i6) {
            case 0:
                int i10 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.h0(1);
                return;
            case 1:
                int i11 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.h0(2);
                return;
            case 2:
                int i12 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.h0(3);
                return;
            case 3:
                int i13 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.h0(4);
                return;
            case 4:
                int i14 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.h0(5);
                return;
            case 5:
                int i15 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.a0().getPlanV3().get(this$0.f4395z).isCompleted()) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
                    ((DailyPlanOverviewV3) activity).w0();
                    return;
                }
                this$0.requireActivity().finish();
                return;
            case 6:
                int i16 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (sp.b.K()) {
                    wn.b.f36765a.getClass();
                    if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                        Extensions extensions = Extensions.INSTANCE;
                        Context requireContext = this$0.requireContext();
                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                        String string = this$0.requireContext().getString(R.string.goalMigrationProgress);
                        kotlin.jvm.internal.i.f(string, "requireContext().getStri…ng.goalMigrationProgress)");
                        extensions.toast(requireContext, string, 1);
                        return;
                    }
                }
                if (sp.b.K()) {
                    intent = new Intent(this$0.getActivity(), FirestoreGoalsActivity.class);
                } else {
                    intent = new Intent(this$0.getActivity(), V3GoalsActivity.class);
                }
                intent.putExtra("tutorial", this$0.Q);
                intent.putExtra("source", "plan");
                this$0.startActivityForResult(intent, this$0.V);
                return;
            case 7:
                int i17 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    this$0.Z();
                    if (this$0.a0().getPlanV3().get(this$0.f4395z).getStart_date() == 0) {
                        Iterator<CourseDayModelV1> it = this$0.a0().getPlanV3().iterator();
                        while (it.hasNext()) {
                            CourseDayModelV1 next = it.next();
                            if (this$0.a0().getPlanV3().get(this$0.f4395z).getPosition() == next.getPosition()) {
                                next.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                this$0.P();
                            }
                        }
                    }
                    Iterator<CourseDayModelV1> it2 = this$0.a0().getPlanV3().iterator();
                    while (it2.hasNext()) {
                        if (this$0.a0().getPlanV3().get(this$0.f4395z).getPosition() == it2.next().getPosition()) {
                            this$0.a0().getPlanV3().get(this$0.f4395z).setLast_accessed_date(Utils.INSTANCE.getTimeInSeconds());
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    }
                    String str2 = this$0.A;
                    if (str2 != null) {
                        this$0.j0(this$0.getArguments(), str2);
                        if (!ApplicationPersistence.getInstance().containsKey("show_daily_plan_bookmarking_tool_tip")) {
                            ApplicationPersistence.getInstance().setBooleanValue("show_daily_plan_bookmarking_tool_tip", true);
                        }
                        ArrayList<Integer> courseDailyTaskList = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseDailyTaskList();
                        CourseDayModelV1 courseDayModelV1 = this$0.a0().getPlanV3().get(this$0.f4395z);
                        kotlin.jvm.internal.i.d(courseDayModelV1);
                        if (!courseDailyTaskList.contains(Integer.valueOf(courseDayModelV1.getPosition()))) {
                            GamificationModel gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            ArrayList<Integer> courseDailyTaskList2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseDailyTaskList();
                            CourseDayModelV1 courseDayModelV12 = this$0.a0().getPlanV3().get(this$0.f4395z);
                            kotlin.jvm.internal.i.d(courseDayModelV12);
                            courseDailyTaskList2.add(Integer.valueOf(courseDayModelV12.getPosition()));
                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(gamificationModel);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("intentLink");
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f4390u, e10);
                    return;
                }
            case 8:
                int i18 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    firebasePersistence.getCourseById(this$0.a0().get_id()).getPlanV3().get(this$0.f4395z).setFavorite(true);
                    firebasePersistence.updateUserOnFirebase();
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    String string2 = this$0.getString(R.string.BookmarkingSavedActivity);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.BookmarkingSavedActivity)");
                    utils.showCustomToast(activity2, string2);
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivBookmarkUnsaved)).setVisibility(8);
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivBookmarkSaved)).setVisibility(0);
                    if (!ApplicationPersistence.getInstance().containsKey("show_bookmarking_tool_tip") && ApplicationPersistence.getInstance().getBooleanValue("is_accessing_first_activity", false) && this$0.T) {
                        ApplicationPersistence.getInstance().setBooleanValue("show_bookmarking_tool_tip", true);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("course", this$0.a0().getCourseName());
                    bundle.putString("activity_name", this$0.a0().getPlanV3().get(this$0.f4395z).getContent_label());
                    bundle.putInt(Constants.DAYMODEL_POSITION, this$0.a0().getPlanV3().get(this$0.f4395z).getPosition());
                    bundle.putBoolean("today_activity", this$0.e0);
                    if (this$0.a0().getPlanV3().get(this$0.f4395z).isCompleted()) {
                        str = "completed";
                    } else if (this$0.a0().getPlanV3().get(this$0.f4395z).getStart_date() != 0) {
                        str = "started";
                    } else {
                        str = "unaccessed";
                    }
                    bundle.putString("activity_status", str);
                    bundle.putBoolean("feedback_captured", this$0.a0().getPlanV3().get(this$0.f4395z).isFavorite());
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (userGoals = user.getUserGoals()) != null) {
                        if (!userGoals.isEmpty()) {
                            for (Goal goal : userGoals) {
                                if (kotlin.jvm.internal.i.b(goal.getGoalId(), this$0.a0().getPlanV3().get(this$0.f4395z).getContent_id()) && goal.isVisible()) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                                if (z10) {
                                    z11 = true;
                                    if (z11) {
                                        z12 = true;
                                    }
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                    bundle.putBoolean("goal_added", z12);
                    gk.a.b(bundle, "activity_bookmark_click");
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f4390u, e11);
                    return;
                }
            case 9:
                int i19 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                    firebasePersistence2.getCourseById(this$0.a0().get_id()).getPlanV3().get(this$0.f4395z).setFavorite(false);
                    firebasePersistence2.updateUserOnFirebase();
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p activity3 = this$0.getActivity();
                    String string3 = this$0.getString(R.string.BookmarkingUnsavedActivity);
                    kotlin.jvm.internal.i.f(string3, "getString(R.string.BookmarkingUnsavedActivity)");
                    utils2.showCustomToast(activity3, string3);
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivBookmarkUnsaved)).setVisibility(0);
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivBookmarkSaved)).setVisibility(8);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f4390u, e12);
                    return;
                }
            case 10:
                int i20 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z13 = this$0.f4385f0;
                int i21 = this$0.W;
                if (z13) {
                    this$0.startActivityForResult(new Intent(this$0.getActivity(), LearningHubExperimentActivity.class).putExtra("learningHubList", this$0.f4391v).putExtra("showPage", true).putExtra("isOnboarding", this$0.R).putExtra("source", "plan"), i21);
                    return;
                } else {
                    this$0.startActivityForResult(new Intent(this$0.getActivity(), LearningHubActivity.class).putExtra("learningHubList", this$0.f4391v).putExtra("showPage", true).putExtra("isOnboarding", this$0.R).putExtra("source", "plan"), i21);
                    return;
                }
            default:
                int i22 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0.getActivity(), AddGoalsActivity.class));
                return;
        }
    }
}

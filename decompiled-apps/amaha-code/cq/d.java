package cq;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f11897u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f11898v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GoalType f11899w;

    public /* synthetic */ d(g gVar, GoalType goalType, int i6) {
        this.f11897u = i6;
        this.f11898v = gVar;
        this.f11899w = goalType;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f11897u;
        AddGoalsActivity addGoalsActivity = null;
        GoalType goal = this.f11899w;
        g this$0 = this.f11898v;
        switch (i6) {
            case 0:
                int i10 = g.E;
                i.g(this$0, "this$0");
                i.g(goal, "$goal");
                try {
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        p activity = this$0.getActivity();
                        if (activity instanceof AddGoalsActivity) {
                            addGoalsActivity = (AddGoalsActivity) activity;
                        }
                        if (addGoalsActivity != null) {
                            addGoalsActivity.f10304z = true;
                        }
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, true);
                    }
                    String goalId = goal.getGoalId();
                    i.f(goalId, "goal.goalId");
                    this$0.J(goalId);
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                    bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
                    bundle.putString("type", goal.getType());
                    gk.a.b(bundle, "goals_list_item_click");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11909u, "exception", e10);
                    return;
                }
            default:
                int i11 = g.E;
                i.g(this$0, "this$0");
                try {
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        p activity2 = this$0.getActivity();
                        if (activity2 instanceof AddGoalsActivity) {
                            addGoalsActivity = (AddGoalsActivity) activity2;
                        }
                        if (addGoalsActivity != null) {
                            addGoalsActivity.f10304z = true;
                        }
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, true);
                    }
                    String goalId2 = goal.getGoalId();
                    i.f(goalId2, "type.goalId");
                    this$0.J(goalId2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                    bundle2.putString(Constants.GOAL_NAME, goal.getGoalName());
                    bundle2.putString("type", goal.getType());
                    gk.a.b(bundle2, "goals_list_item_click");
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f11909u, "exception", e11);
                    return;
                }
        }
    }
}

package cm;

import android.content.Intent;
import android.view.View;
import cm.c0;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5307u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f5308v;

    public /* synthetic */ a0(c0 c0Var, int i6) {
        this.f5307u = i6;
        this.f5308v = c0Var;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        int i6 = this.f5307u;
        c0 this$0 = this.f5308v;
        String str3 = null;
        switch (i6) {
            case 0:
                int i10 = c0.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    V3GoalsActivity v3GoalsActivity = this$0.f5318w;
                    if (v3GoalsActivity != null) {
                        V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                        if (v3GoalsActivity2 != null) {
                            v3GoalsActivity.C0(new Intent(v3GoalsActivity2, AddGoalsActivity.class), false);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f5316u, e10);
                    return;
                }
            default:
                int i11 = c0.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yn.a aVar = this$0.G;
                try {
                    RecommendedActivityModel recommendedActivityModel = this$0.B;
                    if (recommendedActivityModel != null) {
                        str = recommendedActivityModel.getGoalId();
                    } else {
                        str = null;
                    }
                    RecommendedActivityModel recommendedActivityModel2 = this$0.B;
                    String courseId = UtilsKt.getCourseId((recommendedActivityModel2 == null || (r1 = recommendedActivityModel2.getDomain()) == null) ? "" : "");
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    ?? goalById = FirebasePersistence.getInstance().getGoalById(str, courseId);
                    xVar.f23469u = goalById;
                    if (goalById == 0 || !goalById.isVisible()) {
                        if (xVar.f23469u == 0) {
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            RecommendedActivityModel recommendedActivityModel3 = this$0.B;
                            if (recommendedActivityModel3 != null) {
                                str2 = recommendedActivityModel3.getDomain();
                            } else {
                                str2 = null;
                            }
                            RecommendedActivityModel recommendedActivityModel4 = this$0.B;
                            String str4 = (recommendedActivityModel4 == null || (str4 = recommendedActivityModel4.getGoalType()) == null) ? "" : "";
                            RecommendedActivityModel recommendedActivityModel5 = this$0.B;
                            if (recommendedActivityModel5 != null) {
                                str3 = recommendedActivityModel5.getTitle();
                            }
                            firebasePersistence.addNewGoalToFirebase(str, courseId, str2, str4, str3, false);
                            xVar.f23469u = FirebasePersistence.getInstance().getGoalById(str, courseId);
                        }
                        aVar.getClass();
                        if (yn.a.b()) {
                            T goal = xVar.f23469u;
                            kotlin.jvm.internal.i.f(goal, "goal");
                            this$0.O((Goal) goal);
                            return;
                        }
                        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("goals_add_scroller", aVar.a(true), "goals", this$0.G, new c0.d(xVar, xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f5316u, e11);
                    return;
                }
        }
    }
}

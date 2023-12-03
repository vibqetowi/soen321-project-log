package zo;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.HashMap;
import kotlin.jvm.internal.x;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39754u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f39755v;

    public /* synthetic */ o(p pVar, int i6) {
        this.f39754u = i6;
        this.f39755v = pVar;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f39754u;
        boolean z10 = true;
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = null;
        p this$0 = this.f39755v;
        switch (i6) {
            case 0:
                int i10 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof RecommendedActivitiesPlaybackActivity) {
                    recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity;
                }
                if (recommendedActivitiesPlaybackActivity != null) {
                    recommendedActivitiesPlaybackActivity.v0(this$0.P().getGoalId());
                    return;
                }
                return;
            case 1:
                int i11 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("activity_id", this$0.P().getGoalId());
                bundle.putString("activity_name", this$0.P().getTitle());
                String lowerCase = this$0.P().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                bundle.putString("type", lowerCase);
                bundle.putString("source", this$0.O().f11610y);
                if (this$0.G) {
                    bundle.putString("bottom_sheet", "expanded");
                } else {
                    bundle.putString("bottom_sheet", "contracted");
                }
                gk.a.b(bundle, "activity_learn_more_click");
                RecommendedActivityModel P = this$0.P();
                n nVar = new n();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("model", P);
                nVar.setArguments(bundle2);
                nVar.show(this$0.requireActivity().getSupportFragmentManager(), "TAG");
                return;
            case 2:
                int i12 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle3 = new Bundle();
                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle3.putString("activity_id", this$0.P().getGoalId());
                bundle3.putString("activity_name", this$0.P().getTitle());
                String lowerCase2 = this$0.P().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                bundle3.putString("type", lowerCase2);
                bundle3.putString("source", this$0.O().f11610y);
                bundle3.putBoolean("goal_added", this$0.f39761z);
                bundle3.putString("played_progress", this$0.E);
                gk.a.b(bundle3, "activity_screen_exit");
                this$0.requireActivity().onBackPressed();
                return;
            case 3:
                int i13 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.X(false);
                return;
            case 4:
                int i14 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle4 = new Bundle();
                bundle4.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle4.putString("activity_id", this$0.P().getGoalId());
                bundle4.putString("activity_name", this$0.P().getTitle());
                String lowerCase3 = this$0.P().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                bundle4.putString("type", lowerCase3);
                bundle4.putString("source", this$0.O().f11610y);
                bundle4.putBoolean("goal_added", this$0.f39761z);
                gk.a.b(bundle4, "activity_stop_click");
                try {
                    b.a aVar = new b.a(this$0.requireActivity());
                    HashMap<String, String> hashMap = this$0.F;
                    aVar.f1046a.f1031g = hashMap.get("stop_dialog_text");
                    aVar.b(hashMap.get("stop_dialog_positive_cta"), new g6.g(11, this$0));
                    aVar.a(hashMap.get("stop_dialog_negative_cta"), new yi.d(15));
                    aVar.create().show();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f39756u, e10);
                    return;
                }
            case 5:
                int i15 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).getProgress() != 0.0f) {
                    z10 = false;
                }
                if (z10) {
                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).A();
                    return;
                } else {
                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                    return;
                }
            default:
                int i16 = p.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.O) {
                    if (this$0.Q().C != null) {
                        FirestoreGoal firestoreGoal = this$0.Q().C;
                        if (!((firestoreGoal == null || firestoreGoal.isVisible()) ? false : false)) {
                            return;
                        }
                    }
                    if (this$0.Q().C == null) {
                        ap.a Q = this$0.Q();
                        String courseId = UtilsKt.getCourseId(this$0.P().getDomain());
                        String goalId = this$0.P().getGoalId();
                        String domain = this$0.P().getDomain();
                        String title = this$0.P().getTitle();
                        String str2 = this$0.O().f11610y;
                        CustomDate customDate = new CustomDate();
                        Utils utils = Utils.INSTANCE;
                        customDate.setTime(utils.getTodayTimeInSeconds());
                        hs.k kVar = hs.k.f19476a;
                        CustomDate customDate2 = new CustomDate();
                        customDate2.setTime(utils.getTodayTimeInSeconds());
                        Q.e(new FirestoreGoal(courseId, goalId, domain, title, str2, customDate, null, customDate2, null, false, null, this$0.P().getGoalType(), false, null, 9536, null));
                        return;
                    }
                    FirestoreGoal firestoreGoal2 = this$0.Q().C;
                    kotlin.jvm.internal.i.d(firestoreGoal2);
                    this$0.U(firestoreGoal2);
                    return;
                }
                x xVar = new x();
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                String goalId2 = this$0.P().getGoalId();
                String domain2 = this$0.P().getDomain();
                String str3 = "";
                if (domain2 == null) {
                    domain2 = "";
                }
                ?? goalById = firebasePersistence.getGoalById(goalId2, UtilsKt.getCourseId(domain2));
                xVar.f23469u = goalById;
                if (goalById == 0 || !goalById.isVisible()) {
                    if (xVar.f23469u == 0) {
                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                        String goalId3 = this$0.P().getGoalId();
                        String domain3 = this$0.P().getDomain();
                        if (domain3 == null) {
                            domain3 = "";
                        }
                        String courseId2 = UtilsKt.getCourseId(domain3);
                        String domain4 = this$0.P().getDomain();
                        String goalType = this$0.P().getGoalType();
                        if (goalType == null) {
                            str = "";
                        } else {
                            str = goalType;
                        }
                        firebasePersistence2.addNewGoalToFirebase(goalId3, courseId2, domain4, str, this$0.P().getTitle(), false);
                        FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                        String goalId4 = this$0.P().getGoalId();
                        String domain5 = this$0.P().getDomain();
                        if (domain5 != null) {
                            str3 = domain5;
                        }
                        xVar.f23469u = firebasePersistence3.getGoalById(goalId4, UtilsKt.getCourseId(str3));
                    }
                    yn.a aVar2 = this$0.M;
                    aVar2.getClass();
                    if (yn.a.b()) {
                        T t3 = xVar.f23469u;
                        kotlin.jvm.internal.i.d(t3);
                        this$0.Z(null, (Goal) t3);
                    } else {
                        x xVar2 = new x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_physical", aVar2.a(true), "goals", this$0.M, new r(this$0, xVar, xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle5.putString("activity_id", this$0.P().getGoalId());
                    bundle5.putString("activity_name", this$0.P().getTitle());
                    String lowerCase4 = this$0.P().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                    bundle5.putString("type", lowerCase4);
                    bundle5.putString("source", this$0.O().f11610y);
                    bundle5.putString("played_progress", this$0.E);
                    gk.a.b(bundle5, "activity_add_goal_click");
                    return;
                }
                return;
        }
    }
}

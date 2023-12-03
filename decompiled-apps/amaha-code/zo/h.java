package zo;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import kotlin.jvm.internal.x;
import zo.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39713u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f39714v;

    public /* synthetic */ h(i iVar, int i6) {
        this.f39713u = i6;
        this.f39714v = iVar;
    }

    /* JADX WARN: Type inference failed for: r2v66, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r2v94, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        int i6 = this.f39713u;
        boolean z10 = true;
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = null;
        i this$0 = this.f39714v;
        switch (i6) {
            case 0:
                int i10 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.I) {
                    i.g gVar = new i.g();
                    AudioHelper audioHelper = this$0.G;
                    if (audioHelper != null) {
                        audioHelper.downloadAudioFile(this$0.Q(), gVar);
                        Bundle bundle = new Bundle();
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putString("activity_id", this$0.S().getGoalId());
                        bundle.putString("activity_name", this$0.S().getTitle());
                        String lowerCase = this$0.S().getTemplateType().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                        bundle.putString("type", lowerCase);
                        bundle.putString("source", this$0.P().f11610y);
                        bundle.putBoolean("goal_added", this$0.X);
                        gk.a.b(bundle, "activity_audio_download_start");
                        return;
                    }
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                } else if (!ConnectionStatusReceiver.isConnected() && (str = this$0.Y.get("download_failed_toast")) != null) {
                    Utils.INSTANCE.showCustomToast(this$0.requireActivity(), str);
                    return;
                } else {
                    return;
                }
            case 1:
                int i11 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("activity_id", this$0.S().getGoalId());
                bundle2.putString("activity_name", this$0.S().getTitle());
                String lowerCase2 = this$0.S().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                bundle2.putString("type", lowerCase2);
                bundle2.putString("source", this$0.P().f11610y);
                bundle2.putBoolean("goal_added", this$0.X);
                bundle2.putString("played_progress", this$0.W);
                gk.a.b(bundle2, "activity_screen_exit");
                this$0.requireActivity().onBackPressed();
                return;
            case 2:
                int i12 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle3 = new Bundle();
                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle3.putString("activity_id", this$0.S().getGoalId());
                bundle3.putString("activity_name", this$0.S().getTitle());
                String lowerCase3 = this$0.S().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                bundle3.putString("type", lowerCase3);
                bundle3.putString("source", this$0.P().f11610y);
                if (this$0.D) {
                    bundle3.putString("bottom_sheet", "expanded");
                } else {
                    bundle3.putString("bottom_sheet", "contracted");
                }
                gk.a.b(bundle3, "activity_learn_more_click");
                RecommendedActivityModel S = this$0.S();
                n nVar = new n();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("model", S);
                nVar.setArguments(bundle4);
                nVar.show(this$0.requireActivity().getSupportFragmentManager(), "TAG");
                return;
            case 3:
                int i13 = i.f39715j0;
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
            case 4:
                int i14 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.O && this$0.c0()) {
                    this$0.O = false;
                    this$0.a0(true);
                    return;
                } else if (!this$0.B && !ConnectionStatusReceiver.isConnected()) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        this$0.j0(true);
                        return;
                    }
                    return;
                } else if (this$0.H) {
                    this$0.N = 0;
                    this$0.K = 0L;
                    this$0.M = 0L;
                    this$0.L = 0.0f;
                    this$0.j0(false);
                    this$0.J = true;
                    this$0.X(false);
                    return;
                } else {
                    if (this$0.f39724v == null) {
                        this$0.Y(this$0.E);
                    }
                    this$0.a0(true);
                    return;
                }
            case 5:
                int i15 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f39721h0) {
                    if (this$0.U().C != null) {
                        FirestoreGoal firestoreGoal = this$0.U().C;
                        if (!((firestoreGoal == null || firestoreGoal.isVisible()) ? false : false)) {
                            return;
                        }
                    }
                    if (this$0.U().C == null) {
                        ap.a U = this$0.U();
                        String courseId = UtilsKt.getCourseId(this$0.S().getDomain());
                        String goalId = this$0.S().getGoalId();
                        String domain = this$0.S().getDomain();
                        String title = this$0.S().getTitle();
                        String str3 = this$0.P().f11610y;
                        CustomDate customDate = new CustomDate();
                        Utils utils = Utils.INSTANCE;
                        customDate.setTime(utils.getTodayTimeInSeconds());
                        hs.k kVar = hs.k.f19476a;
                        CustomDate customDate2 = new CustomDate();
                        customDate2.setTime(utils.getTodayTimeInSeconds());
                        U.e(new FirestoreGoal(courseId, goalId, domain, title, str3, customDate, null, customDate2, null, false, null, this$0.S().getGoalType(), false, null, 9536, null));
                        return;
                    }
                    FirestoreGoal firestoreGoal2 = this$0.U().C;
                    kotlin.jvm.internal.i.d(firestoreGoal2);
                    this$0.Z(firestoreGoal2);
                    return;
                }
                x xVar = new x();
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                String goalId2 = this$0.S().getGoalId();
                String domain2 = this$0.S().getDomain();
                String str4 = "";
                if (domain2 == null) {
                    domain2 = "";
                }
                ?? goalById = firebasePersistence.getGoalById(goalId2, UtilsKt.getCourseId(domain2));
                xVar.f23469u = goalById;
                if (goalById == 0 || !goalById.isVisible()) {
                    if (xVar.f23469u == 0) {
                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                        String goalId3 = this$0.S().getGoalId();
                        String domain3 = this$0.S().getDomain();
                        if (domain3 == null) {
                            domain3 = "";
                        }
                        String courseId2 = UtilsKt.getCourseId(domain3);
                        String domain4 = this$0.S().getDomain();
                        String goalType = this$0.S().getGoalType();
                        if (goalType == null) {
                            str2 = "";
                        } else {
                            str2 = goalType;
                        }
                        firebasePersistence2.addNewGoalToFirebase(goalId3, courseId2, domain4, str2, this$0.S().getTitle(), false);
                        FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                        String goalId4 = this$0.S().getGoalId();
                        String domain5 = this$0.S().getDomain();
                        if (domain5 != null) {
                            str4 = domain5;
                        }
                        xVar.f23469u = firebasePersistence3.getGoalById(goalId4, UtilsKt.getCourseId(str4));
                    }
                    yn.a aVar = this$0.f39719f0;
                    aVar.getClass();
                    if (yn.a.b()) {
                        T t3 = xVar.f23469u;
                        kotlin.jvm.internal.i.d(t3);
                        this$0.h0(null, (Goal) t3);
                    } else {
                        x xVar2 = new x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_gif", aVar.a(true), "goals", this$0.f39719f0, new l(this$0, xVar, xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle5.putString("activity_id", this$0.S().getGoalId());
                    bundle5.putString("activity_name", this$0.S().getTitle());
                    String lowerCase4 = this$0.S().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                    bundle5.putString("type", lowerCase4);
                    bundle5.putString("source", this$0.P().f11610y);
                    bundle5.putString("played_progress", this$0.W);
                    gk.a.b(bundle5, "activity_add_goal_click");
                    return;
                }
                return;
            case 6:
                int i16 = i.f39715j0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof RecommendedActivitiesPlaybackActivity) {
                    recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity;
                }
                if (recommendedActivitiesPlaybackActivity != null) {
                    recommendedActivitiesPlaybackActivity.v0(this$0.S().getGoalId());
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.requireActivity().onBackPressed();
                Bundle bundle6 = new Bundle();
                bundle6.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle6.putString("activity_id", this$0.S().getGoalId());
                bundle6.putString("activity_name", this$0.S().getTitle());
                String lowerCase5 = this$0.S().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
                bundle6.putString("type", lowerCase5);
                bundle6.putString("source", this$0.P().f11610y);
                bundle6.putBoolean("goal_added", this$0.X);
                bundle6.putString("played_progress", this$0.W);
                gk.a.b(bundle6, "activity_done_click");
                return;
        }
    }
}

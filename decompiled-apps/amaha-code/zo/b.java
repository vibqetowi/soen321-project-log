package zo;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.exoplayer2.a0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.Locale;
import kotlin.jvm.internal.x;
import zo.e;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39685u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f39686v;

    public /* synthetic */ b(e eVar, int i6) {
        this.f39685u = i6;
        this.f39686v = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v70, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r2v98, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var;
        String str;
        String str2;
        int i6 = this.f39685u;
        boolean z10 = false;
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = null;
        e this$0 = this.f39686v;
        switch (i6) {
            case 0:
                int i10 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("activity_id", this$0.Q().getGoalId());
                bundle.putString("activity_name", this$0.Q().getTitle());
                String lowerCase = this$0.Q().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                bundle.putString("type", lowerCase);
                bundle.putString("source", this$0.O().f11610y);
                bundle.putBoolean("goal_added", this$0.C);
                bundle.putString("played_progress", this$0.U);
                gk.a.b(bundle, "activity_screen_exit");
                this$0.requireActivity().onBackPressed();
                return;
            case 1:
                int i11 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("activity_id", this$0.Q().getGoalId());
                bundle2.putString("activity_name", this$0.Q().getTitle());
                String lowerCase2 = this$0.Q().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                bundle2.putString("type", lowerCase2);
                bundle2.putString("source", this$0.O().f11610y);
                if (this$0.X) {
                    bundle2.putString("bottom_sheet", "expanded");
                } else {
                    bundle2.putString("bottom_sheet", "contracted");
                }
                gk.a.b(bundle2, "activity_learn_more_click");
                RecommendedActivityModel Q = this$0.Q();
                n nVar = new n();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("model", Q);
                nVar.setArguments(bundle3);
                nVar.show(this$0.requireActivity().getSupportFragmentManager(), "TAG");
                return;
            case 2:
                int i12 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.N && (((a0Var = this$0.R) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || this$0.L))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        this$0.j0(true);
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        this$0.j0(false);
                        this$0.U(false);
                    }
                } else {
                    if (this$0.E && !this$0.B) {
                        this$0.U(false);
                        boolean z11 = this$0.D;
                        if (z11 && this$0.E) {
                            this$0.E = false;
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnRASolid)).setVisibility(8);
                        } else if (!z11 && this$0.E && this$0.C) {
                            this$0.E = false;
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnRASolid)).setVisibility(8);
                        }
                    }
                    this$0.Z(true);
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle4.putString("activity_id", this$0.Q().getGoalId());
                bundle4.putString("activity_name", this$0.Q().getTitle());
                String lowerCase3 = this$0.Q().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                bundle4.putString("type", lowerCase3);
                bundle4.putString("source", this$0.O().f11610y);
                bundle4.putBoolean("goal_added", this$0.C);
                if (this$0.B) {
                    if (this$0.F) {
                        gk.a.b(bundle4, "activity_redo_click");
                        return;
                    }
                    bundle4.putString("action_source", "screen");
                    gk.a.b(bundle4, "activity_play_click");
                    return;
                }
                bundle4.putString("action_source", "screen");
                bundle4.putString("played_progress", this$0.U);
                gk.a.b(bundle4, "activity_pause_click");
                return;
            case 3:
                int i13 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f39690a0) {
                    if (this$0.S().C != null) {
                        FirestoreGoal firestoreGoal = this$0.S().C;
                        if (firestoreGoal != null && !firestoreGoal.isVisible()) {
                            z10 = true;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this$0.S().C == null) {
                        ap.a S = this$0.S();
                        String courseId = UtilsKt.getCourseId(this$0.Q().getDomain());
                        String goalId = this$0.Q().getGoalId();
                        String domain = this$0.Q().getDomain();
                        String title = this$0.Q().getTitle();
                        String str3 = this$0.O().f11610y;
                        CustomDate customDate = new CustomDate();
                        Utils utils = Utils.INSTANCE;
                        customDate.setTime(utils.getTodayTimeInSeconds());
                        hs.k kVar = hs.k.f19476a;
                        CustomDate customDate2 = new CustomDate();
                        customDate2.setTime(utils.getTodayTimeInSeconds());
                        S.e(new FirestoreGoal(courseId, goalId, domain, title, str3, customDate, null, customDate2, null, false, null, this$0.Q().getGoalType(), false, null, 9536, null));
                        return;
                    }
                    FirestoreGoal firestoreGoal2 = this$0.S().C;
                    kotlin.jvm.internal.i.d(firestoreGoal2);
                    this$0.X(firestoreGoal2);
                    return;
                }
                x xVar = new x();
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                String goalId2 = this$0.Q().getGoalId();
                String domain2 = this$0.Q().getDomain();
                String str4 = "";
                if (domain2 == null) {
                    domain2 = "";
                }
                ?? goalById = firebasePersistence.getGoalById(goalId2, UtilsKt.getCourseId(domain2));
                xVar.f23469u = goalById;
                if (goalById == 0 || !goalById.isVisible()) {
                    if (xVar.f23469u == 0) {
                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                        String goalId3 = this$0.Q().getGoalId();
                        String domain3 = this$0.Q().getDomain();
                        if (domain3 == null) {
                            domain3 = "";
                        }
                        String courseId2 = UtilsKt.getCourseId(domain3);
                        String domain4 = this$0.Q().getDomain();
                        String goalType = this$0.Q().getGoalType();
                        if (goalType == null) {
                            str = "";
                        } else {
                            str = goalType;
                        }
                        firebasePersistence2.addNewGoalToFirebase(goalId3, courseId2, domain4, str, this$0.Q().getTitle(), false);
                        FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                        String goalId4 = this$0.Q().getGoalId();
                        String domain5 = this$0.Q().getDomain();
                        if (domain5 != null) {
                            str4 = domain5;
                        }
                        xVar.f23469u = firebasePersistence3.getGoalById(goalId4, UtilsKt.getCourseId(str4));
                    }
                    yn.a aVar = this$0.Y;
                    aVar.getClass();
                    if (yn.a.b()) {
                        this$0.c0(null, (Goal) xVar.f23469u);
                    } else {
                        x xVar2 = new x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_audio", aVar.a(true), "goals", this$0.Y, new f(this$0, xVar, xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle5.putString("activity_id", this$0.Q().getGoalId());
                    bundle5.putString("activity_name", this$0.Q().getTitle());
                    String templateType = this$0.Q().getTemplateType();
                    Locale ENGLISH = Locale.ENGLISH;
                    kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                    String lowerCase4 = templateType.toLowerCase(ENGLISH);
                    kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                    bundle5.putString("type", lowerCase4);
                    bundle5.putString("source", this$0.O().f11610y);
                    bundle5.putString("played_progress", this$0.U);
                    gk.a.b(bundle5, "activity_add_goal_click");
                    return;
                }
                return;
            case 4:
                int i14 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).getProgress() == 0.0f) {
                    z10 = true;
                }
                if (z10) {
                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).A();
                    return;
                } else {
                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                    return;
                }
            case 5:
                int i15 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.M) {
                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    e.C0679e c0679e = new e.C0679e();
                    AudioHelper audioHelper = this$0.H;
                    if (audioHelper != null) {
                        audioHelper.downloadAudioFile(this$0.P(), c0679e);
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle6.putString("activity_id", this$0.Q().getGoalId());
                        bundle6.putString("activity_name", this$0.Q().getTitle());
                        String lowerCase5 = this$0.Q().getTemplateType().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
                        bundle6.putString("type", lowerCase5);
                        bundle6.putString("source", this$0.O().f11610y);
                        bundle6.putBoolean("goal_added", this$0.C);
                        bundle6.putString(Constants.NOTIFICATION_URL, this$0.P());
                        gk.a.b(bundle6, "activity_audio_download_start");
                        return;
                    }
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                } else if (!ConnectionStatusReceiver.isConnected() && (str2 = this$0.W.get("download_failed_toast")) != null) {
                    Utils.INSTANCE.showCustomToast(this$0.requireActivity(), str2);
                    return;
                } else {
                    return;
                }
            case 6:
                int i16 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof RecommendedActivitiesPlaybackActivity) {
                    recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity;
                }
                if (recommendedActivitiesPlaybackActivity != null) {
                    recommendedActivitiesPlaybackActivity.v0(this$0.Q().getGoalId());
                    return;
                }
                return;
            default:
                int i17 = e.e0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.C) {
                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                    if (requireActivity2 instanceof RecommendedActivitiesPlaybackActivity) {
                        recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity2;
                    }
                    if (recommendedActivitiesPlaybackActivity != null) {
                        recommendedActivitiesPlaybackActivity.v0(this$0.Q().getGoalId());
                        return;
                    }
                    return;
                }
                Bundle bundle7 = new Bundle();
                bundle7.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle7.putString("activity_id", this$0.Q().getGoalId());
                bundle7.putString("activity_name", this$0.Q().getTitle());
                String lowerCase6 = this$0.Q().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase6, "this as java.lang.String).toLowerCase()");
                bundle7.putString("type", lowerCase6);
                bundle7.putString("source", this$0.O().f11610y);
                bundle7.putBoolean("goal_added", this$0.C);
                bundle7.putString("played_progress", this$0.U);
                gk.a.b(bundle7, "activity_done_click");
                this$0.requireActivity().finish();
                return;
        }
    }
}

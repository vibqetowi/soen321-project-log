package bl;

import a3.t;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.activity.AcceptingUncertaintyActivity;
import com.theinnerhour.b2b.activity.ActivitiesActivity;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.activity.ActivityScheduling;
import com.theinnerhour.b2b.activity.BenefitsOfSleepActivity;
import com.theinnerhour.b2b.activity.BlogActivity;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.activity.DailyPlanOverview;
import com.theinnerhour.b2b.activity.DealingRacingMindActivity;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.activity.DesigningHappinessActivity;
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.activity.HappinessAndEnviromentActivity;
import com.theinnerhour.b2b.activity.HappinessLocusOfControlActivity;
import com.theinnerhour.b2b.activity.HappinessMindfulnessActivity;
import com.theinnerhour.b2b.activity.MapProgressActivity;
import com.theinnerhour.b2b.activity.MultipleActivitiesActivity;
import com.theinnerhour.b2b.activity.ProblemSolvingActivity;
import com.theinnerhour.b2b.activity.PushActivity;
import com.theinnerhour.b2b.activity.QuizActivity;
import com.theinnerhour.b2b.activity.RelaxationActivity;
import com.theinnerhour.b2b.activity.SleepChecklistActivity;
import com.theinnerhour.b2b.activity.SleepDosDontsActivity;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.activity.T11Activity;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.activity.T2AActivity;
import com.theinnerhour.b2b.activity.T4CActivity;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.T6Activity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TAActivity;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.activity.VideoActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseHeroBannerModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserMood;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.r;
import is.u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import vs.c;
/* compiled from: DailyPlanDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f4356f0 = 0;
    public String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public ym.c P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public CourseDayModel U;
    public ProgressBar V;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4359d0;

    /* renamed from: w  reason: collision with root package name */
    public User f4362w;

    /* renamed from: x  reason: collision with root package name */
    public Course f4363x;

    /* renamed from: y  reason: collision with root package name */
    public String f4364y;

    /* renamed from: z  reason: collision with root package name */
    public int f4365z;
    public final LinkedHashMap e0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4360u = LogHelper.INSTANCE.makeLogTag(i.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<LearningHubModel> f4361v = new ArrayList<>();
    public final int G = 789;
    public int H = 50;
    public final int W = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    public final int X = 234;
    public final int Y = 345;
    public final int Z = 3654;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<String> f4357a0 = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList<String> f4358b0 = new ArrayList<>();
    public final HashMap<Integer, UserMood> c0 = new HashMap<>();

    /* compiled from: DailyPlanDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f4366a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f4367b;

        public a(Dialog dialog, LottieAnimationView lottieAnimationView) {
            this.f4366a = dialog;
            this.f4367b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f4366a.dismiss();
            this.f4367b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f4366a.dismiss();
            this.f4367b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public final void J() {
        try {
            ((Space) _$_findCachedViewById(com.theinnerhour.b2b.R.id.separatorViewTop)).setVisibility(0);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((Space) _$_findCachedViewById(com.theinnerhour.b2b.R.id.separatorViewTop)).getLayoutParams().height = (int) (displayMetrics.heightPixels * 0.2d);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void K(ConstraintLayout constraintLayout) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new f(constraintLayout));
        new g(this, constraintLayout).start();
        constraintLayout.setVisibility(4);
        new Handler().postDelayed(new b(constraintLayout, alphaAnimation, 0), 1200L);
    }

    public final void M(AppCompatImageView appCompatImageView) {
        Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), com.theinnerhour.b2b.R.anim.fade_in);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(requireContext(), com.theinnerhour.b2b.R.anim.fade_out);
        appCompatImageView.startAnimation(loadAnimation2);
        loadAnimation2.setAnimationListener(new h(appCompatImageView, loadAnimation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b0, code lost:
        if (r6 != false) goto L185;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0364 A[Catch: Exception -> 0x04dc, TRY_LEAVE, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0433 A[Catch: Exception -> 0x04dc, TRY_LEAVE, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044f A[Catch: Exception -> 0x04dc, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b4 A[Catch: Exception -> 0x04dc, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c9 A[Catch: Exception -> 0x04dc, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029f A[Catch: Exception -> 0x04dc, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x04dc, blocks: (B:3:0x000a, B:5:0x0022, B:7:0x002c, B:11:0x007e, B:13:0x0094, B:15:0x009e, B:16:0x00c0, B:18:0x00ce, B:19:0x00d5, B:21:0x00db, B:22:0x00f1, B:24:0x00f7, B:28:0x010e, B:31:0x011f, B:35:0x012e, B:37:0x014a, B:39:0x0154, B:40:0x0174, B:41:0x0186, B:44:0x0192, B:46:0x0196, B:48:0x019f, B:60:0x0200, B:63:0x0210, B:65:0x021b, B:67:0x0224, B:70:0x0229, B:72:0x022d, B:78:0x0260, B:85:0x029f, B:110:0x034a, B:112:0x0355, B:114:0x0359, B:144:0x043e, B:146:0x044f, B:150:0x0457, B:158:0x04c5, B:160:0x04c9, B:151:0x0472, B:153:0x047c, B:155:0x0495, B:154:0x0484, B:156:0x0499, B:157:0x04b4, B:109:0x0341, B:115:0x0364, B:140:0x0428, B:142:0x0433, B:139:0x041f, B:73:0x0233, B:74:0x0236, B:75:0x0237, B:77:0x023b, B:161:0x04cd, B:162:0x04d1, B:163:0x04d2, B:164:0x04d6, B:165:0x04d7, B:166:0x04db, B:53:0x01b2, B:55:0x01c2, B:56:0x01ce, B:58:0x01db, B:59:0x01fe, B:8:0x0049, B:10:0x004d), top: B:176:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        float f;
        boolean z10;
        CourseDayModel courseDayModel;
        String str;
        String F0;
        CourseDayModel courseDayModel2;
        boolean z11;
        boolean z12;
        try {
            this.H = 75;
            this.D = 0;
            X();
            if (this.J) {
                this.D += 25;
                if (!this.S) {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                    Context requireContext = requireContext();
                    Object obj = g0.a.f16164a;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                }
            } else if (!this.S) {
                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_chevron_right);
                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setColorFilter(Color.argb(255, 255, 255, 255));
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext2, com.theinnerhour.b2b.R.drawable.grey_rounded_corners_blue_stroke));
            }
            if (Z().getPlan().get(this.f4365z).isCompleted()) {
                this.D += 25;
                if (!this.S) {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                    Context requireContext3 = requireContext();
                    Object obj3 = g0.a.f16164a;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setBackground(a.c.b(requireContext3, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                }
            }
            this.F = 0;
            if (!this.f4361v.isEmpty()) {
                Iterator<LearningHubModel> it = this.f4361v.iterator();
                boolean z13 = false;
                while (it.hasNext()) {
                    LearningHubModel next = it.next();
                    Iterator<PostsRead> it2 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (kotlin.jvm.internal.i.b(it2.next().getPostId(), next.getId())) {
                                z12 = true;
                                break;
                            }
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (next.getDay() == ((int) Z().getCourseOpenDay())) {
                        if (!z12) {
                            this.F++;
                        }
                        z13 = true;
                    }
                }
                if (z13) {
                    this.H += 25;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setVisibility(0);
                    if (this.F == 0) {
                        this.D += 25;
                        if (!this.S) {
                            ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                            Context requireContext4 = requireContext();
                            Object obj4 = g0.a.f16164a;
                            ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setBackground(a.c.b(requireContext4, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                        }
                    }
                } else {
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setVisibility(8);
                }
            }
            if (this.T) {
                if (!this.f4359d0) {
                    wn.b.f36765a.getClass();
                    MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = wn.b.f36767c;
                    if (multiTrackerFirestoreStatsModel != null && multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                this.D += 25;
                this.L = true;
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleTracker);
                if (robertoTextView != null) {
                    robertoTextView.setTextColor(g0.a.b(requireContext(), com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                }
            } else if (this.c0.containsKey(7)) {
                this.D += 25;
                this.L = true;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleTracker)).setTextColor(((DailyPlanOverview) activity).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
            } else {
                this.L = false;
            }
            U();
            S();
            Q();
            ProgressBar progressBar = this.V;
            if (progressBar != null) {
                progressBar.setMax(this.H * 10);
                ProgressBar progressBar2 = this.V;
                if (progressBar2 != null) {
                    progressBar2.setProgress(this.D);
                    if (!this.N && !this.T) {
                        ProgressBar progressBar3 = this.V;
                        if (progressBar3 != null) {
                            progressBar3.setProgress(this.D);
                            int i6 = this.D;
                            this.O = i6;
                            f = (i6 / this.H) * 100.0f;
                            StringBuilder sb2 = new StringBuilder();
                            int i10 = (int) f;
                            sb2.append(i10);
                            sb2.append("% completed");
                            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(sb2.toString());
                            if (f != 100.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(8);
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setVisibility(8);
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setText(this.f4358b0.get(this.B));
                                ArrayList<CourseDayModel> plan = Z().getPlan();
                                long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                                try {
                                    int size = plan.size();
                                    courseDayModel2 = null;
                                    for (int i11 = 0; i11 < size; i11++) {
                                        try {
                                            if (plan.get(i11).getPosition() != 1 && (plan.get(i11).getStart_date() == 0 || plan.get(i11).getStart_date() > todayTimeInSeconds)) {
                                                if (i11 > 0 && plan.get(i11).getStart_date() == 0) {
                                                    int i12 = i11 - 1;
                                                    if (plan.get(i12).getStart_date() != 0) {
                                                        if (plan.get(i12).getStart_date() >= todayTimeInSeconds) {
                                                        }
                                                    }
                                                }
                                            }
                                            courseDayModel2 = plan.get(i11);
                                        } catch (Exception e10) {
                                            e = e10;
                                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                                            kotlin.jvm.internal.i.d(courseDayModel2);
                                            if (courseDayModel2.getPosition() <= this.f4365z) {
                                                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tick)).setVisibility(0);
                                            }
                                            ArrayList<String> arrayList = this.f4357a0;
                                            str = arrayList.get(this.C);
                                            kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                                            if (!r.J0(str, "5")) {
                                            }
                                            if (this.S) {
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    courseDayModel2 = null;
                                }
                                kotlin.jvm.internal.i.d(courseDayModel2);
                                if (courseDayModel2.getPosition() <= this.f4365z && !this.S) {
                                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tick)).setVisibility(0);
                                }
                            } else {
                                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tick)).setVisibility(8);
                                androidx.fragment.app.p activity2 = getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setText(((DailyPlanOverview) activity2).getResources().getString(com.theinnerhour.b2b.R.string.your_todays_plan_progress_title));
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(i10 + "% completed");
                                ArrayList<CourseDayModel> plan2 = Z().getPlan();
                                long todayTimeInSeconds2 = Utils.INSTANCE.getTodayTimeInSeconds();
                                try {
                                    int size2 = plan2.size();
                                    courseDayModel = null;
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        try {
                                            if (plan2.get(i13).getPosition() != 1 && (plan2.get(i13).getStart_date() == 0 || plan2.get(i13).getStart_date() > todayTimeInSeconds2)) {
                                                if (i13 > 0 && plan2.get(i13).getStart_date() == 0) {
                                                    int i14 = i13 - 1;
                                                    if (plan2.get(i14).getStart_date() != 0) {
                                                        if (plan2.get(i14).getStart_date() >= todayTimeInSeconds2) {
                                                        }
                                                    }
                                                }
                                            }
                                            courseDayModel = plan2.get(i13);
                                        } catch (Exception e12) {
                                            e = e12;
                                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                                            kotlin.jvm.internal.i.d(courseDayModel);
                                            if (courseDayModel.getPosition() < this.f4365z) {
                                            }
                                            ArrayList<String> arrayList2 = this.f4357a0;
                                            str = arrayList2.get(this.C);
                                            kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                                            if (!r.J0(str, "5")) {
                                            }
                                            if (this.S) {
                                            }
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    courseDayModel = null;
                                }
                                kotlin.jvm.internal.i.d(courseDayModel);
                                if (courseDayModel.getPosition() < this.f4365z) {
                                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(0);
                                }
                            }
                            ArrayList<String> arrayList22 = this.f4357a0;
                            str = arrayList22.get(this.C);
                            kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                            if (!r.J0(str, "5")) {
                                int i15 = this.H;
                                if (i15 != 75) {
                                    if (i15 != 100) {
                                        String str2 = arrayList22.get(this.C);
                                        kotlin.jvm.internal.i.f(str2, "welcomeList[welcomeMsgMsgIndex]");
                                        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(gv.n.F0(str2, "5", "2"));
                                    } else {
                                        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc);
                                        if (this.S) {
                                            F0 = getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanAllDone);
                                        } else {
                                            String str3 = arrayList22.get(this.C);
                                            kotlin.jvm.internal.i.f(str3, "welcomeList[welcomeMsgMsgIndex]");
                                            F0 = gv.n.F0(str3, "5", "4");
                                        }
                                        robertoTextView2.setText(F0);
                                    }
                                } else {
                                    String str4 = arrayList22.get(this.C);
                                    kotlin.jvm.internal.i.f(str4, "welcomeList[welcomeMsgMsgIndex]");
                                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(gv.n.F0(str4, "5", "3"));
                                }
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(arrayList22.get(this.C));
                            }
                            if (this.S) {
                                o0();
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.i.q("progressBar");
                        throw null;
                    }
                    ProgressBar progressBar4 = this.V;
                    if (progressBar4 != null) {
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar4, Constants.SCREEN_PROGRESS, this.O * 10, this.D * 10);
                        ofInt.setDuration(500L);
                        ofInt.setInterpolator(new LinearInterpolator());
                        ofInt.start();
                        int i62 = this.D;
                        this.O = i62;
                        f = (i62 / this.H) * 100.0f;
                        StringBuilder sb22 = new StringBuilder();
                        int i102 = (int) f;
                        sb22.append(i102);
                        sb22.append("% completed");
                        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(sb22.toString());
                        if (f != 100.0f) {
                        }
                        if (!z10) {
                        }
                        ArrayList<String> arrayList222 = this.f4357a0;
                        str = arrayList222.get(this.C);
                        kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                        if (!r.J0(str, "5")) {
                        }
                        if (this.S) {
                        }
                    } else {
                        kotlin.jvm.internal.i.q("progressBar");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("progressBar");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("progressBar");
                throw null;
            }
        } catch (Exception e14) {
            LogHelper.INSTANCE.e(this.f4360u, e14);
        }
    }

    public final void P() {
        boolean z10;
        boolean z11;
        try {
            ArrayList<CourseDayModel> plan = Z().getPlan();
            long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
            int i6 = 0;
            CourseDayModel courseDayModel = null;
            try {
                int size = plan.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (plan.get(i10).getPosition() != 1 && (plan.get(i10).getStart_date() == 0 || plan.get(i10).getStart_date() > todayTimeInSeconds)) {
                        if (i10 > 0 && plan.get(i10).getStart_date() == 0) {
                            int i11 = i10 - 1;
                            if (plan.get(i11).getStart_date() != 0) {
                                if (plan.get(i11).getStart_date() >= todayTimeInSeconds) {
                                }
                            }
                        }
                    }
                    courseDayModel = plan.get(i10);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e10);
            }
            if (courseDayModel != null && courseDayModel.getPosition() > 1 && courseDayModel.getStart_date() != 0) {
                if (courseDayModel.getPosition() < 7) {
                    i6 = 2;
                } else {
                    int position = courseDayModel.getPosition();
                    if (7 <= position && position < 20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i6 = 7;
                    } else {
                        int position2 = courseDayModel.getPosition();
                        if (20 <= position2 && position2 < 28) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i6 = 20;
                        } else if (a0() >= 28) {
                            i6 = 29;
                        }
                    }
                }
                if (i6 != 0) {
                    if (ApplicationPersistence.getInstance().getBooleanValue("check_day_" + i6, true)) {
                        if (i6 == 2) {
                            ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", true);
                        }
                        ApplicationPersistence.getInstance().setStringValue(Constants.APP_FEEDBACK_TRIGGER, "course_day_" + i6);
                        r0("check_day_" + i6);
                    }
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f4360u, "exception in check show app feed back", e11);
        }
    }

    public final void Q() {
        try {
            boolean z10 = false;
            if (!this.S) {
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCardContainer)).setVisibility(0);
            }
            if (Z().getPlan().get(this.f4365z).isCompleted()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setTextColor(((DailyPlanOverview) activity).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleDailyPlan)).setTextColor(((DailyPlanOverview) activity2).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                z10 = true;
            } else {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setTextColor(((DailyPlanOverview) activity3).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleDailyPlan)).setTextColor(((DailyPlanOverview) activity4).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
            }
            this.K = z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void S() {
        try {
            if (this.M) {
                if (!this.S) {
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer)).setVisibility(0);
                }
                if (this.E == 0) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goal_title)).setTextColor(((DailyPlanOverview) activity).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setTextColor(((DailyPlanOverview) activity2).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                } else {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goal_title)).setTextColor(((DailyPlanOverview) activity3).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setTextColor(((DailyPlanOverview) activity4).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
                }
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanGoalCardTitle));
            } else if (!this.S) {
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer)).setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void U() {
        try {
            boolean z10 = false;
            if (!this.S && (!this.f4361v.isEmpty())) {
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCardContainer)).setVisibility(0);
            }
            if (this.F == 0) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setTextColor(((DailyPlanOverview) activity).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setTextColor(((DailyPlanOverview) activity2).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                z10 = true;
            } else {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setTextColor(((DailyPlanOverview) activity3).getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setTextColor(((DailyPlanOverview) activity4).getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
            }
            this.I = z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void X() {
        boolean z10 = false;
        try {
            this.E = 0;
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            if (userGoals.size() > 0) {
                ArrayList<Goal> arrayList = new ArrayList();
                Iterator<T> it = userGoals.iterator();
                while (true) {
                    boolean z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Goal goal = (Goal) next;
                    if (!goal.isVisible() || kotlin.jvm.internal.i.b(goal.getType(), "checklist")) {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.M = true;
                    for (Goal goal2 : arrayList) {
                        if (!goal2.getTrackList().isEmpty()) {
                            if (kotlin.jvm.internal.i.b(goal2.getType(), "activity_scheduling")) {
                                long time = goal2.getStartDate().getTime();
                                Utils utils = Utils.INSTANCE;
                                if (time <= utils.getTodayTimeInSeconds() && goal2.isVisible() && (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() < utils.getTodayTimeInSeconds() || (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() == utils.getTodayTimeInSeconds() && ((GoalDateObj) u.o2(goal2.getTrackList())).getVal() == -1))) {
                                    this.E++;
                                }
                            } else {
                                long time2 = goal2.getStartDate().getTime();
                                Utils utils2 = Utils.INSTANCE;
                                if (time2 <= utils2.getTodayTimeInSeconds() && goal2.isVisible() && (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() < utils2.getTodayTimeInSeconds() || (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() == utils2.getTodayTimeInSeconds() && ((GoalDateObj) u.o2(goal2.getTrackList())).getVal() != 2))) {
                                    this.E++;
                                }
                            }
                        } else if (goal2.getStartDate().getTime() <= Utils.INSTANCE.getTodayTimeInSeconds() && goal2.isVisible()) {
                            this.E++;
                        }
                    }
                    if (this.E <= 0) {
                        z10 = true;
                    }
                    this.J = z10;
                    return;
                }
                this.J = false;
                this.M = false;
                return;
            }
            this.J = false;
            this.M = false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void Y() {
        ym.c cVar = (ym.c) new o0(this, new kk.c(Z())).a(ym.c.class);
        this.P = cVar;
        if (cVar != null) {
            cVar.f();
            ym.c cVar2 = this.P;
            if (cVar2 != null) {
                cVar2.f38687y.e(getViewLifecycleOwner(), new c(0, this));
                return;
            } else {
                kotlin.jvm.internal.i.q("learningHubViewModel");
                throw null;
            }
        }
        kotlin.jvm.internal.i.q("learningHubViewModel");
        throw null;
    }

    public final Course Z() {
        Course course = this.f4363x;
        if (course != null) {
            return course;
        }
        kotlin.jvm.internal.i.q("course");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.e0;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final long a0() {
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (courseById != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(courseById.getmStartDate());
                calendar.clear(11);
                calendar.clear(9);
                calendar.clear(12);
                calendar.clear(10);
                calendar.clear(13);
                calendar.clear(14);
                return TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
            }
            return 0L;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, "exception in get course elapse days", e10);
            return 0L;
        }
    }

    public final String b0() {
        String str = this.f4364y;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("currentCourse");
        throw null;
    }

    public final CourseDayModel c0() {
        CourseDayModel courseDayModel = this.U;
        if (courseDayModel != null) {
            return courseDayModel;
        }
        kotlin.jvm.internal.i.q("currentDaymodel");
        throw null;
    }

    public final User g0() {
        User user = this.f4362w;
        if (user != null) {
            return user;
        }
        kotlin.jvm.internal.i.q("user");
        throw null;
    }

    public final void h0(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        Context requireContext = requireContext();
                        Object obj = g0.a.f16164a;
                        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setBackground(a.c.b(requireContext, com.theinnerhour.b2b.R.drawable.background_curved_grey_corner_5dp));
                        AppCompatImageView arrowNext3 = (AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext3);
                        kotlin.jvm.internal.i.f(arrowNext3, "arrowNext3");
                        M(arrowNext3);
                        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoInnerResources)).setVisibility(8);
                        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setEnabled(false);
                        ((Space) _$_findCachedViewById(com.theinnerhour.b2b.R.id.separatorViewBottom)).setVisibility(8);
                        new Handler().postDelayed(new e(this, 0), 500L);
                        return;
                    }
                    return;
                }
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext2, com.theinnerhour.b2b.R.drawable.background_curved_grey_corner_5dp));
                AppCompatImageView arrowNext2 = (AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2);
                kotlin.jvm.internal.i.f(arrowNext2, "arrowNext2");
                M(arrowNext2);
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoGoals)).setVisibility(8);
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setEnabled(false);
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoTracker)).setVisibility(8);
            return;
        }
        Context requireContext3 = requireContext();
        Object obj3 = g0.a.f16164a;
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setBackground(a.c.b(requireContext3, com.theinnerhour.b2b.R.drawable.background_curved_grey_corner_5dp));
        AppCompatImageView arrowNext = (AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext);
        kotlin.jvm.internal.i.f(arrowNext, "arrowNext");
        M(arrowNext);
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfo)).setVisibility(8);
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setEnabled(false);
    }

    public final void j0() {
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.header_arrow_back)).setOnClickListener(new bl.a(this, 0));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setOnClickListener(new bl.a(this, 1));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setOnClickListener(new bl.a(this, 2));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setOnClickListener(new bl.a(this, 3));
        ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.addGoalsButtonMain)).setOnClickListener(new bl.a(this, 4));
    }

    public final void k0(int i6) {
        Intent intent = new Intent(getActivity(), MultiTrackerActivity.class);
        intent.putExtra("mood", i6);
        intent.putExtra("tutorial", this.S);
        startActivityForResult(intent, this.Z);
        Bundle bundle = new Bundle();
        bundle.putInt("mood", i6);
        defpackage.e.s(bundle, "course", "source", "plan");
        gk.a.b(bundle, "new_tracker_mood_click");
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x078f A[Catch: Exception -> 0x0869, TryCatch #1 {Exception -> 0x0869, blocks: (B:313:0x078f, B:315:0x079e, B:316:0x07a1, B:38:0x00f9, B:40:0x0109, B:42:0x0117, B:44:0x0127, B:46:0x0137, B:47:0x0144, B:49:0x014a, B:51:0x015a, B:52:0x0167, B:55:0x0173, B:57:0x017e, B:58:0x0185, B:61:0x0191, B:63:0x01a5, B:66:0x01b1, B:68:0x01bc, B:70:0x01c3, B:72:0x01cb, B:73:0x01d8, B:75:0x01e1, B:76:0x01f2, B:78:0x01fa, B:79:0x0206, B:82:0x0212, B:83:0x0226, B:86:0x022f, B:88:0x0237, B:89:0x024e, B:91:0x0256, B:92:0x0261, B:94:0x0269, B:96:0x0271, B:98:0x0279, B:100:0x0281, B:103:0x028b, B:105:0x0293, B:106:0x02a0, B:108:0x02a8, B:109:0x02b5, B:111:0x02bd, B:112:0x02ca, B:114:0x02d2, B:115:0x02df, B:117:0x02e7, B:120:0x02f1, B:122:0x02f7, B:125:0x02ff, B:127:0x0307, B:128:0x0314, B:130:0x031c, B:131:0x0329, B:133:0x0331, B:136:0x033b, B:139:0x034d, B:141:0x0357, B:143:0x035d, B:145:0x0366, B:147:0x0370, B:149:0x038a, B:151:0x0392, B:153:0x039c, B:155:0x03a2, B:157:0x03ab, B:159:0x03b5, B:160:0x03cb, B:162:0x03d3, B:163:0x0401, B:165:0x040b, B:166:0x0418, B:168:0x0420, B:169:0x042d, B:171:0x0435, B:172:0x0442, B:175:0x044c, B:177:0x0458, B:179:0x0460, B:180:0x046e, B:182:0x0476, B:183:0x0483, B:185:0x048b, B:186:0x0496, B:188:0x049e, B:189:0x04bb, B:191:0x04c3, B:192:0x04d0, B:194:0x04d8, B:195:0x04e5, B:198:0x04f3, B:199:0x0502, B:201:0x050a, B:202:0x0519, B:204:0x0521, B:205:0x052e, B:208:0x0537, B:210:0x053f, B:211:0x054c, B:213:0x0554, B:215:0x055c, B:217:0x0564, B:219:0x056c, B:221:0x0574, B:223:0x057c, B:226:0x0586, B:228:0x058e, B:230:0x0596, B:232:0x059e, B:234:0x05a6, B:236:0x05ae, B:239:0x05b8, B:241:0x05c0, B:244:0x05ca, B:247:0x05d3, B:250:0x05dc, B:253:0x05e5, B:255:0x05ed, B:257:0x05f5, B:259:0x05fd, B:261:0x0605, B:264:0x060f, B:266:0x0617, B:267:0x0624, B:269:0x062c, B:272:0x0636, B:274:0x063e, B:275:0x064b, B:277:0x0653, B:278:0x0660, B:280:0x0668, B:281:0x0675, B:283:0x067d, B:284:0x068a, B:286:0x0692, B:287:0x069f, B:289:0x06a7, B:290:0x06b4, B:292:0x06bc, B:293:0x06c9, B:295:0x06d1, B:296:0x06de, B:298:0x06e6, B:299:0x06f3, B:301:0x06fb, B:303:0x070b, B:304:0x0718, B:305:0x0724, B:306:0x0730, B:307:0x073c, B:308:0x0748, B:309:0x075a, B:310:0x0770, B:311:0x077f), top: B:345:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x086d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(Bundle bundle, String str) {
        Intent intent;
        Object obj;
        String str2;
        Intent intent2;
        try {
            boolean b10 = kotlin.jvm.internal.i.b(str, Constants.SCREEN_PROGRESS);
            String str3 = this.f4360u;
            if (b10) {
                intent = new Intent(getActivity(), MapProgressActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ENDURING_BEHAVIOUR)) {
                intent = new Intent(getActivity(), EnduringActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS)) {
                intent = new Intent(getActivity(), ThoughtsActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITIES)) {
                intent = new Intent(getActivity(), ActivitiesActivity.class);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_COPING)) {
                intent = new Intent(getActivity(), CopingActivity.class);
                intent.putExtra("enable_schedule", false);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ARTICLE)) {
                intent = new Intent(getActivity(), BlogActivity.class);
                if (!ca.a.k("v1", "v2").contains(g0().getVersion())) {
                    intent.putExtra("course_position", this.f4365z);
                } else {
                    intent.putExtra("course_position", this.f4365z + 1);
                }
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ENDURING_ASSESSMENT)) {
                intent = new Intent(getActivity(), GoalsAssessmentActivity.class);
                intent.putExtra(Constants.API_COURSE_LINK, str);
            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ARTICLE)) {
                intent = new Intent(getActivity(), TipsActivity.class);
                intent.putExtra("assesment_pos", 4);
            } else {
                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SYMPTOMS)) {
                    try {
                        if (kotlin.jvm.internal.i.b(Z().getCourseName(), Constants.COURSE_STRESS) || kotlin.jvm.internal.i.b(Z().getCourseName(), Constants.COURSE_DEPRESSION) || kotlin.jvm.internal.i.b(Z().getCourseName(), Constants.COURSE_WORRY) || kotlin.jvm.internal.i.b(Z().getCourseName(), Constants.COURSE_ANGER)) {
                            intent = new Intent(getActivity(), SymptomsActivity.class);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        LogHelper.INSTANCE.e(e);
                        return;
                    }
                }
                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_SYMPTOMS) && kotlin.jvm.internal.i.b(Z().getCourseName(), Constants.COURSE_SLEEP)) {
                    intent = new Intent(getActivity(), CausesActivity.class);
                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ACTIVITY)) {
                    intent = new Intent(getActivity(), RelaxationActivity.class);
                    if (bundle != null) {
                        bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_DEEP_BREATHING);
                    }
                } else {
                    boolean b11 = kotlin.jvm.internal.i.b(str, Constants.SCREEN_FACTS);
                    obj = Constants.COURSE_DEPRESSION;
                    if (b11) {
                        intent = new Intent(getActivity(), TipsActivity.class);
                        intent.putExtra("assesment_pos", 0);
                        intent.putExtra("final_pos", 1);
                        str2 = str3;
                        if (intent != null) {
                            LogHelper.INSTANCE.i(str2, "intent is not null");
                            if (bundle != null) {
                                intent.putExtras(bundle);
                            }
                            intent.putExtra(Constants.API_COURSE_LINK, str);
                            String str4 = this.A;
                            if (str4 != null) {
                                if (kotlin.jvm.internal.i.b(str, str4)) {
                                    this.Q = true;
                                    startActivityForResult(intent, this.G);
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle2.putString(Constants.API_COURSE_LINK, str);
                                User user = FirebasePersistence.getInstance().getUser();
                                if (user != null) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                                    bundle2.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                                }
                                bundle2.putBoolean("isOnboarding", this.S);
                                if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), obj) && this.f4365z < 7) {
                                    bundle2.putBoolean("isNewActivities", true);
                                } else {
                                    bundle2.putBoolean("isNewActivities", false);
                                }
                                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                bundle2.putInt(Constants.DAYMODEL_POSITION, c0().getPosition());
                                UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
                                return;
                            }
                            kotlin.jvm.internal.i.q("intentLink");
                            throw null;
                        }
                        return;
                    }
                    if (kotlin.jvm.internal.i.b(str, "physical_activity")) {
                        intent = new Intent(getActivity(), RelaxationActivity.class);
                        if (bundle != null) {
                            bundle.putString("activity_id", Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS);
                        }
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
                        intent = new Intent(getActivity(), GoalsAssessmentActivity.class);
                        intent.putExtra(Constants.API_COURSE_LINK, str);
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_FACTS_DYK)) {
                        intent = new Intent(getActivity(), TipsActivity.class);
                        intent.putExtra("assesment_pos", 2);
                        intent.putExtra("final_pos", 3);
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_QUIZ)) {
                        intent = new Intent(getActivity(), QuizActivity.class);
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY)) {
                        intent = new Intent(getActivity(), MultipleActivitiesActivity.class);
                        intent.putExtra(Constants.SCREEN_ACTIVITY_1, Constants.ACTIVITY_ID_STRESS_GUIDED_IMAGERY);
                        intent.putExtra(Constants.SCREEN_ACTIVITY_2, Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS);
                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_TRAKCER)) {
                        return;
                    } else {
                        if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_BROWSER)) {
                            intent = new Intent(getActivity(), WebviewActivity.class);
                            kotlin.jvm.internal.i.d(bundle);
                            intent.putExtra(Constants.NOTIFICATION_URL, bundle.getString(Constants.NOTIFICATION_URL));
                        } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_POSITIVE_ENDURING_BEHAVIOUR)) {
                            intent = new Intent(getActivity(), EnduringActivity.class);
                        } else {
                            if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_2) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_3) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_4) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIP_5)) {
                                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_DOS_AND_DONTS)) {
                                    intent = new Intent(getActivity(), SleepDosDontsActivity.class);
                                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_RACING_MIND)) {
                                    intent = new Intent(getActivity(), DealingRacingMindActivity.class);
                                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_POSITIVE_AND_NEGATIVE)) {
                                    intent = new Intent(getActivity(), BenefitsOfSleepActivity.class);
                                } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_TIME_TABLE)) {
                                    intent = new Intent(getActivity(), SleepTimeTableActivity.class);
                                } else {
                                    if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_REASSESSMENT_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_REASSESSMENT_2)) {
                                        if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACTIVITY_2)) {
                                            if (kotlin.jvm.internal.i.b(str, "checklist")) {
                                                intent = new Intent(getActivity(), SleepChecklistActivity.class);
                                            } else if (kotlin.jvm.internal.i.b(str, "activity_scheduling")) {
                                                intent = new Intent(getActivity(), ActivityScheduling.class);
                                            } else {
                                                if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_MULTIPLE_TIPS_1) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_MULTIPLE_TIPS_2)) {
                                                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_FIREBASE_CHAT)) {
                                                        String a10 = FirebaseAuth.getInstance().a();
                                                        if (a10 != null && !kotlin.jvm.internal.i.b(a10, "")) {
                                                            kotlin.jvm.internal.i.d(bundle);
                                                            if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && kotlin.jvm.internal.i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a10)) {
                                                                intent = new Intent(getActivity(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY);
                                                            }
                                                        }
                                                        str2 = str3;
                                                        intent = null;
                                                        if (intent != null) {
                                                        }
                                                    } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_PSYCHIATRIST_CHAT)) {
                                                        String a11 = FirebaseAuth.getInstance().a();
                                                        if (a11 != null && !kotlin.jvm.internal.i.b(a11, "")) {
                                                            kotlin.jvm.internal.i.d(bundle);
                                                            if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && kotlin.jvm.internal.i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a11)) {
                                                                intent = new Intent(getActivity(), TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY);
                                                            }
                                                        }
                                                        str2 = str3;
                                                        intent = null;
                                                        if (intent != null) {
                                                        }
                                                    } else {
                                                        if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_NOTIFICATION_ACTIVITY)) {
                                                            intent2 = new Intent(getActivity(), ActivitiesInfoActivity.class);
                                                            LogHelper logHelper = LogHelper.INSTANCE;
                                                            kotlin.jvm.internal.i.d(bundle);
                                                            String string = bundle.getString(Constants.GOAL_ID);
                                                            kotlin.jvm.internal.i.d(string);
                                                            Object[] objArr = {"goal id of notification ".concat(string)};
                                                            str2 = str3;
                                                            logHelper.i(str2, objArr);
                                                            bundle.putString("activity_id", bundle.getString(Constants.GOAL_ID));
                                                        } else {
                                                            str2 = str3;
                                                            if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_GRATITUDE_JOURNAL)) {
                                                                intent = new Intent(getActivity(), GratitudeJournalComponentActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_DESIGNING_HAPPINESS)) {
                                                                intent = new Intent(getActivity(), DesigningHappinessActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_LOCUS_OF_CONTROL)) {
                                                                intent = new Intent(getActivity(), HappinessLocusOfControlActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_MINDFULNESS)) {
                                                                intent2 = new Intent(getActivity(), HappinessMindfulnessActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_MINDFULNESS_ACTIVITY)) {
                                                                intent2 = new Intent(getActivity(), HappinessMindfulnessActivity.class);
                                                                intent2.putExtra("assesment_pos", 3);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_HAPPINESS_AND_ENVIROMENT)) {
                                                                intent = new Intent(getActivity(), HappinessAndEnviromentActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPIST_DETAIL)) {
                                                                intent = new Intent(getActivity(), TelecommunicationsPWAActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_THERAPIST_PACKAGES)) {
                                                                intent = new Intent(getActivity(), TelecommunicationsPWAActivity.class);
                                                                intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.CROSS_PROVIDER);
                                                                intent.putExtra("isTherapy", true);
                                                                intent.putExtra("providerType", "therapist");
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_PROBLEM_SOLVING)) {
                                                                intent = new Intent(getActivity(), ProblemSolvingActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_ACCEPTING_UNCERTAINITY)) {
                                                                intent = new Intent(getActivity(), AcceptingUncertaintyActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_COACHMARKS_1)) {
                                                                intent = new Intent(getActivity(), V2GoalsActivity.class).putExtra("source", "plan");
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_GOALS_LIST)) {
                                                                intent = new Intent(getActivity(), V2GoalsActivity.class).putExtra("source", "plan");
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_RELIEF_BOX)) {
                                                                intent = new Intent(getActivity(), BotPwaActivity.class);
                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_CONTENT_MARKETING_LIST)) {
                                                                return;
                                                            } else {
                                                                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_T4C)) {
                                                                    intent = new Intent(getActivity(), T4CActivity.class);
                                                                } else {
                                                                    if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_T2A) && !kotlin.jvm.internal.i.b(str, Constants.GROUNDING) && !kotlin.jvm.internal.i.b(str, Constants.GROUNDING_LOWER_BODY) && !kotlin.jvm.internal.i.b(str, Constants.FOCUSSED_ATTENTION_MEDITATION) && !kotlin.jvm.internal.i.b(str, Constants.HUMMING) && !kotlin.jvm.internal.i.b(str, Constants.TOE_TENSING) && !kotlin.jvm.internal.i.b(str, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                                                                        if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1F) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1I) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1H) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1G) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1J) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T1K)) {
                                                                            if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_COMMUNITY) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_COMMUNITY_POST)) {
                                                                                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_CURRENT_ACTIVITY) || kotlin.jvm.internal.i.b(str, Constants.SCREEN_APP_FEEDBACK) || kotlin.jvm.internal.i.b(str, Constants.SCREEN_DASHBOARD)) {
                                                                                    return;
                                                                                }
                                                                                if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_T8A) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T8B) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T8C) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T8G) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T8I)) {
                                                                                    if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_T6A)) {
                                                                                        intent = new Intent(getActivity(), T6Activity.class);
                                                                                    } else {
                                                                                        if (!kotlin.jvm.internal.i.b(str, Constants.SCREEN_T5A) && !kotlin.jvm.internal.i.b(str, Constants.SCREEN_T5B)) {
                                                                                            if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_T11A)) {
                                                                                                intent = new Intent(getActivity(), T11Activity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_TAE)) {
                                                                                                intent = new Intent(getActivity(), TAActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionPleasurableActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_HOPE_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionHopeActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIMEOUT_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionTimeoutActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionMasteryActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionExerciseActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionThoughtsActivity.class);
                                                                                            } else if (kotlin.jvm.internal.i.b(str, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW)) {
                                                                                                intent = new Intent(getActivity(), DepressionGoodthingsActivity.class);
                                                                                            } else {
                                                                                                if (kotlin.jvm.internal.i.b(str, Constants.SCREEN_VIDEO_1)) {
                                                                                                    intent = new Intent(getActivity(), VideoActivity.class);
                                                                                                }
                                                                                                intent = null;
                                                                                            }
                                                                                        }
                                                                                        intent = new Intent(getActivity(), T5Activity.class);
                                                                                    }
                                                                                }
                                                                                intent = new Intent(getActivity(), T8Activity.class);
                                                                            }
                                                                            intent = new Intent(getActivity(), CommunitiesPwaActivity.class);
                                                                        }
                                                                        intent = new Intent(getActivity(), T1Activity.class);
                                                                    }
                                                                    intent = new Intent(getActivity(), T2AActivity.class);
                                                                }
                                                            }
                                                            if (intent != null) {
                                                            }
                                                        }
                                                        intent = intent2;
                                                        if (intent != null) {
                                                        }
                                                    }
                                                }
                                                str2 = str3;
                                                intent = new Intent(getActivity(), TipsActivity.class);
                                                kotlin.jvm.internal.i.d(bundle);
                                                bundle.putString(Constants.API_COURSE_LINK, str);
                                                if (intent != null) {
                                                }
                                            }
                                        }
                                        str2 = str3;
                                        intent = new Intent(getActivity(), PushActivity.class);
                                        new Bundle().putString(Constants.API_COURSE_LINK, str);
                                        if (intent != null) {
                                        }
                                    }
                                    str2 = str3;
                                    intent = new Intent(getActivity(), GoalsAssessmentActivity.class);
                                    intent.putExtra(Constants.API_COURSE_LINK, str);
                                    if (intent != null) {
                                    }
                                }
                            }
                            str2 = str3;
                            intent = new Intent(getActivity(), TipsActivity.class);
                            intent.putExtra(Constants.API_COURSE_LINK, str);
                            if (intent != null) {
                            }
                        }
                    }
                    str2 = str3;
                    if (intent != null) {
                    }
                }
            }
            obj = Constants.COURSE_DEPRESSION;
            str2 = str3;
            if (intent != null) {
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void n0() {
        boolean z10;
        try {
            String firstName = g0().getFirstName();
            kotlin.jvm.internal.i.f(firstName, "user.firstName");
            if (firstName.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ArrayList<String> arrayList = this.f4357a0;
            if (z10) {
                arrayList.add("Hi " + g0().getFirstName() + ", here's what's in store for you today");
            }
            String courseName = Z().getCourseName();
            if (courseName != null) {
                switch (courseName.hashCode()) {
                    case -2114782937:
                        if (!courseName.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity = getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_happiness));
                            break;
                        }
                    case -1617042330:
                        if (!courseName.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity2 = getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity2).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_depression));
                            break;
                        }
                    case -891989580:
                        if (!courseName.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity3).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_stress));
                            break;
                        }
                    case 92960775:
                        if (!courseName.equals(Constants.COURSE_ANGER)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity4).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_anger));
                            break;
                        }
                    case 109522647:
                        if (!courseName.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity5 = getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity5).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_sleep));
                            break;
                        }
                    case 113319009:
                        if (!courseName.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            androidx.fragment.app.p activity6 = getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            arrayList.add(((DailyPlanOverview) activity6).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_anxiety));
                            break;
                        }
                }
            }
            androidx.fragment.app.p activity7 = getActivity();
            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList.add(((DailyPlanOverview) activity7).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_1));
            androidx.fragment.app.p activity8 = getActivity();
            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList.add(((DailyPlanOverview) activity8).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_2));
            androidx.fragment.app.p activity9 = getActivity();
            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList.add(((DailyPlanOverview) activity9).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_3));
            androidx.fragment.app.p activity10 = getActivity();
            kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList.add(((DailyPlanOverview) activity10).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_4));
            androidx.fragment.app.p activity11 = getActivity();
            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList.add(((DailyPlanOverview) activity11).getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_5));
            ArrayList<String> arrayList2 = this.f4358b0;
            androidx.fragment.app.p activity12 = getActivity();
            kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList2.add(((DailyPlanOverview) activity12).getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_1));
            androidx.fragment.app.p activity13 = getActivity();
            kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList2.add(((DailyPlanOverview) activity13).getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_2));
            androidx.fragment.app.p activity14 = getActivity();
            kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            arrayList2.add(((DailyPlanOverview) activity14).getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void o0() {
        try {
            if (this.K) {
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setBackground(a.c.b(requireContext, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                if (this.L) {
                    if (this.M) {
                        if (this.J) {
                            ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext(), com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                            if (this.I) {
                                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setBackground(a.c.b(requireContext(), com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                            } else {
                                ConstraintLayout innerResourcesCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard);
                                kotlin.jvm.internal.i.f(innerResourcesCard, "innerResourcesCard");
                                s0(innerResourcesCard);
                            }
                        } else {
                            ConstraintLayout goalCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard);
                            kotlin.jvm.internal.i.f(goalCard, "goalCard");
                            s0(goalCard);
                        }
                    } else {
                        ConstraintLayout goalCard2 = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard);
                        kotlin.jvm.internal.i.f(goalCard2, "goalCard");
                        s0(goalCard2);
                    }
                } else if (this.T) {
                    FrameLayout trackerRippleBg = (FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerRippleBg);
                    kotlin.jvm.internal.i.f(trackerRippleBg, "trackerRippleBg");
                    s0(trackerRippleBg);
                } else if (this.N) {
                    FrameLayout trackerRippleBg2 = (FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerRippleBg);
                    kotlin.jvm.internal.i.f(trackerRippleBg2, "trackerRippleBg");
                    s0(trackerRippleBg2);
                }
            } else {
                ConstraintLayout dailyPlanCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard);
                kotlin.jvm.internal.i.f(dailyPlanCard, "dailyPlanCard");
                s0(dailyPlanCard);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        Bundle extras;
        super.onActivityResult(i6, i10, intent);
        try {
            if (i6 == this.G) {
                Bundle bundle = new Bundle();
                bundle.putString("course", Z().getCourseName());
                CourseHeroBannerModel hero_banner = Z().getPlan().get(this.f4365z).getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner);
                bundle.putString(Constants.API_COURSE_LINK, hero_banner.getLink());
                bundle.putInt(Constants.DAYMODEL_POSITION, Z().getPlan().get(this.f4365z).getPosition());
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                    bundle.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                }
                if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_DEPRESSION) && this.f4365z < 7) {
                    bundle.putBoolean("isNewActivities", true);
                } else {
                    bundle.putBoolean("isNewActivities", false);
                }
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                if (i10 == -1) {
                    Iterator<CourseDayModel> it = FirebasePersistence.getInstance().getCourseById(b0()).getPlan().iterator();
                    while (it.hasNext()) {
                        CourseDayModel next = it.next();
                        if ((ca.a.k("v1", "v2").contains(g0().getVersion()) && this.f4365z + 1 == next.getPosition()) || (!ca.a.k("v1", "v2").contains(g0().getVersion()) && this.f4365z == next.getPosition())) {
                            next.setCompleted(true);
                            if (next.getPosition() > FirebasePersistence.getInstance().getCourseById(b0()).getCoursePosition()) {
                                FirebasePersistence.getInstance().getCourseById(b0()).setCoursePosition(next.getPosition());
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity = getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                            ((DailyPlanOverview) activity).A = true;
                            P();
                        }
                    }
                    Course courseById = FirebasePersistence.getInstance().getCourseById(b0());
                    kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
                    this.f4363x = courseById;
                    O();
                    if (this.Q) {
                        this.Q = false;
                        bundle.putBoolean("isOnboarding", this.S);
                        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        UtilsKt.fireAnalytics("dashboard_component_finish", bundle);
                    }
                } else if (this.Q) {
                    this.Q = false;
                    bundle.putBoolean("isOnboarding", this.S);
                    UtilsKt.fireAnalytics("dashboard_component_incomplete", bundle);
                }
                if (this.S) {
                    u0(0);
                }
            } else if (i6 == this.W && this.S) {
                if (i10 == -1) {
                    u0(2);
                }
                if (intent != null && intent.getBooleanExtra("tooltipshow", false)) {
                    this.R = false;
                }
            } else if (i6 == this.X && this.S) {
                if (i10 == -1) {
                    h0(3);
                    O();
                }
            } else if (i6 == this.Y && this.S) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
                ((DailyPlanOverview) activity2).n0();
            } else if (i6 == this.Z) {
                if (this.S) {
                    u0(1);
                }
                if (intent != null && (extras = intent.getExtras()) != null) {
                    int intValue = Integer.valueOf(extras.getInt("mood")).intValue();
                    this.f4359d0 = true;
                    t0(intValue);
                }
                O();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(com.theinnerhour.b2b.R.layout.fragment_daily_plan_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.e0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            kotlin.jvm.internal.i.f(currentCourse, "getInstance().user.currentCourse");
            this.f4364y = currentCourse;
            Course courseById = FirebasePersistence.getInstance().getCourseById(b0());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
            this.f4363x = courseById;
            O();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c8, code lost:
        if (r14.getPosition() <= (r19.f4365z + 1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0268, code lost:
        if (r7.getPosition() > r19.f4365z) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026a, code lost:
        ((android.widget.ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBar)).setVisibility(8);
        ((com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(8);
        ((com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setVisibility(8);
        ((com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setVisibility(8);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02be A[Catch: Exception -> 0x02e0, TryCatch #0 {Exception -> 0x02e0, blocks: (B:3:0x0010, B:6:0x0058, B:8:0x006a, B:10:0x010d, B:11:0x0120, B:14:0x013b, B:39:0x01be, B:66:0x026a, B:67:0x029c, B:69:0x02b2, B:75:0x02be, B:77:0x02cc, B:81:0x02d5, B:82:0x02dc, B:38:0x01b5, B:41:0x01ca, B:43:0x01e0, B:64:0x025f, B:63:0x0256, B:7:0x0061, B:44:0x01ee, B:46:0x01f5, B:48:0x0201, B:50:0x020f, B:53:0x021f, B:55:0x022d, B:57:0x023d, B:59:0x024b), top: B:87:0x0010, inners: #1 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        boolean z10;
        CourseDayModel courseDayModel;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverview");
            boolean z11 = ((DailyPlanOverview) activity).B;
            this.S = z11;
            this.R = z11;
            User user = FirebasePersistence.getInstance().getUser();
            kotlin.jvm.internal.i.f(user, "getInstance().user");
            this.f4362w = user;
            String string = requireArguments().getString(Constants.API_COURSE_LINK);
            kotlin.jvm.internal.i.d(string);
            this.A = string;
            if (!ca.a.k("v1", "v2").contains(g0().getVersion())) {
                i6 = requireArguments().getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = requireArguments().getInt(Constants.DAYMODEL_POSITION) - 1;
            }
            this.f4365z = i6;
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            kotlin.jvm.internal.i.f(currentCourse, "getInstance().user.currentCourse");
            this.f4364y = currentCourse;
            Course courseById = FirebasePersistence.getInstance().getCourseById(b0());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
            this.f4363x = courseById;
            n0();
            boolean z12 = false;
            xs.f fVar = new xs.f(0, this.f4358b0.size() - 1);
            c.a aVar = vs.c.f36135u;
            this.B = kotlin.jvm.internal.h.W(aVar, fVar);
            this.C = kotlin.jvm.internal.h.W(aVar, new xs.f(0, this.f4357a0.size() - 1));
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanGoalCardTitle));
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanResourcesCardTitle));
            CourseHeroBannerModel hero_banner = Z().getPlan().get(this.f4365z).getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner);
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setText(hero_banner.getTitle());
            if (this.S) {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanResourcesCardText));
            }
            CourseDayModel courseDayModel2 = null;
            if (ca.a.k("v1", "v2").contains(g0().getVersion())) {
                ArrayList<CourseDayModel> plan = Z().getPlan();
                long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                try {
                    int size = plan.size();
                    courseDayModel = null;
                    for (int i10 = 0; i10 < size; i10++) {
                        try {
                            if (plan.get(i10).getPosition() != 1 && (plan.get(i10).getStart_date() == 0 || plan.get(i10).getStart_date() > todayTimeInSeconds)) {
                                if (i10 > 0 && plan.get(i10).getStart_date() == 0) {
                                    int i11 = i10 - 1;
                                    if (plan.get(i11).getStart_date() != 0) {
                                        if (plan.get(i11).getStart_date() >= todayTimeInSeconds) {
                                        }
                                    }
                                }
                            }
                            courseDayModel = plan.get(i10);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                            kotlin.jvm.internal.i.d(courseDayModel);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    courseDayModel = null;
                }
                kotlin.jvm.internal.i.d(courseDayModel);
            }
            if (!ca.a.k("v1", "v2").contains(g0().getVersion())) {
                ArrayList<CourseDayModel> plan2 = Z().getPlan();
                long todayTimeInSeconds2 = Utils.INSTANCE.getTodayTimeInSeconds();
                try {
                    int size2 = plan2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        if (plan2.get(i12).getPosition() != 1 && (plan2.get(i12).getStart_date() == 0 || plan2.get(i12).getStart_date() > todayTimeInSeconds2)) {
                            if (i12 > 0 && plan2.get(i12).getStart_date() == 0) {
                                int i13 = i12 - 1;
                                if (plan2.get(i13).getStart_date() != 0) {
                                    if (plan2.get(i13).getStart_date() >= todayTimeInSeconds2) {
                                    }
                                }
                            }
                        }
                        courseDayModel2 = plan2.get(i12);
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e12);
                }
                kotlin.jvm.internal.i.d(courseDayModel2);
            }
            p0(this.S);
            j0();
            ArrayList<UserMood> userMoodList = FirebasePersistence.getInstance().getUser().getUserMoodList();
            if (userMoodList != null && !userMoodList.isEmpty()) {
                z10 = false;
                if (z10) {
                    ArrayList<UserMood> userMoodListV1 = FirebasePersistence.getInstance().getUser().getUserMoodListV1();
                    if ((userMoodListV1 == null || userMoodListV1.isEmpty()) ? true : true) {
                        this.T = true;
                        this.N = true;
                        q0();
                    }
                }
                Y();
            }
            z10 = true;
            if (z10) {
            }
            Y();
        } catch (Exception e13) {
            LogHelper.INSTANCE.e(this.f4360u, e13);
        }
    }

    public final void p0(boolean z10) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ProgressBar progressBar;
        String str;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerCardContainer);
            int i23 = 8;
            int i24 = 0;
            if (z10) {
                i6 = 8;
            } else {
                i6 = 0;
            }
            constraintLayout.setVisibility(i6);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfo);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            robertoTextView.setVisibility(i10);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoGoals);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robertoTextView2.setVisibility(i11);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoTracker);
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            robertoTextView3.setVisibility(i12);
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoInnerResources);
            if (z10) {
                i23 = 0;
            }
            robertoTextView4.setVisibility(i23);
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.header_arrow_back);
            if (z10) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            appCompatImageView.setVisibility(i13);
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.title);
            if (z10) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            robertoTextView5.setVisibility(i14);
            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc);
            if (z10) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            robertoTextView6.setVisibility(i15);
            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle);
            if (z10) {
                i16 = 4;
            } else {
                i16 = 0;
            }
            robertoTextView7.setVisibility(i16);
            RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent);
            if (z10) {
                i17 = 4;
            } else {
                i17 = 0;
            }
            robertoTextView8.setVisibility(i17);
            ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBar);
            if (z10) {
                i18 = 4;
            } else {
                i18 = 0;
            }
            progressBar2.setVisibility(i18);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanDetailTopImage);
            if (z10) {
                i19 = 4;
            } else {
                i19 = 0;
            }
            appCompatImageView2.setVisibility(i19);
            RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.titleTutorial);
            if (z10) {
                i20 = 0;
            } else {
                i20 = 4;
            }
            robertoTextView9.setVisibility(i20);
            ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBarTutorial);
            if (z10) {
                i21 = 0;
            } else {
                i21 = 4;
            }
            progressBar3.setVisibility(i21);
            RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.descTutorial);
            if (z10) {
                i22 = 0;
            } else {
                i22 = 4;
            }
            robertoTextView10.setVisibility(i22);
            View _$_findCachedViewById = _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanDetailTopSeparator);
            if (!z10) {
                i24 = 4;
            }
            _$_findCachedViewById.setVisibility(i24);
            if (z10) {
                progressBar = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBarTutorial);
                str = "dailyTaskProgressBarTutorial";
            } else {
                progressBar = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBar);
                str = "dailyTaskProgressBar";
            }
            kotlin.jvm.internal.i.f(progressBar, str);
            this.V = progressBar;
            if (z10) {
                J();
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.main_content)).setBackgroundColor(g0.a.b(requireContext(), com.theinnerhour.b2b.R.color.white));
                ((ScrollView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.scrollview)).setBackground(new ColorDrawable(g0.a.b(requireContext(), com.theinnerhour.b2b.R.color.white)));
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.f((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.main_content));
                bVar.h(com.theinnerhour.b2b.R.id.scrollview, 3, com.theinnerhour.b2b.R.id.dailyPlanDetailTopSeparator, 4);
                bVar.b((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.main_content));
                return;
            }
            ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.main_content)).setBackgroundColor(g0.a.b(requireContext(), com.theinnerhour.b2b.R.color.sea));
            ((ScrollView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.scrollview)).setBackground(a.c.b(requireContext(), com.theinnerhour.b2b.R.drawable.backround_curved_top_colorbrown));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4360u, e10);
        }
    }

    public final void q0() {
        View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.layout_multi_tracker_card, (ViewGroup) ((FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.containerFrame)), false);
        ((FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.containerFrame)).addView(inflate);
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodOne)).setOnClickListener(new bl.a(this, 5));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodTwo)).setOnClickListener(new bl.a(this, 6));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodThree)).setOnClickListener(new bl.a(this, 7));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodFour)).setOnClickListener(new bl.a(this, 8));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodFive)).setOnClickListener(new bl.a(this, 9));
    }

    public final void r0(String str) {
        if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        Utils utils = Utils.INSTANCE;
        if ((timeUnit.convert(utils.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS) > 1 || ApplicationPersistence.getInstance().getBooleanValue("app_feedback_day_three", false)) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis() && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
            ApplicationPersistence.getInstance().setBooleanValue(str, false);
            ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false);
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
            ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", false);
            NpsPersistence.INSTANCE.updateNpsSlot(true);
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_feedback_activity_finish, requireActivity(), com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndShrinkOut;
            Glide.i(requireActivity()).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.template_background)).B((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.backgroundImage));
            ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_yes)).setOnClickListener(new d(this, styledDialog));
            ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_no)).setOnClickListener(new d(styledDialog, this));
            Window window2 = styledDialog.getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -1);
            }
            styledDialog.setOnCancelListener(new dk.j(1));
            styledDialog.setOnDismissListener(new dk.k(1));
            styledDialog.show();
            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
            analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
            gk.a.b(analyticsBundle, "feedback_daily_task_playstore_show");
        }
    }

    public final void s0(ViewGroup viewGroup) {
        new Handler().postDelayed(new ne.u(this, 17, viewGroup), 800L);
    }

    public final void t0(int i6) {
        int i10;
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_tracker_check, requireContext(), com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.trackerCheckAnimation);
        CardView cardView = (CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.trackerCardCheck);
        if (Build.VERSION.SDK_INT < 25) {
            if (lottieAnimationView != null) {
                lottieAnimationView.setRenderMode(t.SOFTWARE);
            }
        } else if (lottieAnimationView != null) {
            lottieAnimationView.setRenderMode(t.HARDWARE);
        }
        Context requireContext = requireContext();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            i10 = com.theinnerhour.b2b.R.color.trackerYellow;
                        }
                    } else {
                        i10 = com.theinnerhour.b2b.R.color.trackerBlue;
                    }
                } else {
                    i10 = com.theinnerhour.b2b.R.color.trackerPink;
                }
            } else {
                i10 = com.theinnerhour.b2b.R.color.trackerPurple;
            }
            cardView.setCardBackgroundColor(g0.a.b(requireContext, i10));
            lottieAnimationView.c(new a(styledDialog, lottieAnimationView));
            styledDialog.setCancelable(false);
            styledDialog.show();
            lottieAnimationView.h();
        }
        i10 = com.theinnerhour.b2b.R.color.trackerGrey;
        cardView.setCardBackgroundColor(g0.a.b(requireContext, i10));
        lottieAnimationView.c(new a(styledDialog, lottieAnimationView));
        styledDialog.setCancelable(false);
        styledDialog.show();
        lottieAnimationView.h();
    }

    public final void u0(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    X();
                    if (this.J) {
                        h0(2);
                    }
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoGoals)).setVisibility(8);
                    ConstraintLayout innerResourcesCardContainer = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCardContainer);
                    kotlin.jvm.internal.i.f(innerResourcesCardContainer, "innerResourcesCardContainer");
                    K(innerResourcesCardContainer);
                    return;
                }
                return;
            }
            h0(1);
            ConstraintLayout goalCardContainer = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer);
            kotlin.jvm.internal.i.f(goalCardContainer, "goalCardContainer");
            K(goalCardContainer);
            return;
        }
        if (Z().getPlan().get(this.f4365z).isCompleted()) {
            h0(0);
        }
        ConstraintLayout trackerCardContainer = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerCardContainer);
        kotlin.jvm.internal.i.f(trackerCardContainer, "trackerCardContainer");
        K(trackerCardContainer);
        if (this.L) {
            u0(1);
        }
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfo)).setVisibility(8);
    }
}

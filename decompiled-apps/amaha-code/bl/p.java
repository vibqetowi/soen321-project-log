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
import android.os.CountDownTimer;
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
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.activity.DailyPlanOverviewV3;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserMood;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import lg.f;
import ne.u;
import vs.c;
/* compiled from: DailyPlanDetailFragmentV3.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl/p;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f4381k0 = 0;
    public String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public ym.c O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ProgressBar U;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f4384d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f4385f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4386g0;

    /* renamed from: h0  reason: collision with root package name */
    public cl.a f4387h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4388i0;

    /* renamed from: w  reason: collision with root package name */
    public User f4392w;

    /* renamed from: x  reason: collision with root package name */
    public Course f4393x;

    /* renamed from: y  reason: collision with root package name */
    public String f4394y;

    /* renamed from: z  reason: collision with root package name */
    public int f4395z;

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashMap f4389j0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4390u = LogHelper.INSTANCE.makeLogTag(p.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<LearningHubModel> f4391v = new ArrayList<>();
    public final int F = 789;
    public int G = 50;
    public final int V = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    public final int W = 234;
    public final int X = 345;
    public final int Y = 3654;
    public final ArrayList<String> Z = new ArrayList<>();

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<String> f4382a0 = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public final HashMap<Integer, UserMood> f4383b0 = new HashMap<>();

    /* compiled from: DailyPlanDetailFragmentV3.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<ArrayList<CourseDayDomainModelV1>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<CourseDayDomainModelV1> arrayList) {
            ArrayList<CourseDayDomainModelV1> arrayList2 = arrayList;
            p pVar = p.this;
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    pVar.T = true;
                }
            } else {
                Toast.makeText(pVar.requireActivity(), "Error!", 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: DailyPlanDetailFragmentV3.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends Boolean>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends Boolean> fVar) {
            hs.f<? extends Boolean, ? extends Boolean> fVar2 = fVar;
            if (fVar2 != null) {
                boolean booleanValue = ((Boolean) fVar2.f19464u).booleanValue();
                p pVar = p.this;
                pVar.I = booleanValue;
                pVar.L = ((Boolean) fVar2.f19465v).booleanValue();
                pVar.O();
                if (pVar.f4388i0) {
                    if (pVar.I) {
                        pVar.c0(2);
                    }
                    ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfoGoals)).setVisibility(8);
                    ConstraintLayout innerResourcesCardContainer = (ConstraintLayout) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCardContainer);
                    kotlin.jvm.internal.i.f(innerResourcesCardContainer, "innerResourcesCardContainer");
                    pVar.K(innerResourcesCardContainer);
                    pVar.f4388i0 = false;
                }
                try {
                    if (pVar.L) {
                        if (!pVar.R) {
                            ((ConstraintLayout) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer)).setVisibility(0);
                        }
                        if (pVar.I) {
                            ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.goal_title)).setTextColor(pVar.requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                            ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setTextColor(pVar.requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                        } else {
                            ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.goal_title)).setTextColor(pVar.requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                            ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setTextColor(pVar.requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
                        }
                        ((RobertoTextView) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setText(pVar.getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanGoalCardTitle));
                    } else if (!pVar.R) {
                        ((ConstraintLayout) pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer)).setVisibility(0);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(pVar.f4390u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: DailyPlanDetailFragmentV3.kt */
    /* loaded from: classes2.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f4400a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f4401b;

        public e(Dialog dialog, LottieAnimationView lottieAnimationView) {
            this.f4400a = dialog;
            this.f4401b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f4400a.dismiss();
            this.f4401b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f4400a.dismiss();
            this.f4401b.i();
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

    public p() {
        boolean z10;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.IH_RESOURCES_EXPERIMENT), Boolean.TRUE);
        } else {
            z10 = false;
        }
        this.f4385f0 = z10;
    }

    public final void J() {
        try {
            ((Space) _$_findCachedViewById(com.theinnerhour.b2b.R.id.separatorViewTop)).setVisibility(0);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((Space) _$_findCachedViewById(com.theinnerhour.b2b.R.id.separatorViewTop)).getLayoutParams().height = (int) (displayMetrics.heightPixels * 0.2d);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void K(ConstraintLayout constraintLayout) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new m(constraintLayout));
        new n(this, constraintLayout).start();
        constraintLayout.setVisibility(4);
        new Handler().postDelayed(new bl.b(constraintLayout, alphaAnimation, 1), 1200L);
    }

    public final void M(AppCompatImageView appCompatImageView) {
        Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), com.theinnerhour.b2b.R.anim.fade_in);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(requireContext(), com.theinnerhour.b2b.R.anim.fade_out);
        appCompatImageView.startAnimation(loadAnimation2);
        loadAnimation2.setAnimationListener(new o(appCompatImageView, loadAnimation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
        if (r4 != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b7 A[Catch: Exception -> 0x03dc, TryCatch #0 {Exception -> 0x03dc, blocks: (B:3:0x000a, B:5:0x0021, B:7:0x0027, B:11:0x0079, B:13:0x008f, B:15:0x0098, B:16:0x00ba, B:18:0x00c8, B:19:0x00cf, B:21:0x00d5, B:22:0x00eb, B:24:0x00f1, B:29:0x010b, B:32:0x011c, B:37:0x0130, B:39:0x014b, B:41:0x0154, B:42:0x0173, B:43:0x0177, B:44:0x0189, B:46:0x0193, B:48:0x0197, B:50:0x01a0, B:62:0x01fa, B:65:0x0204, B:67:0x020f, B:69:0x0218, B:72:0x021d, B:74:0x0221, B:80:0x0254, B:86:0x028e, B:88:0x02d0, B:90:0x02d4, B:95:0x033f, B:97:0x0350, B:101:0x035a, B:109:0x03c8, B:111:0x03cc, B:102:0x0375, B:104:0x037f, B:106:0x0398, B:105:0x0387, B:107:0x039c, B:108:0x03b7, B:91:0x02de, B:93:0x0334, B:75:0x0227, B:76:0x022a, B:77:0x022b, B:79:0x022f, B:112:0x03d0, B:113:0x03d3, B:114:0x03d4, B:115:0x03d7, B:116:0x03d8, B:117:0x03db, B:55:0x01b3, B:57:0x01c2, B:58:0x01ce, B:60:0x01db, B:61:0x01f8, B:8:0x0044, B:10:0x0048), top: B:121:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cc A[Catch: Exception -> 0x03dc, TryCatch #0 {Exception -> 0x03dc, blocks: (B:3:0x000a, B:5:0x0021, B:7:0x0027, B:11:0x0079, B:13:0x008f, B:15:0x0098, B:16:0x00ba, B:18:0x00c8, B:19:0x00cf, B:21:0x00d5, B:22:0x00eb, B:24:0x00f1, B:29:0x010b, B:32:0x011c, B:37:0x0130, B:39:0x014b, B:41:0x0154, B:42:0x0173, B:43:0x0177, B:44:0x0189, B:46:0x0193, B:48:0x0197, B:50:0x01a0, B:62:0x01fa, B:65:0x0204, B:67:0x020f, B:69:0x0218, B:72:0x021d, B:74:0x0221, B:80:0x0254, B:86:0x028e, B:88:0x02d0, B:90:0x02d4, B:95:0x033f, B:97:0x0350, B:101:0x035a, B:109:0x03c8, B:111:0x03cc, B:102:0x0375, B:104:0x037f, B:106:0x0398, B:105:0x0387, B:107:0x039c, B:108:0x03b7, B:91:0x02de, B:93:0x0334, B:75:0x0227, B:76:0x022a, B:77:0x022b, B:79:0x022f, B:112:0x03d0, B:113:0x03d3, B:114:0x03d4, B:115:0x03d7, B:116:0x03d8, B:117:0x03db, B:55:0x01b3, B:57:0x01c2, B:58:0x01ce, B:60:0x01db, B:61:0x01f8, B:8:0x0044, B:10:0x0048), top: B:121:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028e A[Catch: Exception -> 0x03dc, TryCatch #0 {Exception -> 0x03dc, blocks: (B:3:0x000a, B:5:0x0021, B:7:0x0027, B:11:0x0079, B:13:0x008f, B:15:0x0098, B:16:0x00ba, B:18:0x00c8, B:19:0x00cf, B:21:0x00d5, B:22:0x00eb, B:24:0x00f1, B:29:0x010b, B:32:0x011c, B:37:0x0130, B:39:0x014b, B:41:0x0154, B:42:0x0173, B:43:0x0177, B:44:0x0189, B:46:0x0193, B:48:0x0197, B:50:0x01a0, B:62:0x01fa, B:65:0x0204, B:67:0x020f, B:69:0x0218, B:72:0x021d, B:74:0x0221, B:80:0x0254, B:86:0x028e, B:88:0x02d0, B:90:0x02d4, B:95:0x033f, B:97:0x0350, B:101:0x035a, B:109:0x03c8, B:111:0x03cc, B:102:0x0375, B:104:0x037f, B:106:0x0398, B:105:0x0387, B:107:0x039c, B:108:0x03b7, B:91:0x02de, B:93:0x0334, B:75:0x0227, B:76:0x022a, B:77:0x022b, B:79:0x022f, B:112:0x03d0, B:113:0x03d3, B:114:0x03d4, B:115:0x03d7, B:116:0x03d8, B:117:0x03db, B:55:0x01b3, B:57:0x01c2, B:58:0x01ce, B:60:0x01db, B:61:0x01f8, B:8:0x0044, B:10:0x0048), top: B:121:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02de A[Catch: Exception -> 0x03dc, TryCatch #0 {Exception -> 0x03dc, blocks: (B:3:0x000a, B:5:0x0021, B:7:0x0027, B:11:0x0079, B:13:0x008f, B:15:0x0098, B:16:0x00ba, B:18:0x00c8, B:19:0x00cf, B:21:0x00d5, B:22:0x00eb, B:24:0x00f1, B:29:0x010b, B:32:0x011c, B:37:0x0130, B:39:0x014b, B:41:0x0154, B:42:0x0173, B:43:0x0177, B:44:0x0189, B:46:0x0193, B:48:0x0197, B:50:0x01a0, B:62:0x01fa, B:65:0x0204, B:67:0x020f, B:69:0x0218, B:72:0x021d, B:74:0x0221, B:80:0x0254, B:86:0x028e, B:88:0x02d0, B:90:0x02d4, B:95:0x033f, B:97:0x0350, B:101:0x035a, B:109:0x03c8, B:111:0x03cc, B:102:0x0375, B:104:0x037f, B:106:0x0398, B:105:0x0387, B:107:0x039c, B:108:0x03b7, B:91:0x02de, B:93:0x0334, B:75:0x0227, B:76:0x022a, B:77:0x022b, B:79:0x022f, B:112:0x03d0, B:113:0x03d3, B:114:0x03d4, B:115:0x03d7, B:116:0x03d8, B:117:0x03db, B:55:0x01b3, B:57:0x01c2, B:58:0x01ce, B:60:0x01db, B:61:0x01f8, B:8:0x0044, B:10:0x0048), top: B:121:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0350 A[Catch: Exception -> 0x03dc, TryCatch #0 {Exception -> 0x03dc, blocks: (B:3:0x000a, B:5:0x0021, B:7:0x0027, B:11:0x0079, B:13:0x008f, B:15:0x0098, B:16:0x00ba, B:18:0x00c8, B:19:0x00cf, B:21:0x00d5, B:22:0x00eb, B:24:0x00f1, B:29:0x010b, B:32:0x011c, B:37:0x0130, B:39:0x014b, B:41:0x0154, B:42:0x0173, B:43:0x0177, B:44:0x0189, B:46:0x0193, B:48:0x0197, B:50:0x01a0, B:62:0x01fa, B:65:0x0204, B:67:0x020f, B:69:0x0218, B:72:0x021d, B:74:0x0221, B:80:0x0254, B:86:0x028e, B:88:0x02d0, B:90:0x02d4, B:95:0x033f, B:97:0x0350, B:101:0x035a, B:109:0x03c8, B:111:0x03cc, B:102:0x0375, B:104:0x037f, B:106:0x0398, B:105:0x0387, B:107:0x039c, B:108:0x03b7, B:91:0x02de, B:93:0x0334, B:75:0x0227, B:76:0x022a, B:77:0x022b, B:79:0x022f, B:112:0x03d0, B:113:0x03d3, B:114:0x03d4, B:115:0x03d7, B:116:0x03d8, B:117:0x03db, B:55:0x01b3, B:57:0x01c2, B:58:0x01ce, B:60:0x01db, B:61:0x01f8, B:8:0x0044, B:10:0x0048), top: B:121:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        float f;
        String str;
        String F0;
        boolean z10;
        boolean z11;
        try {
            this.G = 75;
            this.D = 0;
            if (this.I) {
                this.D = 25;
                if (!this.R) {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                    Context requireContext = requireContext();
                    Object obj = g0.a.f16164a;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                }
            } else if (!this.R) {
                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_chevron_right);
                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext2)).setColorFilter(Color.argb(255, 255, 255, 255));
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext2, com.theinnerhour.b2b.R.drawable.grey_rounded_corners_blue_stroke));
            }
            if (a0().getPlanV3().get(this.f4395z).isCompleted()) {
                this.D += 25;
                if (!this.R) {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                    Context requireContext3 = requireContext();
                    Object obj3 = g0.a.f16164a;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setBackground(a.c.b(requireContext3, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                }
            }
            this.E = 0;
            boolean z12 = true;
            if (!this.f4391v.isEmpty()) {
                Iterator<LearningHubModel> it = this.f4391v.iterator();
                boolean z13 = false;
                while (it.hasNext()) {
                    LearningHubModel next = it.next();
                    Iterator<PostsRead> it2 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (kotlin.jvm.internal.i.b(it2.next().getPostId(), next.getId())) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (next.getDay() == ((int) a0().getCourseOpenDay())) {
                        if (!z11) {
                            this.E++;
                        }
                        z13 = true;
                    }
                }
                if (z13) {
                    this.G += 25;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setVisibility(0);
                    if (this.E == 0) {
                        this.D += 25;
                        if (!this.R) {
                            ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.arrowNext3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_round_check);
                            Context requireContext4 = requireContext();
                            Object obj4 = g0.a.f16164a;
                            ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setBackground(a.c.b(requireContext4, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                        }
                    }
                    U();
                } else {
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setVisibility(8);
                }
            }
            if (this.c0) {
                if (!this.f4386g0) {
                    wn.b.f36765a.getClass();
                    MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = wn.b.f36767c;
                    if (multiTrackerFirestoreStatsModel != null && multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                this.D += 25;
                this.K = true;
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleTracker);
                if (robertoTextView != null) {
                    robertoTextView.setTextColor(g0.a.b(requireContext(), com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                }
            } else if (this.f4383b0.containsKey(7)) {
                this.D += 25;
                this.K = true;
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleTracker)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
            } else {
                this.K = false;
            }
            S();
            ProgressBar progressBar = this.U;
            if (progressBar != null) {
                progressBar.setMax(this.G * 10);
                ProgressBar progressBar2 = this.U;
                if (progressBar2 != null) {
                    progressBar2.setProgress(this.D);
                    if (!this.M && !this.c0) {
                        ProgressBar progressBar3 = this.U;
                        if (progressBar3 != null) {
                            progressBar3.setProgress(this.D);
                            int i6 = this.D;
                            this.N = i6;
                            f = (i6 / this.G) * 100.0f;
                            StringBuilder sb2 = new StringBuilder();
                            int i10 = (int) f;
                            sb2.append(i10);
                            sb2.append("% completed");
                            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(sb2.toString());
                            if (f == 100.0f) {
                                z12 = false;
                            }
                            if (!z12) {
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(8);
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setVisibility(8);
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setText(this.f4382a0.get(this.B));
                                Integer dayPlanPositionForDateV3 = CourseUtilKt.getDayPlanPositionForDateV3(a0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                                kotlin.jvm.internal.i.d(dayPlanPositionForDateV3);
                                if (dayPlanPositionForDateV3.intValue() <= this.f4395z && !this.R) {
                                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tick)).setVisibility(0);
                                }
                            } else {
                                ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tick)).setVisibility(8);
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setText(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.your_todays_plan_progress_title));
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(i10 + "% completed");
                                Integer dayPlanPositionForDateV32 = CourseUtilKt.getDayPlanPositionForDateV3(a0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                                kotlin.jvm.internal.i.d(dayPlanPositionForDateV32);
                                if (dayPlanPositionForDateV32.intValue() < this.f4395z) {
                                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(0);
                                }
                            }
                            ArrayList<String> arrayList = this.Z;
                            str = arrayList.get(this.C);
                            kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                            if (!r.J0(str, "5")) {
                                int i11 = this.G;
                                if (i11 != 75) {
                                    if (i11 != 100) {
                                        String str2 = arrayList.get(this.C);
                                        kotlin.jvm.internal.i.f(str2, "welcomeList[welcomeMsgMsgIndex]");
                                        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(gv.n.F0(str2, "5", "2"));
                                    } else {
                                        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc);
                                        if (this.R) {
                                            F0 = getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanAllDone);
                                        } else {
                                            String str3 = arrayList.get(this.C);
                                            kotlin.jvm.internal.i.f(str3, "welcomeList[welcomeMsgMsgIndex]");
                                            F0 = gv.n.F0(str3, "5", "4");
                                        }
                                        robertoTextView2.setText(F0);
                                    }
                                } else {
                                    String str4 = arrayList.get(this.C);
                                    kotlin.jvm.internal.i.f(str4, "welcomeList[welcomeMsgMsgIndex]");
                                    ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(gv.n.F0(str4, "5", "3"));
                                }
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setText(arrayList.get(this.C));
                            }
                            if (this.R) {
                                m0();
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.i.q("progressBar");
                        throw null;
                    }
                    ProgressBar progressBar4 = this.U;
                    if (progressBar4 != null) {
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar4, Constants.SCREEN_PROGRESS, this.N * 10, this.D * 10);
                        ofInt.setDuration(500L);
                        ofInt.setInterpolator(new LinearInterpolator());
                        ofInt.start();
                        int i62 = this.D;
                        this.N = i62;
                        f = (i62 / this.G) * 100.0f;
                        StringBuilder sb22 = new StringBuilder();
                        int i102 = (int) f;
                        sb22.append(i102);
                        sb22.append("% completed");
                        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setText(sb22.toString());
                        if (f == 100.0f) {
                        }
                        if (!z12) {
                        }
                        ArrayList<String> arrayList2 = this.Z;
                        str = arrayList2.get(this.C);
                        kotlin.jvm.internal.i.f(str, "welcomeList[welcomeMsgMsgIndex]");
                        if (!r.J0(str, "5")) {
                        }
                        if (this.R) {
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void P() {
        Z();
        if (a0().getPlanV3().size() == 0 || ((a0().getPlanV3().size() == 15 && a0().getPlanV3().get(14).getStart_date() != 0) || ((a0().getPlanV3().size() == 30 && a0().getPlanV3().get(29).getStart_date() != 0) || (a0().getPlanV3().size() == 45 && a0().getPlanV3().get(44).getStart_date() != 0)))) {
            a aVar = new a();
            CourseApiUtil courseApiUtil = new CourseApiUtil();
            courseApiUtil.setCourseApiListener(aVar);
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
            CourseApiUtil.addAssessment$default(courseApiUtil, currentCourseName, null, 2, null);
        }
    }

    public final void Q() {
        boolean z10;
        boolean z11;
        try {
            CourseDayModelV1 dayPlanForDateV3 = CourseUtilKt.getDayPlanForDateV3(a0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
            if (dayPlanForDateV3 != null && dayPlanForDateV3.getPosition() > 1 && dayPlanForDateV3.getStart_date() != 0) {
                int i6 = 7;
                if (dayPlanForDateV3.getPosition() < 7) {
                    i6 = 2;
                } else {
                    int position = dayPlanForDateV3.getPosition();
                    if (7 <= position && position < 21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int position2 = dayPlanForDateV3.getPosition();
                        if (21 <= position2 && position2 < 30) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i6 = 20;
                        } else if (b0() >= 29) {
                            i6 = 29;
                        } else {
                            i6 = 0;
                        }
                    }
                }
                if (i6 != 0) {
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    if (applicationPersistence.getBooleanValue("check_day_" + i6, true)) {
                        if (i6 == 2) {
                            ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", true);
                        }
                        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                        applicationPersistence2.setStringValue(Constants.APP_FEEDBACK_TRIGGER, "course_day_" + i6);
                        q0("check_day_" + i6);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, "exception in check show app feed back", e10);
        }
    }

    public final void S() {
        try {
            boolean z10 = false;
            if (!this.R) {
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCardContainer)).setVisibility(0);
            }
            if (a0().getPlanV3().get(this.f4395z).isCompleted()) {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleDailyPlan)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                z10 = true;
            } else {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleDailyPlan)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
            }
            this.J = z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void U() {
        try {
            boolean z10 = false;
            if (!this.R) {
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCardContainer)).setVisibility(0);
            }
            if (this.E == 0) {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast_35_opacity));
                z10 = true;
            } else {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.title_high_contrast));
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setTextColor(requireActivity().getResources().getColor(com.theinnerhour.b2b.R.color.grey_high_contrast));
            }
            this.H = z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void X() {
        ok.b bVar = (ok.b) new o0(this, new ok.c(new s5(11))).a(ok.b.class);
        if (bVar != null) {
            bVar.f27590y.e(requireActivity(), new dk.a(13, new b()));
            bVar.e();
            return;
        }
        kotlin.jvm.internal.i.q("bookmarkingViewModel");
        throw null;
    }

    public final void Y() {
        ym.c cVar = (ym.c) new o0(this, new kk.c(a0())).a(ym.c.class);
        this.O = cVar;
        if (cVar != null) {
            cVar.f();
            ym.c cVar2 = this.O;
            if (cVar2 != null) {
                cVar2.f38687y.e(getViewLifecycleOwner(), new bl.c(1, this));
                return;
            } else {
                kotlin.jvm.internal.i.q("learningHubViewModel");
                throw null;
            }
        }
        kotlin.jvm.internal.i.q("learningHubViewModel");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:2:0x0000, B:4:0x0004, B:10:0x0010, B:12:0x001b, B:13:0x001e, B:15:0x0039, B:16:0x0045, B:17:0x004b), top: B:21:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:2:0x0000, B:4:0x0004, B:10:0x0010, B:12:0x001b, B:13:0x001e, B:15:0x0039, B:16:0x0045, B:17:0x004b), top: B:21:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean z10;
        try {
            String str = this.f4384d0;
            if (str != null && str.length() != 0) {
                z10 = false;
                if (z10) {
                    String str2 = this.f4384d0;
                    kotlin.jvm.internal.i.d(str2);
                    Course course = CourseUtilKt.getCourse(str2);
                    if (course != null) {
                        this.f4393x = course;
                        return;
                    }
                    return;
                }
                String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
                kotlin.jvm.internal.i.f(currentCourse, "getInstance().user.currentCourse");
                this.f4394y = currentCourse;
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                String str3 = this.f4394y;
                if (str3 != null) {
                    Course courseById = firebasePersistence.getCourseById(str3);
                    kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
                    this.f4393x = courseById;
                    return;
                }
                kotlin.jvm.internal.i.q("currentCourse");
                throw null;
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f4389j0;
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

    public final Course a0() {
        Course course = this.f4393x;
        if (course != null) {
            return course;
        }
        kotlin.jvm.internal.i.q("course");
        throw null;
    }

    public final long b0() {
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
            LogHelper.INSTANCE.e(this.f4390u, "exception in get course elapse days", e10);
            return 0L;
        }
    }

    public final void c0(int i6) {
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
                        new Handler().postDelayed(new j(this, 0), 500L);
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

    public final void g0() {
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.header_arrow_back)).setOnClickListener(new l(this, 5));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setOnClickListener(new l(this, 6));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setOnClickListener(new l(this, 7));
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkUnsaved)).setOnClickListener(DebouncedOnClickListener.wrap(new l(this, 8)));
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkSaved)).setOnClickListener(DebouncedOnClickListener.wrap(new l(this, 9)));
        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setOnClickListener(new l(this, 10));
        ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.addGoalsButtonMain)).setOnClickListener(new l(this, 11));
    }

    public final void h0(int i6) {
        Intent intent = new Intent(getActivity(), MultiTrackerActivity.class);
        intent.putExtra("mood", i6);
        intent.putExtra("tutorial", this.R);
        startActivityForResult(intent, this.Y);
        Bundle bundle = new Bundle();
        bundle.putInt("mood", i6);
        defpackage.e.s(bundle, "course", "source", "plan");
        gk.a.b(bundle, "new_tracker_mood_click");
    }

    public final void j0(Bundle bundle, String str) {
        try {
            CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
            Iterator<CourseDayModelV1> it = a0().getPlanV3().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CourseDayModelV1 next = it.next();
                if (kotlin.jvm.internal.i.b(next.getContent_id(), str)) {
                    courseDayModelV1 = next;
                    break;
                }
            }
            f.b bVar = MyApplication.V.a().d().f;
            StringBuilder sb2 = new StringBuilder();
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
            sb2.append(gv.n.y0(currentCourseName));
            sb2.append(" Plan Day");
            bVar.f(Integer.valueOf(courseDayModelV1.getPosition()), sb2.toString());
            Intent intent = new Intent(getActivity(), TemplateActivity.class);
            intent.putExtra("day_plan", courseDayModelV1);
            intent.putExtra("type", "daily");
            intent.putExtra("goalSource", "daily_plan");
            LogHelper.INSTANCE.i(this.f4390u, "intent is not null");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra(Constants.API_COURSE_LINK, str);
            this.P = true;
            startActivityForResult(intent, this.F);
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", a0().getCourseName());
            bundle2.putString(Constants.API_COURSE_LINK, str);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                bundle2.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
            }
            bundle2.putBoolean("isOnboarding", this.R);
            bundle2.putBoolean("isNewActivities", false);
            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle2.putInt(Constants.DAYMODEL_POSITION, courseDayModelV1.getPosition());
            bundle2.putBoolean("bookmark_status", courseDayModelV1.isFavorite());
            bundle2.putBoolean("today_activity", this.e0);
            UtilsKt.fireAnalytics("dashboard_component_start", bundle2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void k0() {
        boolean z10;
        try {
            User user = this.f4392w;
            if (user != null) {
                String firstName = user.getFirstName();
                if (firstName != null && firstName.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ArrayList<String> arrayList = this.Z;
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder("Hi ");
                    User user2 = this.f4392w;
                    if (user2 != null) {
                        sb2.append(user2.getFirstName());
                        sb2.append(", here's what's in store for you today");
                        arrayList.add(sb2.toString());
                    } else {
                        kotlin.jvm.internal.i.q("user");
                        throw null;
                    }
                }
                String courseName = a0().getCourseName();
                if (courseName != null) {
                    switch (courseName.hashCode()) {
                        case -2114782937:
                            if (!courseName.equals(Constants.COURSE_HAPPINESS)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_happiness));
                                break;
                            }
                        case -1617042330:
                            if (!courseName.equals(Constants.COURSE_DEPRESSION)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_depression));
                                break;
                            }
                        case -891989580:
                            if (!courseName.equals(Constants.COURSE_STRESS)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_stress));
                                break;
                            }
                        case 92960775:
                            if (!courseName.equals(Constants.COURSE_ANGER)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_anger));
                                break;
                            }
                        case 109522647:
                            if (!courseName.equals(Constants.COURSE_SLEEP)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_sleep));
                                break;
                            }
                        case 113319009:
                            if (!courseName.equals(Constants.COURSE_WORRY)) {
                                break;
                            } else {
                                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_anxiety));
                                break;
                            }
                    }
                }
                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_1));
                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_2));
                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_3));
                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_4));
                arrayList.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.welcome_msg_5));
                ArrayList<String> arrayList2 = this.f4382a0;
                arrayList2.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_1));
                arrayList2.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_2));
                arrayList2.add(requireActivity().getResources().getString(com.theinnerhour.b2b.R.string.reward_msg_3));
                return;
            }
            kotlin.jvm.internal.i.q("user");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x002f, B:9:0x0035, B:12:0x003e, B:13:0x004b, B:15:0x004f, B:17:0x005c, B:19:0x0063, B:21:0x0067, B:26:0x00a0, B:28:0x00a7, B:30:0x00bd, B:23:0x007d, B:24:0x008c, B:5:0x0020), top: B:35:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        boolean z10;
        try {
            boolean z11 = true;
            if (this.J) {
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard)).setBackground(a.c.b(requireContext, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                z10 = false;
            } else {
                ConstraintLayout dailyPlanCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyPlanCard);
                kotlin.jvm.internal.i.f(dailyPlanCard, "dailyPlanCard");
                r0(dailyPlanCard);
                z10 = true;
            }
            if (!this.K && !z10) {
                if (this.c0) {
                    FrameLayout trackerRippleBg = (FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerRippleBg);
                    kotlin.jvm.internal.i.f(trackerRippleBg, "trackerRippleBg");
                    r0(trackerRippleBg);
                } else if (this.M) {
                    FrameLayout trackerRippleBg2 = (FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerRippleBg);
                    kotlin.jvm.internal.i.f(trackerRippleBg2, "trackerRippleBg");
                    r0(trackerRippleBg2);
                }
                z10 = true;
            }
            if (this.L) {
                if (this.I) {
                    Context requireContext2 = requireContext();
                    Object obj2 = g0.a.f16164a;
                    ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext2, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                } else if (!z10) {
                    ConstraintLayout goalCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard);
                    kotlin.jvm.internal.i.f(goalCard, "goalCard");
                    r0(goalCard);
                    if (!this.H) {
                        Context requireContext3 = requireContext();
                        Object obj3 = g0.a.f16164a;
                        ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard)).setBackground(a.c.b(requireContext3, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
                        return;
                    } else if (!z11) {
                        ConstraintLayout innerResourcesCard = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.innerResourcesCard);
                        kotlin.jvm.internal.i.f(innerResourcesCard, "innerResourcesCard");
                        r0(innerResourcesCard);
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                Context requireContext4 = requireContext();
                Object obj4 = g0.a.f16164a;
                ((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCard)).setBackground(a.c.b(requireContext4, com.theinnerhour.b2b.R.drawable.grey_background_rounded_corners));
            }
            z11 = z10;
            if (!this.H) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void n0(boolean z10) {
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
        int i23;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerCardContainer);
            int i24 = 8;
            int i25 = 0;
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
                i24 = 0;
            }
            robertoTextView4.setVisibility(i24);
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
                i25 = 4;
            }
            _$_findCachedViewById.setVisibility(i25);
            if (z10) {
                progressBar = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBarTutorial);
                str = "dailyTaskProgressBarTutorial";
            } else {
                progressBar = (ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBar);
                str = "dailyTaskProgressBar";
            }
            kotlin.jvm.internal.i.f(progressBar, str);
            this.U = progressBar;
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
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.main_content);
            Context requireContext = requireContext();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
            if (((DailyPlanOverviewV3) activity).C) {
                i23 = com.theinnerhour.b2b.R.color.planExtensionDailyPlan;
            } else {
                i23 = com.theinnerhour.b2b.R.color.sea;
            }
            constraintLayout2.setBackgroundColor(g0.a.b(requireContext, i23));
            ((ScrollView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.scrollview)).setBackground(a.c.b(requireContext(), com.theinnerhour.b2b.R.drawable.backround_curved_top_colorbrown));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void o0() {
        View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.layout_multi_tracker_card, (ViewGroup) ((FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.containerFrame)), false);
        ((FrameLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.containerFrame)).addView(inflate);
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodOne)).setOnClickListener(new l(this, 0));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodTwo)).setOnClickListener(new l(this, 1));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodThree)).setOnClickListener(new l(this, 2));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodFour)).setOnClickListener(new l(this, 3));
        ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.trackerMoodFive)).setOnClickListener(new l(this, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        Bundle extras;
        super.onActivityResult(i6, i10, intent);
        try {
            if (i6 == this.F) {
                Bundle bundle = new Bundle();
                bundle.putString("course", a0().getCourseName());
                bundle.putString(Constants.API_COURSE_LINK, a0().getPlanV3().get(this.f4395z).getContent_id());
                bundle.putInt(Constants.DAYMODEL_POSITION, a0().getPlanV3().get(this.f4395z).getPosition());
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                    bundle.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                }
                bundle.putBoolean("isNewActivities", false);
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                if (i10 == -1) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    String str = this.f4394y;
                    if (str != null) {
                        Iterator<CourseDayModelV1> it = firebasePersistence.getCourseById(str).getPlanV3().iterator();
                        while (it.hasNext()) {
                            CourseDayModelV1 next = it.next();
                            if (this.f4395z == next.getPosition()) {
                                next.setCompleted(true);
                                int position = next.getPosition();
                                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                                String str2 = this.f4394y;
                                if (str2 != null) {
                                    if (position > firebasePersistence2.getCourseById(str2).getCoursePosition()) {
                                        FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                                        String str3 = this.f4394y;
                                        if (str3 != null) {
                                            firebasePersistence3.getCourseById(str3).setCoursePosition(next.getPosition());
                                        } else {
                                            kotlin.jvm.internal.i.q("currentCourse");
                                            throw null;
                                        }
                                    }
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    androidx.fragment.app.p activity = getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
                                    ((DailyPlanOverviewV3) activity).A = true;
                                    if (intent != null && intent.hasExtra("showSelling") && intent.getBooleanExtra("showSelling", false)) {
                                        Q();
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("currentCourse");
                                    throw null;
                                }
                            }
                        }
                        Z();
                        O();
                        if (this.P) {
                            this.P = false;
                            bundle.putBoolean("isOnboarding", this.R);
                            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            UtilsKt.fireAnalytics("dashboard_component_finish", bundle);
                        }
                    } else {
                        kotlin.jvm.internal.i.q("currentCourse");
                        throw null;
                    }
                } else if (this.P) {
                    this.P = false;
                    bundle.putBoolean("isOnboarding", this.R);
                    UtilsKt.fireAnalytics("dashboard_component_incomplete", bundle);
                }
                if (this.R) {
                    t0(0);
                }
            } else if (i6 == this.V && this.R) {
                if (i10 == -1) {
                    t0(2);
                }
                if (intent != null && intent.getBooleanExtra("tooltipshow", false)) {
                    this.Q = false;
                }
            } else if (i6 == this.W && this.R) {
                if (i10 == -1) {
                    c0(3);
                    O();
                }
            } else if (i6 == this.X && this.R) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
                ((DailyPlanOverviewV3) activity2).n0();
            } else if (i6 == this.Y) {
                if (this.R) {
                    t0(1);
                }
                if (intent != null && (extras = intent.getExtras()) != null) {
                    int intValue = Integer.valueOf(extras.getInt("mood")).intValue();
                    this.f4386g0 = true;
                    s0(intValue);
                }
                O();
            }
            p0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
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
        this.f4389j0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            cl.a aVar = this.f4387h0;
            if (aVar != null) {
                aVar.e();
            }
            Z();
            O();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0185 A[Catch: Exception -> 0x0231, TryCatch #0 {Exception -> 0x0231, blocks: (B:3:0x000c, B:5:0x0055, B:7:0x0063, B:8:0x0069, B:12:0x008e, B:14:0x0103, B:15:0x0116, B:17:0x0133, B:18:0x0163, B:20:0x0179, B:26:0x0185, B:28:0x0193, B:34:0x019f, B:35:0x01a6, B:37:0x01b1, B:39:0x01bb, B:40:0x01c2, B:42:0x01e1, B:44:0x0206, B:43:0x01f4), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019f A[Catch: Exception -> 0x0231, TryCatch #0 {Exception -> 0x0231, blocks: (B:3:0x000c, B:5:0x0055, B:7:0x0063, B:8:0x0069, B:12:0x008e, B:14:0x0103, B:15:0x0116, B:17:0x0133, B:18:0x0163, B:20:0x0179, B:26:0x0185, B:28:0x0193, B:34:0x019f, B:35:0x01a6, B:37:0x01b1, B:39:0x01bb, B:40:0x01c2, B:42:0x01e1, B:44:0x0206, B:43:0x01f4), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e1 A[Catch: Exception -> 0x0231, TryCatch #0 {Exception -> 0x0231, blocks: (B:3:0x000c, B:5:0x0055, B:7:0x0063, B:8:0x0069, B:12:0x008e, B:14:0x0103, B:15:0x0116, B:17:0x0133, B:18:0x0163, B:20:0x0179, B:26:0x0185, B:28:0x0193, B:34:0x019f, B:35:0x01a6, B:37:0x01b1, B:39:0x01bb, B:40:0x01c2, B:42:0x01e1, B:44:0x0206, B:43:0x01f4), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f4 A[Catch: Exception -> 0x0231, TryCatch #0 {Exception -> 0x0231, blocks: (B:3:0x000c, B:5:0x0055, B:7:0x0063, B:8:0x0069, B:12:0x008e, B:14:0x0103, B:15:0x0116, B:17:0x0133, B:18:0x0163, B:20:0x0179, B:26:0x0185, B:28:0x0193, B:34:0x019f, B:35:0x01a6, B:37:0x01b1, B:39:0x01bb, B:40:0x01c2, B:42:0x01e1, B:44:0x0206, B:43:0x01f4), top: B:49:0x000c }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean isAccessingFirstActivity;
        boolean z12;
        Bundle extras;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
            boolean z13 = ((DailyPlanOverviewV3) activity).B;
            this.R = z13;
            this.Q = z13;
            User user = FirebasePersistence.getInstance().getUser();
            kotlin.jvm.internal.i.f(user, "getInstance().user");
            this.f4392w = user;
            String string = requireArguments().getString(Constants.API_COURSE_LINK);
            kotlin.jvm.internal.i.d(string);
            this.A = string;
            this.f4395z = requireArguments().getInt(Constants.DAYMODEL_POSITION);
            if (requireActivity().getIntent().hasExtra("activity_course") && (extras = requireActivity().getIntent().getExtras()) != null) {
                this.f4384d0 = extras.getString("activity_course");
            }
            Z();
            ArrayList<CourseDayModelV1> planV3 = a0().getPlanV3();
            Utils utils = Utils.INSTANCE;
            Integer dayPlanPositionForDateV3 = CourseUtilKt.getDayPlanPositionForDateV3(planV3, utils.getTodayTimeInSeconds());
            kotlin.jvm.internal.i.d(dayPlanPositionForDateV3);
            if (dayPlanPositionForDateV3.intValue() == this.f4395z) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e0 = z10;
            k0();
            xs.f fVar = new xs.f(0, this.f4382a0.size() - 1);
            c.a aVar = vs.c.f36135u;
            this.B = kotlin.jvm.internal.h.W(aVar, fVar);
            this.C = kotlin.jvm.internal.h.W(aVar, new xs.f(0, this.Z.size() - 1));
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleGoals)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanGoalCardTitle));
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardTitleInnerResources)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanResourcesCardTitle));
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.daily_title)).setText(a0().getPlanV3().get(this.f4395z).getContent_label());
            if (this.R) {
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ir_title)).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanResourcesCardText));
            }
            Integer dayPlanPositionForDateV32 = CourseUtilKt.getDayPlanPositionForDateV3(a0().getPlanV3(), utils.getTodayTimeInSeconds());
            kotlin.jvm.internal.i.d(dayPlanPositionForDateV32);
            if (dayPlanPositionForDateV32.intValue() > this.f4395z) {
                ((ProgressBar) _$_findCachedViewById(com.theinnerhour.b2b.R.id.dailyTaskProgressBar)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progressPercent)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.desc)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.progresstitle)).setVisibility(8);
            }
            n0(this.R);
            g0();
            ArrayList<UserMood> userMoodList = FirebasePersistence.getInstance().getUser().getUserMoodList();
            if (userMoodList != null && !userMoodList.isEmpty()) {
                z11 = false;
                if (z11) {
                    ArrayList<UserMood> userMoodListV1 = FirebasePersistence.getInstance().getUser().getUserMoodListV1();
                    if (userMoodListV1 != null && !userMoodListV1.isEmpty()) {
                        z12 = false;
                        if (z12) {
                            this.c0 = true;
                            this.M = true;
                            o0();
                        }
                    }
                    z12 = true;
                    if (z12) {
                    }
                }
                Y();
                isAccessingFirstActivity = UtilsKt.isAccessingFirstActivity();
                this.S = isAccessingFirstActivity;
                if (isAccessingFirstActivity && !ApplicationPersistence.getInstance().containsKey("is_accessing_first_activity")) {
                    ApplicationPersistence.getInstance().setBooleanValue("is_accessing_first_activity", true);
                }
                X();
                if (!a0().getPlanV3().get(this.f4395z).isFavorite()) {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkSaved)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkUnsaved)).setVisibility(8);
                } else {
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkSaved)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivBookmarkUnsaved)).setVisibility(0);
                }
                l0 a10 = new o0(this).a(cl.a.class);
                cl.a aVar2 = (cl.a) a10;
                aVar2.f5289z.e(getViewLifecycleOwner(), new dk.a(12, new c()));
                aVar2.e();
                this.f4387h0 = (cl.a) a10;
            }
            z11 = true;
            if (z11) {
            }
            Y();
            isAccessingFirstActivity = UtilsKt.isAccessingFirstActivity();
            this.S = isAccessingFirstActivity;
            if (isAccessingFirstActivity) {
                ApplicationPersistence.getInstance().setBooleanValue("is_accessing_first_activity", true);
            }
            X();
            if (!a0().getPlanV3().get(this.f4395z).isFavorite()) {
            }
            l0 a102 = new o0(this).a(cl.a.class);
            cl.a aVar22 = (cl.a) a102;
            aVar22.f5289z.e(getViewLifecycleOwner(), new dk.a(12, new c()));
            aVar22.e();
            this.f4387h0 = (cl.a) a102;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void p0() {
        try {
            if (ApplicationPersistence.getInstance().containsKey("show_daily_plan_bookmarking_tool_tip") && ApplicationPersistence.getInstance().getBooleanValue("show_daily_plan_bookmarking_tool_tip") && !a0().getPlanV3().get(this.f4395z).isFavorite() && this.S) {
                _$_findCachedViewById(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setVisibility(0);
                new d().start();
                Bundle bundle = new Bundle();
                bundle.putString("course", a0().getCourseName());
                bundle.putString("activity_name", a0().getPlanV3().get(this.f4395z).getContent_label());
                bundle.putInt(Constants.DAYMODEL_POSITION, a0().getPlanV3().get(this.f4395z).getPosition());
                bundle.putBoolean("today_activity", this.e0);
                gk.a.b(bundle, "bookmark_tooltip_display");
            } else {
                _$_findCachedViewById(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4390u, e10);
        }
    }

    public final void q0(String str) {
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
            ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_yes)).setOnClickListener(new k(this, styledDialog));
            ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_no)).setOnClickListener(new k(styledDialog, this));
            Window window2 = styledDialog.getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -1);
            }
            styledDialog.setOnCancelListener(new dk.j(2));
            styledDialog.setOnDismissListener(new dk.k(2));
            styledDialog.show();
            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
            analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
            gk.a.b(analyticsBundle, "feedback_daily_task_playstore_show");
        }
    }

    public final void r0(ViewGroup viewGroup) {
        new Handler().postDelayed(new u(this, 19, viewGroup), 800L);
    }

    public final void s0(int i6) {
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
            lottieAnimationView.c(new e(styledDialog, lottieAnimationView));
            styledDialog.setCancelable(false);
            styledDialog.show();
            lottieAnimationView.h();
        }
        i10 = com.theinnerhour.b2b.R.color.trackerGrey;
        cardView.setCardBackgroundColor(g0.a.b(requireContext, i10));
        lottieAnimationView.c(new e(styledDialog, lottieAnimationView));
        styledDialog.setCancelable(false);
        styledDialog.show();
        lottieAnimationView.h();
    }

    public final void t0(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    cl.a aVar = this.f4387h0;
                    if (aVar != null) {
                        aVar.e();
                    }
                    this.f4388i0 = true;
                    return;
                }
                return;
            }
            c0(1);
            ConstraintLayout goalCardContainer = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.goalCardContainer);
            kotlin.jvm.internal.i.f(goalCardContainer, "goalCardContainer");
            K(goalCardContainer);
            return;
        }
        if (a0().getPlanV3().get(this.f4395z).isCompleted()) {
            c0(0);
        }
        ConstraintLayout trackerCardContainer = (ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.trackerCardContainer);
        kotlin.jvm.internal.i.f(trackerCardContainer, "trackerCardContainer");
        K(trackerCardContainer);
        if (this.K) {
            t0(1);
        }
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.cardInfo)).setVisibility(8);
    }

    /* compiled from: DailyPlanDetailFragmentV3.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CourseApiUtil.CourseApiUtilInterface {
        public a() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            int i6 = p.f4381k0;
            p.this.Z();
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception error) {
            kotlin.jvm.internal.i.g(error, "error");
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }

    /* compiled from: DailyPlanDetailFragmentV3.kt */
    /* loaded from: classes2.dex */
    public static final class d extends CountDownTimer {
        public d() {
            super(5000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            View _$_findCachedViewById;
            p pVar = p.this;
            try {
                if (pVar.isAdded() && !pVar.requireActivity().isFinishing() && (_$_findCachedViewById = pVar._$_findCachedViewById(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip)) != null) {
                    _$_findCachedViewById.setVisibility(8);
                }
                ApplicationPersistence.getInstance().setBooleanValue("show_daily_plan_bookmarking_tool_tip", false);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar.f4390u, e10);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
        }
    }
}

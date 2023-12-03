package com.theinnerhour.b2b.components.assessments.activity;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.assessments.model.AssessmentQuestion;
import com.theinnerhour.b2b.components.assessments.model.AssessmentType;
import com.theinnerhour.b2b.components.assessments.model.HealthAssessmentQuestion;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.AssessmentResponse;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.AssessmentResponseCategory;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import hk.h;
import hk.i;
import hk.j;
import ik.d0;
import ik.f0;
import ik.j0;
import ik.l;
import ik.m;
import ik.m0;
import ik.r;
import ik.x;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import rp.s;
import rp.v;
import rp.w;
/* compiled from: ExptInitialAssessmentActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/activity/ExptInitialAssessmentActivity;", "Lrr/a;", "Lcom/theinnerhour/b2b/components/assessments/model/AssessmentListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExptInitialAssessmentActivity extends rr.a implements AssessmentListener {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f10582f0 = 0;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public AssessmentResponseAll Q;
    public AssessmentResponseAll R;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public ArrayList<TherapistPackagesModel> Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10583a0;
    public final boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public final hc.d f10585d0;

    /* renamed from: x  reason: collision with root package name */
    public rr.b f10587x;
    public final LinkedHashMap e0 = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10586w = LogHelper.INSTANCE.makeLogTag(ExptInitialAssessmentActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public String f10588y = "";

    /* renamed from: z  reason: collision with root package name */
    public AssessmentType f10589z = AssessmentType.HEALTH;
    public EnumMap<AssessmentType, List<AssessmentQuestion>> A = new EnumMap<>(AssessmentType.class);
    public final AssessmentResponseCategory S = new AssessmentResponseCategory();
    public final AssessmentResponseCategory T = new AssessmentResponseCategory();
    public final AssessmentResponseCategory U = new AssessmentResponseCategory();

    /* renamed from: b0  reason: collision with root package name */
    public String f10584b0 = "";

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10590a;

        static {
            int[] iArr = new int[AssessmentType.values().length];
            try {
                iArr[AssessmentType.HEALTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssessmentType.SYMPTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssessmentType.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10590a = iArr;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<hs.k> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            Intent intent = new Intent();
            intent.putExtra("assessment", true);
            ExptInitialAssessmentActivity exptInitialAssessmentActivity = ExptInitialAssessmentActivity.this;
            intent.putExtra("new_assessment_completed", true ^ exptInitialAssessmentActivity.O);
            intent.putExtra("new_assessment_pos", exptInitialAssessmentActivity.V);
            hs.k kVar = hs.k.f19476a;
            exptInitialAssessmentActivity.setResult(-1, intent);
            exptInitialAssessmentActivity.finish();
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<hs.k> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            WindowManager.LayoutParams layoutParams;
            UiUtils.Companion companion = UiUtils.Companion;
            final ExptInitialAssessmentActivity exptInitialAssessmentActivity = ExptInitialAssessmentActivity.this;
            final Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_assessment_exit, exptInitialAssessmentActivity, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new View.OnClickListener() { // from class: hk.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = 0;
                    int i10 = r3;
                    ExptInitialAssessmentActivity this$0 = exptInitialAssessmentActivity;
                    Dialog dialog = styledDialog;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            int i11 = this$0.V;
                            if (i11 != 0) {
                                if (i11 != 15) {
                                    i6 = 28;
                                } else {
                                    i6 = 15;
                                }
                            }
                            analyticsBundle.putInt("day", i6);
                            UtilsKt.fireAnalytics("assessment_exit_popup_yes", analyticsBundle);
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                            int i12 = this$0.V;
                            if (i12 != 0) {
                                if (i12 != 15) {
                                    i6 = 28;
                                } else {
                                    i6 = 15;
                                }
                            }
                            analyticsBundle2.putInt("day", i6);
                            UtilsKt.fireAnalytics("assessment_exit_popup_no", analyticsBundle2);
                            dialog.dismiss();
                            return;
                    }
                }
            });
            ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new View.OnClickListener() { // from class: hk.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = 0;
                    int i10 = r3;
                    ExptInitialAssessmentActivity this$0 = exptInitialAssessmentActivity;
                    Dialog dialog = styledDialog;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            int i11 = this$0.V;
                            if (i11 != 0) {
                                if (i11 != 15) {
                                    i6 = 28;
                                } else {
                                    i6 = 15;
                                }
                            }
                            analyticsBundle.putInt("day", i6);
                            UtilsKt.fireAnalytics("assessment_exit_popup_yes", analyticsBundle);
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                            int i12 = this$0.V;
                            if (i12 != 0) {
                                if (i12 != 15) {
                                    i6 = 28;
                                } else {
                                    i6 = 15;
                                }
                            }
                            analyticsBundle2.putInt("day", i6);
                            UtilsKt.fireAnalytics("assessment_exit_popup_no", analyticsBundle2);
                            dialog.dismiss();
                            return;
                    }
                }
            });
            styledDialog.show();
            styledDialog.setOnDismissListener(new hk.f(exptInitialAssessmentActivity, 0));
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<hs.k> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            String str;
            EnumMap<AssessmentType, List<AssessmentQuestion>> enumMap;
            int i6;
            int i10;
            int i11;
            Object obj;
            String str2;
            Object obj2;
            String str3;
            boolean z10;
            boolean z11;
            HashMap<String, Object> appConfig;
            HashMap<String, Object> appConfig2;
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            if (str != null) {
                ExptInitialAssessmentActivity exptInitialAssessmentActivity = ExptInitialAssessmentActivity.this;
                exptInitialAssessmentActivity.getClass();
                exptInitialAssessmentActivity.f10588y = str;
                i iVar = new i(exptInitialAssessmentActivity, null);
                String str4 = exptInitialAssessmentActivity.f10586w;
                UtilsKt.logError(str4, "Error in setting custom status bar", iVar);
                boolean z12 = false;
                exptInitialAssessmentActivity.w0(null, false);
                UtilsKt.logError$default(str4, null, new hk.a(exptInitialAssessmentActivity), 2, null);
                UtilsKt.logError$default(str4, null, new hk.d(exptInitialAssessmentActivity), 2, null);
                String course = exptInitialAssessmentActivity.f10588y;
                exptInitialAssessmentActivity.f10585d0.getClass();
                kotlin.jvm.internal.i.g(course, "course");
                int hashCode = course.hashCode();
                Integer valueOf = Integer.valueOf((int) R.string.activePrompt);
                Integer valueOf2 = Integer.valueOf((int) R.array.healthSubOptions1);
                Integer valueOf3 = Integer.valueOf((int) R.string.frequencyPrompt);
                switch (hashCode) {
                    case -2114782937:
                        if (course.equals(Constants.COURSE_HAPPINESS)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.happinessSymptomQ2, R.array.assessmentOptions2, "gratitude", R.drawable.ir_happiness_assess_1, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomQ3, R.array.assessmentOptions3, "mindfulness", R.drawable.ir_happiness_assess_2, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomQ4, R.array.assessmentOptions2, "social-skills", R.drawable.ir_happiness_assess_3, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomQ5, R.array.assessmentOptions1, "self-esteem", R.drawable.ir_happiness_assess_4, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomQ6, R.array.assessmentOptions2, "thought-work", R.drawable.ir_happiness_assess_5, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomPersonalisationQ6, R.array.assessmentOptions1, "physical-activity", R.drawable.ir_happiness_assess_6, null, 16, null), new AssessmentQuestion(R.string.happinessSymptomPersonalisationQ7, R.array.assessmentOptions2, "relaxation", R.drawable.ir_happiness_assess_7, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.happinessGlobalQ1, R.array.globalOptions2, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                    case -1617042330:
                        if (course.equals(Constants.COURSE_DEPRESSION)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.depressionSymptomQ2, R.array.assessmentOptions2, "low-enjoyment", R.drawable.ir_depression_assess_1, null, 16, null), new AssessmentQuestion(R.string.depressionSymptomQ3, R.array.assessmentOptions3, "low-energy", R.drawable.ir_depression_assess_2, null, 16, null), new AssessmentQuestion(R.string.depressionSymptomQ4, R.array.assessmentOptions1, "lack-of-concentration", R.drawable.ir_depression_assess_3, null, 16, null), new AssessmentQuestion(R.string.depressionSymptomQ5, R.array.assessmentOptions2, "low-self-esteem", R.drawable.ir_depression_assess_4, null, 16, null), new AssessmentQuestion(R.string.depressionSymptomQ6, R.array.assessmentOptions3, "negative-thoughts", R.drawable.ir_depression_assess_5, null, 16, null), new AssessmentQuestion(R.string.depressionSymptomPersonalizedQ6, R.array.assessmentOptions5, "anxiety", R.drawable.ir_depression_assess_6, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.depressionGlobalQ1, R.array.globalOptions1, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                    case -891989580:
                        if (course.equals(Constants.COURSE_STRESS)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.stressSymptomQ1, R.array.assessmentOptions6, "relaxation", R.drawable.ir_stress_assess_1, null, 16, null), new AssessmentQuestion(R.string.stressSymptomQ2, R.array.assessmentOptions2, "attention-training", R.drawable.ir_stress_assess_2, null, 16, null), new AssessmentQuestion(R.string.stressSymptomQ4, R.array.assessmentOptions6, "problem-solving", R.drawable.ir_stress_assess_3, null, 16, null), new AssessmentQuestion(R.string.stressSymptomQ6, R.array.assessmentOptions3, "assertiveness", R.drawable.ir_stress_assess_4, null, 16, null), new AssessmentQuestion(R.string.stressSymptomQ7, R.array.assessmentOptions6, "thought-balancing", R.drawable.ir_stress_assess_5, null, 16, null), new AssessmentQuestion(R.string.stressSymptomPersonalisedQ6, R.array.assessmentOptions2, "balancing-work-and-life", R.drawable.ir_stress_assess_6, null, 16, null), new AssessmentQuestion(R.string.stressSymptomPersonalisedQ7, R.array.assessmentOptions6, "health", R.drawable.ir_stress_assess_7, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.stressGlobalQ1, R.array.globalOptions1, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                    case 92960775:
                        if (course.equals(Constants.COURSE_ANGER)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.angerSymptomQ1, R.array.assessmentOptions1, "understanding-anger", R.drawable.ir_anger_assess_1, null, 16, null), new AssessmentQuestion(R.string.angerSymptomQ3, R.array.assessmentOptions3, "mindfulness", R.drawable.ir_anger_assess_2, null, 16, null), new AssessmentQuestion(R.string.angerSymptomQ2, R.array.assessmentOptions1, "self-calming", R.drawable.ir_anger_assess_3, null, 16, null), new AssessmentQuestion(R.string.angerSymptomQ4, R.array.assessmentOptions3, "overcoming-rumination", R.drawable.ir_anger_assess_4, null, 16, null), new AssessmentQuestion(R.string.angerSymptomQ5, R.array.assessmentOptions1, "communication", R.drawable.ir_anger_assess_5, null, 16, null), new AssessmentQuestion(R.string.angerSymptomQ6, R.array.assessmentOptions2, "thought-work", R.drawable.ir_anger_assess_6, null, 16, null), new AssessmentQuestion(R.string.angerSymptomPersonalisedQ7, R.array.assessmentOptions1, "relaxation", R.drawable.ir_anger_assess_7, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.angerGlobalQ1, R.array.globalOptions1, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                    case 109522647:
                        if (course.equals(Constants.COURSE_SLEEP)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.sleepSymptomPersonalizedQ1, R.array.assessmentOptions2, "sleep-hygiene", R.drawable.ir_sleep_assess_1, null, 16, null), new AssessmentQuestion(R.string.sleepSymptomQ5, R.array.assessmentOptions4, Constants.SCREEN_THOUGHTS, R.drawable.ir_sleep_assess_2, null, 16, null), new AssessmentQuestion(R.string.sleepSymptomQ3, R.array.assessmentOptions7, "stimulus-control-and-sleep-restriction", R.drawable.ir_sleep_assess_3, null, 16, null), new AssessmentQuestion(R.string.sleepSymptomQ4, R.array.assessmentOptions3, "relaxation", R.drawable.ir_sleep_assess_4, null, 16, null), new AssessmentQuestion(R.string.sleepSymptomPersonalizedQ5, R.array.assessmentOptions5, "mindfulness", R.drawable.ir_sleep_assess_5, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.sleepGlobalQ1, R.array.globalOptions1, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                    case 113319009:
                        if (course.equals(Constants.COURSE_WORRY)) {
                            enumMap = new EnumMap<>(AssessmentType.class);
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.HEALTH, (AssessmentType) ca.a.k(new HealthAssessmentQuestion(R.string.sleepQuestion, R.array.healthOptions1, "H1", R.drawable.ir_ha_1, null, valueOf3, valueOf2, 16, null), new HealthAssessmentQuestion(R.string.appetiteQuestion, R.array.healthOptions2, "H2", R.drawable.ir_ha_2, null, valueOf3, valueOf2, 16, null), new AssessmentQuestion(R.string.activeQuestion, R.array.healthOptions3, "H3", R.drawable.ir_ha_3, valueOf)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.SYMPTOM, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.anxietySymptomQ1, R.array.assessmentOptions2, "managing-worry", R.drawable.ir_worry_assess_1, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomQ2, R.array.assessmentOptions3, "tolerating-uncertainty", R.drawable.ir_worry_assess_2, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomQ3, R.array.assessmentOptions4, "relaxation", R.drawable.ir_worry_assess_3, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomQ4, R.array.assessmentOptions1, "focus-and-attention", R.drawable.ir_worry_assess_4, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomQ6, R.array.assessmentOptions2, "thought-work", R.drawable.ir_worry_assess_5, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomQ8, R.array.assessmentOptions4, "problem-solving-and-overcoming-avoidance", R.drawable.ir_worry_assess_6, null, 16, null), new AssessmentQuestion(R.string.anxietySymptomPersonalisationQ7, R.array.assessmentOptions1, "sleeping-well", R.drawable.ir_worry_assess_7, null, 16, null)));
                            enumMap.put((EnumMap<AssessmentType, List<AssessmentQuestion>>) AssessmentType.GLOBAL, (AssessmentType) ca.a.k(new AssessmentQuestion(R.string.anxietyGlobalQ1, R.array.globalOptions1, "G1", R.drawable.ir_ga_1, null, 16, null)));
                            break;
                        }
                    default:
                        enumMap = new EnumMap<>(AssessmentType.class);
                        break;
                }
                exptInitialAssessmentActivity.A = enumMap;
                List<AssessmentQuestion> list = enumMap.get(AssessmentType.HEALTH);
                if (list != null) {
                    i6 = list.size();
                } else {
                    i6 = 0;
                }
                exptInitialAssessmentActivity.B = i6;
                List<AssessmentQuestion> list2 = exptInitialAssessmentActivity.A.get(AssessmentType.SYMPTOM);
                if (list2 != null) {
                    i10 = list2.size();
                } else {
                    i10 = 0;
                }
                exptInitialAssessmentActivity.C = i10;
                List<AssessmentQuestion> list3 = exptInitialAssessmentActivity.A.get(AssessmentType.GLOBAL);
                if (list3 != null) {
                    i11 = list3.size();
                } else {
                    i11 = 0;
                }
                exptInitialAssessmentActivity.D = i11;
                exptInitialAssessmentActivity.E = exptInitialAssessmentActivity.B + exptInitialAssessmentActivity.C + i11;
                exptInitialAssessmentActivity.t0();
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                    obj = appConfig2.get(Constants.A3_ONBOARDING_REVAMP);
                } else {
                    obj = null;
                }
                if (kotlin.jvm.internal.i.b(obj, Constants.ONBOARDING_VARIANT) && ApplicationPersistence.getInstance().getBooleanValue("a3_var_b_assessment", false)) {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (appConfig = user3.getAppConfig()) != null) {
                        obj2 = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str3 = (String) obj2;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && !n.B0(str3)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && kotlin.jvm.internal.i.b(str3, "variant_a")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        z12 = true;
                    }
                }
                exptInitialAssessmentActivity.f10583a0 = z12;
                if (z12 && LocationPersistence.INSTANCE.isIndianUser()) {
                    v vVar = (v) new o0(exptInitialAssessmentActivity, new w(new s())).a(v.class);
                    User user4 = FirebasePersistence.getInstance().getUser();
                    if (user4 != null) {
                        str2 = user4.getCurrentCourseName();
                    } else {
                        str2 = null;
                    }
                    vVar.e(str2);
                    vVar.f30910y.e(exptInitialAssessmentActivity, new dk.a(5, new j(exptInitialAssessmentActivity)));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f10594u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ExptInitialAssessmentActivity f10595v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f10596w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ExptInitialAssessmentActivity exptInitialAssessmentActivity, boolean z11, boolean z12) {
            super(0);
            this.f10594u = z10;
            this.f10595v = exptInitialAssessmentActivity;
            this.f10596w = z11;
        }

        @Override // ss.a
        public final hs.k invoke() {
            boolean z10 = this.f10594u;
            ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f10595v;
            if (z10) {
                exptInitialAssessmentActivity.o0();
            } else if (this.f10596w) {
                exptInitialAssessmentActivity.finish();
            } else {
                int i6 = ExptInitialAssessmentActivity.f10582f0;
                exptInitialAssessmentActivity.getClass();
                exptInitialAssessmentActivity.n0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f10598v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f10599w;

        /* compiled from: ExptInitialAssessmentActivity.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10600a;

            static {
                int[] iArr = new int[AssessmentType.values().length];
                try {
                    iArr[AssessmentType.HEALTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssessmentType.SYMPTOM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssessmentType.GLOBAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10600a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i6, String str) {
            super(0);
            this.f10598v = i6;
            this.f10599w = str;
        }

        @Override // ss.a
        public final hs.k invoke() {
            int i6;
            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
            analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            ExptInitialAssessmentActivity exptInitialAssessmentActivity = ExptInitialAssessmentActivity.this;
            int i10 = exptInitialAssessmentActivity.V;
            if (i10 != 0) {
                i6 = 15;
                if (i10 != 15) {
                    i6 = 28;
                }
            } else {
                i6 = 0;
            }
            analyticsBundle.putInt("day", i6);
            int i11 = a.f10600a[exptInitialAssessmentActivity.f10589z.ordinal()];
            String str = this.f10599w;
            int i12 = this.f10598v;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AssessmentResponseCategory assessmentResponseCategory = exptInitialAssessmentActivity.U;
                        assessmentResponseCategory.setScore(assessmentResponseCategory.getScore() + i12);
                        assessmentResponseCategory.getValues().add(new AssessmentResponse(str, i12));
                        int i13 = exptInitialAssessmentActivity.H + 1;
                        exptInitialAssessmentActivity.H = i13;
                        if (i13 == exptInitialAssessmentActivity.D) {
                            exptInitialAssessmentActivity.N = true;
                            Object obj = g0.a.f16164a;
                            ((AppCompatImageView) exptInitialAssessmentActivity.u0(R.id.globalAssessmentIcon)).setImageDrawable(a.c.b(exptInitialAssessmentActivity, R.drawable.ic_assessment_global_filled));
                            analyticsBundle.putInt("score", assessmentResponseCategory.getScore());
                            UtilsKt.fireAnalytics("global_assessment_finish", analyticsBundle);
                        }
                        exptInitialAssessmentActivity.t0();
                    }
                } else {
                    AssessmentResponseCategory assessmentResponseCategory2 = exptInitialAssessmentActivity.T;
                    assessmentResponseCategory2.setScore(assessmentResponseCategory2.getScore() + i12);
                    assessmentResponseCategory2.getValues().add(new AssessmentResponse(str, i12));
                    int i14 = exptInitialAssessmentActivity.G + 1;
                    exptInitialAssessmentActivity.G = i14;
                    if (i14 == exptInitialAssessmentActivity.C) {
                        exptInitialAssessmentActivity.f10589z = AssessmentType.GLOBAL;
                        Object obj2 = g0.a.f16164a;
                        ((AppCompatImageView) exptInitialAssessmentActivity.u0(R.id.symptomAssessmentIcon)).setImageDrawable(a.c.b(exptInitialAssessmentActivity, R.drawable.ic_assessment_symptom_filled));
                        ((AppCompatImageView) exptInitialAssessmentActivity.u0(R.id.globalAssessmentIcon)).setAlpha(1.0f);
                        exptInitialAssessmentActivity.u0(R.id.globalAssessmentLine).setAlpha(1.0f);
                        analyticsBundle.putInt("score", assessmentResponseCategory2.getScore());
                        UtilsKt.fireAnalytics("symptpm_assessment_finish", analyticsBundle);
                    }
                    exptInitialAssessmentActivity.t0();
                }
            } else {
                AssessmentResponseCategory assessmentResponseCategory3 = exptInitialAssessmentActivity.S;
                assessmentResponseCategory3.setScore(assessmentResponseCategory3.getScore() + i12);
                assessmentResponseCategory3.getValues().add(new AssessmentResponse(str, i12));
                int i15 = exptInitialAssessmentActivity.F + 1;
                exptInitialAssessmentActivity.F = i15;
                if (i15 == exptInitialAssessmentActivity.B) {
                    exptInitialAssessmentActivity.f10589z = AssessmentType.SYMPTOM;
                    Object obj3 = g0.a.f16164a;
                    ((AppCompatImageView) exptInitialAssessmentActivity.u0(R.id.healthAssessmentIcon)).setImageDrawable(a.c.b(exptInitialAssessmentActivity, R.drawable.ic_assessment_health_filled));
                    ((AppCompatImageView) exptInitialAssessmentActivity.u0(R.id.symptomAssessmentIcon)).setAlpha(1.0f);
                    exptInitialAssessmentActivity.u0(R.id.symptomAssessmentLine).setAlpha(1.0f);
                    analyticsBundle.putInt("score", assessmentResponseCategory3.getScore());
                    UtilsKt.fireAnalytics("health_assessment_finish", analyticsBundle);
                }
                exptInitialAssessmentActivity.t0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements ss.a<hs.k> {

        /* compiled from: ExptInitialAssessmentActivity.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10602a;

            static {
                int[] iArr = new int[AssessmentType.values().length];
                try {
                    iArr[AssessmentType.HEALTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssessmentType.SYMPTOM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssessmentType.GLOBAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10602a = iArr;
            }
        }

        public g() {
            super(0);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x02be, code lost:
            if (r4 != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x02ee, code lost:
            if (r4 != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x0318, code lost:
            if (r4 != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:195:0x0342, code lost:
            if (r4 != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:219:0x036e, code lost:
            if (r4 != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x0396, code lost:
            if (r4 != false) goto L159;
         */
        @Override // ss.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke() {
            rr.b withArgs;
            String str;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            rr.b withArgs2;
            boolean z22;
            ArrayList<SuggestedActivityModel> planSuggested;
            AssessmentQuestion assessmentQuestion;
            rr.b rVar;
            AssessmentQuestion assessmentQuestion2;
            AssessmentQuestion assessmentQuestion3;
            rr.b f0Var;
            ExptInitialAssessmentActivity exptInitialAssessmentActivity = ExptInitialAssessmentActivity.this;
            boolean z23 = true;
            long j10 = 500;
            if (!exptInitialAssessmentActivity.N && !exptInitialAssessmentActivity.O) {
                if (!exptInitialAssessmentActivity.J) {
                    if (exptInitialAssessmentActivity.V == 0) {
                        f0Var = new m0();
                    } else {
                        f0Var = new f0();
                    }
                    exptInitialAssessmentActivity.f10587x = f0Var;
                } else {
                    int i6 = a.f10602a[exptInitialAssessmentActivity.f10589z.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                if (exptInitialAssessmentActivity.M) {
                                    d0 d0Var = new d0();
                                    Bundle bundle = new Bundle();
                                    List<AssessmentQuestion> list = exptInitialAssessmentActivity.A.get(AssessmentType.GLOBAL);
                                    if (list != null) {
                                        assessmentQuestion3 = list.get(exptInitialAssessmentActivity.H);
                                    } else {
                                        assessmentQuestion3 = null;
                                    }
                                    bundle.putSerializable("questionData", assessmentQuestion3);
                                    d0Var.setArguments(bundle);
                                    exptInitialAssessmentActivity.f10587x = d0Var;
                                } else {
                                    UiUtils.Companion.hideViews(new View[]{(RobertoTextView) exptInitialAssessmentActivity.u0(R.id.initialAssessmentCounter), (LinearLayout) exptInitialAssessmentActivity.u0(R.id.initialAssessmentIcons)}, true);
                                    exptInitialAssessmentActivity.f10587x = new ik.s();
                                }
                                ExptInitialAssessmentActivity.v0(exptInitialAssessmentActivity);
                            }
                        } else {
                            if (exptInitialAssessmentActivity.L) {
                                d0 d0Var2 = new d0();
                                Bundle bundle2 = new Bundle();
                                List<AssessmentQuestion> list2 = exptInitialAssessmentActivity.A.get(AssessmentType.SYMPTOM);
                                if (list2 != null) {
                                    assessmentQuestion2 = list2.get(exptInitialAssessmentActivity.G);
                                } else {
                                    assessmentQuestion2 = null;
                                }
                                bundle2.putSerializable("questionData", assessmentQuestion2);
                                d0Var2.setArguments(bundle2);
                                exptInitialAssessmentActivity.f10587x = d0Var2;
                            } else {
                                UiUtils.Companion.hideViews(new View[]{(RobertoTextView) exptInitialAssessmentActivity.u0(R.id.initialAssessmentCounter), (LinearLayout) exptInitialAssessmentActivity.u0(R.id.initialAssessmentIcons)}, true);
                                exptInitialAssessmentActivity.f10587x = new ik.s();
                            }
                            ExptInitialAssessmentActivity.v0(exptInitialAssessmentActivity);
                        }
                    } else {
                        if (exptInitialAssessmentActivity.K) {
                            Bundle bundle3 = new Bundle();
                            List<AssessmentQuestion> list3 = exptInitialAssessmentActivity.A.get(AssessmentType.HEALTH);
                            if (list3 != null) {
                                assessmentQuestion = list3.get(exptInitialAssessmentActivity.F);
                            } else {
                                assessmentQuestion = null;
                            }
                            bundle3.putSerializable("questionData", assessmentQuestion);
                            if (exptInitialAssessmentActivity.F == exptInitialAssessmentActivity.B - 1) {
                                rVar = new d0();
                                rVar.setArguments(bundle3);
                            } else {
                                rVar = new r();
                                rVar.setArguments(bundle3);
                            }
                            exptInitialAssessmentActivity.f10587x = rVar;
                        } else {
                            new Handler().postDelayed(new hk.g(exptInitialAssessmentActivity, 2), 500L);
                            exptInitialAssessmentActivity.f10587x = new ik.s();
                        }
                        ExptInitialAssessmentActivity.v0(exptInitialAssessmentActivity);
                    }
                }
            } else {
                hk.b bVar = new hk.b(exptInitialAssessmentActivity);
                String str2 = exptInitialAssessmentActivity.f10586w;
                UtilsKt.logError$default(str2, null, bVar, 2, null);
                Handler handler = new Handler();
                hk.g gVar = new hk.g(exptInitialAssessmentActivity, 1);
                if (exptInitialAssessmentActivity.O) {
                    j10 = 0;
                }
                handler.postDelayed(gVar, j10);
                if (exptInitialAssessmentActivity.O && exptInitialAssessmentActivity.I == 2) {
                    if (exptInitialAssessmentActivity.c0) {
                        Course courseByName = FirebasePersistence.getInstance().getCourseByName(exptInitialAssessmentActivity.f10588y);
                        if (courseByName != null && (planSuggested = courseByName.getPlanSuggested()) != null && (!planSuggested.isEmpty())) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                    } else {
                        u uVar = new u();
                        UtilsKt.logError$default(str2, null, new hk.c(exptInitialAssessmentActivity, uVar), 2, null);
                        z22 = uVar.f23466u;
                    }
                    if (z22) {
                        exptInitialAssessmentActivity.finish();
                        return hs.k.f19476a;
                    }
                    exptInitialAssessmentActivity.W = true;
                }
                if (exptInitialAssessmentActivity.f10583a0 && exptInitialAssessmentActivity.I == 2 && !LocationPersistence.INSTANCE.isIndianUser()) {
                    exptInitialAssessmentActivity.I++;
                }
                int i10 = exptInitialAssessmentActivity.I;
                if (i10 != 0) {
                    AssessmentResponseCategory assessmentResponseCategory = exptInitialAssessmentActivity.U;
                    AssessmentResponseCategory assessmentResponseCategory2 = exptInitialAssessmentActivity.T;
                    AssessmentResponseCategory assessmentResponseCategory3 = exptInitialAssessmentActivity.S;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    exptInitialAssessmentActivity.n0();
                                } else if (exptInitialAssessmentActivity.f10583a0 && (!kotlin.jvm.internal.i.b(exptInitialAssessmentActivity.f10584b0, "low") || !LocationPersistence.INSTANCE.isIndianUser())) {
                                    m mVar = new m();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putSerializable("responseData", new AssessmentResponseAll(assessmentResponseCategory3, exptInitialAssessmentActivity.T, exptInitialAssessmentActivity.U, assessmentResponseCategory.getScore() + assessmentResponseCategory2.getScore() + assessmentResponseCategory3.getScore(), exptInitialAssessmentActivity.V));
                                    hs.k kVar = hs.k.f19476a;
                                    exptInitialAssessmentActivity.f10587x = UtilsKt.withArgs(mVar, bundle4);
                                } else {
                                    exptInitialAssessmentActivity.n0();
                                }
                            } else if (exptInitialAssessmentActivity.V == 0) {
                                if (exptInitialAssessmentActivity.f10583a0) {
                                    x xVar = new x();
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putBoolean("forceLoadPlan", exptInitialAssessmentActivity.W);
                                    hs.k kVar2 = hs.k.f19476a;
                                    withArgs2 = UtilsKt.withArgs(xVar, bundle5);
                                } else {
                                    m mVar2 = new m();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putSerializable("responseData", new AssessmentResponseAll(assessmentResponseCategory3, exptInitialAssessmentActivity.T, exptInitialAssessmentActivity.U, assessmentResponseCategory.getScore() + assessmentResponseCategory2.getScore() + assessmentResponseCategory3.getScore(), exptInitialAssessmentActivity.V));
                                    hs.k kVar3 = hs.k.f19476a;
                                    withArgs2 = UtilsKt.withArgs(mVar2, bundle6);
                                }
                                exptInitialAssessmentActivity.f10587x = withArgs2;
                            } else {
                                exptInitialAssessmentActivity.n0();
                            }
                        } else {
                            if (exptInitialAssessmentActivity.f10583a0) {
                                int score = assessmentResponseCategory.getScore() + assessmentResponseCategory2.getScore() + assessmentResponseCategory3.getScore();
                                String str3 = exptInitialAssessmentActivity.f10588y;
                                switch (str3.hashCode()) {
                                    case -2114782937:
                                        if (str3.equals(Constants.COURSE_HAPPINESS)) {
                                            if (score >= 0 && score < 15) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                if (15 <= score && score < 30) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (!z11) {
                                                    if (30 > score || score >= 45) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "high";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    case -1617042330:
                                        if (str3.equals(Constants.COURSE_DEPRESSION)) {
                                            if (score >= 0 && score < 13) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                if (13 <= score && score < 28) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (!z13) {
                                                    if (28 > score || score >= 41) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "low";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    case -891989580:
                                        if (str3.equals(Constants.COURSE_STRESS)) {
                                            if (score >= 0 && score < 15) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                if (15 <= score && score < 30) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (!z15) {
                                                    if (30 > score || score >= 45) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "low";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    case 92960775:
                                        if (str3.equals(Constants.COURSE_ANGER)) {
                                            if (score >= 0 && score < 15) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z16) {
                                                if (15 <= score && score < 30) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (!z17) {
                                                    if (30 > score || score >= 45) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "low";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    case 109522647:
                                        if (str3.equals(Constants.COURSE_SLEEP)) {
                                            if (score >= 0 && score < 12) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (!z18) {
                                                if (12 <= score && score < 25) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (!z19) {
                                                    if (25 > score || score >= 37) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "low";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    case 113319009:
                                        if (str3.equals(Constants.COURSE_WORRY)) {
                                            if (score >= 0 && score < 15) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            if (!z20) {
                                                if (15 <= score && score < 30) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (!z21) {
                                                    if (30 > score || score >= 45) {
                                                        z23 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            str = "low";
                                            break;
                                        }
                                        str = "moderate";
                                        break;
                                    default:
                                        str = "moderate";
                                        break;
                                }
                                exptInitialAssessmentActivity.f10584b0 = str;
                                if (kotlin.jvm.internal.i.b(str, "low")) {
                                    withArgs = new ik.d();
                                } else if (kotlin.jvm.internal.i.b(str, "moderate")) {
                                    withArgs = new ik.b();
                                } else {
                                    withArgs = new ik.k();
                                }
                            } else {
                                x xVar2 = new x();
                                Bundle bundle7 = new Bundle();
                                bundle7.putBoolean("forceLoadPlan", exptInitialAssessmentActivity.W);
                                hs.k kVar4 = hs.k.f19476a;
                                withArgs = UtilsKt.withArgs(xVar2, bundle7);
                            }
                            exptInitialAssessmentActivity.f10587x = withArgs;
                        }
                    } else {
                        Bundle bundle8 = new Bundle();
                        if (exptInitialAssessmentActivity.O) {
                            bundle8.putSerializable("responseData", exptInitialAssessmentActivity.Q);
                        } else {
                            bundle8.putSerializable("responseData", new AssessmentResponseAll(assessmentResponseCategory3, exptInitialAssessmentActivity.T, exptInitialAssessmentActivity.U, assessmentResponseCategory.getScore() + assessmentResponseCategory2.getScore() + assessmentResponseCategory3.getScore(), exptInitialAssessmentActivity.V));
                        }
                        bundle8.putSerializable("previousResponseData", exptInitialAssessmentActivity.R);
                        bundle8.putBoolean("showComparison", exptInitialAssessmentActivity.P);
                        Intent intent = exptInitialAssessmentActivity.getIntent();
                        if (intent != null) {
                            Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("showTopNav", false));
                            if (!valueOf.booleanValue()) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                valueOf.booleanValue();
                                bundle8.putBoolean("showTopNav", true);
                                UtilsKt.logError(str2, "Error in setting custom status bar", new i(exptInitialAssessmentActivity, Integer.valueOf((int) R.color.login_grey_background)));
                            }
                        }
                        j0 j0Var = new j0();
                        j0Var.setArguments(bundle8);
                        exptInitialAssessmentActivity.f10587x = j0Var;
                    }
                } else {
                    exptInitialAssessmentActivity.f10587x = new l();
                }
            }
            rr.b bVar2 = exptInitialAssessmentActivity.f10587x;
            if (bVar2 != null) {
                if (bVar2.getArguments() == null) {
                    rr.b bVar3 = exptInitialAssessmentActivity.f10587x;
                    if (bVar3 != null) {
                        bVar3.setArguments(new Bundle());
                    } else {
                        kotlin.jvm.internal.i.q("currentFragment");
                        throw null;
                    }
                }
                rr.b bVar4 = exptInitialAssessmentActivity.f10587x;
                if (bVar4 != null) {
                    Bundle arguments = bVar4.getArguments();
                    if (arguments != null) {
                        arguments.putString("course", exptInitialAssessmentActivity.f10588y);
                        arguments.putInt("statusBarHeight", 0);
                        arguments.putSerializable("currentAssessment", exptInitialAssessmentActivity.f10589z);
                        arguments.putBoolean("showResult", exptInitialAssessmentActivity.O);
                        arguments.putInt("dayPlanPosition", exptInitialAssessmentActivity.V);
                    }
                    y supportFragmentManager = exptInitialAssessmentActivity.getSupportFragmentManager();
                    androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                    if (exptInitialAssessmentActivity.J) {
                        l2.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
                    }
                    rr.b bVar5 = exptInitialAssessmentActivity.f10587x;
                    if (bVar5 != null) {
                        l2.f(R.id.initialAssessmentContainer, bVar5, null);
                        l2.k();
                        return hs.k.f19476a;
                    }
                    kotlin.jvm.internal.i.q("currentFragment");
                    throw null;
                }
                kotlin.jvm.internal.i.q("currentFragment");
                throw null;
            }
            kotlin.jvm.internal.i.q("currentFragment");
            throw null;
        }
    }

    public ExptInitialAssessmentActivity() {
        boolean z10;
        Object obj;
        User user = FirebasePersistence.getInstance().getUser();
        boolean z11 = false;
        if (user != null) {
            HashMap<String, Object> appConfig = user.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                HashMap<String, Object> appConfig2 = user.getAppConfig();
                if (appConfig2 != null) {
                    obj = appConfig2.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (!kotlin.jvm.internal.i.b(obj, "default")) {
                    z11 = true;
                }
            }
        }
        this.c0 = z11;
        this.f10585d0 = new hc.d();
    }

    public static final void v0(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        RobertoTextView robertoTextView = (RobertoTextView) exptInitialAssessmentActivity.u0(R.id.initialAssessmentCounter);
        if (robertoTextView != null) {
            robertoTextView.setText(exptInitialAssessmentActivity.getString(R.string.xOfYQuestionsAnswered, Integer.valueOf(exptInitialAssessmentActivity.F + exptInitialAssessmentActivity.G + exptInitialAssessmentActivity.H), Integer.valueOf(exptInitialAssessmentActivity.E)));
        }
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void goToNextScreen(rr.b bVar) {
        if (bVar == null) {
            this.I++;
            t0();
            return;
        }
        r0(bVar);
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void goToScreen(int i6, boolean z10) {
        this.I = i6;
        t0();
    }

    @Override // rr.a
    public final void n0() {
        UtilsKt.logError$default(this.f10586w, null, new b(), 2, null);
    }

    @Override // rr.a
    public final void o0() {
        UtilsKt.logError$default(this.f10586w, null, new c(), 2, null);
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onAssessmentCompleted() {
        if (!this.X) {
            UtilsKt.logError$default(this.f10586w, null, new h(this), 2, null);
            this.X = true;
            ApplicationPersistence.getInstance().deleteKey("a3_var_b_assessment");
        }
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onAssessmentStarted() {
        this.J = true;
        t0();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ObjectAnimator objectAnimator;
        try {
            if (this.O) {
                n0();
                return;
            }
            o0();
            rr.b bVar = this.f10587x;
            ik.s sVar = null;
            if (bVar != null) {
                if (bVar instanceof ik.s) {
                    if (bVar != null) {
                        if (bVar instanceof ik.s) {
                            sVar = (ik.s) bVar;
                        }
                        if (sVar != null && (objectAnimator = sVar.f20292v) != null) {
                            objectAnimator.pause();
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("currentFragment");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.i.q("currentFragment");
            throw null;
        } catch (Exception unused) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_expt_initial_assessment);
        UtilsKt.logError$default(this.f10586w, null, new d(), 2, null);
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onError(String toastMsg) {
        kotlin.jvm.internal.i.g(toastMsg, "toastMsg");
        Utils.INSTANCE.showCustomToast(this, toastMsg, 1);
        n0();
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onExit(boolean z10, boolean z11, boolean z12) {
        UtilsKt.logError$default(this.f10586w, null, new e(z10, this, z11, z12), 2, null);
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onIntroScreenShown() {
        int i6 = a.f10590a[this.f10589z.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    this.M = true;
                }
            } else {
                this.L = true;
            }
        } else {
            this.K = true;
        }
        UiUtils.Companion.showViews((RobertoTextView) u0(R.id.initialAssessmentCounter), (LinearLayout) u0(R.id.initialAssessmentIcons));
        t0();
    }

    @Override // com.theinnerhour.b2b.components.assessments.model.AssessmentListener
    public final void onOptionSelected(String symptomSlug, int i6) {
        kotlin.jvm.internal.i.g(symptomSlug, "symptomSlug");
        UtilsKt.logError$default(this.f10586w, null, new f(i6, symptomSlug), 2, null);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        this.Y = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        this.Y = true;
        super.onResume();
    }

    @Override // rr.a
    public final void r0(rr.b frag) {
        kotlin.jvm.internal.i.g(frag, "frag");
        this.f10587x = frag;
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
        l2.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
        rr.b bVar = this.f10587x;
        if (bVar != null) {
            l2.f(R.id.initialAssessmentContainer, bVar, null);
            l2.k();
            return;
        }
        kotlin.jvm.internal.i.q("currentFragment");
        throw null;
    }

    @Override // rr.a
    public final void t0() {
        UtilsKt.logError$default(this.f10586w, null, new g(), 2, null);
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.e0;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void w0(Integer num, boolean z10) {
        if (z10 && num != null) {
            ((ConstraintLayout) u0(R.id.parentLayoutAssessment)).setBackgroundColor(g0.a.b(this, num.intValue()));
            return;
        }
        String str = this.f10588y;
        this.f10585d0.getClass();
        Integer D = hc.d.D(str);
        if (D != null) {
            ((ConstraintLayout) u0(R.id.parentLayoutAssessment)).setBackgroundColor(g0.a.b(this, D.intValue()));
        }
    }
}

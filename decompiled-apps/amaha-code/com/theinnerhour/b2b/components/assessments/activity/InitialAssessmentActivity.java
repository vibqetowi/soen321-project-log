package com.theinnerhour.b2b.components.assessments.activity;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import androidx.appcompat.app.b;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.AssessmentQuestionOld;
import com.theinnerhour.b2b.model.AssessmentResponse;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.AssessmentResponseCategory;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.FirebaseCourseUpdateListener;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hc.d;
import ik.b1;
import ik.c1;
import ik.d1;
import ik.e1;
import ik.g1;
import ik.h1;
import ik.k1;
import ik.m1;
import ik.n0;
import ik.n1;
import ik.o1;
import ik.q1;
import ik.s0;
import ik.w0;
import ik.x0;
import ik.z0;
import is.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
import t0.r0;
/* compiled from: InitialAssessmentActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/activity/InitialAssessmentActivity;", "Lrr/a;", "Lcom/theinnerhour/b2b/model/FirebaseCourseUpdateListener;", "Landroid/view/View;", "H", "Landroid/view/View;", "getSharedResponse", "()Landroid/view/View;", "setSharedResponse", "(Landroid/view/View;)V", "sharedResponse", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class InitialAssessmentActivity extends a implements FirebaseCourseUpdateListener {
    public static final /* synthetic */ int T = 0;
    public int A;
    public int B;
    public boolean G;
    public View H;
    public int I;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;

    /* renamed from: x  reason: collision with root package name */
    public y f10604x;

    /* renamed from: y  reason: collision with root package name */
    public b f10605y;
    public final LinkedHashMap S = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10603w = LogHelper.INSTANCE.makeLogTag(InitialAssessmentActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<ArrayList<AssessmentQuestionOld>> f10606z = new ArrayList<>();
    public AssessmentResponseCategory C = new AssessmentResponseCategory();
    public AssessmentResponseCategory D = new AssessmentResponseCategory();
    public AssessmentResponseCategory E = new AssessmentResponseCategory();
    public String F = "";
    public int J = -1;

    public InitialAssessmentActivity() {
        new ArrayList();
        this.K = -1;
        this.L = -1;
        FirebasePersistence.getInstance().getCourses();
    }

    public final void A0(int i6, String str, String str2) {
        if (i6 > -1) {
            try {
                int hashCode = str.hashCode();
                boolean z10 = true;
                if (hashCode != 71) {
                    if (hashCode != 72) {
                        if (hashCode == 83 && str.equals("S")) {
                            ArrayList<AssessmentResponse> values = this.D.getValues();
                            if (!(values instanceof Collection) || !values.isEmpty()) {
                                Iterator<T> it = values.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (i.b(((AssessmentResponse) it.next()).getSymptom(), str2)) {
                                        z10 = false;
                                        break;
                                    }
                                }
                            }
                            if (z10) {
                                this.D.getValues().add(new AssessmentResponse(str2, i6));
                                AssessmentResponseCategory assessmentResponseCategory = this.D;
                                assessmentResponseCategory.setScore(assessmentResponseCategory.getScore() + i6);
                            }
                        }
                    } else if (str.equals("H")) {
                        ArrayList<AssessmentResponse> values2 = this.C.getValues();
                        if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                            Iterator<T> it2 = values2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (i.b(((AssessmentResponse) it2.next()).getSymptom(), str2)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        if (z10) {
                            this.C.getValues().add(new AssessmentResponse(str2, i6));
                            AssessmentResponseCategory assessmentResponseCategory2 = this.C;
                            assessmentResponseCategory2.setScore(assessmentResponseCategory2.getScore() + i6);
                        }
                    }
                } else if (str.equals("G")) {
                    ArrayList<AssessmentResponse> values3 = this.E.getValues();
                    if (!(values3 instanceof Collection) || !values3.isEmpty()) {
                        Iterator<T> it3 = values3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else if (i.b(((AssessmentResponse) it3.next()).getSymptom(), str2)) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    if (z10) {
                        this.E.getValues().add(new AssessmentResponse(str2, i6));
                        AssessmentResponseCategory assessmentResponseCategory3 = this.E;
                        assessmentResponseCategory3.setScore(assessmentResponseCategory3.getScore() + i6);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10603w, e10);
            }
        }
    }

    public final void B0() {
        b k1Var;
        b n0Var;
        b x0Var;
        try {
            y yVar = this.f10604x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                int i6 = this.I;
                int i10 = R.color.white;
                switch (i6) {
                    case 1:
                        z0(null, true);
                        y0(aVar, true, true);
                        this.f10605y = new c1();
                        break;
                    case 2:
                        z0(null, true);
                        y0(aVar, true, false);
                        if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            k1Var = new m1();
                        } else {
                            k1Var = new k1();
                        }
                        this.f10605y = k1Var;
                        break;
                    case 3:
                        z0(null, true);
                        y0(aVar, false, false);
                        this.f10605y = new b1();
                        break;
                    case 4:
                        this.I = i6 + 1;
                        B0();
                        break;
                    case 5:
                        if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            if (this.K == 2 && !this.P) {
                                this.I++;
                                B0();
                                break;
                            } else {
                                z0(null, true);
                                y0(aVar, true, false);
                                this.f10605y = new s0();
                                this.R = true;
                                break;
                            }
                        } else {
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                z0(Integer.valueOf((int) R.color.white), true);
                                y0(aVar, true, false);
                                n0Var = new e1();
                            } else {
                                z0(Integer.valueOf((int) R.color.sea), false);
                                y0(aVar, true, false);
                                n0Var = new n0();
                            }
                            this.f10605y = n0Var;
                            break;
                        }
                        break;
                    case 6:
                        if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            if (this.P) {
                                if (this.K == 1) {
                                    z0(Integer.valueOf((int) R.color.minicourse_bg_pink), true);
                                    y0(aVar, false, false);
                                    this.f10605y = new w0();
                                    break;
                                } else {
                                    n0();
                                    break;
                                }
                            } else {
                                int i11 = this.K;
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 == 2) {
                                            z0(Integer.valueOf((int) R.color.white), true);
                                            y0(aVar, true, false);
                                            this.f10605y = new e1();
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        this.I++;
                                        B0();
                                        break;
                                    }
                                } else {
                                    z0(Integer.valueOf((int) R.color.minicourse_bg_pink), true);
                                    y0(aVar, false, false);
                                    this.f10605y = new w0();
                                    break;
                                }
                            }
                        } else {
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                z0(Integer.valueOf((int) R.color.sea), false);
                                y0(aVar, true, false);
                                x0Var = new g1();
                            } else {
                                if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                                    i10 = R.color.minicourse_bg_pink;
                                }
                                z0(Integer.valueOf(i10), true);
                                y0(aVar, false, false);
                                if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                                    x0Var = new w0();
                                } else {
                                    x0Var = new x0();
                                }
                            }
                            this.f10605y = x0Var;
                            break;
                        }
                    case 7:
                        if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION) && k.Q1(Integer.valueOf(this.K), new Integer[]{2})) {
                            z0(Integer.valueOf((int) R.color.white), false);
                            y0(aVar, true, false);
                            this.f10605y = new z0();
                            break;
                        } else {
                            this.I++;
                            B0();
                            break;
                        }
                    default:
                        n0();
                        return;
                }
                b bVar = this.f10605y;
                if (bVar != null) {
                    aVar.f(R.id.initialAssessmentMainContainer, bVar, null);
                    if (this.R) {
                        aVar.k();
                    } else {
                        aVar.j();
                    }
                    this.R = false;
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10603w, e10);
        }
    }

    @Override // rr.a
    public final void n0() {
        int i6;
        int i10 = this.K;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = -1;
                } else {
                    i6 = 30;
                }
            } else {
                i6 = 15;
            }
        } else {
            i6 = 0;
        }
        Intent intent = new Intent();
        intent.putExtra("assessment", true);
        intent.putExtra("new_assessment_completed", this.O);
        intent.putExtra("new_assessment_pos", i6);
        setResult(-1, intent);
        finish();
    }

    @Override // com.theinnerhour.b2b.model.FirebaseCourseUpdateListener
    public final void newItemsAdded(boolean z10) {
        this.N = true;
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = getString(R.string.assesmentExitPrompt);
            aVar.b("Ok", new DialogInterface.OnClickListener(this) { // from class: hk.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ InitialAssessmentActivity f17654v;

                {
                    this.f17654v = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    HashMap<String, Object> appConfig;
                    HashMap<String, Object> appConfig2;
                    int i10 = 0;
                    int i11 = r2;
                    Object obj = null;
                    InitialAssessmentActivity this$0 = this.f17654v;
                    switch (i11) {
                        case 0:
                            int i12 = InitialAssessmentActivity.T;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                                obj = appConfig2.get(Constants.ONBOARDING_EXPERIMENT);
                            }
                            analyticsBundle.putString("variant", (String) obj);
                            int i13 = this$0.L;
                            if (i13 != 0) {
                                if (i13 != 15) {
                                    i10 = 28;
                                } else {
                                    i10 = 15;
                                }
                            }
                            analyticsBundle.putInt("day", i10);
                            UtilsKt.fireAnalytics("assessment_exit_popup_yes", analyticsBundle);
                            if (this$0.I >= 3) {
                                this$0.n0();
                                return;
                            } else {
                                this$0.finish();
                                return;
                            }
                        default:
                            int i14 = InitialAssessmentActivity.T;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                                obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                            }
                            analyticsBundle2.putString("variant", (String) obj);
                            int i15 = this$0.L;
                            if (i15 != 0) {
                                if (i15 != 15) {
                                    i10 = 28;
                                } else {
                                    i10 = 15;
                                }
                            }
                            analyticsBundle2.putInt("day", i10);
                            UtilsKt.fireAnalytics("assessment_exit_popup_no", analyticsBundle2);
                            return;
                    }
                }
            });
            aVar.a("Cancel", new DialogInterface.OnClickListener(this) { // from class: hk.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ InitialAssessmentActivity f17654v;

                {
                    this.f17654v = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    HashMap<String, Object> appConfig;
                    HashMap<String, Object> appConfig2;
                    int i10 = 0;
                    int i11 = r2;
                    Object obj = null;
                    InitialAssessmentActivity this$0 = this.f17654v;
                    switch (i11) {
                        case 0:
                            int i12 = InitialAssessmentActivity.T;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                                obj = appConfig2.get(Constants.ONBOARDING_EXPERIMENT);
                            }
                            analyticsBundle.putString("variant", (String) obj);
                            int i13 = this$0.L;
                            if (i13 != 0) {
                                if (i13 != 15) {
                                    i10 = 28;
                                } else {
                                    i10 = 15;
                                }
                            }
                            analyticsBundle.putInt("day", i10);
                            UtilsKt.fireAnalytics("assessment_exit_popup_yes", analyticsBundle);
                            if (this$0.I >= 3) {
                                this$0.n0();
                                return;
                            } else {
                                this$0.finish();
                                return;
                            }
                        default:
                            int i14 = InitialAssessmentActivity.T;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                                obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                            }
                            analyticsBundle2.putString("variant", (String) obj);
                            int i15 = this$0.L;
                            if (i15 != 0) {
                                if (i15 != 15) {
                                    i10 = 28;
                                } else {
                                    i10 = 15;
                                }
                            }
                            analyticsBundle2.putInt("day", i10);
                            UtilsKt.fireAnalytics("assessment_exit_popup_no", analyticsBundle2);
                            return;
                    }
                }
            });
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10603w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.J != -1) {
            finish();
        } else {
            o0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x046c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0428 A[SYNTHETIC] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int initialAssessmentScore;
        Object obj;
        AssessmentResponseCategory assessmentResponseCategory;
        boolean z10;
        Object obj2;
        AssessmentResponseCategory assessmentResponseCategory2;
        boolean z11;
        AssessmentResponseCategory assessmentResponseCategory3;
        boolean z12;
        boolean z13;
        Object obj3;
        boolean z14;
        Object obj4;
        boolean z15;
        Object obj5;
        AssessmentResponseCategory assessmentResponseCategory4;
        boolean z16;
        Object obj6;
        AssessmentResponseCategory assessmentResponseCategory5;
        boolean z17;
        AssessmentResponseCategory assessmentResponseCategory6;
        boolean z18;
        boolean z19;
        Object obj7;
        boolean z20;
        Object obj8;
        boolean z21;
        boolean z22;
        Integer score;
        boolean z23;
        boolean z24;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_initial_assessment);
            int i6 = 0;
            r0.a(getWindow(), false);
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView initialAssessmentTitle = (RobertoTextView) u0(R.id.initialAssessmentTitle);
            i.f(initialAssessmentTitle, "initialAssessmentTitle");
            insetsUtils.addStatusBarHeight(initialAssessmentTitle);
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                initialAssessmentScore = courseById.getFinalAssessmentScore();
            } else {
                initialAssessmentScore = courseById.getInitialAssessmentScore();
            }
            this.J = initialAssessmentScore;
            this.K = courseById.getAssessments().size();
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                int intExtra = getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
                int size = courseById.getAssessments().size();
                if (size != 0) {
                    if (size != 1) {
                        if (size == 2) {
                            if (courseById.getPlanV3().size() == 31 && !courseById.getPlanV3().get(30).isCompleted() && intExtra == 30) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            this.O = z24;
                        }
                    } else {
                        if (courseById.getPlanV3().size() == 16 && !courseById.getPlanV3().get(15).isCompleted() && intExtra == 15) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        this.O = z23;
                    }
                } else {
                    if (courseById.getPlanV3().size() == 1 && !courseById.getPlanV3().get(0).isCompleted() && intExtra == 0) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    this.O = z22;
                }
                if (this.O) {
                    this.J = -1;
                } else if (getIntent().hasExtra(Constants.DAYMODEL_POSITION)) {
                    int intExtra2 = getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
                    this.L = intExtra2;
                    if ((intExtra2 == 0 && courseById.getAssessments().isEmpty()) || ((this.L == 15 && courseById.getAssessments().size() < 2) || (this.L > 15 && courseById.getAssessments().size() < 3))) {
                        Utils.INSTANCE.showCustomToast(this, "Something went wrong");
                        finish();
                    }
                    int i10 = this.L;
                    if (i10 == 0) {
                        score = courseById.getAssessments().get(0).getScore();
                    } else if (i10 == 15) {
                        score = courseById.getAssessments().get(1).getScore();
                    } else {
                        score = courseById.getAssessments().get(2).getScore();
                    }
                    i.d(score);
                    this.J = score.intValue();
                } else if (courseById.getAssessments().size() > 0 && courseById.getAssessments().get(courseById.getAssessments().size() - 1).getScore() != null) {
                    Integer score2 = courseById.getAssessments().get(courseById.getAssessments().size() - 1).getScore();
                    i.d(score2);
                    this.J = score2.intValue();
                }
            }
            i.f(FirebasePersistence.getInstance().getCourses(), "getInstance().courses");
            if (this.J > -1) {
                this.I = 1;
                if (courseById.getAssessments().size() > 0) {
                    int i11 = this.L;
                    if (i11 != -1) {
                        if (i11 != 0) {
                            if (i11 == 15) {
                                i6 = 1;
                            } else if (i11 == 30) {
                                i6 = 2;
                            } else {
                                i6 = -1;
                            }
                        }
                        if (i6 != -1) {
                            this.C = courseById.getAssessments().get(i6).getHealth();
                            this.D = courseById.getAssessments().get(i6).getSymptom();
                            this.E = courseById.getAssessments().get(i6).getGlobal();
                        }
                    } else {
                        Object obj9 = null;
                        if (ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj8 = it.next();
                                        Integer day = ((AssessmentResponseAll) obj8).getDay();
                                        if (day != null && day.intValue() == 28) {
                                            z21 = true;
                                            continue;
                                            if (z21) {
                                                break;
                                            }
                                        }
                                        z21 = false;
                                        if (z21) {
                                        }
                                    } else {
                                        obj8 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll = (AssessmentResponseAll) obj8;
                                if (assessmentResponseAll == null || (assessmentResponseCategory4 = assessmentResponseAll.getHealth()) == null) {
                                    assessmentResponseCategory4 = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it2 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj5 = it2.next();
                                        Integer day2 = ((AssessmentResponseAll) obj5).getDay();
                                        if (day2 != null && day2.intValue() == 1) {
                                            z16 = true;
                                            continue;
                                            if (z16) {
                                                break;
                                            }
                                        }
                                        z16 = false;
                                        if (z16) {
                                        }
                                    } else {
                                        obj5 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll2 = (AssessmentResponseAll) obj5;
                                if (assessmentResponseAll2 == null || (assessmentResponseCategory4 = assessmentResponseAll2.getHealth()) == null) {
                                    assessmentResponseCategory4 = new AssessmentResponseCategory();
                                }
                            }
                            this.C = assessmentResponseCategory4;
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it3 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj7 = it3.next();
                                        Integer day3 = ((AssessmentResponseAll) obj7).getDay();
                                        if (day3 != null && day3.intValue() == 28) {
                                            z20 = true;
                                            continue;
                                            if (z20) {
                                                break;
                                            }
                                        }
                                        z20 = false;
                                        if (z20) {
                                        }
                                    } else {
                                        obj7 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll3 = (AssessmentResponseAll) obj7;
                                if (assessmentResponseAll3 == null || (assessmentResponseCategory5 = assessmentResponseAll3.getSymptom()) == null) {
                                    assessmentResponseCategory5 = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it4 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj6 = it4.next();
                                        Integer day4 = ((AssessmentResponseAll) obj6).getDay();
                                        if (day4 != null && day4.intValue() == 1) {
                                            z17 = true;
                                            continue;
                                            if (z17) {
                                                break;
                                            }
                                        }
                                        z17 = false;
                                        if (z17) {
                                        }
                                    } else {
                                        obj6 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll4 = (AssessmentResponseAll) obj6;
                                if (assessmentResponseAll4 == null || (assessmentResponseCategory5 = assessmentResponseAll4.getSymptom()) == null) {
                                    assessmentResponseCategory5 = new AssessmentResponseCategory();
                                }
                            }
                            this.D = assessmentResponseCategory5;
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it5 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Object next = it5.next();
                                    Integer day5 = ((AssessmentResponseAll) next).getDay();
                                    if (day5 != null && day5.intValue() == 28) {
                                        z19 = true;
                                        continue;
                                        if (z19) {
                                            obj9 = next;
                                            break;
                                        }
                                    }
                                    z19 = false;
                                    if (z19) {
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll5 = (AssessmentResponseAll) obj9;
                                if (assessmentResponseAll5 == null || (assessmentResponseCategory6 = assessmentResponseAll5.getGlobal()) == null) {
                                    assessmentResponseCategory6 = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it6 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it6.next();
                                    Integer day6 = ((AssessmentResponseAll) next2).getDay();
                                    if (day6 != null && day6.intValue() == 1) {
                                        z18 = true;
                                        continue;
                                        if (z18) {
                                            obj9 = next2;
                                            break;
                                        }
                                    }
                                    z18 = false;
                                    if (z18) {
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll6 = (AssessmentResponseAll) obj9;
                                if (assessmentResponseAll6 == null || (assessmentResponseCategory6 = assessmentResponseAll6.getGlobal()) == null) {
                                    assessmentResponseCategory6 = new AssessmentResponseCategory();
                                }
                            }
                            this.E = assessmentResponseCategory6;
                        } else {
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it7 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        obj4 = it7.next();
                                        Integer day7 = ((AssessmentResponseAll) obj4).getDay();
                                        if (day7 != null && day7.intValue() == 28) {
                                            z15 = true;
                                            continue;
                                            if (z15) {
                                                break;
                                            }
                                        }
                                        z15 = false;
                                        if (z15) {
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll7 = (AssessmentResponseAll) obj4;
                                if (assessmentResponseAll7 == null || (assessmentResponseCategory = assessmentResponseAll7.getHealth()) == null) {
                                    assessmentResponseCategory = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it8 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        obj = it8.next();
                                        Integer day8 = ((AssessmentResponseAll) obj).getDay();
                                        if (day8 != null && day8.intValue() == 0) {
                                            z10 = true;
                                            continue;
                                            if (z10) {
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll8 = (AssessmentResponseAll) obj;
                                if (assessmentResponseAll8 == null || (assessmentResponseCategory = assessmentResponseAll8.getHealth()) == null) {
                                    assessmentResponseCategory = new AssessmentResponseCategory();
                                }
                            }
                            this.C = assessmentResponseCategory;
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it9 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        obj3 = it9.next();
                                        Integer day9 = ((AssessmentResponseAll) obj3).getDay();
                                        if (day9 != null && day9.intValue() == 28) {
                                            z14 = true;
                                            continue;
                                            if (z14) {
                                                break;
                                            }
                                        }
                                        z14 = false;
                                        if (z14) {
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll9 = (AssessmentResponseAll) obj3;
                                if (assessmentResponseAll9 == null || (assessmentResponseCategory2 = assessmentResponseAll9.getSymptom()) == null) {
                                    assessmentResponseCategory2 = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it10 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        obj2 = it10.next();
                                        Integer day10 = ((AssessmentResponseAll) obj2).getDay();
                                        if (day10 != null && day10.intValue() == 0) {
                                            z11 = true;
                                            continue;
                                            if (z11) {
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll10 = (AssessmentResponseAll) obj2;
                                if (assessmentResponseAll10 == null || (assessmentResponseCategory2 = assessmentResponseAll10.getSymptom()) == null) {
                                    assessmentResponseCategory2 = new AssessmentResponseCategory();
                                }
                            }
                            this.D = assessmentResponseCategory2;
                            if (getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                Iterator<T> it11 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it11.next();
                                    Integer day11 = ((AssessmentResponseAll) next3).getDay();
                                    if (day11 != null && day11.intValue() == 28) {
                                        z13 = true;
                                        continue;
                                        if (z13) {
                                            obj9 = next3;
                                            break;
                                        }
                                    }
                                    z13 = false;
                                    if (z13) {
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll11 = (AssessmentResponseAll) obj9;
                                if (assessmentResponseAll11 == null || (assessmentResponseCategory3 = assessmentResponseAll11.getGlobal()) == null) {
                                    assessmentResponseCategory3 = new AssessmentResponseCategory();
                                }
                            } else {
                                Iterator<T> it12 = courseById.getAssessments().iterator();
                                while (true) {
                                    if (!it12.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it12.next();
                                    Integer day12 = ((AssessmentResponseAll) next4).getDay();
                                    if (day12 != null && day12.intValue() == 0) {
                                        z12 = true;
                                        continue;
                                        if (z12) {
                                            obj9 = next4;
                                            break;
                                        }
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                }
                                AssessmentResponseAll assessmentResponseAll12 = (AssessmentResponseAll) obj9;
                                if (assessmentResponseAll12 == null || (assessmentResponseCategory3 = assessmentResponseAll12.getGlobal()) == null) {
                                    assessmentResponseCategory3 = new AssessmentResponseCategory();
                                }
                            }
                            this.E = assessmentResponseCategory3;
                        }
                    }
                }
            }
            this.f10606z = d.A(this, courseById.getCourseName());
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            this.f10604x = supportFragmentManager;
            ((RobertoTextView) u0(R.id.initialAssessmentTitle)).setVisibility(4);
            ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).setVisibility(4);
            Integer totalQuestions = this.f10606z.get(this.B).get(this.A).getTotalQuestions();
            i.d(totalQuestions);
            ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).setMax(totalQuestions.intValue() * 20);
            FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
            t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10603w, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        FirebasePersistence.getInstance().removeFirebaseCourseUpdateListener(this);
    }

    public final void setSharedResponse(View view) {
        this.H = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0313 A[Catch: Exception -> 0x05ee, TryCatch #0 {Exception -> 0x05ee, blocks: (B:3:0x0006, B:6:0x0037, B:9:0x0043, B:12:0x004f, B:14:0x0067, B:16:0x006c, B:18:0x0083, B:20:0x00a5, B:22:0x00a9, B:62:0x0206, B:64:0x0271, B:66:0x0278, B:67:0x0284, B:68:0x0288, B:69:0x0289, B:70:0x028d, B:61:0x0201, B:71:0x028e, B:72:0x0292, B:73:0x0293, B:74:0x029e, B:76:0x02a2, B:78:0x02b1, B:79:0x02c3, B:81:0x02c7, B:83:0x02d2, B:86:0x02d7, B:93:0x030f, B:95:0x0313, B:96:0x031e, B:97:0x0322, B:87:0x02e2, B:88:0x02ee, B:90:0x02fb, B:92:0x0300, B:98:0x0323, B:99:0x0327, B:100:0x0328, B:102:0x0338, B:103:0x0344, B:105:0x0353, B:107:0x0365, B:109:0x0369, B:111:0x036e, B:113:0x0375, B:115:0x0393, B:116:0x039f, B:117:0x03a3, B:118:0x03a4, B:119:0x03a8, B:120:0x03a9, B:122:0x03c1, B:124:0x03c6, B:126:0x03dd, B:128:0x03fa, B:130:0x03fe, B:170:0x055a, B:172:0x05c3, B:174:0x05ca, B:175:0x05d5, B:176:0x05d9, B:177:0x05da, B:178:0x05de, B:169:0x0555, B:179:0x05df, B:180:0x05e3, B:181:0x05e4, B:131:0x0402, B:140:0x042e, B:143:0x0436, B:145:0x0446, B:148:0x044e, B:151:0x0456, B:153:0x0473, B:155:0x04b3, B:154:0x0487, B:156:0x04bc, B:159:0x04c4, B:160:0x04d1, B:163:0x04d9, B:165:0x0547, B:167:0x0552, B:166:0x054d, B:23:0x00ae, B:32:0x00da, B:35:0x00e2, B:37:0x00f2, B:40:0x00fa, B:43:0x0102, B:45:0x011f, B:47:0x015f, B:46:0x0133, B:48:0x0168, B:51:0x0170, B:52:0x017d, B:55:0x0185, B:57:0x01f3, B:59:0x01fe, B:58:0x01f9), top: B:186:0x0006, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031e A[Catch: Exception -> 0x05ee, TryCatch #0 {Exception -> 0x05ee, blocks: (B:3:0x0006, B:6:0x0037, B:9:0x0043, B:12:0x004f, B:14:0x0067, B:16:0x006c, B:18:0x0083, B:20:0x00a5, B:22:0x00a9, B:62:0x0206, B:64:0x0271, B:66:0x0278, B:67:0x0284, B:68:0x0288, B:69:0x0289, B:70:0x028d, B:61:0x0201, B:71:0x028e, B:72:0x0292, B:73:0x0293, B:74:0x029e, B:76:0x02a2, B:78:0x02b1, B:79:0x02c3, B:81:0x02c7, B:83:0x02d2, B:86:0x02d7, B:93:0x030f, B:95:0x0313, B:96:0x031e, B:97:0x0322, B:87:0x02e2, B:88:0x02ee, B:90:0x02fb, B:92:0x0300, B:98:0x0323, B:99:0x0327, B:100:0x0328, B:102:0x0338, B:103:0x0344, B:105:0x0353, B:107:0x0365, B:109:0x0369, B:111:0x036e, B:113:0x0375, B:115:0x0393, B:116:0x039f, B:117:0x03a3, B:118:0x03a4, B:119:0x03a8, B:120:0x03a9, B:122:0x03c1, B:124:0x03c6, B:126:0x03dd, B:128:0x03fa, B:130:0x03fe, B:170:0x055a, B:172:0x05c3, B:174:0x05ca, B:175:0x05d5, B:176:0x05d9, B:177:0x05da, B:178:0x05de, B:169:0x0555, B:179:0x05df, B:180:0x05e3, B:181:0x05e4, B:131:0x0402, B:140:0x042e, B:143:0x0436, B:145:0x0446, B:148:0x044e, B:151:0x0456, B:153:0x0473, B:155:0x04b3, B:154:0x0487, B:156:0x04bc, B:159:0x04c4, B:160:0x04d1, B:163:0x04d9, B:165:0x0547, B:167:0x0552, B:166:0x054d, B:23:0x00ae, B:32:0x00da, B:35:0x00e2, B:37:0x00f2, B:40:0x00fa, B:43:0x0102, B:45:0x011f, B:47:0x015f, B:46:0x0133, B:48:0x0168, B:51:0x0170, B:52:0x017d, B:55:0x0185, B:57:0x01f3, B:59:0x01fe, B:58:0x01f9), top: B:186:0x0006, inners: #1, #2 }] */
    @Override // rr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        String str;
        rr.b h1Var;
        String str2;
        rr.b bVar;
        String str3;
        String str4;
        rr.b h1Var2;
        String str5 = this.f10603w;
        try {
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                if (!getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false) && !getIntent().hasExtra(Constants.DAYMODEL_POSITION)) {
                    final Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                    if (!this.G && this.J == -1) {
                        z0(null, true);
                        if (this.A < this.f10606z.get(this.B).size()) {
                            str3 = "slug";
                            str4 = "course";
                        } else {
                            this.A = 0;
                            this.B++;
                            str3 = "slug";
                            str4 = "course";
                            new Handler().postDelayed(new Runnable(this) { // from class: hk.k

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ InitialAssessmentActivity f17649v;

                                {
                                    this.f17649v = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    RobertoTextView robertoTextView;
                                    ProgressBar progressBar;
                                    RobertoTextView robertoTextView2;
                                    ProgressBar progressBar2;
                                    int i6 = r3;
                                    Course course = courseById;
                                    InitialAssessmentActivity this$0 = this.f17649v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = InitialAssessmentActivity.T;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                            if (progressBar3 != null) {
                                                progressBar3.setProgress(0);
                                            }
                                            if (this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions() != null && (progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar)) != null) {
                                                Integer totalQuestions = this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions();
                                                kotlin.jvm.internal.i.d(totalQuestions);
                                                progressBar2.setMax(totalQuestions.intValue() * 20);
                                            }
                                            int i11 = this$0.B;
                                            if (i11 != 1) {
                                                if (i11 == 2 && (robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle)) != null) {
                                                    robertoTextView2.setText(this$0.getString(R.string.globalAssessment));
                                                    return;
                                                }
                                                return;
                                            } else if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_SLEEP)) {
                                                RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView3 != null) {
                                                    robertoTextView3.setText(this$0.getString(R.string.IndicatorAssessment));
                                                    return;
                                                }
                                                return;
                                            } else if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_HAPPINESS)) {
                                                RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView4 != null) {
                                                    robertoTextView4.setText(this$0.getString(R.string.factorAssessment));
                                                    return;
                                                }
                                                return;
                                            } else {
                                                RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView5 != null) {
                                                    robertoTextView5.setText(this$0.getString(R.string.symptomAssessment));
                                                    return;
                                                }
                                                return;
                                            }
                                        default:
                                            int i12 = InitialAssessmentActivity.T;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                            if (progressBar4 != null) {
                                                progressBar4.setProgress(0);
                                            }
                                            if (this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions() != null && (progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar)) != null) {
                                                Integer totalQuestions2 = this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions();
                                                kotlin.jvm.internal.i.d(totalQuestions2);
                                                progressBar.setMax(totalQuestions2.intValue() * 20);
                                            }
                                            int i13 = this$0.B;
                                            if (i13 != 1) {
                                                if (i13 == 2 && (robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle)) != null) {
                                                    robertoTextView.setText(this$0.getString(R.string.globalAssessment));
                                                    return;
                                                }
                                                return;
                                            }
                                            String courseName = course.getCourseName();
                                            if (kotlin.jvm.internal.i.b(courseName, Constants.COURSE_SLEEP)) {
                                                RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView6 != null) {
                                                    robertoTextView6.setText(this$0.getString(R.string.IndicatorAssessment));
                                                    return;
                                                }
                                                return;
                                            } else if (kotlin.jvm.internal.i.b(courseName, Constants.COURSE_HAPPINESS)) {
                                                RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView7 != null) {
                                                    robertoTextView7.setText(this$0.getString(R.string.factorAssessment));
                                                    return;
                                                }
                                                return;
                                            } else {
                                                RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                if (robertoTextView8 != null) {
                                                    robertoTextView8.setText(this$0.getString(R.string.symptomAssessment));
                                                    return;
                                                }
                                                return;
                                            }
                                    }
                                }
                            }, 550L);
                        }
                        y yVar = this.f10604x;
                        if (yVar != null) {
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                            try {
                                String flag = this.f10606z.get(this.B).get(this.A).getFlag();
                                int hashCode = flag.hashCode();
                                if (hashCode != 81) {
                                    if (hashCode != 83) {
                                        if (hashCode != 2091) {
                                            if (hashCode == 2654 && flag.equals("SQ")) {
                                                y0(aVar, true, false);
                                                this.f10605y = new o1();
                                                View view = this.H;
                                                if (view != null) {
                                                    aVar.c(view, "response_transition");
                                                }
                                            }
                                        } else if (flag.equals("AL")) {
                                            y0(aVar, false, true);
                                            if (this.f10606z.get(this.B).get(this.A).getTotalQuestions() == null) {
                                                this.G = true;
                                                new Handler().postDelayed(new Runnable(this) { // from class: hk.l

                                                    /* renamed from: v  reason: collision with root package name */
                                                    public final /* synthetic */ InitialAssessmentActivity f17652v;

                                                    {
                                                        this.f17652v = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i6 = r2;
                                                        InitialAssessmentActivity this$0 = this.f17652v;
                                                        switch (i6) {
                                                            case 0:
                                                                int i10 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar != null) {
                                                                    progressBar.setVisibility(8);
                                                                }
                                                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView != null) {
                                                                    robertoTextView.setVisibility(8);
                                                                    return;
                                                                }
                                                                return;
                                                            case 1:
                                                                int i11 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar2 != null) {
                                                                    progressBar2.setVisibility(4);
                                                                }
                                                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView2 != null) {
                                                                    robertoTextView2.setVisibility(4);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2:
                                                                int i12 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar3 != null) {
                                                                    progressBar3.setVisibility(8);
                                                                }
                                                                RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView3 != null) {
                                                                    robertoTextView3.setVisibility(8);
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                int i13 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar4 != null) {
                                                                    progressBar4.setVisibility(4);
                                                                }
                                                                RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView4 != null) {
                                                                    robertoTextView4.setVisibility(4);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                }, 550L);
                                            } else {
                                                Integer totalQuestions = this.f10606z.get(this.B).get(this.A).getTotalQuestions();
                                                i.d(totalQuestions);
                                                totalQuestions.intValue();
                                                new Handler().postDelayed(new Runnable(this) { // from class: hk.l

                                                    /* renamed from: v  reason: collision with root package name */
                                                    public final /* synthetic */ InitialAssessmentActivity f17652v;

                                                    {
                                                        this.f17652v = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i6 = r2;
                                                        InitialAssessmentActivity this$0 = this.f17652v;
                                                        switch (i6) {
                                                            case 0:
                                                                int i10 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar != null) {
                                                                    progressBar.setVisibility(8);
                                                                }
                                                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView != null) {
                                                                    robertoTextView.setVisibility(8);
                                                                    return;
                                                                }
                                                                return;
                                                            case 1:
                                                                int i11 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar2 != null) {
                                                                    progressBar2.setVisibility(4);
                                                                }
                                                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView2 != null) {
                                                                    robertoTextView2.setVisibility(4);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2:
                                                                int i12 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar3 != null) {
                                                                    progressBar3.setVisibility(8);
                                                                }
                                                                RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView3 != null) {
                                                                    robertoTextView3.setVisibility(8);
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                int i13 = InitialAssessmentActivity.T;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                                if (progressBar4 != null) {
                                                                    progressBar4.setVisibility(4);
                                                                }
                                                                RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                                if (robertoTextView4 != null) {
                                                                    robertoTextView4.setVisibility(4);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                }, 550L);
                                            }
                                            this.f10605y = new q1();
                                        }
                                    } else if (flag.equals("S")) {
                                        y0(aVar, true, true);
                                        this.f10605y = new n1();
                                    }
                                } else if (flag.equals("Q")) {
                                    y0(aVar, false, true);
                                    ((RobertoTextView) u0(R.id.initialAssessmentTitle)).setVisibility(0);
                                    ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).setVisibility(0);
                                    ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) u0(R.id.initialAssessmentProgressbar), Constants.SCREEN_PROGRESS, ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).getProgress(), ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).getProgress() + 20);
                                    ofInt.setDuration(500L);
                                    ofInt.setInterpolator(new LinearInterpolator());
                                    ofInt.start();
                                    if (this.f10606z.get(this.B).get(this.A).getContainsSubquestions()) {
                                        h1Var2 = new d1();
                                    } else {
                                        h1Var2 = new h1();
                                    }
                                    this.f10605y = h1Var2;
                                }
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str5, e10);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putInt("index", this.A);
                            bundle.putInt(Constants.SCREEN_PROGRESS, this.B);
                            bundle.putString(str4, courseById.getCourseName());
                            bundle.putString("question_type", this.f10606z.get(this.B).get(this.A).getQType());
                            bundle.putString("symptom", this.f10606z.get(this.B).get(this.A).getTag());
                            bundle.putString(str3, this.f10606z.get(this.B).get(this.A).getSlug());
                            rr.b bVar2 = this.f10605y;
                            if (bVar2 != null) {
                                bVar2.setArguments(bundle);
                                rr.b bVar3 = this.f10605y;
                                if (bVar3 != null) {
                                    aVar.f(R.id.initialAssessmentMainContainer, bVar3, null);
                                    aVar.j();
                                    return;
                                }
                                i.q("customFragment");
                                throw null;
                            }
                            i.q("customFragment");
                            throw null;
                        }
                        i.q("fragmentManager");
                        throw null;
                    }
                    this.I++;
                    B0();
                    return;
                }
                y yVar2 = this.f10604x;
                if (yVar2 != null) {
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(yVar2);
                    if (getIntent().hasExtra(Constants.DAYMODEL_POSITION)) {
                        this.L = getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
                        getIntent().removeExtra(Constants.DAYMODEL_POSITION);
                    }
                    if (this.K == 0) {
                        if (!getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false) && this.L != 0) {
                            getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                            t0();
                        }
                        getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                        t0();
                    } else {
                        getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                        if (this.J > -1) {
                            t0();
                        } else {
                            this.f10605y = new jq.b();
                            y0(aVar2, true, true);
                            str2 = null;
                            z0(null, true);
                            bVar = this.f10605y;
                            if (bVar == null) {
                                aVar2.f(R.id.initialAssessmentMainContainer, bVar, str2);
                                aVar2.j();
                                return;
                            }
                            i.q("customFragment");
                            throw null;
                        }
                    }
                    str2 = null;
                    bVar = this.f10605y;
                    if (bVar == null) {
                    }
                } else {
                    i.q("fragmentManager");
                    throw null;
                }
            } else if (getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                getIntent().putExtra(Constants.NEW_COURSE_FLAG, false);
                t0();
                return;
            } else if (getIntent().getIntExtra("daymodel_position", -1) == 28 && !i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION) && !this.Q && this.J == -1) {
                this.Q = true;
                y yVar3 = this.f10604x;
                if (yVar3 != null) {
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(yVar3);
                    this.f10605y = new jq.b();
                    z0(Integer.valueOf((int) R.color.transparent), true);
                    y0(aVar3, true, true);
                    rr.b bVar4 = this.f10605y;
                    if (bVar4 != null) {
                        aVar3.f(R.id.initialAssessmentMainContainer, bVar4, null);
                        aVar3.j();
                        return;
                    }
                    i.q("customFragment");
                    throw null;
                }
                i.q("fragmentManager");
                throw null;
            } else {
                final Course courseById2 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                if (!this.G && this.J == -1) {
                    z0(null, true);
                    if (this.A < this.f10606z.get(this.B).size()) {
                        str = "course";
                    } else {
                        this.A = 0;
                        this.B++;
                        str = "course";
                        new Handler().postDelayed(new Runnable(this) { // from class: hk.k

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ InitialAssessmentActivity f17649v;

                            {
                                this.f17649v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                RobertoTextView robertoTextView;
                                ProgressBar progressBar;
                                RobertoTextView robertoTextView2;
                                ProgressBar progressBar2;
                                int i6 = r3;
                                Course course = courseById2;
                                InitialAssessmentActivity this$0 = this.f17649v;
                                switch (i6) {
                                    case 0:
                                        int i10 = InitialAssessmentActivity.T;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                        if (progressBar3 != null) {
                                            progressBar3.setProgress(0);
                                        }
                                        if (this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions() != null && (progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar)) != null) {
                                            Integer totalQuestions2 = this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions();
                                            kotlin.jvm.internal.i.d(totalQuestions2);
                                            progressBar2.setMax(totalQuestions2.intValue() * 20);
                                        }
                                        int i11 = this$0.B;
                                        if (i11 != 1) {
                                            if (i11 == 2 && (robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle)) != null) {
                                                robertoTextView2.setText(this$0.getString(R.string.globalAssessment));
                                                return;
                                            }
                                            return;
                                        } else if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_SLEEP)) {
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setText(this$0.getString(R.string.IndicatorAssessment));
                                                return;
                                            }
                                            return;
                                        } else if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_HAPPINESS)) {
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setText(this$0.getString(R.string.factorAssessment));
                                                return;
                                            }
                                            return;
                                        } else {
                                            RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView5 != null) {
                                                robertoTextView5.setText(this$0.getString(R.string.symptomAssessment));
                                                return;
                                            }
                                            return;
                                        }
                                    default:
                                        int i12 = InitialAssessmentActivity.T;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                        if (progressBar4 != null) {
                                            progressBar4.setProgress(0);
                                        }
                                        if (this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions() != null && (progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar)) != null) {
                                            Integer totalQuestions22 = this$0.f10606z.get(this$0.B).get(this$0.A).getTotalQuestions();
                                            kotlin.jvm.internal.i.d(totalQuestions22);
                                            progressBar.setMax(totalQuestions22.intValue() * 20);
                                        }
                                        int i13 = this$0.B;
                                        if (i13 != 1) {
                                            if (i13 == 2 && (robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle)) != null) {
                                                robertoTextView.setText(this$0.getString(R.string.globalAssessment));
                                                return;
                                            }
                                            return;
                                        }
                                        String courseName = course.getCourseName();
                                        if (kotlin.jvm.internal.i.b(courseName, Constants.COURSE_SLEEP)) {
                                            RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView6 != null) {
                                                robertoTextView6.setText(this$0.getString(R.string.IndicatorAssessment));
                                                return;
                                            }
                                            return;
                                        } else if (kotlin.jvm.internal.i.b(courseName, Constants.COURSE_HAPPINESS)) {
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setText(this$0.getString(R.string.factorAssessment));
                                                return;
                                            }
                                            return;
                                        } else {
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setText(this$0.getString(R.string.symptomAssessment));
                                                return;
                                            }
                                            return;
                                        }
                                }
                            }
                        }, 550L);
                    }
                    y yVar4 = this.f10604x;
                    if (yVar4 != null) {
                        androidx.fragment.app.a d10 = yVar4.d();
                        try {
                            String flag2 = this.f10606z.get(this.B).get(this.A).getFlag();
                            int hashCode2 = flag2.hashCode();
                            if (hashCode2 != 81) {
                                if (hashCode2 != 83) {
                                    if (hashCode2 != 2091) {
                                        if (hashCode2 == 2654 && flag2.equals("SQ")) {
                                            y0(d10, true, false);
                                            this.f10605y = new o1();
                                            View view2 = this.H;
                                            if (view2 != null) {
                                                d10.c(view2, "response_transition");
                                            }
                                        }
                                    } else if (flag2.equals("AL")) {
                                        y0(d10, false, true);
                                        if (this.f10606z.get(this.B).get(this.A).getTotalQuestions() == null) {
                                            this.G = true;
                                            new Handler().postDelayed(new Runnable(this) { // from class: hk.l

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ InitialAssessmentActivity f17652v;

                                                {
                                                    this.f17652v = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i6 = r2;
                                                    InitialAssessmentActivity this$0 = this.f17652v;
                                                    switch (i6) {
                                                        case 0:
                                                            int i10 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar != null) {
                                                                progressBar.setVisibility(8);
                                                            }
                                                            RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView != null) {
                                                                robertoTextView.setVisibility(8);
                                                                return;
                                                            }
                                                            return;
                                                        case 1:
                                                            int i11 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar2 != null) {
                                                                progressBar2.setVisibility(4);
                                                            }
                                                            RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView2 != null) {
                                                                robertoTextView2.setVisibility(4);
                                                                return;
                                                            }
                                                            return;
                                                        case 2:
                                                            int i12 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar3 != null) {
                                                                progressBar3.setVisibility(8);
                                                            }
                                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView3 != null) {
                                                                robertoTextView3.setVisibility(8);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            int i13 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar4 != null) {
                                                                progressBar4.setVisibility(4);
                                                            }
                                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView4 != null) {
                                                                robertoTextView4.setVisibility(4);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            }, 550L);
                                        } else {
                                            Integer totalQuestions2 = this.f10606z.get(this.B).get(this.A).getTotalQuestions();
                                            i.d(totalQuestions2);
                                            totalQuestions2.intValue();
                                            new Handler().postDelayed(new Runnable(this) { // from class: hk.l

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ InitialAssessmentActivity f17652v;

                                                {
                                                    this.f17652v = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i6 = r2;
                                                    InitialAssessmentActivity this$0 = this.f17652v;
                                                    switch (i6) {
                                                        case 0:
                                                            int i10 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar != null) {
                                                                progressBar.setVisibility(8);
                                                            }
                                                            RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView != null) {
                                                                robertoTextView.setVisibility(8);
                                                                return;
                                                            }
                                                            return;
                                                        case 1:
                                                            int i11 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar2 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar2 != null) {
                                                                progressBar2.setVisibility(4);
                                                            }
                                                            RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView2 != null) {
                                                                robertoTextView2.setVisibility(4);
                                                                return;
                                                            }
                                                            return;
                                                        case 2:
                                                            int i12 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar3 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar3 != null) {
                                                                progressBar3.setVisibility(8);
                                                            }
                                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView3 != null) {
                                                                robertoTextView3.setVisibility(8);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            int i13 = InitialAssessmentActivity.T;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ProgressBar progressBar4 = (ProgressBar) this$0.u0(R.id.initialAssessmentProgressbar);
                                                            if (progressBar4 != null) {
                                                                progressBar4.setVisibility(4);
                                                            }
                                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.initialAssessmentTitle);
                                                            if (robertoTextView4 != null) {
                                                                robertoTextView4.setVisibility(4);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            }, 550L);
                                        }
                                        this.f10605y = new q1();
                                    }
                                } else if (flag2.equals("S")) {
                                    y0(d10, true, true);
                                    this.f10605y = new n1();
                                }
                            } else if (flag2.equals("Q")) {
                                y0(d10, false, true);
                                ((RobertoTextView) u0(R.id.initialAssessmentTitle)).setVisibility(0);
                                ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).setVisibility(0);
                                ObjectAnimator ofInt2 = ObjectAnimator.ofInt((ProgressBar) u0(R.id.initialAssessmentProgressbar), Constants.SCREEN_PROGRESS, ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).getProgress(), ((ProgressBar) u0(R.id.initialAssessmentProgressbar)).getProgress() + 20);
                                ofInt2.setDuration(500L);
                                ofInt2.setInterpolator(new LinearInterpolator());
                                ofInt2.start();
                                if (this.f10606z.get(this.B).get(this.A).getContainsSubquestions()) {
                                    h1Var = new d1();
                                } else {
                                    h1Var = new h1();
                                }
                                this.f10605y = h1Var;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str5, e11);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("index", this.A);
                        bundle2.putInt(Constants.SCREEN_PROGRESS, this.B);
                        bundle2.putString(str, courseById2.getCourseName());
                        bundle2.putString("question_type", this.f10606z.get(this.B).get(this.A).getQType());
                        bundle2.putString("symptom", this.f10606z.get(this.B).get(this.A).getTag());
                        bundle2.putString("slug", this.f10606z.get(this.B).get(this.A).getSlug());
                        rr.b bVar5 = this.f10605y;
                        if (bVar5 != null) {
                            bVar5.setArguments(bundle2);
                            rr.b bVar6 = this.f10605y;
                            if (bVar6 != null) {
                                d10.f(R.id.initialAssessmentMainContainer, bVar6, null);
                                d10.j();
                                return;
                            }
                            i.q("customFragment");
                            throw null;
                        }
                        i.q("customFragment");
                        throw null;
                    }
                    i.q("fragmentManager");
                    throw null;
                }
                this.I++;
                B0();
                return;
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str5, e12);
        }
        LogHelper.INSTANCE.e(str5, e12);
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.S;
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

    public final int v0() {
        int i6 = 0;
        try {
            Iterator<AssessmentResponse> it = this.C.getValues().iterator();
            while (it.hasNext()) {
                Integer value = it.next().getValue();
                i.d(value);
                i6 += value.intValue();
            }
            Iterator<AssessmentResponse> it2 = this.D.getValues().iterator();
            while (it2.hasNext()) {
                Integer value2 = it2.next().getValue();
                i.d(value2);
                i6 += value2.intValue();
            }
            Iterator<AssessmentResponse> it3 = this.E.getValues().iterator();
            while (it3.hasNext()) {
                Integer value3 = it3.next().getValue();
                i.d(value3);
                i6 += value3.intValue();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
        return i6;
    }

    public final boolean w0() {
        return this.M;
    }

    public final void x0() {
        this.A++;
    }

    public final void y0(androidx.fragment.app.a aVar, boolean z10, boolean z11) {
        try {
            if (z10 && z11) {
                aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            } else if (z10) {
                aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10603w, e10);
        }
    }

    public final void z0(Integer num, boolean z10) {
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                if (z10) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                } else {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
                }
                if (num != null) {
                    window.setStatusBarColor(g0.a.b(this, num.intValue()));
                    return;
                }
                return;
            }
            window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10603w, "Error in setting custom status bar", e10);
        }
    }
}

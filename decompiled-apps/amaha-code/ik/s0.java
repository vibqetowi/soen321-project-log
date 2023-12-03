package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentBuildingNewFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/s0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s0 extends rr.b {
    public static final /* synthetic */ int D = 0;
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public int f20296u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f20297v;

    /* renamed from: x  reason: collision with root package name */
    public ProgressDialog f20299x;

    /* renamed from: y  reason: collision with root package name */
    public a3.c f20300y;

    /* renamed from: z  reason: collision with root package name */
    public a3.c f20301z;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f20298w = LogHelper.INSTANCE.makeLogTag(s0.class);
    public final a B = new a();

    /* compiled from: InitialAssessmentBuildingNewFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
            if (com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getCourseById(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() == 15) goto L74;
         */
        @Override // android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onAnimationEnd(Animator animation) {
            boolean z10;
            s0 s0Var = s0.this;
            kotlin.jvm.internal.i.g(animation, "animation");
            try {
                androidx.fragment.app.p activity = s0Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                int i6 = ((InitialAssessmentActivity) activity).K;
                if (i6 != 0) {
                    z10 = (i6 == 1 && FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() == 30) ? true : true;
                    z10 = false;
                }
                androidx.fragment.app.p activity2 = s0Var.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (!((InitialAssessmentActivity) activity2).N && !z10) {
                    int i10 = s0Var.f20296u + 1;
                    s0Var.f20296u = i10;
                    if (i10 == 5) {
                        s0.M(s0Var, true);
                    }
                    int i11 = s0Var.f20296u;
                    if (i11 < 10) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView != null) {
                            lottieAnimationView.h();
                        }
                    } else if (i11 == 10) {
                        if (s0Var.f20300y != null) {
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                            if (lottieAnimationView2 != null) {
                                a3.c cVar = s0Var.f20300y;
                                if (cVar != null) {
                                    lottieAnimationView2.setComposition(cVar);
                                } else {
                                    kotlin.jvm.internal.i.q("failAnimation");
                                    throw null;
                                }
                            }
                        } else {
                            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                            if (lottieAnimationView3 != null) {
                                lottieAnimationView3.setAnimation(R.raw.plan_loading_fail);
                            }
                        }
                        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView4 != null) {
                            lottieAnimationView4.h();
                        }
                    } else if (i11 > 10) {
                        LottieAnimationView lottieAnimationView5 = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView5 != null) {
                            lottieAnimationView5.d();
                        }
                        s0.K(s0Var, true);
                        if (s0Var.A) {
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity3 = s0Var.getActivity();
                            String string = s0Var.getString(R.string.toastRetryErrorBuilding);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                            utils.showCustomToast(activity3, string, 1);
                            androidx.fragment.app.p activity4 = s0Var.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity4).n0();
                            return;
                        }
                        s0.J(s0Var, false);
                    }
                } else if (!s0Var.f20297v) {
                    if (s0Var.f20301z != null) {
                        LottieAnimationView lottieAnimationView6 = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                        a3.c cVar2 = s0Var.f20301z;
                        if (cVar2 != null) {
                            lottieAnimationView6.setComposition(cVar2);
                        } else {
                            kotlin.jvm.internal.i.q("successAnimation");
                            throw null;
                        }
                    } else {
                        ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.plan_loading_success);
                    }
                    if (s0Var.f20296u > 5) {
                        s0.M(s0Var, false);
                    }
                    ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).h();
                    s0Var.f20297v = true;
                } else {
                    ((RobertoTextView) s0Var._$_findCachedViewById(R.id.lateHeader)).setVisibility(8);
                    ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).d();
                    androidx.fragment.app.p activity5 = s0Var.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    if (((InitialAssessmentActivity) activity5).K == 0) {
                        ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).i();
                        s0.M(s0Var, false);
                        new Handler().postDelayed(new je.o(19, s0Var), 500L);
                        return;
                    }
                    s0.J(s0Var, true);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(s0Var.f20298w, e10);
            }
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

    public static final void J(s0 s0Var, boolean z10) {
        s0Var.getClass();
        if (z10) {
            try {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation);
                if (lottieAnimationView != null) {
                    lottieAnimationView.i();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(s0Var.f20298w, e10);
                return;
            }
        }
        RobertoButton robertoButton = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setVisibility(0);
        }
        RobertoButton robertoButton2 = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton2 != null) {
            robertoButton2.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA), "alpha", 0.0f, 1.0f);
        if (ofFloat != null) {
            ofFloat.setDuration(600L);
        }
        if (ofFloat != null) {
            ofFloat.setStartDelay(1000L);
        }
        if (ofFloat != null) {
            ofFloat.addListener(new r0(s0Var, ofFloat, z10));
        }
        if (ofFloat != null) {
            ofFloat.start();
        }
    }

    public static final void K(s0 s0Var, boolean z10) {
        s0Var.getClass();
        try {
            if (s0Var.isAdded()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.header), "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.subheader), "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(300L);
                t0 t0Var = new t0(s0Var, z10, ofFloat, ofFloat2);
                ofFloat.addListener(t0Var);
                ofFloat2.addListener(t0Var);
                ofFloat.start();
                ofFloat2.start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(s0Var.f20298w, e10);
        }
    }

    public static final void M(s0 s0Var, boolean z10) {
        if (s0Var.isAdded() && z10) {
            ((RobertoTextView) s0Var._$_findCachedViewById(R.id.lateHeader)).setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.lateHeader), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.lateHeader), "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addListener(new u0(s0Var, ofFloat2));
        ofFloat2.start();
    }

    public static final void O(s0 s0Var) {
        HashMap<String, Object> appConfig;
        String str = s0Var.f20298w;
        try {
            s0Var.A = true;
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = s0Var.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (utils.checkConnectivity((InitialAssessmentActivity) activity)) {
                Course courseByName = FirebasePersistence.getInstance().getCourseByName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                Object obj = null;
                int i6 = 0;
                if ((courseByName.getAssessments().size() == 1 && courseByName.getPlanV3().size() == 1) || (courseByName.getAssessments().size() == 2 && courseByName.getPlanV3().size() == 16)) {
                    ProgressDialog progressDialog = s0Var.f20299x;
                    if (progressDialog != null) {
                        progressDialog.show();
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        ArrayList k10 = ca.a.k(currentCourseName);
                        String a10 = FirebaseAuth.getInstance().a();
                        kotlin.jvm.internal.i.d(a10);
                        ((or.a) nr.b.a(or.a.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/retryFetch", new CourseResetModel(k10, a10)).I(new v0(s0Var));
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } else {
                    try {
                        ProgressDialog progressDialog2 = s0Var.f20299x;
                        if (progressDialog2 != null) {
                            progressDialog2.dismiss();
                            ((RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                            s0Var.f20296u = 0;
                            ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.plan_loading_loop);
                            ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).h();
                            s0Var.P();
                        } else {
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                }
                if (courseByName.getAssessments().size() != 1) {
                    i6 = 15;
                }
                Bundle bundle = new Bundle();
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle.putInt("day", i6);
                bundle.putString("source", "assessment");
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                }
                bundle.putString("variant", (String) obj);
                gk.a.b(bundle, "plan_fetch_retry");
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
        if (((com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity) r0).P != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (((com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity) r0).P != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        String str;
        if (isAdded()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity).K != 0) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity2).K == 1) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                }
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.header);
            String g5 = defpackage.b.g();
            if (g5 != null) {
                switch (g5.hashCode()) {
                    case -2114782937:
                        if (g5.equals(Constants.COURSE_HAPPINESS)) {
                            str = getString(R.string.personalisedAssessmentLoadingHappiness);
                            break;
                        }
                        break;
                    case -1617042330:
                        if (g5.equals(Constants.COURSE_DEPRESSION)) {
                            str = getString(R.string.personalisedAssessmentLoadingDepression);
                            break;
                        }
                        break;
                    case -891989580:
                        if (g5.equals(Constants.COURSE_STRESS)) {
                            str = getString(R.string.personalisedAssessmentLoadingStress);
                            break;
                        }
                        break;
                    case 92960775:
                        if (g5.equals(Constants.COURSE_ANGER)) {
                            str = getString(R.string.personalisedAssessmentLoadingAnger);
                            break;
                        }
                        break;
                    case 109522647:
                        if (g5.equals(Constants.COURSE_SLEEP)) {
                            str = getString(R.string.personalisedAssessmentLoadingSleep);
                            break;
                        }
                        break;
                    case 113319009:
                        if (g5.equals(Constants.COURSE_WORRY)) {
                            str = getString(R.string.personalisedAssessmentLoadingWorry);
                            break;
                        }
                        break;
                }
                robertoTextView.setText(str);
                ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.personalisedAssessmentLoadingHeader));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
            }
            str = "";
            robertoTextView.setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.personalisedAssessmentLoadingHeader));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
        }
        if (isAdded()) {
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity4).K != 1) {
                androidx.fragment.app.p activity5 = getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity5).K == 2) {
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.personalisedAssessmentLoadingPlanHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.personalisedAssessmentLoadingPlanSubheader));
        }
        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_building_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ProgressDialog progressDialog = new ProgressDialog(requireContext());
        this.f20299x = progressDialog;
        progressDialog.setMessage("Loading...");
        ProgressDialog progressDialog2 = this.f20299x;
        if (progressDialog2 != null) {
            progressDialog2.setCancelable(false);
            try {
                if (Build.VERSION.SDK_INT < 25) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.loadingAnimation);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                    }
                } else {
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.loadingAnimation);
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setRenderMode(a3.t.HARDWARE);
                    }
                }
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity;
                a3.d.f(initialAssessmentActivity, a3.d.h(R.raw.plan_loading_fail, initialAssessmentActivity), R.raw.plan_loading_fail).b(new a3.m(this) { // from class: ik.p0

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ s0 f20270b;

                    {
                        this.f20270b = this;
                    }

                    @Override // a3.m
                    public final void onResult(Object obj) {
                        int i6 = r2;
                        s0 this$0 = this.f20270b;
                        switch (i6) {
                            case 0:
                                a3.c cVar = (a3.c) obj;
                                int i10 = s0.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar != null) {
                                    this$0.f20300y = cVar;
                                    return;
                                }
                                return;
                            default:
                                a3.c cVar2 = (a3.c) obj;
                                int i11 = s0.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar2 != null) {
                                    this$0.f20301z = cVar2;
                                    return;
                                }
                                return;
                        }
                    }
                });
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                InitialAssessmentActivity initialAssessmentActivity2 = (InitialAssessmentActivity) activity2;
                a3.d.f(initialAssessmentActivity2, a3.d.h(R.raw.plan_loading_success, initialAssessmentActivity2), R.raw.plan_loading_success).b(new a3.m(this) { // from class: ik.p0

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ s0 f20270b;

                    {
                        this.f20270b = this;
                    }

                    @Override // a3.m
                    public final void onResult(Object obj) {
                        int i6 = r2;
                        s0 this$0 = this.f20270b;
                        switch (i6) {
                            case 0:
                                a3.c cVar = (a3.c) obj;
                                int i10 = s0.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar != null) {
                                    this$0.f20300y = cVar;
                                    return;
                                }
                                return;
                            default:
                                a3.c cVar2 = (a3.c) obj;
                                int i11 = s0.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar2 != null) {
                                    this$0.f20301z = cVar2;
                                    return;
                                }
                                return;
                        }
                    }
                });
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f20298w, e10);
            }
            ((LottieAnimationView) _$_findCachedViewById(R.id.loadingAnimation)).c(this.B);
            P();
            return;
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }
}

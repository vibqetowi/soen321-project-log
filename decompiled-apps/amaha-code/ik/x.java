package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/x;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x extends rr.b {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public ProgressDialog B;
    public a3.c C;
    public a3.c D;
    public boolean E;
    public boolean F;
    public final boolean G;
    public final boolean H;
    public final a I;

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20326v;

    /* renamed from: w  reason: collision with root package name */
    public int f20327w;

    /* renamed from: x  reason: collision with root package name */
    public int f20328x;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20325u = LogHelper.INSTANCE.makeLogTag(x.class);

    /* renamed from: y  reason: collision with root package name */
    public final int f20329y = 15;

    /* renamed from: z  reason: collision with root package name */
    public final int f20330z = 8;

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
        /* renamed from: ik.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0303a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ x f20332u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0303a(x xVar) {
                super(0);
                this.f20332u = xVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                int size;
                boolean z10;
                boolean z11;
                x xVar = this.f20332u;
                if (!xVar.G ? !((size = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getAssessments().size()) == 1 ? FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() != 15 : size != 2 || FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() != 30) : !FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanSuggested().isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str = xVar.f20325u;
                int i6 = xVar.f20330z;
                if (!z10) {
                    int i10 = xVar.f20328x + 1;
                    xVar.f20328x = i10;
                    if (i10 == i6) {
                        xVar.K(true);
                    }
                    int i11 = xVar.f20328x;
                    int i12 = xVar.f20329y;
                    if (i11 < i12) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView != null) {
                            lottieAnimationView.h();
                        }
                    } else if (i11 == i12) {
                        if (xVar.C != null) {
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                            if (lottieAnimationView2 != null) {
                                a3.c cVar = xVar.C;
                                if (cVar != null) {
                                    lottieAnimationView2.setComposition(cVar);
                                } else {
                                    kotlin.jvm.internal.i.q("failAnimation");
                                    throw null;
                                }
                            }
                        } else {
                            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                            if (lottieAnimationView3 != null) {
                                lottieAnimationView3.setAnimation(R.raw.expt_plan_failure);
                            }
                        }
                        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView4 != null) {
                            lottieAnimationView4.h();
                        }
                    } else if (i11 > i12) {
                        LottieAnimationView lottieAnimationView5 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                        if (lottieAnimationView5 != null) {
                            lottieAnimationView5.d();
                        }
                        xVar.J(true);
                        if (xVar.E) {
                            Bundle arguments = xVar.getArguments();
                            if (arguments != null && arguments.getBoolean("forceLoadPlan")) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (xVar.F) {
                                    AssessmentListener assessmentListener = xVar.f20326v;
                                    if (assessmentListener != null) {
                                        String string = xVar.getString(R.string.toastRetryErrorBuilding);
                                        kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                                        assessmentListener.onError(string);
                                    }
                                } else {
                                    UtilsKt.logError$default(str, null, new w(xVar, false), 2, null);
                                    xVar.F = true;
                                }
                            } else {
                                AssessmentListener assessmentListener2 = xVar.f20326v;
                                if (assessmentListener2 != null) {
                                    String string2 = xVar.getString(R.string.toastRetryErrorBuilding);
                                    kotlin.jvm.internal.i.f(string2, "getString(R.string.toastRetryErrorBuilding)");
                                    assessmentListener2.onError(string2);
                                }
                            }
                        } else {
                            UtilsKt.logError$default(str, null, new w(xVar, false), 2, null);
                        }
                    }
                } else if (!xVar.A) {
                    if (xVar.D != null) {
                        LottieAnimationView lottieAnimationView6 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                        a3.c cVar2 = xVar.D;
                        if (cVar2 != null) {
                            lottieAnimationView6.setComposition(cVar2);
                        } else {
                            kotlin.jvm.internal.i.q("successAnimation");
                            throw null;
                        }
                    } else {
                        ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.expt_plan_success);
                    }
                    if (xVar.f20328x > i6) {
                        xVar.K(false);
                    }
                    ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).h();
                    xVar.A = true;
                } else {
                    ((RobertoTextView) xVar._$_findCachedViewById(R.id.lateHeader)).setVisibility(8);
                    ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).d();
                    if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getAssessments().size() == 1) {
                        ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).i();
                        xVar.K(false);
                        new Handler().postDelayed(new je.o(17, xVar), 500L);
                    } else {
                        UtilsKt.logError$default(str, null, new w(xVar, true), 2, null);
                    }
                }
                return hs.k.f19476a;
            }
        }

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            x xVar = x.this;
            UtilsKt.logError$default(xVar.f20325u, null, new C0303a(xVar), 2, null);
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

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f20334v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10) {
            super(0);
            this.f20334v = z10;
        }

        @Override // ss.a
        public final hs.k invoke() {
            x xVar = x.this;
            if (xVar.isAdded()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) xVar._$_findCachedViewById(R.id.header), "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) xVar._$_findCachedViewById(R.id.subheader), "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(300L);
                y yVar = new y(xVar, this.f20334v, ofFloat, ofFloat2);
                ofFloat.addListener(yVar);
                ofFloat2.addListener(yVar);
                ofFloat.start();
                ofFloat2.start();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f20336b;

        public c(ObjectAnimator objectAnimator) {
            this.f20336b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            RobertoTextView robertoTextView = (RobertoTextView) x.this._$_findCachedViewById(R.id.lateHeader);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            ObjectAnimator objectAnimator = this.f20336b;
            if (objectAnimator != null) {
                objectAnimator.removeListener(this);
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

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            x xVar = x.this;
            ProgressDialog progressDialog = new ProgressDialog(xVar.requireContext());
            xVar.B = progressDialog;
            progressDialog.setMessage("Loading...");
            ProgressDialog progressDialog2 = xVar.B;
            if (progressDialog2 != null) {
                progressDialog2.setCancelable(false);
                if (Build.VERSION.SDK_INT < 25) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                    }
                } else {
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setRenderMode(a3.t.HARDWARE);
                    }
                }
                a3.d.e(R.raw.expt_plan_failure, xVar.requireContext()).b(new z(0, xVar));
                boolean z10 = true;
                a3.d.e(R.raw.expt_plan_success, xVar.requireContext()).b(new z(1, xVar));
                ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).c(xVar.I);
                xVar.M();
                Bundle arguments = xVar.getArguments();
                if ((arguments == null || !arguments.getBoolean("forceLoadPlan")) ? false : false) {
                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation);
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.g();
                    }
                    UtilsKt.logError$default(xVar.f20325u, null, new c0(xVar), 2, null);
                }
                if (xVar.H) {
                    kk.b bVar = (kk.b) new androidx.lifecycle.o0(xVar, new kk.c(new s5(10), MyApplication.V.a())).a(kk.b.class);
                    bVar.getClass();
                    ta.v.H(kc.f.H(bVar), kotlinx.coroutines.o0.f23642c, 0, new kk.a(bVar, null), 2);
                }
                androidx.fragment.app.p requireActivity = xVar.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
                int i6 = ExptInitialAssessmentActivity.f10582f0;
                ((ExptInitialAssessmentActivity) requireActivity).w0(null, false);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (kotlin.jvm.internal.i.b(r0 != null ? r0.get(com.theinnerhour.b2b.utils.Constants.DASHBOARD_LIBRARY_EXPERIMENT) : null, "variant_b") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x() {
        boolean z10;
        User user;
        boolean z11;
        boolean z12;
        Object obj;
        User user2 = FirebasePersistence.getInstance().getUser();
        boolean z13 = true;
        boolean z14 = false;
        if (user2 != null) {
            HashMap<String, Object> appConfig = user2.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                HashMap<String, Object> appConfig2 = user2.getAppConfig();
                if (appConfig2 != null) {
                    obj = appConfig2.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (!kotlin.jvm.internal.i.b(obj, "default")) {
                    z10 = true;
                    this.G = z10;
                    user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        HashMap<String, Object> appConfig3 = user.getAppConfig();
                        if (appConfig3 != null && appConfig3.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            HashMap<String, Object> appConfig4 = user.getAppConfig();
                        }
                        z13 = false;
                        z14 = z13;
                    }
                    this.H = z14;
                    this.I = new a();
                }
            }
        }
        z10 = false;
        this.G = z10;
        user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
        }
        this.H = z14;
        this.I = new a();
    }

    public final void J(boolean z10) {
        UtilsKt.logError$default(this.f20325u, null, new b(z10), 2, null);
    }

    public final void K(boolean z10) {
        if (isAdded() && z10) {
            ((RobertoTextView) _$_findCachedViewById(R.id.lateHeader)).setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.lateHeader), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.lateHeader), "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addListener(new c(ofFloat2));
        ofFloat2.start();
    }

    public final void M() {
        if (this.f20327w == 0) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.subheader);
            if (robertoTextView != null) {
                Extensions.INSTANCE.gone(robertoTextView);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.header);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(getString(R.string.exptPlanLoadingSubTitle));
            }
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.continueCTA);
            if (robertoButton != null) {
                robertoButton.setText(getString(R.string.continue_text));
            }
        } else {
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.header);
            if (robertoTextView3 != null) {
                robertoTextView3.setText(getString(R.string.personalisedAssessmentLoadingPlanHeader));
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.subheader);
            if (robertoTextView4 != null) {
                Extensions.INSTANCE.visible(robertoTextView4);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.subheader);
            if (robertoTextView5 != null) {
                robertoTextView5.setText(getString(R.string.personalisedAssessmentLoadingPlanSubheader));
            }
        }
        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.continue_text));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof AssessmentListener) {
            this.f20326v = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i6;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("course");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i6 = arguments2.getInt("dayPlanPosition");
        } else {
            i6 = 0;
        }
        this.f20327w = i6;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_plan_loading, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        UtilsKt.logError$default(this.f20325u, null, new d(), 2, null);
    }
}

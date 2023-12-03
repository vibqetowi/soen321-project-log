package ho;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.network.model.RequestStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ProSubmitFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/c0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c0 extends rr.b {
    public static final /* synthetic */ int E = 0;
    public a3.c A;
    public a3.c B;

    /* renamed from: v  reason: collision with root package name */
    public ProInitialAssessmentActivity f17979v;

    /* renamed from: w  reason: collision with root package name */
    public int f17980w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f17981x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f17982y;

    /* renamed from: z  reason: collision with root package name */
    public a3.c f17983z;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17978u = LogHelper.INSTANCE.makeLogTag(c0.class);
    public final a C = new a();

    /* compiled from: ProSubmitFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* compiled from: ProSubmitFragment.kt */
        /* renamed from: ho.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0288a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17985a;

            static {
                int[] iArr = new int[RequestStatus.values().length];
                try {
                    iArr[RequestStatus.REQUEST_LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RequestStatus.REQUEST_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RequestStatus.REQUEST_FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f17985a = iArr;
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
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            c0 c0Var = c0.this;
            kotlin.jvm.internal.i.g(animation, "animation");
            try {
                ProInitialAssessmentActivity proInitialAssessmentActivity = c0Var.f17979v;
                if (proInitialAssessmentActivity != null) {
                    RequestStatus requestStatus = proInitialAssessmentActivity.C;
                    if (requestStatus != null) {
                        int i6 = C0288a.f17985a[requestStatus.ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    if (!c0Var.f17982y) {
                                        c0Var.f17982y = true;
                                        c0Var.f17980w++;
                                        if (c0Var.A != null && (lottieAnimationView2 = (LottieAnimationView) c0Var._$_findCachedViewById(R.id.proSubmitAnimation)) != null) {
                                            a3.c cVar = c0Var.A;
                                            if (cVar != null) {
                                                lottieAnimationView2.setComposition(cVar);
                                            } else {
                                                kotlin.jvm.internal.i.q("failAnimation");
                                                throw null;
                                            }
                                        }
                                        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) c0Var._$_findCachedViewById(R.id.proSubmitAnimation);
                                        if (lottieAnimationView3 != null) {
                                            lottieAnimationView3.h();
                                            return;
                                        }
                                        return;
                                    } else if (c0Var.f17980w > 3) {
                                        c0.K(c0Var);
                                        return;
                                    } else {
                                        c0.J(c0Var);
                                        return;
                                    }
                                }
                                return;
                            } else if (!c0Var.f17981x) {
                                c0Var.f17981x = true;
                                if (c0Var.B != null && (lottieAnimationView = (LottieAnimationView) c0Var._$_findCachedViewById(R.id.proSubmitAnimation)) != null) {
                                    a3.c cVar2 = c0Var.B;
                                    if (cVar2 != null) {
                                        lottieAnimationView.setComposition(cVar2);
                                    } else {
                                        kotlin.jvm.internal.i.q("successAnimation");
                                        throw null;
                                    }
                                }
                                c0.M(c0Var);
                                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) c0Var._$_findCachedViewById(R.id.proSubmitAnimation);
                                if (lottieAnimationView4 != null) {
                                    lottieAnimationView4.h();
                                    return;
                                }
                                return;
                            } else {
                                ProInitialAssessmentActivity proInitialAssessmentActivity2 = c0Var.f17979v;
                                if (proInitialAssessmentActivity2 != null) {
                                    proInitialAssessmentActivity2.t0();
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                        }
                        LottieAnimationView lottieAnimationView5 = (LottieAnimationView) c0Var._$_findCachedViewById(R.id.proSubmitAnimation);
                        if (lottieAnimationView5 != null) {
                            lottieAnimationView5.h();
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("requestStatus");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.f17978u, e10);
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

    public static final void J(c0 c0Var) {
        c0Var.getClass();
        try {
            RobertoButton robertoButton = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton != null) {
                robertoButton.setVisibility(0);
            }
            RobertoButton robertoButton2 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton2 != null) {
                robertoButton2.setText(c0Var.getString(R.string.proTherapistRetryCTA));
            }
            RobertoButton robertoButton3 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton3 != null) {
                robertoButton3.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(c0Var.getString(R.string.proTherapistFailureText1));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta), "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            if (ofFloat != null) {
                ofFloat.start();
            }
            if (ofFloat2 != null) {
                ofFloat2.setDuration(1000L);
            }
            if (ofFloat2 != null) {
                ofFloat2.start();
            }
            RobertoButton robertoButton4 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton4 != null) {
                robertoButton4.setOnClickListener(new a0(c0Var, 1));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.f17978u, e10);
        }
    }

    public static final void K(c0 c0Var) {
        c0Var.getClass();
        try {
            RobertoButton robertoButton = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton != null) {
                robertoButton.setVisibility(0);
            }
            RobertoTextView robertoTextView = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(c0Var.getString(R.string.proTherapistFailureText2));
            }
            RobertoButton robertoButton2 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton2 != null) {
                robertoButton2.setText(c0Var.getString(R.string.proTherapistGoBackCTA));
            }
            RobertoButton robertoButton3 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton3 != null) {
                robertoButton3.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta), "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            if (ofFloat != null) {
                ofFloat.start();
            }
            if (ofFloat2 != null) {
                ofFloat2.setDuration(1000L);
            }
            if (ofFloat2 != null) {
                ofFloat2.start();
            }
            RobertoButton robertoButton4 = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton4 != null) {
                robertoButton4.setOnClickListener(new a0(c0Var, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.f17978u, e10);
        }
    }

    public static final void M(c0 c0Var) {
        c0Var.getClass();
        try {
            RobertoButton robertoButton = (RobertoButton) c0Var._$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton != null) {
                robertoButton.setVisibility(8);
            }
            RobertoTextView robertoTextView = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(c0Var.getString(R.string.proTherapistSuccessText));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) c0Var._$_findCachedViewById(R.id.tvProSubmitLoadingSubtext), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            if (ofFloat != null) {
                ofFloat.start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.f17978u, e10);
        }
    }

    public final void O() {
        try {
            this.f17982y = false;
            if (this.B != null) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.proSubmitAnimation);
                if (lottieAnimationView != null) {
                    a3.c cVar = this.f17983z;
                    if (cVar != null) {
                        lottieAnimationView.setComposition(cVar);
                    } else {
                        kotlin.jvm.internal.i.q("searchAnimation");
                        throw null;
                    }
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.proSubmitAnimation);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.h();
                }
            }
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnProSubmitIntroCta);
            if (robertoButton != null) {
                robertoButton.setVisibility(8);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(getString(R.string.proTherapistSearchingText));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitLoadingSubtext);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitLoadingSubtext), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            if (ofFloat != null) {
                ofFloat.start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17978u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
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
        return inflater.inflate(R.layout.fragment_pro_submit, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.proSubmitAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.g();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17978u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        LottieAnimationView lottieAnimationView;
        super.onResume();
        try {
            if (!this.f17981x && !this.f17982y && (lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.proSubmitAnimation)) != null) {
                lottieAnimationView.h();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17978u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ProInitialAssessmentActivity proInitialAssessmentActivity;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
        ProInitialAssessmentActivity proInitialAssessmentActivity2 = (ProInitialAssessmentActivity) requireActivity;
        this.f17979v = proInitialAssessmentActivity2;
        try {
            a3.d.f(proInitialAssessmentActivity2, a3.d.h(R.raw.pro_therapist_search, proInitialAssessmentActivity2), R.raw.pro_therapist_search).b(new a3.m(this) { // from class: ho.b0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ c0 f17971b;

                {
                    this.f17971b = this;
                }

                @Override // a3.m
                public final void onResult(Object obj) {
                    int i6 = r2;
                    c0 this$0 = this.f17971b;
                    switch (i6) {
                        case 0:
                            a3.c cVar = (a3.c) obj;
                            int i10 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar != null) {
                                this$0.f17983z = cVar;
                                return;
                            }
                            return;
                        case 1:
                            a3.c cVar2 = (a3.c) obj;
                            int i11 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar2 != null) {
                                this$0.A = cVar2;
                                return;
                            }
                            return;
                        default:
                            a3.c cVar3 = (a3.c) obj;
                            int i12 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar3 != null) {
                                this$0.B = cVar3;
                                return;
                            }
                            return;
                    }
                }
            });
            proInitialAssessmentActivity = this.f17979v;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17978u, e10);
        }
        if (proInitialAssessmentActivity != null) {
            a3.d.f(proInitialAssessmentActivity, a3.d.h(R.raw.pro_therapist_failure, proInitialAssessmentActivity), R.raw.pro_therapist_failure).b(new a3.m(this) { // from class: ho.b0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ c0 f17971b;

                {
                    this.f17971b = this;
                }

                @Override // a3.m
                public final void onResult(Object obj) {
                    int i6 = r2;
                    c0 this$0 = this.f17971b;
                    switch (i6) {
                        case 0:
                            a3.c cVar = (a3.c) obj;
                            int i10 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar != null) {
                                this$0.f17983z = cVar;
                                return;
                            }
                            return;
                        case 1:
                            a3.c cVar2 = (a3.c) obj;
                            int i11 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar2 != null) {
                                this$0.A = cVar2;
                                return;
                            }
                            return;
                        default:
                            a3.c cVar3 = (a3.c) obj;
                            int i12 = c0.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (cVar3 != null) {
                                this$0.B = cVar3;
                                return;
                            }
                            return;
                    }
                }
            });
            ProInitialAssessmentActivity proInitialAssessmentActivity3 = this.f17979v;
            if (proInitialAssessmentActivity3 != null) {
                a3.d.f(proInitialAssessmentActivity3, a3.d.h(R.raw.pro_therapist_success, proInitialAssessmentActivity3), R.raw.pro_therapist_success).b(new a3.m(this) { // from class: ho.b0

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ c0 f17971b;

                    {
                        this.f17971b = this;
                    }

                    @Override // a3.m
                    public final void onResult(Object obj) {
                        int i6 = r2;
                        c0 this$0 = this.f17971b;
                        switch (i6) {
                            case 0:
                                a3.c cVar = (a3.c) obj;
                                int i10 = c0.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar != null) {
                                    this$0.f17983z = cVar;
                                    return;
                                }
                                return;
                            case 1:
                                a3.c cVar2 = (a3.c) obj;
                                int i11 = c0.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar2 != null) {
                                    this$0.A = cVar2;
                                    return;
                                }
                                return;
                            default:
                                a3.c cVar3 = (a3.c) obj;
                                int i12 = c0.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (cVar3 != null) {
                                    this$0.B = cVar3;
                                    return;
                                }
                                return;
                        }
                    }
                });
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.proSubmitAnimation);
                if (lottieAnimationView != null) {
                    lottieAnimationView.c(this.C);
                }
                O();
                ProInitialAssessmentActivity proInitialAssessmentActivity4 = this.f17979v;
                if (proInitialAssessmentActivity4 != null) {
                    proInitialAssessmentActivity4.w0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }
}

package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f20144v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20145w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f20146x;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f20148z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20143u = LogHelper.INSTANCE.makeLogTag("ExptInitialAssessmentA3VarBSelfCareFragment");

    /* renamed from: y  reason: collision with root package name */
    public final a f20147y = new a();

    /* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            String str;
            hs.k kVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            d dVar = d.this;
            dVar.f20144v++;
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = FirebasePersistence.getInstance().getUser();
            hs.k kVar2 = null;
            if (user != null) {
                str = user.getCurrentCourse();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Course courseById = firebasePersistence.getCourseById(str);
            if (courseById != null) {
                if (courseById.getPlanV3().size() > 1) {
                    d.J(dVar, true);
                    kVar = hs.k.f19476a;
                } else if (dVar.f20144v >= 5) {
                    if (dVar.f20145w) {
                        Toast.makeText(dVar.requireActivity(), dVar.getString(R.string.telecommunicationsError), 0).show();
                        dVar.requireActivity().finish();
                    } else {
                        d.J(dVar, false);
                    }
                    kVar = hs.k.f19476a;
                } else {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCareAnim);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.h();
                        kVar = hs.k.f19476a;
                    }
                }
                kVar2 = kVar;
            }
            if (kVar2 == null) {
                Toast.makeText(dVar.requireActivity(), dVar.getString(R.string.telecommunicationsError), 0).show();
                dVar.requireActivity().finish();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public static final void J(d dVar, boolean z10) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCareAnim);
        if (lottieAnimationView != null) {
            lottieAnimationView.i();
            lottieAnimationView.g();
        }
        if (z10) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCarePostLoadAnim);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setAnimation(R.raw.csa_a3_var_b_plan_success);
            }
            RobertoTextView robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvCsaA3OfferingSelfCareSuccessFooter);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoButton robertoButton = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareSuccessButton);
            if (robertoButton != null) {
                robertoButton.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvCsaA3OfferingSelfCareFailureFooter);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            RobertoButton robertoButton2 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
            if (robertoButton2 != null) {
                robertoButton2.setVisibility(8);
            }
        } else {
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCarePostLoadAnim);
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setAnimation(R.raw.csa_a3_var_b_plan_failure);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvCsaA3OfferingSelfCareSuccessFooter);
            if (robertoTextView3 != null) {
                robertoTextView3.setVisibility(8);
            }
            RobertoButton robertoButton3 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareSuccessButton);
            if (robertoButton3 != null) {
                robertoButton3.setVisibility(8);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvCsaA3OfferingSelfCareFailureFooter);
            if (robertoTextView4 != null) {
                robertoTextView4.setVisibility(0);
            }
            RobertoButton robertoButton4 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
            if (robertoButton4 != null) {
                robertoButton4.setVisibility(0);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCareLoaderContainer), "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.addListener(new e(dVar, z10, ofFloat));
        ofFloat.start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20148z;
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
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_a3_varb_sc, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20148z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        ScrollView svCsaA3OfferingParent = (ScrollView) _$_findCachedViewById(R.id.svCsaA3OfferingParent);
        kotlin.jvm.internal.i.f(svCsaA3OfferingParent, "svCsaA3OfferingParent");
        insetsUtils.addStatusBarHeight(svCsaA3OfferingParent);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCareAnim);
        if (lottieAnimationView != null) {
            lottieAnimationView.c(this.f20147y);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCareAnim);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.h();
        }
        CardView cardView = (CardView) _$_findCachedViewById(R.id.clCsaA3OfferingTeleConsultationContainer);
        if (cardView != null) {
            cardView.setOnClickListener(new c(this, 0));
        }
    }
}

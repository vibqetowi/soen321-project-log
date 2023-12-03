package zk;

import android.animation.Animator;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w5.i0;
import zk.g;
/* compiled from: ConditionSelectionNewOnBoardingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f39434z = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f39436v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f39437w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f39439y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public String f39435u = "";

    /* renamed from: x  reason: collision with root package name */
    public final a f39438x = new a();

    /* compiled from: ConditionSelectionNewOnBoardingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            RobertoTextView robertoTextView;
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            kotlin.jvm.internal.i.g(animation, "animation");
            final g gVar = g.this;
            int i6 = gVar.f39436v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3 && (robertoTextView = (RobertoTextView) gVar._$_findCachedViewById(R.id.csaFinishPromptSecondaryCta)) != null && (animate = robertoTextView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(900L)) != null) {
                            duration.setListener(this);
                            return;
                        }
                        return;
                    }
                    new Handler().postDelayed(new Runnable() { // from class: zk.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewPropertyAnimator animate2;
                            ViewPropertyAnimator alpha2;
                            ViewPropertyAnimator animate3;
                            ViewPropertyAnimator alpha3;
                            ViewPropertyAnimator duration2;
                            ViewPropertyAnimator animate4;
                            ViewPropertyAnimator alpha4;
                            ViewPropertyAnimator duration3;
                            ViewPropertyAnimator animate5;
                            ViewPropertyAnimator alpha5;
                            ViewPropertyAnimator duration4;
                            int i10 = r3;
                            g.a this$1 = this;
                            g this$0 = gVar;
                            switch (i10) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this$1, "this$1");
                                    RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                                    if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                        duration3.setListener(this$1);
                                    }
                                    this$0.f39436v++;
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this$1, "this$1");
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                                    if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                        duration4.setListener(this$1);
                                    }
                                    this$0.f39436v++;
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this$1, "this$1");
                                    RobertoButton robertoButton = (RobertoButton) this$0._$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
                                    if (robertoButton != null && (animate3 = robertoButton.animate()) != null && (alpha3 = animate3.alpha(1.0f)) != null && (duration2 = alpha3.setDuration(900L)) != null) {
                                        duration2.setListener(this$1);
                                    }
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.csaFinishBackCta);
                                    if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null) {
                                        alpha2.setDuration(900L);
                                    }
                                    this$0.f39436v++;
                                    return;
                            }
                        }
                    }, 1500L);
                    gVar.f39437w = true;
                    return;
                }
                new Handler().postDelayed(new Runnable() { // from class: zk.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewPropertyAnimator animate2;
                        ViewPropertyAnimator alpha2;
                        ViewPropertyAnimator animate3;
                        ViewPropertyAnimator alpha3;
                        ViewPropertyAnimator duration2;
                        ViewPropertyAnimator animate4;
                        ViewPropertyAnimator alpha4;
                        ViewPropertyAnimator duration3;
                        ViewPropertyAnimator animate5;
                        ViewPropertyAnimator alpha5;
                        ViewPropertyAnimator duration4;
                        int i10 = r3;
                        g.a this$1 = this;
                        g this$0 = gVar;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(this$1, "this$1");
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                                if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                    duration3.setListener(this$1);
                                }
                                this$0.f39436v++;
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(this$1, "this$1");
                                RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                                if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                    duration4.setListener(this$1);
                                }
                                this$0.f39436v++;
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(this$1, "this$1");
                                RobertoButton robertoButton = (RobertoButton) this$0._$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
                                if (robertoButton != null && (animate3 = robertoButton.animate()) != null && (alpha3 = animate3.alpha(1.0f)) != null && (duration2 = alpha3.setDuration(900L)) != null) {
                                    duration2.setListener(this$1);
                                }
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.csaFinishBackCta);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null) {
                                    alpha2.setDuration(900L);
                                }
                                this$0.f39436v++;
                                return;
                        }
                    }
                }, 700L);
                return;
            }
            new Handler().postDelayed(new Runnable() { // from class: zk.f
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator duration2;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator duration3;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator duration4;
                    int i10 = r3;
                    g.a this$1 = this;
                    g this$0 = gVar;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(this$1, "this$1");
                            RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                            if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                duration3.setListener(this$1);
                            }
                            this$0.f39436v++;
                            return;
                        case 1:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(this$1, "this$1");
                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                            if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                duration4.setListener(this$1);
                            }
                            this$0.f39436v++;
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(this$1, "this$1");
                            RobertoButton robertoButton = (RobertoButton) this$0._$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
                            if (robertoButton != null && (animate3 = robertoButton.animate()) != null && (alpha3 = animate3.alpha(1.0f)) != null && (duration2 = alpha3.setDuration(900L)) != null) {
                                duration2.setListener(this$1);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.csaFinishBackCta);
                            if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null) {
                                alpha2.setDuration(900L);
                            }
                            this$0.f39436v++;
                            return;
                    }
                }
            }, 450L);
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

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39439y;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        postponeEnterTransition();
        setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257).setDuration(600L));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_v2_assessment_prompt, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39439y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object obj;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        RobertoButton robertoButton;
        HashMap<String, Object> appConfig;
        Object obj2;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments != null) {
            str = arguments.getString("selectedCourse", Constants.COURSE_SLEEP);
        } else {
            str = null;
        }
        if (str == null) {
            str = Constants.COURSE_SLEEP;
        }
        this.f39435u = str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner);
        if (appCompatImageView != null) {
            appCompatImageView.setTransitionName(this.f39435u);
        }
        startPostponedEnterTransition();
        String str9 = this.f39435u;
        String str10 = "user";
        switch (str9.hashCode()) {
            case -2114782937:
                if (str9.equals(Constants.COURSE_HAPPINESS)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_happiness_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanHappinessTitle));
                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr = new Object[1];
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str2 = user.getFirstName();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str10 = str2;
                    }
                    objArr[0] = str10;
                    robertoTextView.setText(getString(R.string.csaVbCourseHappinessHeader, objArr));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseHappinessBody));
                    break;
                }
                break;
            case -1617042330:
                if (str9.equals(Constants.COURSE_DEPRESSION)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_depression_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanDepressionTitle));
                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr2 = new Object[1];
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str3 = user2.getFirstName();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str10 = str3;
                    }
                    objArr2[0] = str10;
                    robertoTextView2.setText(getString(R.string.csaVbCourseDepressionHeader, objArr2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseDepressionBody));
                    break;
                }
                break;
            case -891989580:
                if (str9.equals(Constants.COURSE_STRESS)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_stress_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanStressTitle));
                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr3 = new Object[1];
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str4 = user3.getFirstName();
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        str10 = str4;
                    }
                    objArr3[0] = str10;
                    robertoTextView3.setText(getString(R.string.csaVbCourseStressHeader, objArr3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseStressBody));
                    break;
                }
                break;
            case 109840:
                if (str9.equals(Constants.COURSE_OCD)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_ocd_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanOCDTitle));
                    RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr4 = new Object[1];
                    User user4 = FirebasePersistence.getInstance().getUser();
                    if (user4 != null) {
                        str5 = user4.getFirstName();
                    } else {
                        str5 = null;
                    }
                    if (str5 != null) {
                        str10 = str5;
                    }
                    objArr4[0] = str10;
                    robertoTextView4.setText(getString(R.string.csaVbCourseOCDHeader, objArr4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseOCDBody));
                    break;
                }
                break;
            case 2989151:
                if (str9.equals(Constants.COURSE_ADHD)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_adhd_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanADHDTitle));
                    RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr5 = new Object[1];
                    User user5 = FirebasePersistence.getInstance().getUser();
                    if (user5 != null) {
                        str6 = user5.getFirstName();
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        str10 = str6;
                    }
                    objArr5[0] = str10;
                    robertoTextView5.setText(getString(R.string.csaVbCourseADHDHeader, objArr5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseADHDBody));
                    break;
                }
                break;
            case 92960775:
                if (str9.equals(Constants.COURSE_ANGER)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_anger_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanAngerTitle));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1)).setText(getString(R.string.csaVbCourseAngerHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseAngerBody));
                    break;
                }
                break;
            case 109522647:
                if (str9.equals(Constants.COURSE_SLEEP)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_sleep_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanSleepTitle));
                    RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr6 = new Object[1];
                    User user6 = FirebasePersistence.getInstance().getUser();
                    if (user6 != null) {
                        str7 = user6.getFirstName();
                    } else {
                        str7 = null;
                    }
                    if (str7 != null) {
                        str10 = str7;
                    }
                    objArr6[0] = str10;
                    robertoTextView6.setText(getString(R.string.csaVbCourseSleepHeader, objArr6));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseSleepBody));
                    break;
                }
                break;
            case 113319009:
                if (str9.equals(Constants.COURSE_WORRY)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_anxiety_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanAnxietyTitle));
                    RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr7 = new Object[1];
                    User user7 = FirebasePersistence.getInstance().getUser();
                    if (user7 != null) {
                        str8 = user7.getFirstName();
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        str10 = str8;
                    }
                    objArr7[0] = str10;
                    robertoTextView7.setText(getString(R.string.csaVbCourseWorryHeader, objArr7));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseWorryBody));
                    break;
                }
                break;
        }
        p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSecondaryCta);
        if (robertoTextView8 != null) {
            robertoTextView8.setPaintFlags(robertoTextView8.getPaintFlags() | 8);
        }
        RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSecondaryCta);
        if (robertoTextView9 != null) {
            robertoTextView9.setVisibility(8);
        }
        RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
        if (robertoButton2 != null) {
            HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
            if (appConfig2 != null) {
                obj2 = appConfig2.get(Constants.NEW_COURSES_EXPERIMENT);
            } else {
                obj2 = null;
            }
            if (kotlin.jvm.internal.i.b(obj2, "variant_a")) {
                if (is.k.Q1(this.f39435u, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                    string = getString(R.string.depressionThoughtsIntroCTA);
                    robertoButton2.setText(string);
                }
            }
            string = getString(R.string.csaVbAssessmentCta);
            robertoButton2.setText(string);
        }
        RobertoButton robertoButton3 = (RobertoButton) _$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
        if (robertoButton3 != null) {
            robertoButton3.setOnClickListener(new i0(20, this));
        }
        User user8 = FirebasePersistence.getInstance().getUser();
        if (user8 != null && (appConfig = user8.getAppConfig()) != null) {
            obj = appConfig.get(Constants.A3_ONBOARDING_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = obj;
        }
        if (bool != null && bool.booleanValue() && (robertoButton = (RobertoButton) _$_findCachedViewById(R.id.csaFinishPromptPrimaryCta)) != null) {
            robertoButton.setBackgroundTintList(g0.a.c(R.color.title_high_contrast, requireContext()));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.csaFinishBackCta);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new e(requireActivity, 0));
        }
        RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader);
        if (robertoTextView10 != null && (animate = robertoTextView10.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(900L)) != null) {
            duration.setListener(this.f39438x);
        }
    }
}

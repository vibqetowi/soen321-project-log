package zk;

import android.animation.Animator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.j1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w5.i0;
import zk.j;
/* compiled from: ConditionSelectionV2AssessmentPromptFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzk/j;", "Lrr/b;", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b implements CourseApiUtil.CourseApiUtilInterface {
    public static final /* synthetic */ int D = 0;
    public boolean A;

    /* renamed from: v  reason: collision with root package name */
    public ProgressDialog f39448v;

    /* renamed from: w  reason: collision with root package name */
    public int f39449w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39451y;

    /* renamed from: z  reason: collision with root package name */
    public int f39452z;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f39447u = LogHelper.INSTANCE.makeLogTag(j.class);

    /* renamed from: x  reason: collision with root package name */
    public String f39450x = "";
    public final a B = new a();

    /* compiled from: ConditionSelectionV2AssessmentPromptFragment.kt */
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
            final j jVar = j.this;
            int i6 = jVar.f39452z;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3 && (robertoTextView = (RobertoTextView) jVar._$_findCachedViewById(R.id.csaFinishPromptSecondaryCta)) != null && (animate = robertoTextView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(900L)) != null) {
                            duration.setListener(this);
                            return;
                        }
                        return;
                    }
                    new Handler().postDelayed(new Runnable() { // from class: zk.i
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
                            j.a this$1 = this;
                            j this$0 = jVar;
                            switch (i10) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this$1, "this$1");
                                    RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                                    if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                        duration3.setListener(this$1);
                                    }
                                    this$0.f39452z++;
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this$1, "this$1");
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                                    if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                        duration4.setListener(this$1);
                                    }
                                    this$0.f39452z++;
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
                                    this$0.f39452z++;
                                    return;
                            }
                        }
                    }, 1500L);
                    jVar.A = true;
                    return;
                }
                new Handler().postDelayed(new Runnable() { // from class: zk.i
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
                        j.a this$1 = this;
                        j this$0 = jVar;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(this$1, "this$1");
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                                if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                    duration3.setListener(this$1);
                                }
                                this$0.f39452z++;
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(this$1, "this$1");
                                RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                                if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                    duration4.setListener(this$1);
                                }
                                this$0.f39452z++;
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
                                this$0.f39452z++;
                                return;
                        }
                    }
                }, 700L);
                return;
            }
            new Handler().postDelayed(new Runnable() { // from class: zk.i
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
                    j.a this$1 = this;
                    j this$0 = jVar;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(this$1, "this$1");
                            RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                            if (robertoTextView2 != null && (animate4 = robertoTextView2.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration3 = alpha4.setDuration(900L)) != null) {
                                duration3.setListener(this$1);
                            }
                            this$0.f39452z++;
                            return;
                        case 1:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(this$1, "this$1");
                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.csaFinishPromptSubheader2);
                            if (robertoTextView3 != null && (animate5 = robertoTextView3.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null && (duration4 = alpha5.setDuration(900L)) != null) {
                                duration4.setListener(this$1);
                            }
                            this$0.f39452z++;
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
                            this$0.f39452z++;
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

    public final void J(int i6, String str) {
        LogHelper.INSTANCE.i(this.f39447u, defpackage.c.r("assign programme ", str));
        this.f39449w = i6;
        Utils.INSTANCE.cancelNotifications();
        if (is.k.Q1(str, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            if (user != null) {
                user.setCurrentCourseName(str);
            }
            User user2 = firebasePersistence.getUser();
            if (user2 != null) {
                user2.setCurrentCourse(UtilsKt.getCourseId(str));
            }
            firebasePersistence.updateUserOnFirebase();
            if (kotlin.jvm.internal.i.b(str, Constants.COURSE_ADHD)) {
                firebasePersistence.setIsAdhdCourseActive();
            } else if (kotlin.jvm.internal.i.b(str, Constants.COURSE_OCD)) {
                firebasePersistence.setIsOcdCourseActive();
            }
            K();
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(requireContext());
        this.f39448v = progressDialog;
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        CourseApiUtil courseApiUtil = new CourseApiUtil();
        courseApiUtil.setCourseApiListener(this);
        CourseApiUtil.sendCourseApiRequest$default(courseApiUtil, str, null, 2, null);
    }

    public final void K() {
        Intent intent;
        Bundle bundle;
        Intent intent2;
        Intent intent3;
        int i6 = this.f39449w;
        Bundle bundle2 = null;
        if (i6 != 0) {
            if (i6 == 2) {
                ll.b bVar = new ll.b();
                p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                Intent a10 = bVar.a(requireActivity, false);
                p activity = getActivity();
                if (activity != null && (intent3 = activity.getIntent()) != null) {
                    bundle = intent3.getExtras();
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    p activity2 = getActivity();
                    if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                        bundle2 = intent2.getExtras();
                    }
                    kotlin.jvm.internal.i.d(bundle2);
                    a10.putExtras(bundle2);
                }
                startActivity(a10);
                p activity3 = getActivity();
                if (activity3 != null) {
                    activity3.finish();
                    return;
                }
                return;
            }
            return;
        }
        ll.b bVar2 = new ll.b();
        p requireActivity2 = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
        Intent a11 = bVar2.a(requireActivity2, false);
        p activity4 = getActivity();
        if (activity4 != null && (intent = activity4.getIntent()) != null) {
            bundle2 = intent.getExtras();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean(Constants.NEW_COURSE_FLAG, true);
        bundle2.putBoolean("onboarding_flow_new_user", !this.f39451y);
        a11.putExtras(bundle2);
        startActivity(a11);
        p activity5 = getActivity();
        if (activity5 != null) {
            activity5.finish();
        }
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

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void courseApiComplete(boolean z10) {
        String str = this.f39447u;
        try {
            if (isAdded()) {
                LogHelper.INSTANCE.i(str, "course api complete");
                ProgressDialog progressDialog = this.f39448v;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    K();
                    return;
                }
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception", e10);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void errorLoadingData(Exception error) {
        kotlin.jvm.internal.i.g(error, "error");
        try {
            LogHelper.INSTANCE.i(this.f39447u, error);
            if (ConnectionStatusReceiver.isConnected()) {
                Toast.makeText(requireContext(), "Oops! Please try again", 0).show();
            }
            if (isAdded()) {
                ProgressDialog progressDialog = this.f39448v;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("conditionselection", "exception in on error loading data", e10);
        }
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
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        RobertoTextView robertoTextView;
        int i6;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("selectedCourse", Constants.COURSE_SLEEP);
        } else {
            str = null;
        }
        if (str == null) {
            str = Constants.COURSE_SLEEP;
        }
        this.f39450x = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z10 = arguments2.getBoolean("existingUser", false);
        } else {
            z10 = false;
        }
        this.f39451y = z10;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner);
        if (appCompatImageView != null) {
            appCompatImageView.setTransitionName(this.f39450x);
        }
        startPostponedEnterTransition();
        String course = this.f39450x;
        kotlin.jvm.internal.i.g(course, "course");
        String str3 = "user";
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_happiness_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanHappinessTitle));
                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr = new Object[1];
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str2 = user.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr[0] = str3;
                    robertoTextView2.setText(getString(R.string.csaVbCourseHappinessHeader, objArr));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseHappinessBody));
                    break;
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_depression_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanDepressionTitle));
                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr2 = new Object[1];
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str2 = user2.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr2[0] = str3;
                    robertoTextView3.setText(getString(R.string.csaVbCourseDepressionHeader, objArr2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseDepressionBody));
                    break;
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_stress_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanStressTitle));
                    RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr3 = new Object[1];
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str2 = user3.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr3[0] = str3;
                    robertoTextView4.setText(getString(R.string.csaVbCourseStressHeader, objArr3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseStressBody));
                    break;
                }
                break;
            case 109840:
                if (course.equals(Constants.COURSE_OCD)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_ocd_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanOCDTitle));
                    RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr4 = new Object[1];
                    User user4 = FirebasePersistence.getInstance().getUser();
                    if (user4 != null) {
                        str2 = user4.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr4[0] = str3;
                    robertoTextView5.setText(getString(R.string.csaVbCourseOCDHeader, objArr4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseOCDBody));
                    break;
                }
                break;
            case 2989151:
                if (course.equals(Constants.COURSE_ADHD)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_adhd_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanADHDTitle));
                    RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr5 = new Object[1];
                    User user5 = FirebasePersistence.getInstance().getUser();
                    if (user5 != null) {
                        str2 = user5.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr5[0] = str3;
                    robertoTextView6.setText(getString(R.string.csaVbCourseADHDHeader, objArr5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVcCourseADHDBody));
                    break;
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_anger_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanAngerTitle));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1)).setText(getString(R.string.csaVbCourseAngerHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseAngerBody));
                    break;
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_sleep_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanSleepTitle));
                    RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr6 = new Object[1];
                    User user6 = FirebasePersistence.getInstance().getUser();
                    if (user6 != null) {
                        str2 = user6.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr6[0] = str3;
                    robertoTextView7.setText(getString(R.string.csaVbCourseSleepHeader, objArr6));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseSleepBody));
                    break;
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.csaFinishPromptBanner)).setImageResource(R.drawable.ic_csa_anxiety_banner);
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader)).setText(getString(R.string.assessmentPlanAnxietyTitle));
                    RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader1);
                    Object[] objArr7 = new Object[1];
                    User user7 = FirebasePersistence.getInstance().getUser();
                    if (user7 != null) {
                        str2 = user7.getFirstName();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    objArr7[0] = str3;
                    robertoTextView8.setText(getString(R.string.csaVbCourseWorryHeader, objArr7));
                    ((RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSubheader2)).setText(getString(R.string.csaVbCourseWorryBody));
                    break;
                }
                break;
        }
        p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSecondaryCta);
        if (robertoTextView9 != null) {
            robertoTextView9.setPaintFlags(robertoTextView9.getPaintFlags() | 8);
        }
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
        if (robertoButton != null) {
            if (is.k.Q1(this.f39450x, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                i6 = R.string.depressionThoughtsIntroCTA;
            } else {
                i6 = R.string.csaVbAssessmentCta;
            }
            robertoButton.setText(getString(i6));
        }
        RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
        if (robertoButton2 != null) {
            robertoButton2.setOnClickListener(new j1(this, 7, requireActivity));
        }
        RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSecondaryCta);
        if (robertoTextView10 != null) {
            robertoTextView10.setOnClickListener(new i0(22, this));
        }
        if (this.f39451y && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptSecondaryCta)) != null) {
            robertoTextView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.csaFinishBackCta);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new e(requireActivity, 1));
        }
        RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.csaFinishPromptHeader);
        if (robertoTextView11 != null && (animate = robertoTextView11.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(900L)) != null) {
            duration.setListener(this.B);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void notificationFetchComplete(boolean z10) {
    }
}

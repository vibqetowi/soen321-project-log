package zk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w5.i0;
/* compiled from: ConditionSelectionV4ChoiceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzk/l;", "Lrr/b;", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends rr.b implements CourseApiUtil.CourseApiUtilInterface {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public ProgressDialog f39460v;

    /* renamed from: w  reason: collision with root package name */
    public CourseApiUtil f39461w;

    /* renamed from: x  reason: collision with root package name */
    public al.a f39462x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f39463y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f39464z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f39459u = LogHelper.INSTANCE.makeLogTag(l.class);

    public l() {
        boolean z10;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39463y = z10;
    }

    public final void J(boolean z10) {
        try {
            if (z10) {
                ll.b bVar = new ll.b();
                p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                Intent a10 = bVar.a(requireActivity, false);
                Bundle extras = requireActivity().getIntent().getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.putBoolean(Constants.NEW_COURSE_FLAG, true);
                a10.putExtras(extras);
                startActivity(a10);
            } else {
                ll.b bVar2 = new ll.b();
                p requireActivity2 = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                Intent a11 = bVar2.a(requireActivity2, false);
                if (requireActivity().getIntent().getExtras() != null) {
                    Bundle extras2 = requireActivity().getIntent().getExtras();
                    kotlin.jvm.internal.i.d(extras2);
                    a11.putExtras(extras2);
                }
                startActivity(a11);
            }
            requireActivity().finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39459u, "condition selection", e10);
        }
    }

    public final void K(String str, LinearLayout linearLayout, int i6, int i10, String str2, boolean z10) {
        View inflate = getLayoutInflater().inflate(R.layout.row_condition_selection_v4, (ViewGroup) linearLayout, false);
        ((AppCompatImageView) inflate.findViewById(R.id.conditionImage)).setImageResource(i6);
        ((ConstraintLayout) inflate.findViewById(R.id.container)).setBackgroundColor(g0.a.b(requireContext(), i10));
        ((RobertoTextView) inflate.findViewById(R.id.conditionText)).setText(str2);
        inflate.setTransitionName(str);
        inflate.setOnClickListener(new k(z10, str, this, inflate, 0));
        linearLayout.addView(inflate);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39464z;
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
        ProgressDialog progressDialog = this.f39460v;
        if (progressDialog != null) {
            progressDialog.dismiss();
            J(z10);
            return;
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void errorLoadingData(Exception error) {
        String str = this.f39459u;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            LogHelper.INSTANCE.i(str, error);
            if (ConnectionStatusReceiver.isConnected()) {
                Toast.makeText(requireContext(), "Oops! Please try again", 0).show();
            }
            if (isAdded()) {
                ProgressDialog progressDialog = this.f39460v;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception in on error loading data", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        if (context instanceof al.a) {
            this.f39462x = (al.a) context;
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        postponeEnterTransition();
        setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_v4_choice, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39464z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        String str;
        String str2;
        int i6;
        boolean z11;
        boolean z12;
        Object obj;
        HashMap<String, Object> appConfig;
        String str3;
        String str4;
        AppCompatImageView appCompatImageView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ProgressDialog progressDialog = new ProgressDialog(requireContext());
        this.f39460v = progressDialog;
        progressDialog.setMessage("Loading...");
        ProgressDialog progressDialog2 = this.f39460v;
        String str5 = null;
        if (progressDialog2 != null) {
            progressDialog2.setCancelable(false);
            CourseApiUtil courseApiUtil = new CourseApiUtil();
            courseApiUtil.setCourseApiListener(this);
            this.f39461w = courseApiUtil;
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("existingUser", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str4 = user.getCurrentCourse();
                } else {
                    str4 = null;
                }
                if (str4 != null && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.conditionSelectionBack)) != null) {
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setOnClickListener(new i0(23, this));
                }
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("variant", Constants.ONBOARDING_VARIANT);
            } else {
                str = null;
            }
            if (str == null) {
                str = Constants.ONBOARDING_VARIANT;
            }
            String str6 = "user";
            if (kotlin.jvm.internal.i.b(str, Constants.ONBOARDING_VARIANT)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionTitle)).setText(getString(R.string.csaVbCourseSelectionHeader));
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionNewSubText);
                Object[] objArr = new Object[1];
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str3 = user2.getFirstName();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str6 = str3;
                }
                objArr[0] = str6;
                robertoTextView.setText(getString(R.string.csaVbCourseSelectionSubheader, objArr));
            } else {
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionTitle);
                Object[] objArr2 = new Object[1];
                User user3 = FirebasePersistence.getInstance().getUser();
                if (user3 != null) {
                    str2 = user3.getFirstName();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str6 = str2;
                }
                objArr2[0] = str6;
                robertoTextView2.setText(getString(R.string.csaVcCourseSelectionHeader, objArr2));
                ((RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionNewSubText)).setText(getString(R.string.csaVcCourseSelectionSubheader));
            }
            startPostponedEnterTransition();
            try {
                if (FirebasePersistence.getInstance().getUser().getDepression() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionNewCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer, "conditionSelectionNewCoursesContainer");
                    i6 = R.id.conditionSelectionNewCoursesContainer;
                    K(Constants.COURSE_DEPRESSION, conditionSelectionNewCoursesContainer, R.drawable.ic_csa_depression, R.color.csaDepressionBg, Constants.COURSE_DEPRESSION_DN, false);
                    z11 = true;
                    z12 = false;
                } else {
                    i6 = R.id.conditionSelectionNewCoursesContainer;
                    LinearLayout conditionSelectionContinueCoursesContainer = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_DEPRESSION, conditionSelectionContinueCoursesContainer, R.drawable.ic_csa_depression, R.color.csaDepressionBg, Constants.COURSE_DEPRESSION_DN, true);
                    z11 = false;
                    z12 = true;
                }
                if (FirebasePersistence.getInstance().getUser().getWorry() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer2 = (LinearLayout) _$_findCachedViewById(i6);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer2, "conditionSelectionNewCoursesContainer");
                    K(Constants.COURSE_WORRY, conditionSelectionNewCoursesContainer2, R.drawable.ic_csa_anxiety, R.color.csaAnxietyBg, Constants.COURSE_WORRY_DN, false);
                    z11 = true;
                } else {
                    LinearLayout conditionSelectionContinueCoursesContainer2 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer2, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_WORRY, conditionSelectionContinueCoursesContainer2, R.drawable.ic_csa_anxiety, R.color.csaAnxietyBg, Constants.COURSE_WORRY_DN, true);
                    z12 = true;
                }
                if (FirebasePersistence.getInstance().getUser().getStress() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer3 = (LinearLayout) _$_findCachedViewById(i6);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer3, "conditionSelectionNewCoursesContainer");
                    K(Constants.COURSE_STRESS, conditionSelectionNewCoursesContainer3, R.drawable.ic_csa_stress, R.color.csaStressBg, Constants.COURSE_STRESS_DN, false);
                    z11 = true;
                } else {
                    LinearLayout conditionSelectionContinueCoursesContainer3 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer3, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_STRESS, conditionSelectionContinueCoursesContainer3, R.drawable.ic_csa_stress, R.color.csaStressBg, Constants.COURSE_STRESS_DN, true);
                    z12 = true;
                }
                if (FirebasePersistence.getInstance().getUser().getSleep() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer4 = (LinearLayout) _$_findCachedViewById(i6);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer4, "conditionSelectionNewCoursesContainer");
                    K(Constants.COURSE_SLEEP, conditionSelectionNewCoursesContainer4, R.drawable.ic_csa_sleep, R.color.csaSleepBg, Constants.COURSE_SLEEP_DN, false);
                    z11 = true;
                } else {
                    LinearLayout conditionSelectionContinueCoursesContainer4 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer4, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_SLEEP, conditionSelectionContinueCoursesContainer4, R.drawable.ic_csa_sleep, R.color.csaSleepBg, Constants.COURSE_SLEEP_DN, true);
                    z12 = true;
                }
                if (FirebasePersistence.getInstance().getUser().getAnger() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer5 = (LinearLayout) _$_findCachedViewById(i6);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer5, "conditionSelectionNewCoursesContainer");
                    K(Constants.COURSE_ANGER, conditionSelectionNewCoursesContainer5, R.drawable.ic_csa_anger, R.color.csaAngerBg, Constants.COURSE_ANGER_DN, false);
                    z11 = true;
                } else {
                    LinearLayout conditionSelectionContinueCoursesContainer5 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer5, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_ANGER, conditionSelectionContinueCoursesContainer5, R.drawable.ic_csa_anger, R.color.csaAngerBg, Constants.COURSE_ANGER_DN, true);
                    z12 = true;
                }
                if (FirebasePersistence.getInstance().getUser().getHappiness() == null) {
                    LinearLayout conditionSelectionNewCoursesContainer6 = (LinearLayout) _$_findCachedViewById(i6);
                    kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer6, "conditionSelectionNewCoursesContainer");
                    K(Constants.COURSE_HAPPINESS, conditionSelectionNewCoursesContainer6, R.drawable.ic_csa_happiness, R.color.csaHappinessBg, Constants.COURSE_HAPPINESS_DN, false);
                    z11 = true;
                } else {
                    LinearLayout conditionSelectionContinueCoursesContainer6 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                    kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer6, "conditionSelectionContinueCoursesContainer");
                    K(Constants.COURSE_HAPPINESS, conditionSelectionContinueCoursesContainer6, R.drawable.ic_csa_happiness, R.color.csaHappinessBg, Constants.COURSE_HAPPINESS_DN, true);
                    z12 = true;
                }
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null && (appConfig = user4.getAppConfig()) != null) {
                    obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str5 = obj;
                }
                if (str5 == null) {
                    str5 = "default";
                }
                if (kotlin.jvm.internal.i.b(str5, "variant_a")) {
                    Boolean isOcdCourseActive = FirebasePersistence.getInstance().getIsOcdCourseActive();
                    kotlin.jvm.internal.i.f(isOcdCourseActive, "getInstance().isOcdCourseActive");
                    if (isOcdCourseActive.booleanValue()) {
                        LinearLayout conditionSelectionContinueCoursesContainer7 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                        kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer7, "conditionSelectionContinueCoursesContainer");
                        K(Constants.COURSE_OCD, conditionSelectionContinueCoursesContainer7, R.drawable.ic_csa_ocd, R.color.onboardingAssessmentOCD, Constants.COURSE_OCD_DN, true);
                        z12 = true;
                    } else {
                        LinearLayout conditionSelectionNewCoursesContainer7 = (LinearLayout) _$_findCachedViewById(i6);
                        kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer7, "conditionSelectionNewCoursesContainer");
                        K(Constants.COURSE_OCD, conditionSelectionNewCoursesContainer7, R.drawable.ic_csa_ocd, R.color.onboardingAssessmentOCD, Constants.COURSE_OCD_DN, false);
                        z11 = true;
                    }
                    Boolean isAdhdCourseActive = FirebasePersistence.getInstance().getIsAdhdCourseActive();
                    kotlin.jvm.internal.i.f(isAdhdCourseActive, "getInstance().isAdhdCourseActive");
                    if (isAdhdCourseActive.booleanValue()) {
                        LinearLayout conditionSelectionContinueCoursesContainer8 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                        kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer8, "conditionSelectionContinueCoursesContainer");
                        K(Constants.COURSE_ADHD, conditionSelectionContinueCoursesContainer8, R.drawable.ic_csa_adhd, R.color.onboardingAssessmentADHD, Constants.COURSE_ADHD_DN, true);
                        z12 = true;
                    } else {
                        LinearLayout conditionSelectionNewCoursesContainer8 = (LinearLayout) _$_findCachedViewById(i6);
                        kotlin.jvm.internal.i.f(conditionSelectionNewCoursesContainer8, "conditionSelectionNewCoursesContainer");
                        K(Constants.COURSE_ADHD, conditionSelectionNewCoursesContainer8, R.drawable.ic_csa_adhd, R.color.onboardingAssessmentADHD, Constants.COURSE_ADHD_DN, false);
                        z11 = true;
                    }
                    Boolean isGenericExpertCareCourseActive = FirebasePersistence.getInstance().getIsGenericExpertCareCourseActive();
                    kotlin.jvm.internal.i.f(isGenericExpertCareCourseActive, "getInstance().isGenericExpertCareCourseActive");
                    if (isGenericExpertCareCourseActive.booleanValue()) {
                        LinearLayout conditionSelectionContinueCoursesContainer9 = (LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer);
                        kotlin.jvm.internal.i.f(conditionSelectionContinueCoursesContainer9, "conditionSelectionContinueCoursesContainer");
                        K(Constants.COURSE_GENERIC, conditionSelectionContinueCoursesContainer9, R.drawable.ic_csa_expert_care, R.color.teleCardTerracotaBackground, Constants.COURSE_EXPERT_CARE_DN, true);
                        z12 = true;
                    }
                }
                if (z11) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionNewSubText)).setVisibility(0);
                    ((LinearLayout) _$_findCachedViewById(i6)).setVisibility(0);
                }
                if (z12) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionNewContinueText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.conditionSelectionStartNewText)).setVisibility(0);
                    ((LinearLayout) _$_findCachedViewById(R.id.conditionSelectionContinueCoursesContainer)).setVisibility(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f39459u, "condition selection", e10);
                return;
            }
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void notificationFetchComplete(boolean z10) {
    }
}

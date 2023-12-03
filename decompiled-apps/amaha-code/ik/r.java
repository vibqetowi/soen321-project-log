package ik;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.assessments.model.HealthAssessmentQuestion;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentHealthQuestionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lik/r;", "Lrr/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r extends rr.b implements View.OnClickListener {

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20282v;

    /* renamed from: w  reason: collision with root package name */
    public HealthAssessmentQuestion f20283w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f20286z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20281u = LogHelper.INSTANCE.makeLogTag(r.class);

    /* renamed from: x  reason: collision with root package name */
    public String f20284x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f20285y = "";

    /* compiled from: ExptInitialAssessmentHealthQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            Drawable drawable;
            String str;
            r rVar = r.this;
            ScrollView scrollView = (ScrollView) rVar._$_findCachedViewById(R.id.healthAssessmentScrollView);
            if (scrollView != null) {
                ViewPropertyAnimator animate = scrollView.animate();
                if (rVar.isAdded()) {
                    animate.alpha(1.0f);
                    animate.setStartDelay(200L);
                    animate.setDuration(500L);
                    animate.start();
                }
            }
            androidx.fragment.app.p requireActivity = rVar.requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
            String str2 = rVar.f20284x;
            ((ExptInitialAssessmentActivity) requireActivity).f10585d0.getClass();
            Integer J = hc.d.J(str2);
            if (J != null) {
                int intValue = J.intValue();
                View _$_findCachedViewById = rVar._$_findCachedViewById(R.id.assessmentGradientBg);
                Context requireContext = rVar.requireContext();
                Object obj = g0.a.f16164a;
                _$_findCachedViewById.setBackground(a.c.b(requireContext, intValue));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HealthAssessmentQuestion healthAssessmentQuestion = rVar.f20283w;
            String str3 = "";
            if (healthAssessmentQuestion != null) {
                String string = rVar.getString(healthAssessmentQuestion.getQuestionId());
                kotlin.jvm.internal.i.f(string, "getString(questionId)");
                String[] stringArray = rVar.getResources().getStringArray(healthAssessmentQuestion.getOptionsId());
                kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray(optionsId)");
                ArrayList k10 = ca.a.k(Arrays.copyOf(stringArray, stringArray.length));
                Integer subQuestionId = healthAssessmentQuestion.getSubQuestionId();
                if (subQuestionId != null) {
                    str3 = rVar.getString(subQuestionId.intValue());
                    kotlin.jvm.internal.i.f(str3, "getString(this)");
                }
                Integer subOptionsId = healthAssessmentQuestion.getSubOptionsId();
                if (subOptionsId != null) {
                    String[] stringArray2 = rVar.getResources().getStringArray(subOptionsId.intValue());
                    kotlin.jvm.internal.i.f(stringArray2, "resources.getStringArray(this)");
                    arrayList2 = ca.a.k(Arrays.copyOf(stringArray2, stringArray2.length));
                }
                String symptom = healthAssessmentQuestion.getSymptom();
                kotlin.jvm.internal.i.g(symptom, "<set-?>");
                rVar.f20285y = symptom;
                Context requireContext2 = rVar.requireContext();
                int imageId = healthAssessmentQuestion.getImageId();
                Object obj2 = g0.a.f16164a;
                drawable = a.c.b(requireContext2, imageId);
                String str4 = str3;
                str3 = string;
                arrayList = k10;
                str = str4;
            } else {
                drawable = null;
                str = "";
            }
            if (drawable != null) {
                ((AppCompatImageView) rVar._$_findCachedViewById(R.id.assessmentImage)).setImageDrawable(drawable);
            }
            ((RobertoTextView) rVar._$_findCachedViewById(R.id.assessmentQuestion)).setText(str3);
            if (arrayList.size() >= 3) {
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption1)).setText((CharSequence) arrayList.get(0));
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption2)).setText((CharSequence) arrayList.get(1));
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption3)).setText((CharSequence) arrayList.get(2));
            }
            ((RobertoTextView) rVar._$_findCachedViewById(R.id.assessmentSubQuestion)).setText(str);
            if (arrayList2.size() >= 4) {
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption1)).setText((CharSequence) arrayList2.get(0));
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption2)).setText((CharSequence) arrayList2.get(1));
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption3)).setText((CharSequence) arrayList2.get(2));
                ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption4)).setText((CharSequence) arrayList2.get(3));
            }
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption1)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption2)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthOption3)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption1)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption2)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption3)).setOnClickListener(rVar);
            ((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption4)).setOnClickListener(rVar);
            UiUtils.Companion.disableClick((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption1), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption2), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption3), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption4));
            return hs.k.f19476a;
        }
    }

    public final void J(RobertoButton robertoButton, RobertoButton robertoButton2) {
        ScrollView scrollView = (ScrollView) _$_findCachedViewById(R.id.healthAssessmentScrollView);
        if (scrollView != null) {
            scrollView.fullScroll(33);
            scrollView.smoothScrollTo(0, 0);
        }
        UiUtils.Companion companion = UiUtils.Companion;
        companion.hideViews(new View[]{robertoButton2, (RobertoButton) _$_findCachedViewById(R.id.healthOption3), (RobertoTextView) _$_findCachedViewById(R.id.assessmentQuestion)}, true);
        companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.healthOption1), (RobertoButton) _$_findCachedViewById(R.id.healthOption2), (RobertoButton) _$_findCachedViewById(R.id.healthOption3));
        robertoButton.setSelected(true);
        AnimUtils animUtils = AnimUtils.INSTANCE;
        ViewPropertyAnimator y10 = robertoButton.animate().y(((RobertoTextView) _$_findCachedViewById(R.id.assessmentQuestion)).getY());
        kotlin.jvm.internal.i.f(y10, "selectView.animate().y(assessmentQuestion.y)");
        animUtils.onEnd(y10, new q(this)).start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20286z;
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
            this.f20282v = (AssessmentListener) context;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthOption1))) {
            RobertoButton healthOption1 = (RobertoButton) _$_findCachedViewById(R.id.healthOption1);
            kotlin.jvm.internal.i.f(healthOption1, "healthOption1");
            RobertoButton healthOption2 = (RobertoButton) _$_findCachedViewById(R.id.healthOption2);
            kotlin.jvm.internal.i.f(healthOption2, "healthOption2");
            J(healthOption1, healthOption2);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthOption2))) {
            RobertoButton healthOption22 = (RobertoButton) _$_findCachedViewById(R.id.healthOption2);
            kotlin.jvm.internal.i.f(healthOption22, "healthOption2");
            RobertoButton healthOption12 = (RobertoButton) _$_findCachedViewById(R.id.healthOption1);
            kotlin.jvm.internal.i.f(healthOption12, "healthOption1");
            J(healthOption22, healthOption12);
        } else {
            int i6 = 0;
            int i10 = 1;
            if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthOption3))) {
                ((RobertoButton) _$_findCachedViewById(R.id.healthOption3)).setSelected(true);
                AssessmentListener assessmentListener = this.f20282v;
                if (assessmentListener != null) {
                    String str = this.f20285y;
                    if (kotlin.jvm.internal.i.b(this.f20284x, Constants.COURSE_HAPPINESS)) {
                        i6 = 4;
                    }
                    assessmentListener.onOptionSelected(str, i6);
                }
            } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthSubOption1))) {
                ((RobertoButton) _$_findCachedViewById(R.id.healthSubOption1)).setSelected(true);
                UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.healthSubOption2), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption3), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption4));
                AssessmentListener assessmentListener2 = this.f20282v;
                if (assessmentListener2 != null) {
                    String str2 = this.f20285y;
                    if (kotlin.jvm.internal.i.b(this.f20284x, Constants.COURSE_HAPPINESS)) {
                        i10 = 3;
                    }
                    assessmentListener2.onOptionSelected(str2, i10);
                }
            } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthSubOption2))) {
                ((RobertoButton) _$_findCachedViewById(R.id.healthSubOption2)).setSelected(true);
                UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.healthSubOption1), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption3), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption4));
                AssessmentListener assessmentListener3 = this.f20282v;
                if (assessmentListener3 != null) {
                    assessmentListener3.onOptionSelected(this.f20285y, 2);
                }
            } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthSubOption3))) {
                ((RobertoButton) _$_findCachedViewById(R.id.healthSubOption3)).setSelected(true);
                UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.healthSubOption1), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption2), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption4));
                AssessmentListener assessmentListener4 = this.f20282v;
                if (assessmentListener4 != null) {
                    String str3 = this.f20285y;
                    if (!kotlin.jvm.internal.i.b(this.f20284x, Constants.COURSE_HAPPINESS)) {
                        i10 = 3;
                    }
                    assessmentListener4.onOptionSelected(str3, i10);
                }
            } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.healthSubOption4))) {
                ((RobertoButton) _$_findCachedViewById(R.id.healthSubOption4)).setSelected(true);
                UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.healthSubOption1), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption2), (RobertoButton) _$_findCachedViewById(R.id.healthSubOption3));
                AssessmentListener assessmentListener5 = this.f20282v;
                if (assessmentListener5 != null) {
                    String str4 = this.f20285y;
                    if (!kotlin.jvm.internal.i.b(this.f20284x, Constants.COURSE_HAPPINESS)) {
                        i6 = 4;
                    }
                    assessmentListener5.onOptionSelected(str4, i6);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HealthAssessmentQuestion healthAssessmentQuestion;
        Serializable serializable;
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            String str = null;
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("questionData", HealthAssessmentQuestion.class);
                } else {
                    Serializable serializable2 = arguments.getSerializable("questionData");
                    if (!(serializable2 instanceof HealthAssessmentQuestion)) {
                        serializable2 = null;
                    }
                    serializable = (HealthAssessmentQuestion) serializable2;
                }
                healthAssessmentQuestion = (HealthAssessmentQuestion) serializable;
            } else {
                healthAssessmentQuestion = null;
            }
            this.f20283w = healthAssessmentQuestion;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("course");
            }
            if (str == null) {
                str = "";
            }
            this.f20284x = str;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20281u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_health_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20286z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        UtilsKt.logError$default(this.f20281u, null, new a(), 2, null);
    }
}

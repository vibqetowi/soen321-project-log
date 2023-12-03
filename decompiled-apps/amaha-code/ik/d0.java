package ik;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.assessments.model.AssessmentQuestion;
import com.theinnerhour.b2b.components.assessments.model.AssessmentType;
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
/* compiled from: ExptInitialAssessmentQuestionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lik/d0;", "Lrr/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d0 extends rr.b implements View.OnClickListener {

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20151v;

    /* renamed from: w  reason: collision with root package name */
    public AssessmentQuestion f20152w;

    /* renamed from: z  reason: collision with root package name */
    public AssessmentType f20155z;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20150u = LogHelper.INSTANCE.makeLogTag(d0.class);

    /* renamed from: x  reason: collision with root package name */
    public String f20153x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f20154y = "";

    /* compiled from: ExptInitialAssessmentQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            Drawable drawable;
            String str;
            d0 d0Var = d0.this;
            ScrollView scrollView = (ScrollView) d0Var._$_findCachedViewById(R.id.assessmentScrollView);
            if (scrollView != null) {
                ViewPropertyAnimator animate = scrollView.animate();
                if (d0Var.isAdded()) {
                    animate.alpha(1.0f);
                    animate.setStartDelay(200L);
                    animate.setDuration(500L);
                    animate.start();
                }
            }
            RobertoTextView robertoTextView = (RobertoTextView) d0Var._$_findCachedViewById(R.id.assessmentQuestion);
            if (robertoTextView != null) {
                ViewPropertyAnimator animate2 = robertoTextView.animate();
                if (d0Var.isAdded()) {
                    animate2.alpha(1.0f);
                    animate2.setStartDelay(200L);
                    animate2.setDuration(500L);
                    animate2.start();
                }
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) d0Var._$_findCachedViewById(R.id.assessmentQuestionSubtitle);
            if (robertoTextView2 != null) {
                ViewPropertyAnimator animate3 = robertoTextView2.animate();
                if (d0Var.isAdded()) {
                    animate3.alpha(1.0f);
                    animate3.setStartDelay(200L);
                    animate3.setDuration(500L);
                    animate3.start();
                }
            }
            androidx.fragment.app.p requireActivity = d0Var.requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
            String str2 = d0Var.f20154y;
            ((ExptInitialAssessmentActivity) requireActivity).f10585d0.getClass();
            Integer J = hc.d.J(str2);
            if (J != null) {
                int intValue = J.intValue();
                View _$_findCachedViewById = d0Var._$_findCachedViewById(R.id.assessmentGradientBg);
                Context requireContext = d0Var.requireContext();
                Object obj = g0.a.f16164a;
                _$_findCachedViewById.setBackground(a.c.b(requireContext, intValue));
            }
            ArrayList arrayList = new ArrayList();
            AssessmentQuestion assessmentQuestion = d0Var.f20152w;
            String str3 = "";
            if (assessmentQuestion != null) {
                String string = d0Var.getString(assessmentQuestion.getQuestionId());
                kotlin.jvm.internal.i.f(string, "getString(questionId)");
                String[] stringArray = d0Var.getResources().getStringArray(assessmentQuestion.getOptionsId());
                kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray(optionsId)");
                ArrayList k10 = ca.a.k(Arrays.copyOf(stringArray, stringArray.length));
                String symptom = assessmentQuestion.getSymptom();
                kotlin.jvm.internal.i.g(symptom, "<set-?>");
                d0Var.f20153x = symptom;
                Integer subtitleId = assessmentQuestion.getSubtitleId();
                if (subtitleId != null) {
                    str3 = d0Var.getString(subtitleId.intValue());
                    kotlin.jvm.internal.i.f(str3, "getString(this)");
                }
                Context requireContext2 = d0Var.requireContext();
                int imageId = assessmentQuestion.getImageId();
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
                ((AppCompatImageView) d0Var._$_findCachedViewById(R.id.assessmentImage)).setImageDrawable(drawable);
            }
            ((RobertoTextView) d0Var._$_findCachedViewById(R.id.assessmentQuestion)).setText(str3);
            if (!gv.n.B0(str)) {
                RobertoTextView robertoTextView3 = (RobertoTextView) d0Var._$_findCachedViewById(R.id.assessmentQuestionSubtitle);
                robertoTextView3.setText(str);
                robertoTextView3.setVisibility(0);
            }
            if (arrayList.size() >= 5) {
                ((RobertoButton) d0Var._$_findCachedViewById(R.id.assessmentOption1)).setText((CharSequence) arrayList.get(0));
                ((RobertoButton) d0Var._$_findCachedViewById(R.id.assessmentOption2)).setText((CharSequence) arrayList.get(1));
                ((RobertoButton) d0Var._$_findCachedViewById(R.id.assessmentOption3)).setText((CharSequence) arrayList.get(2));
                ((RobertoButton) d0Var._$_findCachedViewById(R.id.assessmentOption4)).setText((CharSequence) arrayList.get(3));
                ((RobertoButton) d0Var._$_findCachedViewById(R.id.assessmentOption5)).setText((CharSequence) arrayList.get(4));
            }
            new Handler().postDelayed(new je.o(18, d0Var), 500L);
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
            this.f20151v = (AssessmentListener) context;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = 3;
        int i10 = 0;
        if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.assessmentOption1))) {
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentOption1)).setSelected(true);
            UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.assessmentOption2), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption3), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption4), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption5));
            AssessmentListener assessmentListener = this.f20151v;
            if (assessmentListener != null) {
                String str = this.f20153x;
                if (kotlin.jvm.internal.i.b(this.f20154y, Constants.COURSE_HAPPINESS) && this.f20155z == AssessmentType.HEALTH) {
                    i10 = 4;
                }
                assessmentListener.onOptionSelected(str, i10);
            }
        } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.assessmentOption2))) {
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentOption2)).setSelected(true);
            UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.assessmentOption1), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption3), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption4), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption5));
            AssessmentListener assessmentListener2 = this.f20151v;
            if (assessmentListener2 != null) {
                assessmentListener2.onOptionSelected(this.f20153x, (kotlin.jvm.internal.i.b(this.f20154y, Constants.COURSE_HAPPINESS) && this.f20155z == AssessmentType.HEALTH) ? 1 : 1);
            }
        } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.assessmentOption3))) {
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentOption3)).setSelected(true);
            UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.assessmentOption1), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption2), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption4), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption5));
            AssessmentListener assessmentListener3 = this.f20151v;
            if (assessmentListener3 != null) {
                assessmentListener3.onOptionSelected(this.f20153x, 2);
            }
        } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.assessmentOption4))) {
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentOption4)).setSelected(true);
            UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.assessmentOption1), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption2), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption3), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption5));
            AssessmentListener assessmentListener4 = this.f20151v;
            if (assessmentListener4 != null) {
                String str2 = this.f20153x;
                if (kotlin.jvm.internal.i.b(this.f20154y, Constants.COURSE_HAPPINESS) && this.f20155z == AssessmentType.HEALTH) {
                    i6 = 1;
                }
                assessmentListener4.onOptionSelected(str2, i6);
            }
        } else if (kotlin.jvm.internal.i.b(view, (RobertoButton) _$_findCachedViewById(R.id.assessmentOption5))) {
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentOption5)).setSelected(true);
            UiUtils.Companion.disableClick((RobertoButton) _$_findCachedViewById(R.id.assessmentOption1), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption2), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption3), (RobertoButton) _$_findCachedViewById(R.id.assessmentOption4));
            AssessmentListener assessmentListener5 = this.f20151v;
            if (assessmentListener5 != null) {
                assessmentListener5.onOptionSelected(this.f20153x, (kotlin.jvm.internal.i.b(this.f20154y, Constants.COURSE_HAPPINESS) && this.f20155z == AssessmentType.HEALTH) ? 4 : 4);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("questionData");
        } else {
            serializable = null;
        }
        kotlin.jvm.internal.i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.model.AssessmentQuestion");
        this.f20152w = (AssessmentQuestion) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("course");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f20154y = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable2 = arguments3.getSerializable("currentAssessment");
        }
        this.f20155z = (AssessmentType) serializable2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        UtilsKt.logError$default(this.f20150u, null, new a(), 2, null);
    }
}

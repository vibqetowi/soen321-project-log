package ik;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.assessments.model.AssessmentType;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/s;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public AssessmentListener f20291u;

    /* renamed from: v  reason: collision with root package name */
    public ObjectAnimator f20292v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f20293w = new LinkedHashMap();

    /* compiled from: ExptInitialAssessmentIntroFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Serializable f20295v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Serializable serializable) {
            super(0);
            this.f20295v = serializable;
        }

        @Override // ss.a
        public final hs.k invoke() {
            String str;
            int i6;
            s sVar = s.this;
            if (sVar.isAdded()) {
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                User user = FirebasePersistence.getInstance().getUser();
                Integer num = null;
                if (user != null) {
                    str = user.getVersion();
                } else {
                    str = null;
                }
                analyticsBundle.putString("version", str);
                Bundle arguments = sVar.getArguments();
                if (arguments != null) {
                    num = Integer.valueOf(arguments.getInt("dayPlanPosition"));
                }
                if (num != null && num.intValue() == 0) {
                    i6 = 0;
                } else if (num != null && num.intValue() == 15) {
                    i6 = 15;
                } else {
                    i6 = 28;
                }
                analyticsBundle.putInt("day", i6);
                AssessmentType assessmentType = AssessmentType.HEALTH;
                Serializable serializable = this.f20295v;
                if (serializable == assessmentType) {
                    UtilsKt.fireAnalytics("health_assessment_start", analyticsBundle);
                } else if (serializable == AssessmentType.SYMPTOM) {
                    UtilsKt.fireAnalytics("symptom_assessment_start", analyticsBundle);
                } else if (serializable == AssessmentType.GLOBAL) {
                    UtilsKt.fireAnalytics("global_assessment_start", analyticsBundle);
                }
                AssessmentListener assessmentListener = sVar.f20291u;
                if (assessmentListener != null) {
                    assessmentListener.onIntroScreenShown();
                }
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20293w;
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
            this.f20291u = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ObjectAnimator objectAnimator = this.f20292v;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.f20292v = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20293w.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        String string;
        Bundle arguments;
        String string2;
        int hashCode;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.assessmentIntroLayout);
        if (constraintLayout != null) {
            ViewPropertyAnimator animate = constraintLayout.animate();
            if (isAdded()) {
                animate.alpha(1.0f);
                animate.setStartDelay(500L);
                animate.setDuration(2000L);
                animate.start();
            }
        }
        Bundle arguments2 = getArguments();
        String str2 = null;
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("currentAssessment");
        } else {
            serializable = null;
        }
        if (serializable == AssessmentType.HEALTH) {
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentIntroIcon)).setImageDrawable(a.c.b(requireContext, R.drawable.ic_assessment_health));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroTitle)).setText(getString(R.string.healthAssessment));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroDesc)).setText(getString(R.string.healthIntroDesc));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroProgressTitle)).setText(getString(R.string.healthIntroBottomText));
        } else if (serializable == AssessmentType.SYMPTOM) {
            Context requireContext2 = requireContext();
            Object obj2 = g0.a.f16164a;
            ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentIntroIcon)).setImageDrawable(a.c.b(requireContext2, R.drawable.ic_assessment_symptom));
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroTitle);
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str = arguments3.getString("course");
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode2 = str.hashCode();
                if (hashCode2 != -2114782937) {
                    if (hashCode2 == 109522647 && str.equals(Constants.COURSE_SLEEP)) {
                        string = getString(R.string.IndicatorAssessment);
                        robertoTextView.setText(string);
                        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroDesc);
                        arguments = getArguments();
                        if (arguments != null) {
                            str2 = arguments.getString("course");
                        }
                        if (str2 == null && ((hashCode = str2.hashCode()) == -1617042330 ? str2.equals(Constants.COURSE_DEPRESSION) : !(hashCode != 113319009 || !str2.equals(Constants.COURSE_WORRY)))) {
                            string2 = getString(R.string.symptomIntroDesc1);
                        } else {
                            string2 = getString(R.string.symptomIntroDesc2);
                        }
                        robertoTextView2.setText(string2);
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroProgressTitle)).setText(getString(R.string.symptomIntroBottomText));
                    }
                } else if (str.equals(Constants.COURSE_HAPPINESS)) {
                    string = getString(R.string.factorAssessment);
                    robertoTextView.setText(string);
                    RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroDesc);
                    arguments = getArguments();
                    if (arguments != null) {
                    }
                    if (str2 == null) {
                    }
                    string2 = getString(R.string.symptomIntroDesc2);
                    robertoTextView22.setText(string2);
                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroProgressTitle)).setText(getString(R.string.symptomIntroBottomText));
                }
            }
            string = getString(R.string.symptomAssessment);
            robertoTextView.setText(string);
            RobertoTextView robertoTextView222 = (RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroDesc);
            arguments = getArguments();
            if (arguments != null) {
            }
            if (str2 == null) {
            }
            string2 = getString(R.string.symptomIntroDesc2);
            robertoTextView222.setText(string2);
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroProgressTitle)).setText(getString(R.string.symptomIntroBottomText));
        } else if (serializable == AssessmentType.GLOBAL) {
            Context requireContext3 = requireContext();
            Object obj3 = g0.a.f16164a;
            ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentIntroIcon)).setImageDrawable(a.c.b(requireContext3, R.drawable.ic_assessment_global));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroTitle)).setText(getString(R.string.globalAssessment));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroDesc)).setText(getString(R.string.globalIntroDesc));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentIntroProgressTitle)).setText(getString(R.string.globalIntroBottomText));
        }
        ((ProgressBar) _$_findCachedViewById(R.id.assessmentIntroProgress)).setMax(500);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.assessmentIntroProgress), Constants.SCREEN_PROGRESS, 0, 500);
        ofInt.setDuration(10000L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setAutoCancel(true);
        AnimUtils.INSTANCE.onEnd(ofInt, new a(serializable));
        this.f20292v = ofInt;
        ofInt.start();
    }
}

package ik;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentStartFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/m0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20240w = 0;

    /* renamed from: u  reason: collision with root package name */
    public AssessmentListener f20241u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20242v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20242v;
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
            this.f20241u = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_start, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20242v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        AppCompatImageView assessmentStartImg = (AppCompatImageView) _$_findCachedViewById(R.id.assessmentStartImg);
        kotlin.jvm.internal.i.f(assessmentStartImg, "assessmentStartImg");
        insetsUtils.addStatusBarHeight(assessmentStartImg);
        AppCompatImageView assessmentBackIcon = (AppCompatImageView) _$_findCachedViewById(R.id.assessmentBackIcon);
        kotlin.jvm.internal.i.f(assessmentBackIcon, "assessmentBackIcon");
        insetsUtils.addStatusBarHeight(assessmentBackIcon);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("course");
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.happinessAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartHappiness));
                        ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentTitle)).setText(getString(R.string.factorAssessment));
                        break;
                    }
                    break;
                case -1617042330:
                    if (str.equals(Constants.COURSE_DEPRESSION)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.depressionAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartDepression));
                        break;
                    }
                    break;
                case -891989580:
                    if (str.equals(Constants.COURSE_STRESS)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.stressAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartStress));
                        break;
                    }
                    break;
                case 92960775:
                    if (str.equals(Constants.COURSE_ANGER)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.angerAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartAnger));
                        break;
                    }
                    break;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.sleepAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartSleep));
                        ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentTitle)).setText(getString(R.string.IndicatorAssessment));
                        break;
                    }
                    break;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartTitle)).setText(getString(R.string.anxietyAssessment));
                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentStartDesc)).setText(getString(R.string.assessmentStartWorry));
                        break;
                    }
                    break;
            }
        }
        ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentBackIcon)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.l0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ m0 f20232v;

            {
                this.f20232v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Integer num;
                int i6;
                int i10 = r2;
                m0 this$0 = this.f20232v;
                switch (i10) {
                    case 0:
                        int i11 = m0.f20240w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("programme_assessment_intro_back", UtilsKt.getAnalyticsBundle());
                        AssessmentListener assessmentListener = this$0.f20241u;
                        if (assessmentListener != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener, true, false, false, 6, null);
                            return;
                        }
                        return;
                    default:
                        int i12 = m0.f20240w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        Bundle arguments2 = this$0.getArguments();
                        if (arguments2 != null) {
                            num = Integer.valueOf(arguments2.getInt("dayPlanPosition"));
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 0) {
                            i6 = 0;
                        } else if (num != null && num.intValue() == 15) {
                            i6 = 15;
                        } else {
                            i6 = 28;
                        }
                        analyticsBundle.putInt("day", i6);
                        UtilsKt.fireAnalytics("progragmme_assessment_question", analyticsBundle);
                        AssessmentListener assessmentListener2 = this$0.f20241u;
                        if (assessmentListener2 != null) {
                            assessmentListener2.onAssessmentStarted();
                            return;
                        }
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentStartBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.l0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ m0 f20232v;

            {
                this.f20232v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Integer num;
                int i6;
                int i10 = r2;
                m0 this$0 = this.f20232v;
                switch (i10) {
                    case 0:
                        int i11 = m0.f20240w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("programme_assessment_intro_back", UtilsKt.getAnalyticsBundle());
                        AssessmentListener assessmentListener = this$0.f20241u;
                        if (assessmentListener != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener, true, false, false, 6, null);
                            return;
                        }
                        return;
                    default:
                        int i12 = m0.f20240w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        Bundle arguments2 = this$0.getArguments();
                        if (arguments2 != null) {
                            num = Integer.valueOf(arguments2.getInt("dayPlanPosition"));
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 0) {
                            i6 = 0;
                        } else if (num != null && num.intValue() == 15) {
                            i6 = 15;
                        } else {
                            i6 = 28;
                        }
                        analyticsBundle.putInt("day", i6);
                        UtilsKt.fireAnalytics("progragmme_assessment_question", analyticsBundle);
                        AssessmentListener assessmentListener2 = this$0.f20241u;
                        if (assessmentListener2 != null) {
                            assessmentListener2.onAssessmentStarted();
                            return;
                        }
                        return;
                }
            }
        });
    }
}

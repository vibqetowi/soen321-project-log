package ik;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentCalculatingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/l;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f20225y = 0;

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20227v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20228w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f20229x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20226u = LogHelper.INSTANCE.makeLogTag(l.class);

    /* compiled from: ExptInitialAssessmentCalculatingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            l lVar = l.this;
            if (lVar.isAdded()) {
                AssessmentListener assessmentListener = lVar.f20227v;
                if (assessmentListener != null) {
                    AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                }
            } else {
                lVar.f20228w = true;
            }
            return hs.k.f19476a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof AssessmentListener) {
            this.f20227v = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_calculating, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20229x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AssessmentListener assessmentListener;
        super.onResume();
        if (isAdded() && this.f20228w && (assessmentListener = this.f20227v) != null) {
            AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = (arguments == null || (str = arguments.getString("course")) == null) ? "" : "";
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
        ((ExptInitialAssessmentActivity) requireActivity).f10585d0.getClass();
        View view2 = null;
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    num = Integer.valueOf((int) R.string.assessmentResultHappinessCalculating);
                    break;
                }
                num = null;
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    num = Integer.valueOf((int) R.string.assessmentResultDepressionCalculating);
                    break;
                }
                num = null;
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    num = Integer.valueOf((int) R.string.assessmentResultStressCalculating);
                    break;
                }
                num = null;
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    num = Integer.valueOf((int) R.string.assessmentResultAngerCalculating);
                    break;
                }
                num = null;
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    num = Integer.valueOf((int) R.string.assessmentResultSleepCalculating);
                    break;
                }
                num = null;
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    num = Integer.valueOf((int) R.string.assessmentResultAnxietyCalculating);
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            int intValue = num.intValue();
            LinkedHashMap linkedHashMap = this.f20229x;
            View view3 = (View) linkedHashMap.get(Integer.valueOf((int) R.id.calculatingText));
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null && (view3 = view4.findViewById(R.id.calculatingText)) != null) {
                    linkedHashMap.put(Integer.valueOf((int) R.id.calculatingText), view3);
                }
                ((RobertoTextView) view2).setText(getString(intValue));
            }
            view2 = view3;
            ((RobertoTextView) view2).setText(getString(intValue));
        }
        new Handler().postDelayed(new je.o(16, this), 2000L);
    }
}

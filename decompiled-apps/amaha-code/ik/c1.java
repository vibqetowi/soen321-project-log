package ik;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentLoadingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/c1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c1 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f20138y = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20141w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f20142x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20139u = LogHelper.INSTANCE.makeLogTag(c1.class);

    /* renamed from: v  reason: collision with root package name */
    public final Handler f20140v = new Handler();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20142x;
        Integer valueOf = Integer.valueOf((int) R.id.loadingText);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.loadingText)) != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_loading, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20142x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        if (this.f20141w && isAdded()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity).t0();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            if (currentCourseName != null) {
                switch (currentCourseName.hashCode()) {
                    case -2114782937:
                        if (!currentCourseName.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultHappinessCalculating));
                            break;
                        }
                    case -1617042330:
                        if (!currentCourseName.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultDepressionCalculating));
                            break;
                        }
                    case -891989580:
                        if (!currentCourseName.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultStressCalculating));
                            break;
                        }
                    case 92960775:
                        if (currentCourseName.equals(Constants.COURSE_ANGER)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultAngerCalculating));
                            break;
                        }
                        break;
                    case 109522647:
                        if (!currentCourseName.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultSleepCalculating));
                            break;
                        }
                    case 113319009:
                        if (!currentCourseName.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.loadingText)).setText(getString(R.string.assessmentResultAnxietyCalculating));
                            break;
                        }
                }
            }
            this.f20140v.postDelayed(new je.o(20, this), 2000L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20139u, e10);
        }
    }
}

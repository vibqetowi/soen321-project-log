package ik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentPlanEndOldFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/g1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g1 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f20186v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f20187u = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20187u;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_plan_end_old, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20187u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
        final InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity;
        ((CardView) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener() { // from class: ik.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                InitialAssessmentActivity act = initialAssessmentActivity;
                switch (i6) {
                    case 0:
                        int i10 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.n0();
                        return;
                    case 1:
                        int i11 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.startActivity(tr.r.r(act));
                        act.n0();
                        return;
                    default:
                        int i12 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.o0();
                        return;
                }
            }
        });
        ((CardView) _$_findCachedViewById(R.id.switchCTA)).setOnClickListener(new View.OnClickListener() { // from class: ik.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                InitialAssessmentActivity act = initialAssessmentActivity;
                switch (i6) {
                    case 0:
                        int i10 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.n0();
                        return;
                    case 1:
                        int i11 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.startActivity(tr.r.r(act));
                        act.n0();
                        return;
                    default:
                        int i12 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.o0();
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener() { // from class: ik.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                InitialAssessmentActivity act = initialAssessmentActivity;
                switch (i6) {
                    case 0:
                        int i10 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.n0();
                        return;
                    case 1:
                        int i11 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.startActivity(tr.r.r(act));
                        act.n0();
                        return;
                    default:
                        int i12 = g1.f20186v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        act.o0();
                        return;
                }
            }
        });
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        String courseName = firebasePersistence.getCourseById(firebasePersistence.getUser().getCurrentCourse()).getCourseName();
        if (courseName != null) {
            switch (courseName.hashCode()) {
                case -2114782937:
                    if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your happiness goals");
                        return;
                    }
                    return;
                case -1617042330:
                    if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your depression");
                        return;
                    }
                    return;
                case -891989580:
                    if (courseName.equals(Constants.COURSE_STRESS)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your stress levels");
                        return;
                    }
                    return;
                case 92960775:
                    if (courseName.equals(Constants.COURSE_ANGER)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your anger");
                        return;
                    }
                    return;
                case 109522647:
                    if (courseName.equals(Constants.COURSE_SLEEP)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your sleeping patterns");
                        return;
                    }
                    return;
                case 113319009:
                    if (courseName.equals(Constants.COURSE_WORRY)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.continueText)).setText("Click here to continue working on your anxiety");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

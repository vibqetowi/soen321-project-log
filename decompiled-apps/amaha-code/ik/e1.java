package ik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentPlanEndFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/e1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e1 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f20168v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f20169u = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20169u;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_plan_end, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20169u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
        kotlin.jvm.internal.i.f(header, "header");
        insetsUtils.addStatusBarHeight(header);
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        if (currentCourseName != null) {
            switch (currentCourseName.hashCode()) {
                case -2114782937:
                    if (currentCourseName.equals(Constants.COURSE_HAPPINESS)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndHappiness4, (RobertoTextView) defpackage.e.i(this, R.string.planEndHappiness3, (RobertoTextView) defpackage.e.i(this, R.string.planEndHappiness2, (RobertoTextView) defpackage.e.i(this, R.string.planEndHappiness1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setText(getString(R.string.planEndHappiness5));
                        break;
                    }
                    break;
                case -1617042330:
                    if (currentCourseName.equals(Constants.COURSE_DEPRESSION)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndDepression4, (RobertoTextView) defpackage.e.i(this, R.string.planEndDepression3, (RobertoTextView) defpackage.e.i(this, R.string.planEndDepression2, (RobertoTextView) defpackage.e.i(this, R.string.planEndDepression1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setText(getString(R.string.planEndDepression5));
                        break;
                    }
                    break;
                case -891989580:
                    if (currentCourseName.equals(Constants.COURSE_STRESS)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndStress4, (RobertoTextView) defpackage.e.i(this, R.string.planEndStress3, (RobertoTextView) defpackage.e.i(this, R.string.planEndStress2, (RobertoTextView) defpackage.e.i(this, R.string.planEndStress1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setText(getString(R.string.planEndStress5));
                        break;
                    }
                    break;
                case 92960775:
                    if (currentCourseName.equals(Constants.COURSE_ANGER)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndAnger4, (RobertoTextView) defpackage.e.i(this, R.string.planEndAnger3, (RobertoTextView) defpackage.e.i(this, R.string.planEndAnger2, (RobertoTextView) defpackage.e.i(this, R.string.planEndAnger1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setText(getString(R.string.planEndAnger5));
                        break;
                    }
                    break;
                case 109522647:
                    if (currentCourseName.equals(Constants.COURSE_SLEEP)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndSleep4, (RobertoTextView) defpackage.e.i(this, R.string.planEndSleep3, (RobertoTextView) defpackage.e.i(this, R.string.planEndSleep2, (RobertoTextView) defpackage.e.i(this, R.string.planEndSleep1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.bullet5)).setVisibility(8);
                        break;
                    }
                    break;
                case 113319009:
                    if (currentCourseName.equals(Constants.COURSE_WORRY)) {
                        ((RobertoTextView) defpackage.e.i(this, R.string.planEndWorry4, (RobertoTextView) defpackage.e.i(this, R.string.planEndWorry3, (RobertoTextView) defpackage.e.i(this, R.string.planEndWorry2, (RobertoTextView) defpackage.e.i(this, R.string.planEndWorry1, (RobertoTextView) _$_findCachedViewById(R.id.point1), R.id.point2), R.id.point3), R.id.point4), R.id.point5)).setText(getString(R.string.planEndWorry5));
                        break;
                    }
                    break;
            }
        }
        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new w5.i0(17, this));
    }
}

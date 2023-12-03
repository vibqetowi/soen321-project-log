package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticScreenLog6Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/j1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j1 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15736v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15737u = new LinkedHashMap();

    public j1() {
        LogHelper.INSTANCE.makeLogTag(j1.class);
    }

    public final Goal J(String str) {
        for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
            if (kotlin.jvm.internal.i.b(goal.getGoalId(), str)) {
                return goal;
            }
        }
        return null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15737u;
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
        return inflater.inflate(R.layout.fragment_screen_log6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15737u.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e5, code lost:
        if (r2.equals("result_double_standard_dispute_stress") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0187, code lost:
        if (r2.equals("result_double_standard_dispute_depression") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018b, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.question)).setText(getString(com.theinnerhour.b2b.R.string.logTitleDoubleStandardDispute));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019f, code lost:
        if (kotlin.jvm.internal.i.b(r2, "result_double_standard_dispute_stress") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a1, code lost:
        r3 = com.theinnerhour.b2b.utils.Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a4, code lost:
        r3 = com.theinnerhour.b2b.utils.Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a6, code lost:
        r3 = J(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01aa, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b4, code lost:
        if (r3.getData().containsKey(r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:
        r3 = com.theinnerhour.b2b.utils.UtilFunKt.result6MapToObject(r3.getData().get(r2));
        is.r.W1(r3);
        ((androidx.recyclerview.widget.RecyclerView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.log6RecyclerView)).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        r8 = r9.get("questions");
        kotlin.jvm.internal.i.e(r8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ((androidx.recyclerview.widget.RecyclerView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.log6RecyclerView)).setAdapter(new defpackage.f(r3, r1, (java.util.ArrayList) r8, r2));
        ((android.widget.TextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.nullText)).setVisibility(8);
        _$_findCachedViewById(com.theinnerhour.b2b.R.id.separator).setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ff, code lost:
        ((android.widget.TextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.nullText)).setVisibility(0);
        _$_findCachedViewById(com.theinnerhour.b2b.R.id.separator).setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020f, code lost:
        ((android.widget.ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivClose)).setOnClickListener(new fq.r(r1, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
        T8Activity t8Activity = (T8Activity) activity;
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        String string = arguments.getString("resultKey");
        if (string != null) {
            int hashCode = string.hashCode();
            HashMap<String, Object> hashMap = t8Activity.B;
            switch (hashCode) {
                case -2017702793:
                    if (string.equals("result_stages_of_problem_solving_stress")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(getString(R.string.logTitleProblemSolvingFormula));
                        Goal J = J(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING);
                        if (J != null && J.getData().containsKey(string)) {
                            ArrayList<ScreenResult6Model> result6MapToObject = UtilFunKt.result6MapToObject(J.getData().get(string));
                            is.r.W1(result6MapToObject);
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                            Object obj = hashMap.get("questions");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setAdapter(new defpackage.f(result6MapToObject, t8Activity, (ArrayList) obj, string));
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                            _$_findCachedViewById(R.id.separator).setVisibility(0);
                        } else {
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                            _$_findCachedViewById(R.id.separator).setVisibility(8);
                        }
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 7));
                        return;
                    }
                    break;
                case -1774858377:
                    break;
                case -1756480269:
                    if (string.equals("result_abc_of_assertiveness_stress")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(getString(R.string.logTitleAssertivenessFormula));
                        Goal J2 = J(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS);
                        if (J2 != null && J2.getData().containsKey(string)) {
                            ArrayList<ScreenResult6Model> result6MapToObject2 = UtilFunKt.result6MapToObject(J2.getData().get(string));
                            is.r.W1(result6MapToObject2);
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                            Object obj2 = hashMap.get("questions");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setAdapter(new defpackage.f(result6MapToObject2, t8Activity, (ArrayList) obj2, string));
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                            _$_findCachedViewById(R.id.separator).setVisibility(0);
                        } else {
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                            _$_findCachedViewById(R.id.separator).setVisibility(8);
                        }
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 8));
                        return;
                    }
                    break;
                case -1644729019:
                    break;
                case -322770765:
                    if (string.equals("result_helicopter_view_anger")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(getString(R.string.logTitleHelicopterPerspective));
                        Goal J3 = J(Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW);
                        if (J3 != null && J3.getData().containsKey(string)) {
                            ArrayList<ScreenResult6Model> result6MapToObject3 = UtilFunKt.result6MapToObject(J3.getData().get(string));
                            is.r.W1(result6MapToObject3);
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                            Object obj3 = hashMap.get("questions");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setAdapter(new defpackage.f(result6MapToObject3, t8Activity, (ArrayList) obj3, string));
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                            _$_findCachedViewById(R.id.separator).setVisibility(0);
                        } else {
                            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                            _$_findCachedViewById(R.id.separator).setVisibility(8);
                        }
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 9));
                        return;
                    }
                    break;
            }
        }
        ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
        _$_findCachedViewById(R.id.separator).setVisibility(8);
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 10));
    }
}

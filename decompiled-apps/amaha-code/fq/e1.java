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
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticScreenLog1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/e1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15699w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15701v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15700u = LogHelper.INSTANCE.makeLogTag(e1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15701v;
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
        return inflater.inflate(R.layout.fragment_screen_log1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15701v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Goal goal;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            T8Activity t8Activity = (T8Activity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(getString(R.string.logTitleStatic3GoodThings));
            Iterator<Goal> it = FirebasePersistence.getInstance().getUserGoals().iterator();
            while (true) {
                if (it.hasNext()) {
                    goal = it.next();
                    if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS, goal.getGoalId()) && kotlin.jvm.internal.i.b(Constants.COURSE_DEPRESSION, goal.getCourseName())) {
                        break;
                    }
                } else {
                    goal = null;
                    break;
                }
            }
            if (goal != null && goal.getData().containsKey("result_static_three_good_things")) {
                ArrayList<ScreenResult1Model> result1ListMapToObject = UtilFunKt.result1ListMapToObject(goal.getData().get("result_static_three_good_things"));
                ((RecyclerView) _$_findCachedViewById(R.id.log1RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                ((RecyclerView) _$_findCachedViewById(R.id.log1RecyclerView)).setAdapter(new ek.d0(result1ListMapToObject, t8Activity));
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                _$_findCachedViewById(R.id.separator).setVisibility(0);
            } else {
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                _$_findCachedViewById(R.id.separator).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15700u, "Exception", e10);
        }
    }
}

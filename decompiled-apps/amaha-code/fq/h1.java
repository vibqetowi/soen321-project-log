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
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticScreenLog38Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/h1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h1 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15721v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15722u = new LinkedHashMap();

    public h1() {
        LogHelper.INSTANCE.makeLogTag(h1.class);
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
        LinkedHashMap linkedHashMap = this.f15722u;
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
        this.f15722u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
        T5Activity t5Activity = (T5Activity) activity;
        ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(getString(R.string.logTitleWorryTime));
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        String string = arguments.getString("resultKey");
        if (kotlin.jvm.internal.i.b(string, "result_worry_time_anxiety")) {
            Goal J = J(Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME);
            if (J != null && J.getData().containsKey(string)) {
                ArrayList<ScreenResult10Model> result10MapToObject = UtilFunKt.result10MapToObject(J.getData().get(string));
                is.r.W1(result10MapToObject);
                ArrayList arrayList = new ArrayList();
                arrayList.add("What you were worried about");
                ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setAdapter(new ek.o0(result10MapToObject, t5Activity, arrayList, string));
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                _$_findCachedViewById(R.id.separator).setVisibility(0);
            } else {
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                _$_findCachedViewById(R.id.separator).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g1(t5Activity, 0));
        } else if (kotlin.jvm.internal.i.b(string, "result_worry_time_sleep")) {
            Goal J2 = J(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME);
            if (J2 != null && J2.getData().containsKey(string)) {
                ArrayList<ScreenResult10Model> result10MapToObject2 = UtilFunKt.result10MapToObject(J2.getData().get(string));
                is.r.W1(result10MapToObject2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("What you were worried about");
                ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                ((RecyclerView) _$_findCachedViewById(R.id.log6RecyclerView)).setAdapter(new ek.o0(result10MapToObject2, t5Activity, arrayList2, string));
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                _$_findCachedViewById(R.id.separator).setVisibility(0);
            } else {
                ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                _$_findCachedViewById(R.id.separator).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g1(t5Activity, 1));
        } else {
            ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
            _$_findCachedViewById(R.id.separator).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g1(t5Activity, 2));
        }
    }
}

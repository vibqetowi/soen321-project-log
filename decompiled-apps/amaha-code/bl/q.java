package bl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w5.i0;
/* compiled from: DailyPlanFirstDayFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl/q;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f4402v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f4403u = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_daily_plan_first_day_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4403u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        LinkedHashMap linkedHashMap = this.f4403u;
        Integer valueOf = Integer.valueOf((int) R.id.dailyPlanFirstDayNewCTA);
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null && (view2 = view3.findViewById(R.id.dailyPlanFirstDayNewCTA)) != null) {
                linkedHashMap.put(valueOf, view2);
            } else {
                view2 = null;
            }
        }
        ((RobertoButton) view2).setOnClickListener(new i0(24, this));
    }
}

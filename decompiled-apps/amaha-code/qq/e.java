package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableConfirmationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/e;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30028w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30030v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30029u = LogHelper.INSTANCE.makeLogTag(e.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30030v;
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
        return inflater.inflate(R.layout.fragment_screen_a9, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30030v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a9ScrollView = (ScrollView) _$_findCachedViewById(R.id.a9ScrollView);
            kotlin.jvm.internal.i.f(a9ScrollView, "a9ScrollView");
            insetsUtils.addStatusBarHeight(a9ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionPleasurableConfirmationHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setText(getString(R.string.depressionPleasurableConfirmationSubheader));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionPleasurableConfirmationCTA));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            Iterator<String> it = ((DepressionPleasurableActivity) activity).B.iterator();
            while (it.hasNext()) {
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a10, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                ((RobertoTextView) inflate.findViewById(R.id.rowContent)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new fq.x(28, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30029u, e10);
        }
    }
}

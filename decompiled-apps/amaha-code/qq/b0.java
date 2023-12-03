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
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableTaskFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/b0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30015w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30017v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30016u = LogHelper.INSTANCE.makeLogTag(b0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30017v;
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
        return inflater.inflate(R.layout.fragment_screen_a11, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30017v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a11ScrollView = (ScrollView) _$_findCachedViewById(R.id.a11ScrollView);
            kotlin.jvm.internal.i.f(a11ScrollView, "a11ScrollView");
            insetsUtils.addStatusBarHeight(a11ScrollView);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(((DepressionPleasurableActivity) activity).C);
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionPleasurableDomoreHeader));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionPleasurableDomoreCTA));
            int i6 = 0;
            while (i6 < 6) {
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a11, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                int i10 = i6 + 1;
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(String.valueOf(i10));
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 == 5) {
                                        ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore6));
                                    }
                                } else {
                                    ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore5));
                                }
                            } else {
                                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore4));
                            }
                        } else {
                            ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore3));
                        }
                    } else {
                        ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore2));
                    }
                } else {
                    ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableDomore1));
                }
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                i6 = i10;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new n(this, 5));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30016u, e10);
        }
    }
}

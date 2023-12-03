package rq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsUserFeelFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/p;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30974x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30977w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f30975u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public final String f30976v = LogHelper.INSTANCE.makeLogTag(p.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30977w;
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
        return inflater.inflate(R.layout.fragment_screen_a24, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30977w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a24ScrollView = (ScrollView) _$_findCachedViewById(R.id.a24ScrollView);
            kotlin.jvm.internal.i.f(a24ScrollView, "a24ScrollView");
            insetsUtils.addStatusBarHeight(a24ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionThoughtsUserHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader1)).setText(getString(R.string.depressionThoughtsUserSubHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader2)).setText(getString(R.string.depressionThoughtsUserSubHead2));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionThoughtsUserCTA));
            ArrayList<String> arrayList = this.f30975u;
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption1));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption2));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption3));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption4));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption5));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption6));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption7));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption8));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.row1)).setText(((DepressionThoughtsActivity) activity).A);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (true ^ kotlin.jvm.internal.i.b((String) obj, ((RobertoTextView) _$_findCachedViewById(R.id.row1)).getText())) {
                    arrayList2.add(obj);
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.row2)).setText((CharSequence) arrayList2.get(0));
            ((RobertoTextView) _$_findCachedViewById(R.id.row3)).setText((CharSequence) arrayList2.get(1));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new qq.n(this, 14));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30976v, "Thoughts User Feels", e10);
        }
    }
}

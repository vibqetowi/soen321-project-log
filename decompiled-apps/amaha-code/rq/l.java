package rq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsSelectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/l;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public View f30959w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f30962z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<Boolean> f30957u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public String f30958v = "";

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f30960x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final String f30961y = LogHelper.INSTANCE.makeLogTag(l.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30962z;
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
        return inflater.inflate(R.layout.fragment_screen_a10, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30962z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a10ScrollView = (ScrollView) _$_findCachedViewById(R.id.a10ScrollView);
            kotlin.jvm.internal.i.f(a10ScrollView, "a10ScrollView");
            insetsUtils.addStatusBarHeight(a10ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionThoughtsUserFeelsHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionThoughtsUserFeelsSubHead));
            ArrayList<String> arrayList = this.f30960x;
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption1));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption2));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption3));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption4));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption5));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption6));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption7));
            arrayList.add(getString(R.string.depressionThoughtsUserFeelsOption8));
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f30957u.add(Boolean.FALSE);
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a10, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                ((RobertoTextView) inflate.findViewById(R.id.rowContent)).setText(arrayList.get(i6));
                inflate.setOnClickListener(new ak.d(i6, 20, this));
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionThoughtsUserFeelsCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new qq.n(this, 12));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30961y, "Thoughts Selection", e10);
        }
    }
}

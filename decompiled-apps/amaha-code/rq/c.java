package rq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsAssessmentIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30925w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30927v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30926u = LogHelper.INSTANCE.makeLogTag(c.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30927v;
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
        return inflater.inflate(R.layout.fragment_screen_a14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30927v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a14Title = (RobertoTextView) _$_findCachedViewById(R.id.a14Title);
            kotlin.jvm.internal.i.f(a14Title, "a14Title");
            insetsUtils.addStatusBarHeight(a14Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionThoughtsQuizIntroHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionThoughtsQuizIntroSubHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setText(getString(R.string.depressionThoughtsQuizIntroCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setOnClickListener(new qq.n(this, 7));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30926u, "Depression Thoughts Assessment Intro", e10);
        }
    }
}

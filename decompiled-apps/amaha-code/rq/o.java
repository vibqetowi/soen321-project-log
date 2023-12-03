package rq;

import android.os.Bundle;
import android.text.TextUtils;
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
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsSummaryFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/o;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f30969y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f30973x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public String f30970u = "";

    /* renamed from: v  reason: collision with root package name */
    public final String f30971v = "result_thoughts_new";

    /* renamed from: w  reason: collision with root package name */
    public final String f30972w = LogHelper.INSTANCE.makeLogTag(o.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30973x;
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
        return inflater.inflate(R.layout.fragment_screen_aresult1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30973x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView summaryScrollView = (ScrollView) _$_findCachedViewById(R.id.summaryScrollView);
            kotlin.jvm.internal.i.f(summaryScrollView, "summaryScrollView");
            insetsUtils.addStatusBarHeight(summaryScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionThoughtsSummaryHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionThoughtsSummarySubtitle));
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText(getString(R.string.depressionThoughtsSummaryCTA));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
            String join = TextUtils.join(", ", ((DepressionThoughtsActivity) activity).D);
            kotlin.jvm.internal.i.f(join, "join(\", \", (activity as …sActivity).selectedChips)");
            this.f30970u = join;
            ((RobertoTextView) _$_findCachedViewById(R.id.topic1)).setText(getString(R.string.depressionThoughtsSummarySituation));
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.topic1content)).setText(((DepressionThoughtsActivity) activity2).B);
            ((RobertoTextView) _$_findCachedViewById(R.id.topic2)).setText(getString(R.string.depressionThoughtsSummaryFeelings));
            ((RobertoTextView) _$_findCachedViewById(R.id.topic2content)).setText(this.f30970u);
            ((RobertoTextView) _$_findCachedViewById(R.id.topic3)).setText(getString(R.string.depressionThoughtsSummaryThoughts));
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.topic3content)).setText(((DepressionThoughtsActivity) activity3).C);
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setOnClickListener(new qq.n(this, 13));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30972w, "Thoughs Summary", e10);
        }
    }
}

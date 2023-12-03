package rq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsResult2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30954w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30956v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30955u = LogHelper.INSTANCE.makeLogTag(k.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30956v;
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
        return inflater.inflate(R.layout.fragment_screen_aresult2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30956v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RobertoTextView) _$_findCachedViewById(R.id.takeaway4)).setVisibility(0);
        ((AppCompatImageView) _$_findCachedViewById(R.id.takeaway4image)).setVisibility(0);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionThoughtsResult2Head));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionThoughtsResult2SubHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.takeaway1)).setText(getString(R.string.depressionThoughtsResult2TakeAway1));
            ((RobertoTextView) _$_findCachedViewById(R.id.takeaway2)).setText(getString(R.string.depressionThoughtsResult2TakeAway2));
            ((RobertoTextView) _$_findCachedViewById(R.id.takeaway3)).setText(getString(R.string.depressionThoughtsResult2TakeAway3));
            ((RobertoTextView) _$_findCachedViewById(R.id.takeaway4)).setText(getString(R.string.depressionThoughtsResult2TakeAway4));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionThoughtsResult2CTA));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new qq.n(this, 11));
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView result2ScrollView = (ScrollView) _$_findCachedViewById(R.id.result2ScrollView);
            kotlin.jvm.internal.i.f(result2ScrollView, "result2ScrollView");
            insetsUtils.addStatusBarHeight(result2ScrollView);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30955u, "Thoughts Result2", e10);
        }
    }
}

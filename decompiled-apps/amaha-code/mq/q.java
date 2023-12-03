package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExerciseSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/q;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f25716w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f25718v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25717u = LogHelper.INSTANCE.makeLogTag(q.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25718v;
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
        this.f25718v.clear();
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
            ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionExercisesSeperator1Head));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionExercisesSeperator1SubHead));
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setText(getString(R.string.depressionExercisesSeperator1CTA));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setOnClickListener(new x(9, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25717u, e10);
        }
    }
}

package rq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsResult1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/j;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30951w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30953v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30952u = LogHelper.INSTANCE.makeLogTag(j.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30953v;
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
        return inflater.inflate(R.layout.fragment_screen_a_result1_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30953v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView result1Title = (RobertoTextView) _$_findCachedViewById(R.id.result1Title);
            kotlin.jvm.internal.i.f(result1Title, "result1Title");
            insetsUtils.addStatusBarHeight(result1Title);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            ((ConstraintLayout) _$_findCachedViewById(R.id.result1Background)).setBackgroundColor(g0.a.b(context, R.color.hopeInroBackground));
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Title)).setText(getString(R.string.depressionThoughtsResult1Head));
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Subtitle)).setText(getString(R.string.depressionThoughtsResult1SubHead));
            ((AppCompatImageView) _$_findCachedViewById(R.id.result1Image)).setImageResource(R.drawable.ir_depressionthoughts_head);
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setText(getString(R.string.depressionThoughtsResult1CTA));
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setOnClickListener(new qq.n(this, 10));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30952u, "Thoughts Results1", e10);
        }
    }
}

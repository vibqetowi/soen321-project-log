package sq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionTimeoutSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f31894w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f31896v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31895u = LogHelper.INSTANCE.makeLogTag(k.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31896v;
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
        this.f31896v.clear();
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
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setOnClickListener(null);
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionTimeoutSeperatorHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionTimeoutSeperatorSubHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setText(getString(R.string.depressionTimeoutTap));
            ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a14parent)).setOnClickListener(new qq.n(this, 20));
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setOnClickListener(null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31895u, e10);
        }
    }
}

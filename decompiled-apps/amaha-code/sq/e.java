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
/* compiled from: DepressionTimeoutInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq/e;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f31879w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f31881v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31880u = LogHelper.INSTANCE.makeLogTag(e.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31881v;
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
        return inflater.inflate(R.layout.fragment_screen_a2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31881v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a2header = (RobertoTextView) _$_findCachedViewById(R.id.a2header);
            kotlin.jvm.internal.i.f(a2header, "a2header");
            insetsUtils.addStatusBarHeight(a2header);
            ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionTimeoutInfoHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionTimeoutTap));
            ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new qq.n(this, 17));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31880u, e10);
        }
    }
}

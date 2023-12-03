package qq;

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
/* compiled from: DepressionPleasurableCompletionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30025w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30027v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30026u = LogHelper.INSTANCE.makeLogTag(d.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30027v;
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
        this.f30027v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView result1Title = (RobertoTextView) _$_findCachedViewById(R.id.result1Title);
        kotlin.jvm.internal.i.f(result1Title, "result1Title");
        insetsUtils.addStatusBarHeight(result1Title);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Title)).setText(getString(R.string.depressionPleasurableCompletionHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Subtitle)).setText(getString(R.string.depressionPleasurableCompletionSubheader));
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setText(getString(R.string.depressionPleasurableCompletionCTA));
            ((AppCompatImageView) _$_findCachedViewById(R.id.result1Image)).setBackgroundResource(R.drawable.ir_pleasurable_tv3);
            ((ConstraintLayout) _$_findCachedViewById(R.id.result1Background)).setBackgroundResource(R.color.pastel_blue);
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setOnClickListener(new fq.x(27, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30026u, e10);
        }
    }
}

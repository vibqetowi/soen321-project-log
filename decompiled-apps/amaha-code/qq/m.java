package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableLetterFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/m;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30048w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30050v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30049u = LogHelper.INSTANCE.makeLogTag(m.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30050v;
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
        return inflater.inflate(R.layout.fragment_screen_a20, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30050v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(getString(R.string.depressionPleasurableLetterPrompt));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).requestFocus();
            Object systemService = requireContext().getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput((RobertoEditText) _$_findCachedViewById(R.id.editText), 1);
            ((RobertoTextView) _$_findCachedViewById(R.id.dateTextView)).setText(new SimpleDateFormat("dd/MM/yyyy EEEE").format(Calendar.getInstance().getTime()));
            ((AppCompatImageView) _$_findCachedViewById(R.id.tickCTA)).setOnClickListener(new fq.x(29, this));
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionPleasurableLetterHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setText(getString(R.string.depressionPleasurableLetterSubheader));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30049u, e10);
        }
    }
}

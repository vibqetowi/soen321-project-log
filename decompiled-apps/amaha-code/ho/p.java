package ho;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import ik.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: ProAssessmentProactiveFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/p;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f18036y = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18039w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18040x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18037u = LogHelper.INSTANCE.makeLogTag(p.class);

    /* renamed from: v  reason: collision with root package name */
    public String f18038v = "";

    public final void J(boolean z10) {
        float f;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.proactiveNext);
            if (appCompatImageView != null) {
                if (z10) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                appCompatImageView.setAlpha(f);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.proactiveNext);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setEnabled(z10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18037u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18040x;
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
        return inflater.inflate(R.layout.fragment_pa_proactive, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18040x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            String[] stringArray = getResources().getStringArray(R.array.paProactiveOptions);
            kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray…array.paProactiveOptions)");
            ArrayList k10 = ca.a.k(Arrays.copyOf(stringArray, stringArray.length));
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.proactiveOptionsLL);
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            int i6 = 0;
            for (Object obj : k10) {
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    String str = (String) obj;
                    View inflate = getLayoutInflater().inflate(R.layout.row_pa_option, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.proactiveOptionsLL)), false);
                    RobertoButton robertoButton = (RobertoButton) inflate.findViewById(R.id.optionButton);
                    if (robertoButton != null) {
                        robertoButton.setText(str);
                    }
                    RobertoButton robertoButton2 = (RobertoButton) inflate.findViewById(R.id.optionButton);
                    if (robertoButton2 != null) {
                        robertoButton2.setOnClickListener(new l1(this, i6, k10, 25));
                    }
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.proactiveOptionsLL);
                    if (linearLayout2 != null) {
                        linearLayout2.addView(inflate);
                    }
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            View inflate2 = getLayoutInflater().inflate(R.layout.row_pa_option_expandable, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.proactiveOptionsLL)), false);
            ((RobertoButton) inflate2.findViewById(R.id.optionButton)).setText(getString(R.string.other));
            ((RobertoEditText) inflate2.findViewById(R.id.optionEditText)).setHint(getString(R.string.feedback_input_hint_italics));
            ((RobertoEditText) inflate2.findViewById(R.id.optionEditText)).addTextChangedListener(new a());
            RobertoButton robertoButton3 = (RobertoButton) inflate2.findViewById(R.id.optionButton);
            if (robertoButton3 != null) {
                robertoButton3.setOnClickListener(new o(this, 0, inflate2));
            }
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R.id.proactiveOptionsLL);
            if (linearLayout3 != null) {
                linearLayout3.addView(inflate2);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.proactiveNext);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new v0(15, this));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18037u, e10);
        }
    }

    /* compiled from: ProAssessmentProactiveFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            if (charSequence != null && !gv.n.B0(charSequence)) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i12 = p.f18036y;
            p.this.J(!z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}

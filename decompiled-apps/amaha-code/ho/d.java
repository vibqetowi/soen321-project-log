package ho;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: ProAssessmentAgeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f17986w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f17988v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17987u = LogHelper.INSTANCE.makeLogTag(d.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17988v;
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
        return inflater.inflate(R.layout.fragment_pa_assessment_age, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17988v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentAgeText);
            if (robertoEditText != null) {
                robertoEditText.addTextChangedListener(new a());
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentAgeText);
            if (robertoEditText2 != null) {
                robertoEditText2.setOnEditorActionListener(new dl.w(4, this));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentAgeCta);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new v0(10, this));
            }
            RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentAgeText);
            if (robertoEditText3 != null) {
                robertoEditText3.requestFocus();
            }
            if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentAgeText)) != null) {
                UiUtils.Companion companion = UiUtils.Companion;
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                RobertoEditText paAssessmentAgeText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentAgeText);
                kotlin.jvm.internal.i.f(paAssessmentAgeText, "paAssessmentAgeText");
                companion.showKeyboardFrom(requireContext, paAssessmentAgeText);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17987u, e10);
        }
    }

    /* compiled from: ProAssessmentAgeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            float f;
            AppCompatImageView appCompatImageView = (AppCompatImageView) d.this._$_findCachedViewById(R.id.paAssessmentAgeCta);
            if (appCompatImageView != null) {
                if (charSequence != null && !gv.n.B0(charSequence)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    f = 0.34f;
                } else {
                    f = 1.0f;
                }
                appCompatImageView.setAlpha(f);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}

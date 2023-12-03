package pq;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: DepressionMasteryMultiSelectFragment.kt */
/* loaded from: classes2.dex */
public final class l implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f28793u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f28794v;

    public l(m mVar, Dialog dialog) {
        this.f28793u = mVar;
        this.f28794v = dialog;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        int i12;
        Dialog dialog = this.f28794v;
        String lowerCase = String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()).toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        int i13 = m.C;
        m mVar = this.f28793u;
        mVar.getClass();
        try {
            int childCount = ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildCount() - 1;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildAt(i14);
                String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.optionTitle)).getText().toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (gv.r.J0(lowerCase2, lowerCase)) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                childAt.setVisibility(i12);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(mVar.f28795u, e10.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

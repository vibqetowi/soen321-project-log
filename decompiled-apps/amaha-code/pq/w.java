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
/* compiled from: DepressionMasterySingleSelectFragment.kt */
/* loaded from: classes2.dex */
public final class w implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f28830u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f28831v;

    public w(x xVar, Dialog dialog) {
        this.f28830u = xVar;
        this.f28831v = dialog;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        int i12;
        Dialog dialog = this.f28831v;
        String lowerCase = String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()).toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        int i13 = x.A;
        x xVar = this.f28830u;
        xVar.getClass();
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
            LogHelper.INSTANCE.e(xVar.f28832u, e10.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

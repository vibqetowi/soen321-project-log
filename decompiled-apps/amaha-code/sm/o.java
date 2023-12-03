package sm;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: JournalThoughtDescriptionFragment.kt */
/* loaded from: classes2.dex */
public final class o implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f31731u;

    public o(s sVar) {
        this.f31731u = sVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        Editable text;
        CharSequence i12;
        boolean z11;
        s sVar = this.f31731u;
        try {
            boolean z12 = true;
            if (String.valueOf(charSequence).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                RobertoTextView robertoTextView = (RobertoTextView) sVar._$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
            } else {
                RobertoTextView robertoTextView2 = (RobertoTextView) sVar._$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setVisibility(8);
                }
            }
            int i13 = s.K;
            tm.a aVar = sVar.O().A;
            RobertoEditText robertoEditText = (RobertoEditText) sVar._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
            if (robertoEditText != null && (text = robertoEditText.getText()) != null && (i12 = gv.r.i1(text)) != null) {
                if (i12.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    aVar.f(z12);
                }
            }
            z12 = false;
            aVar.f(z12);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sVar.f31735v, e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

package rm;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: JournalTodayQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class c implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f30795u;

    public c(h hVar) {
        this.f30795u = hVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        h hVar = this.f30795u;
        try {
            if (String.valueOf(charSequence).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                RobertoTextView robertoTextView = (RobertoTextView) hVar._$_findCachedViewById(R.id.tvJournalQuestionHintText);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
            } else {
                RobertoTextView robertoTextView2 = (RobertoTextView) hVar._$_findCachedViewById(R.id.tvJournalQuestionHintText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setVisibility(8);
                }
            }
            int i12 = h.N;
            hVar.Q();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(hVar.f30800v, e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

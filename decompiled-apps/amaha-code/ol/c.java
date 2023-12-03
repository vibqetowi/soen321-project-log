package ol;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.theinnerhour.b2b.R;
/* compiled from: N12CScreenAdapter.kt */
/* loaded from: classes2.dex */
public final class c implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f27618u;

    public c(View view) {
        this.f27618u = view;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        int i12;
        int i13;
        View findViewById = this.f27618u.findViewById(R.id.tvN12CAdditionalTextLimitError);
        if (charSequence != null) {
            i12 = charSequence.length();
        } else {
            i12 = -1;
        }
        if (i12 >= 120) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        findViewById.setVisibility(i13);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

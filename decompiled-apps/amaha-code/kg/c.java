package kg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class c implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f23326u;

    public c(f fVar) {
        this.f23326u = fVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        String charSequence2 = charSequence.toString();
        f fVar = this.f23326u;
        TextView textView = fVar.f23332z;
        textView.setVisibility(8);
        String lowerCase = charSequence2.toLowerCase();
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
            lowerCase = lowerCase.substring(1);
        }
        ArrayList v10 = fVar.v(lowerCase);
        fVar.f23330x = v10;
        if (v10.size() == 0) {
            textView.setVisibility(0);
        }
        fVar.i();
        boolean equals = charSequence.toString().trim().equals("");
        ImageView imageView = fVar.F;
        if (equals) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

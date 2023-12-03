package qm;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: JournalBasicFragment.kt */
/* loaded from: classes2.dex */
public final class f implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f29871u;

    public f(j jVar) {
        this.f29871u = jVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        if (charSequence != null) {
            charSequence.length();
        }
        int i12 = j.L;
        j jVar = this.f29871u;
        jVar.getClass();
        jVar.Q();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

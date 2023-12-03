package com.hbb20;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: CountryCodePicker.java */
/* loaded from: classes.dex */
public final class f implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10158u;

    public f(CountryCodePicker countryCodePicker) {
        this.f10158u = countryCodePicker;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i6 = CountryCodePicker.Z0;
        this.f10158u.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}

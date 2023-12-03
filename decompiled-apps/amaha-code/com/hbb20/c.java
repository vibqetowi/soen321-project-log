package com.hbb20;

import android.content.DialogInterface;
/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class c implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10151u;

    public c(CountryCodePicker countryCodePicker) {
        this.f10151u = countryCodePicker;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        e.a(e.f10157e);
        this.f10151u.getDialogEventsListener();
    }
}

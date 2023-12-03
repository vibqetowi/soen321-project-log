package com.hbb20;

import android.content.DialogInterface;
/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class d implements DialogInterface.OnCancelListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10152u;

    public d(CountryCodePicker countryCodePicker) {
        this.f10152u = countryCodePicker;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        e.a(e.f10157e);
        this.f10152u.getDialogEventsListener();
    }
}

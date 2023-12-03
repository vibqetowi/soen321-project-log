package com.google.android.material.datepicker;

import android.view.View;
/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class t implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f8996u;

    public t(r rVar) {
        this.f8996u = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r rVar = this.f8996u;
        rVar.Q.setEnabled(rVar.F().T());
        rVar.O.toggle();
        rVar.O(rVar.O);
        rVar.M();
    }
}

package com.google.android.material.datepicker;

import android.view.View;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f8980u;

    public o(j jVar) {
        this.f8980u = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f8980u;
        int i6 = jVar.A;
        if (i6 == 2) {
            jVar.J(1);
        } else if (i6 == 1) {
            jVar.J(2);
        }
    }
}

package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z f8961u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f8962v;

    public h(j jVar, z zVar) {
        this.f8962v = jVar;
        this.f8961u = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f8962v;
        int findLastVisibleItemPosition = ((LinearLayoutManager) jVar.D.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            Calendar b10 = e0.b(this.f8961u.f9015x.f8923u.f9001u);
            b10.add(2, findLastVisibleItemPosition);
            jVar.I(new w(b10));
        }
    }
}

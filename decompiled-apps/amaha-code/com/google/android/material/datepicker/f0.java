package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;
/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8953u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g0 f8954v;

    public f0(g0 g0Var, int i6) {
        this.f8954v = g0Var;
        this.f8953u = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g0 g0Var = this.f8954v;
        w d10 = w.d(this.f8953u, g0Var.f8959x.f8969z.f9002v);
        j<?> jVar = g0Var.f8959x;
        a aVar = jVar.f8967x;
        w wVar = aVar.f8923u;
        Calendar calendar = wVar.f9001u;
        Calendar calendar2 = d10.f9001u;
        if (calendar2.compareTo(calendar) < 0) {
            d10 = wVar;
        } else {
            w wVar2 = aVar.f8924v;
            if (calendar2.compareTo(wVar2.f9001u) > 0) {
                d10 = wVar2;
            }
        }
        jVar.I(d10);
        jVar.J(1);
    }
}

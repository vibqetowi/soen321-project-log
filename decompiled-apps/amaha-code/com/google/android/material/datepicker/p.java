package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class p implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z f8981u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f8982v;

    public p(j jVar, z zVar) {
        this.f8982v = jVar;
        this.f8981u = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f8982v;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) jVar.D.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < jVar.D.getAdapter().f()) {
            Calendar b10 = e0.b(this.f8981u.f9015x.f8923u.f9001u);
            b10.add(2, findFirstVisibleItemPosition);
            jVar.I(new w(b10));
        }
    }
}

package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Iterator;
/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public final class y implements AdapterView.OnItemClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f9013u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z f9014v;

    public y(z zVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f9014v = zVar;
        this.f9013u = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
        boolean z10;
        MaterialCalendarGridView materialCalendarGridView = this.f9013u;
        x adapter2 = materialCalendarGridView.getAdapter2();
        if (i6 >= adapter2.b() && i6 <= (adapter2.b() + adapter2.f9007u.f9005y) - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j.d dVar = this.f9014v.A;
            long longValue = materialCalendarGridView.getAdapter2().getItem(i6).longValue();
            j jVar = j.this;
            if (jVar.f8967x.f8925w.Q(longValue)) {
                jVar.f8966w.t();
                Iterator it = jVar.f8940u.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).a(jVar.f8966w.Y());
                }
                jVar.D.getAdapter().i();
                RecyclerView recyclerView = jVar.C;
                if (recyclerView != null) {
                    recyclerView.getAdapter().i();
                }
            }
        }
    }
}

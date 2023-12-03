package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class n extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f8977a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f8978b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f8979c;

    public n(j jVar, z zVar, MaterialButton materialButton) {
        this.f8979c = jVar;
        this.f8977a = zVar;
        this.f8978b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        if (i6 == 0) {
            recyclerView.announceForAccessibility(this.f8978b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        int findLastVisibleItemPosition;
        j jVar = this.f8979c;
        if (i6 < 0) {
            findLastVisibleItemPosition = ((LinearLayoutManager) jVar.D.getLayoutManager()).findFirstVisibleItemPosition();
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) jVar.D.getLayoutManager()).findLastVisibleItemPosition();
        }
        z zVar = this.f8977a;
        Calendar b10 = e0.b(zVar.f9015x.f8923u.f9001u);
        b10.add(2, findLastVisibleItemPosition);
        jVar.f8969z = new w(b10);
        Calendar b11 = e0.b(zVar.f9015x.f8923u.f9001u);
        b11.add(2, findLastVisibleItemPosition);
        b11.set(5, 1);
        Calendar b12 = e0.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        this.f8978b.setText(DateUtils.formatDateTime(null, b12.getTimeInMillis(), 8228));
    }
}

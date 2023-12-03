package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.WeakHashMap;
import t0.o0;
/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public final class z extends RecyclerView.e<a> {
    public final j.d A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f9015x;

    /* renamed from: y  reason: collision with root package name */
    public final d<?> f9016y;

    /* renamed from: z  reason: collision with root package name */
    public final f f9017z;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f9018u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f9019v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f9018u = textView;
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            new t0.c0().e(textView, Boolean.TRUE);
            this.f9019v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public z(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, f fVar, j.c cVar) {
        int i6;
        Calendar calendar = aVar.f8923u.f9001u;
        w wVar = aVar.f8926x;
        if (calendar.compareTo(wVar.f9001u) <= 0) {
            if (wVar.f9001u.compareTo(aVar.f8924v.f9001u) <= 0) {
                int i10 = x.A;
                int i11 = j.I;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i10;
                if (r.J(contextThemeWrapper)) {
                    i6 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i6 = 0;
                }
                this.B = dimensionPixelSize + i6;
                this.f9015x = aVar;
                this.f9016y = dVar;
                this.f9017z = fVar;
                this.A = cVar;
                if (!this.f2769u.a()) {
                    this.f2770v = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f9015x.A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long g(int i6) {
        Calendar b10 = e0.b(this.f9015x.f8923u.f9001u);
        b10.add(2, i6);
        return new w(b10).f9001u.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        com.google.android.material.datepicker.a aVar3 = this.f9015x;
        Calendar b10 = e0.b(aVar3.f8923u.f9001u);
        b10.add(2, i6);
        w wVar = new w(b10);
        aVar2.f9018u.setText(wVar.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f9019v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && wVar.equals(materialCalendarGridView.getAdapter2().f9007u)) {
            materialCalendarGridView.invalidate();
            x adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l2 : adapter2.f9009w) {
                adapter2.e(materialCalendarGridView, l2.longValue());
            }
            d<?> dVar = adapter2.f9008v;
            if (dVar != null) {
                for (Long l10 : dVar.W()) {
                    adapter2.e(materialCalendarGridView, l10.longValue());
                }
                adapter2.f9009w = dVar.W();
            }
        } else {
            x xVar = new x(wVar, this.f9016y, aVar3, this.f9017z);
            materialCalendarGridView.setNumColumns(wVar.f9004x);
            materialCalendarGridView.setAdapter((ListAdapter) xVar);
        }
        materialCalendarGridView.setOnItemClickListener(new y(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) defpackage.d.d(recyclerView, R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (r.J(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.B));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}

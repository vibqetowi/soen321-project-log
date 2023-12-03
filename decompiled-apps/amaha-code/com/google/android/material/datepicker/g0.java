package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public final class g0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final j<?> f8959x;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f8960u;

        public a(TextView textView) {
            super(textView);
            this.f8960u = textView;
        }
    }

    public g0(j<?> jVar) {
        this.f8959x = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f8959x.f8967x.f8928z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String format;
        Object obj;
        j<?> jVar = this.f8959x;
        int i10 = jVar.f8967x.f8923u.f9003w + i6;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
        TextView textView = aVar.f8960u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (e0.c().get(1) == i10) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
        }
        textView.setContentDescription(format);
        c cVar = jVar.B;
        Calendar c10 = e0.c();
        if (c10.get(1) == i10) {
            obj = cVar.f;
        } else {
            obj = cVar.f8944d;
        }
        b bVar = (b) obj;
        for (Long l2 : jVar.f8966w.W()) {
            c10.setTimeInMillis(l2.longValue());
            if (c10.get(1) == i10) {
                bVar = (b) cVar.f8945e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new f0(this, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new a((TextView) defpackage.d.d(recyclerView, R.layout.mtrl_calendar_year, recyclerView, false));
    }
}

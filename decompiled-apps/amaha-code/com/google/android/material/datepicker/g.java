package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: x  reason: collision with root package name */
    public static final int f8955x;

    /* renamed from: u  reason: collision with root package name */
    public final Calendar f8956u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8957v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8958w;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 26) {
            i6 = 4;
        } else {
            i6 = 1;
        }
        f8955x = i6;
    }

    public g() {
        Calendar d10 = e0.d(null);
        this.f8956u = d10;
        this.f8957v = d10.getMaximum(7);
        this.f8958w = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8957v;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i10 = this.f8957v;
        if (i6 >= i10) {
            return null;
        }
        int i11 = i6 + this.f8958w;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i6 + this.f8958w;
        int i11 = this.f8957v;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f8956u;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f8955x, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i6) {
        Calendar d10 = e0.d(null);
        this.f8956u = d10;
        this.f8957v = d10.getMaximum(7);
        this.f8958w = i6;
    }
}

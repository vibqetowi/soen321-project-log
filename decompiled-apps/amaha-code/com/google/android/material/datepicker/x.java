package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: MonthAdapter.java */
/* loaded from: classes.dex */
public final class x extends BaseAdapter {
    public static final int A = e0.d(null).getMaximum(4);
    public static final int B = (e0.d(null).getMaximum(7) + e0.d(null).getMaximum(5)) - 1;

    /* renamed from: u  reason: collision with root package name */
    public final w f9007u;

    /* renamed from: v  reason: collision with root package name */
    public final d<?> f9008v;

    /* renamed from: w  reason: collision with root package name */
    public Collection<Long> f9009w;

    /* renamed from: x  reason: collision with root package name */
    public c f9010x;

    /* renamed from: y  reason: collision with root package name */
    public final a f9011y;

    /* renamed from: z  reason: collision with root package name */
    public final f f9012z;

    public x(w wVar, d<?> dVar, a aVar, f fVar) {
        this.f9007u = wVar;
        this.f9008v = dVar;
        this.f9011y = aVar;
        this.f9012z = fVar;
        this.f9009w = dVar.W();
    }

    public final int b() {
        int i6 = this.f9011y.f8927y;
        w wVar = this.f9007u;
        Calendar calendar = wVar.f9001u;
        int i10 = calendar.get(7);
        if (i6 <= 0) {
            i6 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i6;
        if (i11 < 0) {
            return i11 + wVar.f9004x;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i6) {
        if (i6 >= b()) {
            int b10 = b();
            w wVar = this.f9007u;
            if (i6 <= (b10 + wVar.f9005y) - 1) {
                Calendar b11 = e0.b(wVar.f9001u);
                b11.set(5, (i6 - b()) + 1);
                return Long.valueOf(b11.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    public final void d(TextView textView, long j10, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String format;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        b bVar;
        boolean z14;
        DateFormat instanceForSkeleton2;
        TimeZone timeZone2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z15 = true;
        if (e0.c().getTimeInMillis() == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d<?> dVar = this.f9008v;
        Iterator<s0.c<Long, Long>> it = dVar.z().iterator();
        while (true) {
            if (it.hasNext()) {
                Long l2 = it.next().f31064a;
                if (l2 != null && l2.longValue() == j10) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        Iterator<s0.c<Long, Long>> it2 = dVar.z().iterator();
        while (true) {
            if (it2.hasNext()) {
                Long l10 = it2.next().f31065b;
                if (l10 != null && l10.longValue() == j10) {
                    z12 = true;
                    break;
                }
            } else {
                z12 = false;
                break;
            }
        }
        Calendar c10 = e0.c();
        Calendar d10 = e0.d(null);
        d10.setTimeInMillis(j10);
        if (c10.get(1) == d10.get(1)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                timeZone2 = TimeZone.getTimeZone("UTC");
                instanceForSkeleton2.setTimeZone(timeZone2);
                format = instanceForSkeleton2.format(new Date(j10));
            } else {
                java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance.format(new Date(j10));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                timeZone = TimeZone.getTimeZone("UTC");
                instanceForSkeleton.setTimeZone(timeZone);
                format = instanceForSkeleton.format(new Date(j10));
            } else {
                java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance2.format(new Date(j10));
            }
        }
        if (z10) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z11) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z12) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f9011y.f8925w.Q(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dVar.W().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (e0.a(j10) == e0.a(it3.next().longValue())) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            textView.setSelected(z14);
            if (z14) {
                bVar = (b) this.f9010x.f8942b;
            } else {
                if (e0.c().getTimeInMillis() != j10) {
                    z15 = false;
                }
                if (z15) {
                    bVar = (b) this.f9010x.f8943c;
                } else {
                    bVar = (b) this.f9010x.f8941a;
                }
            }
        } else {
            textView.setEnabled(false);
            bVar = (b) this.f9010x.f8946g;
        }
        if (this.f9012z != null && i6 != -1) {
            int i10 = this.f9007u.f9003w;
            bVar.b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        bVar.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        w f = w.f(j10);
        w wVar = this.f9007u;
        if (f.equals(wVar)) {
            Calendar b10 = e0.b(wVar.f9001u);
            b10.setTimeInMillis(j10);
            int i6 = b10.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().b() + (i6 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i6);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return B;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6 / this.f9007u.f9004x;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        int i10;
        Long item;
        Context context = viewGroup.getContext();
        if (this.f9010x == null) {
            this.f9010x = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int b10 = i6 - b();
        if (b10 >= 0) {
            w wVar = this.f9007u;
            if (b10 < wVar.f9005y) {
                i10 = b10 + 1;
                textView.setTag(wVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i10)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i6);
                if (item != null) {
                    d(textView, item.longValue(), i10);
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i10 = -1;
        item = getItem(i6);
        if (item != null) {
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

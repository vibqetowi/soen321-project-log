package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: UtcDates.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<d0> f8952a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar d10 = d(null);
        d10.setTimeInMillis(j10);
        return b(d10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d10 = d(calendar);
        Calendar d11 = d(null);
        d11.set(d10.get(1), d10.get(2), d10.get(5));
        return d11;
    }

    public static Calendar c() {
        Calendar calendar;
        d0 d0Var = f8952a.get();
        if (d0Var == null) {
            d0Var = d0.f8948c;
        }
        TimeZone timeZone = d0Var.f8950b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l2 = d0Var.f8949a;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}

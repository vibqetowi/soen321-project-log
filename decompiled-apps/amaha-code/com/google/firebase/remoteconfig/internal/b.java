package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Date f9826d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    public static final Date f9827e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9828a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9829b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f9830c = new Object();

    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9831a;

        /* renamed from: b  reason: collision with root package name */
        public final Date f9832b;

        public a(Date date, int i6) {
            this.f9831a = i6;
            this.f9832b = date;
        }
    }

    public b(SharedPreferences sharedPreferences) {
        this.f9828a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f9830c) {
            aVar = new a(new Date(this.f9828a.getLong("backoff_end_time_in_millis", -1L)), this.f9828a.getInt("num_failed_fetches", 0));
        }
        return aVar;
    }

    public final void b(Date date, int i6) {
        synchronized (this.f9830c) {
            this.f9828a.edit().putInt("num_failed_fetches", i6).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void c() {
        synchronized (this.f9829b) {
            this.f9828a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void d() {
        synchronized (this.f9829b) {
            this.f9828a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

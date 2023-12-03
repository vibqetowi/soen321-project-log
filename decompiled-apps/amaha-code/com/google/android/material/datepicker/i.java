package com.google.android.material.datepicker;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8963u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f8964v;

    public i(j jVar, int i6) {
        this.f8964v = jVar;
        this.f8963u = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8964v.D.l0(this.f8963u);
    }
}

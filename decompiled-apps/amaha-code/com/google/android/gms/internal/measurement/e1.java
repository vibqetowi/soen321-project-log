package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public abstract class e1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final long f8349u;

    /* renamed from: v  reason: collision with root package name */
    public final long f8350v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f8351w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j1 f8352x;

    public e1(j1 j1Var, boolean z10) {
        this.f8352x = j1Var;
        j1Var.f8437b.getClass();
        this.f8349u = System.currentTimeMillis();
        j1Var.f8437b.getClass();
        this.f8350v = SystemClock.elapsedRealtime();
        this.f8351w = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.f8352x;
        if (j1Var.f8441g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            j1Var.a(e10, false, this.f8351w);
            b();
        }
    }

    public void b() {
    }
}

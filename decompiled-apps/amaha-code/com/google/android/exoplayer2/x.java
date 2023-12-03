package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeoutException;
/* compiled from: PlayerMessage.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final b f7207a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7208b;

    /* renamed from: c  reason: collision with root package name */
    public final c9.b f7209c;

    /* renamed from: d  reason: collision with root package name */
    public int f7210d;

    /* renamed from: e  reason: collision with root package name */
    public Object f7211e;
    public final Looper f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7212g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7213h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7214i;

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface b {
        void o(int i6, Object obj);
    }

    public x(m mVar, b bVar, e0 e0Var, int i6, c9.b bVar2, Looper looper) {
        this.f7208b = mVar;
        this.f7207a = bVar;
        this.f = looper;
        this.f7209c = bVar2;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        boolean z11;
        sc.b.C(this.f7212g);
        if (this.f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        long d10 = this.f7209c.d() + j10;
        while (true) {
            z11 = this.f7214i;
            if (z11 || j10 <= 0) {
                break;
            }
            this.f7209c.c();
            wait(j10);
            j10 = d10 - this.f7209c.d();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f7213h = z10 | this.f7213h;
        this.f7214i = true;
        notifyAll();
    }

    public final void c() {
        sc.b.C(!this.f7212g);
        this.f7212g = true;
        m mVar = (m) this.f7208b;
        synchronized (mVar) {
            if (!mVar.T && mVar.C.isAlive()) {
                mVar.B.k(14, this).a();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import t9.a;
import t9.c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends t9.c> extends t9.a<R> {

    /* renamed from: m  reason: collision with root package name */
    public static final d1 f7319m = new d1(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f7320a;

    /* renamed from: b  reason: collision with root package name */
    public final a<R> f7321b;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f7322c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<a.InterfaceC0547a> f7323d;

    /* renamed from: e  reason: collision with root package name */
    public t9.d<? super R> f7324e;
    public final AtomicReference<t0> f;

    /* renamed from: g  reason: collision with root package name */
    public R f7325g;

    /* renamed from: h  reason: collision with root package name */
    public Status f7326h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f7327i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7328j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7329k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7330l;
    @KeepName
    private e1 mResultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static class a<R extends t9.c> extends ka.d {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 != 1) {
                if (i6 != 2) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Don't know how to handle message: ");
                    sb2.append(i6);
                    Log.wtf("BasePendingResult", sb2.toString(), new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).e(Status.C);
                return;
            }
            Pair pair = (Pair) message.obj;
            t9.d dVar = (t9.d) pair.first;
            t9.c cVar = (t9.c) pair.second;
            try {
                dVar.a(cVar);
            } catch (RuntimeException e10) {
                BasePendingResult.l(cVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f7320a = new Object();
        this.f7322c = new CountDownLatch(1);
        this.f7323d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.f7330l = false;
        this.f7321b = new a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void l(t9.c cVar) {
        if (cVar instanceof t9.b) {
            try {
                ((t9.b) cVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(cVar)), e10);
            }
        }
    }

    public final void b(a.InterfaceC0547a interfaceC0547a) {
        synchronized (this.f7320a) {
            if (g()) {
                interfaceC0547a.a(this.f7326h);
            } else {
                this.f7323d.add(interfaceC0547a);
            }
        }
    }

    public final void c() {
        synchronized (this.f7320a) {
            if (!this.f7328j && !this.f7327i) {
                l(this.f7325g);
                this.f7328j = true;
                k(d(Status.D));
            }
        }
    }

    public abstract R d(Status status);

    @Deprecated
    public final void e(Status status) {
        synchronized (this.f7320a) {
            if (!g()) {
                a(d(status));
                this.f7329k = true;
            }
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f7320a) {
            z10 = this.f7328j;
        }
        return z10;
    }

    public final boolean g() {
        if (this.f7322c.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void a(R r) {
        synchronized (this.f7320a) {
            if (!this.f7329k && !this.f7328j) {
                g();
                v9.o.j("Results have already been set", !g());
                v9.o.j("Result has already been consumed", !this.f7327i);
                k(r);
                return;
            }
            l(r);
        }
    }

    public final void i(m9.f0 f0Var) {
        synchronized (this.f7320a) {
            v9.o.j("Result has already been consumed.", !this.f7327i);
            if (f()) {
                return;
            }
            if (g()) {
                a<R> aVar = this.f7321b;
                R j10 = j();
                aVar.getClass();
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(f0Var, j10)));
            } else {
                this.f7324e = f0Var;
            }
        }
    }

    public final R j() {
        R r;
        synchronized (this.f7320a) {
            v9.o.j("Result has already been consumed.", !this.f7327i);
            v9.o.j("Result is not ready.", g());
            r = this.f7325g;
            this.f7325g = null;
            this.f7324e = null;
            this.f7327i = true;
        }
        if (this.f.getAndSet(null) == null) {
            v9.o.h(r);
            return r;
        }
        throw null;
    }

    public final void k(R r) {
        this.f7325g = r;
        this.f7326h = r.X();
        this.f7322c.countDown();
        if (this.f7328j) {
            this.f7324e = null;
        } else {
            t9.d<? super R> dVar = this.f7324e;
            if (dVar == null) {
                if (this.f7325g instanceof t9.b) {
                    this.mResultGuardian = new e1(this);
                }
            } else {
                a<R> aVar = this.f7321b;
                aVar.removeMessages(2);
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(dVar, j())));
            }
        }
        ArrayList<a.InterfaceC0547a> arrayList = this.f7323d;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a(this.f7326h);
        }
        arrayList.clear();
    }

    public BasePendingResult(f0 f0Var) {
        Looper mainLooper;
        this.f7320a = new Object();
        this.f7322c = new CountDownLatch(1);
        this.f7323d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.f7330l = false;
        if (f0Var != null) {
            mainLooper = f0Var.f7373b.f;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f7321b = new a<>(mainLooper);
        new WeakReference(f0Var);
    }
}

package ov;

import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.i;
import ov.d;
import ta.v;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f27793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27794b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27795c;

    /* renamed from: d  reason: collision with root package name */
    public a f27796d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f27797e;
    public boolean f;

    public c(d taskRunner, String name) {
        i.g(taskRunner, "taskRunner");
        i.g(name, "name");
        this.f27793a = taskRunner;
        this.f27794b = name;
        this.f27797e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = mv.b.f25755a;
        synchronized (this.f27793a) {
            if (b()) {
                this.f27793a.e(this);
            }
            k kVar = k.f19476a;
        }
    }

    public final boolean b() {
        a aVar = this.f27796d;
        if (aVar != null && aVar.f27789b) {
            this.f = true;
        }
        ArrayList arrayList = this.f27797e;
        int size = arrayList.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i6 = size - 1;
                if (((a) arrayList.get(size)).f27789b) {
                    a aVar2 = (a) arrayList.get(size);
                    d.b bVar = d.f27798h;
                    if (d.f27800j.isLoggable(Level.FINE)) {
                        v.d(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z10 = true;
                }
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        return z10;
    }

    public final void c(a task, long j10) {
        i.g(task, "task");
        synchronized (this.f27793a) {
            if (this.f27795c) {
                if (task.f27789b) {
                    d.f27798h.getClass();
                    if (d.f27800j.isLoggable(Level.FINE)) {
                        v.d(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                d.f27798h.getClass();
                if (d.f27800j.isLoggable(Level.FINE)) {
                    v.d(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(task, j10, false)) {
                this.f27793a.e(this);
            }
            k kVar = k.f19476a;
        }
    }

    public final boolean e(a task, long j10, boolean z10) {
        boolean z11;
        String n10;
        boolean z12;
        i.g(task, "task");
        c cVar = task.f27790c;
        if (cVar != this) {
            if (cVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                task.f27790c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c10 = this.f27793a.f27801a.c();
        long j11 = c10 + j10;
        ArrayList arrayList = this.f27797e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f27791d <= j11) {
                d.b bVar = d.f27798h;
                if (d.f27800j.isLoggable(Level.FINE)) {
                    v.d(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f27791d = j11;
        d.b bVar2 = d.f27798h;
        if (d.f27800j.isLoggable(Level.FINE)) {
            if (z10) {
                n10 = i.n(v.u(j11 - c10), "run again after ");
            } else {
                n10 = i.n(v.u(j11 - c10), "scheduled after ");
            }
            v.d(task, this, n10);
        }
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f27791d - c10 > j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 == -1) {
            i6 = arrayList.size();
        }
        arrayList.add(i6, task);
        if (i6 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = mv.b.f25755a;
        synchronized (this.f27793a) {
            this.f27795c = true;
            if (b()) {
                this.f27793a.e(this);
            }
            k kVar = k.f19476a;
        }
    }

    public final String toString() {
        return this.f27794b;
    }
}

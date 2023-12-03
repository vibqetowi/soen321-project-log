package lv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pv.d;
/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f24664a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<d.a> f24665b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<d.a> f24666c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<pv.d> f24667d = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        if (this.f24664a == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            String name = kotlin.jvm.internal.i.n(" Dispatcher", mv.b.f25760g);
            kotlin.jvm.internal.i.g(name, "name");
            this.f24664a = new ThreadPoolExecutor(0, (int) SubsamplingScaleImageView.TILE_SIZE_AUTO, 60L, timeUnit, synchronousQueue, new mv.a(name, false));
        }
        threadPoolExecutor = this.f24664a;
        kotlin.jvm.internal.i.d(threadPoolExecutor);
        return threadPoolExecutor;
    }

    public final void b(d.a call) {
        kotlin.jvm.internal.i.g(call, "call");
        call.f29055v.decrementAndGet();
        ArrayDeque<d.a> arrayDeque = this.f24666c;
        synchronized (this) {
            if (arrayDeque.remove(call)) {
                d();
                hs.k kVar = hs.k.f19476a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        g();
    }

    public final void c(pv.d call) {
        kotlin.jvm.internal.i.g(call, "call");
        ArrayDeque<pv.d> arrayDeque = this.f24667d;
        synchronized (this) {
            if (arrayDeque.remove(call)) {
                d();
                hs.k kVar = hs.k.f19476a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        g();
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
    }

    public final synchronized void f() {
    }

    public final void g() {
        byte[] bArr = mv.b.f25755a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<d.a> it = this.f24665b.iterator();
            kotlin.jvm.internal.i.f(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                d.a next = it.next();
                int size = this.f24666c.size();
                e();
                if (size >= 64) {
                    break;
                }
                int i6 = next.f29055v.get();
                f();
                if (i6 < 5) {
                    it.remove();
                    next.f29055v.incrementAndGet();
                    arrayList.add(next);
                    this.f24666c.add(next);
                }
            }
            h();
            hs.k kVar = hs.k.f19476a;
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            int i11 = i10 + 1;
            d.a aVar = (d.a) arrayList.get(i10);
            ExecutorService a10 = a();
            aVar.getClass();
            pv.d dVar = aVar.f29056w;
            m mVar = dVar.f29048u.f24720u;
            byte[] bArr2 = mv.b.f25755a;
            try {
                try {
                    ((ThreadPoolExecutor) a10).execute(aVar);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    dVar.h(interruptedIOException);
                    aVar.f29054u.a(dVar, interruptedIOException);
                    dVar.f29048u.f24720u.b(aVar);
                }
                i10 = i11;
            } catch (Throwable th2) {
                dVar.f29048u.f24720u.b(aVar);
                throw th2;
            }
        }
    }

    public final synchronized int h() {
        return this.f24666c.size() + this.f24667d.size();
    }
}

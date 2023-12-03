package ov;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
/* compiled from: TaskRunner.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final b f27798h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final d f27799i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f27800j;

    /* renamed from: a  reason: collision with root package name */
    public final a f27801a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27803c;

    /* renamed from: d  reason: collision with root package name */
    public long f27804d;

    /* renamed from: b  reason: collision with root package name */
    public int f27802b = Constants.TIMEOUT_MS;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f27805e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final e f27806g = new e(this);

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a(d dVar);

        void b(d dVar, long j10);

        long c();

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f27807a;

        public c(mv.a aVar) {
            this.f27807a = new ThreadPoolExecutor(0, (int) SubsamplingScaleImageView.TILE_SIZE_AUTO, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        @Override // ov.d.a
        public final void a(d taskRunner) {
            i.g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // ov.d.a
        public final void b(d taskRunner, long j10) {
            i.g(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // ov.d.a
        public final long c() {
            return System.nanoTime();
        }

        @Override // ov.d.a
        public final void execute(Runnable runnable) {
            i.g(runnable, "runnable");
            this.f27807a.execute(runnable);
        }
    }

    static {
        String name = i.n(" TaskRunner", mv.b.f25760g);
        i.g(name, "name");
        f27799i = new d(new c(new mv.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        i.f(logger, "getLogger(TaskRunner::class.java.name)");
        f27800j = logger;
    }

    public d(c cVar) {
        this.f27801a = cVar;
    }

    public static final void a(d dVar, ov.a aVar) {
        dVar.getClass();
        byte[] bArr = mv.b.f25755a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f27788a);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                k kVar = k.f19476a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                k kVar2 = k.f19476a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(ov.a aVar, long j10) {
        boolean z10;
        byte[] bArr = mv.b.f25755a;
        ov.c cVar = aVar.f27790c;
        i.d(cVar);
        if (cVar.f27796d == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = cVar.f;
            cVar.f = false;
            cVar.f27796d = null;
            this.f27805e.remove(cVar);
            if (j10 != -1 && !z11 && !cVar.f27795c) {
                cVar.e(aVar, j10, true);
            }
            if (!cVar.f27797e.isEmpty()) {
                this.f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final ov.a c() {
        long j10;
        boolean z10;
        byte[] bArr = mv.b.f25755a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.f27801a;
            long c10 = aVar.c();
            Iterator it = arrayList.iterator();
            long j11 = Long.MAX_VALUE;
            ov.a aVar2 = null;
            while (true) {
                if (it.hasNext()) {
                    ov.a aVar3 = (ov.a) ((ov.c) it.next()).f27797e.get(0);
                    j10 = c10;
                    long max = Math.max(0L, aVar3.f27791d - c10);
                    if (max > 0) {
                        j11 = Math.min(max, j11);
                    } else if (aVar2 != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar2 = aVar3;
                    }
                    c10 = j10;
                } else {
                    j10 = c10;
                    z10 = false;
                    break;
                }
            }
            if (aVar2 != null) {
                byte[] bArr2 = mv.b.f25755a;
                aVar2.f27791d = -1L;
                ov.c cVar = aVar2.f27790c;
                i.d(cVar);
                cVar.f27797e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f27796d = aVar2;
                this.f27805e.add(cVar);
                if (z10 || (!this.f27803c && (!arrayList.isEmpty()))) {
                    aVar.execute(this.f27806g);
                }
                return aVar2;
            } else if (this.f27803c) {
                if (j11 < this.f27804d - j10) {
                    aVar.a(this);
                    return null;
                }
                return null;
            } else {
                this.f27803c = true;
                this.f27804d = j10 + j11;
                try {
                    try {
                        aVar.b(this, j11);
                    } catch (InterruptedException unused) {
                        d();
                    }
                } finally {
                    this.f27803c = false;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f27805e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i6 = size - 1;
                ((ov.c) arrayList.get(size)).b();
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        ArrayList arrayList2 = this.f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i10 = size2 - 1;
            ov.c cVar = (ov.c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f27797e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i10 >= 0) {
                size2 = i10;
            } else {
                return;
            }
        }
    }

    public final void e(ov.c taskQueue) {
        i.g(taskQueue, "taskQueue");
        byte[] bArr = mv.b.f25755a;
        if (taskQueue.f27796d == null) {
            boolean z10 = !taskQueue.f27797e.isEmpty();
            ArrayList arrayList = this.f;
            if (z10) {
                i.g(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z11 = this.f27803c;
        a aVar = this.f27801a;
        if (z11) {
            aVar.a(this);
        } else {
            aVar.execute(this.f27806g);
        }
    }

    public final ov.c f() {
        int i6;
        synchronized (this) {
            i6 = this.f27802b;
            this.f27802b = i6 + 1;
        }
        return new ov.c(this, i.n(Integer.valueOf(i6), "Q"));
    }
}

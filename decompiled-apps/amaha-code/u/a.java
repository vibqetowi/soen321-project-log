package u;

import com.theinnerhour.b2b.utils.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements rc.b<V> {
    public static final Object A;

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f33703x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f33704y = Logger.getLogger(a.class.getName());

    /* renamed from: z  reason: collision with root package name */
    public static final AbstractC0563a f33705z;

    /* renamed from: u  reason: collision with root package name */
    public volatile Object f33706u;

    /* renamed from: v  reason: collision with root package name */
    public volatile d f33707v;

    /* renamed from: w  reason: collision with root package name */
    public volatile h f33708w;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0563a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f33709c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f33710d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33711a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f33712b;

        static {
            if (a.f33703x) {
                f33710d = null;
                f33709c = null;
                return;
            }
            f33710d = new b(null, false);
            f33709c = new b(null, true);
        }

        public b(Throwable th2, boolean z10) {
            this.f33711a = z10;
            this.f33712b = th2;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f33713a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: u.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0564a extends Throwable {
            public C0564a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0564a());
        }

        public c(Throwable th2) {
            boolean z10 = a.f33703x;
            th2.getClass();
            this.f33713a = th2;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f33714d = new d(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f33715a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f33716b;

        /* renamed from: c  reason: collision with root package name */
        public d f33717c;

        public d(Runnable runnable, Executor executor) {
            this.f33715a = runnable;
            this.f33716b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0563a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f33718a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f33719b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f33720c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f33721d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f33722e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f33718a = atomicReferenceFieldUpdater;
            this.f33719b = atomicReferenceFieldUpdater2;
            this.f33720c = atomicReferenceFieldUpdater3;
            this.f33721d = atomicReferenceFieldUpdater4;
            this.f33722e = atomicReferenceFieldUpdater5;
        }

        @Override // u.a.AbstractC0563a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33721d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // u.a.AbstractC0563a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33722e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // u.a.AbstractC0563a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33720c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // u.a.AbstractC0563a
        public final void d(h hVar, h hVar2) {
            this.f33719b.lazySet(hVar, hVar2);
        }

        @Override // u.a.AbstractC0563a
        public final void e(h hVar, Thread thread) {
            this.f33718a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0563a {
        @Override // u.a.AbstractC0563a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f33707v == dVar) {
                    aVar.f33707v = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // u.a.AbstractC0563a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f33706u == obj) {
                    aVar.f33706u = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // u.a.AbstractC0563a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f33708w == hVar) {
                    aVar.f33708w = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // u.a.AbstractC0563a
        public final void d(h hVar, h hVar2) {
            hVar.f33725b = hVar2;
        }

        @Override // u.a.AbstractC0563a
        public final void e(h hVar, Thread thread) {
            hVar.f33724a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f33723c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f33724a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f33725b;

        public h(int i6) {
        }

        public h() {
            a.f33705z.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0563a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, Constants.ONBOARDING_VARIANT), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "w"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "v"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "u"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f33705z = gVar;
        if (th != null) {
            f33704y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A = new Object();
    }

    public static void i(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f33708w;
        } while (!f33705z.c(aVar, hVar, h.f33723c));
        while (hVar != null) {
            Thread thread = hVar.f33724a;
            if (thread != null) {
                hVar.f33724a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f33725b;
        }
        aVar.h();
        do {
            dVar = aVar.f33707v;
        } while (!f33705z.a(aVar, dVar, d.f33714d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f33717c;
            dVar.f33717c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f33717c;
            Runnable runnable = dVar2.f33715a;
            if (!(runnable instanceof f)) {
                j(runnable, dVar2.f33716b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f33704y.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        Object obj = this.f33706u;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | (obj instanceof f)) {
            if (f33703x) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                bVar = b.f33709c;
            } else {
                bVar = b.f33710d;
            }
            while (!f33705z.b(this, obj, bVar)) {
                obj = this.f33706u;
                if (!(obj instanceof f)) {
                    return false;
                }
            }
            i(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // rc.b
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f33707v;
        d dVar2 = d.f33714d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f33717c = dVar;
                if (f33705z.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f33707v;
            } while (dVar != dVar2);
            j(runnable, executor);
        }
        j(runnable, executor);
    }

    public final void f(StringBuilder sb2) {
        V v10;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (v10 == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v10);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ad -> B:56:0x00b3). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(long j10, TimeUnit timeUnit) {
        a<V> aVar;
        a<V> aVar2;
        long j11;
        TimeUnit timeUnit2;
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f33706u;
            if ((obj != null) & (!(obj instanceof f))) {
                return k(obj);
            }
            long j12 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.f33708w;
                h hVar2 = h.f33723c;
                if (hVar != hVar2) {
                    h hVar3 = new h();
                    do {
                        AbstractC0563a abstractC0563a = f33705z;
                        abstractC0563a.d(hVar3, hVar);
                        if (abstractC0563a.c(this, hVar, hVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f33706u;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return k(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(hVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(hVar3);
                            aVar = this;
                            aVar2 = aVar;
                            j11 = nanos;
                            timeUnit2 = timeUnit;
                            j12 = 0;
                            if (j11 > j12) {
                                Object obj3 = aVar2.f33706u;
                                if ((obj3 != null) & (!(obj3 instanceof f))) {
                                    return aVar2.k(obj3);
                                }
                                if (!Thread.interrupted()) {
                                    j11 = nanoTime - System.nanoTime();
                                    j12 = 0;
                                    if (j11 > j12) {
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            } else {
                                String aVar3 = aVar.toString();
                                String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
                                String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
                                if (j11 + 1000 < 0) {
                                    String f2 = pl.a.f(str, " (plus ");
                                    long j13 = -j11;
                                    long convert = timeUnit2.convert(j13, TimeUnit.NANOSECONDS);
                                    long nanos2 = j13 - timeUnit2.toNanos(convert);
                                    int i6 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                                    boolean z10 = i6 == 0 || nanos2 > 1000;
                                    if (i6 > 0) {
                                        String str2 = f2 + convert + " " + lowerCase;
                                        if (z10) {
                                            str2 = pl.a.f(str2, ",");
                                        }
                                        f2 = pl.a.f(str2, " ");
                                    }
                                    if (z10) {
                                        f2 = f2 + nanos2 + " nanoseconds ";
                                    }
                                    str = pl.a.f(f2, "delay)");
                                }
                                if (aVar.isDone()) {
                                    throw new TimeoutException(pl.a.f(str, " but future completed as timeout expired"));
                                }
                                throw new TimeoutException(defpackage.d.f(str, " for ", aVar3));
                            }
                        } else {
                            hVar = this.f33708w;
                        }
                    } while (hVar != hVar2);
                    return k(this.f33706u);
                }
                return k(this.f33706u);
            }
            aVar = this;
            aVar2 = aVar;
            j11 = nanos;
            timeUnit2 = timeUnit;
            if (j11 > j12) {
            }
        } else {
            throw new InterruptedException();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33706u instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        Object obj = this.f33706u;
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof f)) & z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V k(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f33713a);
        }
        Throwable th2 = ((b) obj).f33712b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public final String l() {
        Object obj = this.f33706u;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void n(h hVar) {
        hVar.f33724a = null;
        while (true) {
            h hVar2 = this.f33708w;
            if (hVar2 == h.f33723c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f33725b;
                if (hVar2.f33724a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f33725b = hVar4;
                    if (hVar3.f33724a == null) {
                        break;
                    }
                } else if (!f33705z.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f33706u instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            try {
                str = l();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                f(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f33706u;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return k(obj2);
            }
            h hVar = this.f33708w;
            h hVar2 = h.f33723c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0563a abstractC0563a = f33705z;
                    abstractC0563a.d(hVar3, hVar);
                    if (abstractC0563a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f33706u;
                            } else {
                                n(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return k(obj);
                    }
                    hVar = this.f33708w;
                } while (hVar != hVar2);
                return k(this.f33706u);
            }
            return k(this.f33706u);
        }
        throw new InterruptedException();
    }
}

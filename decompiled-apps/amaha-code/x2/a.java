package x2;

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
import r1.b0;
/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements rc.b<V> {
    public static final Object A;

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f37578x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f37579y = Logger.getLogger(a.class.getName());

    /* renamed from: z  reason: collision with root package name */
    public static final AbstractC0631a f37580z;

    /* renamed from: u  reason: collision with root package name */
    public volatile Object f37581u;

    /* renamed from: v  reason: collision with root package name */
    public volatile d f37582v;

    /* renamed from: w  reason: collision with root package name */
    public volatile h f37583w;

    /* compiled from: AbstractFuture.java */
    /* renamed from: x2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0631a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f37584c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f37585d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f37586a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f37587b;

        static {
            if (a.f37578x) {
                f37585d = null;
                f37584c = null;
                return;
            }
            f37585d = new b(null, false);
            f37584c = new b(null, true);
        }

        public b(Throwable th2, boolean z10) {
            this.f37586a = z10;
            this.f37587b = th2;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f37588b = new c(new C0632a());

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f37589a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: x2.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0632a extends Throwable {
            public C0632a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            boolean z10 = a.f37578x;
            th2.getClass();
            this.f37589a = th2;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f37590d = new d(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f37591a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f37592b;

        /* renamed from: c  reason: collision with root package name */
        public d f37593c;

        public d(Runnable runnable, Executor executor) {
            this.f37591a = runnable;
            this.f37592b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0631a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f37594a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f37595b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f37596c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f37597d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f37598e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f37594a = atomicReferenceFieldUpdater;
            this.f37595b = atomicReferenceFieldUpdater2;
            this.f37596c = atomicReferenceFieldUpdater3;
            this.f37597d = atomicReferenceFieldUpdater4;
            this.f37598e = atomicReferenceFieldUpdater5;
        }

        @Override // x2.a.AbstractC0631a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37597d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // x2.a.AbstractC0631a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37598e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // x2.a.AbstractC0631a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37596c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // x2.a.AbstractC0631a
        public final void d(h hVar, h hVar2) {
            this.f37595b.lazySet(hVar, hVar2);
        }

        @Override // x2.a.AbstractC0631a
        public final void e(h hVar, Thread thread) {
            this.f37594a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final a<V> f37599u;

        /* renamed from: v  reason: collision with root package name */
        public final rc.b<? extends V> f37600v;

        public f(a<V> aVar, rc.b<? extends V> bVar) {
            this.f37599u = aVar;
            this.f37600v = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f37599u.f37581u != this) {
                return;
            }
            if (a.f37580z.b(this.f37599u, this, a.f(this.f37600v))) {
                a.b(this.f37599u);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0631a {
        @Override // x2.a.AbstractC0631a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f37582v == dVar) {
                    aVar.f37582v = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // x2.a.AbstractC0631a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f37581u == obj) {
                    aVar.f37581u = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // x2.a.AbstractC0631a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f37583w == hVar) {
                    aVar.f37583w = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // x2.a.AbstractC0631a
        public final void d(h hVar, h hVar2) {
            hVar.f37603b = hVar2;
        }

        @Override // x2.a.AbstractC0631a
        public final void e(h hVar, Thread thread) {
            hVar.f37602a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f37601c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f37602a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f37603b;

        public h(int i6) {
        }

        public h() {
            a.f37580z.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0631a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, Constants.ONBOARDING_VARIANT), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "w"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "v"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "u"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f37580z = gVar;
        if (th != null) {
            f37579y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [x2.a$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x2.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [x2.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [x2.a, x2.a<V>] */
    public static void b(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = ((a) aVar).f37583w;
            if (f37580z.c((a) aVar, hVar, h.f37601c)) {
                while (hVar != null) {
                    Thread thread = hVar.f37602a;
                    if (thread != null) {
                        hVar.f37602a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f37603b;
                }
                do {
                    dVar = ((a) aVar).f37582v;
                } while (!f37580z.a((a) aVar, dVar, d.f37590d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f37593c;
                    dVar3.f37593c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f37593c;
                    Runnable runnable = dVar2.f37591a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f37599u;
                        if (aVar.f37581u == fVar) {
                            if (f37580z.b(aVar, fVar, f(fVar.f37600v))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f37592b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f37579y.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(rc.b<?> bVar) {
        Object obj;
        if (bVar instanceof a) {
            Object obj2 = ((a) bVar).f37581u;
            if (obj2 instanceof b) {
                b bVar2 = (b) obj2;
                if (bVar2.f37586a) {
                    if (bVar2.f37587b != null) {
                        return new b(bVar2.f37587b, false);
                    }
                    return b.f37585d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f37578x) & isCancelled) {
            return b.f37585d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e10));
                }
                return new b(e10, false);
            } catch (ExecutionException e11) {
                return new c(e11.getCause());
            } catch (Throwable th3) {
                return new c(th3);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return A;
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        boolean z12;
        Object obj = this.f37581u;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | (obj instanceof f)) {
            if (f37578x) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                bVar = b.f37584c;
            } else {
                bVar = b.f37585d;
            }
            boolean z13 = false;
            a<V> aVar = this;
            while (true) {
                if (f37580z.b(aVar, obj, bVar)) {
                    b(aVar);
                    if (!(obj instanceof f)) {
                        return true;
                    }
                    rc.b<? extends V> bVar2 = ((f) obj).f37600v;
                    if (bVar2 instanceof a) {
                        aVar = (a) bVar2;
                        obj = aVar.f37581u;
                        if (obj == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!(z12 | (obj instanceof f))) {
                            return true;
                        }
                        z13 = true;
                    } else {
                        bVar2.cancel(z10);
                        return true;
                    }
                } else {
                    obj = aVar.f37581u;
                    if (!(obj instanceof f)) {
                        return z13;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @Override // rc.b
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f37582v;
        d dVar2 = d.f37590d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f37593c = dVar;
                if (f37580z.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f37582v;
            } while (dVar != dVar2);
            c(runnable, executor);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f37589a);
        }
        Throwable th2 = ((b) obj).f37587b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public final String g() {
        String valueOf;
        Object obj = this.f37581u;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            rc.b<? extends V> bVar = ((f) obj).f37600v;
            if (bVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(bVar);
            }
            return b0.b(sb2, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
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
            Object obj = this.f37581u;
            if ((obj != null) & (!(obj instanceof f))) {
                return e(obj);
            }
            long j12 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.f37583w;
                h hVar2 = h.f37601c;
                if (hVar != hVar2) {
                    h hVar3 = new h();
                    do {
                        AbstractC0631a abstractC0631a = f37580z;
                        abstractC0631a.d(hVar3, hVar);
                        if (abstractC0631a.c(this, hVar, hVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f37581u;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(hVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(hVar3);
                            aVar = this;
                            aVar2 = aVar;
                            j11 = nanos;
                            timeUnit2 = timeUnit;
                            j12 = 0;
                            if (j11 > j12) {
                                Object obj3 = aVar2.f37581u;
                                if ((obj3 != null) & (!(obj3 instanceof f))) {
                                    return aVar2.e(obj3);
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
                            hVar = this.f37583w;
                        }
                    } while (hVar != hVar2);
                    return e(this.f37581u);
                }
                return e(this.f37581u);
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

    public final void h(h hVar) {
        hVar.f37602a = null;
        while (true) {
            h hVar2 = this.f37583w;
            if (hVar2 == h.f37601c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f37603b;
                if (hVar2.f37602a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f37603b = hVar4;
                    if (hVar3.f37602a == null) {
                        break;
                    }
                } else if (!f37580z.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37581u instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        Object obj = this.f37581u;
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof f)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f37581u instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = g();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f37581u;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f37583w;
            h hVar2 = h.f37601c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0631a abstractC0631a = f37580z;
                    abstractC0631a.d(hVar3, hVar);
                    if (abstractC0631a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37581u;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f37583w;
                } while (hVar != hVar2);
                return e(this.f37581u);
            }
            return e(this.f37581u);
        }
        throw new InterruptedException();
    }
}

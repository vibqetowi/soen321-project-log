package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/* loaded from: classes5.dex */
public class Memoizer<I, O> implements Computable<I, O> {
    private final ConcurrentMap<I, Future<O>> cache;
    private final Computable<I, O> computable;
    private final boolean recalculate;

    public Memoizer(Computable<I, O> computable) {
        this(computable, false);
    }

    public Memoizer(Computable<I, O> computable, boolean z) {
        this.cache = new ConcurrentHashMap();
        this.computable = computable;
        this.recalculate = z;
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(final I i) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> future = this.cache.get(i);
            if (future == null && (future = this.cache.putIfAbsent(i, (futureTask = new FutureTask(new Callable() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Memoizer.this.m9055lambda$compute$0$orgapachecommonslang3concurrentMemoizer(i);
                }
            })))) == null) {
                futureTask.run();
                future = futureTask;
            }
            try {
                continue;
                return future.get();
            } catch (CancellationException unused) {
                this.cache.remove(i, future);
            } catch (ExecutionException e) {
                if (this.recalculate) {
                    this.cache.remove(i, future);
                }
                throw launderException(e.getCause());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$compute$0$org-apache-commons-lang3-concurrent-Memoizer  reason: not valid java name */
    public /* synthetic */ Object m9055lambda$compute$0$orgapachecommonslang3concurrentMemoizer(Object obj) throws Exception {
        return this.computable.compute(obj);
    }

    private RuntimeException launderException(Throwable th) {
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalStateException("Unchecked exception", th);
    }
}

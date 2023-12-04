package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private ListenableFuture<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile ListenableFuture<? extends O> mOutputFuture;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, ListenableFuture<? extends I> listenableFuture) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.mOutputCreated.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - nanoTime2);
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return (O) super.get(j, timeUnit);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (super.cancel(z)) {
            putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z));
            cancel(this.mInputFuture, z);
            cancel(this.mOutputFuture, z);
            return true;
        }
        return false;
    }

    private void cancel(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        final ListenableFuture<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                        this.mOutputFuture = apply;
                    } catch (Error e) {
                        setException(e);
                    } catch (UndeclaredThrowableException e2) {
                        setException(e2.getCause());
                    }
                } catch (Throwable th) {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                setException(e3.getCause());
            }
        } catch (Exception e4) {
            setException(e4);
        }
        if (isCancelled()) {
            apply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
            this.mOutputFuture = null;
            this.mFunction = null;
            this.mInputFuture = null;
            this.mOutputCreated.countDown();
            return;
        }
        apply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        ChainingListenableFuture.this.set(Futures.getUninterruptibly(apply));
                    } catch (CancellationException unused2) {
                        ChainingListenableFuture.this.cancel(false);
                        ChainingListenableFuture.this.mOutputFuture = null;
                        return;
                    } catch (ExecutionException e5) {
                        ChainingListenableFuture.this.setException(e5.getCause());
                    }
                    ChainingListenableFuture.this.mOutputFuture = null;
                } catch (Throwable th2) {
                    ChainingListenableFuture.this.mOutputFuture = null;
                    throw th2;
                }
            }
        }, CameraXExecutors.directExecutor());
        this.mFunction = null;
        this.mInputFuture = null;
        this.mOutputCreated.countDown();
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}

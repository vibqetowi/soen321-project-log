package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ListFuture<V> implements ListenableFuture<List<V>> {
    private final boolean mAllMustSucceed;
    List<? extends ListenableFuture<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final ListenableFuture<List<V>> mResult = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(CallbackToFutureAdapter.Completer<List<V>> completer) {
            Preconditions.checkState(ListFuture.this.mResultNotifier == null, "The result can only set once!");
            ListFuture.this.mResultNotifier = completer;
            return "ListFuture[" + this + "]";
        }
    });
    CallbackToFutureAdapter.Completer<List<V>> mResultNotifier;
    List<V> mValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListFuture(List<? extends ListenableFuture<? extends V>> list, boolean z, Executor executor) {
        this.mFutures = (List) Preconditions.checkNotNull(list);
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void init(Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture.this.mValues = null;
                ListFuture.this.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        for (final int i2 = 0; i2 < list.size(); i2++) {
            final ListenableFuture<? extends V> listenableFuture = list.get(i2);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i2, listenableFuture);
                }
            }, executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setOneValue(int i, Future<? extends V> future) {
        CallbackToFutureAdapter.Completer<List<V>> completer;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.mValues;
        if (isDone() || list == 0) {
            Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, Futures.getUninterruptibly(future));
                        decrementAndGet = this.mRemaining.decrementAndGet();
                        Preconditions.checkState(decrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (ExecutionException e) {
                        if (this.mAllMustSucceed) {
                            this.mResultNotifier.setException(e.getCause());
                        }
                        int decrementAndGet2 = this.mRemaining.decrementAndGet();
                        Preconditions.checkState(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet2 != 0) {
                            return;
                        }
                        List<V> list2 = this.mValues;
                        if (list2 != null) {
                            completer = this.mResultNotifier;
                            arrayList = new ArrayList(list2);
                        }
                    }
                } catch (RuntimeException e2) {
                    if (this.mAllMustSucceed) {
                        this.mResultNotifier.setException(e2);
                    }
                    int decrementAndGet3 = this.mRemaining.decrementAndGet();
                    Preconditions.checkState(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    List<V> list3 = this.mValues;
                    if (list3 != null) {
                        completer = this.mResultNotifier;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e3) {
                this.mResultNotifier.setException(e3);
                int decrementAndGet4 = this.mRemaining.decrementAndGet();
                Preconditions.checkState(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                List<V> list4 = this.mValues;
                if (list4 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.mAllMustSucceed) {
                    cancel(false);
                }
                int decrementAndGet5 = this.mRemaining.decrementAndGet();
                Preconditions.checkState(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                List<V> list5 = this.mValues;
                if (list5 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.mValues;
                if (list6 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list6);
                    completer.set(arrayList);
                    return;
                }
                Preconditions.checkState(isDone());
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.set(new ArrayList(list7));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
            throw th;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        if (list != null) {
            for (ListenableFuture<? extends V> listenableFuture : list) {
                listenableFuture.cancel(z);
            }
        }
        return this.mResult.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    @Override // java.util.concurrent.Future
    public List<V> get() throws InterruptedException, ExecutionException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mResult.get(j, timeUnit);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (ListenableFuture<? extends V> listenableFuture : list) {
            while (!listenableFuture.isDone()) {
                try {
                    listenableFuture.get();
                } catch (Error e) {
                    throw e;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }
}

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final Logger logger = Logger.getLogger(AggregateFuture.class.getName());
    private final boolean allMustSucceed;
    private final boolean collectsValues;
    @CheckForNull
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    abstract void collectOneValue(int i, @ParametricNullness InputT inputt);

    abstract void handleAllCompleted();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        this.futures = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = z;
        this.collectsValues = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        super.afterDone();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean wasInterrupted = wasInterrupted();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(wasInterrupted);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public final String pendingToString() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection != null) {
            String valueOf = String.valueOf(immutableCollection);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.pendingToString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void init() {
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
        } else if (this.allMustSucceed) {
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = this.futures.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture<? extends InputT> next = it.next();
                next.addListener(new Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (next.isCancelled()) {
                                AggregateFuture.this.futures = null;
                                AggregateFuture.this.cancel(false);
                            } else {
                                AggregateFuture.this.collectValueFromNonCancelledFuture(i, next);
                            }
                        } finally {
                            AggregateFuture.this.decrementCountAndMaybeComplete(null);
                        }
                    }
                }, MoreExecutors.directExecutor());
                i++;
            }
        } else {
            final ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.collectsValues ? this.futures : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture.2
                @Override // java.lang.Runnable
                public void run() {
                    AggregateFuture.this.decrementCountAndMaybeComplete(immutableCollection);
                }
            };
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it2 = this.futures.iterator();
            while (it2.hasNext()) {
                it2.next().addListener(runnable, MoreExecutors.directExecutor());
            }
        }
    }

    private void handleException(Throwable th) {
        Preconditions.checkNotNull(th);
        if (this.allMustSucceed && !setException(th) && addCausalChain(getOrInitSeenExceptions(), th)) {
            log(th);
        } else if (th instanceof Error) {
            log(th);
        }
    }

    private static void log(Throwable th) {
        logger.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    final void addInitialException(Set<Throwable> set) {
        Preconditions.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        addCausalChain(set, (Throwable) Objects.requireNonNull(tryInternalFastPathGetFailure()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void collectValueFromNonCancelledFuture(int i, Future<? extends InputT> future) {
        try {
            collectOneValue(i, Futures.getDone(future));
        } catch (ExecutionException e) {
            handleException(e.getCause());
        } catch (Throwable th) {
            handleException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementCountAndMaybeComplete(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        int decrementRemainingAndGet = decrementRemainingAndGet();
        Preconditions.checkState(decrementRemainingAndGet >= 0, "Less than 0 remaining futures");
        if (decrementRemainingAndGet == 0) {
            processCompleted(immutableCollection);
        }
    }

    private void processCompleted(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator<? extends Future<? extends InputT>> it = immutableCollection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.futures = null;
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}

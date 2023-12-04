package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import java.util.Iterator;
import javax.annotation.Nonnull;
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public class ServerStream<V> implements Iterable<V> {
    private boolean consumed;
    private final ServerStreamIterator<V> iterator;
    private final QueuingResponseObserver<V> observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InternalApi("For use by ServerStreamingCallable only.")
    public ServerStream() {
        QueuingResponseObserver<V> queuingResponseObserver = new QueuingResponseObserver<>();
        this.observer = queuingResponseObserver;
        this.iterator = new ServerStreamIterator<>(queuingResponseObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InternalApi("For use by ServerStreamingCallable only.")
    public ResponseObserver<V> observer() {
        return this.observer;
    }

    @Override // java.lang.Iterable
    @Nonnull
    public Iterator<V> iterator() {
        if (this.consumed) {
            throw new IllegalStateException("Iterator already consumed");
        }
        this.consumed = true;
        return this.iterator;
    }

    public boolean isReceiveReady() {
        return this.iterator.isReady();
    }

    public void cancel() {
        this.observer.cancel();
    }
}

package com.google.api.gax.rpc;

import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
final class ServerStreamIterator<V> implements Iterator<V> {
    private Object last;
    private final QueuingResponseObserver<V> observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServerStreamIterator(QueuingResponseObserver<V> queuingResponseObserver) {
        this.observer = queuingResponseObserver;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isReady() {
        return this.last != null || this.observer.isReady();
    }

    @Override // java.util.Iterator
    public V next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            this.observer.request();
            return (V) this.last;
        } finally {
            this.last = null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.last == null) {
            try {
                this.last = this.observer.getNext();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        Object obj = this.last;
        if (obj instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) obj;
            runtimeException.addSuppressed(new RuntimeException("Asynchronous task failed"));
            throw runtimeException;
        } else if (obj instanceof Throwable) {
            throw new UncheckedExecutionException((Throwable) obj);
        } else {
            return obj != QueuingResponseObserver.EOF_MARKER;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.api.gax.batching;

import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
@BetaApi("The surface for batching is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface Batcher<ElementT, ElementResultT> extends AutoCloseable {
    ApiFuture<ElementResultT> add(ElementT elementt);

    @Override // java.lang.AutoCloseable
    void close() throws InterruptedException;

    void flush() throws InterruptedException;

    void sendOutstanding();
}

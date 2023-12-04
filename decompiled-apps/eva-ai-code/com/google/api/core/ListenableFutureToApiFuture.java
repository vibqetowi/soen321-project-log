package com.google.api.core;

import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.common.util.concurrent.ListenableFuture;
@InternalApi
/* loaded from: classes7.dex */
public class ListenableFutureToApiFuture<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ApiFuture<V> {
    public ListenableFutureToApiFuture(ListenableFuture<V> listenableFuture) {
        super(listenableFuture);
    }
}

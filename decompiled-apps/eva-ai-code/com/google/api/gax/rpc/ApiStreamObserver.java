package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface ApiStreamObserver<V> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(V v);
}

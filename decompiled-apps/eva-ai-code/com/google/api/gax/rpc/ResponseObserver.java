package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface ResponseObserver<V> {
    void onComplete();

    void onError(Throwable th);

    void onResponse(V v);

    void onStart(StreamController streamController);
}

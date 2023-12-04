package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface ClientStreamReadyObserver<V> {
    void onReady(ClientStream<V> clientStream);
}

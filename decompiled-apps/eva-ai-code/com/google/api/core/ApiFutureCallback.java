package com.google.api.core;
/* loaded from: classes7.dex */
public interface ApiFutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}

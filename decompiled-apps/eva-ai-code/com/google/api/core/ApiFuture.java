package com.google.api.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes7.dex */
public interface ApiFuture<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}

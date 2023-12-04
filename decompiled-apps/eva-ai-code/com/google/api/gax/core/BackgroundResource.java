package com.google.api.gax.core;

import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public interface BackgroundResource extends AutoCloseable {
    boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException;

    boolean isShutdown();

    boolean isTerminated();

    void shutdown();

    void shutdownNow();
}

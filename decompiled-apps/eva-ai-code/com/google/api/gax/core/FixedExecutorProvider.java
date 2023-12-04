package com.google.api.gax.core;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes7.dex */
public final class FixedExecutorProvider implements ExecutorProvider {
    private final ScheduledExecutorService executor;

    @Override // com.google.api.gax.core.ExecutorProvider
    public boolean shouldAutoClose() {
        return false;
    }

    private FixedExecutorProvider(ScheduledExecutorService scheduledExecutorService) {
        this.executor = scheduledExecutorService;
    }

    @Override // com.google.api.gax.core.ExecutorProvider
    public ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    public static FixedExecutorProvider create(ScheduledExecutorService scheduledExecutorService) {
        return new FixedExecutorProvider(scheduledExecutorService);
    }
}

package com.google.api.gax.core;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public class BackgroundResourceAggregation implements BackgroundResource {
    private final List<BackgroundResource> resources;

    public BackgroundResourceAggregation(List<BackgroundResource> list) {
        this.resources = list;
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdown() {
        for (BackgroundResource backgroundResource : this.resources) {
            backgroundResource.shutdown();
        }
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isShutdown() {
        for (BackgroundResource backgroundResource : this.resources) {
            if (!backgroundResource.isShutdown()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isTerminated() {
        for (BackgroundResource backgroundResource : this.resources) {
            if (!backgroundResource.isTerminated()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdownNow() {
        for (BackgroundResource backgroundResource : this.resources) {
            backgroundResource.shutdownNow();
        }
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        for (BackgroundResource backgroundResource : this.resources) {
            if (!backgroundResource.awaitTermination(j, timeUnit)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        shutdown();
    }
}

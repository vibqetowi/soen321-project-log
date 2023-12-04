package com.google.api.gax.core;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes7.dex */
public interface ExecutorProvider {
    ScheduledExecutorService getExecutor();

    boolean shouldAutoClose();
}

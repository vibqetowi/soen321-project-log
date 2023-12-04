package com.google.api.gax.rpc;

import com.google.api.core.ApiClock;
import com.google.api.core.BetaApi;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import org.threeten.bp.Duration;
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface WatchdogProvider {
    Watchdog getWatchdog();

    boolean needsCheckInterval();

    boolean needsClock();

    boolean needsExecutor();

    boolean shouldAutoClose();

    WatchdogProvider withCheckInterval(Duration duration);

    WatchdogProvider withClock(@Nonnull ApiClock apiClock);

    WatchdogProvider withExecutor(ScheduledExecutorService scheduledExecutorService);
}

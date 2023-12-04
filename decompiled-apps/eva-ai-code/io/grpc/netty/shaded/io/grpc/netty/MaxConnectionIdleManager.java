package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.internal.LogExceptionRunnable;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* loaded from: classes4.dex */
abstract class MaxConnectionIdleManager {
    private static final Ticker systemTicker = new Ticker() { // from class: io.grpc.netty.shaded.io.grpc.netty.MaxConnectionIdleManager.1
        @Override // io.grpc.netty.shaded.io.grpc.netty.MaxConnectionIdleManager.Ticker
        public long nanoTime() {
            return System.nanoTime();
        }
    };
    private boolean isActive;
    private final long maxConnectionIdleInNanos;
    private long nextIdleMonitorTime;
    private ScheduledExecutorService scheduler;
    private boolean shutdownDelayed;
    @CheckForNull
    private ScheduledFuture<?> shutdownFuture;
    private Runnable shutdownTask;
    private final Ticker ticker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface Ticker {
        long nanoTime();
    }

    abstract void close(ChannelHandlerContext channelHandlerContext);

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaxConnectionIdleManager(long j) {
        this(j, systemTicker);
    }

    MaxConnectionIdleManager(long j, Ticker ticker) {
        this.maxConnectionIdleInNanos = j;
        this.ticker = ticker;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void start(ChannelHandlerContext channelHandlerContext) {
        start(channelHandlerContext, channelHandlerContext.executor());
    }

    void start(final ChannelHandlerContext channelHandlerContext, final ScheduledExecutorService scheduledExecutorService) {
        this.scheduler = scheduledExecutorService;
        this.nextIdleMonitorTime = this.ticker.nanoTime() + this.maxConnectionIdleInNanos;
        LogExceptionRunnable logExceptionRunnable = new LogExceptionRunnable(new Runnable() { // from class: io.grpc.netty.shaded.io.grpc.netty.MaxConnectionIdleManager.2
            @Override // java.lang.Runnable
            public void run() {
                if (MaxConnectionIdleManager.this.shutdownDelayed) {
                    if (MaxConnectionIdleManager.this.isActive) {
                        return;
                    }
                    MaxConnectionIdleManager maxConnectionIdleManager = MaxConnectionIdleManager.this;
                    maxConnectionIdleManager.shutdownFuture = scheduledExecutorService.schedule(maxConnectionIdleManager.shutdownTask, MaxConnectionIdleManager.this.nextIdleMonitorTime - MaxConnectionIdleManager.this.ticker.nanoTime(), TimeUnit.NANOSECONDS);
                    MaxConnectionIdleManager.this.shutdownDelayed = false;
                    return;
                }
                MaxConnectionIdleManager.this.close(channelHandlerContext);
                MaxConnectionIdleManager.this.shutdownFuture = null;
            }
        });
        this.shutdownTask = logExceptionRunnable;
        this.shutdownFuture = scheduledExecutorService.schedule(logExceptionRunnable, this.maxConnectionIdleInNanos, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTransportActive() {
        this.isActive = true;
        this.shutdownDelayed = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTransportIdle() {
        this.isActive = false;
        ScheduledFuture<?> scheduledFuture = this.shutdownFuture;
        if (scheduledFuture == null) {
            return;
        }
        if (scheduledFuture.isDone()) {
            this.shutdownDelayed = false;
            this.shutdownFuture = this.scheduler.schedule(this.shutdownTask, this.maxConnectionIdleInNanos, TimeUnit.NANOSECONDS);
            return;
        }
        this.nextIdleMonitorTime = this.ticker.nanoTime() + this.maxConnectionIdleInNanos;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTransportTermination() {
        ScheduledFuture<?> scheduledFuture = this.shutdownFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.shutdownFuture = null;
        }
    }
}

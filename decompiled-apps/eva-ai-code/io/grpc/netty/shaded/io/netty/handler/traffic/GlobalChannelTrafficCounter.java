package io.grpc.netty.shaded.io.netty.handler.traffic;

import io.grpc.netty.shaded.io.netty.handler.traffic.GlobalChannelTrafficShapingHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class GlobalChannelTrafficCounter extends TrafficCounter {
    public GlobalChannelTrafficCounter(GlobalChannelTrafficShapingHandler globalChannelTrafficShapingHandler, ScheduledExecutorService scheduledExecutorService, String str, long j) {
        super(globalChannelTrafficShapingHandler, scheduledExecutorService, str, j);
        if (scheduledExecutorService == null) {
            throw new IllegalArgumentException("Executor must not be null");
        }
    }

    /* loaded from: classes4.dex */
    private static class MixedTrafficMonitoringTask implements Runnable {
        private final TrafficCounter counter;
        private final GlobalChannelTrafficShapingHandler trafficShapingHandler1;

        MixedTrafficMonitoringTask(GlobalChannelTrafficShapingHandler globalChannelTrafficShapingHandler, TrafficCounter trafficCounter) {
            this.trafficShapingHandler1 = globalChannelTrafficShapingHandler;
            this.counter = trafficCounter;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.counter.monitorActive) {
                long milliSecondFromNano = TrafficCounter.milliSecondFromNano();
                this.counter.resetAccounting(milliSecondFromNano);
                for (GlobalChannelTrafficShapingHandler.PerChannel perChannel : this.trafficShapingHandler1.channelQueues.values()) {
                    perChannel.channelTrafficCounter.resetAccounting(milliSecondFromNano);
                }
                this.trafficShapingHandler1.doAccounting(this.counter);
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.TrafficCounter
    public synchronized void start() {
        if (this.monitorActive) {
            return;
        }
        this.lastTime.set(milliSecondFromNano());
        long j = this.checkInterval.get();
        if (j > 0) {
            this.monitorActive = true;
            this.monitor = new MixedTrafficMonitoringTask((GlobalChannelTrafficShapingHandler) this.trafficShapingHandler, this);
            this.scheduledFuture = this.executor.scheduleAtFixedRate(this.monitor, 0L, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.TrafficCounter
    public synchronized void stop() {
        if (this.monitorActive) {
            this.monitorActive = false;
            resetAccounting(milliSecondFromNano());
            this.trafficShapingHandler.doAccounting(this);
            if (this.scheduledFuture != null) {
                this.scheduledFuture.cancel(true);
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.TrafficCounter
    public void resetCumulativeTime() {
        for (GlobalChannelTrafficShapingHandler.PerChannel perChannel : ((GlobalChannelTrafficShapingHandler) this.trafficShapingHandler).channelQueues.values()) {
            perChannel.channelTrafficCounter.resetCumulativeTime();
        }
        super.resetCumulativeTime();
    }
}

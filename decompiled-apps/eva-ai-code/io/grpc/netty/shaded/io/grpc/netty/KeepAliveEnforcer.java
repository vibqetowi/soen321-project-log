package io.grpc.netty.shaded.io.grpc.netty;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class KeepAliveEnforcer {
    static final long IMPLICIT_PERMIT_TIME_NANOS = TimeUnit.HOURS.toNanos(2);
    static final int MAX_PING_STRIKES = 2;
    private final long epoch;
    private boolean hasOutstandingCalls;
    private long lastValidPingTime;
    private final long minTimeNanos;
    private final boolean permitWithoutCalls;
    private int pingStrikes;
    private final Ticker ticker;

    /* loaded from: classes4.dex */
    interface Ticker {
        long nanoTime();
    }

    private static long compareNanos(long j, long j2) {
        return j - j2;
    }

    public KeepAliveEnforcer(boolean z, long j, TimeUnit timeUnit) {
        this(z, j, timeUnit, SystemTicker.INSTANCE);
    }

    KeepAliveEnforcer(boolean z, long j, TimeUnit timeUnit, Ticker ticker) {
        Preconditions.checkArgument(j >= 0, "minTime must be non-negative: %s", j);
        this.permitWithoutCalls = z;
        this.minTimeNanos = Math.min(timeUnit.toNanos(j), IMPLICIT_PERMIT_TIME_NANOS);
        this.ticker = ticker;
        long nanoTime = ticker.nanoTime();
        this.epoch = nanoTime;
        this.lastValidPingTime = nanoTime;
    }

    @CheckReturnValue
    public boolean pingAcceptable() {
        long nanoTime = this.ticker.nanoTime();
        if (!(this.hasOutstandingCalls || this.permitWithoutCalls ? compareNanos(this.lastValidPingTime + this.minTimeNanos, nanoTime) <= 0 : compareNanos(this.lastValidPingTime + IMPLICIT_PERMIT_TIME_NANOS, nanoTime) <= 0)) {
            int i = this.pingStrikes + 1;
            this.pingStrikes = i;
            return i <= 2;
        }
        this.lastValidPingTime = nanoTime;
        return true;
    }

    public void resetCounters() {
        this.lastValidPingTime = this.epoch;
        this.pingStrikes = 0;
    }

    public void onTransportActive() {
        this.hasOutstandingCalls = true;
    }

    public void onTransportIdle() {
        this.hasOutstandingCalls = false;
    }

    /* loaded from: classes4.dex */
    static class SystemTicker implements Ticker {
        public static final SystemTicker INSTANCE = new SystemTicker();

        SystemTicker() {
        }

        @Override // io.grpc.netty.shaded.io.grpc.netty.KeepAliveEnforcer.Ticker
        public long nanoTime() {
            return System.nanoTime();
        }
    }
}

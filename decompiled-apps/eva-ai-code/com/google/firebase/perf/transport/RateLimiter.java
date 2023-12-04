package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class RateLimiter {
    private final ConfigResolver configResolver;
    private final double fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final double samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public RateLimiter(Context context, Rate rate, long j) {
        this(rate, j, new Clock(), getSamplingBucketId(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }

    static double getSamplingBucketId() {
        return new Random().nextDouble();
    }

    RateLimiter(Rate rate, long j, Clock clock, double d, double d2, ConfigResolver configResolver) {
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z = false;
        this.isLogcatEnabled = false;
        Utils.checkArgument(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        Utils.checkArgument(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.samplingBucketId = d;
        this.fragmentBucketId = d2;
        this.configResolver = configResolver;
        this.traceLimiter = new RateLimiterImpl(rate, j, clock, configResolver, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate, j, clock, configResolver, ResourceType.NETWORK, this.isLogcatEnabled);
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        return this.fragmentBucketId < this.configResolver.getFragmentSamplingRate();
    }

    protected boolean isFragmentScreenTrace(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEventRateLimited(PerfMetric perfMetric) {
        if (isRateLimitApplicable(perfMetric)) {
            if (perfMetric.hasNetworkRequestMetric()) {
                return !this.networkLimiter.check(perfMetric);
            }
            if (perfMetric.hasTraceMetric()) {
                return !this.traceLimiter.check(perfMetric);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEventSampled(PerfMetric perfMetric) {
        if (!perfMetric.hasTraceMetric() || isDeviceAllowedToSendTraces() || hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            if (!isFragmentScreenTrace(perfMetric) || isDeviceAllowedToSendFragmentScreenTraces() || hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
                return !perfMetric.hasNetworkRequestMetric() || isDeviceAllowedToSendNetworkEvents() || hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
            }
            return false;
        }
        return false;
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    boolean isRateLimitApplicable(PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void changeRate(boolean z) {
        this.traceLimiter.changeRate(z);
        this.networkLimiter.changeRate(z);
    }

    boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return isDeviceAllowedToSendFragmentScreenTraces();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class RateLimiterImpl {
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private double tokenCount;
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private static final long MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1);

        RateLimiterImpl(Rate rate, long j, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z) {
            this.clock = clock;
            this.capacity = j;
            this.rate = rate;
            this.tokenCount = j;
            this.lastTimeTokenReplenished = clock.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z);
            this.isLogcatEnabled = z;
        }

        synchronized boolean check(PerfMetric perfMetric) {
            Timer time = this.clock.getTime();
            double durationMicros = (this.lastTimeTokenReplenished.getDurationMicros(time) * this.rate.getTokensPerSeconds()) / MICROS_IN_A_SECOND;
            if (durationMicros > 0.0d) {
                this.tokenCount = Math.min(this.tokenCount + durationMicros, this.capacity);
                this.lastTimeTokenReplenished = time;
            }
            double d = this.tokenCount;
            if (d >= 1.0d) {
                this.tokenCount = d - 1.0d;
                return true;
            }
            if (this.isLogcatEnabled) {
                logger.warn("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }

        synchronized void changeRate(boolean z) {
            this.rate = z ? this.foregroundRate : this.backgroundRate;
            this.capacity = z ? this.foregroundCapacity : this.backgroundCapacity;
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            Rate rate = new Rate(flimitEvents, flimitSec, TimeUnit.SECONDS);
            this.foregroundRate = rate;
            this.foregroundCapacity = flimitEvents;
            if (z) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate2 = new Rate(blimitEvents, blimitSec, TimeUnit.SECONDS);
            this.backgroundRate = rate2;
            this.backgroundCapacity = blimitEvents;
            if (z) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(blimitEvents));
            }
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountForeground();
            }
            return configResolver.getNetworkEventCountForeground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountBackground();
            }
            return configResolver.getNetworkEventCountBackground();
        }

        Rate getForegroundRate() {
            return this.foregroundRate;
        }

        long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        Rate getRate() {
            return this.rate;
        }

        void setRate(Rate rate) {
            this.rate = rate;
        }
    }
}

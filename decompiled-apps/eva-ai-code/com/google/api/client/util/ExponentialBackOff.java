package com.google.api.client.util;

import java.io.IOException;
/* loaded from: classes7.dex */
public class ExponentialBackOff implements BackOff {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;
    private int currentIntervalMillis;
    private final int initialIntervalMillis;
    private final int maxElapsedTimeMillis;
    private final int maxIntervalMillis;
    private final double multiplier;
    private final NanoClock nanoClock;
    private final double randomizationFactor;
    long startTimeNanos;

    static int getRandomValueFromInterval(double d, double d2, int i) {
        double d3 = i;
        double d4 = d * d3;
        double d5 = d3 - d4;
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    protected ExponentialBackOff(Builder builder) {
        int i = builder.initialIntervalMillis;
        this.initialIntervalMillis = i;
        double d = builder.randomizationFactor;
        this.randomizationFactor = d;
        double d2 = builder.multiplier;
        this.multiplier = d2;
        int i2 = builder.maxIntervalMillis;
        this.maxIntervalMillis = i2;
        int i3 = builder.maxElapsedTimeMillis;
        this.maxElapsedTimeMillis = i3;
        this.nanoClock = builder.nanoClock;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(0.0d <= d && d < 1.0d);
        Preconditions.checkArgument(d2 >= 1.0d);
        Preconditions.checkArgument(i2 >= i);
        Preconditions.checkArgument(i3 > 0);
        reset();
    }

    @Override // com.google.api.client.util.BackOff
    public final void reset() {
        this.currentIntervalMillis = this.initialIntervalMillis;
        this.startTimeNanos = this.nanoClock.nanoTime();
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        if (getElapsedTimeMillis() > this.maxElapsedTimeMillis) {
            return -1L;
        }
        int randomValueFromInterval = getRandomValueFromInterval(this.randomizationFactor, Math.random(), this.currentIntervalMillis);
        incrementCurrentInterval();
        return randomValueFromInterval;
    }

    public final int getInitialIntervalMillis() {
        return this.initialIntervalMillis;
    }

    public final double getRandomizationFactor() {
        return this.randomizationFactor;
    }

    public final int getCurrentIntervalMillis() {
        return this.currentIntervalMillis;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final int getMaxIntervalMillis() {
        return this.maxIntervalMillis;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.maxElapsedTimeMillis;
    }

    public final long getElapsedTimeMillis() {
        return (this.nanoClock.nanoTime() - this.startTimeNanos) / 1000000;
    }

    private void incrementCurrentInterval() {
        int i = this.currentIntervalMillis;
        int i2 = this.maxIntervalMillis;
        double d = this.multiplier;
        if (i >= i2 / d) {
            this.currentIntervalMillis = i2;
        } else {
            this.currentIntervalMillis = (int) (i * d);
        }
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        int initialIntervalMillis = 500;
        double randomizationFactor = 0.5d;
        double multiplier = 1.5d;
        int maxIntervalMillis = 60000;
        int maxElapsedTimeMillis = 900000;
        NanoClock nanoClock = NanoClock.SYSTEM;

        public ExponentialBackOff build() {
            return new ExponentialBackOff(this);
        }

        public final int getInitialIntervalMillis() {
            return this.initialIntervalMillis;
        }

        public Builder setInitialIntervalMillis(int i) {
            this.initialIntervalMillis = i;
            return this;
        }

        public final double getRandomizationFactor() {
            return this.randomizationFactor;
        }

        public Builder setRandomizationFactor(double d) {
            this.randomizationFactor = d;
            return this;
        }

        public final double getMultiplier() {
            return this.multiplier;
        }

        public Builder setMultiplier(double d) {
            this.multiplier = d;
            return this;
        }

        public final int getMaxIntervalMillis() {
            return this.maxIntervalMillis;
        }

        public Builder setMaxIntervalMillis(int i) {
            this.maxIntervalMillis = i;
            return this;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.maxElapsedTimeMillis;
        }

        public Builder setMaxElapsedTimeMillis(int i) {
            this.maxElapsedTimeMillis = i;
            return this;
        }

        public final NanoClock getNanoClock() {
            return this.nanoClock;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.nanoClock = (NanoClock) Preconditions.checkNotNull(nanoClock);
            return this;
        }
    }
}

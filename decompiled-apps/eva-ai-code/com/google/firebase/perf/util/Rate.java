package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    public Rate(long j, long j2, TimeUnit timeUnit) {
        this.numTokensPerTotalTimeUnit = j;
        this.numTimeUnits = j2;
        this.timeUnit = timeUnit;
    }

    /* renamed from: com.google.firebase.perf.util.Rate$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public double getTokensPerSeconds() {
        int i = AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMillis(1L);
                }
                return this.numTokensPerTotalTimeUnit / this.timeUnit.toSeconds(this.numTimeUnits);
            }
            return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toNanos(1L);
    }
}

package io.opencensus.metrics.export;

import io.opencensus.common.Timestamp;
/* loaded from: classes4.dex */
public abstract class Point {
    public abstract Timestamp getTimestamp();

    public abstract Value getValue();

    public static Point create(Value value, Timestamp timestamp) {
        return new AutoValue_Point(value, timestamp);
    }
}

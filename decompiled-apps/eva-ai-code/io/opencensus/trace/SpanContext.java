package io.opencensus.trace;

import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class SpanContext {
    public static final SpanContext INVALID;
    private static final Tracestate TRACESTATE_DEFAULT;
    private final SpanId spanId;
    private final TraceId traceId;
    private final TraceOptions traceOptions;
    private final Tracestate tracestate;

    static {
        Tracestate build = Tracestate.builder().build();
        TRACESTATE_DEFAULT = build;
        INVALID = new SpanContext(TraceId.INVALID, SpanId.INVALID, TraceOptions.DEFAULT, build);
    }

    @Deprecated
    public static SpanContext create(TraceId traceId, SpanId spanId, TraceOptions traceOptions) {
        return create(traceId, spanId, traceOptions, TRACESTATE_DEFAULT);
    }

    public static SpanContext create(TraceId traceId, SpanId spanId, TraceOptions traceOptions, Tracestate tracestate) {
        return new SpanContext(traceId, spanId, traceOptions, tracestate);
    }

    public TraceId getTraceId() {
        return this.traceId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public TraceOptions getTraceOptions() {
        return this.traceOptions;
    }

    public Tracestate getTracestate() {
        return this.tracestate;
    }

    public boolean isValid() {
        return this.traceId.isValid() && this.spanId.isValid();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpanContext) {
            SpanContext spanContext = (SpanContext) obj;
            return this.traceId.equals(spanContext.traceId) && this.spanId.equals(spanContext.spanId) && this.traceOptions.equals(spanContext.traceOptions);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.traceId, this.spanId, this.traceOptions});
    }

    public String toString() {
        return "SpanContext{traceId=" + this.traceId + ", spanId=" + this.spanId + ", traceOptions=" + this.traceOptions + "}";
    }

    private SpanContext(TraceId traceId, SpanId spanId, TraceOptions traceOptions, Tracestate tracestate) {
        this.traceId = traceId;
        this.spanId = spanId;
        this.traceOptions = traceOptions;
        this.tracestate = tracestate;
    }
}

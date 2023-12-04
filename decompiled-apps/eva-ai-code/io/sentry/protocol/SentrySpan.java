package io.sentry.protocol;

import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class SentrySpan {
    private final Map<String, Object> data;
    private final String description;
    private final String op;
    private final SpanId parentSpanId;
    private final SpanId spanId;
    private final Date startTimestamp;
    private final SpanStatus status;
    private final Map<String, String> tags;
    private final Date timestamp;
    private final SentryId traceId;

    public SentrySpan(Span span) {
        this(span, span.getData());
    }

    public SentrySpan(Span span, Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        Map<String, String> newConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = newConcurrentHashMap == null ? new ConcurrentHashMap<>() : newConcurrentHashMap;
        this.timestamp = span.getTimestamp();
        this.startTimestamp = span.getStartTimestamp();
        this.data = map;
    }

    public boolean isFinished() {
        return this.timestamp != null;
    }

    public Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public String getOp() {
        return this.op;
    }

    public String getDescription() {
        return this.description;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Map<String, Object> getData() {
        return this.data;
    }
}

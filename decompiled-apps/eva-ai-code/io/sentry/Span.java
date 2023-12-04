package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public final class Span implements ISpan {
    private final SpanContext context;
    private final Map<String, Object> data;
    private final AtomicBoolean finished;
    private final IHub hub;
    private final SpanFinishedCallback spanFinishedCallback;
    private final Date startTimestamp;
    private Throwable throwable;
    private Date timestamp;
    private final SentryTracer transaction;

    Span(SentryId sentryId, SpanId spanId, SentryTracer sentryTracer, String str, IHub iHub) {
        this(sentryId, spanId, sentryTracer, str, iHub, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Span(SentryId sentryId, SpanId spanId, SentryTracer sentryTracer, String str, IHub iHub, Date date, SpanFinishedCallback spanFinishedCallback) {
        this.finished = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.context = new SpanContext(sentryId, new SpanId(), str, spanId, sentryTracer.isSampled());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "transaction is required");
        this.startTimestamp = date == null ? DateUtils.getCurrentDateTime() : date;
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.spanFinishedCallback = spanFinishedCallback;
    }

    public Span(TransactionContext transactionContext, SentryTracer sentryTracer, IHub iHub, Date date) {
        this.finished = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.context = (SpanContext) Objects.requireNonNull(transactionContext, "context is required");
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.startTimestamp = date == null ? DateUtils.getCurrentDateTime() : date;
        this.spanFinishedCallback = null;
    }

    public Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str) {
        return startChild(str, null);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, Date date) {
        if (this.finished.get()) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2, date);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2) {
        if (this.finished.get()) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    @Override // io.sentry.ISpan
    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
    }

    @Override // io.sentry.ISpan
    public TraceState traceState() {
        return this.transaction.traceState();
    }

    @Override // io.sentry.ISpan
    public TraceStateHeader toTraceStateHeader() {
        return this.transaction.toTraceStateHeader();
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(this.context.getStatus());
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus) {
        finish(spanStatus, DateUtils.getCurrentDateTime());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finish(SpanStatus spanStatus, Date date) {
        if (this.finished.compareAndSet(false, true)) {
            this.context.setStatus(spanStatus);
            this.timestamp = date;
            Throwable th = this.throwable;
            if (th != null) {
                this.hub.setSpanContext(th, this, this.transaction.getName());
            }
            SpanFinishedCallback spanFinishedCallback = this.spanFinishedCallback;
            if (spanFinishedCallback != null) {
                spanFinishedCallback.execute(this);
            }
        }
    }

    @Override // io.sentry.ISpan
    public void setOperation(String str) {
        if (this.finished.get()) {
            return;
        }
        this.context.setOperation(str);
    }

    @Override // io.sentry.ISpan
    public String getOperation() {
        return this.context.getOperation();
    }

    @Override // io.sentry.ISpan
    public void setDescription(String str) {
        if (this.finished.get()) {
            return;
        }
        this.context.setDescription(str);
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.context.getDescription();
    }

    @Override // io.sentry.ISpan
    public void setStatus(SpanStatus spanStatus) {
        if (this.finished.get()) {
            return;
        }
        this.context.setStatus(spanStatus);
    }

    @Override // io.sentry.ISpan
    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    @Override // io.sentry.ISpan
    public SpanContext getSpanContext() {
        return this.context;
    }

    @Override // io.sentry.ISpan
    public void setTag(String str, String str2) {
        if (this.finished.get()) {
            return;
        }
        this.context.setTag(str, str2);
    }

    @Override // io.sentry.ISpan
    public String getTag(String str) {
        return this.context.getTags().get(str);
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.finished.get();
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Boolean isSampled() {
        return this.context.getSampled();
    }

    @Override // io.sentry.ISpan
    public void setThrowable(Throwable th) {
        if (this.finished.get()) {
            return;
        }
        this.throwable = th;
    }

    @Override // io.sentry.ISpan
    public Throwable getThrowable() {
        return this.throwable;
    }

    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    public SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    public Map<String, String> getTags() {
        return this.context.getTags();
    }

    @Override // io.sentry.ISpan
    public void setData(String str, Object obj) {
        if (this.finished.get()) {
            return;
        }
        this.data.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public Object getData(String str) {
        return this.data.get(str);
    }
}

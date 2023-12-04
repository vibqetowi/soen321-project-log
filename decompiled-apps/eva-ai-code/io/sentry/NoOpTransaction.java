package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import java.util.Collections;
import java.util.Date;
import java.util.List;
/* loaded from: classes4.dex */
public final class NoOpTransaction implements ITransaction {
    private static final NoOpTransaction instance = new NoOpTransaction();

    @Override // io.sentry.ISpan
    public void finish() {
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public Object getData(String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.ITransaction
    public Span getLatestActiveSpan() {
        return null;
    }

    @Override // io.sentry.ITransaction
    public String getName() {
        return "";
    }

    @Override // io.sentry.ISpan
    public String getOperation() {
        return "";
    }

    @Override // io.sentry.ITransaction
    @Deprecated
    public Request getRequest() {
        return null;
    }

    @Override // io.sentry.ISpan
    public SpanStatus getStatus() {
        return null;
    }

    @Override // io.sentry.ISpan
    public String getTag(String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    public Throwable getThrowable() {
        return null;
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return true;
    }

    @Override // io.sentry.ITransaction
    public Boolean isSampled() {
        return null;
    }

    @Override // io.sentry.ISpan
    public void setData(String str, Object obj) {
    }

    @Override // io.sentry.ISpan
    public void setDescription(String str) {
    }

    @Override // io.sentry.ITransaction
    public void setName(String str) {
    }

    @Override // io.sentry.ISpan
    public void setOperation(String str) {
    }

    @Override // io.sentry.ITransaction
    @Deprecated
    public void setRequest(Request request) {
    }

    @Override // io.sentry.ISpan
    public void setStatus(SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public void setTag(String str, String str2) {
    }

    @Override // io.sentry.ISpan
    public void setThrowable(Throwable th) {
    }

    private NoOpTransaction() {
    }

    public static NoOpTransaction getInstance() {
        return instance;
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, Date date) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ITransaction
    @Deprecated
    public Contexts getContexts() {
        return new Contexts();
    }

    @Override // io.sentry.ITransaction
    public List<Span> getSpans() {
        return Collections.emptyList();
    }

    @Override // io.sentry.ITransaction
    public SentryId getEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISpan
    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, false);
    }

    @Override // io.sentry.ISpan
    public TraceState traceState() {
        return new TraceState(SentryId.EMPTY_ID, "");
    }

    @Override // io.sentry.ISpan
    public TraceStateHeader toTraceStateHeader() {
        return new TraceStateHeader("");
    }

    @Override // io.sentry.ISpan
    public SpanContext getSpanContext() {
        return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", null, null);
    }
}

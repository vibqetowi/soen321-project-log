package io.sentry;

import java.util.Date;
/* loaded from: classes4.dex */
public interface ISpan {
    void finish();

    void finish(SpanStatus spanStatus);

    Object getData(String str);

    String getDescription();

    String getOperation();

    SpanContext getSpanContext();

    SpanStatus getStatus();

    String getTag(String str);

    Throwable getThrowable();

    boolean isFinished();

    void setData(String str, Object obj);

    void setDescription(String str);

    void setOperation(String str);

    void setStatus(SpanStatus spanStatus);

    void setTag(String str, String str2);

    void setThrowable(Throwable th);

    ISpan startChild(String str);

    ISpan startChild(String str, String str2);

    ISpan startChild(String str, String str2, Date date);

    SentryTraceHeader toSentryTrace();

    TraceStateHeader toTraceStateHeader();

    TraceState traceState();
}

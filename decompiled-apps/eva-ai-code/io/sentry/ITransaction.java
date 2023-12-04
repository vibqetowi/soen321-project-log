package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import java.util.List;
/* loaded from: classes4.dex */
public interface ITransaction extends ISpan {
    @Deprecated
    Contexts getContexts();

    SentryId getEventId();

    Span getLatestActiveSpan();

    String getName();

    @Deprecated
    Request getRequest();

    List<Span> getSpans();

    Boolean isSampled();

    void setName(String str);

    @Deprecated
    void setRequest(Request request);
}

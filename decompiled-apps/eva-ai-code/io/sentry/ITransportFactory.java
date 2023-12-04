package io.sentry;

import io.sentry.transport.ITransport;
/* loaded from: classes4.dex */
public interface ITransportFactory {
    ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails);
}

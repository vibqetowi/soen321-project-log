package io.sentry.android.core;

import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.OutboxSender;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.Objects;
import java.io.Closeable;
/* loaded from: classes4.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {
    private ILogger logger;
    private EnvelopeFileObserver observer;

    abstract String getPath(SentryOptions sentryOptions);

    public static EnvelopeFileObserverIntegration getOutboxFileObserver() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // io.sentry.Integration
    public final void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        this.logger = sentryOptions.getLogger();
        String path = getPath(sentryOptions);
        if (path == null) {
            this.logger.log(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.logger.log(SentryLevel.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", path);
        EnvelopeFileObserver envelopeFileObserver = new EnvelopeFileObserver(path, new OutboxSender(iHub, sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), this.logger, sentryOptions.getFlushTimeoutMillis()), this.logger, sentryOptions.getFlushTimeoutMillis());
        this.observer = envelopeFileObserver;
        try {
            envelopeFileObserver.startWatching();
            this.logger.log(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        EnvelopeFileObserver envelopeFileObserver = this.observer;
        if (envelopeFileObserver != null) {
            envelopeFileObserver.stopWatching();
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.log(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String getPath(SentryOptions sentryOptions) {
            return sentryOptions.getOutboxPath();
        }
    }
}

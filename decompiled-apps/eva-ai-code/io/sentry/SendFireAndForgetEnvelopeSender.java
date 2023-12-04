package io.sentry;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.util.Objects;
/* loaded from: classes4.dex */
public final class SendFireAndForgetEnvelopeSender implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory {
    private final SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath sendFireAndForgetDirPath;

    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory
    public /* synthetic */ boolean hasValidPath(String str, ILogger iLogger) {
        return SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory.CC.$default$hasValidPath(this, str, iLogger);
    }

    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory
    public /* synthetic */ SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget processDir(DirectoryProcessor directoryProcessor, String str, ILogger iLogger) {
        return SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory.CC.$default$processDir(this, directoryProcessor, str, iLogger);
    }

    public SendFireAndForgetEnvelopeSender(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath sendFireAndForgetDirPath) {
        this.sendFireAndForgetDirPath = (SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath) Objects.requireNonNull(sendFireAndForgetDirPath, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory
    public SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget create(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        String dirPath = this.sendFireAndForgetDirPath.getDirPath();
        if (dirPath == null || !hasValidPath(dirPath, sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return processDir(new EnvelopeSender(iHub, sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis()), dirPath, sentryOptions.getLogger());
    }
}

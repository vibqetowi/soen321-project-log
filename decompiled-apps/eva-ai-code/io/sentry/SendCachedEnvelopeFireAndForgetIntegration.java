package io.sentry;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.util.Objects;
import java.io.File;
/* loaded from: classes4.dex */
public final class SendCachedEnvelopeFireAndForgetIntegration implements Integration {
    private final SendFireAndForgetFactory factory;

    /* loaded from: classes4.dex */
    public interface SendFireAndForget {
        void send();
    }

    /* loaded from: classes4.dex */
    public interface SendFireAndForgetDirPath {
        String getDirPath();
    }

    /* loaded from: classes4.dex */
    public interface SendFireAndForgetFactory {
        SendFireAndForget create(IHub iHub, SentryOptions sentryOptions);

        boolean hasValidPath(String str, ILogger iLogger);

        SendFireAndForget processDir(DirectoryProcessor directoryProcessor, String str, ILogger iLogger);

        /* renamed from: io.sentry.SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForgetFactory$-CC  reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
            public static boolean $default$hasValidPath(SendFireAndForgetFactory _this, String str, ILogger iLogger) {
                if (str == null || str.isEmpty()) {
                    iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
                    return false;
                }
                return true;
            }

            public static SendFireAndForget $default$processDir(SendFireAndForgetFactory _this, final DirectoryProcessor directoryProcessor, final String str, final ILogger iLogger) {
                final File file = new File(str);
                return new SendFireAndForget() { // from class: io.sentry.SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForgetFactory$$ExternalSyntheticLambda0
                    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget
                    public final void send() {
                        SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory.CC.lambda$processDir$0(ILogger.this, str, directoryProcessor, file);
                    }
                };
            }

            public static /* synthetic */ void lambda$processDir$0(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
                iLogger.log(SentryLevel.DEBUG, "Started processing cached files from %s", str);
                directoryProcessor.processDirectory(file);
                iLogger.log(SentryLevel.DEBUG, "Finished processing cached files from %s", str);
            }
        }
    }

    public SendCachedEnvelopeFireAndForgetIntegration(SendFireAndForgetFactory sendFireAndForgetFactory) {
        this.factory = (SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
    }

    @Override // io.sentry.Integration
    public final void register(IHub iHub, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final SendFireAndForget create = this.factory.create(iHub, sentryOptions);
        if (create == null) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.SendCachedEnvelopeFireAndForgetIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeFireAndForgetIntegration.lambda$register$0(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget.this, sentryOptions);
                }
            });
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$register$0(SendFireAndForget sendFireAndForget, SentryOptions sentryOptions) {
        try {
            sendFireAndForget.send();
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", th);
        }
    }
}

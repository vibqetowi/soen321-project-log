package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {
    private final IHub hub;
    private final ILogger logger;
    private final ISerializer serializer;

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    public EnvelopeSender(IHub iHub, ISerializer iSerializer, ILogger iLogger, long j) {
        super(iLogger, j);
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    @Override // io.sentry.DirectoryProcessor
    protected void processFile(File file, Object obj) {
        BufferedInputStream bufferedInputStream;
        if (!file.isFile()) {
            this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
        } else if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
        } else {
            try {
                if (!file.getParentFile().canWrite()) {
                    this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                    return;
                }
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                } catch (FileNotFoundException e) {
                    this.logger.log(SentryLevel.ERROR, e, "File '%s' cannot be found.", file.getAbsolutePath());
                    if (obj instanceof Retryable) {
                        if (((Retryable) obj).isRetry()) {
                            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                            return;
                        }
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                } catch (IOException e2) {
                    this.logger.log(SentryLevel.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
                    if (obj instanceof Retryable) {
                        if (((Retryable) obj).isRetry()) {
                            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                            return;
                        }
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                }
                try {
                    SentryEnvelope deserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                    if (deserializeEnvelope == null) {
                        this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.hub.captureEnvelope(deserializeEnvelope, obj);
                    }
                    if (!(obj instanceof Flushable)) {
                        LogUtils.logIfNotFlushable(this.logger, obj);
                    } else if (!((Flushable) obj).waitFlush()) {
                        this.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                    }
                    bufferedInputStream.close();
                    if (obj instanceof Retryable) {
                        if (((Retryable) obj).isRetry()) {
                            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                            return;
                        }
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                    LogUtils.logIfNotRetryable(this.logger, obj);
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.DirectoryProcessor
    protected boolean isRelevantFileName(String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(String str, Object obj) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), obj);
    }

    private void safeDelete(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }
}

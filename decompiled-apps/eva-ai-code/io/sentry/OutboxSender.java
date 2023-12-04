package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.CollectionUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
public final class OutboxSender extends DirectoryProcessor implements IEnvelopeSender {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final IEnvelopeReader envelopeReader;
    private final IHub hub;
    private final ILogger logger;
    private final ISerializer serializer;

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    public OutboxSender(IHub iHub, IEnvelopeReader iEnvelopeReader, ISerializer iSerializer, ILogger iLogger, long j) {
        super(iLogger, j);
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required.");
        this.envelopeReader = (IEnvelopeReader) Objects.requireNonNull(iEnvelopeReader, "Envelope reader is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    @Override // io.sentry.DirectoryProcessor
    protected void processFile(File file, Object obj) {
        Objects.requireNonNull(file, "File is required.");
        try {
            if (!isRelevantFileName(file.getName())) {
                this.logger.log(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    SentryEnvelope read = this.envelopeReader.read(bufferedInputStream);
                    if (read == null) {
                        this.logger.log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        processEnvelope(read, obj);
                        this.logger.log(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    if (obj instanceof Retryable) {
                        if (((Retryable) obj).isRetry()) {
                            return;
                        }
                        try {
                            if (file.delete()) {
                                return;
                            }
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        } catch (RuntimeException e) {
                            this.logger.log(SentryLevel.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.logger.log(SentryLevel.ERROR, "Error processing envelope.", e2);
                if (obj instanceof Retryable) {
                    if (((Retryable) obj).isRetry()) {
                        return;
                    }
                    try {
                        if (file.delete()) {
                            return;
                        }
                        this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                        return;
                    } catch (RuntimeException e3) {
                        this.logger.log(SentryLevel.ERROR, e3, "Failed to delete: %s", file.getAbsolutePath());
                        return;
                    }
                }
            }
            LogUtils.logIfNotRetryable(this.logger, obj);
        } catch (Throwable th3) {
            if (obj instanceof Retryable) {
                if (!((Retryable) obj).isRetry()) {
                    try {
                        if (!file.delete()) {
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                        }
                    } catch (RuntimeException e4) {
                        this.logger.log(SentryLevel.ERROR, e4, "Failed to delete: %s", file.getAbsolutePath());
                    }
                }
            } else {
                LogUtils.logIfNotRetryable(this.logger, obj);
            }
            throw th3;
        }
    }

    @Override // io.sentry.DirectoryProcessor
    protected boolean isRelevantFileName(String str) {
        return (str == null || str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE)) ? false : true;
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(String str, Object obj) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0207 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void processEnvelope(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
        this.logger.log(SentryLevel.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(CollectionUtils.size(sentryEnvelope.getItems())));
        int i = 0;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            i++;
            if (sentryEnvelopeItem.getHeader() == null) {
                this.logger.log(SentryLevel.ERROR, "Item %d has no header", Integer.valueOf(i));
            } else if (SentryItemType.Event.equals(sentryEnvelopeItem.getHeader().getType())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
                    SentryEvent sentryEvent = (SentryEvent) this.serializer.deserialize(bufferedReader, SentryEvent.class);
                    if (sentryEvent == null) {
                        logEnvelopeItemNull(sentryEnvelopeItem, i);
                    } else if (sentryEnvelope.getHeader().getEventId() != null && !sentryEnvelope.getHeader().getEventId().equals(sentryEvent.getEventId())) {
                        logUnexpectedEventId(sentryEnvelope, sentryEvent.getEventId(), i);
                        bufferedReader.close();
                    } else {
                        this.hub.captureEvent(sentryEvent, obj);
                        logItemCaptured(i);
                        if (!waitFlush(obj)) {
                            logTimeout(sentryEvent.getEventId());
                            bufferedReader.close();
                            return;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    this.logger.log(SentryLevel.ERROR, "Item failed to process.", th);
                }
                if (!(obj instanceof SubmissionResult) && !((SubmissionResult) obj).isSuccess()) {
                    this.logger.log(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
                    return;
                } else if (!(obj instanceof Resettable)) {
                    ((Resettable) obj).reset();
                }
            } else {
                if (SentryItemType.Transaction.equals(sentryEnvelopeItem.getHeader().getType())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
                        SentryTransaction sentryTransaction = (SentryTransaction) this.serializer.deserialize(bufferedReader2, SentryTransaction.class);
                        if (sentryTransaction == null) {
                            logEnvelopeItemNull(sentryEnvelopeItem, i);
                        } else if (sentryEnvelope.getHeader().getEventId() != null && !sentryEnvelope.getHeader().getEventId().equals(sentryTransaction.getEventId())) {
                            logUnexpectedEventId(sentryEnvelope, sentryTransaction.getEventId(), i);
                            bufferedReader2.close();
                        } else {
                            if (sentryTransaction.getContexts().getTrace() != null) {
                                sentryTransaction.getContexts().getTrace().setSampled(true);
                            }
                            this.hub.captureTransaction(sentryTransaction, sentryEnvelope.getHeader().getTrace(), obj);
                            logItemCaptured(i);
                            if (!waitFlush(obj)) {
                                logTimeout(sentryTransaction.getEventId());
                                bufferedReader2.close();
                                return;
                            }
                        }
                        bufferedReader2.close();
                    } catch (Throwable th2) {
                        this.logger.log(SentryLevel.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.hub.captureEnvelope(new SentryEnvelope(sentryEnvelope.getHeader().getEventId(), sentryEnvelope.getHeader().getSdkVersion(), sentryEnvelopeItem), obj);
                    this.logger.log(SentryLevel.DEBUG, "%s item %d is being captured.", sentryEnvelopeItem.getHeader().getType().getItemType(), Integer.valueOf(i));
                    if (!waitFlush(obj)) {
                        this.logger.log(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", sentryEnvelopeItem.getHeader().getType().getItemType());
                        return;
                    }
                }
                if (!(obj instanceof SubmissionResult)) {
                }
                if (!(obj instanceof Resettable)) {
                }
            }
        }
    }

    private void logEnvelopeItemNull(SentryEnvelopeItem sentryEnvelopeItem, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), sentryEnvelopeItem.getHeader().getType());
    }

    private void logUnexpectedEventId(SentryEnvelope sentryEnvelope, SentryId sentryId, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), sentryEnvelope.getHeader().getEventId(), sentryId);
    }

    private void logItemCaptured(int i) {
        this.logger.log(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
    }

    private void logTimeout(SentryId sentryId) {
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", sentryId);
    }

    private boolean waitFlush(Object obj) {
        if (obj instanceof Flushable) {
            return ((Flushable) obj).waitFlush();
        }
        LogUtils.logIfNotFlushable(this.logger, obj);
        return true;
    }
}

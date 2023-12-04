package io.sentry.instrumentation.file;

import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.SpanStatus;
import io.sentry.util.Platform;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
/* loaded from: classes4.dex */
final class FileIOSpanManager {
    private long byteCount;
    private final ISpan currentSpan;
    private final File file;
    private final boolean isSendDefaultPii;
    private SpanStatus spanStatus = SpanStatus.OK;

    @FunctionalInterface
    /* loaded from: classes4.dex */
    interface FileIOCallable<T> {
        T call() throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ISpan startSpan(IHub iHub, String str) {
        ISpan span = iHub.getSpan();
        if (span != null) {
            return span.startChild(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileIOSpanManager(ISpan iSpan, File file, boolean z) {
        this.currentSpan = iSpan;
        this.file = file;
        this.isSendDefaultPii = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T performIO(FileIOCallable<T> fileIOCallable) throws IOException {
        try {
            T call = fileIOCallable.call();
            if (call instanceof Integer) {
                int intValue = ((Integer) call).intValue();
                if (intValue != -1) {
                    this.byteCount += intValue;
                }
            } else if (call instanceof Long) {
                long longValue = ((Long) call).longValue();
                if (longValue != -1) {
                    this.byteCount += longValue;
                }
            }
            return call;
        } catch (IOException e) {
            this.spanStatus = SpanStatus.INTERNAL_ERROR;
            ISpan iSpan = this.currentSpan;
            if (iSpan != null) {
                iSpan.setThrowable(e);
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finish(Closeable closeable) throws IOException {
        try {
            try {
                closeable.close();
            } catch (IOException e) {
                this.spanStatus = SpanStatus.INTERNAL_ERROR;
                if (this.currentSpan != null) {
                    this.currentSpan.setThrowable(e);
                }
                throw e;
            }
        } finally {
            finishSpan();
        }
    }

    private void finishSpan() {
        if (this.currentSpan != null) {
            String byteCountToString = StringUtils.byteCountToString(this.byteCount);
            if (this.file != null) {
                this.currentSpan.setDescription(this.file.getName() + " (" + byteCountToString + ")");
                if (Platform.isAndroid() || this.isSendDefaultPii) {
                    this.currentSpan.setData("file.path", this.file.getAbsolutePath());
                }
            } else {
                this.currentSpan.setDescription(byteCountToString);
            }
            this.currentSpan.setData("file.size", Long.valueOf(this.byteCount));
            this.currentSpan.finish(this.spanStatus);
        }
    }
}

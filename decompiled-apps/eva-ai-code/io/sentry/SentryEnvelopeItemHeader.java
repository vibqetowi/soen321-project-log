package io.sentry;

import io.sentry.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public final class SentryEnvelopeItemHeader {
    private final String attachmentType;
    private final String contentType;
    private final String fileName;
    private final Callable<Integer> getLength;
    private final int length;
    private final SentryItemType type;

    public SentryItemType getType() {
        return this.type;
    }

    public int getLength() {
        Callable<Integer> callable = this.getLength;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return -1;
            }
        }
        return this.length;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, int i, String str, String str2, String str3) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = i;
        this.fileName = str2;
        this.getLength = null;
        this.attachmentType = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, Callable<Integer> callable, String str, String str2, String str3) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = -1;
        this.fileName = str2;
        this.getLength = callable;
        this.attachmentType = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, Callable<Integer> callable, String str, String str2) {
        this(sentryItemType, callable, str, str2, (String) null);
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }
}

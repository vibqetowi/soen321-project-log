package io.sentry;

import java.io.File;
/* loaded from: classes4.dex */
public final class Attachment {
    private static final String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
    private static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";
    private final boolean addToTransactions;
    private String attachmentType;
    private byte[] bytes;
    private final String contentType;
    private final String filename;
    private String pathname;

    public Attachment(byte[] bArr, String str) {
        this(bArr, str, "application/octet-stream");
    }

    public Attachment(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, false);
    }

    public Attachment(byte[] bArr, String str, String str2, boolean z) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.bytes = bArr;
        this.filename = str;
        this.contentType = str2;
        this.addToTransactions = z;
    }

    public Attachment(String str) {
        this(str, new File(str).getName());
    }

    public Attachment(String str, String str2) {
        this(str, str2, "application/octet-stream");
    }

    public Attachment(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public Attachment(String str, String str2, String str3, boolean z) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.pathname = str;
        this.filename = str2;
        this.contentType = str3;
        this.addToTransactions = z;
    }

    public Attachment(String str, String str2, String str3, boolean z, String str4) {
        this.pathname = str;
        this.filename = str2;
        this.contentType = str3;
        this.addToTransactions = z;
        this.attachmentType = str4;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public String getPathname() {
        return this.pathname;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAddToTransactions() {
        return this.addToTransactions;
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }
}

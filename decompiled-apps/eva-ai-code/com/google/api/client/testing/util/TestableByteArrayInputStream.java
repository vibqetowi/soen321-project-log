package com.google.api.client.testing.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
/* loaded from: classes7.dex */
public class TestableByteArrayInputStream extends ByteArrayInputStream {
    private boolean closed;

    public TestableByteArrayInputStream(byte[] bArr) {
        super(bArr);
    }

    public TestableByteArrayInputStream(byte[] bArr, int i, int i2) {
        super(bArr);
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }

    public final byte[] getBuffer() {
        return this.buf;
    }

    public final boolean isClosed() {
        return this.closed;
    }
}

package com.facebook.crypto.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes2.dex */
public class FixedSizeByteArrayOutputStream extends ByteArrayOutputStream {
    public FixedSizeByteArrayOutputStream(int i) {
        super(i);
    }

    public byte[] getBytes() throws IOException {
        if (this.buf.length != this.count) {
            throw new IOException("Size supplied is too small");
        }
        return this.buf;
    }
}

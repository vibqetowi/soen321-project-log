package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes7.dex */
public final class BinaryKeysetWriter implements KeysetWriter {
    private final boolean closeStreamAfterReading;
    private final OutputStream outputStream;

    private BinaryKeysetWriter(OutputStream stream, boolean closeStreamAfterReading) {
        this.outputStream = stream;
        this.closeStreamAfterReading = closeStreamAfterReading;
    }

    public static KeysetWriter withOutputStream(OutputStream stream) {
        return new BinaryKeysetWriter(stream, false);
    }

    public static KeysetWriter withFile(File file) throws IOException {
        return new BinaryKeysetWriter(new FileOutputStream(file), true);
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            keyset.writeTo(this.outputStream);
        } finally {
            if (this.closeStreamAfterReading) {
                this.outputStream.close();
            }
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset keyset) throws IOException {
        try {
            keyset.writeTo(this.outputStream);
        } finally {
            if (this.closeStreamAfterReading) {
                this.outputStream.close();
            }
        }
    }
}

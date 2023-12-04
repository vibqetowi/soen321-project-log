package com.google.crypto.tink.subtle;

import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class NonceBasedStreamingAead implements StreamingAead {
    public abstract int getCiphertextOffset();

    public abstract int getCiphertextOverhead();

    public abstract int getCiphertextSegmentSize();

    public abstract int getHeaderLength();

    public abstract int getPlaintextSegmentSize();

    public abstract StreamSegmentDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException;

    public abstract StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] associatedData) throws GeneralSecurityException;

    @Override // com.google.crypto.tink.StreamingAead
    public WritableByteChannel newEncryptingChannel(WritableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new StreamingAeadEncryptingChannel(this, ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel newDecryptingChannel(ReadableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new StreamingAeadDecryptingChannel(this, ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel ciphertextSource, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new StreamingAeadSeekableDecryptingChannel(this, ciphertextSource, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public OutputStream newEncryptingStream(OutputStream ciphertext, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new StreamingAeadEncryptingStream(this, ciphertext, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream newDecryptingStream(InputStream ciphertextStream, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new StreamingAeadDecryptingStream(this, ciphertextStream, associatedData);
    }
}

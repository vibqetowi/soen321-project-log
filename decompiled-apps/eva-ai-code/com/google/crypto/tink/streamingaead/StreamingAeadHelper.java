package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
final class StreamingAeadHelper implements StreamingAead {
    PrimitiveSet<StreamingAead> primitives;

    public StreamingAeadHelper(PrimitiveSet<StreamingAead> primitives) throws GeneralSecurityException {
        if (primitives.getPrimary() == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        this.primitives = primitives;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public WritableByteChannel newEncryptingChannel(WritableByteChannel ciphertextDestination, byte[] associatedData) throws GeneralSecurityException, IOException {
        return this.primitives.getPrimary().getPrimitive().newEncryptingChannel(ciphertextDestination, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel newDecryptingChannel(ReadableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new ReadableByteChannelDecrypter(this.primitives, ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new SeekableByteChannelDecrypter(this.primitives, ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream newDecryptingStream(InputStream ciphertextStream, byte[] associatedData) throws GeneralSecurityException, IOException {
        return new InputStreamDecrypter(this.primitives, ciphertextStream, associatedData);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public OutputStream newEncryptingStream(OutputStream ciphertext, byte[] associatedData) throws GeneralSecurityException, IOException {
        return this.primitives.getPrimary().getPrimitive().newEncryptingStream(ciphertext, associatedData);
    }
}

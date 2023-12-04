package com.google.crypto.tink.subtle;

import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesGcmHkdfStreaming extends NonceBasedStreamingAead {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final String hkdfAlg;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
        return 16;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ ReadableByteChannel newDecryptingChannel(ReadableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return super.newDecryptingChannel(ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ InputStream newDecryptingStream(InputStream ciphertextStream, byte[] associatedData) throws GeneralSecurityException, IOException {
        return super.newDecryptingStream(ciphertextStream, associatedData);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ WritableByteChannel newEncryptingChannel(WritableByteChannel ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        return super.newEncryptingChannel(ciphertextChannel, associatedData);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ OutputStream newEncryptingStream(OutputStream ciphertext, byte[] associatedData) throws GeneralSecurityException, IOException {
        return super.newEncryptingStream(ciphertext, associatedData);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel ciphertextSource, byte[] associatedData) throws GeneralSecurityException, IOException {
        return super.newSeekableDecryptingChannel(ciphertextSource, associatedData);
    }

    public AesGcmHkdfStreaming(byte[] ikm, String hkdfAlg, int keySizeInBytes, int ciphertextSegmentSize, int firstSegmentOffset) throws InvalidAlgorithmParameterException {
        if (ikm.length < 16 || ikm.length < keySizeInBytes) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, keySizeInBytes));
        }
        Validators.validateAesKeySize(keySizeInBytes);
        if (ciphertextSegmentSize <= getHeaderLength() + firstSegmentOffset + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.ikm = Arrays.copyOf(ikm, ikm.length);
        this.hkdfAlg = hkdfAlg;
        this.keySizeInBytes = keySizeInBytes;
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        this.firstSegmentOffset = firstSegmentOffset;
        this.plaintextSegmentSize = ciphertextSegmentSize - 16;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesGcmHkdfStreamEncrypter newStreamSegmentEncrypter(byte[] aad) throws GeneralSecurityException {
        return new AesGcmHkdfStreamEncrypter(aad);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesGcmHkdfStreamDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException {
        return new AesGcmHkdfStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
        return this.keySizeInBytes + 1 + 7;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    public int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    public long expectedCiphertextSize(long plaintextSize) {
        long ciphertextOffset = plaintextSize + getCiphertextOffset();
        int i = this.plaintextSegmentSize;
        long j = (ciphertextOffset / i) * this.ciphertextSegmentSize;
        long j2 = ciphertextOffset % i;
        return j2 > 0 ? j + j2 + 16 : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher cipherInstance() throws GeneralSecurityException {
        return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return Random.randBytes(this.keySizeInBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GCMParameterSpec paramsForSegment(byte[] prefix, long segmentNr, boolean last) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(prefix);
        SubtleUtil.putAsUnsigedInt(allocate, segmentNr);
        allocate.put(last ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, allocate.array());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] randomNonce() {
        return Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveKeySpec(byte[] salt, byte[] aad) throws GeneralSecurityException {
        return new SecretKeySpec(Hkdf.computeHkdf(this.hkdfAlg, this.ikm, salt, aad, this.keySizeInBytes), CipherStorageKeystoreAesCbc.ALGORITHM_AES);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class AesGcmHkdfStreamEncrypter implements StreamSegmentEncrypter {
        private final Cipher cipher = AesGcmHkdfStreaming.cipherInstance();
        private long encryptedSegments;
        private final ByteBuffer header;
        private final SecretKeySpec keySpec;
        private final byte[] noncePrefix;

        public AesGcmHkdfStreamEncrypter(byte[] aad) throws GeneralSecurityException {
            this.encryptedSegments = 0L;
            this.encryptedSegments = 0L;
            byte[] randomSalt = AesGcmHkdfStreaming.this.randomSalt();
            byte[] randomNonce = AesGcmHkdfStreaming.randomNonce();
            this.noncePrefix = randomNonce;
            ByteBuffer allocate = ByteBuffer.allocate(AesGcmHkdfStreaming.this.getHeaderLength());
            this.header = allocate;
            allocate.put((byte) AesGcmHkdfStreaming.this.getHeaderLength());
            allocate.put(randomSalt);
            allocate.put(randomNonce);
            allocate.flip();
            this.keySpec = AesGcmHkdfStreaming.this.deriveKeySpec(randomSalt, aad);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer plaintext, boolean isLastSegment, ByteBuffer ciphertext) throws GeneralSecurityException {
            this.cipher.init(1, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, isLastSegment));
            this.encryptedSegments++;
            this.cipher.doFinal(plaintext, ciphertext);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer part1, ByteBuffer part2, boolean isLastSegment, ByteBuffer ciphertext) throws GeneralSecurityException {
            this.cipher.init(1, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, isLastSegment));
            this.encryptedSegments++;
            if (part2.hasRemaining()) {
                this.cipher.update(part1, ciphertext);
                this.cipher.doFinal(part2, ciphertext);
            } else {
                this.cipher.doFinal(part1, ciphertext);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class AesGcmHkdfStreamDecrypter implements StreamSegmentDecrypter {
        private Cipher cipher;
        private SecretKeySpec keySpec;
        private byte[] noncePrefix;

        AesGcmHkdfStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(ByteBuffer header, byte[] aad) throws GeneralSecurityException {
            if (header.remaining() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (header.get() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.noncePrefix = new byte[7];
            byte[] bArr = new byte[AesGcmHkdfStreaming.this.keySizeInBytes];
            header.get(bArr);
            header.get(this.noncePrefix);
            this.keySpec = AesGcmHkdfStreaming.this.deriveKeySpec(bArr, aad);
            this.cipher = AesGcmHkdfStreaming.cipherInstance();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(ByteBuffer ciphertext, int segmentNr, boolean isLastSegment, ByteBuffer plaintext) throws GeneralSecurityException {
            this.cipher.init(2, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, segmentNr, isLastSegment));
            this.cipher.doFinal(ciphertext, plaintext);
        }
    }
}

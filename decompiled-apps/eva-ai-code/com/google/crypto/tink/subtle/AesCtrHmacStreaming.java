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
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesCtrHmacStreaming extends NonceBasedStreamingAead {
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final String tagAlgo;
    private final int tagSizeInBytes;

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

    public AesCtrHmacStreaming(byte[] ikm, String hkdfAlgo, int keySizeInBytes, String tagAlgo, int tagSizeInBytes, int ciphertextSegmentSize, int firstSegmentOffset) throws InvalidAlgorithmParameterException {
        validateParameters(ikm.length, keySizeInBytes, tagAlgo, tagSizeInBytes, ciphertextSegmentSize, firstSegmentOffset);
        this.ikm = Arrays.copyOf(ikm, ikm.length);
        this.hkdfAlgo = hkdfAlgo;
        this.keySizeInBytes = keySizeInBytes;
        this.tagAlgo = tagAlgo;
        this.tagSizeInBytes = tagSizeInBytes;
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        this.firstSegmentOffset = firstSegmentOffset;
        this.plaintextSegmentSize = ciphertextSegmentSize - tagSizeInBytes;
    }

    private static void validateParameters(int ikmSize, int keySizeInBytes, String tagAlgo, int tagSizeInBytes, int ciphertextSegmentSize, int firstSegmentOffset) throws InvalidAlgorithmParameterException {
        if (ikmSize < 16 || ikmSize < keySizeInBytes) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, keySizeInBytes));
        }
        Validators.validateAesKeySize(keySizeInBytes);
        if (tagSizeInBytes < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small " + tagSizeInBytes);
        } else if ((tagAlgo.equals("HmacSha1") && tagSizeInBytes > 20) || ((tagAlgo.equals("HmacSha256") && tagSizeInBytes > 32) || (tagAlgo.equals("HmacSha512") && tagSizeInBytes > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        } else {
            if (((((ciphertextSegmentSize - firstSegmentOffset) - tagSizeInBytes) - keySizeInBytes) - 7) - 1 <= 0) {
                throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
            }
        }
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] aad) throws GeneralSecurityException {
        return new AesCtrHmacStreamEncrypter(aad);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException {
        return new AesCtrHmacStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
        return this.keySizeInBytes + 1 + 7;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
        return this.tagSizeInBytes;
    }

    public int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    public long expectedCiphertextSize(long plaintextSize) {
        long ciphertextOffset = plaintextSize + getCiphertextOffset();
        int i = this.plaintextSegmentSize;
        long j = (ciphertextOffset / i) * this.ciphertextSegmentSize;
        long j2 = ciphertextOffset % i;
        return j2 > 0 ? j + j2 + this.tagSizeInBytes : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher cipherInstance() throws GeneralSecurityException {
        return EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mac macInstance() throws GeneralSecurityException {
        return EngineFactory.MAC.getInstance(this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return Random.randBytes(this.keySizeInBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] nonceForSegment(byte[] prefix, long segmentNr, boolean last) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(prefix);
        SubtleUtil.putAsUnsigedInt(allocate, segmentNr);
        allocate.put(last ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomNonce() {
        return Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] deriveKeyMaterial(byte[] salt, byte[] aad) throws GeneralSecurityException {
        return Hkdf.computeHkdf(this.hkdfAlgo, this.ikm, salt, aad, this.keySizeInBytes + 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveKeySpec(byte[] keyMaterial) throws GeneralSecurityException {
        return new SecretKeySpec(keyMaterial, 0, this.keySizeInBytes, CipherStorageKeystoreAesCbc.ALGORITHM_AES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveHmacKeySpec(byte[] keyMaterial) throws GeneralSecurityException {
        return new SecretKeySpec(keyMaterial, this.keySizeInBytes, 32, this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class AesCtrHmacStreamEncrypter implements StreamSegmentEncrypter {
        private final Cipher cipher = AesCtrHmacStreaming.cipherInstance();
        private long encryptedSegments;
        private ByteBuffer header;
        private final SecretKeySpec hmacKeySpec;
        private final SecretKeySpec keySpec;
        private final Mac mac;
        private final byte[] noncePrefix;

        public AesCtrHmacStreamEncrypter(byte[] aad) throws GeneralSecurityException {
            this.encryptedSegments = 0L;
            this.mac = AesCtrHmacStreaming.this.macInstance();
            this.encryptedSegments = 0L;
            byte[] randomSalt = AesCtrHmacStreaming.this.randomSalt();
            byte[] randomNonce = AesCtrHmacStreaming.this.randomNonce();
            this.noncePrefix = randomNonce;
            ByteBuffer allocate = ByteBuffer.allocate(AesCtrHmacStreaming.this.getHeaderLength());
            this.header = allocate;
            allocate.put((byte) AesCtrHmacStreaming.this.getHeaderLength());
            this.header.put(randomSalt);
            this.header.put(randomNonce);
            this.header.flip();
            byte[] deriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(randomSalt, aad);
            this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
            this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer plaintext, boolean isLastSegment, ByteBuffer ciphertext) throws GeneralSecurityException {
            int position = ciphertext.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, isLastSegment);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
            this.encryptedSegments++;
            this.cipher.doFinal(plaintext, ciphertext);
            ByteBuffer duplicate = ciphertext.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(nonceForSegment);
            this.mac.update(duplicate);
            ciphertext.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer part1, ByteBuffer part2, boolean isLastSegment, ByteBuffer ciphertext) throws GeneralSecurityException {
            int position = ciphertext.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, isLastSegment);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
            this.encryptedSegments++;
            this.cipher.update(part1, ciphertext);
            this.cipher.doFinal(part2, ciphertext);
            ByteBuffer duplicate = ciphertext.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(nonceForSegment);
            this.mac.update(duplicate);
            ciphertext.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class AesCtrHmacStreamDecrypter implements StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Cipher cipher;
        private SecretKeySpec hmacKeySpec;
        private SecretKeySpec keySpec;
        private Mac mac;
        private byte[] noncePrefix;

        AesCtrHmacStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(ByteBuffer header, byte[] aad) throws GeneralSecurityException {
            if (header.remaining() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (header.get() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.noncePrefix = new byte[7];
            byte[] bArr = new byte[AesCtrHmacStreaming.this.keySizeInBytes];
            header.get(bArr);
            header.get(this.noncePrefix);
            byte[] deriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(bArr, aad);
            this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(deriveKeyMaterial);
            this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(deriveKeyMaterial);
            this.cipher = AesCtrHmacStreaming.cipherInstance();
            this.mac = AesCtrHmacStreaming.this.macInstance();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(ByteBuffer ciphertext, int segmentNr, boolean isLastSegment, ByteBuffer plaintext) throws GeneralSecurityException {
            int position = ciphertext.position();
            byte[] nonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, segmentNr, isLastSegment);
            int remaining = ciphertext.remaining();
            if (remaining >= AesCtrHmacStreaming.this.tagSizeInBytes) {
                int i = position + (remaining - AesCtrHmacStreaming.this.tagSizeInBytes);
                ByteBuffer duplicate = ciphertext.duplicate();
                duplicate.limit(i);
                ByteBuffer duplicate2 = ciphertext.duplicate();
                duplicate2.position(i);
                this.mac.init(this.hmacKeySpec);
                this.mac.update(nonceForSegment);
                this.mac.update(duplicate);
                byte[] copyOf = Arrays.copyOf(this.mac.doFinal(), AesCtrHmacStreaming.this.tagSizeInBytes);
                byte[] bArr = new byte[AesCtrHmacStreaming.this.tagSizeInBytes];
                duplicate2.get(bArr);
                if (!Bytes.equal(bArr, copyOf)) {
                    throw new GeneralSecurityException("Tag mismatch");
                }
                ciphertext.limit(i);
                this.cipher.init(1, this.keySpec, new IvParameterSpec(nonceForSegment));
                this.cipher.doFinal(ciphertext, plaintext);
            } else {
                throw new GeneralSecurityException("Ciphertext too short");
            }
        }
    }
}

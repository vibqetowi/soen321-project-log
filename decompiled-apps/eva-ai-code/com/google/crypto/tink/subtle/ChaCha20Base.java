package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes7.dex */
abstract class ChaCha20Base implements IndCpaCipher {
    public static final int BLOCK_SIZE_IN_BYTES = 64;
    public static final int BLOCK_SIZE_IN_INTS = 16;
    public static final int KEY_SIZE_IN_BYTES = 32;
    public static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    private final int initialCounter;
    int[] key;

    private static int rotateLeft(int x, int y) {
        return (x >>> (-y)) | (x << y);
    }

    abstract int[] createInitialState(final int[] nonce, int counter);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int nonceSizeInBytes();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChaCha20Base(final byte[] key, int initialCounter) throws InvalidKeyException {
        if (key.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.key = toIntArray(key);
        this.initialCounter = initialCounter;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(final byte[] plaintext) throws GeneralSecurityException {
        if (plaintext.length > Integer.MAX_VALUE - nonceSizeInBytes()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(nonceSizeInBytes() + plaintext.length);
        encrypt(allocate, plaintext);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void encrypt(ByteBuffer output, final byte[] plaintext) throws GeneralSecurityException {
        if (output.remaining() - nonceSizeInBytes() < plaintext.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] randBytes = Random.randBytes(nonceSizeInBytes());
        output.put(randBytes);
        process(randBytes, output, ByteBuffer.wrap(plaintext));
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(final byte[] ciphertext) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(ciphertext));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] decrypt(ByteBuffer ciphertext) throws GeneralSecurityException {
        if (ciphertext.remaining() < nonceSizeInBytes()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[nonceSizeInBytes()];
        ciphertext.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(ciphertext.remaining());
        process(bArr, allocate, ciphertext);
        return allocate.array();
    }

    private void process(final byte[] nonce, ByteBuffer output, ByteBuffer input) throws GeneralSecurityException {
        int remaining = input.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer chacha20Block = chacha20Block(nonce, this.initialCounter + i2);
            if (i2 == i - 1) {
                Bytes.xor(output, input, chacha20Block, remaining % 64);
            } else {
                Bytes.xor(output, input, chacha20Block, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer chacha20Block(final byte[] nonce, int counter) {
        int[] createInitialState = createInitialState(toIntArray(nonce), counter);
        int[] iArr = (int[]) createInitialState.clone();
        shuffleState(iArr);
        for (int i = 0; i < createInitialState.length; i++) {
            createInitialState[i] = createInitialState[i] + iArr[i];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(createInitialState, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSigmaAndKey(int[] state, final int[] key) {
        int[] iArr = SIGMA;
        System.arraycopy(iArr, 0, state, 0, iArr.length);
        System.arraycopy(key, 0, state, iArr.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void shuffleState(final int[] state) {
        for (int i = 0; i < 10; i++) {
            quarterRound(state, 0, 4, 8, 12);
            quarterRound(state, 1, 5, 9, 13);
            quarterRound(state, 2, 6, 10, 14);
            quarterRound(state, 3, 7, 11, 15);
            quarterRound(state, 0, 5, 10, 15);
            quarterRound(state, 1, 6, 11, 12);
            quarterRound(state, 2, 7, 8, 13);
            quarterRound(state, 3, 4, 9, 14);
        }
    }

    static void quarterRound(int[] x, int a, int b, int c, int d) {
        int i = x[a] + x[b];
        x[a] = i;
        int rotateLeft = rotateLeft(i ^ x[d], 16);
        x[d] = rotateLeft;
        int i2 = x[c] + rotateLeft;
        x[c] = i2;
        int rotateLeft2 = rotateLeft(x[b] ^ i2, 12);
        x[b] = rotateLeft2;
        int i3 = x[a] + rotateLeft2;
        x[a] = i3;
        int rotateLeft3 = rotateLeft(x[d] ^ i3, 8);
        x[d] = rotateLeft3;
        int i4 = x[c] + rotateLeft3;
        x[c] = i4;
        x[b] = rotateLeft(x[b] ^ i4, 7);
    }

    static int[] toIntArray(final byte[] input) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(input).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}

package com.google.crypto.tink.subtle;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.crypto.tink.Aead;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;
    private final byte[] b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;
    private final byte[] p;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };

    public AesEaxJce(final byte[] key, int ivSizeInBytes) throws GeneralSecurityException {
        if (ivSizeInBytes != 12 && ivSizeInBytes != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.ivSizeInBytes = ivSizeInBytes;
        Validators.validateAesKeySize(key.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, CipherStorageKeystoreAesCbc.ALGORITHM_AES);
        this.keySpec = secretKeySpec;
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, secretKeySpec);
        byte[] multiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
        this.b = multiplyByX;
        this.p = multiplyByX(multiplyByX);
    }

    private static byte[] xor(final byte[] x, final byte[] y) {
        int length = x.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (x[i] ^ y[i]);
        }
        return bArr;
    }

    private static byte[] multiplyByX(final byte[] block) {
        byte[] bArr = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr[i] = (byte) (((block[i] << 1) ^ ((block[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr[15] = (byte) ((block[15] << 1) ^ ((block[0] & 128) != 0 ? TsExtractor.TS_STREAM_TYPE_E_AC3 : 0));
        return bArr;
    }

    private byte[] pad(final byte[] data) {
        if (data.length == 16) {
            return xor(data, this.b);
        }
        byte[] copyOf = Arrays.copyOf(this.p, 16);
        for (int i = 0; i < data.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ data[i]);
        }
        copyOf[data.length] = (byte) (copyOf[data.length] ^ 128);
        return copyOf;
    }

    private byte[] omac(Cipher ecb, int tag, final byte[] data, int offset, int length) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr = new byte[16];
        bArr[15] = (byte) tag;
        if (length == 0) {
            return ecb.doFinal(xor(bArr, this.b));
        }
        byte[] doFinal = ecb.doFinal(bArr);
        int i = 0;
        while (length - i > 16) {
            for (int i2 = 0; i2 < 16; i2++) {
                doFinal[i2] = (byte) (doFinal[i2] ^ data[(offset + i) + i2]);
            }
            doFinal = ecb.doFinal(doFinal);
            i += 16;
        }
        return ecb.doFinal(xor(doFinal, pad(Arrays.copyOfRange(data, i + offset, offset + length))));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        int length = plaintext.length;
        int i = this.ivSizeInBytes;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr = new byte[plaintext.length + i + 16];
        byte[] randBytes = Random.randBytes(i);
        System.arraycopy(randBytes, 0, bArr, 0, this.ivSizeInBytes);
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] omac = omac(cipher, 0, randBytes, 0, randBytes.length);
        byte[] bArr2 = associatedData == null ? new byte[0] : associatedData;
        byte[] omac2 = omac(cipher, 1, bArr2, 0, bArr2.length);
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
        cipher2.doFinal(plaintext, 0, plaintext.length, bArr, this.ivSizeInBytes);
        byte[] omac3 = omac(cipher, 2, bArr, this.ivSizeInBytes, plaintext.length);
        int length2 = plaintext.length + this.ivSizeInBytes;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[length2 + i2] = (byte) ((omac2[i2] ^ omac[i2]) ^ omac3[i2]);
        }
        return bArr;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = (ciphertext.length - this.ivSizeInBytes) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] omac = omac(cipher, 0, ciphertext, 0, this.ivSizeInBytes);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        byte[] bArr = associatedData;
        byte[] omac2 = omac(cipher, 1, bArr, 0, bArr.length);
        byte[] omac3 = omac(cipher, 2, ciphertext, this.ivSizeInBytes, length);
        int length2 = ciphertext.length - 16;
        byte b = 0;
        for (int i = 0; i < 16; i++) {
            b = (byte) (b | (((ciphertext[length2 + i] ^ omac2[i]) ^ omac[i]) ^ omac3[i]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
        return cipher2.doFinal(ciphertext, this.ivSizeInBytes, length);
    }
}

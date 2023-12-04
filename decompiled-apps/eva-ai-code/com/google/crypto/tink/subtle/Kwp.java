package com.google.crypto.tink.subtle;

import com.google.crypto.tink.KeyWrap;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public class Kwp implements KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = {-90, 89, 89, -90};
    static final int ROUNDS = 6;
    private final SecretKey aesKey;

    public Kwp(final byte[] key) throws GeneralSecurityException {
        if (key.length != 16 && key.length != 32) {
            throw new GeneralSecurityException("Unsupported key length");
        }
        this.aesKey = new SecretKeySpec(key, CipherStorageKeystoreAesCbc.ALGORITHM_AES);
    }

    private int wrappingSize(int inputSize) {
        return inputSize + (7 - ((inputSize + 7) % 8)) + 8;
    }

    private byte[] computeW(final byte[] iv, final byte[] key) throws GeneralSecurityException {
        if (key.length <= 8 || key.length > 2147483631 || iv.length != 8) {
            throw new GeneralSecurityException("computeW called with invalid parameters");
        }
        int wrappingSize = wrappingSize(key.length);
        byte[] bArr = new byte[wrappingSize];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, bArr, 8, key.length);
        int i = 1;
        int i2 = (wrappingSize / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.aesKey);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        int i3 = 0;
        while (i3 < 6) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 * 8;
                System.arraycopy(bArr, i6, bArr2, 8, 8);
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                int i7 = (i3 * i2) + i4 + i;
                for (int i8 = 0; i8 < 4; i8++) {
                    int i9 = 7 - i8;
                    bArr2[i9] = (byte) (((byte) (i7 & 255)) ^ bArr2[i9]);
                    i7 >>>= 8;
                }
                System.arraycopy(bArr2, 8, bArr, i6, 8);
                i4 = i5;
                i = 1;
            }
            i3++;
            i = 1;
        }
        System.arraycopy(bArr2, 0, bArr, 0, 8);
        return bArr;
    }

    private byte[] invertW(final byte[] wrapped) throws GeneralSecurityException {
        if (wrapped.length < 24 || wrapped.length % 8 != 0) {
            throw new GeneralSecurityException("Incorrect data size");
        }
        byte[] copyOf = Arrays.copyOf(wrapped, wrapped.length);
        int length = (copyOf.length / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.aesKey);
        byte[] bArr = new byte[16];
        System.arraycopy(copyOf, 0, bArr, 0, 8);
        for (int i = 5; i >= 0; i--) {
            for (int i2 = length - 1; i2 >= 0; i2--) {
                int i3 = (i2 + 1) * 8;
                System.arraycopy(copyOf, i3, bArr, 8, 8);
                int i4 = (i * length) + i2 + 1;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = 7 - i5;
                    bArr[i6] = (byte) (bArr[i6] ^ ((byte) (i4 & 255)));
                    i4 >>>= 8;
                }
                engineFactory.doFinal(bArr, 0, 16, bArr);
                System.arraycopy(bArr, 8, copyOf, i3, 8);
            }
        }
        System.arraycopy(bArr, 0, copyOf, 0, 8);
        return copyOf;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(final byte[] data) throws GeneralSecurityException {
        if (data.length < 16) {
            throw new GeneralSecurityException("Key size of key to wrap too small");
        }
        if (data.length > 4096) {
            throw new GeneralSecurityException("Key size of key to wrap too large");
        }
        byte[] bArr = new byte[8];
        byte[] bArr2 = PREFIX;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        for (int i = 0; i < 4; i++) {
            bArr[i + 4] = (byte) ((data.length >> ((3 - i) * 8)) & 255);
        }
        return computeW(bArr, data);
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(final byte[] data) throws GeneralSecurityException {
        int i;
        if (data.length < wrappingSize(16)) {
            throw new GeneralSecurityException("Wrapped key size is too small");
        }
        if (data.length > wrappingSize(4096)) {
            throw new GeneralSecurityException("Wrapped key size is too large");
        }
        if (data.length % 8 != 0) {
            throw new GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
        }
        byte[] invertW = invertW(data);
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (PREFIX[i2] != invertW[i2]) {
                z = false;
            }
            i2++;
        }
        int i3 = 0;
        for (i = 4; i < 8; i++) {
            i3 = (i3 << 8) + (invertW[i] & 255);
        }
        if (wrappingSize(i3) == invertW.length) {
            for (int i4 = i3 + 8; i4 < invertW.length; i4++) {
                if (invertW[i4] != 0) {
                    z = false;
                }
            }
            z2 = z;
        }
        if (z2) {
            return Arrays.copyOfRange(invertW, 8, i3 + 8);
        }
        throw new BadPaddingException("Invalid padding");
    }
}

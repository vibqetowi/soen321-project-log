package com.google.crypto.tink.hybrid.subtle;

import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
/* loaded from: classes7.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = new byte[0];
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    private RsaKem() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateRsaModulus(BigInteger mod) throws GeneralSecurityException {
        if (mod.bitLength() < 2048) {
            throw new GeneralSecurityException(String.format("RSA key must be of at least size %d bits, but got %d", 2048, Integer.valueOf(mod.bitLength())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int bigIntSizeInBytes(BigInteger mod) {
        return (mod.bitLength() + 7) / 8;
    }

    static byte[] bigIntToByteArray(BigInteger bigInt, int size) {
        byte[] byteArray = bigInt.toByteArray();
        if (byteArray.length == size) {
            return byteArray;
        }
        byte[] bArr = new byte[size];
        if (byteArray.length == size + 1) {
            if (byteArray[0] != 0) {
                throw new IllegalArgumentException("Value is one-byte longer than the expected size, but its first byte is not 0");
            }
            System.arraycopy(byteArray, 1, bArr, 0, size);
        } else if (byteArray.length < size) {
            System.arraycopy(byteArray, 0, bArr, size - byteArray.length, byteArray.length);
        } else {
            throw new IllegalArgumentException(String.format("Value has invalid length, must be of length at most (%d + 1), but got %d", Integer.valueOf(size), Integer.valueOf(byteArray.length)));
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] generateSecret(BigInteger max) {
        int bigIntSizeInBytes = bigIntSizeInBytes(max);
        SecureRandom secureRandom = new SecureRandom();
        while (true) {
            BigInteger bigInteger = new BigInteger(max.bitLength(), secureRandom);
            if (bigInteger.signum() > 0 && bigInteger.compareTo(max) < 0) {
                return bigIntToByteArray(bigInteger, bigIntSizeInBytes);
            }
        }
    }

    static KeyPair generateRsaKeyPair(int keySize) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
            keyPairGenerator.initialize(keySize);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No support for RSA algorithm.", e);
        }
    }
}

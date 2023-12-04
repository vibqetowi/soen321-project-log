package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class Hkdf {
    public static byte[] computeHkdf(String macAlgorithm, final byte[] ikm, final byte[] salt, final byte[] info, int size) throws GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance(macAlgorithm);
        if (size > engineFactory.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (salt == null || salt.length == 0) {
            engineFactory.init(new SecretKeySpec(new byte[engineFactory.getMacLength()], macAlgorithm));
        } else {
            engineFactory.init(new SecretKeySpec(salt, macAlgorithm));
        }
        byte[] bArr = new byte[size];
        engineFactory.init(new SecretKeySpec(engineFactory.doFinal(ikm), macAlgorithm));
        byte[] bArr2 = new byte[0];
        int i = 1;
        int i2 = 0;
        while (true) {
            engineFactory.update(bArr2);
            engineFactory.update(info);
            engineFactory.update((byte) i);
            bArr2 = engineFactory.doFinal();
            if (bArr2.length + i2 < size) {
                System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                i2 += bArr2.length;
                i++;
            } else {
                System.arraycopy(bArr2, 0, bArr, i2, size - i2);
                return bArr;
            }
        }
    }

    public static byte[] computeEciesHkdfSymmetricKey(final byte[] ephemeralPublicKeyBytes, final byte[] sharedSecret, String hmacAlgo, final byte[] hkdfSalt, final byte[] hkdfInfo, int keySizeInBytes) throws GeneralSecurityException {
        return computeHkdf(hmacAlgo, Bytes.concat(ephemeralPublicKeyBytes, sharedSecret), hkdfSalt, hkdfInfo, keySizeInBytes);
    }
}

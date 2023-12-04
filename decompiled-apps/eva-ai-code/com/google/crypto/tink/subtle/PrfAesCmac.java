package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
@Immutable
/* loaded from: classes7.dex */
public final class PrfAesCmac implements Prf {
    private final SecretKey keySpec;
    private byte[] subKey1;
    private byte[] subKey2;

    private static Cipher instance() throws GeneralSecurityException {
        return EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
    }

    public PrfAesCmac(final byte[] key) throws GeneralSecurityException {
        Validators.validateAesKeySize(key.length);
        this.keySpec = new SecretKeySpec(key, CipherStorageKeystoreAesCbc.ALGORITHM_AES);
        generateSubKeys();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(final byte[] data, int outputLength) throws GeneralSecurityException {
        byte[] xor;
        if (outputLength > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher instance = instance();
        instance.init(1, this.keySpec);
        int max = Math.max(1, (int) Math.ceil(data.length / 16.0d));
        if (max * 16 == data.length) {
            xor = Bytes.xor(data, (max - 1) * 16, this.subKey1, 0, 16);
        } else {
            xor = Bytes.xor(AesUtil.cmacPad(Arrays.copyOfRange(data, (max - 1) * 16, data.length)), this.subKey2);
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr = instance.doFinal(Bytes.xor(bArr, 0, data, i * 16, 16));
        }
        return Arrays.copyOf(instance.doFinal(Bytes.xor(xor, bArr)), outputLength);
    }

    private void generateSubKeys() throws GeneralSecurityException {
        Cipher instance = instance();
        instance.init(1, this.keySpec);
        byte[] dbl = AesUtil.dbl(instance.doFinal(new byte[16]));
        this.subKey1 = dbl;
        this.subKey2 = AesUtil.dbl(dbl);
    }
}

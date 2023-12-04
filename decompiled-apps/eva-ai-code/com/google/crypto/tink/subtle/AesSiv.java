package com.google.crypto.tink.subtle;

import com.google.crypto.tink.DeterministicAead;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesSiv implements DeterministicAead {
    private final byte[] aesCtrKey;
    private final PrfAesCmac cmacForS2V;
    private static final Collection<Integer> KEY_SIZES = Arrays.asList(64);
    private static final byte[] BLOCK_ZERO = new byte[16];
    private static final byte[] BLOCK_ONE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public AesSiv(final byte[] key) throws GeneralSecurityException {
        if (!KEY_SIZES.contains(Integer.valueOf(key.length))) {
            throw new InvalidKeyException("invalid key size: " + key.length + " bytes; key must have 64 bytes");
        }
        byte[] copyOfRange = Arrays.copyOfRange(key, 0, key.length / 2);
        this.aesCtrKey = Arrays.copyOfRange(key, key.length / 2, key.length);
        this.cmacForS2V = new PrfAesCmac(copyOfRange);
    }

    private byte[] s2v(final byte[]... s) throws GeneralSecurityException {
        byte[] xor;
        if (s.length == 0) {
            return this.cmacForS2V.compute(BLOCK_ONE, 16);
        }
        byte[] compute = this.cmacForS2V.compute(BLOCK_ZERO, 16);
        for (int i = 0; i < s.length - 1; i++) {
            byte[] bArr = s[i];
            if (bArr == null) {
                bArr = new byte[0];
            }
            compute = Bytes.xor(AesUtil.dbl(compute), this.cmacForS2V.compute(bArr, 16));
        }
        byte[] bArr2 = s[s.length - 1];
        if (bArr2.length >= 16) {
            xor = Bytes.xorEnd(bArr2, compute);
        } else {
            xor = Bytes.xor(AesUtil.cmacPad(bArr2), AesUtil.dbl(compute));
        }
        return this.cmacForS2V.compute(xor, 16);
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] encryptDeterministically(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
        byte[] s2v = s2v(associatedData, plaintext);
        byte[] bArr = (byte[]) s2v.clone();
        bArr[8] = (byte) (bArr[8] & Byte.MAX_VALUE);
        bArr[12] = (byte) (bArr[12] & Byte.MAX_VALUE);
        engineFactory.init(1, new SecretKeySpec(this.aesCtrKey, CipherStorageKeystoreAesCbc.ALGORITHM_AES), new IvParameterSpec(bArr));
        return Bytes.concat(s2v, engineFactory.doFinal(plaintext));
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] decryptDeterministically(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(ciphertext, 0, 16);
        byte[] bArr = (byte[]) copyOfRange.clone();
        bArr[8] = (byte) (bArr[8] & Byte.MAX_VALUE);
        bArr[12] = (byte) (bArr[12] & Byte.MAX_VALUE);
        engineFactory.init(2, new SecretKeySpec(this.aesCtrKey, CipherStorageKeystoreAesCbc.ALGORITHM_AES), new IvParameterSpec(bArr));
        byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, 16, ciphertext.length);
        byte[] doFinal = engineFactory.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && SubtleUtil.isAndroid()) {
            doFinal = new byte[0];
        }
        if (Bytes.equal(copyOfRange, s2v(associatedData, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}

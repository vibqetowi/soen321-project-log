package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.subtle.Enums;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
/* loaded from: classes7.dex */
public final class RsaSsaPssSignJce implements PublicKeySign {
    private static final String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
    private final Enums.HashType mgf1Hash;
    private final RSAPrivateCrtKey privateKey;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssSignJce(final RSAPrivateCrtKey priv, Enums.HashType sigHash, Enums.HashType mgf1Hash, int saltLength) throws GeneralSecurityException {
        Validators.validateSignatureHash(sigHash);
        Validators.validateRsaModulusSize(priv.getModulus().bitLength());
        Validators.validateRsaPublicExponent(priv.getPublicExponent());
        this.privateKey = priv;
        this.publicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA).generatePublic(new RSAPublicKeySpec(priv.getModulus(), priv.getPublicExponent()));
        this.sigHash = sigHash;
        this.mgf1Hash = mgf1Hash;
        this.saltLength = saltLength;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(final byte[] data) throws GeneralSecurityException {
        return rsasp1(emsaPssEncode(data, this.publicKey.getModulus().bitLength() - 1));
    }

    private byte[] rsasp1(byte[] m) throws GeneralSecurityException {
        Cipher engineFactory = EngineFactory.CIPHER.getInstance(RAW_RSA_ALGORITHM);
        engineFactory.init(2, this.privateKey);
        byte[] doFinal = engineFactory.doFinal(m);
        Cipher engineFactory2 = EngineFactory.CIPHER.getInstance(RAW_RSA_ALGORITHM);
        engineFactory2.init(1, this.publicKey);
        if (new BigInteger(1, m).equals(new BigInteger(1, engineFactory2.doFinal(doFinal)))) {
            return doFinal;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    private byte[] emsaPssEncode(byte[] m, int emBits) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] digest = engineFactory.digest(m);
        int digestLength = engineFactory.getDigestLength();
        int i = ((emBits - 1) / 8) + 1;
        int i2 = this.saltLength;
        if (i < digestLength + i2 + 2) {
            throw new GeneralSecurityException("encoding error");
        }
        byte[] randBytes = Random.randBytes(i2);
        int i3 = digestLength + 8;
        byte[] bArr = new byte[this.saltLength + i3];
        System.arraycopy(digest, 0, bArr, 8, digestLength);
        System.arraycopy(randBytes, 0, bArr, i3, randBytes.length);
        byte[] digest2 = engineFactory.digest(bArr);
        int i4 = (i - digestLength) - 1;
        byte[] bArr2 = new byte[i4];
        int i5 = this.saltLength;
        bArr2[((i - i5) - digestLength) - 2] = 1;
        System.arraycopy(randBytes, 0, bArr2, ((i - i5) - digestLength) - 1, randBytes.length);
        byte[] mgf1 = SubtleUtil.mgf1(digest2, i4, this.mgf1Hash);
        byte[] bArr3 = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr3[i6] = (byte) (bArr2[i6] ^ mgf1[i6]);
        }
        for (int i7 = 0; i7 < (i * 8) - emBits; i7++) {
            int i8 = i7 / 8;
            bArr3[i8] = (byte) ((~(1 << (7 - (i7 % 8)))) & bArr3[i8]);
        }
        int i9 = digestLength + i4;
        byte[] bArr4 = new byte[i9 + 1];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        System.arraycopy(digest2, 0, bArr4, i4, digest2.length);
        bArr4[i9] = -68;
        return bArr4;
    }
}

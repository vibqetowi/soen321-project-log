package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.subtle.Enums;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* loaded from: classes7.dex */
public final class RsaSsaPkcs1SignJce implements PublicKeySign {
    private final RSAPrivateCrtKey privateKey;
    private final RSAPublicKey publicKey;
    private final String signatureAlgorithm;

    public RsaSsaPkcs1SignJce(final RSAPrivateCrtKey priv, Enums.HashType hash) throws GeneralSecurityException {
        Validators.validateSignatureHash(hash);
        Validators.validateRsaModulusSize(priv.getModulus().bitLength());
        Validators.validateRsaPublicExponent(priv.getPublicExponent());
        this.privateKey = priv;
        this.signatureAlgorithm = SubtleUtil.toRsaSsaPkcs1Algo(hash);
        this.publicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA).generatePublic(new RSAPublicKeySpec(priv.getModulus(), priv.getPublicExponent()));
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(final byte[] data) throws GeneralSecurityException {
        Signature engineFactory = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory.initSign(this.privateKey);
        engineFactory.update(data);
        byte[] sign = engineFactory.sign();
        Signature engineFactory2 = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory2.initVerify(this.publicKey);
        engineFactory2.update(data);
        if (engineFactory2.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}

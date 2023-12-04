package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes7.dex */
public final class EcdsaVerifyJce implements PublicKeyVerify {
    private final EllipticCurves.EcdsaEncoding encoding;
    private final ECPublicKey publicKey;
    private final String signatureAlgorithm;

    public EcdsaVerifyJce(final ECPublicKey pubKey, Enums.HashType hash, EllipticCurves.EcdsaEncoding encoding) throws GeneralSecurityException {
        EllipticCurves.checkPublicKey(pubKey);
        this.signatureAlgorithm = SubtleUtil.toEcdsaAlgo(hash);
        this.publicKey = pubKey;
        this.encoding = encoding;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
        boolean z;
        if (this.encoding == EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            if (signature.length != EllipticCurves.fieldSizeInBytes(this.publicKey.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            signature = EllipticCurves.ecdsaIeee2Der(signature);
        }
        if (!EllipticCurves.isValidDerEncoding(signature)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature engineFactory = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory.initVerify(this.publicKey);
        engineFactory.update(data);
        try {
            z = engineFactory.verify(signature);
        } catch (RuntimeException unused) {
            z = false;
        }
        if (!z) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}

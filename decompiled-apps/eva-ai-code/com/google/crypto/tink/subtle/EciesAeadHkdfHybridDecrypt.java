package com.google.crypto.tink.subtle;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;
/* loaded from: classes7.dex */
public final class EciesAeadHkdfHybridDecrypt implements HybridDecrypt {
    private static final byte[] EMPTY_AAD = new byte[0];
    private final EciesAeadHkdfDemHelper demHelper;
    private final EllipticCurves.PointFormatType ecPointFormat;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final EciesHkdfRecipientKem recipientKem;
    private final ECPrivateKey recipientPrivateKey;

    public EciesAeadHkdfHybridDecrypt(final ECPrivateKey recipientPrivateKey, final byte[] hkdfSalt, String hkdfHmacAlgo, EllipticCurves.PointFormatType ecPointFormat, EciesAeadHkdfDemHelper demHelper) throws GeneralSecurityException {
        this.recipientPrivateKey = recipientPrivateKey;
        this.recipientKem = new EciesHkdfRecipientKem(recipientPrivateKey);
        this.hkdfSalt = hkdfSalt;
        this.hkdfHmacAlgo = hkdfHmacAlgo;
        this.ecPointFormat = ecPointFormat;
        this.demHelper = demHelper;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(final byte[] ciphertext, final byte[] contextInfo) throws GeneralSecurityException {
        int encodingSizeInBytes = EllipticCurves.encodingSizeInBytes(this.recipientPrivateKey.getParams().getCurve(), this.ecPointFormat);
        if (ciphertext.length < encodingSizeInBytes) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.demHelper.getAead(this.recipientKem.generateKey(Arrays.copyOfRange(ciphertext, 0, encodingSizeInBytes), this.hkdfHmacAlgo, this.hkdfSalt, contextInfo, this.demHelper.getSymmetricKeySizeInBytes(), this.ecPointFormat)).decrypt(Arrays.copyOfRange(ciphertext, encodingSizeInBytes, ciphertext.length), EMPTY_AAD);
    }
}

package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
/* loaded from: classes7.dex */
public final class EciesHkdfRecipientKem {
    private ECPrivateKey recipientPrivateKey;

    public EciesHkdfRecipientKem(final ECPrivateKey recipientPrivateKey) {
        this.recipientPrivateKey = recipientPrivateKey;
    }

    public byte[] generateKey(byte[] kemBytes, String hmacAlgo, final byte[] hkdfSalt, final byte[] hkdfInfo, int keySizeInBytes, EllipticCurves.PointFormatType pointFormat) throws GeneralSecurityException {
        return Hkdf.computeEciesHkdfSymmetricKey(kemBytes, EllipticCurves.computeSharedSecret(this.recipientPrivateKey, EllipticCurves.getEcPublicKey(this.recipientPrivateKey.getParams(), pointFormat, kemBytes)), hmacAlgo, hkdfSalt, hkdfInfo, keySizeInBytes);
    }
}

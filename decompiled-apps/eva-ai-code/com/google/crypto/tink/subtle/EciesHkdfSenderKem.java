package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes7.dex */
public final class EciesHkdfSenderKem {
    private ECPublicKey recipientPublicKey;

    /* loaded from: classes7.dex */
    public static final class KemKey {
        private final ImmutableByteArray kemBytes;
        private final ImmutableByteArray symmetricKey;

        public KemKey(final byte[] kemBytes, final byte[] symmetricKey) {
            this.kemBytes = ImmutableByteArray.of(kemBytes);
            this.symmetricKey = ImmutableByteArray.of(symmetricKey);
        }

        public byte[] getKemBytes() {
            ImmutableByteArray immutableByteArray = this.kemBytes;
            if (immutableByteArray == null) {
                return null;
            }
            return immutableByteArray.getBytes();
        }

        public byte[] getSymmetricKey() {
            ImmutableByteArray immutableByteArray = this.symmetricKey;
            if (immutableByteArray == null) {
                return null;
            }
            return immutableByteArray.getBytes();
        }
    }

    public EciesHkdfSenderKem(final ECPublicKey recipientPublicKey) {
        this.recipientPublicKey = recipientPublicKey;
    }

    public KemKey generateKey(String hmacAlgo, final byte[] hkdfSalt, final byte[] hkdfInfo, int keySizeInBytes, EllipticCurves.PointFormatType pointFormat) throws GeneralSecurityException {
        KeyPair generateKeyPair = EllipticCurves.generateKeyPair(this.recipientPublicKey.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        byte[] computeSharedSecret = EllipticCurves.computeSharedSecret((ECPrivateKey) generateKeyPair.getPrivate(), this.recipientPublicKey);
        byte[] pointEncode = EllipticCurves.pointEncode(eCPublicKey.getParams().getCurve(), pointFormat, eCPublicKey.getW());
        return new KemKey(pointEncode, Hkdf.computeEciesHkdfSymmetricKey(pointEncode, computeSharedSecret, hmacAlgo, hkdfSalt, hkdfInfo, keySizeInBytes));
    }
}

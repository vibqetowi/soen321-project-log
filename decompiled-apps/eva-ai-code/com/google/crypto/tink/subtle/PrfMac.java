package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
@Immutable
/* loaded from: classes7.dex */
public class PrfMac implements Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private final int tagSize;
    private final Prf wrappedPrf;

    public PrfMac(Prf wrappedPrf, int tagSize) throws GeneralSecurityException {
        this.wrappedPrf = wrappedPrf;
        this.tagSize = tagSize;
        if (tagSize < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        wrappedPrf.compute(new byte[0], tagSize);
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] data) throws GeneralSecurityException {
        return this.wrappedPrf.compute(data, this.tagSize);
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] mac, byte[] data) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(data), mac)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}

package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Map;
@Immutable
/* loaded from: classes7.dex */
public abstract class PrfSet {
    public abstract Map<Integer, Prf> getPrfs() throws GeneralSecurityException;

    public abstract int getPrimaryId();

    public byte[] computePrimary(byte[] input, int outputLength) throws GeneralSecurityException {
        return getPrfs().get(Integer.valueOf(getPrimaryId())).compute(input, outputLength);
    }
}

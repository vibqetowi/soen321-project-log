package com.google.crypto.tink;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface Mac {
    byte[] computeMac(final byte[] data) throws GeneralSecurityException;

    void verifyMac(final byte[] mac, final byte[] data) throws GeneralSecurityException;
}

package com.google.crypto.tink;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface PublicKeySign {
    byte[] sign(final byte[] data) throws GeneralSecurityException;
}

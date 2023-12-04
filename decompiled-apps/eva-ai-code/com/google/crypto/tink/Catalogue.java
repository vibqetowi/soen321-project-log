package com.google.crypto.tink;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes7.dex */
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String typeUrl, String primitiveName, int minVersion) throws GeneralSecurityException;

    PrimitiveWrapper<?, P> getPrimitiveWrapper() throws GeneralSecurityException;
}

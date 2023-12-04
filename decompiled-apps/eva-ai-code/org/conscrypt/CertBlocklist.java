package org.conscrypt;

import java.math.BigInteger;
import java.security.PublicKey;
/* loaded from: classes5.dex */
public interface CertBlocklist {
    boolean isPublicKeyBlockListed(PublicKey publicKey);

    boolean isSerialNumberBlockListed(BigInteger bigInteger);
}

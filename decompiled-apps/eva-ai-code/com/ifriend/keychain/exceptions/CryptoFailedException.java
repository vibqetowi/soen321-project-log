package com.ifriend.keychain.exceptions;

import java.security.GeneralSecurityException;
/* loaded from: classes6.dex */
public class CryptoFailedException extends GeneralSecurityException {
    public CryptoFailedException(String str) {
        super(str);
    }

    public CryptoFailedException(String str, Throwable th) {
        super(str, th);
    }

    public static void reThrowOnError(Throwable th) throws CryptoFailedException {
        if (th == null) {
            return;
        }
        if (th instanceof CryptoFailedException) {
            throw ((CryptoFailedException) th);
        }
        throw new CryptoFailedException("Wrapped error: " + th.getMessage(), th);
    }
}

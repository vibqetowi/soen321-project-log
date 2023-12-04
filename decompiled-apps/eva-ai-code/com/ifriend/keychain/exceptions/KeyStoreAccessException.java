package com.ifriend.keychain.exceptions;

import java.security.GeneralSecurityException;
/* loaded from: classes6.dex */
public class KeyStoreAccessException extends GeneralSecurityException {
    public KeyStoreAccessException(String str) {
        super(str);
    }

    public KeyStoreAccessException(String str, Throwable th) {
        super(str, th);
    }
}

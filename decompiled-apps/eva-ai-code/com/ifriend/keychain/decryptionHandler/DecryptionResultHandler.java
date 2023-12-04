package com.ifriend.keychain.decryptionHandler;

import com.ifriend.keychain.cipherStorage.CipherStorage;
/* loaded from: classes6.dex */
public interface DecryptionResultHandler {
    void askAccessPermissions(CipherStorage.DecryptionContext decryptionContext);

    Throwable getError();

    CipherStorage.DecryptionResult getResult();

    void onDecrypt(CipherStorage.DecryptionResult decryptionResult, Throwable th);

    void waitResult() throws Exception;
}

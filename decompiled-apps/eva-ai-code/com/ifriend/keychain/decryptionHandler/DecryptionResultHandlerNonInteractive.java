package com.ifriend.keychain.decryptionHandler;

import com.ifriend.keychain.cipherStorage.CipherStorage;
import com.ifriend.keychain.exceptions.CryptoFailedException;
/* loaded from: classes6.dex */
public class DecryptionResultHandlerNonInteractive implements DecryptionResultHandler {
    private Throwable error;
    private CipherStorage.DecryptionResult result;

    @Override // com.ifriend.keychain.decryptionHandler.DecryptionResultHandler
    public void waitResult() {
    }

    @Override // com.ifriend.keychain.decryptionHandler.DecryptionResultHandler
    public void askAccessPermissions(CipherStorage.DecryptionContext decryptionContext) {
        onDecrypt(null, new CryptoFailedException("Non interactive decryption mode."));
    }

    @Override // com.ifriend.keychain.decryptionHandler.DecryptionResultHandler
    public void onDecrypt(CipherStorage.DecryptionResult decryptionResult, Throwable th) {
        this.result = decryptionResult;
        this.error = th;
    }

    @Override // com.ifriend.keychain.decryptionHandler.DecryptionResultHandler
    public CipherStorage.DecryptionResult getResult() {
        return this.result;
    }

    @Override // com.ifriend.keychain.decryptionHandler.DecryptionResultHandler
    public Throwable getError() {
        return this.error;
    }
}

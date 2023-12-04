package com.ifriend.keychain.cipherStorage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import com.facebook.android.crypto.keychain.AndroidConceal;
import com.facebook.android.crypto.keychain.SharedPrefsBackedKeyChain;
import com.facebook.crypto.Crypto;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.Entity;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.keychain.SecurityLevel;
import com.ifriend.keychain.cipherStorage.CipherStorage;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandler;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import java.security.GeneralSecurityException;
import java.security.Key;
/* loaded from: classes6.dex */
public class CipherStorageFacebookConceal extends CipherStorageBase {
    public static final String KEYCHAIN_DATA = "RN_KEYCHAIN";
    private final Crypto crypto;

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public String getCipherStorageName() {
        return KeychainModule.KnownCiphers.FB;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public int getMinSupportedApiLevel() {
        return 16;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public boolean isBiometrySupported() {
        return false;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase, com.ifriend.keychain.cipherStorage.CipherStorage
    public boolean supportsSecureHardware() {
        return false;
    }

    public CipherStorageFacebookConceal(Context context) {
        this.crypto = AndroidConceal.get().createDefaultCrypto(new SharedPrefsBackedKeyChain(context, CryptoConfig.KEY_256));
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase, com.ifriend.keychain.cipherStorage.CipherStorage
    public SecurityLevel securityLevel() {
        return SecurityLevel.ANY;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.EncryptionResult encrypt(String str, String str2, String str3, SecurityLevel securityLevel) throws CryptoFailedException {
        throwIfInsufficientLevel(securityLevel);
        throwIfNoCryptoAvailable();
        try {
            return new CipherStorage.EncryptionResult(this.crypto.encrypt(str2.getBytes(UTF8), createUsernameEntity(str)), this.crypto.encrypt(str3.getBytes(UTF8), createPasswordEntity(str)), this);
        } catch (Throwable th) {
            throw new CryptoFailedException("Encryption failed for alias: " + str, th);
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.DecryptionResult decrypt(String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException {
        throwIfInsufficientLevel(securityLevel);
        throwIfNoCryptoAvailable();
        Entity createUsernameEntity = createUsernameEntity(str);
        Entity createPasswordEntity = createPasswordEntity(str);
        try {
            return new CipherStorage.DecryptionResult(new String(this.crypto.decrypt(bArr, createUsernameEntity), UTF8), new String(this.crypto.decrypt(bArr2, createPasswordEntity), UTF8), SecurityLevel.ANY);
        } catch (Throwable th) {
            throw new CryptoFailedException("Decryption failed for alias: " + str, th);
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public void decrypt(DecryptionResultHandler decryptionResultHandler, String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) {
        try {
            decryptionResultHandler.onDecrypt(decrypt(str, bArr, bArr2, securityLevel), null);
        } catch (Throwable th) {
            decryptionResultHandler.onDecrypt(null, th);
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase, com.ifriend.keychain.cipherStorage.CipherStorage
    public void removeKey(String str) {
        String str2 = LOG_TAG;
        Log.w(str2, "CipherStorageFacebookConceal removeKey called. alias: " + str);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str) throws GeneralSecurityException {
        throw new CryptoFailedException("Not designed for a call");
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str, boolean z) throws GeneralSecurityException {
        throw new CryptoFailedException("Not designed for a call");
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyInfo getKeyInfo(Key key) throws GeneralSecurityException {
        throw new CryptoFailedException("Not designed for a call");
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected Key generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        throw new CryptoFailedException("Not designed for a call");
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionAlgorithm() throws Exception {
        throw new Exception("Not designed for a call");
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionTransformation() throws Exception {
        throw new Exception("Not designed for a call");
    }

    private void throwIfNoCryptoAvailable() throws CryptoFailedException {
        if (!this.crypto.isAvailable()) {
            throw new CryptoFailedException("Crypto is missing");
        }
    }

    private static Entity createUsernameEntity(String str) {
        String entityPrefix = getEntityPrefix(str);
        return Entity.create(entityPrefix + "user");
    }

    private static Entity createPasswordEntity(String str) {
        String entityPrefix = getEntityPrefix(str);
        return Entity.create(entityPrefix + "pass");
    }

    private static String getEntityPrefix(String str) {
        return "RN_KEYCHAIN:" + str;
    }
}

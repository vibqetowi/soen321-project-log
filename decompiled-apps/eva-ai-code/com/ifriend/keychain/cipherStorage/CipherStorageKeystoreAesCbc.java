package com.ifriend.keychain.cipherStorage;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.keychain.SecurityLevel;
import com.ifriend.keychain.cipherStorage.CipherStorage;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandler;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
/* loaded from: classes6.dex */
public class CipherStorageKeystoreAesCbc extends CipherStorageBase {
    public static final String ALGORITHM_AES = "AES";
    public static final String BLOCK_MODE_CBC = "CBC";
    public static final String DEFAULT_SERVICE = "RN_KEYCHAIN_DEFAULT_ALIAS";
    public static final int ENCRYPTION_KEY_SIZE = 256;
    public static final String ENCRYPTION_TRANSFORMATION = "AES/CBC/PKCS7Padding";
    public static final String PADDING_PKCS7 = "PKCS7Padding";

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public String getCipherStorageName() {
        return KeychainModule.KnownCiphers.AES;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase, com.ifriend.keychain.cipherStorage.CipherStorage
    public String getDefaultAliasServiceName() {
        return DEFAULT_SERVICE;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionAlgorithm() {
        return ALGORITHM_AES;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionTransformation() {
        return ENCRYPTION_TRANSFORMATION;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public int getMinSupportedApiLevel() {
        return 23;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public boolean isBiometrySupported() {
        return false;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase, com.ifriend.keychain.cipherStorage.CipherStorage
    public SecurityLevel securityLevel() {
        return SecurityLevel.SECURE_HARDWARE;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.EncryptionResult encrypt(String str, String str2, String str3, SecurityLevel securityLevel) throws CryptoFailedException {
        throwIfInsufficientLevel(securityLevel);
        try {
            Key extractGeneratedKey = extractGeneratedKey(getDefaultAliasIfEmpty(str, getDefaultAliasServiceName()), securityLevel, new AtomicInteger(1));
            return new CipherStorage.EncryptionResult(encryptString(extractGeneratedKey, str2), encryptString(extractGeneratedKey, str3), this);
        } catch (GeneralSecurityException e) {
            throw new CryptoFailedException("Could not encrypt data with alias: " + str, e);
        } catch (Throwable th) {
            throw new CryptoFailedException("Unknown error with alias: " + str + ", error: " + th.getMessage(), th);
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.DecryptionResult decrypt(String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException {
        throwIfInsufficientLevel(securityLevel);
        try {
            Key extractGeneratedKey = extractGeneratedKey(getDefaultAliasIfEmpty(str, getDefaultAliasServiceName()), securityLevel, new AtomicInteger(1));
            return new CipherStorage.DecryptionResult(decryptBytes(extractGeneratedKey, bArr), decryptBytes(extractGeneratedKey, bArr2), getSecurityLevel(extractGeneratedKey));
        } catch (GeneralSecurityException e) {
            throw new CryptoFailedException("Could not decrypt data with alias: " + str, e);
        } catch (Throwable th) {
            throw new CryptoFailedException("Unknown error with alias: " + str + ", error: " + th.getMessage(), th);
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

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str) throws GeneralSecurityException {
        return getKeyGenSpecBuilder(str, false);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str, boolean z) throws GeneralSecurityException {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes(BLOCK_MODE_CBC).setEncryptionPaddings(PADDING_PKCS7).setRandomizedEncryptionRequired(true).setKeySize(256);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyInfo getKeyInfo(Key key) throws GeneralSecurityException {
        return (KeyInfo) SecretKeyFactory.getInstance(key.getAlgorithm(), CipherStorageBase.KEYSTORE_TYPE).getKeySpec((SecretKey) key, KeyInfo.class);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected Key generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(getEncryptionAlgorithm(), CipherStorageBase.KEYSTORE_TYPE);
        keyGenerator.init(keyGenParameterSpec);
        return keyGenerator.generateKey();
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String decryptBytes(Key key, byte[] bArr, CipherStorageBase.DecryptBytesHandler decryptBytesHandler) throws GeneralSecurityException, IOException {
        Cipher cachedInstance = getCachedInstance();
        try {
            cachedInstance.init(2, key, CipherStorageBase.IV.readIv(bArr));
            return new String(cachedInstance.doFinal(bArr, 16, bArr.length - 16), UTF8);
        } catch (Throwable th) {
            Log.w(LOG_TAG, th.getMessage(), th);
            throw th;
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    public byte[] encryptString(Key key, String str) throws GeneralSecurityException, IOException {
        return encryptString(key, str, CipherStorageBase.IV.encrypt);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    public String decryptBytes(Key key, byte[] bArr) throws GeneralSecurityException, IOException {
        return decryptBytes(key, bArr, CipherStorageBase.IV.decrypt);
    }
}

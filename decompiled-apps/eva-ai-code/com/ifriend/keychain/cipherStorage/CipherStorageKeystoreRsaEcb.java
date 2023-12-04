package com.ifriend.keychain.cipherStorage;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Log;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.keychain.SecurityLevel;
import com.ifriend.keychain.cipherStorage.CipherStorage;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandler;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandlerNonInteractive;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import com.ifriend.keychain.exceptions.KeyStoreAccessException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes6.dex */
public class CipherStorageKeystoreRsaEcb extends CipherStorageBase {
    public static final String ALGORITHM_RSA = "RSA";
    public static final String BLOCK_MODE_ECB = "ECB";
    public static final int ENCRYPTION_KEY_SIZE = 3072;
    public static final int ENCRYPTION_KEY_SIZE_WHEN_TESTING = 512;
    public static final String PADDING_PKCS1 = "PKCS1Padding";
    public static final String TRANSFORMATION_RSA_ECB_PKCS1 = "RSA/ECB/PKCS1Padding";

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public String getCipherStorageName() {
        return KeychainModule.KnownCiphers.RSA;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionAlgorithm() {
        return ALGORITHM_RSA;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected String getEncryptionTransformation() {
        return TRANSFORMATION_RSA_ECB_PKCS1;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public int getMinSupportedApiLevel() {
        return 23;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public boolean isBiometrySupported() {
        return true;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.EncryptionResult encrypt(String str, String str2, String str3, SecurityLevel securityLevel) throws CryptoFailedException {
        throwIfInsufficientLevel(securityLevel);
        try {
            return innerEncryptedCredentials(getDefaultAliasIfEmpty(str, getDefaultAliasServiceName()), str3, str2, securityLevel);
        } catch (KeyStoreAccessException e) {
            e = e;
            throw new CryptoFailedException("Could not access Keystore for service " + str, e);
        } catch (IOException e2) {
            throw new CryptoFailedException("I/O error: " + e2.getMessage(), e2);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new CryptoFailedException("Could not encrypt data for service " + str, e);
        } catch (KeyStoreException e4) {
            e = e4;
            throw new CryptoFailedException("Could not access Keystore for service " + str, e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new CryptoFailedException("Could not encrypt data for service " + str, e);
        } catch (InvalidKeySpecException e6) {
            e = e6;
            throw new CryptoFailedException("Could not encrypt data for service " + str, e);
        } catch (NoSuchPaddingException e7) {
            e = e7;
            throw new CryptoFailedException("Could not encrypt data for service " + str, e);
        } catch (Throwable th) {
            throw new CryptoFailedException("Unknown error: " + th.getMessage(), th);
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public CipherStorage.DecryptionResult decrypt(String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException {
        DecryptionResultHandlerNonInteractive decryptionResultHandlerNonInteractive = new DecryptionResultHandlerNonInteractive();
        decrypt(decryptionResultHandlerNonInteractive, str, bArr, bArr2, securityLevel);
        CryptoFailedException.reThrowOnError(decryptionResultHandlerNonInteractive.getError());
        if (decryptionResultHandlerNonInteractive.getResult() == null) {
            throw new CryptoFailedException("No decryption results and no error. Something deeply wrong!");
        }
        return decryptionResultHandlerNonInteractive.getResult();
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public void decrypt(DecryptionResultHandler decryptionResultHandler, String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException {
        Key extractGeneratedKey;
        throwIfInsufficientLevel(securityLevel);
        String defaultAliasIfEmpty = getDefaultAliasIfEmpty(str, getDefaultAliasServiceName());
        Key key = null;
        try {
            try {
                extractGeneratedKey = extractGeneratedKey(defaultAliasIfEmpty, securityLevel, new AtomicInteger(1));
            } catch (UserNotAuthenticatedException e) {
                e = e;
            }
            try {
                decryptionResultHandler.onDecrypt(new CipherStorage.DecryptionResult(decryptBytes(extractGeneratedKey, bArr), decryptBytes(extractGeneratedKey, bArr2)), null);
            } catch (UserNotAuthenticatedException e2) {
                e = e2;
                key = extractGeneratedKey;
                String str2 = LOG_TAG;
                Log.d(str2, "Unlock of keystore is needed. Error: " + e.getMessage(), e);
                decryptionResultHandler.askAccessPermissions(new CipherStorage.DecryptionContext(defaultAliasIfEmpty, key, bArr2, bArr));
            }
        } catch (Throwable th) {
            decryptionResultHandler.onDecrypt(null, th);
        }
    }

    private CipherStorage.EncryptionResult innerEncryptedCredentials(String str, String str2, String str3, SecurityLevel securityLevel) throws GeneralSecurityException, IOException {
        KeyStore keyStoreAndLoad = getKeyStoreAndLoad();
        if (!keyStoreAndLoad.containsAlias(str)) {
            generateKeyAndStoreUnderAlias(str, securityLevel);
        }
        PublicKey generatePublic = KeyFactory.getInstance(ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(keyStoreAndLoad.getCertificate(str).getPublicKey().getEncoded()));
        return new CipherStorage.EncryptionResult(encryptString(generatePublic, str3), encryptString(generatePublic, str2), this);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str) throws GeneralSecurityException {
        return getKeyGenSpecBuilder(str, false);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str, boolean z) throws GeneralSecurityException {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes(BLOCK_MODE_ECB).setEncryptionPaddings(PADDING_PKCS1).setRandomizedEncryptionRequired(true).setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(5).setKeySize(z ? 512 : ENCRYPTION_KEY_SIZE);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected KeyInfo getKeyInfo(Key key) throws GeneralSecurityException {
        return (KeyInfo) KeyFactory.getInstance(key.getAlgorithm(), CipherStorageBase.KEYSTORE_TYPE).getKeySpec(key, KeyInfo.class);
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase
    protected Key generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(getEncryptionAlgorithm(), CipherStorageBase.KEYSTORE_TYPE);
        keyPairGenerator.initialize(keyGenParameterSpec);
        return keyPairGenerator.generateKeyPair().getPrivate();
    }
}

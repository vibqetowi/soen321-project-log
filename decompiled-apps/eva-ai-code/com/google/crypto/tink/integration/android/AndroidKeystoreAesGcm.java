package com.google.crypto.tink.integration.android;

import android.util.Log;
import com.google.crypto.tink.Aead;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* loaded from: classes7.dex */
public final class AndroidKeystoreAesGcm implements Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final String TAG = "AndroidKeystoreAesGcm";
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final SecretKey key;

    public AndroidKeystoreAesGcm(String keyId) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(CipherStorageBase.KEYSTORE_TYPE);
        keyStore.load(null);
        SecretKey secretKey = (SecretKey) keyStore.getKey(keyId, null);
        this.key = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + keyId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidKeystoreAesGcm(String keyId, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(keyId, null);
        this.key = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + keyId);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] aad) throws GeneralSecurityException {
        try {
            return encryptInternal(plaintext, aad);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(TAG, "encountered a potentially transient KeyStore error, will wait and retry", e);
            sleep();
            return encryptInternal(plaintext, aad);
        }
    }

    private byte[] encryptInternal(final byte[] plaintext, final byte[] aad) throws GeneralSecurityException {
        if (plaintext.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr = new byte[plaintext.length + 12 + 16];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.key);
        cipher.updateAAD(aad);
        cipher.doFinal(plaintext, 0, plaintext.length, bArr, 12);
        System.arraycopy(cipher.getIV(), 0, bArr, 0, 12);
        return bArr;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] aad) throws GeneralSecurityException {
        try {
            return decryptInternal(ciphertext, aad);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(TAG, "encountered a potentially transient KeyStore error, will wait and retry", e);
            sleep();
            return decryptInternal(ciphertext, aad);
        }
    }

    private byte[] decryptInternal(final byte[] ciphertext, final byte[] aad) throws GeneralSecurityException {
        if (ciphertext.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, ciphertext, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.key, gCMParameterSpec);
        cipher.updateAAD(aad);
        return cipher.doFinal(ciphertext, 12, ciphertext.length - 12);
    }

    private static void sleep() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }
}

package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
/* loaded from: classes7.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final int WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 20;
    private KeyStore keyStore;
    private final String keyUri;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String uri) {
        this(new Builder().setKeyUri(uri));
    }

    private AndroidKeystoreKmsClient(Builder builder) {
        this.keyUri = builder.keyUri;
        this.keyStore = builder.keyStore;
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        KeyStore keyStore;
        String keyUri = null;

        public Builder() {
            this.keyStore = null;
            if (!AndroidKeystoreKmsClient.isAtLeastM()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance(CipherStorageBase.KEYSTORE_TYPE);
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder setKeyUri(String val) {
            if (val == null || !val.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("val must start with android-keystore://");
            }
            this.keyUri = val;
            return this;
        }

        public Builder setKeyStore(KeyStore val) {
            if (val == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.keyStore = val;
            return this;
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX) != false) goto L14;
     */
    @Override // com.google.crypto.tink.KmsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean doesSupport(String uri) {
        String str = this.keyUri;
        boolean z = true;
        if (str == null || !str.equals(uri)) {
            if (this.keyUri == null) {
            }
            z = false;
            return z;
        }
        return true;
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String unused) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String uri) throws GeneralSecurityException {
        String str = this.keyUri;
        if (str != null && !str.equals(uri)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.keyUri, uri));
        }
        return validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, uri), this.keyStore));
    }

    public synchronized void deleteKey(String keyUri) throws GeneralSecurityException {
        this.keyStore.deleteEntry(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, keyUri));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean hasKey(String keyUri) throws GeneralSecurityException {
        String str;
        try {
        } catch (NullPointerException unused) {
            Log.w(TAG, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance(CipherStorageBase.KEYSTORE_TYPE);
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.keyStore.containsAlias(str);
        }
        return this.keyStore.containsAlias(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, keyUri));
    }

    public static Aead getOrGenerateNewAeadKey(String keyUri) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        if (!androidKeystoreKmsClient.hasKey(keyUri)) {
            Log.w(TAG, String.format("key URI %s doesn't exist, generating a new one", keyUri));
            generateNewAeadKey(keyUri);
        }
        return androidKeystoreKmsClient.getAead(keyUri);
    }

    public static void generateNewAeadKey(String keyUri) throws GeneralSecurityException {
        if (new AndroidKeystoreKmsClient().hasKey(keyUri)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", keyUri));
        }
        String validateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, keyUri);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(CipherStorageKeystoreAesCbc.ALGORITHM_AES, CipherStorageBase.KEYSTORE_TYPE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(validateKmsKeyUriAndRemovePrefix, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    private static Aead validateAead(Aead aead) throws GeneralSecurityException {
        byte[] randBytes = Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(randBytes, aead.decrypt(aead.encrypt(randBytes, bArr), bArr))) {
            return aead;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }
}

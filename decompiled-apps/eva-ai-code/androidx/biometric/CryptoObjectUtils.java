package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CryptoObjectUtils {
    private static final String FAKE_KEY_NAME = "androidxBiometric";
    private static final String KEYSTORE_INSTANCE = "AndroidKeyStore";
    private static final String TAG = "CryptoObjectUtils";

    private CryptoObjectUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject unwrapFromBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = Api28Impl.getCipher(cryptoObject);
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = Api28Impl.getSignature(cryptoObject);
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = Api28Impl.getMac(cryptoObject);
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = Api30Impl.getIdentityCredential(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject wrapForBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return Api30Impl.create(identityCredential);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject unwrapFromFingerprintManager(FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FingerprintManagerCompat.CryptoObject wrapForFingerprintManager(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new FingerprintManagerCompat.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new FingerprintManagerCompat.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new FingerprintManagerCompat.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && cryptoObject.getIdentityCredential() != null) {
            Log.e(TAG, "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject createFakeCryptoObject() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder = Api23Impl.createKeyGenParameterSpecBuilder(FAKE_KEY_NAME, 3);
            Api23Impl.setBlockModeCBC(createKeyGenParameterSpecBuilder);
            Api23Impl.setEncryptionPaddingPKCS7(createKeyGenParameterSpecBuilder);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(CipherStorageKeystoreAesCbc.ALGORITHM_AES, "AndroidKeyStore");
            Api23Impl.initKeyGenerator(keyGenerator, Api23Impl.buildKeyGenParameterSpec(createKeyGenParameterSpecBuilder));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance(CipherStorageKeystoreAesCbc.ENCRYPTION_TRANSFORMATION);
            cipher.init(1, (SecretKey) keyStore.getKey(FAKE_KEY_NAME, null));
            return new BiometricPrompt.CryptoObject(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w(TAG, "Failed to create fake crypto object.", e);
            return null;
        }
    }

    /* loaded from: classes.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static BiometricPrompt.CryptoObject create(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential getIdentityCredential(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* loaded from: classes.dex */
    private static class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt.CryptoObject create(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject create(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject create(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher getCipher(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Signature getSignature(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        static Mac getMac(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }
    }

    /* loaded from: classes.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        static KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        static void setBlockModeCBC(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(CipherStorageKeystoreAesCbc.BLOCK_MODE_CBC);
        }

        static void setEncryptionPaddingPKCS7(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(CipherStorageKeystoreAesCbc.PADDING_PKCS7);
        }

        static KeyGenParameterSpec buildKeyGenParameterSpec(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static void initKeyGenerator(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }
    }
}

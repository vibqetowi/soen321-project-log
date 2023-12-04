package com.ifriend.keychain.cipherStorage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.TextUtils;
import android.util.Log;
import com.ifriend.keychain.SecurityLevel;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import com.ifriend.keychain.exceptions.KeyStoreAccessException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
/* loaded from: classes6.dex */
public abstract class CipherStorageBase implements CipherStorage {
    private static final int BUFFER_READ_WRITE_SIZE = 16384;
    private static final int BUFFER_SIZE = 4096;
    public static final String KEYSTORE_TYPE = "AndroidKeyStore";
    protected static final String LOG_TAG = "CipherStorageBase";
    public static final String TEST_KEY_ALIAS = "AndroidKeyStore#supportsSecureHardware";
    public static final Charset UTF8 = Charset.forName("UTF-8");
    protected final Object _sync = new Object();
    protected final Object _syncStrongbox = new Object();
    protected transient Cipher cachedCipher;
    protected transient KeyStore cachedKeyStore;
    protected transient AtomicBoolean isStrongboxAvailable;
    protected transient AtomicBoolean isSupportsSecureHardware;

    /* loaded from: classes6.dex */
    public interface DecryptBytesHandler {
        void initialize(Cipher cipher, Key key, InputStream inputStream) throws GeneralSecurityException, IOException;
    }

    /* loaded from: classes6.dex */
    public interface EncryptStringHandler {
        void initialize(Cipher cipher, Key key, OutputStream outputStream) throws GeneralSecurityException, IOException;
    }

    protected abstract Key generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException;

    protected abstract String getEncryptionAlgorithm() throws Exception;

    protected abstract String getEncryptionTransformation() throws Exception;

    protected abstract KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str) throws GeneralSecurityException;

    protected abstract KeyGenParameterSpec.Builder getKeyGenSpecBuilder(String str, boolean z) throws GeneralSecurityException;

    protected abstract KeyInfo getKeyInfo(Key key) throws GeneralSecurityException;

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public SecurityLevel securityLevel() {
        return SecurityLevel.SECURE_HARDWARE;
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public final int getCapabilityLevel() {
        return ((isBiometrySupported() ? 1 : 0) * 1000) + getMinSupportedApiLevel();
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public boolean supportsSecureHardware() {
        AtomicBoolean atomicBoolean = this.isSupportsSecureHardware;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        synchronized (this._sync) {
            AtomicBoolean atomicBoolean2 = this.isSupportsSecureHardware;
            if (atomicBoolean2 != null) {
                return atomicBoolean2.get();
            }
            this.isSupportsSecureHardware = new AtomicBoolean(false);
            SelfDestroyKey selfDestroyKey = null;
            try {
                SelfDestroyKey selfDestroyKey2 = new SelfDestroyKey(this, TEST_KEY_ALIAS);
                try {
                    this.isSupportsSecureHardware.set(validateKeySecurityLevel(SecurityLevel.SECURE_HARDWARE, selfDestroyKey2.key));
                    selfDestroyKey2.close();
                } catch (Throwable unused) {
                    selfDestroyKey = selfDestroyKey2;
                    if (selfDestroyKey != null) {
                        selfDestroyKey.close();
                    }
                    return this.isSupportsSecureHardware.get();
                }
            } catch (Throwable unused2) {
            }
            return this.isSupportsSecureHardware.get();
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public String getDefaultAliasServiceName() {
        return getCipherStorageName();
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public void removeKey(String str) throws KeyStoreAccessException {
        String defaultAliasIfEmpty = getDefaultAliasIfEmpty(str, getDefaultAliasServiceName());
        KeyStore keyStoreAndLoad = getKeyStoreAndLoad();
        try {
            if (keyStoreAndLoad.containsAlias(defaultAliasIfEmpty)) {
                keyStoreAndLoad.deleteEntry(defaultAliasIfEmpty);
            }
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // com.ifriend.keychain.cipherStorage.CipherStorage
    public Set<String> getAllKeys() throws KeyStoreAccessException {
        KeyStore keyStoreAndLoad = getKeyStoreAndLoad();
        try {
            return new HashSet(Collections.list(keyStoreAndLoad.aliases()));
        } catch (KeyStoreException e) {
            throw new KeyStoreAccessException("Error accessing aliases in keystore " + keyStoreAndLoad, e);
        }
    }

    public Cipher getCachedInstance() throws NoSuchAlgorithmException, NoSuchPaddingException {
        if (this.cachedCipher == null) {
            synchronized (this) {
                if (this.cachedCipher == null) {
                    try {
                        this.cachedCipher = Cipher.getInstance(getEncryptionTransformation());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return this.cachedCipher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void throwIfInsufficientLevel(SecurityLevel securityLevel) throws CryptoFailedException {
        if (!securityLevel().satisfiesSafetyThreshold(securityLevel)) {
            throw new CryptoFailedException(String.format("Insufficient security level (wants %s; got %s)", securityLevel, securityLevel()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Key extractGeneratedKey(String str, SecurityLevel securityLevel, AtomicInteger atomicInteger) throws GeneralSecurityException {
        Key extractKey;
        do {
            KeyStore keyStoreAndLoad = getKeyStoreAndLoad();
            if (!keyStoreAndLoad.containsAlias(str)) {
                generateKeyAndStoreUnderAlias(str, securityLevel);
            }
            extractKey = extractKey(keyStoreAndLoad, str, atomicInteger);
        } while (extractKey == null);
        return extractKey;
    }

    protected Key extractKey(KeyStore keyStore, String str, AtomicInteger atomicInteger) throws GeneralSecurityException {
        try {
            Key key = keyStore.getKey(str, null);
            if (key != null) {
                return key;
            }
            throw new KeyStoreAccessException("Empty key extracted!");
        } catch (UnrecoverableKeyException e) {
            if (atomicInteger.getAndDecrement() > 0) {
                keyStore.deleteEntry(str);
                return null;
            }
            throw e;
        }
    }

    protected boolean validateKeySecurityLevel(SecurityLevel securityLevel, Key key) throws GeneralSecurityException {
        return getSecurityLevel(key).satisfiesSafetyThreshold(securityLevel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SecurityLevel getSecurityLevel(Key key) throws GeneralSecurityException {
        if (getKeyInfo(key).isInsideSecureHardware()) {
            return SecurityLevel.SECURE_HARDWARE;
        }
        return SecurityLevel.SECURE_SOFTWARE;
    }

    public KeyStore getKeyStoreAndLoad() throws KeyStoreAccessException {
        if (this.cachedKeyStore == null) {
            synchronized (this) {
                if (this.cachedKeyStore == null) {
                    KeyStore keyStore = KeyStore.getInstance(KEYSTORE_TYPE);
                    keyStore.load(null);
                    this.cachedKeyStore = keyStore;
                }
            }
        }
        return this.cachedKeyStore;
    }

    public byte[] encryptString(Key key, String str) throws IOException, GeneralSecurityException {
        return encryptString(key, str, Defaults.encrypt);
    }

    public String decryptBytes(Key key, byte[] bArr) throws IOException, GeneralSecurityException {
        return decryptBytes(key, bArr, Defaults.decrypt);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] encryptString(Key key, String str, EncryptStringHandler encryptStringHandler) throws IOException, GeneralSecurityException {
        Cipher cachedInstance = getCachedInstance();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (encryptStringHandler != null) {
                encryptStringHandler.initialize(cachedInstance, key, byteArrayOutputStream);
                byteArrayOutputStream.flush();
            }
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cachedInstance);
            cipherOutputStream.write(str.getBytes(UTF8));
            cipherOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            Log.e(LOG_TAG, th.getMessage(), th);
            throw th;
        }
    }

    protected String decryptBytes(Key key, byte[] bArr, DecryptBytesHandler decryptBytesHandler) throws GeneralSecurityException, IOException {
        Cipher cachedInstance = getCachedInstance();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (decryptBytesHandler != null) {
                decryptBytesHandler.initialize(cachedInstance, key, byteArrayInputStream);
            }
            CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cachedInstance);
            try {
                copy(cipherInputStream, byteArrayOutputStream);
                cipherInputStream.close();
                String str = new String(byteArrayOutputStream.toByteArray(), UTF8);
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
                return str;
            } catch (Throwable th) {
                try {
                    cipherInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            Log.w(LOG_TAG, th3.getMessage(), th3);
            throw th3;
        }
    }

    public void generateKeyAndStoreUnderAlias(String str, SecurityLevel securityLevel) throws GeneralSecurityException {
        Key key;
        synchronized (this._syncStrongbox) {
            AtomicBoolean atomicBoolean = this.isStrongboxAvailable;
            key = null;
            if (atomicBoolean == null || atomicBoolean.get()) {
                if (this.isStrongboxAvailable == null) {
                    this.isStrongboxAvailable = new AtomicBoolean(false);
                }
                try {
                    key = tryGenerateStrongBoxSecurityKey(str);
                    this.isStrongboxAvailable.set(true);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(LOG_TAG, "StrongBox security storage is not available.", e);
                }
            }
        }
        if (key == null || !this.isStrongboxAvailable.get()) {
            try {
                key = tryGenerateRegularSecurityKey(str);
            } catch (GeneralSecurityException e2) {
                Log.e(LOG_TAG, "Regular security storage is not available.", e2);
                throw e2;
            }
        }
        if (!validateKeySecurityLevel(securityLevel, key)) {
            throw new CryptoFailedException("Cannot generate keys with required security guarantees");
        }
    }

    protected Key tryGenerateRegularSecurityKey(String str) throws GeneralSecurityException {
        return tryGenerateRegularSecurityKey(str, false);
    }

    protected Key tryGenerateRegularSecurityKey(String str, boolean z) throws GeneralSecurityException {
        return generateKey(getKeyGenSpecBuilder(str, z).build());
    }

    protected Key tryGenerateStrongBoxSecurityKey(String str) throws GeneralSecurityException {
        return tryGenerateStrongBoxSecurityKey(str, false);
    }

    protected Key tryGenerateStrongBoxSecurityKey(String str, boolean z) throws GeneralSecurityException {
        KeyGenParameterSpec.Builder isStrongBoxBacked;
        if (Build.VERSION.SDK_INT < 28) {
            throw new KeyStoreAccessException("Strong box security keystore is not supported for old API" + Build.VERSION.SDK_INT + ".");
        }
        isStrongBoxBacked = getKeyGenSpecBuilder(str, z).setIsStrongBoxBacked(true);
        return generateKey(isStrongBoxBacked.build());
    }

    public CipherStorageBase setCipher(Cipher cipher) {
        this.cachedCipher = cipher;
        return this;
    }

    public CipherStorageBase setKeyStore(KeyStore keyStore) {
        this.cachedKeyStore = keyStore;
        return this;
    }

    public static String getDefaultAliasIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Defaults {
        public static final EncryptStringHandler encrypt = new EncryptStringHandler() { // from class: com.ifriend.keychain.cipherStorage.CipherStorageBase$Defaults$$ExternalSyntheticLambda0
            @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase.EncryptStringHandler
            public final void initialize(Cipher cipher, Key key, OutputStream outputStream) {
                cipher.init(1, key);
            }
        };
        public static final DecryptBytesHandler decrypt = new DecryptBytesHandler() { // from class: com.ifriend.keychain.cipherStorage.CipherStorageBase$Defaults$$ExternalSyntheticLambda1
            @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase.DecryptBytesHandler
            public final void initialize(Cipher cipher, Key key, InputStream inputStream) {
                cipher.init(2, key);
            }
        };
    }

    /* loaded from: classes6.dex */
    public static final class IV {
        public static final int IV_LENGTH = 16;
        public static final EncryptStringHandler encrypt = new EncryptStringHandler() { // from class: com.ifriend.keychain.cipherStorage.CipherStorageBase$IV$$ExternalSyntheticLambda0
            @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase.EncryptStringHandler
            public final void initialize(Cipher cipher, Key key, OutputStream outputStream) {
                CipherStorageBase.IV.lambda$static$0(cipher, key, outputStream);
            }
        };
        public static final DecryptBytesHandler decrypt = new DecryptBytesHandler() { // from class: com.ifriend.keychain.cipherStorage.CipherStorageBase$IV$$ExternalSyntheticLambda1
            @Override // com.ifriend.keychain.cipherStorage.CipherStorageBase.DecryptBytesHandler
            public final void initialize(Cipher cipher, Key key, InputStream inputStream) {
                cipher.init(2, key, CipherStorageBase.IV.readIv(inputStream));
            }
        };

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$static$0(Cipher cipher, Key key, OutputStream outputStream) throws GeneralSecurityException, IOException {
            cipher.init(1, key);
            byte[] iv = cipher.getIV();
            outputStream.write(iv, 0, iv.length);
        }

        public static IvParameterSpec readIv(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[16];
            if (16 >= bArr.length) {
                throw new IOException("Insufficient length of input data for IV extracting.");
            }
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            return new IvParameterSpec(bArr2);
        }

        public static IvParameterSpec readIv(InputStream inputStream) throws IOException {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr, 0, 16) != 16) {
                throw new IOException("Input stream has insufficient data.");
            }
            return new IvParameterSpec(bArr);
        }
    }

    /* loaded from: classes6.dex */
    public class SelfDestroyKey implements Closeable {
        public final Key key;
        public final String name;

        public SelfDestroyKey(CipherStorageBase cipherStorageBase, String str) throws GeneralSecurityException {
            this(str, cipherStorageBase.tryGenerateRegularSecurityKey(str, true));
        }

        public SelfDestroyKey(String str, Key key) {
            this.name = str;
            this.key = key;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                CipherStorageBase.this.removeKey(this.name);
            } catch (KeyStoreAccessException e) {
                String str = CipherStorageBase.LOG_TAG;
                Log.w(str, "AutoClose remove key failed. Error: " + e.getMessage(), e);
            }
        }
    }
}

package com.ifriend.keychain.cipherStorage;

import com.ifriend.keychain.SecurityLevel;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandler;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import com.ifriend.keychain.exceptions.KeyStoreAccessException;
import java.security.Key;
import java.util.Set;
/* loaded from: classes6.dex */
public interface CipherStorage {
    DecryptionResult decrypt(String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException;

    void decrypt(DecryptionResultHandler decryptionResultHandler, String str, byte[] bArr, byte[] bArr2, SecurityLevel securityLevel) throws CryptoFailedException;

    EncryptionResult encrypt(String str, String str2, String str3, SecurityLevel securityLevel) throws CryptoFailedException;

    Set<String> getAllKeys() throws KeyStoreAccessException;

    int getCapabilityLevel();

    String getCipherStorageName();

    String getDefaultAliasServiceName();

    int getMinSupportedApiLevel();

    boolean isBiometrySupported();

    void removeKey(String str) throws KeyStoreAccessException;

    SecurityLevel securityLevel();

    boolean supportsSecureHardware();

    /* loaded from: classes6.dex */
    public static abstract class CipherResult<T> {
        public final T password;
        public final T username;

        public CipherResult(T t, T t2) {
            this.username = t;
            this.password = t2;
        }
    }

    /* loaded from: classes6.dex */
    public static class EncryptionResult extends CipherResult<byte[]> {
        public final String cipherName;

        public EncryptionResult(byte[] bArr, byte[] bArr2, String str) {
            super(bArr, bArr2);
            this.cipherName = str;
        }

        public EncryptionResult(byte[] bArr, byte[] bArr2, CipherStorage cipherStorage) {
            this(bArr, bArr2, cipherStorage.getCipherStorageName());
        }
    }

    /* loaded from: classes6.dex */
    public static class DecryptionResult extends CipherResult<String> {
        private final SecurityLevel securityLevel;

        public DecryptionResult(String str, String str2) {
            this(str, str2, SecurityLevel.ANY);
        }

        public DecryptionResult(String str, String str2, SecurityLevel securityLevel) {
            super(str, str2);
            this.securityLevel = securityLevel;
        }

        public SecurityLevel getSecurityLevel() {
            return this.securityLevel;
        }
    }

    /* loaded from: classes6.dex */
    public static class DecryptionContext extends CipherResult<byte[]> {
        public final Key key;
        public final String keyAlias;

        public DecryptionContext(String str, Key key, byte[] bArr, byte[] bArr2) {
            super(bArr2, bArr);
            this.keyAlias = str;
            this.key = key;
        }
    }
}

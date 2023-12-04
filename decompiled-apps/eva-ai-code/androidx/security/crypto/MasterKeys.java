package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
@Deprecated
/* loaded from: classes3.dex */
public final class MasterKeys {
    public static final KeyGenParameterSpec AES256_GCM_SPEC = createAES256GCMKeyGenParameterSpec("_androidx_security_master_key_");
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final String MASTER_KEY_ALIAS = "_androidx_security_master_key_";

    private MasterKeys() {
    }

    private static KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(String keyAlias) {
        return new KeyGenParameterSpec.Builder(keyAlias, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    public static String getOrCreate(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        validate(keyGenParameterSpec);
        if (!keyExists(keyGenParameterSpec.getKeystoreAlias())) {
            generateKey(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    static void validate(KeyGenParameterSpec spec) {
        if (spec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + spec.getKeySize() + " bits");
        } else if (!Arrays.equals(spec.getBlockModes(), new String[]{CodePackage.GCM})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(spec.getBlockModes()));
        } else if (spec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + spec.getPurposes());
        } else if (!Arrays.equals(spec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(spec.getEncryptionPaddings()));
        } else if (spec.isUserAuthenticationRequired() && spec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }

    private static void generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(CipherStorageKeystoreAesCbc.ALGORITHM_AES, "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    private static boolean keyExists(String keyAlias) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(keyAlias);
    }
}

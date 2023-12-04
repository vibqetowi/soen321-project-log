package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* loaded from: classes3.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    private final String mKeyAlias;
    private final KeyGenParameterSpec mKeyGenParameterSpec;

    /* loaded from: classes3.dex */
    public enum KeyScheme {
        AES256_GCM
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return 300;
    }

    MasterKey(String keyAlias, Object keyGenParameterSpec) {
        this.mKeyAlias = keyAlias;
        this.mKeyGenParameterSpec = (KeyGenParameterSpec) keyGenParameterSpec;
    }

    public boolean isKeyStoreBacked() {
        try {
            KeyStore keyStore = KeyStore.getInstance(CipherStorageBase.KEYSTORE_TYPE);
            keyStore.load(null);
            return keyStore.containsAlias(this.mKeyAlias);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        return keyGenParameterSpec != null && keyGenParameterSpec.isUserAuthenticationRequired();
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        if (keyGenParameterSpec == null) {
            return 0;
        }
        return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
    }

    public boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec;
        boolean isStrongBoxBacked;
        if (Build.VERSION.SDK_INT < 28 || (keyGenParameterSpec = this.mKeyGenParameterSpec) == null) {
            return false;
        }
        isStrongBoxBacked = keyGenParameterSpec.isStrongBoxBacked();
        return isStrongBoxBacked;
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.mKeyAlias + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getKeyAlias() {
        return this.mKeyAlias;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean mAuthenticationRequired;
        private final Context mContext;
        private final String mKeyAlias;
        private KeyGenParameterSpec mKeyGenParameterSpec;
        private KeyScheme mKeyScheme;
        private boolean mRequestStrongBoxBacked;
        private int mUserAuthenticationValidityDurationSeconds;

        public Builder(Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        public Builder(Context context, String keyAlias) {
            this.mContext = context.getApplicationContext();
            this.mKeyAlias = keyAlias;
        }

        public Builder setKeyScheme(KeyScheme keyScheme) {
            if (AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme[keyScheme.ordinal()] == 1) {
                if (this.mKeyGenParameterSpec != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.mKeyScheme = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
        }

        public Builder setUserAuthenticationRequired(boolean authenticationRequired) {
            return setUserAuthenticationRequired(authenticationRequired, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public Builder setUserAuthenticationRequired(boolean authenticationRequired, int userAuthenticationValidityDurationSeconds) {
            this.mAuthenticationRequired = authenticationRequired;
            this.mUserAuthenticationValidityDurationSeconds = userAuthenticationValidityDurationSeconds;
            return this;
        }

        public Builder setRequestStrongBoxBacked(boolean requestStrongBoxBacked) {
            this.mRequestStrongBoxBacked = requestStrongBoxBacked;
            return this;
        }

        public Builder setKeyGenParameterSpec(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.mKeyScheme != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (!this.mKeyAlias.equals(keyGenParameterSpec.getKeystoreAlias())) {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.mKeyAlias + " vs " + keyGenParameterSpec.getKeystoreAlias());
            }
            this.mKeyGenParameterSpec = keyGenParameterSpec;
            return this;
        }

        public MasterKey build() throws GeneralSecurityException, IOException {
            return buildOnM();
        }

        private MasterKey buildOnM() throws GeneralSecurityException, IOException {
            KeyScheme keyScheme = this.mKeyScheme;
            if (keyScheme == null && this.mKeyGenParameterSpec == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (keyScheme == KeyScheme.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.mKeyAlias, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.mAuthenticationRequired) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.mUserAuthenticationValidityDurationSeconds);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.mRequestStrongBoxBacked && this.mContext.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.mKeyGenParameterSpec = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
            if (keyGenParameterSpec == null) {
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
            return new MasterKey(MasterKeys.getOrCreate(keyGenParameterSpec), this.mKeyGenParameterSpec);
        }
    }

    /* renamed from: androidx.security.crypto.MasterKey$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }
}

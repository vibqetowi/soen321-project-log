package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* loaded from: classes7.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private KeysetManager keysetManager;
    private final Aead masterKey;
    private final KeysetWriter writer;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) throws GeneralSecurityException, IOException {
        this(builder);
    }

    private AndroidKeysetManager(Builder builder) throws GeneralSecurityException, IOException {
        this.writer = builder.writer;
        this.masterKey = builder.masterKey;
        this.keysetManager = builder.keysetManager;
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        private KeysetManager keysetManager;
        private KeysetReader reader = null;
        private KeysetWriter writer = null;
        private String masterKeyUri = null;
        private Aead masterKey = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;
        private KeyStore keyStore = null;

        public Builder withSharedPref(Context context, String keysetName, String prefFileName) throws IOException {
            if (context != null) {
                if (keysetName == null) {
                    throw new IllegalArgumentException("need a keyset name");
                }
                this.reader = new SharedPrefKeysetReader(context, keysetName, prefFileName);
                this.writer = new SharedPrefKeysetWriter(context, keysetName, prefFileName);
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public Builder withMasterKeyUri(String val) {
            if (!val.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = val;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate val) {
            this.keyTemplate = KeyTemplate.create(val.getTypeUrl(), val.getValue().toByteArray(), AndroidKeysetManager.fromProto(val.getOutputPrefixType()));
            return this;
        }

        public Builder withKeyTemplate(KeyTemplate val) {
            this.keyTemplate = val;
            return this;
        }

        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        Builder withKeyStore(KeyStore val) {
            this.keyStore = val;
            return this;
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            if (this.masterKeyUri != null) {
                this.masterKey = readOrGenerateNewMasterKey();
            }
            this.keysetManager = readOrGenerateNewKeyset();
            return new AndroidKeysetManager(this, null);
        }

        private Aead readOrGenerateNewMasterKey() throws GeneralSecurityException {
            AndroidKeystoreKmsClient androidKeystoreKmsClient;
            if (!AndroidKeysetManager.isAtLeastM()) {
                Log.w(AndroidKeysetManager.TAG, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.keyStore != null) {
                androidKeystoreKmsClient = new AndroidKeystoreKmsClient.Builder().setKeyStore(this.keyStore).build();
            } else {
                androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
            }
            boolean hasKey = androidKeystoreKmsClient.hasKey(this.masterKeyUri);
            if (!hasKey) {
                try {
                    AndroidKeystoreKmsClient.generateNewAeadKey(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return androidKeystoreKmsClient.getAead(this.masterKeyUri);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!hasKey) {
                    Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.masterKeyUri), e2);
            }
        }

        private KeysetManager readOrGenerateNewKeyset() throws GeneralSecurityException, IOException {
            try {
                return read();
            } catch (FileNotFoundException e) {
                Log.w(AndroidKeysetManager.TAG, "keyset not found, will generate a new one", e);
                if (this.keyTemplate != null) {
                    KeysetManager add = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
                    KeysetManager primary = add.setPrimary(add.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
                    if (this.masterKey != null) {
                        primary.getKeysetHandle().write(this.writer, this.masterKey);
                    } else {
                        CleartextKeysetHandle.write(primary.getKeysetHandle(), this.writer);
                    }
                    return primary;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private KeysetManager read() throws GeneralSecurityException, IOException {
            Aead aead = this.masterKey;
            if (aead != null) {
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(this.reader, aead));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                    Log.w(AndroidKeysetManager.TAG, "cannot decrypt keyset: ", e);
                }
            }
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(this.reader));
        }
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager rotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = rotate;
        write(rotate);
        return this;
    }

    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int keyId) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(keyId);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int keyId) throws GeneralSecurityException {
        return setPrimary(keyId);
    }

    public synchronized AndroidKeysetManager enable(int keyId) throws GeneralSecurityException {
        KeysetManager enable = this.keysetManager.enable(keyId);
        this.keysetManager = enable;
        write(enable);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int keyId) throws GeneralSecurityException {
        KeysetManager disable = this.keysetManager.disable(keyId);
        this.keysetManager = disable;
        write(disable);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int keyId) throws GeneralSecurityException {
        KeysetManager delete = this.keysetManager.delete(keyId);
        this.keysetManager = delete;
        write(delete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int keyId) throws GeneralSecurityException {
        KeysetManager destroy = this.keysetManager.destroy(keyId);
        this.keysetManager = destroy;
        write(destroy);
        return this;
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    private void write(KeysetManager manager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                manager.getKeysetHandle().write(this.writer, this.masterKey);
            } else {
                CleartextKeysetHandle.write(manager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private boolean shouldUseKeystore() {
        return this.masterKey != null && isAtLeastM();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return KeyTemplate.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return KeyTemplate.OutputPrefixType.RAW;
            }
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        return KeyTemplate.OutputPrefixType.TINK;
    }
}

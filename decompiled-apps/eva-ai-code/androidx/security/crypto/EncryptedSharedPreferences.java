package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final DeterministicAead mKeyDeterministicAead;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final Aead mValueAead;

    EncryptedSharedPreferences(String name, String masterKeyAlias, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.mFileName = name;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = masterKeyAlias;
        this.mValueAead = aead;
        this.mKeyDeterministicAead = deterministicAead;
    }

    public static SharedPreferences create(Context context, String fileName, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(fileName, masterKey.getKeyAlias(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    @Deprecated
    public static SharedPreferences create(String fileName, String masterKeyAlias, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        DeterministicAeadConfig.register();
        AeadConfig.register();
        Context applicationContext = context.getApplicationContext();
        AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(prefKeyEncryptionScheme.getKeyTemplate()).withSharedPref(applicationContext, KEY_KEYSET_ALIAS, fileName);
        KeysetHandle keysetHandle = withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + masterKeyAlias).build().getKeysetHandle();
        AndroidKeysetManager.Builder withSharedPref2 = new AndroidKeysetManager.Builder().withKeyTemplate(prefValueEncryptionScheme.getKeyTemplate()).withSharedPref(applicationContext, VALUE_KEYSET_ALIAS, fileName);
        KeysetHandle keysetHandle2 = withSharedPref2.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + masterKeyAlias).build().getKeysetHandle();
        DeterministicAead deterministicAead = (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class);
        return new EncryptedSharedPreferences(fileName, masterKeyAlias, applicationContext.getSharedPreferences(fileName, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), deterministicAead);
    }

    /* loaded from: classes3.dex */
    public enum PrefKeyEncryptionScheme {
        AES256_SIV(AesSivKeyManager.aes256SivTemplate());
        
        private final KeyTemplate mDeterministicAeadKeyTemplate;

        PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* loaded from: classes3.dex */
    public enum PrefValueEncryptionScheme {
        AES256_GCM(AesGcmKeyManager.aes256GcmTemplate());
        
        private final KeyTemplate mAeadKeyTemplate;

        PrefValueEncryptionScheme(KeyTemplate keyTemplates) {
            this.mAeadKeyTemplate = keyTemplates;
        }

        KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    /* loaded from: classes3.dex */
    private static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String key, String value) {
            if (value == null) {
                value = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String key, Set<String> values) {
            if (values == null) {
                values = new ArraySet<>();
                values.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList<byte[]> arrayList = new ArrayList(values.size());
            int size = values.size() * 4;
            for (String str : values) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String key, int value) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(value);
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String key, long value) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(value);
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String key, float value) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(value);
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String key, boolean value) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(value ? (byte) 1 : (byte) 0);
            putEncryptedObject(key, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String key) {
            if (this.mEncryptedSharedPreferences.isReservedKey(key)) {
                throw new SecurityException(key + " is a reserved key for the encryption keyset.");
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(key));
            this.mKeysChanged.remove(key);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void putEncryptedObject(String key, byte[] value) {
            if (this.mEncryptedSharedPreferences.isReservedKey(key)) {
                throw new SecurityException(key + " is a reserved key for the encryption keyset.");
            }
            this.mKeysChanged.add(key);
            if (key == null) {
                key = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> encryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(key, value);
                this.mEditor.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        private void notifyListeners() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.mEncryptedSharedPreferences.mListeners) {
                for (String str : this.mKeysChanged) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, str);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String decryptKey = decryptKey(entry.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public String getString(String key, String defValue) {
        Object decryptedObject = getDecryptedObject(key);
        return (decryptedObject == null || !(decryptedObject instanceof String)) ? defValue : (String) decryptedObject;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String key, Set<String> defValues) {
        Set<String> arraySet;
        Object decryptedObject = getDecryptedObject(key);
        if (decryptedObject instanceof Set) {
            arraySet = (Set) decryptedObject;
        } else {
            arraySet = new ArraySet<>();
        }
        return arraySet.size() > 0 ? arraySet : defValues;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String key, int defValue) {
        Object decryptedObject = getDecryptedObject(key);
        return (decryptedObject == null || !(decryptedObject instanceof Integer)) ? defValue : ((Integer) decryptedObject).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String key, long defValue) {
        Object decryptedObject = getDecryptedObject(key);
        return (decryptedObject == null || !(decryptedObject instanceof Long)) ? defValue : ((Long) decryptedObject).longValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String key, float defValue) {
        Object decryptedObject = getDecryptedObject(key);
        return (decryptedObject == null || !(decryptedObject instanceof Float)) ? defValue : ((Float) decryptedObject).floatValue();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String key, boolean defValue) {
        Object decryptedObject = getDecryptedObject(key);
        return (decryptedObject == null || !(decryptedObject instanceof Boolean)) ? defValue : ((Boolean) decryptedObject).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        if (isReservedKey(key)) {
            throw new SecurityException(key + " is a reserved key for the encryption keyset.");
        }
        return this.mSharedPreferences.contains(encryptKey(key));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.mListeners.add(listener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.mListeners.remove(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        EncryptedType(int id) {
            this.mId = id;
        }

        public int getId() {
            return this.mId;
        }

        public static EncryptedType fromId(int id) {
            if (id != 0) {
                if (id != 1) {
                    if (id != 2) {
                        if (id != 3) {
                            if (id != 4) {
                                if (id != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }
    }

    private Object getDecryptedObject(String key) {
        if (isReservedKey(key)) {
            throw new SecurityException(key + " is a reserved key for the encryption keyset.");
        }
        if (key == null) {
            key = NULL_VALUE;
        }
        try {
            String encryptKey = encryptKey(key);
            String string = this.mSharedPreferences.getString(encryptKey, null);
            if (string != null) {
                ByteBuffer wrap = ByteBuffer.wrap(this.mValueAead.decrypt(Base64.decode(string, 0), encryptKey.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals(NULL_VALUE)) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        return Boolean.valueOf(wrap.get() != 0);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (wrap.hasRemaining()) {
                            int i2 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i2);
                            wrap.position(wrap.position() + i2);
                            arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (arraySet.size() == 1 && NULL_VALUE.equals(arraySet.valueAt(0))) {
                            return null;
                        }
                        return arraySet;
                    default:
                        return null;
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    String encryptKey(String key) {
        if (key == null) {
            key = NULL_VALUE;
        }
        try {
            return Base64.encode(this.mKeyDeterministicAead.encryptDeterministically(key.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    String decryptKey(String encryptedKey) {
        try {
            String str = new String(this.mKeyDeterministicAead.decryptDeterministically(Base64.decode(encryptedKey, 0), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str.equals(NULL_VALUE)) {
                return null;
            }
            return str;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    boolean isReservedKey(String key) {
        return KEY_KEYSET_ALIAS.equals(key) || VALUE_KEYSET_ALIAS.equals(key);
    }

    Pair<String, String> encryptKeyValuePair(String key, byte[] value) throws GeneralSecurityException {
        String encryptKey = encryptKey(key);
        return new Pair<>(encryptKey, Base64.encode(this.mValueAead.encrypt(value, encryptKey.getBytes(StandardCharsets.UTF_8))));
    }
}

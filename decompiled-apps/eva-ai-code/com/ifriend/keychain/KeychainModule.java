package com.ifriend.keychain;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import com.ifriend.keychain.PrefsStorage;
import com.ifriend.keychain.cipherStorage.CipherStorage;
import com.ifriend.keychain.cipherStorage.CipherStorageBase;
import com.ifriend.keychain.cipherStorage.CipherStorageFacebookConceal;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandler;
import com.ifriend.keychain.decryptionHandler.DecryptionResultHandlerNonInteractive;
import com.ifriend.keychain.exceptions.CryptoFailedException;
import com.ifriend.keychain.exceptions.EmptyParameterException;
import com.ifriend.keychain.exceptions.KeyStoreAccessException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class KeychainModule {
    public static final String EMPTY_STRING = "";
    public static final String FACE_SUPPORTED_NAME = "Face";
    public static final String FINGERPRINT_SUPPORTED_NAME = "Fingerprint";
    public static final String IRIS_SUPPORTED_NAME = "Iris";
    public static final String KEYCHAIN_MODULE = "RNKeychainManager";
    private static final String LOG_TAG = "KeychainModule";
    public static final String WARMING_UP_ALIAS = "warmingUp";
    private final Map<String, CipherStorage> cipherStorageMap = new HashMap();
    private final Context context;
    private final PrefsStorage prefsStorage;

    /* loaded from: classes6.dex */
    @interface AccessControl {
        public static final String APPLICATION_PASSWORD = "ApplicationPassword";
        public static final String BIOMETRY_ANY = "BiometryAny";
        public static final String BIOMETRY_ANY_OR_DEVICE_PASSCODE = "BiometryAnyOrDevicePasscode";
        public static final String BIOMETRY_CURRENT_SET = "BiometryCurrentSet";
        public static final String BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE = "BiometryCurrentSetOrDevicePasscode";
        public static final String DEVICE_PASSCODE = "DevicePasscode";
        public static final String NONE = "None";
        public static final String USER_PRESENCE = "UserPresence";
    }

    /* loaded from: classes6.dex */
    @interface AuthPromptOptions {
        public static final String CANCEL = "cancel";
        public static final String DESCRIPTION = "description";
        public static final String SUBTITLE = "subtitle";
        public static final String TITLE = "title";
    }

    /* loaded from: classes6.dex */
    @interface Errors {
        public static final String E_CRYPTO_FAILED = "E_CRYPTO_FAILED";
        public static final String E_EMPTY_PARAMETERS = "E_EMPTY_PARAMETERS";
        public static final String E_KEYSTORE_ACCESS_ERROR = "E_KEYSTORE_ACCESS_ERROR";
        public static final String E_SUPPORTED_BIOMETRY_ERROR = "E_SUPPORTED_BIOMETRY_ERROR";
        public static final String E_UNKNOWN_ERROR = "E_UNKNOWN_ERROR";
    }

    /* loaded from: classes6.dex */
    public @interface KnownCiphers {
        public static final String AES = "KeystoreAESCBC";
        public static final String FB = "FacebookConceal";
        public static final String RSA = "KeystoreRSAECB";
    }

    /* loaded from: classes6.dex */
    @interface Maps {
        public static final String ACCESSIBLE = "accessible";
        public static final String ACCESS_CONTROL = "accessControl";
        public static final String ACCESS_GROUP = "accessGroup";
        public static final String AUTH_PROMPT = "authenticationPrompt";
        public static final String AUTH_TYPE = "authenticationType";
        public static final String PASSWORD = "password";
        public static final String RULES = "rules";
        public static final String SECURITY_LEVEL = "securityLevel";
        public static final String SERVICE = "service";
        public static final String STORAGE = "storage";
        public static final String USERNAME = "username";
    }

    /* loaded from: classes6.dex */
    @interface Rules {
        public static final String AUTOMATIC_UPGRADE = "automaticUpgradeToMoreSecuredStorage";
        public static final String NONE = "none";
    }

    private static String getAliasOrDefault(String str) {
        return str == null ? "" : str;
    }

    public String getName() {
        return KEYCHAIN_MODULE;
    }

    public KeychainModule(Context context) {
        this.context = context;
        this.prefsStorage = new PrefsStorage(context);
        addCipherStorageToMap(new CipherStorageFacebookConceal(context));
        addCipherStorageToMap(new CipherStorageKeystoreAesCbc());
        addCipherStorageToMap(new CipherStorageKeystoreRsaEcb());
    }

    public static KeychainModule withWarming(Context context) {
        final KeychainModule keychainModule = new KeychainModule(context);
        Thread thread = new Thread(new Runnable() { // from class: com.ifriend.keychain.KeychainModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                KeychainModule.this.internalWarmingBestCipher();
            }
        }, "keychain-warming-up");
        thread.setDaemon(true);
        thread.start();
        return keychainModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalWarmingBestCipher() {
        try {
            long nanoTime = System.nanoTime();
            Log.v(KEYCHAIN_MODULE, "warming up started at " + nanoTime);
            CipherStorageBase cipherStorageBase = (CipherStorageBase) getCipherStorageForCurrentAPILevel();
            cipherStorageBase.getCachedInstance();
            cipherStorageBase.generateKeyAndStoreUnderAlias(WARMING_UP_ALIAS, cipherStorageBase.supportsSecureHardware() ? SecurityLevel.SECURE_HARDWARE : SecurityLevel.SECURE_SOFTWARE);
            cipherStorageBase.getKeyStoreAndLoad();
            Log.v(KEYCHAIN_MODULE, "warming up takes: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime) + " ms");
        } catch (Throwable th) {
            Log.e(KEYCHAIN_MODULE, "warming up failed!", th);
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SecurityLevel.ANY.jsName(), SecurityLevel.ANY.name());
        hashMap.put(SecurityLevel.SECURE_SOFTWARE.jsName(), SecurityLevel.SECURE_SOFTWARE.name());
        hashMap.put(SecurityLevel.SECURE_HARDWARE.jsName(), SecurityLevel.SECURE_HARDWARE.name());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setGenericPassword(String str, String str2, String str3, Map<String, Object> map, Promise promise) {
        try {
            throwIfEmptyLoginPassword(str2, str3);
            SecurityLevel securityLevelOrDefault = getSecurityLevelOrDefault(map);
            CipherStorage selectedStorage = getSelectedStorage(map);
            throwIfInsufficientLevel(selectedStorage, securityLevelOrDefault);
            this.prefsStorage.storeEncryptedEntry(str, selectedStorage.encrypt(str, str2, str3, securityLevelOrDefault));
            HashMap hashMap = new HashMap();
            hashMap.put("service", str);
            hashMap.put(Maps.STORAGE, selectedStorage.getCipherStorageName());
            promise.resolve(hashMap);
        } catch (CryptoFailedException e) {
            Log.e(KEYCHAIN_MODULE, e.getMessage(), e);
            promise.reject(Errors.E_CRYPTO_FAILED, e);
        } catch (EmptyParameterException e2) {
            Log.e(KEYCHAIN_MODULE, e2.getMessage(), e2);
            promise.reject(Errors.E_EMPTY_PARAMETERS, e2);
        } catch (Throwable th) {
            Log.e(KEYCHAIN_MODULE, th.getMessage(), th);
            promise.reject(Errors.E_UNKNOWN_ERROR, th);
        }
    }

    public void setGenericPasswordForOptions(Map<String, Object> map, String str, String str2, Promise promise) {
        setGenericPassword(getServiceOrDefault(map), str, str2, map, promise);
    }

    private CipherStorage getSelectedStorage(Map<String, Object> map) throws CryptoFailedException {
        boolean useBiometry = getUseBiometry(getAccessControlOrDefault(map));
        String specificStorageOrDefault = getSpecificStorageOrDefault(map);
        CipherStorage cipherStorageByName = specificStorageOrDefault != null ? getCipherStorageByName(specificStorageOrDefault) : null;
        return cipherStorageByName == null ? getCipherStorageForCurrentAPILevel(useBiometry) : cipherStorageByName;
    }

    public void getGenericPassword(String str, Map<String, Object> map, Promise promise) {
        CipherStorage cipherStorageByName;
        try {
            PrefsStorage.ResultSet encryptedEntry = this.prefsStorage.getEncryptedEntry(str);
            if (encryptedEntry == null) {
                Log.e(KEYCHAIN_MODULE, "No entry found for service: " + str);
                promise.resolve(false);
                return;
            }
            String str2 = encryptedEntry.cipherStorageName;
            String securityRulesOrDefault = getSecurityRulesOrDefault(map);
            BiometricPrompt.PromptInfo promptInfo = getPromptInfo(map);
            if (securityRulesOrDefault.equals(Rules.AUTOMATIC_UPGRADE) && str2.equals(KnownCiphers.FB)) {
                cipherStorageByName = getCipherStorageForCurrentAPILevel(getUseBiometry(getAccessControlOrDefault(map)));
            } else {
                cipherStorageByName = getCipherStorageByName(str2);
            }
            CipherStorage.DecryptionResult decryptCredentials = decryptCredentials(str, cipherStorageByName, encryptedEntry, securityRulesOrDefault, promptInfo);
            HashMap hashMap = new HashMap();
            hashMap.put("service", str);
            hashMap.put("username", (String) decryptCredentials.username);
            hashMap.put("password", (String) decryptCredentials.password);
            hashMap.put(Maps.STORAGE, cipherStorageByName.getCipherStorageName());
            promise.resolve(hashMap);
        } catch (CryptoFailedException e) {
            Log.e(KEYCHAIN_MODULE, e.getMessage());
            promise.reject(Errors.E_CRYPTO_FAILED, e);
        } catch (KeyStoreAccessException e2) {
            Log.e(KEYCHAIN_MODULE, e2.getMessage());
            promise.reject(Errors.E_KEYSTORE_ACCESS_ERROR, e2);
        } catch (Throwable th) {
            Log.e(KEYCHAIN_MODULE, th.getMessage(), th);
            promise.reject(Errors.E_UNKNOWN_ERROR, th);
        }
    }

    public void getAllGenericPasswordServices(Promise promise) {
        try {
            promise.resolve(doGetAllGenericPasswordServices().toArray());
        } catch (KeyStoreAccessException e) {
            promise.reject(Errors.E_KEYSTORE_ACCESS_ERROR, e);
        }
    }

    private Collection<String> doGetAllGenericPasswordServices() throws KeyStoreAccessException {
        Set<String> usedCipherNames = this.prefsStorage.getUsedCipherNames();
        ArrayList<CipherStorage> arrayList = new ArrayList(usedCipherNames.size());
        for (String str : usedCipherNames) {
            arrayList.add(getCipherStorageByName(str));
        }
        HashSet hashSet = new HashSet();
        for (CipherStorage cipherStorage : arrayList) {
            for (String str2 : cipherStorage.getAllKeys()) {
                if (!str2.equals(WARMING_UP_ALIAS)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public void getGenericPasswordForOptions(Map<String, Object> map, Promise promise) {
        getGenericPassword(getServiceOrDefault(map), map, promise);
    }

    public void resetGenericPassword(String str, Promise promise) {
        CipherStorage cipherStorageByName;
        try {
            PrefsStorage.ResultSet encryptedEntry = this.prefsStorage.getEncryptedEntry(str);
            if (encryptedEntry != null && (cipherStorageByName = getCipherStorageByName(encryptedEntry.cipherStorageName)) != null) {
                cipherStorageByName.removeKey(str);
            }
            this.prefsStorage.removeEntry(str);
            promise.resolve(true);
        } catch (KeyStoreAccessException e) {
            Log.e(KEYCHAIN_MODULE, e.getMessage());
            promise.reject(Errors.E_KEYSTORE_ACCESS_ERROR, e);
        } catch (Throwable th) {
            Log.e(KEYCHAIN_MODULE, th.getMessage(), th);
            promise.reject(Errors.E_UNKNOWN_ERROR, th);
        }
    }

    public void resetGenericPasswordForOptions(Map<String, Object> map, Promise promise) {
        resetGenericPassword(getServiceOrDefault(map), promise);
    }

    public void hasInternetCredentialsForServer(String str, Promise promise) {
        String aliasOrDefault = getAliasOrDefault(str);
        PrefsStorage.ResultSet encryptedEntry = this.prefsStorage.getEncryptedEntry(aliasOrDefault);
        if (encryptedEntry == null) {
            Log.e(KEYCHAIN_MODULE, "No entry found for service: " + aliasOrDefault);
            promise.resolve(false);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("service", aliasOrDefault);
        hashMap.put(Maps.STORAGE, encryptedEntry.cipherStorageName);
        promise.resolve(hashMap);
    }

    public void setInternetCredentialsForServer(String str, String str2, String str3, Map<String, Object> map, Promise promise) {
        setGenericPassword(str, str2, str3, map, promise);
    }

    public void getInternetCredentialsForServer(String str, Map<String, Object> map, Promise promise) {
        getGenericPassword(str, map, promise);
    }

    public void resetInternetCredentialsForServer(String str, Promise promise) {
        resetGenericPassword(str, promise);
    }

    public void getSupportedBiometryType(Promise promise) {
        try {
            String str = null;
            if (DeviceAvailability.isStrongBiometricAuthAvailable(getContext())) {
                if (isFingerprintAuthAvailable()) {
                    str = FINGERPRINT_SUPPORTED_NAME;
                } else if (isFaceAuthAvailable()) {
                    str = FACE_SUPPORTED_NAME;
                } else if (isIrisAuthAvailable()) {
                    str = IRIS_SUPPORTED_NAME;
                }
            }
            promise.resolve(str);
        } catch (Exception e) {
            Log.e(KEYCHAIN_MODULE, e.getMessage(), e);
            promise.reject(Errors.E_SUPPORTED_BIOMETRY_ERROR, e);
        } catch (Throwable th) {
            Log.e(KEYCHAIN_MODULE, th.getMessage(), th);
            promise.reject(Errors.E_UNKNOWN_ERROR, th);
        }
    }

    public void getSecurityLevel(Map<String, Object> map, Promise promise) {
        promise.resolve(getSecurityLevel(getUseBiometry(getAccessControlOrDefault(map))).name());
    }

    private static String getServiceOrDefault(Map<String, Object> map) {
        return getAliasOrDefault((map == null || !map.containsKey("service")) ? null : (String) map.get("service"));
    }

    private static String getSecurityRulesOrDefault(Map<String, Object> map) {
        return getSecurityRulesOrDefault(map, "none");
    }

    private static String getSecurityRulesOrDefault(Map<String, Object> map, String str) {
        String str2 = (map == null || !map.containsKey(Maps.RULES)) ? null : (String) map.get(Maps.RULES);
        return str2 == null ? str : str2;
    }

    private static String getSpecificStorageOrDefault(Map<String, Object> map) {
        if (map == null || !map.containsKey(Maps.STORAGE)) {
            return null;
        }
        return (String) map.get(Maps.STORAGE);
    }

    private static String getAccessControlOrDefault(Map<String, Object> map) {
        return getAccessControlOrDefault(map, AccessControl.NONE);
    }

    private static String getAccessControlOrDefault(Map<String, Object> map, String str) {
        String str2 = (map == null || !map.containsKey(Maps.ACCESS_CONTROL)) ? null : (String) map.get(Maps.ACCESS_CONTROL);
        return str2 == null ? str : str2;
    }

    private static SecurityLevel getSecurityLevelOrDefault(Map<String, Object> map) {
        return getSecurityLevelOrDefault(map, SecurityLevel.ANY.name());
    }

    private static SecurityLevel getSecurityLevelOrDefault(Map<String, Object> map, String str) {
        String str2 = (map == null || !map.containsKey(Maps.SECURITY_LEVEL)) ? null : (String) map.get(Maps.SECURITY_LEVEL);
        if (str2 != null) {
            str = str2;
        }
        return SecurityLevel.valueOf(str);
    }

    public static boolean getUseBiometry(String str) {
        return AccessControl.BIOMETRY_ANY.equals(str) || AccessControl.BIOMETRY_CURRENT_SET.equals(str) || AccessControl.BIOMETRY_ANY_OR_DEVICE_PASSCODE.equals(str) || AccessControl.BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE.equals(str);
    }

    private void addCipherStorageToMap(CipherStorage cipherStorage) {
        this.cipherStorageMap.put(cipherStorage.getCipherStorageName(), cipherStorage);
    }

    private static BiometricPrompt.PromptInfo getPromptInfo(Map<String, Object> map) {
        Map hashMap = (map == null || !map.containsKey(Maps.AUTH_PROMPT)) ? new HashMap() : (Map) map.get(Maps.AUTH_PROMPT);
        BiometricPrompt.PromptInfo.Builder builder = new BiometricPrompt.PromptInfo.Builder();
        builder.setTitle("Authenticate to retrieve secret");
        builder.setNegativeButtonText("Cancel");
        if (hashMap != null && hashMap.containsKey("title")) {
            String str = (String) hashMap.get("title");
            builder.setTitle(str);
            builder.setTitle(str);
        }
        if (hashMap != null && hashMap.containsKey(AuthPromptOptions.SUBTITLE)) {
            builder.setSubtitle((String) hashMap.get(AuthPromptOptions.SUBTITLE));
        }
        if (hashMap != null && hashMap.containsKey("description")) {
            builder.setDescription((String) hashMap.get("description"));
        }
        if (hashMap != null && hashMap.containsKey(AuthPromptOptions.CANCEL)) {
            builder.setNegativeButtonText((String) hashMap.get(AuthPromptOptions.CANCEL));
        }
        builder.setAllowedAuthenticators(15);
        builder.setConfirmationRequired(false);
        return builder.build();
    }

    private CipherStorage.DecryptionResult decryptCredentials(String str, CipherStorage cipherStorage, PrefsStorage.ResultSet resultSet, String str2, BiometricPrompt.PromptInfo promptInfo) throws CryptoFailedException, KeyStoreAccessException {
        String str3 = resultSet.cipherStorageName;
        if (str3.equals(cipherStorage.getCipherStorageName())) {
            return decryptToResult(str, cipherStorage, resultSet, promptInfo);
        }
        CipherStorage cipherStorageByName = getCipherStorageByName(str3);
        if (cipherStorageByName == null) {
            throw new KeyStoreAccessException("Wrong cipher storage name '" + str3 + "' or cipher not available");
        }
        CipherStorage.DecryptionResult decryptToResult = decryptToResult(str, cipherStorageByName, resultSet, promptInfo);
        if (Rules.AUTOMATIC_UPGRADE.equals(str2)) {
            try {
                migrateCipherStorage(str, cipherStorage, cipherStorageByName, decryptToResult);
            } catch (CryptoFailedException unused) {
                Log.w(KEYCHAIN_MODULE, "Migrating to a less safe storage is not allowed. Keeping the old one");
            }
        }
        return decryptToResult;
    }

    private CipherStorage.DecryptionResult decryptToResult(String str, CipherStorage cipherStorage, PrefsStorage.ResultSet resultSet, BiometricPrompt.PromptInfo promptInfo) throws CryptoFailedException {
        DecryptionResultHandler interactiveHandler = getInteractiveHandler(cipherStorage, promptInfo);
        cipherStorage.decrypt(interactiveHandler, str, (byte[]) resultSet.username, (byte[]) resultSet.password, SecurityLevel.ANY);
        CryptoFailedException.reThrowOnError(interactiveHandler.getError());
        if (interactiveHandler.getResult() == null) {
            throw new CryptoFailedException("No decryption results and no error. Something deeply wrong!");
        }
        return interactiveHandler.getResult();
    }

    protected DecryptionResultHandler getInteractiveHandler(CipherStorage cipherStorage, BiometricPrompt.PromptInfo promptInfo) {
        getContext();
        return new DecryptionResultHandlerNonInteractive();
    }

    void migrateCipherStorage(String str, CipherStorage cipherStorage, CipherStorage cipherStorage2, CipherStorage.DecryptionResult decryptionResult) throws KeyStoreAccessException, CryptoFailedException {
        this.prefsStorage.storeEncryptedEntry(str, cipherStorage.encrypt(str, (String) decryptionResult.username, (String) decryptionResult.password, decryptionResult.getSecurityLevel()));
        cipherStorage2.removeKey(str);
    }

    private Context getContext() {
        return this.context;
    }

    CipherStorage getCipherStorageForCurrentAPILevel() throws CryptoFailedException {
        return getCipherStorageForCurrentAPILevel(true);
    }

    CipherStorage getCipherStorageForCurrentAPILevel(boolean z) throws CryptoFailedException {
        int i = Build.VERSION.SDK_INT;
        boolean z2 = z && (isFingerprintAuthAvailable() || isFaceAuthAvailable() || isIrisAuthAvailable());
        CipherStorage cipherStorage = null;
        for (CipherStorage cipherStorage2 : this.cipherStorageMap.values()) {
            Log.d(KEYCHAIN_MODULE, "Probe cipher storage: " + cipherStorage2.getClass().getSimpleName());
            int minSupportedApiLevel = cipherStorage2.getMinSupportedApiLevel();
            int capabilityLevel = cipherStorage2.getCapabilityLevel();
            if ((minSupportedApiLevel <= i) && (cipherStorage == null || capabilityLevel >= cipherStorage.getCapabilityLevel())) {
                if (!cipherStorage2.isBiometrySupported() || z2) {
                    cipherStorage = cipherStorage2;
                }
            }
        }
        if (cipherStorage == null) {
            throw new CryptoFailedException("Unsupported Android SDK " + Build.VERSION.SDK_INT);
        }
        Log.d(KEYCHAIN_MODULE, "Selected storage: " + cipherStorage.getClass().getSimpleName());
        return cipherStorage;
    }

    public static void throwIfEmptyLoginPassword(String str, String str2) throws EmptyParameterException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new EmptyParameterException("you passed empty or null username/password");
        }
    }

    public static void throwIfInsufficientLevel(CipherStorage cipherStorage, SecurityLevel securityLevel) throws CryptoFailedException {
        if (!cipherStorage.securityLevel().satisfiesSafetyThreshold(securityLevel)) {
            throw new CryptoFailedException(String.format("Cipher Storage is too weak. Required security level is: %s, but only %s is provided", securityLevel.name(), cipherStorage.securityLevel().name()));
        }
    }

    CipherStorage getCipherStorageByName(String str) {
        return this.cipherStorageMap.get(str);
    }

    boolean isFingerprintAuthAvailable() {
        return DeviceAvailability.isStrongBiometricAuthAvailable(getContext()) && DeviceAvailability.isFingerprintAuthAvailable(getContext());
    }

    boolean isFaceAuthAvailable() {
        return DeviceAvailability.isStrongBiometricAuthAvailable(getContext()) && DeviceAvailability.isFaceAuthAvailable(getContext());
    }

    boolean isIrisAuthAvailable() {
        return DeviceAvailability.isStrongBiometricAuthAvailable(getContext()) && DeviceAvailability.isIrisAuthAvailable(getContext());
    }

    boolean isSecureHardwareAvailable() {
        try {
            return getCipherStorageForCurrentAPILevel().supportsSecureHardware();
        } catch (CryptoFailedException unused) {
            return false;
        }
    }

    private SecurityLevel getSecurityLevel(boolean z) {
        try {
            CipherStorage cipherStorageForCurrentAPILevel = getCipherStorageForCurrentAPILevel(z);
            if (!cipherStorageForCurrentAPILevel.securityLevel().satisfiesSafetyThreshold(SecurityLevel.SECURE_SOFTWARE)) {
                return SecurityLevel.ANY;
            }
            if (cipherStorageForCurrentAPILevel.supportsSecureHardware()) {
                return SecurityLevel.SECURE_HARDWARE;
            }
            return SecurityLevel.SECURE_SOFTWARE;
        } catch (CryptoFailedException e) {
            Log.w(KEYCHAIN_MODULE, "Security Level Exception: " + e.getMessage(), e);
            return SecurityLevel.ANY;
        }
    }
}

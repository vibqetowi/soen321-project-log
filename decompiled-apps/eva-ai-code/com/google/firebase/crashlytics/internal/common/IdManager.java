package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private final Context appContext;
    private final String appIdentifier;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private InstallIdProvider.InstallIds installIds;
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private static final String FORWARD_SLASH_REGEX = Pattern.quote(RemoteSettings.FORWARD_SLASH_STRING);

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.installerPackageNameProvider = new InstallerPackageNameProvider();
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public synchronized InstallIdProvider.InstallIds getInstallIds() {
        if (!shouldRefresh()) {
            return this.installIds;
        }
        Logger.getLogger().v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
        String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
        Logger logger = Logger.getLogger();
        logger.v("Cached Firebase Installation ID: " + string);
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            String fetchTrueFid = fetchTrueFid();
            Logger logger2 = Logger.getLogger();
            logger2.v("Fetched Firebase Installation ID: " + fetchTrueFid);
            if (fetchTrueFid == null) {
                fetchTrueFid = string == null ? createSyntheticFid() : string;
            }
            if (fetchTrueFid.equals(string)) {
                this.installIds = InstallIdProvider.InstallIds.create(readCachedCrashlyticsInstallId(sharedPrefs), fetchTrueFid);
            } else {
                this.installIds = InstallIdProvider.InstallIds.create(createAndCacheCrashlyticsInstallId(fetchTrueFid, sharedPrefs), fetchTrueFid);
            }
        } else if (isSyntheticFid(string)) {
            this.installIds = InstallIdProvider.InstallIds.createWithoutFid(readCachedCrashlyticsInstallId(sharedPrefs));
        } else {
            this.installIds = InstallIdProvider.InstallIds.createWithoutFid(createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs));
        }
        Logger logger3 = Logger.getLogger();
        logger3.v("Install IDs: " + this.installIds);
        return this.installIds;
    }

    private boolean shouldRefresh() {
        InstallIdProvider.InstallIds installIds = this.installIds;
        return installIds == null || (installIds.getFirebaseInstallationId() == null && this.dataCollectionArbiter.isAutomaticDataCollectionEnabled());
    }

    static String createSyntheticFid() {
        return SYNTHETIC_FID_PREFIX + UUID.randomUUID().toString();
    }

    static boolean isSyntheticFid(String str) {
        return str != null && str.startsWith(SYNTHETIC_FID_PREFIX);
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public String fetchTrueFid() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(this.firebaseInstallationsApi.getId());
        } catch (Exception e) {
            Logger.getLogger().w("Failed to retrieve Firebase Installation ID.", e);
            return null;
        }
    }

    private synchronized String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String formatId;
        formatId = formatId(UUID.randomUUID().toString());
        Logger logger = Logger.getLogger();
        logger.v("Created new Crashlytics installation ID: " + formatId + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString(PREFKEY_FIREBASE_IID, str).apply();
        return formatId;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}

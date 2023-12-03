package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1hSDK;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AFe1fSDK extends AFe1kSDK {
    public final Map<String, Object> AFInAppEventParameterName;

    public AFe1fSDK(Runnable runnable) {
        super("store", "google", runnable);
        this.AFInAppEventParameterName = new HashMap();
    }

    private static boolean AFKeystoreWrapper(Context context) {
        if (!AFe1kSDK.values(context)) {
            return false;
        }
        try {
            if (AFb1wSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void valueOf(final Context context) {
        if (!AFKeystoreWrapper(context)) {
            return;
        }
        this.afDebugLog = System.currentTimeMillis();
        this.afRDLog = AFe1hSDK.AFa1zSDK.STARTED;
        addObserver(new AFe1hSDK.AnonymousClass2());
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
            build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.AFe1fSDK.2
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog("Install Referrer service disconnected");
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i6) {
                    AFe1fSDK.this.AFInAppEventParameterName.put("code", String.valueOf(i6));
                    AFe1fSDK.this.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFKeystoreWrapper(context, "com.android.vending")));
                    AFe1fSDK.this.AFInAppEventType.put("api_ver_name", AFb1wSDK.AFInAppEventParameterName(context, "com.android.vending"));
                    if (i6 != -1) {
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        AFLogger.afWarnLog("responseCode not found.");
                                    } else {
                                        AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                                        AFe1fSDK.this.AFInAppEventType.put("response", "DEVELOPER_ERROR");
                                    }
                                } else {
                                    AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                                    AFe1fSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                                }
                            } else {
                                AFe1fSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                                AFLogger.afWarnLog("InstallReferrer not supported");
                            }
                        } else {
                            AFe1fSDK.this.AFInAppEventType.put("response", "OK");
                            try {
                                AFLogger.afDebugLog("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        AFe1fSDK.this.AFInAppEventParameterName.put("val", installReferrer2);
                                        AFe1fSDK.this.AFInAppEventType.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    AFe1fSDK.this.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    AFe1fSDK.this.AFInAppEventType.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    AFe1fSDK.this.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                                    AFe1fSDK.this.AFInAppEventType.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        AFe1fSDK.this.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        AFe1fSDK.this.AFInAppEventType.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                                    AFe1fSDK.this.AFInAppEventParameterName.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th2) {
                                AFLogger.afWarnLog("Failed to get install referrer: " + th2.getMessage());
                                AFe1fSDK.this.AFInAppEventParameterName.put("err", th2.getMessage());
                            }
                        }
                    } else {
                        AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                        AFe1fSDK.this.AFInAppEventType.put("response", "SERVICE_DISCONNECTED");
                    }
                    AFLogger.afDebugLog("Install Referrer collected locally");
                    AFe1fSDK.this.AFKeystoreWrapper();
                    build.endConnection();
                }
            });
        } catch (Throwable th2) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th2);
        }
    }
}

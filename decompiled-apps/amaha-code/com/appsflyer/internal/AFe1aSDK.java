package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1hSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class AFe1aSDK extends AFe1kSDK {
    public AFe1aSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (!AFe1kSDK.values(context)) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void valueOf(final Context context) {
        if (!AFInAppEventParameterName(context)) {
            return;
        }
        this.afDebugLog = System.currentTimeMillis();
        this.afRDLog = AFe1hSDK.AFa1zSDK.STARTED;
        addObserver(new AFe1hSDK.AnonymousClass2());
        final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
        build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFe1aSDK.2
            public final void onGetAppsReferrerSetupFinished(int i6) {
                AFe1aSDK.this.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks")));
                AFe1aSDK.this.AFInAppEventType.put("api_ver_name", AFb1wSDK.AFInAppEventParameterName(context, "com.xiaomi.mipicks"));
                if (i6 != -1) {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        AFLogger.afWarnLog("responseCode not found.");
                                    } else {
                                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                        AFe1aSDK.this.AFInAppEventType.put("response", "PERMISSION_ERROR");
                                    }
                                } else {
                                    AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                    AFe1aSDK.this.AFInAppEventType.put("response", "DEVELOPER_ERROR");
                                }
                            } else {
                                AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                AFe1aSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFe1aSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                        }
                    } else {
                        AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFe1aSDK.AFInAppEventType.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFe1aSDK.AFInAppEventType.put("referrer", installReferrer2);
                                }
                                aFe1aSDK.AFInAppEventType.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFe1aSDK.AFInAppEventType.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFe1aSDK.AFInAppEventType.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            AFLogger.afWarnLog(sb2.toString());
                        }
                    }
                } else {
                    AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                    AFe1aSDK.this.AFInAppEventType.put("response", "SERVICE_DISCONNECTED");
                }
                AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                AFe1aSDK.this.AFKeystoreWrapper();
                build.endConnection();
            }

            public final void onGetAppsServiceDisconnected() {
            }
        });
    }
}

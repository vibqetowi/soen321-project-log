package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.aa;
import com.appsflyer.oaid.OaidClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
public final class ab {
    static String AFInAppEventParameterName;
    static Boolean AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;
    public final bm valueOf;

    public ab() {
    }

    public static g AFInAppEventType(ContentResolver contentResolver) {
        String str;
        if (AFInAppEventType() && contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                return new g(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.valueOf("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new g(str, Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g AFInAppEventType(Context context) {
        Boolean bool;
        OaidClient.Info fetch;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = AFInAppEventParameterName;
        boolean z = str != null;
        if (!z) {
            Boolean bool2 = AFInAppEventType;
            if ((bool2 != null && bool2.booleanValue()) || (AFInAppEventType == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    fetch = oaidClient.fetch();
                } catch (Throwable unused) {
                    str = null;
                }
                if (fetch != null) {
                    String id = fetch.getId();
                    try {
                        bool = fetch.getLat();
                        str = id;
                    } catch (Throwable unused2) {
                        str = id;
                        AFLogger.AFInAppEventParameterName("No OAID library");
                        bool = null;
                        if (str == null) {
                        }
                    }
                    if (str == null) {
                        g gVar = new g(str, bool);
                        gVar.AFInAppEventParameterName = Boolean.valueOf(z);
                        return gVar;
                    }
                    return null;
                }
            }
            bool = null;
            str = null;
            if (str == null) {
            }
        }
        bool = null;
        if (str == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r8.length() == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g AFKeystoreWrapper(Context context, Map<String, Object> map) {
        int i;
        boolean z;
        Boolean bool;
        String string;
        Boolean bool2;
        boolean z2;
        boolean z3;
        AdvertisingIdClient.Info advertisingIdInfo;
        String str = null;
        if (AFInAppEventType()) {
            AFLogger.values("Trying to fetch GAID..");
            StringBuilder sb = new StringBuilder();
            try {
                i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            } catch (Throwable unused) {
                i = -1;
            }
            try {
                Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            } catch (Throwable th) {
                th = th;
                z = false;
                bool = null;
            }
            if (advertisingIdInfo != null) {
                String str2 = advertisingIdInfo.getId();
                try {
                    bool2 = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                    if (str2 != null) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            bool = bool2;
                            str = str2;
                            z = true;
                            AFLogger.valueOf(th.getMessage(), th);
                            sb.append(th.getClass().getSimpleName());
                            sb.append(" |");
                            AFLogger.values("WARNING: Google Play Services is missing.");
                            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                                try {
                                    aa.e AFKeystoreWrapper = aa.AFKeystoreWrapper(context);
                                    string = AFKeystoreWrapper.AFInAppEventParameterName;
                                    bool2 = Boolean.valueOf(AFKeystoreWrapper.AFKeystoreWrapper());
                                    if (string == null || string.length() == 0) {
                                        sb.append("emptyOrNull (bypass) |");
                                    }
                                } catch (Throwable th3) {
                                    AFLogger.valueOf(th3.getMessage(), th3);
                                    sb.append(th3.getClass().getSimpleName());
                                    sb.append(" |");
                                    string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                    Boolean valueOf = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                    if (th3.getLocalizedMessage() != null) {
                                        AFLogger.values(th3.getLocalizedMessage());
                                    } else {
                                        AFLogger.values(th3.toString());
                                    }
                                    bool2 = valueOf;
                                }
                                z2 = z;
                                str2 = string;
                            } else {
                                z2 = z;
                                str2 = str;
                                bool2 = bool;
                            }
                            z3 = z2;
                            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                            }
                            if (sb.length() > 0) {
                            }
                            if (str2 != null) {
                                map.put("advertiserId", str2);
                                map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                                AppsFlyerProperties.getInstance().set("advertiserId", str2);
                                AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                                map.put("isGaidWithGps", String.valueOf(z3));
                            }
                            return new g(str2, bool2);
                        }
                    }
                    sb.append("emptyOrNull |");
                    z3 = true;
                } catch (Throwable th4) {
                    th = th4;
                    bool = null;
                    str = str2;
                    z = false;
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                    str2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                    bool2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                    sb.append("context = android.app.ReceiverRestrictedContext |");
                }
                if (sb.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i);
                    sb2.append(": ");
                    sb2.append((Object) sb);
                    map.put("gaidError", sb2.toString());
                }
                if (str2 != null && bool2 != null) {
                    map.put("advertiserId", str2);
                    map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                    AppsFlyerProperties.getInstance().set("advertiserId", str2);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                    map.put("isGaidWithGps", String.valueOf(z3));
                }
                return new g(str2, bool2);
            }
            sb.append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        }
        return null;
    }

    private static boolean AFInAppEventType() {
        Boolean bool = AFInAppEventType;
        return bool == null || bool.booleanValue();
    }

    public ab(bm bmVar, ExecutorService executorService) {
        this.valueOf = bmVar;
        this.AFKeystoreWrapper = executorService;
    }
}

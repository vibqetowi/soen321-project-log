package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.oaid.OaidClient;
import g9.a;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import s9.e;
/* loaded from: classes.dex */
public final class AFb1zSDK {
    static Boolean AFKeystoreWrapper;
    static String valueOf;
    public final AFc1tSDK AFInAppEventType;
    private final ExecutorService values;

    public AFb1zSDK() {
    }

    public AFb1zSDK(AFc1tSDK aFc1tSDK, ExecutorService executorService) {
        this.AFInAppEventType = aFc1tSDK;
        this.values = executorService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r8.length() == 0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFa1uSDK AFKeystoreWrapper(Context context, Map<String, Object> map) {
        int i6;
        Boolean bool;
        boolean z10;
        String string;
        Boolean bool2;
        boolean z11;
        String str;
        boolean z12;
        String str2 = null;
        if (!valueOf()) {
            return null;
        }
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder sb2 = new StringBuilder();
        try {
            i6 = e.f31337d.c(context);
        } catch (Throwable unused) {
            i6 = -1;
        }
        try {
            a.C0248a a10 = g9.a.a(context);
            str = a10.f16386a;
            try {
                bool2 = Boolean.valueOf(a10.f16387b);
                if (str != null) {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        bool = bool2;
                        str2 = str;
                        z10 = true;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        sb2.append(th.getClass().getSimpleName());
                        sb2.append(" |");
                        AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                        }
                        z12 = z11;
                        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                        }
                        if (sb2.length() > 0) {
                        }
                        if (str != null) {
                        }
                        return new AFa1uSDK(str, bool2);
                    }
                }
                sb2.append("emptyOrNull |");
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                bool = null;
                str2 = str;
                z10 = false;
                AFLogger.afErrorLog(th.getMessage(), th);
                sb2.append(th.getClass().getSimpleName());
                sb2.append(" |");
                AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                    try {
                        AFa1fSDK.AFa1zSDK AFKeystoreWrapper2 = AFa1fSDK.AFKeystoreWrapper(context);
                        string = AFKeystoreWrapper2.valueOf;
                        bool2 = Boolean.valueOf(AFKeystoreWrapper2.AFInAppEventParameterName());
                        if (string == null || string.length() == 0) {
                            sb2.append("emptyOrNull (bypass) |");
                        }
                    } catch (Throwable th4) {
                        AFLogger.afErrorLog(th4.getMessage(), th4);
                        sb2.append(th4.getClass().getSimpleName());
                        sb2.append(" |");
                        string = AppsFlyerProperties.getInstance().getString("advertiserId");
                        Boolean valueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                        if (th4.getLocalizedMessage() != null) {
                            AFLogger.afInfoLog(th4.getLocalizedMessage());
                        } else {
                            AFLogger.afInfoLog(th4.toString());
                        }
                        bool2 = valueOf2;
                    }
                    z11 = z10;
                    str = string;
                } else {
                    z11 = z10;
                    str = str2;
                    bool2 = bool;
                }
                z12 = z11;
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                }
                if (sb2.length() > 0) {
                }
                if (str != null) {
                    map.put("advertiserId", str);
                    map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                    AppsFlyerProperties.getInstance().set("advertiserId", str);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                    map.put("isGaidWithGps", String.valueOf(z12));
                }
                return new AFa1uSDK(str, bool2);
            }
        } catch (Throwable th5) {
            th = th5;
            bool = null;
        }
        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
            str = AppsFlyerProperties.getInstance().getString("advertiserId");
            bool2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
            sb2.append("context = android.app.ReceiverRestrictedContext |");
        }
        if (sb2.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i6);
            sb3.append(": ");
            sb3.append((Object) sb2);
            map.put("gaidError", sb3.toString());
        }
        if (str != null && bool2 != null) {
            map.put("advertiserId", str);
            map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
            AppsFlyerProperties.getInstance().set("advertiserId", str);
            AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
            map.put("isGaidWithGps", String.valueOf(z12));
        }
        return new AFa1uSDK(str, bool2);
    }

    public static AFa1uSDK valueOf(ContentResolver contentResolver) {
        String str;
        if (valueOf() && contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i6 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i6 == 0) {
                return new AFa1uSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i6 == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
                str = "";
            }
            return new AFa1uSDK(str, Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFa1uSDK values(Context context) {
        boolean z10;
        Boolean bool;
        OaidClient.Info fetch;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = valueOf;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Boolean bool2 = AFKeystoreWrapper;
            if ((bool2 != null && bool2.booleanValue()) || (AFKeystoreWrapper == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    fetch = oaidClient.fetch();
                } catch (Throwable unused) {
                    str = null;
                }
                if (fetch != null) {
                    String id2 = fetch.getId();
                    try {
                        bool = fetch.getLat();
                        str = id2;
                    } catch (Throwable unused2) {
                        str = id2;
                        AFLogger.afDebugLog("No OAID library");
                        bool = null;
                        if (str != null) {
                        }
                    }
                    if (str != null) {
                        return null;
                    }
                    AFa1uSDK aFa1uSDK = new AFa1uSDK(str, bool);
                    aFa1uSDK.AFInAppEventType = Boolean.valueOf(z10);
                    return aFa1uSDK;
                }
            }
            bool = null;
            str = null;
            if (str != null) {
            }
        }
        bool = null;
        if (str != null) {
        }
    }

    private static boolean valueOf() {
        Boolean bool = AFKeystoreWrapper;
        return bool == null || bool.booleanValue();
    }
}

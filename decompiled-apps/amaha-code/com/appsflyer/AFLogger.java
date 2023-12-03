package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1xSDK;
/* loaded from: classes.dex */
public class AFLogger {
    private static final long AFInAppEventType = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventParameterName;

        LogLevel(int i6) {
            this.AFInAppEventParameterName = i6;
        }

        public final int getLevel() {
            return this.AFInAppEventParameterName;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.9.1", AFKeystoreWrapper(str, false));
        }
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventParameterName("W", AFKeystoreWrapper(str, true));
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    private static String AFKeystoreWrapper(String str, boolean z10) {
        if (str == null) {
            str = "null";
        }
        if (z10 || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(System.currentTimeMillis() - AFInAppEventType);
            sb2.append(") [");
            sb2.append(Thread.currentThread().getName());
            sb2.append("] ");
            sb2.append(str);
            return sb2.toString();
        }
        return str;
    }

    public static void afDebugLog(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.9.1", AFKeystoreWrapper(str, false));
        }
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventParameterName("D", AFKeystoreWrapper(str, true));
    }

    public static void afErrorLog(String str, Throwable th2) {
        values(str, th2, true, false);
    }

    public static void afInfoLog(String str, boolean z10) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.9.1", AFKeystoreWrapper(str, false));
        }
        if (z10) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventParameterName("I", AFKeystoreWrapper(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.9.1", AFKeystoreWrapper(str, false));
        }
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventParameterName("V", AFKeystoreWrapper(str, true));
    }

    public static void afWarnLog(String str) {
        AFInAppEventParameterName(str);
    }

    private static void values(String str, Throwable th2, boolean z10, boolean z11) {
        long j10;
        if (AFInAppEventType(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(th2.getClass().getSimpleName());
                sb2.append(" at ");
                sb2.append(th2.getStackTrace()[0].toString());
                str = sb2.toString();
            }
            String AFKeystoreWrapper = AFKeystoreWrapper(str, false);
            if (z11) {
                Log.e("AppsFlyer_6.9.1", AFKeystoreWrapper, th2);
            } else if (z10) {
                Log.d("AppsFlyer_6.9.1", AFKeystoreWrapper);
            }
        }
        AFb1qSDK.AFInAppEventParameterName().values(th2);
        Application application = AFb1dSDK.AFInAppEventType;
        if (application != null) {
            SharedPreferences.Editor edit = AFb1xSDK.valueOf(application).edit();
            Application application2 = AFb1dSDK.AFInAppEventType;
            if (application2 == null) {
                j10 = -1;
            } else {
                j10 = AFb1xSDK.valueOf(application2).getLong("exception_number", 0L);
            }
            edit.putLong("exception_number", j10 + 1).apply();
        }
    }

    public static void afErrorLog(String str, Throwable th2, boolean z10) {
        values(str, th2, true, z10);
    }

    public static void afErrorLog(Throwable th2) {
        values(null, th2, false, false);
    }

    private static boolean AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void AFKeystoreWrapper(String str) {
        if (!AFInAppEventParameterName()) {
            Log.d("AppsFlyer_6.9.1", AFKeystoreWrapper(str, false));
        }
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventParameterName("F", str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }
}

package com.appsflyer;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.ac;
import com.appsflyer.internal.ak;
import com.appsflyer.internal.ay;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes2.dex */
public final class AFLogger {
    private static final long AFInAppEventType = System.currentTimeMillis();

    public static void values(String str, boolean z) {
        if (valueOf(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.5.4", AFInAppEventParameterName(str, false));
        }
        if (z) {
            ak.AFInAppEventType().AFInAppEventParameterName("I", AFInAppEventParameterName(str, true));
        }
    }

    private static String AFInAppEventParameterName(String str, boolean z) {
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        if (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            StringBuilder sb = new StringBuilder("(");
            sb.append(System.currentTimeMillis() - AFInAppEventType);
            sb.append(") [");
            sb.append(Thread.currentThread().getName());
            sb.append("] ");
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    private static void AFInAppEventParameterName(String str, Throwable th, boolean z, boolean z2) {
        if (valueOf(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String AFInAppEventParameterName = AFInAppEventParameterName(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.5.4", AFInAppEventParameterName, th);
            } else if (z) {
                Log.d("AppsFlyer_6.5.4", AFInAppEventParameterName);
            }
        }
        ak.AFInAppEventType().valueOf(th);
        if (ay.AFInAppEventParameterName != null) {
            ac.AFInAppEventType(ay.AFInAppEventParameterName).edit().putLong("exception_number", (ay.AFInAppEventParameterName == null ? -1L : ac.AFInAppEventType(ay.AFInAppEventParameterName).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    public static void valueOf(String str) {
        if (valueOf(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.5.4", AFInAppEventParameterName(str, false));
        }
        ak.AFInAppEventType().AFInAppEventParameterName(ExifInterface.LONGITUDE_WEST, AFInAppEventParameterName(str, true));
    }

    public static void AFKeystoreWrapper(String str) {
        if (valueOf(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.5.4", AFInAppEventParameterName(str, false));
        }
        ak.AFInAppEventType().AFInAppEventParameterName(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, AFInAppEventParameterName(str, true));
    }

    private static boolean valueOf(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFInAppEventType(String str) {
        if (!AFInAppEventParameterName()) {
            Log.d("AppsFlyer_6.5.4", AFInAppEventParameterName(str, false));
        }
        ak.AFInAppEventType().AFInAppEventParameterName("F", str);
    }

    private static boolean AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void values(String str) {
        values(str, true);
    }

    public static void valueOf(String str, Throwable th) {
        AFInAppEventParameterName(str, th, true, false);
    }

    public static void AFInAppEventParameterName(String str, Throwable th) {
        AFInAppEventParameterName(str, th, true, true);
    }

    public static void values(Throwable th) {
        AFInAppEventParameterName(null, th, false, false);
    }

    public static void AppsFlyer2dXConversionCallback(String str) {
        valueOf(str);
    }

    /* loaded from: classes2.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventParameterName;

        LogLevel(int i) {
            this.AFInAppEventParameterName = i;
        }

        public final int getLevel() {
            return this.AFInAppEventParameterName;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (valueOf(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.5.4", AFInAppEventParameterName(str, false));
        }
        ak.AFInAppEventType().AFInAppEventParameterName("D", AFInAppEventParameterName(str, true));
    }
}

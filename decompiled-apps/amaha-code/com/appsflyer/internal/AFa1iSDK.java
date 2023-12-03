package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
final class AFa1iSDK {

    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        static final AFa1iSDK AFInAppEventType = new AFa1iSDK();
    }

    /* loaded from: classes.dex */
    public static final class AFa1ySDK {
        final String AFInAppEventParameterName;
        final String AFInAppEventType;
        final String values;

        public AFa1ySDK(String str, String str2, String str3) {
            this.values = str;
            this.AFInAppEventType = str2;
            this.AFInAppEventParameterName = str3;
        }
    }

    private static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static AFa1ySDK values(Context context) {
        String str;
        String str2;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i6]);
                    if (AFInAppEventParameterName(networkInfo)) {
                        if (1 == networkInfo.getType()) {
                            str3 = "WIFI";
                        } else if (networkInfo.getType() == 0) {
                            str3 = "MOBILE";
                        }
                    } else {
                        i6++;
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
                if (str4 == null || str4.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        str4 = "CDMA";
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = str4;
                str4 = str2;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new AFa1ySDK(str3, str4, str2);
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFa1ySDK(str3, str4, str2);
    }
}

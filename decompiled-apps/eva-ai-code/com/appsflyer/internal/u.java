package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d {
        static final u valueOf = new u();
    }

    u() {
    }

    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {
        final String AFInAppEventType;
        final String AFKeystoreWrapper;
        final String values;

        a(String str, String str2, String str3) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventType = str2;
            this.values = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a AFInAppEventType(Context context) {
        String str;
        String str2;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!values(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
                if (str4 == null || str4.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        str4 = "CDMA";
                    }
                }
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.valueOf("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new a(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new a(str3, str4, str2);
    }
}

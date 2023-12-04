package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {
        static final v AFKeystoreWrapper = new v();
    }

    v() {
    }

    private static boolean AFInAppEventType(Context context, String[] strArr) {
        for (String str : strArr) {
            if (z.AFInAppEventType(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (60000 < (r3.getTime() - r9.getTime())) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location valueOf(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            Location lastKnownLocation = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if (lastKnownLocation2 != null || lastKnownLocation == null) {
                if (lastKnownLocation != null || lastKnownLocation2 == null) {
                }
                lastKnownLocation = lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

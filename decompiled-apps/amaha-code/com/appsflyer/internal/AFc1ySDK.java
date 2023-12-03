package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFc1ySDK implements AFd1qSDK {
    private final SharedPreferences AFKeystoreWrapper;

    public AFc1ySDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean AFInAppEventParameterName(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final String AFInAppEventType(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str, boolean z10) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void valueOf(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void values(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final long AFKeystoreWrapper(String str) {
        try {
            return this.AFKeystoreWrapper.getLong(str, 0L);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return 0L;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final int valueOf(String str) {
        try {
            return this.AFKeystoreWrapper.getInt(str, 0);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, long j10) {
        this.AFKeystoreWrapper.edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventType(String str, int i6) {
        this.AFKeystoreWrapper.edit().putInt(str, i6).apply();
    }
}

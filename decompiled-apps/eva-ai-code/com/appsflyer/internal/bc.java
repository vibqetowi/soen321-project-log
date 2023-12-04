package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
/* loaded from: classes2.dex */
public final class bc implements bv {
    private final SharedPreferences valueOf;

    public bc(SharedPreferences sharedPreferences) {
        this.valueOf = sharedPreferences;
    }

    @Override // com.appsflyer.internal.bv
    public final void AFInAppEventParameterName(String str, String str2) {
        this.valueOf.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.bv
    public final String AFInAppEventType(String str, String str2) {
        try {
            return this.valueOf.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.bv
    public final boolean AFInAppEventParameterName(String str) {
        try {
            return this.valueOf.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.bv
    public final void AFInAppEventType(String str, boolean z) {
        this.valueOf.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.bv
    public final long AFKeystoreWrapper(String str) {
        try {
            return this.valueOf.getLong(str, 0L);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0L;
        }
    }

    @Override // com.appsflyer.internal.bv
    public final void AFKeystoreWrapper(String str, long j) {
        this.valueOf.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.bv
    public final int valueOf(String str) {
        try {
            return this.valueOf.getInt(str, 0);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    @Override // com.appsflyer.internal.bv
    public final void AFInAppEventType(String str) {
        this.valueOf.edit().remove(str).apply();
    }
}

package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: SharedPrefMigrator.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/SharedPrefMigrator;", "Lcom/bugsnag/android/DeviceIdPersistence;", "", "requestCreateIfDoesNotExist", "", "loadDeviceId", "deviceId", "Lcom/bugsnag/android/User;", "loadUser", "hasPrefs", "Lhs/k;", "deleteLegacyPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "prefs", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SharedPrefMigrator implements DeviceIdPersistence {
    public static final Companion Companion = new Companion(null);
    private static final String INSTALL_ID_KEY = "install.iud";
    private static final String USER_EMAIL_KEY = "user.email";
    private static final String USER_ID_KEY = "user.id";
    private static final String USER_NAME_KEY = "user.name";
    private final SharedPreferences prefs;

    /* compiled from: SharedPrefMigrator.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/SharedPrefMigrator$Companion;", "", "()V", "INSTALL_ID_KEY", "", "USER_EMAIL_KEY", "USER_ID_KEY", "USER_NAME_KEY", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public SharedPrefMigrator(Context context) {
        i.h(context, "context");
        this.prefs = context.getSharedPreferences("com.bugsnag.android", 0);
    }

    public final void deleteLegacyPrefs() {
        if (hasPrefs()) {
            this.prefs.edit().clear().commit();
        }
    }

    public final boolean hasPrefs() {
        return this.prefs.contains(INSTALL_ID_KEY);
    }

    @Override // com.bugsnag.android.DeviceIdPersistence
    public String loadDeviceId(boolean z10) {
        return this.prefs.getString(INSTALL_ID_KEY, null);
    }

    public final User loadUser(String str) {
        return new User(this.prefs.getString(USER_ID_KEY, str), this.prefs.getString(USER_EMAIL_KEY, null), this.prefs.getString(USER_NAME_KEY, null));
    }
}

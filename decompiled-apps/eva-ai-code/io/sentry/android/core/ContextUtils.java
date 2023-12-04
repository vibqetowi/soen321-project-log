package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
/* loaded from: classes4.dex */
final class ContextUtils {
    private ContextUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageInfo getPackageInfo(Context context, ILogger iLogger) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getVersionCode(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return getVersionCodeDep(packageInfo);
    }

    private static String getVersionCodeDep(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }
}

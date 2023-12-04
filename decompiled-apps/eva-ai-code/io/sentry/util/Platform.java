package io.sentry.util;
/* loaded from: classes4.dex */
public final class Platform {
    private static boolean isAndroid;

    static {
        try {
            isAndroid = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            isAndroid = false;
        }
    }

    public static boolean isAndroid() {
        return isAndroid;
    }

    public static boolean isJvm() {
        return !isAndroid;
    }
}

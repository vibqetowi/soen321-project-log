package io.grpc.netty.shaded.io.netty.util.internal;

import com.facebook.internal.ServerProtocol;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;
/* loaded from: classes4.dex */
public final class SystemPropertyUtil {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(SystemPropertyUtil.class);

    public static boolean contains(String str) {
        return get(str) != null;
    }

    public static String get(String str) {
        return get(str, null);
    }

    public static String get(final String str, String str2) {
        ObjectUtil.checkNotNull(str, "key");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("key must not be empty.");
        }
        try {
            if (System.getSecurityManager() == null) {
                str = System.getProperty(str);
            } else {
                str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty(str);
                    }
                });
            }
        } catch (SecurityException e) {
            logger.warn("Unable to retrieve a system property '{}'; default values will be used.", str, e);
            str = null;
        }
        return str == null ? str2 : str;
    }

    public static boolean getBoolean(String str, boolean z) {
        String str2 = get(str);
        if (str2 == null) {
            return z;
        }
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return z;
        }
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if ("false".equals(lowerCase) || "no".equals(lowerCase) || "0".equals(lowerCase)) {
            return false;
        }
        logger.warn("Unable to parse the boolean system property '{}':{} - using the default value: {}", str, lowerCase, Boolean.valueOf(z));
        return z;
    }

    public static int getInt(String str, int i) {
        String str2 = get(str);
        if (str2 == null) {
            return i;
        }
        String trim = str2.trim();
        try {
            return Integer.parseInt(trim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the integer system property '{}':{} - using the default value: {}", str, trim, Integer.valueOf(i));
            return i;
        }
    }

    public static long getLong(String str, long j) {
        String str2 = get(str);
        if (str2 == null) {
            return j;
        }
        String trim = str2.trim();
        try {
            return Long.parseLong(trim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the long integer system property '{}':{} - using the default value: {}", str, trim, Long.valueOf(j));
            return j;
        }
    }

    private SystemPropertyUtil() {
    }
}

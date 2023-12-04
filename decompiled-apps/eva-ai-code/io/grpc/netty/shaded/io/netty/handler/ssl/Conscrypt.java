package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLEngine;
/* loaded from: classes4.dex */
final class Conscrypt {
    private static final Method IS_CONSCRYPT_SSLENGINE;

    static {
        Method method;
        if ((PlatformDependent.javaVersion() >= 8 && PlatformDependent.javaVersion() < 15) || PlatformDependent.isAndroid()) {
            try {
                Class.forName("org.conscrypt.OpenSSLProvider", true, PlatformDependent.getClassLoader(ConscryptAlpnSslEngine.class)).newInstance();
                method = Class.forName("org.conscrypt.Conscrypt", true, PlatformDependent.getClassLoader(ConscryptAlpnSslEngine.class)).getMethod("isConscrypt", SSLEngine.class);
            } catch (Throwable unused) {
            }
            IS_CONSCRYPT_SSLENGINE = method;
        }
        method = null;
        IS_CONSCRYPT_SSLENGINE = method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isAvailable() {
        return IS_CONSCRYPT_SSLENGINE != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isEngineSupported(SSLEngine sSLEngine) {
        try {
            Method method = IS_CONSCRYPT_SSLENGINE;
            if (method != null) {
                return ((Boolean) method.invoke(null, sSLEngine)).booleanValue();
            }
            return false;
        } catch (IllegalAccessException unused) {
            return false;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Conscrypt() {
    }
}

package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
/* loaded from: classes4.dex */
final class JdkAlpnSslUtils {
    private static final Method GET_APPLICATION_PROTOCOL;
    private static final Method GET_HANDSHAKE_APPLICATION_PROTOCOL;
    private static final Method GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR;
    private static final Method SET_APPLICATION_PROTOCOLS;
    private static final Method SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(JdkAlpnSslUtils.class);

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5 = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            SSLEngine createSSLEngine = sSLContext.createSSLEngine();
            Method method6 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.1
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return SSLEngine.class.getMethod("getHandshakeApplicationProtocol", new Class[0]);
                }
            });
            method6.invoke(createSSLEngine, new Object[0]);
            method = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.2
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
                }
            });
            method.invoke(createSSLEngine, new Object[0]);
            method2 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.3
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                }
            });
            method2.invoke(createSSLEngine.getSSLParameters(), EmptyArrays.EMPTY_STRINGS);
            method3 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.4
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return SSLEngine.class.getMethod("setHandshakeApplicationProtocolSelector", CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m$1());
                }
            });
            method3.invoke(createSSLEngine, new BiFunction<SSLEngine, List<String>, String>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.5
                @Override // java.util.function.BiFunction
                public String apply(SSLEngine sSLEngine, List<String> list) {
                    return null;
                }
            });
            method4 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.JdkAlpnSslUtils.6
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return SSLEngine.class.getMethod("getHandshakeApplicationProtocolSelector", new Class[0]);
                }
            });
            method4.invoke(createSSLEngine, new Object[0]);
            method5 = method6;
        } catch (Throwable th) {
            int javaVersion = PlatformDependent.javaVersion();
            if (javaVersion >= 9) {
                logger.error("Unable to initialize JdkAlpnSslUtils, but the detected java version was: {}", Integer.valueOf(javaVersion), th);
            }
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        GET_HANDSHAKE_APPLICATION_PROTOCOL = method5;
        GET_APPLICATION_PROTOCOL = method;
        SET_APPLICATION_PROTOCOLS = method2;
        SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = method3;
        GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = method4;
    }

    private JdkAlpnSslUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean supportsAlpn() {
        return GET_APPLICATION_PROTOCOL != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getApplicationProtocol(SSLEngine sSLEngine) {
        try {
            return (String) GET_APPLICATION_PROTOCOL.invoke(sSLEngine, new Object[0]);
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getHandshakeApplicationProtocol(SSLEngine sSLEngine) {
        try {
            return (String) GET_HANDSHAKE_APPLICATION_PROTOCOL.invoke(sSLEngine, new Object[0]);
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setApplicationProtocols(SSLEngine sSLEngine, List<String> list) {
        SSLParameters sSLParameters = sSLEngine.getSSLParameters();
        try {
            SET_APPLICATION_PROTOCOLS.invoke(sSLParameters, (String[]) list.toArray(EmptyArrays.EMPTY_STRINGS));
            sSLEngine.setSSLParameters(sSLParameters);
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setHandshakeApplicationProtocolSelector(SSLEngine sSLEngine, BiFunction<SSLEngine, List<String>, String> biFunction) {
        try {
            SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR.invoke(sSLEngine, biFunction);
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiFunction<SSLEngine, List<String>, String> getHandshakeApplicationProtocolSelector(SSLEngine sSLEngine) {
        try {
            return CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7226m(GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR.invoke(sSLEngine, new Object[0]));
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }
}

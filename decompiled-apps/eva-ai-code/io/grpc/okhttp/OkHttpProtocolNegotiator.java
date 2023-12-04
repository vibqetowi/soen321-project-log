package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.OptionalMethod;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class OkHttpProtocolNegotiator {
    protected final Platform platform;
    private static final Logger logger = Logger.getLogger(OkHttpProtocolNegotiator.class.getName());
    private static final Platform DEFAULT_PLATFORM = Platform.get();
    private static OkHttpProtocolNegotiator NEGOTIATOR = createNegotiator(OkHttpProtocolNegotiator.class.getClassLoader());

    OkHttpProtocolNegotiator(Platform platform) {
        this.platform = (Platform) Preconditions.checkNotNull(platform, "platform");
    }

    public static OkHttpProtocolNegotiator get() {
        return NEGOTIATOR;
    }

    static OkHttpProtocolNegotiator createNegotiator(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                z = false;
            }
        }
        z = true;
        if (z) {
            return new AndroidNegotiator(DEFAULT_PLATFORM);
        }
        return new OkHttpProtocolNegotiator(DEFAULT_PLATFORM);
    }

    public String negotiate(SSLSocket sSLSocket, String str, @Nullable List<Protocol> list) throws IOException {
        if (list != null) {
            configureTlsExtensions(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            if (selectedProtocol != null) {
                return selectedProtocol;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.platform.afterHandshake(sSLSocket);
        }
    }

    protected void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        this.platform.configureTlsExtensions(sSLSocket, str, list);
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return this.platform.getSelectedProtocol(sSLSocket);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class AndroidNegotiator extends OkHttpProtocolNegotiator {
        private static final Method GET_APPLICATION_PROTOCOL;
        private static final Method GET_APPLICATION_PROTOCOLS;
        private static final Method SET_APPLICATION_PROTOCOLS;
        private static final Method SET_SERVER_NAMES;
        private static final Constructor<?> SNI_HOST_NAME;
        private static final Method SSL_SOCKETS_IS_SUPPORTED_SOCKET;
        private static final Method SSL_SOCKETS_SET_USE_SESSION_TICKET;
        private static final OptionalMethod<Socket> SET_USE_SESSION_TICKETS = new OptionalMethod<>(null, "setUseSessionTickets", Boolean.TYPE);
        private static final OptionalMethod<Socket> SET_HOSTNAME = new OptionalMethod<>(null, "setHostname", String.class);
        private static final OptionalMethod<Socket> GET_ALPN_SELECTED_PROTOCOL = new OptionalMethod<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        private static final OptionalMethod<Socket> SET_ALPN_PROTOCOLS = new OptionalMethod<>(null, "setAlpnProtocols", byte[].class);
        private static final OptionalMethod<Socket> GET_NPN_SELECTED_PROTOCOL = new OptionalMethod<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        private static final OptionalMethod<Socket> SET_NPN_PROTOCOLS = new OptionalMethod<>(null, "setNpnProtocols", byte[].class);

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Constructor<?> constructor = null;
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                            } catch (ClassNotFoundException e) {
                                e = e;
                                OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                                SET_APPLICATION_PROTOCOLS = method2;
                                GET_APPLICATION_PROTOCOLS = method;
                                GET_APPLICATION_PROTOCOL = method3;
                                SSL_SOCKETS_IS_SUPPORTED_SOCKET = method4;
                                SSL_SOCKETS_SET_USE_SESSION_TICKET = method5;
                                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                                try {
                                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                                } catch (ClassNotFoundException e2) {
                                    e = e2;
                                    OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                    SET_SERVER_NAMES = method6;
                                    SNI_HOST_NAME = constructor;
                                } catch (NoSuchMethodException e3) {
                                    e = e3;
                                    OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                    SET_SERVER_NAMES = method6;
                                    SNI_HOST_NAME = constructor;
                                }
                                SET_SERVER_NAMES = method6;
                                SNI_HOST_NAME = constructor;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                                SET_APPLICATION_PROTOCOLS = method2;
                                GET_APPLICATION_PROTOCOLS = method;
                                GET_APPLICATION_PROTOCOL = method3;
                                SSL_SOCKETS_IS_SUPPORTED_SOCKET = method4;
                                SSL_SOCKETS_SET_USE_SESSION_TICKET = method5;
                                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                                SET_SERVER_NAMES = method6;
                                SNI_HOST_NAME = constructor;
                            }
                        } catch (ClassNotFoundException e5) {
                            e = e5;
                            method4 = null;
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        method3 = null;
                        method4 = method3;
                        OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        SET_APPLICATION_PROTOCOLS = method2;
                        GET_APPLICATION_PROTOCOLS = method;
                        GET_APPLICATION_PROTOCOL = method3;
                        SSL_SOCKETS_IS_SUPPORTED_SOCKET = method4;
                        SSL_SOCKETS_SET_USE_SESSION_TICKET = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        SET_SERVER_NAMES = method6;
                        SNI_HOST_NAME = constructor;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        method3 = null;
                        method4 = method3;
                        OkHttpProtocolNegotiator.logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        SET_APPLICATION_PROTOCOLS = method2;
                        GET_APPLICATION_PROTOCOLS = method;
                        GET_APPLICATION_PROTOCOL = method3;
                        SSL_SOCKETS_IS_SUPPORTED_SOCKET = method4;
                        SSL_SOCKETS_SET_USE_SESSION_TICKET = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        SET_SERVER_NAMES = method6;
                        SNI_HOST_NAME = constructor;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method = null;
                method2 = null;
                method3 = null;
            }
            SET_APPLICATION_PROTOCOLS = method2;
            GET_APPLICATION_PROTOCOLS = method;
            GET_APPLICATION_PROTOCOL = method3;
            SSL_SOCKETS_IS_SUPPORTED_SOCKET = method4;
            SSL_SOCKETS_SET_USE_SESSION_TICKET = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e = e13;
                method6 = null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method6 = null;
            }
            SET_SERVER_NAMES = method6;
            SNI_HOST_NAME = constructor;
        }

        AndroidNegotiator(Platform platform) {
            super(platform);
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        public String negotiate(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            return selectedProtocol == null ? super.negotiate(sSLSocket, str, list) : selectedProtocol;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            Constructor<?> constructor;
            boolean z;
            Method method;
            String[] protocolIds = OkHttpProtocolNegotiator.protocolIds(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (isValidHostName(str)) {
                            Method method2 = SSL_SOCKETS_IS_SUPPORTED_SOCKET;
                            if (method2 != null && ((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                SSL_SOCKETS_SET_USE_SESSION_TICKET.invoke(null, sSLSocket, true);
                            } else {
                                SET_USE_SESSION_TICKETS.invokeOptionalWithoutCheckedException(sSLSocket, true);
                            }
                            Method method3 = SET_SERVER_NAMES;
                            if (method3 == null || (constructor = SNI_HOST_NAME) == null) {
                                SET_HOSTNAME.invokeOptionalWithoutCheckedException(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(e3);
                }
            }
            Method method4 = GET_APPLICATION_PROTOCOL;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    SET_APPLICATION_PROTOCOLS.invoke(sSLParameters, protocolIds);
                    z = true;
                } catch (InvocationTargetException e4) {
                    if (e4.getTargetException() instanceof UnsupportedOperationException) {
                        OkHttpProtocolNegotiator.logger.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    } else {
                        throw e4;
                    }
                }
                sSLSocket.setSSLParameters(sSLParameters);
                if (z || (method = GET_APPLICATION_PROTOCOLS) == null || !Arrays.equals(protocolIds, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                    Object[] objArr = {Platform.concatLengthPrefixed(list)};
                    if (this.platform.getTlsExtensionType() == Platform.TlsExtensionType.ALPN_AND_NPN) {
                        SET_ALPN_PROTOCOLS.invokeWithoutCheckedException(sSLSocket, objArr);
                    }
                    if (this.platform.getTlsExtensionType() == Platform.TlsExtensionType.NONE) {
                        SET_NPN_PROTOCOLS.invokeWithoutCheckedException(sSLSocket, objArr);
                        return;
                    }
                    throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
                }
                return;
            }
            z = false;
            sSLSocket.setSSLParameters(sSLParameters);
            if (z) {
            }
            Object[] objArr2 = {Platform.concatLengthPrefixed(list)};
            if (this.platform.getTlsExtensionType() == Platform.TlsExtensionType.ALPN_AND_NPN) {
            }
            if (this.platform.getTlsExtensionType() == Platform.TlsExtensionType.NONE) {
            }
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            Method method = GET_APPLICATION_PROTOCOL;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (e2.getTargetException() instanceof UnsupportedOperationException) {
                        OkHttpProtocolNegotiator.logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (this.platform.getTlsExtensionType() == Platform.TlsExtensionType.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) GET_ALPN_SELECTED_PROTOCOL.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, Util.UTF_8);
                    }
                } catch (Exception e3) {
                    OkHttpProtocolNegotiator.logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
                }
            }
            if (this.platform.getTlsExtensionType() != Platform.TlsExtensionType.NONE) {
                try {
                    byte[] bArr2 = (byte[]) GET_NPN_SELECTED_PROTOCOL.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, Util.UTF_8);
                    }
                    return null;
                } catch (Exception e4) {
                    OkHttpProtocolNegotiator.logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] protocolIds(List<Protocol> list) {
        ArrayList arrayList = new ArrayList();
        for (Protocol protocol : list) {
            arrayList.add(protocol.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    static boolean isValidHostName(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            GrpcUtil.checkAuthority(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}

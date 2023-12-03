package wr;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import s1.s;
import vr.u0;
/* compiled from: OkHttpProtocolNegotiator.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f37168b = Logger.getLogger(k.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final xr.i f37169c = xr.i.f37961d;

    /* renamed from: d  reason: collision with root package name */
    public static final k f37170d;

    /* renamed from: a  reason: collision with root package name */
    public final xr.i f37171a;

    /* compiled from: OkHttpProtocolNegotiator.java */
    /* loaded from: classes2.dex */
    public static final class a extends k {

        /* renamed from: e  reason: collision with root package name */
        public static final s f37172e;
        public static final s f;

        /* renamed from: g  reason: collision with root package name */
        public static final s f37173g;

        /* renamed from: h  reason: collision with root package name */
        public static final s f37174h;

        /* renamed from: i  reason: collision with root package name */
        public static final s f37175i;

        /* renamed from: j  reason: collision with root package name */
        public static final s f37176j;

        /* renamed from: k  reason: collision with root package name */
        public static final Method f37177k;

        /* renamed from: l  reason: collision with root package name */
        public static final Method f37178l;

        /* renamed from: m  reason: collision with root package name */
        public static final Method f37179m;

        /* renamed from: n  reason: collision with root package name */
        public static final Method f37180n;

        /* renamed from: o  reason: collision with root package name */
        public static final Method f37181o;

        /* renamed from: p  reason: collision with root package name */
        public static final Method f37182p;

        /* renamed from: q  reason: collision with root package name */
        public static final Constructor<?> f37183q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Constructor<?> constructor;
            Class<?> cls;
            Logger logger = k.f37168b;
            Class<?> cls2 = Boolean.TYPE;
            f37172e = new s(27, null, "setUseSessionTickets", new Class[]{cls2});
            f = new s(27, null, "setHostname", new Class[]{String.class});
            f37173g = new s(27, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f37174h = new s(27, null, "setAlpnProtocols", new Class[]{byte[].class});
            f37175i = new s(27, byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f37176j = new s(27, null, "setNpnProtocols", new Class[]{byte[].class});
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException e10) {
                            e = e10;
                            method4 = null;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f37179m = method;
                            f37180n = method2;
                            f37181o = method3;
                            f37177k = method4;
                            f37178l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            try {
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            } catch (ClassNotFoundException e11) {
                                e = e11;
                                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                constructor = null;
                                f37182p = method6;
                                f37183q = constructor;
                            } catch (NoSuchMethodException e12) {
                                e = e12;
                                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                constructor = null;
                                f37182p = method6;
                                f37183q = constructor;
                            }
                            f37182p = method6;
                            f37183q = constructor;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            method4 = null;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f37179m = method;
                            f37180n = method2;
                            f37181o = method3;
                            f37177k = method4;
                            f37178l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            f37182p = method6;
                            f37183q = constructor;
                        }
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        method3 = null;
                        method4 = null;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f37179m = method;
                        f37180n = method2;
                        f37181o = method3;
                        f37177k = method4;
                        f37178l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f37182p = method6;
                        f37183q = constructor;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        method3 = null;
                        method4 = null;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f37179m = method;
                        f37180n = method2;
                        f37181o = method3;
                        f37177k = method4;
                        f37178l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f37182p = method6;
                        f37183q = constructor;
                    }
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    method2 = null;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f37179m = method;
                    f37180n = method2;
                    f37181o = method3;
                    f37177k = method4;
                    f37178l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f37182p = method6;
                    f37183q = constructor;
                } catch (NoSuchMethodException e17) {
                    e = e17;
                    method2 = null;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f37179m = method;
                    f37180n = method2;
                    f37181o = method3;
                    f37177k = method4;
                    f37178l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f37182p = method6;
                    f37183q = constructor;
                }
                try {
                    method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                } catch (ClassNotFoundException e18) {
                    e = e18;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f37179m = method;
                    f37180n = method2;
                    f37181o = method3;
                    f37177k = method4;
                    f37178l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f37182p = method6;
                    f37183q = constructor;
                } catch (NoSuchMethodException e19) {
                    e = e19;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f37179m = method;
                    f37180n = method2;
                    f37181o = method3;
                    f37177k = method4;
                    f37178l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f37182p = method6;
                    f37183q = constructor;
                }
            } catch (ClassNotFoundException e20) {
                e = e20;
                method = null;
            } catch (NoSuchMethodException e21) {
                e = e21;
                method = null;
            }
            f37179m = method;
            f37180n = method2;
            f37181o = method3;
            f37177k = method4;
            f37178l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e22) {
                e = e22;
                method6 = null;
            } catch (NoSuchMethodException e23) {
                e = e23;
                method6 = null;
            }
            f37182p = method6;
            f37183q = constructor;
        }

        public a(xr.i iVar) {
            super(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
        @Override // wr.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(SSLSocket sSLSocket, String str, List<xr.j> list) {
            Constructor<?> constructor;
            boolean z10;
            xr.i iVar;
            Method method;
            ArrayList arrayList = new ArrayList();
            for (xr.j jVar : list) {
                arrayList.add(jVar.f37980u);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (k.c(str)) {
                            Method method2 = f37177k;
                            if (method2 != null && ((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f37178l.invoke(null, sSLSocket, Boolean.TRUE);
                            } else {
                                f37172e.D(sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f37182p;
                            if (method3 != null && (constructor = f37183q) != null) {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            } else {
                                f.D(sSLSocket, str);
                            }
                        }
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException(e12);
                }
            }
            Method method4 = f37181o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    f37179m.invoke(sSLParameters, strArr);
                    z10 = true;
                } catch (InvocationTargetException e13) {
                    if (e13.getTargetException() instanceof UnsupportedOperationException) {
                        k.f37168b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    } else {
                        throw e13;
                    }
                }
                sSLSocket.setSSLParameters(sSLParameters);
                if (!z10 && (method = f37180n) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                    return;
                }
                Object[] objArr = {xr.i.b(list)};
                iVar = this.f37171a;
                if (iVar.e() == 1) {
                    f37174h.E(sSLSocket, objArr);
                }
                if (iVar.e() == 3) {
                    f37176j.E(sSLSocket, objArr);
                    return;
                }
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            z10 = false;
            sSLSocket.setSSLParameters(sSLParameters);
            if (!z10) {
            }
            Object[] objArr2 = {xr.i.b(list)};
            iVar = this.f37171a;
            if (iVar.e() == 1) {
            }
            if (iVar.e() == 3) {
            }
        }

        @Override // wr.k
        public final String b(SSLSocket sSLSocket) {
            Logger logger = k.f37168b;
            Method method = f37181o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (e11.getTargetException() instanceof UnsupportedOperationException) {
                        logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e11);
                    }
                }
            }
            xr.i iVar = this.f37171a;
            if (iVar.e() == 1) {
                try {
                    byte[] bArr = (byte[]) f37173g.E(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, xr.l.f37988b);
                    }
                } catch (Exception e12) {
                    logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (iVar.e() != 3) {
                try {
                    byte[] bArr2 = (byte[]) f37175i.E(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, xr.l.f37988b);
                    }
                    return null;
                } catch (Exception e13) {
                    logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                    return null;
                }
            }
            return null;
        }

        @Override // wr.k
        public final String d(SSLSocket sSLSocket, String str, List<xr.j> list) {
            String b10 = b(sSLSocket);
            if (b10 == null) {
                return super.d(sSLSocket, str, list);
            }
            return b10;
        }
    }

    static {
        boolean z10;
        k kVar;
        ClassLoader classLoader = k.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            Level level = Level.FINE;
            Logger logger = f37168b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                z10 = false;
            }
        }
        z10 = true;
        xr.i iVar = f37169c;
        if (z10) {
            kVar = new a(iVar);
        } else {
            kVar = new k(iVar);
        }
        f37170d = kVar;
    }

    public k(xr.i iVar) {
        sc.b.w(iVar, "platform");
        this.f37171a = iVar;
    }

    public static boolean c(String str) {
        boolean z10;
        boolean z11;
        if (str.contains("_")) {
            return false;
        }
        try {
            URI a10 = u0.a(str);
            if (a10.getHost() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.m(str, "No host in authority '%s'", z10);
            if (a10.getUserInfo() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.m(str, "Userinfo must not be present on authority: '%s'", z11);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<xr.j> list) {
        this.f37171a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f37171a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List<xr.j> list) {
        xr.i iVar = this.f37171a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b10 = b(sSLSocket);
            if (b10 != null) {
                return b10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            iVar.a(sSLSocket);
        }
    }
}

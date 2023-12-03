package xr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import s1.s;
/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f37959b = Logger.getLogger(i.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f37960c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    public static final i f37961d;

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37962a;

    /* compiled from: Platform.java */
    /* loaded from: classes2.dex */
    public static class a extends i {

        /* renamed from: e  reason: collision with root package name */
        public final s f37963e;
        public final s f;

        /* renamed from: g  reason: collision with root package name */
        public final s f37964g;

        /* renamed from: h  reason: collision with root package name */
        public final s f37965h;

        /* renamed from: i  reason: collision with root package name */
        public final int f37966i;

        public a(s sVar, s sVar2, s sVar3, s sVar4, Provider provider, int i6) {
            super(provider);
            this.f37963e = sVar;
            this.f = sVar2;
            this.f37964g = sVar3;
            this.f37965h = sVar4;
            this.f37966i = i6;
        }

        @Override // xr.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            boolean z10;
            if (str != null) {
                this.f37963e.D(sSLSocket, Boolean.TRUE);
                this.f.D(sSLSocket, str);
            }
            s sVar = this.f37965h;
            sVar.getClass();
            if (sVar.u(sSLSocket.getClass()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sVar.E(sSLSocket, i.b(list));
            }
        }

        @Override // xr.i
        public final String d(SSLSocket sSLSocket) {
            boolean z10;
            byte[] bArr;
            s sVar = this.f37964g;
            sVar.getClass();
            if (sVar.u(sSLSocket.getClass()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (bArr = (byte[]) sVar.E(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, l.f37988b);
        }

        @Override // xr.i
        public final int e() {
            return this.f37966i;
        }
    }

    /* compiled from: Platform.java */
    /* loaded from: classes2.dex */
    public static class b extends i {

        /* renamed from: e  reason: collision with root package name */
        public final Method f37967e;
        public final Method f;

        public b(Provider provider, Method method, Method method2) {
            super(provider);
            this.f37967e = method;
            this.f = method2;
        }

        @Override // xr.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (j jVar : list) {
                if (jVar != j.HTTP_1_0) {
                    arrayList.add(jVar.f37980u);
                }
            }
            try {
                this.f37967e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // xr.i
        public final String d(SSLSocket sSLSocket) {
            try {
                return (String) this.f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // xr.i
        public final int e() {
            return 1;
        }
    }

    /* compiled from: Platform.java */
    /* loaded from: classes2.dex */
    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        public final Method f37968e;
        public final Method f;

        /* renamed from: g  reason: collision with root package name */
        public final Method f37969g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f37970h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<?> f37971i;

        public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f37968e = method;
            this.f = method2;
            this.f37969g = method3;
            this.f37970h = cls;
            this.f37971i = cls2;
        }

        @Override // xr.i
        public final void a(SSLSocket sSLSocket) {
            try {
                this.f37969g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                i.f37959b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // xr.i
        public final void c(SSLSocket sSLSocket, String str, List<j> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar = list.get(i6);
                if (jVar != j.HTTP_1_0) {
                    arrayList.add(jVar.f37980u);
                }
            }
            try {
                this.f37968e.invoke(null, sSLSocket, Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{this.f37970h, this.f37971i}, new d(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // xr.i
        public final String d(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
                boolean z10 = dVar.f37973b;
                if (!z10 && dVar.f37974c == null) {
                    i.f37959b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return dVar.f37974c;
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // xr.i
        public final int e() {
            return 1;
        }
    }

    /* compiled from: Platform.java */
    /* loaded from: classes2.dex */
    public static class d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f37972a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f37973b;

        /* renamed from: c  reason: collision with root package name */
        public String f37974c;

        public d(ArrayList arrayList) {
            this.f37972a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f37987a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f37973b = true;
                return null;
            }
            boolean equals = name.equals("protocols");
            List<String> list = this.f37972a;
            if (equals && objArr.length == 0) {
                return list;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (list.contains(list2.get(i6))) {
                            String str = (String) list2.get(i6);
                            this.f37974c = str;
                            return str;
                        }
                    }
                    String str2 = list.get(0);
                    this.f37974c = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f37974c = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    static {
        Logger logger;
        Provider provider;
        i iVar;
        i iVar2;
        int i6;
        boolean z10;
        String[] strArr;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        boolean z11 = false;
        int i10 = 0;
        loop0: while (true) {
            logger = f37959b;
            if (i10 < length) {
                Provider provider2 = providers[i10];
                for (String str : f37960c) {
                    if (str.equals(provider2.getClass().getName())) {
                        logger.log(Level.FINE, "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i10++;
            } else {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        int i11 = 2;
        if (provider != null) {
            s sVar = new s(27, null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            s sVar2 = new s(27, null, "setHostname", new Class[]{String.class});
            s sVar3 = new s(27, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            s sVar4 = new s(27, null, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    i.class.getClassLoader().loadClass("android.net.Network");
                    z10 = true;
                } catch (ClassNotFoundException e10) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                    z10 = false;
                }
                if (!z10) {
                    try {
                        i.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        z11 = true;
                    } catch (ClassNotFoundException e11) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e11);
                    }
                    if (!z11) {
                        i11 = 3;
                    }
                    i6 = i11;
                    iVar2 = new a(sVar, sVar2, sVar3, sVar4, provider, i6);
                }
            }
            i6 = 1;
            iVar2 = new a(sVar, sVar2, sVar3, sVar4, provider, i6);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new f())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    iVar2 = new b(provider3, (Method) AccessController.doPrivileged(new g()), (Method) AccessController.doPrivileged(new h()));
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        iVar = new c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        iVar = new i(provider3);
                    }
                    iVar2 = iVar;
                }
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(e12);
            }
        }
        f37961d = iVar2;
    }

    public i(Provider provider) {
        this.f37962a = provider;
    }

    public static byte[] b(List<j> list) {
        zv.e eVar = new zv.e();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = list.get(i6);
            if (jVar != j.HTTP_1_0) {
                eVar.L0(jVar.f37980u.length());
                eVar.R0(jVar.f37980u);
            }
        }
        return eVar.c0(eVar.f39885v);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<j> list) {
    }
}

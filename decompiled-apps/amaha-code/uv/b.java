package uv;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import lv.y;
import uv.h;
import vv.j;
import vv.k;
import vv.l;
/* compiled from: AndroidPlatform.kt */
/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f34594e;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f34595c;

    /* renamed from: d  reason: collision with root package name */
    public final vv.h f34596d;

    /* compiled from: AndroidPlatform.kt */
    /* loaded from: classes2.dex */
    public static final class a implements xv.d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f34597a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f34598b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f34597a = x509TrustManager;
            this.f34598b = method;
        }

        @Override // xv.d
        public final X509Certificate a(X509Certificate cert) {
            i.g(cert, "cert");
            try {
                Object invoke = this.f34598b.invoke(this.f34597a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (i.b(this.f34597a, aVar.f34597a) && i.b(this.f34598b, aVar.f34598b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34598b.hashCode() + (this.f34597a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f34597a + ", findByIssuerAndSignatureMethod=" + this.f34598b + ')';
        }
    }

    static {
        boolean z10;
        if (!h.a.c() || Build.VERSION.SDK_INT >= 30) {
            z10 = false;
        } else {
            z10 = true;
        }
        f34594e = z10;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        Method method3 = null;
        try {
            lVar = new l(Class.forName(i.n(".OpenSSLSocketImpl", "com.android.org.conscrypt")), Class.forName(i.n(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt")), Class.forName(i.n(".SSLParametersImpl", "com.android.org.conscrypt")));
        } catch (Exception e10) {
            h.f34614a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new j(vv.f.f);
        kVarArr[2] = new j(vv.i.f36178a);
        kVarArr[3] = new j(vv.g.f36174a);
        ArrayList R1 = is.k.R1(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = R1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f34595c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f34596d = new vv.h(method3, method2, method);
    }

    @Override // uv.h
    public final androidx.work.k b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        vv.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new vv.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new xv.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // uv.h
    public final xv.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // uv.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        Object obj;
        i.g(protocols, "protocols");
        Iterator it = this.f34595c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((k) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // uv.h
    public final void e(Socket socket, InetSocketAddress address, int i6) {
        i.g(address, "address");
        try {
            socket.connect(address, i6);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // uv.h
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f34595c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((k) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    @Override // uv.h
    public final Object g() {
        vv.h hVar = this.f34596d;
        hVar.getClass();
        Method method = hVar.f36175a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = hVar.f36176b;
            i.d(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // uv.h
    public final boolean h(String hostname) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        NetworkSecurityPolicy networkSecurityPolicy2;
        boolean isCleartextTrafficPermitted2;
        i.g(hostname, "hostname");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            networkSecurityPolicy2 = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted2 = networkSecurityPolicy2.isCleartextTrafficPermitted(hostname);
            return isCleartextTrafficPermitted2;
        } else if (i6 >= 23) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted();
            return isCleartextTrafficPermitted;
        } else {
            return true;
        }
    }

    @Override // uv.h
    public final void k(Object obj, String message) {
        i.g(message, "message");
        vv.h hVar = this.f34596d;
        hVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = hVar.f36177c;
                i.d(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            h.j(this, message, 5, 4);
        }
    }
}

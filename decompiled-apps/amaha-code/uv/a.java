package uv;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import lv.y;
import uv.h;
import vv.i;
import vv.j;
import vv.k;
/* compiled from: Android10Platform.kt */
/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f34592d;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f34593c;

    static {
        boolean z10;
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f34592d = z10;
    }

    public a() {
        boolean z10;
        vv.a aVar;
        k[] kVarArr = new k[4];
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar = new vv.a();
        } else {
            aVar = null;
        }
        kVarArr[0] = aVar;
        kVarArr[1] = new j(vv.f.f);
        kVarArr[2] = new j(i.f36178a);
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
        this.f34593c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        Object obj;
        kotlin.jvm.internal.i.g(protocols, "protocols");
        Iterator it = this.f34593c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f34593c.iterator();
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
    public final boolean h(String hostname) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.i.g(hostname, "hostname");
        networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}

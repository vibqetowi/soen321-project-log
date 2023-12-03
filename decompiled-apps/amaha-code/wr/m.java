package wr;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import xr.b;
/* compiled from: OkHttpTlsUpgrader.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final List<xr.j> f37185a = Collections.unmodifiableList(Arrays.asList(xr.j.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i6, xr.b bVar) {
        String[] strArr;
        xr.j jVar;
        String str2;
        sc.b.w(sSLSocketFactory, "sslSocketFactory");
        sc.b.w(socket, "socket");
        sc.b.w(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i6, true);
        List<xr.j> list = null;
        String[] strArr2 = bVar.f37942b;
        if (strArr2 != null) {
            strArr = (String[]) xr.l.a(strArr2, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] strArr3 = (String[]) xr.l.a(bVar.f37943c, sSLSocket.getEnabledProtocols());
        b.a aVar = new b.a(bVar);
        boolean z10 = aVar.f37945a;
        if (z10) {
            if (strArr == null) {
                aVar.f37946b = null;
            } else {
                aVar.f37946b = (String[]) strArr.clone();
            }
            if (z10) {
                if (strArr3 == null) {
                    aVar.f37947c = null;
                } else {
                    aVar.f37947c = (String[]) strArr3.clone();
                }
                xr.b bVar2 = new xr.b(aVar);
                sSLSocket.setEnabledProtocols(bVar2.f37943c);
                String[] strArr4 = bVar2.f37942b;
                if (strArr4 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr4);
                }
                k kVar = k.f37170d;
                boolean z11 = bVar.f37944d;
                List<xr.j> list2 = f37185a;
                if (z11) {
                    list = list2;
                }
                String d10 = kVar.d(sSLSocket, str, list);
                if (d10.equals("http/1.0")) {
                    jVar = xr.j.HTTP_1_0;
                } else if (d10.equals("http/1.1")) {
                    jVar = xr.j.HTTP_1_1;
                } else if (d10.equals("h2")) {
                    jVar = xr.j.HTTP_2;
                } else if (d10.equals("spdy/3.1")) {
                    jVar = xr.j.SPDY_3;
                } else {
                    throw new IOException("Unexpected protocol: ".concat(d10));
                }
                sc.b.z(d10, "Only " + list2 + " are supported, but negotiated protocol is %s", list2.contains(jVar));
                if (hostnameVerifier == null) {
                    hostnameVerifier = xr.e.f37957a;
                }
                if (str.startsWith("[") && str.endsWith("]")) {
                    str2 = str.substring(1, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (hostnameVerifier.verify(str2, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
}

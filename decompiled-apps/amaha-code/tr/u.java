package tr;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.cert.Certificate;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: InternalChannelz.java */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f33581d = Logger.getLogger(u.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final u f33582e = new u();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentSkipListMap f33583a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f33584b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f33585c;

    /* compiled from: InternalChannelz.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public a(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                u.f33581d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
        }
    }

    public u() {
        new ConcurrentSkipListMap();
        this.f33583a = new ConcurrentSkipListMap();
        this.f33584b = new ConcurrentHashMap();
        this.f33585c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(AbstractMap abstractMap, v vVar) {
        v vVar2 = (v) abstractMap.put(Long.valueOf(vVar.g().f33589c), vVar);
    }

    public static void b(AbstractMap abstractMap, v vVar) {
        v vVar2 = (v) abstractMap.remove(Long.valueOf(vVar.g().f33589c));
    }
}

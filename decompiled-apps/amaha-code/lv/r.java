package lv;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import lv.h0;
/* compiled from: Handshake.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f24677a;

    /* renamed from: b  reason: collision with root package name */
    public final i f24678b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f24679c;

    /* renamed from: d  reason: collision with root package name */
    public final hs.i f24680d;

    /* compiled from: Handshake.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: Handshake.kt */
        /* renamed from: lv.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0396a extends kotlin.jvm.internal.k implements ss.a<List<? extends Certificate>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f24681u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0396a(List<? extends Certificate> list) {
                super(0);
                this.f24681u = list;
            }

            @Override // ss.a
            public final List<? extends Certificate> invoke() {
                return this.f24681u;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static r a(SSLSession sSLSession) {
            boolean b10;
            List list;
            Certificate[] localCertificates;
            Certificate[] peerCertificates;
            List list2 = is.w.f20676u;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (kotlin.jvm.internal.i.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    b10 = true;
                } else {
                    b10 = kotlin.jvm.internal.i.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!b10) {
                    i b11 = i.f24624b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!kotlin.jvm.internal.i.b("NONE", protocol)) {
                            h0 a10 = h0.a.a(protocol);
                            try {
                                peerCertificates = sSLSession.getPeerCertificates();
                            } catch (SSLPeerUnverifiedException unused) {
                            }
                            if (peerCertificates != null) {
                                list = mv.b.l(Arrays.copyOf(peerCertificates, peerCertificates.length));
                                localCertificates = sSLSession.getLocalCertificates();
                                if (localCertificates != null) {
                                    list2 = mv.b.l(Arrays.copyOf(localCertificates, localCertificates.length));
                                }
                                return new r(a10, b11, list2, new C0396a(list));
                            }
                            list = list2;
                            localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                            }
                            return new r(a10, b11, list2, new C0396a(list));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException(kotlin.jvm.internal.i.n(cipherSuite, "cipherSuite == "));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* compiled from: Handshake.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends Certificate>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.a<List<Certificate>> f24682u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ss.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f24682u = aVar;
        }

        @Override // ss.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.f24682u.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return is.w.f20676u;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(h0 tlsVersion, i cipherSuite, List<? extends Certificate> localCertificates, ss.a<? extends List<? extends Certificate>> aVar) {
        kotlin.jvm.internal.i.g(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.i.g(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.i.g(localCertificates, "localCertificates");
        this.f24677a = tlsVersion;
        this.f24678b = cipherSuite;
        this.f24679c = localCertificates;
        this.f24680d = sp.b.O(new b(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f24680d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f24677a == this.f24677a && kotlin.jvm.internal.i.b(rVar.f24678b, this.f24678b) && kotlin.jvm.internal.i.b(rVar.a(), a()) && kotlin.jvm.internal.i.b(rVar.f24679c, this.f24679c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f24678b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f24679c.hashCode() + ((hashCode2 + ((hashCode + ((this.f24677a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(is.i.H1(a10, 10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.f(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f24677a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f24678b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f24679c;
        ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.f(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}

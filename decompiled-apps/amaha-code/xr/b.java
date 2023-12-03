package xr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ConnectionSpec.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f37940e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f37941a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f37942b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f37943c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f37944d;

    static {
        xr.a[] aVarArr = {xr.a.TLS_AES_128_GCM_SHA256, xr.a.TLS_AES_256_GCM_SHA384, xr.a.TLS_CHACHA20_POLY1305_SHA256, xr.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, xr.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, xr.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, xr.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, xr.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, xr.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, xr.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, xr.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, xr.a.TLS_RSA_WITH_AES_128_GCM_SHA256, xr.a.TLS_RSA_WITH_AES_256_GCM_SHA384, xr.a.TLS_RSA_WITH_AES_128_CBC_SHA, xr.a.TLS_RSA_WITH_AES_256_CBC_SHA, xr.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        a aVar = new a(true);
        aVar.a(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        aVar.b(kVar, kVar2);
        aVar.f37948d = true;
        b bVar = new b(aVar);
        f37940e = bVar;
        a aVar2 = new a(bVar);
        aVar2.b(kVar, kVar2, k.TLS_1_1, k.TLS_1_0);
        if (aVar2.f37945a) {
            aVar2.f37948d = true;
            new b(aVar2);
            new b(new a(false));
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public b(a aVar) {
        this.f37941a = aVar.f37945a;
        this.f37942b = aVar.f37946b;
        this.f37943c = aVar.f37947c;
        this.f37944d = aVar.f37948d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = bVar.f37941a;
        boolean z11 = this.f37941a;
        if (z11 != z10) {
            return false;
        }
        if (z11 && (!Arrays.equals(this.f37942b, bVar.f37942b) || !Arrays.equals(this.f37943c, bVar.f37943c) || this.f37944d != bVar.f37944d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f37941a) {
            return ((((527 + Arrays.hashCode(this.f37942b)) * 31) + Arrays.hashCode(this.f37943c)) * 31) + (!this.f37944d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        xr.a valueOf;
        String obj;
        k kVar;
        if (this.f37941a) {
            String[] strArr = this.f37942b;
            if (strArr == null) {
                unmodifiableList = null;
            } else {
                xr.a[] aVarArr = new xr.a[strArr.length];
                for (int i6 = 0; i6 < strArr.length; i6++) {
                    String str = strArr[i6];
                    if (str.startsWith("SSL_")) {
                        valueOf = xr.a.valueOf("TLS_" + str.substring(4));
                    } else {
                        valueOf = xr.a.valueOf(str);
                    }
                    aVarArr[i6] = valueOf;
                }
                String[] strArr2 = l.f37987a;
                unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
            }
            if (unmodifiableList == null) {
                obj = "[use default]";
            } else {
                obj = unmodifiableList.toString();
            }
            StringBuilder g5 = defpackage.d.g("ConnectionSpec(cipherSuites=", obj, ", tlsVersions=");
            String[] strArr3 = this.f37943c;
            k[] kVarArr = new k[strArr3.length];
            for (int i10 = 0; i10 < strArr3.length; i10++) {
                String str2 = strArr3[i10];
                if ("TLSv1.3".equals(str2)) {
                    kVar = k.TLS_1_3;
                } else if ("TLSv1.2".equals(str2)) {
                    kVar = k.TLS_1_2;
                } else if ("TLSv1.1".equals(str2)) {
                    kVar = k.TLS_1_1;
                } else if ("TLSv1".equals(str2)) {
                    kVar = k.TLS_1_0;
                } else if ("SSLv3".equals(str2)) {
                    kVar = k.SSL_3_0;
                } else {
                    throw new IllegalArgumentException(defpackage.c.r("Unexpected TLS version: ", str2));
                }
                kVarArr[i10] = kVar;
            }
            String[] strArr4 = l.f37987a;
            g5.append(Collections.unmodifiableList(Arrays.asList((Object[]) kVarArr.clone())));
            g5.append(", supportsTlsExtensions=");
            g5.append(this.f37944d);
            g5.append(")");
            return g5.toString();
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f37945a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f37946b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f37947c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f37948d;

        public a(boolean z10) {
            this.f37945a = z10;
        }

        public final void a(xr.a... aVarArr) {
            if (this.f37945a) {
                String[] strArr = new String[aVarArr.length];
                for (int i6 = 0; i6 < aVarArr.length; i6++) {
                    strArr[i6] = aVarArr[i6].f37939u;
                }
                this.f37946b = strArr;
                return;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final void b(k... kVarArr) {
            if (this.f37945a) {
                if (kVarArr.length != 0) {
                    String[] strArr = new String[kVarArr.length];
                    for (int i6 = 0; i6 < kVarArr.length; i6++) {
                        strArr[i6] = kVarArr[i6].f37986u;
                    }
                    this.f37947c = strArr;
                    return;
                }
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(b bVar) {
            this.f37945a = bVar.f37941a;
            this.f37946b = bVar.f37942b;
            this.f37947c = bVar.f37943c;
            this.f37948d = bVar.f37944d;
        }
    }
}

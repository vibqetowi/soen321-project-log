package lv;
/* compiled from: TlsVersion.kt */
/* loaded from: classes2.dex */
public enum h0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f24623u;

    /* compiled from: TlsVersion.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static h0 a(String javaName) {
            kotlin.jvm.internal.i.g(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return h0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return h0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return h0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return h0.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return h0.SSL_3_0;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(javaName, "Unexpected TLS version: "));
        }
    }

    h0(String str) {
        this.f24623u = str;
    }
}

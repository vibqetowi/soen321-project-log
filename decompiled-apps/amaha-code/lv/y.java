package lv;

import java.io.IOException;
/* compiled from: Protocol.kt */
/* loaded from: classes2.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f24750u;

    /* compiled from: Protocol.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static y a(String str) {
            if (kotlin.jvm.internal.i.b(str, "http/1.0")) {
                return y.HTTP_1_0;
            }
            if (kotlin.jvm.internal.i.b(str, "http/1.1")) {
                return y.HTTP_1_1;
            }
            if (kotlin.jvm.internal.i.b(str, "h2_prior_knowledge")) {
                return y.H2_PRIOR_KNOWLEDGE;
            }
            if (kotlin.jvm.internal.i.b(str, "h2")) {
                return y.HTTP_2;
            }
            if (kotlin.jvm.internal.i.b(str, "spdy/3.1")) {
                return y.SPDY_3;
            }
            if (kotlin.jvm.internal.i.b(str, "quic")) {
                return y.QUIC;
            }
            throw new IOException(kotlin.jvm.internal.i.n(str, "Unexpected protocol: "));
        }
    }

    y(String str) {
        this.f24750u = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f24750u;
    }
}

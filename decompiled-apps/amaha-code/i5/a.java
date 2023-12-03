package i5;

import java.io.Serializable;
import w5.e0;
/* compiled from: AccessTokenAppIdPair.kt */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final String f19831u;

    /* renamed from: v  reason: collision with root package name */
    public final String f19832v;

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: i5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0299a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final String f19833u;

        /* renamed from: v  reason: collision with root package name */
        public final String f19834v;

        public C0299a(String str, String appId) {
            kotlin.jvm.internal.i.g(appId, "appId");
            this.f19833u = str;
            this.f19834v = appId;
        }

        private final Object readResolve() {
            return new a(this.f19833u, this.f19834v);
        }
    }

    public a(String str, String applicationId) {
        kotlin.jvm.internal.i.g(applicationId, "applicationId");
        this.f19831u = applicationId;
        this.f19832v = e0.A(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C0299a(this.f19832v, this.f19831u);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        e0 e0Var = e0.f36453a;
        a aVar = (a) obj;
        if (!e0.a(aVar.f19832v, this.f19832v) || !e0.a(aVar.f19831u, this.f19831u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f19832v;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ this.f19831u.hashCode();
    }
}

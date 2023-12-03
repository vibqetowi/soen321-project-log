package h9;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import v9.m;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f17345a;

    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    @Deprecated
    /* renamed from: h9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0275a implements a.c {

        /* renamed from: w  reason: collision with root package name */
        public static final C0275a f17346w = new C0275a(new C0276a());

        /* renamed from: u  reason: collision with root package name */
        public final boolean f17347u;

        /* renamed from: v  reason: collision with root package name */
        public final String f17348v;

        /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
        @Deprecated
        /* renamed from: h9.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0276a {

            /* renamed from: a  reason: collision with root package name */
            public final Boolean f17349a;

            /* renamed from: b  reason: collision with root package name */
            public String f17350b;

            public C0276a() {
                this.f17349a = Boolean.FALSE;
            }

            public C0276a(C0275a c0275a) {
                this.f17349a = Boolean.FALSE;
                C0275a c0275a2 = C0275a.f17346w;
                c0275a.getClass();
                this.f17349a = Boolean.valueOf(c0275a.f17347u);
                this.f17350b = c0275a.f17348v;
            }
        }

        public C0275a(C0276a c0276a) {
            this.f17347u = c0276a.f17349a.booleanValue();
            this.f17348v = c0276a.f17350b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0275a)) {
                return false;
            }
            C0275a c0275a = (C0275a) obj;
            c0275a.getClass();
            if (m.a(null, null) && this.f17347u == c0275a.f17347u && m.a(this.f17348v, c0275a.f17348v)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f17347u), this.f17348v});
        }
    }

    static {
        a.f fVar = new a.f();
        new d();
        e eVar = new e();
        com.google.android.gms.common.api.a<c> aVar = b.f17351a;
        f17345a = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, fVar);
    }
}

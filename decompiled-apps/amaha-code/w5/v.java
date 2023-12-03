package w5;

import java.util.HashMap;
/* compiled from: Logger.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36544d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f36545e = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final h5.w f36546a = h5.w.REQUESTS;

    /* renamed from: b  reason: collision with root package name */
    public final String f36547b;

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f36548c;

    /* compiled from: Logger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(h5.w wVar, String tag, String string) {
            kotlin.jvm.internal.i.g(tag, "tag");
            kotlin.jvm.internal.i.g(string, "string");
            c(wVar, tag, string);
        }

        public static void b(h5.w wVar, String tag, String str, Object... objArr) {
            kotlin.jvm.internal.i.g(tag, "tag");
            h5.p.i(wVar);
        }

        public static void c(h5.w behavior, String tag, String string) {
            kotlin.jvm.internal.i.g(behavior, "behavior");
            kotlin.jvm.internal.i.g(tag, "tag");
            kotlin.jvm.internal.i.g(string, "string");
            h5.p.i(behavior);
        }

        public final synchronized void d(String original) {
            kotlin.jvm.internal.i.g(original, "original");
            v.f36545e.put(original, "ACCESS_TOKEN_REMOVED");
        }
    }

    public v() {
        f0.d("Request", "tag");
        this.f36547b = kotlin.jvm.internal.i.n("Request", "FacebookSDK.");
        this.f36548c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        kotlin.jvm.internal.i.g(key, "key");
        kotlin.jvm.internal.i.g(value, "value");
        c();
    }

    public final void b() {
        String sb2 = this.f36548c.toString();
        kotlin.jvm.internal.i.f(sb2, "contents.toString()");
        a.c(this.f36546a, this.f36547b, sb2);
        this.f36548c = new StringBuilder();
    }

    public final void c() {
        h5.p pVar = h5.p.f17269a;
        h5.p.i(this.f36546a);
    }
}

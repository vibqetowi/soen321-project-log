package zh;

import hh.g;
/* compiled from: SecurityManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f39405a;

    /* renamed from: b  reason: collision with root package name */
    public static a f39406b;

    static {
        Object newInstance;
        try {
            newInstance = Class.forName("com.moengage.core.security.internal.SecurityHandlerImpl").newInstance();
        } catch (Exception unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, c.f39404u, 2);
        }
        if (newInstance != null) {
            f39406b = (a) newInstance;
            f39405a = "Core_SecurityManager";
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.security.SecurityHandler");
    }
}

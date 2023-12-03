package yh;

import hh.g;
/* compiled from: RttManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f38625a;

    static {
        try {
            Object newInstance = Class.forName("com.moengage.rtt.internal.RttHandleImpl").newInstance();
            if (newInstance != null) {
                f38625a = (a) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.rtt.RttHandler");
        } catch (Throwable unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, b.f38624u, 2);
        }
    }
}

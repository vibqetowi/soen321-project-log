package sh;

import com.moengage.core.internal.push.pushamp.PushAmpHandler;
import hh.g;
/* compiled from: PushAmpManager.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static PushAmpHandler f31571a;

    static {
        try {
            Object newInstance = Class.forName("com.moengage.pushamp.internal.PushAmpHandlerImpl").newInstance();
            if (newInstance != null) {
                f31571a = (PushAmpHandler) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.push.pushamp.PushAmpHandler");
        } catch (Throwable unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, a.f31570u, 2);
        }
    }
}

package ch;

import com.moengage.inapp.internal.InAppHandlerImpl;
import hh.g;
/* compiled from: InAppManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f5286a;

    static {
        try {
            Object newInstance = InAppHandlerImpl.class.newInstance();
            if (newInstance != null) {
                f5286a = (a) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.inapp.InAppHandler");
        } catch (Exception unused) {
            hh.a aVar = g.f17610d;
            g.a.b(0, b.f5285u, 3);
        }
    }
}

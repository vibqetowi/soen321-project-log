package gh;

import hh.g;
/* compiled from: GeofenceManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f16512a;

    static {
        try {
            Object newInstance = Class.forName("com.moengage.geofence.internal.GeofenceHandlerImpl").newInstance();
            if (newInstance != null) {
                f16512a = (a) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.location.GeofenceHandler");
        } catch (Exception unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, b.f16511u, 2);
        }
    }
}

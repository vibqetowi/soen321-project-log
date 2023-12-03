package nj;

import android.content.Context;
import android.os.Bundle;
import com.moengage.richnotification.internal.RichNotificationHandlerImpl;
import hh.g;
import ih.p;
import kotlin.jvm.internal.i;
/* compiled from: RichNotificationManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f26377a;

    static {
        try {
            Object newInstance = RichNotificationHandlerImpl.class.newInstance();
            if (newInstance != null) {
                f26377a = (a) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.pushbase.internal.richnotification.RichNotificationHandler");
        } catch (Throwable unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, b.f26376u, 2);
        }
    }

    public static void a(Context context, Bundle payload, p sdkInstance) {
        i.g(context, "context");
        i.g(payload, "payload");
        i.g(sdkInstance, "sdkInstance");
        a aVar = f26377a;
        if (aVar != null) {
            aVar.onNotificationDismissed(context, payload, sdkInstance);
        }
    }
}

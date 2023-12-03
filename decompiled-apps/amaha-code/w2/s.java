package w2;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: WakeLocks.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36322a;

    static {
        String f = androidx.work.q.f("WakeLocks");
        kotlin.jvm.internal.i.f(f, "tagWithPrefix(\"WakeLocks\")");
        f36322a = f;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (t.f36323a) {
            t.f36324b.put(wakeLock, concat);
        }
        kotlin.jvm.internal.i.f(wakeLock, "wakeLock");
        return wakeLock;
    }
}

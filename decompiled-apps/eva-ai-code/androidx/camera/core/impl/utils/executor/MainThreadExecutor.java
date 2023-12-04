package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MainThreadExecutor {
    private static volatile ScheduledExecutorService sInstance;

    private MainThreadExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (MainThreadExecutor.class) {
            if (sInstance == null) {
                sInstance = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
            }
        }
        return sInstance;
    }
}

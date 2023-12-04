package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class CameraThreadConfig {
    public abstract Executor getCameraExecutor();

    public abstract Handler getSchedulerHandler();

    public static CameraThreadConfig create(Executor executor, Handler handler) {
        return new AutoValue_CameraThreadConfig(executor, handler);
    }
}

package com.google.firebase.storage.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.storage.StorageTaskScheduler;
import java.util.concurrent.Executor;
import v9.o;
/* loaded from: classes.dex */
public class SmartHandler {
    static boolean testMode = false;
    private final Executor executor;
    private final Handler handler;

    public SmartHandler(Executor executor) {
        this.executor = executor;
        if (executor == null) {
            if (!testMode) {
                this.handler = new Handler(Looper.getMainLooper());
                return;
            } else {
                this.handler = null;
                return;
            }
        }
        this.handler = null;
    }

    public void callBack(Runnable runnable) {
        o.h(runnable);
        Handler handler = this.handler;
        if (handler == null) {
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(runnable);
                return;
            } else {
                StorageTaskScheduler.getInstance().scheduleCallback(runnable);
                return;
            }
        }
        handler.post(runnable);
    }
}

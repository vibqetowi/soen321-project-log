package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes4.dex */
final class MainLooperHandler implements IHandler {
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MainLooperHandler() {
        this(Looper.getMainLooper());
    }

    MainLooperHandler(Looper looper) {
        this.handler = new Handler(looper);
    }

    @Override // io.sentry.android.core.IHandler
    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    @Override // io.sentry.android.core.IHandler
    public Thread getThread() {
        return this.handler.getLooper().getThread();
    }
}

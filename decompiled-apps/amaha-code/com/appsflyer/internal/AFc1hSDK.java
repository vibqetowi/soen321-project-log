package com.appsflyer.internal;

import java.util.TimerTask;
/* loaded from: classes.dex */
public final class AFc1hSDK extends TimerTask {
    private final Thread AFKeystoreWrapper;

    public AFc1hSDK(Thread thread) {
        this.AFKeystoreWrapper = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFKeystoreWrapper.interrupt();
    }
}

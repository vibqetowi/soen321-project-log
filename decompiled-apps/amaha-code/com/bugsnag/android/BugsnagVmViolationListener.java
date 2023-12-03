package com.bugsnag.android;

import android.os.StrictMode;
import android.os.strictmode.Violation;
/* loaded from: classes.dex */
public class BugsnagVmViolationListener implements StrictMode.OnVmViolationListener {
    private final Client client;
    private final StrictMode.OnVmViolationListener listener;

    public BugsnagVmViolationListener() {
        this(Bugsnag.getClient(), null);
    }

    @Override // android.os.StrictMode.OnVmViolationListener
    public void onVmViolation(Violation violation) {
        Client client = this.client;
        if (client != null) {
            client.notify(violation, new StrictModeOnErrorCallback("StrictMode policy violation detected: VmPolicy"));
        }
        StrictMode.OnVmViolationListener onVmViolationListener = this.listener;
        if (onVmViolationListener != null) {
            onVmViolationListener.onVmViolation(violation);
        }
    }

    public BugsnagVmViolationListener(Client client) {
        this(client, null);
    }

    public BugsnagVmViolationListener(Client client, StrictMode.OnVmViolationListener onVmViolationListener) {
        this.client = client;
        this.listener = onVmViolationListener;
    }
}

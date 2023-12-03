package com.bugsnag.android;

import android.os.StrictMode;
import android.os.strictmode.Violation;
/* loaded from: classes.dex */
public class BugsnagThreadViolationListener implements StrictMode.OnThreadViolationListener {
    private final Client client;
    private final StrictMode.OnThreadViolationListener listener;

    public BugsnagThreadViolationListener() {
        this(Bugsnag.getClient(), null);
    }

    @Override // android.os.StrictMode.OnThreadViolationListener
    public void onThreadViolation(Violation violation) {
        Client client = this.client;
        if (client != null) {
            client.notify(violation, new StrictModeOnErrorCallback("StrictMode policy violation detected: ThreadPolicy"));
        }
        StrictMode.OnThreadViolationListener onThreadViolationListener = this.listener;
        if (onThreadViolationListener != null) {
            onThreadViolationListener.onThreadViolation(violation);
        }
    }

    public BugsnagThreadViolationListener(Client client) {
        this(client, null);
    }

    public BugsnagThreadViolationListener(Client client, StrictMode.OnThreadViolationListener onThreadViolationListener) {
        this.client = client;
        this.listener = onThreadViolationListener;
    }
}

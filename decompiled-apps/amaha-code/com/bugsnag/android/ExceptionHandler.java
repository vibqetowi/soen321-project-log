package com.bugsnag.android;

import android.os.StrictMode;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String STRICT_MODE_KEY = "Violation";
    private static final String STRICT_MODE_TAB = "StrictMode";
    private final Client client;
    private final Logger logger;
    private final StrictModeHandler strictModeHandler = new StrictModeHandler();
    private final Thread.UncaughtExceptionHandler originalHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    public ExceptionHandler(Client client, Logger logger) {
        this.client = client;
        this.logger = logger;
    }

    private void forwardToOriginalHandler(java.lang.Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.originalHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            return;
        }
        System.err.printf("Exception in thread \"%s\" ", thread.getName());
        this.logger.w("Exception", th2);
    }

    public void install() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, Throwable th2) {
        String str;
        String str2;
        if (this.client.getConfig().shouldDiscardError(th2)) {
            forwardToOriginalHandler(thread, th2);
            return;
        }
        boolean isStrictModeThrowable = this.strictModeHandler.isStrictModeThrowable(th2);
        Metadata metadata = new Metadata();
        if (isStrictModeThrowable) {
            String violationDescription = this.strictModeHandler.getViolationDescription(th2.getMessage());
            Metadata metadata2 = new Metadata();
            metadata2.addMetadata(STRICT_MODE_TAB, STRICT_MODE_KEY, violationDescription);
            str = violationDescription;
            metadata = metadata2;
        } else {
            str = null;
        }
        if (isStrictModeThrowable) {
            str2 = "strictMode";
        } else {
            str2 = "unhandledException";
        }
        if (isStrictModeThrowable) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            this.client.notifyUnhandledException(th2, metadata, str2, str);
            StrictMode.setThreadPolicy(threadPolicy);
        } else {
            this.client.notifyUnhandledException(th2, metadata, str2, null);
        }
        forwardToOriginalHandler(thread, th2);
    }

    public void uninstall() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this.originalHandler);
    }
}

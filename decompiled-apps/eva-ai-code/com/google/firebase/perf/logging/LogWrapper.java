package com.google.firebase.perf.logging;

import android.util.Log;
/* loaded from: classes7.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    public static synchronized LogWrapper getInstance() {
        LogWrapper logWrapper;
        synchronized (LogWrapper.class) {
            if (instance == null) {
                instance = new LogWrapper();
            }
            logWrapper = instance;
        }
        return logWrapper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        Log.d(LOG_TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(String str) {
        Log.v(LOG_TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(String str) {
        Log.i(LOG_TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(String str) {
        Log.w(LOG_TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        Log.e(LOG_TAG, str);
    }

    private LogWrapper() {
    }
}

package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.List;
/* loaded from: classes.dex */
class ForegroundDetector {
    private static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
    private final ActivityManager activityManager;

    public ForegroundDetector(Context context) {
        this.activityManager = ContextExtensionsKt.getActivityManagerFrom(context);
    }

    private ActivityManager.RunningAppProcessInfo getProcessInfo() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    private ActivityManager.RunningAppProcessInfo getProcessInfoPreApi16() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = this.activityManager;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (myPid == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public Boolean isInForeground() {
        boolean z10;
        try {
            ActivityManager.RunningAppProcessInfo processInfo = getProcessInfo();
            if (processInfo == null) {
                return null;
            }
            if (processInfo.importance <= 125) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

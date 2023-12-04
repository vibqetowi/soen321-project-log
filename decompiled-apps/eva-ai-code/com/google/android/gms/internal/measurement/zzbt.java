package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbt {
    private static final Method zza;
    private static final Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method declaredMethod;
        Method method = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
            zza = declaredMethod;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    method = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
                } catch (NoSuchMethodException unused2) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "No myUserId method available");
                    }
                }
            }
            zzb = method;
        }
        declaredMethod = null;
        zza = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        zzb = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                num = (Integer) method2.invoke(UserHandle.class, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
            if (num != null) {
                intValue = num.intValue();
                method = zza;
                if (method != null) {
                    try {
                        Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        return 0;
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                    }
                }
                return jobScheduler.schedule(jobInfo);
            }
        }
        intValue = 0;
        method = zza;
        if (method != null) {
        }
        return jobScheduler.schedule(jobInfo);
    }
}

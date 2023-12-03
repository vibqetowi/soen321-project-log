package com.bugsnag.android;

import android.util.Log;
import kotlin.jvm.internal.i;
/* compiled from: DebugLogger.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/DebugLogger;", "Lcom/bugsnag/android/Logger;", "", "msg", "Lhs/k;", "e", "", "throwable", "w", "i", "d", "TAG", "Ljava/lang/String;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DebugLogger implements Logger {
    public static final DebugLogger INSTANCE = new DebugLogger();
    private static final String TAG = "Bugsnag";

    private DebugLogger() {
    }

    @Override // com.bugsnag.android.Logger
    public void d(String msg) {
        i.h(msg, "msg");
        Log.d(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void e(String msg) {
        i.h(msg, "msg");
        Log.e(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void i(String msg) {
        i.h(msg, "msg");
        Log.i(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void w(String msg) {
        i.h(msg, "msg");
        Log.w(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void d(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Log.d(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void e(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Log.e(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void i(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Log.i(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void w(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Log.w(TAG, msg, throwable);
    }
}

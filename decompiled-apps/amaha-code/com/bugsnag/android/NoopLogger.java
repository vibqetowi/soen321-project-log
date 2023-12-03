package com.bugsnag.android;

import com.bugsnag.android.Logger;
import kotlin.jvm.internal.i;
/* compiled from: NoopLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/NoopLogger;", "Lcom/bugsnag/android/Logger;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NoopLogger implements Logger {
    public static final NoopLogger INSTANCE = new NoopLogger();

    private NoopLogger() {
    }

    @Override // com.bugsnag.android.Logger
    public void d(String msg) {
        i.h(msg, "msg");
        Logger.DefaultImpls.d(this, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void e(String msg) {
        i.h(msg, "msg");
        Logger.DefaultImpls.e(this, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void i(String msg) {
        i.h(msg, "msg");
        Logger.DefaultImpls.i(this, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void w(String msg) {
        i.h(msg, "msg");
        Logger.DefaultImpls.w(this, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void d(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Logger.DefaultImpls.d(this, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void e(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Logger.DefaultImpls.e(this, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void i(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Logger.DefaultImpls.i(this, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void w(String msg, Throwable throwable) {
        i.h(msg, "msg");
        i.h(throwable, "throwable");
        Logger.DefaultImpls.w(this, msg, throwable);
    }
}

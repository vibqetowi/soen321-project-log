package com.bugsnag.android;

import kotlin.jvm.internal.i;
/* compiled from: Logger.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/Logger;", "", "", "msg", "Lhs/k;", "e", "", "throwable", "w", "i", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface Logger {

    /* compiled from: Logger.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static void d(Logger logger, String msg) {
            i.h(msg, "msg");
        }

        public static void e(Logger logger, String msg) {
            i.h(msg, "msg");
        }

        public static void i(Logger logger, String msg) {
            i.h(msg, "msg");
        }

        public static void w(Logger logger, String msg) {
            i.h(msg, "msg");
        }

        public static void d(Logger logger, String msg, Throwable throwable) {
            i.h(msg, "msg");
            i.h(throwable, "throwable");
        }

        public static void e(Logger logger, String msg, Throwable throwable) {
            i.h(msg, "msg");
            i.h(throwable, "throwable");
        }

        public static void i(Logger logger, String msg, Throwable throwable) {
            i.h(msg, "msg");
            i.h(throwable, "throwable");
        }

        public static void w(Logger logger, String msg, Throwable throwable) {
            i.h(msg, "msg");
            i.h(throwable, "throwable");
        }
    }

    void d(String str);

    void d(String str, Throwable th2);

    void e(String str);

    void e(String str, Throwable th2);

    void i(String str);

    void i(String str, Throwable th2);

    void w(String str);

    void w(String str, Throwable th2);
}

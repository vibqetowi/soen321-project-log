package com.google.zxing;
/* loaded from: classes.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f10094u;

    /* renamed from: v  reason: collision with root package name */
    public static final StackTraceElement[] f10095v;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f10094u = z10;
        f10095v = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}

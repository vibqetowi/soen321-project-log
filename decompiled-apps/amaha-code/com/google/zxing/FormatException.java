package com.google.zxing;
/* loaded from: classes.dex */
public final class FormatException extends ReaderException {

    /* renamed from: w  reason: collision with root package name */
    public static final FormatException f10093w;

    static {
        FormatException formatException = new FormatException();
        f10093w = formatException;
        formatException.setStackTrace(ReaderException.f10095v);
    }

    private FormatException() {
    }

    public static FormatException a() {
        if (ReaderException.f10094u) {
            return new FormatException();
        }
        return f10093w;
    }
}

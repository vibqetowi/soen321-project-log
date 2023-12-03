package com.google.common.base;
/* loaded from: classes.dex */
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(String str) {
        super(str);
    }

    public VerifyException(String str, IllegalArgumentException illegalArgumentException) {
        super(str, illegalArgumentException);
    }
}

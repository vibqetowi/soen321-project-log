package com.google.zxing;

import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public final class WriterException extends Exception {
    public WriterException() {
    }

    public WriterException(String str) {
        super(str);
    }

    public WriterException(UnsupportedEncodingException unsupportedEncodingException) {
        super(unsupportedEncodingException);
    }
}

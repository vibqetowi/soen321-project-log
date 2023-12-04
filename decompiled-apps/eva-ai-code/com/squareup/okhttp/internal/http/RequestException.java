package com.squareup.okhttp.internal.http;

import java.io.IOException;
/* loaded from: classes4.dex */
public final class RequestException extends Exception {
    public RequestException(IOException iOException) {
        super(iOException);
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}

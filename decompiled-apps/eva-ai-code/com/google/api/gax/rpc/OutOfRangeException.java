package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class OutOfRangeException extends ApiException {
    public OutOfRangeException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public OutOfRangeException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

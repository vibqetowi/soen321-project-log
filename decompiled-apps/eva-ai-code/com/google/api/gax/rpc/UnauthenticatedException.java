package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class UnauthenticatedException extends ApiException {
    public UnauthenticatedException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public UnauthenticatedException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

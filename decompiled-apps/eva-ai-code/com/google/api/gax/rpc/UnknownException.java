package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class UnknownException extends ApiException {
    public UnknownException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public UnknownException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class UnimplementedException extends ApiException {
    public UnimplementedException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public UnimplementedException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

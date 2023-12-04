package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class FailedPreconditionException extends ApiException {
    public FailedPreconditionException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public FailedPreconditionException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class DeadlineExceededException extends ApiException {
    public DeadlineExceededException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public DeadlineExceededException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

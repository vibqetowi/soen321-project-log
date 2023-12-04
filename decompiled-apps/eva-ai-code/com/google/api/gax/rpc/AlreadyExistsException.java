package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class AlreadyExistsException extends ApiException {
    public AlreadyExistsException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public AlreadyExistsException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

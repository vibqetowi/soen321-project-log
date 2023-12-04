package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class InternalException extends ApiException {
    public InternalException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public InternalException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

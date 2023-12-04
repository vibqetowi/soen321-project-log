package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class CancelledException extends ApiException {
    public CancelledException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public CancelledException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class AbortedException extends ApiException {
    public AbortedException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public AbortedException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

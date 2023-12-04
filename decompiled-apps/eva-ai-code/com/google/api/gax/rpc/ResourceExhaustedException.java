package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class ResourceExhaustedException extends ApiException {
    public ResourceExhaustedException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public ResourceExhaustedException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

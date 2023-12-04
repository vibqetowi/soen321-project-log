package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class PermissionDeniedException extends ApiException {
    public PermissionDeniedException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public PermissionDeniedException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

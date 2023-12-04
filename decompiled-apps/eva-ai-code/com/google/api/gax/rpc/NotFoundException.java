package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class NotFoundException extends ApiException {
    public NotFoundException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public NotFoundException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

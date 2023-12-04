package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class UnavailableException extends ApiException {
    public UnavailableException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public UnavailableException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

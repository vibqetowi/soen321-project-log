package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public class DataLossException extends ApiException {
    public DataLossException(Throwable th, StatusCode statusCode, boolean z) {
        super(th, statusCode, z);
    }

    public DataLossException(String str, Throwable th, StatusCode statusCode, boolean z) {
        super(str, th, statusCode, z);
    }
}

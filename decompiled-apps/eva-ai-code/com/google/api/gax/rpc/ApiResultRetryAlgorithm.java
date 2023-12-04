package com.google.api.gax.rpc;

import com.google.api.gax.retrying.BasicResultRetryAlgorithm;
/* loaded from: classes7.dex */
class ApiResultRetryAlgorithm<ResponseT> extends BasicResultRetryAlgorithm<ResponseT> {
    @Override // com.google.api.gax.retrying.BasicResultRetryAlgorithm, com.google.api.gax.retrying.ResultRetryAlgorithm
    public boolean shouldRetry(Throwable th, ResponseT responset) {
        return (th instanceof ApiException) && ((ApiException) th).isRetryable();
    }
}

package com.google.api.gax.retrying;
/* loaded from: classes7.dex */
public class BasicResultRetryAlgorithm<ResponseT> implements ResultRetryAlgorithm<ResponseT> {
    @Override // com.google.api.gax.retrying.ResultRetryAlgorithm
    public TimedAttemptSettings createNextAttempt(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings) {
        return null;
    }

    @Override // com.google.api.gax.retrying.ResultRetryAlgorithm
    public boolean shouldRetry(Throwable th, ResponseT responset) {
        return th != null;
    }
}

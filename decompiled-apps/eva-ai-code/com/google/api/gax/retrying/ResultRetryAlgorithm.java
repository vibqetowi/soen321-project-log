package com.google.api.gax.retrying;

import java.util.concurrent.CancellationException;
/* loaded from: classes7.dex */
public interface ResultRetryAlgorithm<ResponseT> {
    TimedAttemptSettings createNextAttempt(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings);

    boolean shouldRetry(Throwable th, ResponseT responset) throws CancellationException;
}

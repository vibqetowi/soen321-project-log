package com.google.api.gax.retrying;

import java.util.concurrent.CancellationException;
/* loaded from: classes7.dex */
public interface TimedRetryAlgorithm {
    TimedAttemptSettings createFirstAttempt();

    TimedAttemptSettings createNextAttempt(TimedAttemptSettings timedAttemptSettings);

    boolean shouldRetry(TimedAttemptSettings timedAttemptSettings) throws CancellationException;
}

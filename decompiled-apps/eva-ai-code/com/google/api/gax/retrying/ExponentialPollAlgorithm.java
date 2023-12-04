package com.google.api.gax.retrying;

import com.google.api.core.ApiClock;
/* loaded from: classes7.dex */
public class ExponentialPollAlgorithm extends ExponentialRetryAlgorithm {
    public ExponentialPollAlgorithm(RetrySettings retrySettings, ApiClock apiClock) {
        super(retrySettings, apiClock);
    }

    @Override // com.google.api.gax.retrying.ExponentialRetryAlgorithm, com.google.api.gax.retrying.TimedRetryAlgorithm
    public boolean shouldRetry(TimedAttemptSettings timedAttemptSettings) throws PollException {
        if (super.shouldRetry(timedAttemptSettings)) {
            return true;
        }
        throw new PollException("total timeout or maximum number of attempts exceeded; current settings: " + timedAttemptSettings.getGlobalSettings());
    }
}
